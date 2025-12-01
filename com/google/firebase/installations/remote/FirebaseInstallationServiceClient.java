package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.FirebaseInstallationsException.Status;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import jeb.synthetic.FIN;
import org.json.JSONException;
import org.json.JSONObject;

public class FirebaseInstallationServiceClient {
    private static final String ACCEPT_HEADER_KEY = "Accept";
    private static final String API_KEY_HEADER = "x-goog-api-key";
    private static final String CACHE_CONTROL_DIRECTIVE = "no-cache";
    private static final String CACHE_CONTROL_HEADER_KEY = "Cache-Control";
    private static final String CONTENT_ENCODING_HEADER_KEY = "Content-Encoding";
    private static final String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private static final String CREATE_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations";
    private static final String DELETE_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations/%s";
    private static final Pattern EXPIRATION_TIMESTAMP_PATTERN = null;
    private static final String FIREBASE_INSTALLATIONS_API_DOMAIN = "firebaseinstallations.googleapis.com";
    private static final String FIREBASE_INSTALLATIONS_API_VERSION = "v1";
    private static final String FIREBASE_INSTALLATIONS_ID_HEARTBEAT_TAG = "fire-installations-id";
    private static final String FIREBASE_INSTALLATION_AUTH_VERSION = "FIS_v2";
    private static final String FIS_TAG = "Firebase-Installations";
    private static final String GENERATE_AUTH_TOKEN_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations/%s/authTokens:generate";
    private static final String GZIP_CONTENT_ENCODING = "gzip";
    private static final String HEART_BEAT_HEADER = "x-firebase-client-log-type";
    private static final String JSON_CONTENT_TYPE = "application/json";
    private static final int MAX_RETRIES = 1;
    private static final int NETWORK_TIMEOUT_MILLIS = 10000;
    static final String PARSING_EXPIRATION_TIME_ERROR_MESSAGE = "Invalid Expiration Timestamp.";
    private static final String SDK_VERSION_PREFIX = "a:";
    private static final String USER_AGENT_HEADER = "x-firebase-client";
    private static final Charset UTF_8 = null;
    private static final String X_ANDROID_CERT_HEADER_KEY = "X-Android-Cert";
    private static final String X_ANDROID_IID_MIGRATION_KEY = "x-goog-fis-android-iid-migration-auth";
    private static final String X_ANDROID_PACKAGE_HEADER_KEY = "X-Android-Package";
    private final Context context;
    private final HeartBeatInfo heartbeatInfo;
    private final UserAgentPublisher userAgentPublisher;

    static {
        FirebaseInstallationServiceClient.EXPIRATION_TIMESTAMP_PATTERN = Pattern.compile("[0-9]+s");
        FirebaseInstallationServiceClient.UTF_8 = Charset.forName("UTF-8");
    }

    public FirebaseInstallationServiceClient(Context context0, UserAgentPublisher userAgentPublisher0, HeartBeatInfo heartBeatInfo0) {
        this.context = context0;
        this.userAgentPublisher = userAgentPublisher0;
        this.heartbeatInfo = heartBeatInfo0;
    }

    // 去混淆评级： 低(20)
    private static String availableFirebaseOptions(String s, String s1, String s2) {
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", s1, s2, (TextUtils.isEmpty(s) ? "" : ", " + s));
    }

    private static JSONObject buildCreateFirebaseInstallationRequestBody(String s, String s1) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("fid", s);
            jSONObject0.put("appId", s1);
            jSONObject0.put("authVersion", "FIS_v2");
            jSONObject0.put("sdkVersion", "a:16.3.3");
            return jSONObject0;
        }
        catch(JSONException jSONException0) {
            throw new IllegalStateException(jSONException0);
        }
    }

    private static JSONObject buildGenerateAuthTokenRequestBody() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("sdkVersion", "a:16.3.3");
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("installation", jSONObject0);
            return jSONObject1;
        }
        catch(JSONException jSONException0) {
            throw new IllegalStateException(jSONException0);
        }
    }

    public InstallationResponse createFirebaseInstallation(String s, String s1, String s2, String s3, String s4) throws FirebaseInstallationsException {
        URL uRL0 = this.getFullyQualifiedRequestUri(String.format("projects/%s/installations", s2));
        for(int v = 0; v <= 1; ++v) {
            HttpURLConnection httpURLConnection0 = this.openHttpURLConnection(uRL0, s);
            try {
                httpURLConnection0.setRequestMethod("POST");
                httpURLConnection0.setDoOutput(true);
                if(s4 != null) {
                    httpURLConnection0.addRequestProperty("x-goog-fis-android-iid-migration-auth", s4);
                }
                this.writeFIDCreateRequestBodyToOutputStream(httpURLConnection0, s1, s3);
                int v2 = httpURLConnection0.getResponseCode();
                if(v2 == 200) {
                    return this.readCreateResponse(httpURLConnection0);
                }
                FirebaseInstallationServiceClient.logFisCommunicationError(httpURLConnection0, s3, s, s2);
                if(v2 != 429 && (v2 < 500 || v2 >= 600)) {
                    FirebaseInstallationServiceClient.logBadConfigError();
                    return InstallationResponse.builder().setResponseCode(ResponseCode.BAD_CONFIG).build();
                }
            }
            catch(IOException unused_ex) {
            }
            finally {
                httpURLConnection0.disconnect();
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", Status.UNAVAILABLE);
    }

    public void deleteFirebaseInstallation(String s, String s1, String s2, String s3) throws FirebaseInstallationsException {
        URL uRL0 = this.getFullyQualifiedRequestUri(String.format("projects/%s/installations/%s", s2, s1));
        for(int v = 0; v <= 1; ++v) {
            HttpURLConnection httpURLConnection0 = this.openHttpURLConnection(uRL0, s);
            try {
                httpURLConnection0.setRequestMethod("DELETE");
                httpURLConnection0.addRequestProperty("Authorization", "FIS_v2 " + s3);
                int v2 = httpURLConnection0.getResponseCode();
                if(v2 == 200 || v2 == 401 || v2 == 404) {
                    return;
                }
                FirebaseInstallationServiceClient.logFisCommunicationError(httpURLConnection0, null, s, s2);
                if(v2 != 429 && (v2 < 500 || v2 >= 600)) {
                    FirebaseInstallationServiceClient.logBadConfigError();
                    throw new FirebaseInstallationsException("Bad config while trying to delete FID", Status.BAD_CONFIG);
                }
            }
            catch(IOException unused_ex) {
            }
            finally {
                httpURLConnection0.disconnect();
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", Status.UNAVAILABLE);
    }

    public TokenResult generateAuthToken(String s, String s1, String s2, String s3) throws FirebaseInstallationsException {
        URL uRL0 = this.getFullyQualifiedRequestUri(String.format("projects/%s/installations/%s/authTokens:generate", s2, s1));
        for(int v = 0; v <= 1; ++v) {
            HttpURLConnection httpURLConnection0 = this.openHttpURLConnection(uRL0, s);
            try {
                httpURLConnection0.setRequestMethod("POST");
                httpURLConnection0.addRequestProperty("Authorization", "FIS_v2 " + s3);
                this.writeGenerateAuthTokenRequestBodyToOutputStream(httpURLConnection0);
                int v2 = httpURLConnection0.getResponseCode();
                if(v2 == 200) {
                    return this.readGenerateAuthTokenResponse(httpURLConnection0);
                }
                FirebaseInstallationServiceClient.logFisCommunicationError(httpURLConnection0, null, s, s2);
                switch(v2) {
                    case 401: 
                    case 404: {
                        return TokenResult.builder().setResponseCode(com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR).build();
                    }
                    case 429: {
                        break;
                    }
                    default: {
                        if(v2 < 500 || v2 >= 600) {
                            FirebaseInstallationServiceClient.logBadConfigError();
                            return TokenResult.builder().setResponseCode(com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG).build();
                        }
                    }
                }
            }
            catch(IOException unused_ex) {
            }
            finally {
                httpURLConnection0.disconnect();
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", Status.UNAVAILABLE);
    }

    private String getFingerprintHashForPackage() {
        try {
            byte[] arr_b = AndroidUtilsLight.getPackageCertificateHashBytes(this.context, "com.playdekgames.android.Ascension");
            if(arr_b == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: com.playdekgames.android.Ascension");
                return null;
            }
            return Hex.bytesToStringUppercase(arr_b, false);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.e("ContentValues", "No such package: com.playdekgames.android.Ascension", packageManager$NameNotFoundException0);
            return null;
        }
    }

    private URL getFullyQualifiedRequestUri(String s) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", s));
        }
        catch(MalformedURLException malformedURLException0) {
            throw new FirebaseInstallationsException(malformedURLException0.getMessage(), Status.UNAVAILABLE);
        }
    }

    private static byte[] getJsonBytes(JSONObject jSONObject0) throws IOException [...] // 潜在的解密器

    private static void logBadConfigError() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void logFisCommunicationError(HttpURLConnection httpURLConnection0, String s, String s1, String s2) {
        String s3 = FirebaseInstallationServiceClient.readErrorResponse(httpURLConnection0);
        if(!TextUtils.isEmpty(s3)) {
            Log.w("Firebase-Installations", s3);
            Log.w("Firebase-Installations", FirebaseInstallationServiceClient.availableFirebaseOptions(s, s1, s2));
        }
    }

    private HttpURLConnection openHttpURLConnection(URL uRL0, String s) throws FirebaseInstallationsException {
        HttpURLConnection httpURLConnection0;
        try {
            httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
        }
        catch(IOException unused_ex) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", Status.UNAVAILABLE);
        }
        httpURLConnection0.setConnectTimeout(10000);
        httpURLConnection0.setUseCaches(false);
        httpURLConnection0.setReadTimeout(10000);
        httpURLConnection0.addRequestProperty("Content-Type", "application/json");
        httpURLConnection0.addRequestProperty("Accept", "application/json");
        httpURLConnection0.addRequestProperty("Content-Encoding", "gzip");
        httpURLConnection0.addRequestProperty("Cache-Control", "no-cache");
        httpURLConnection0.addRequestProperty("X-Android-Package", "com.playdekgames.android.Ascension");
        HeartBeatInfo heartBeatInfo0 = this.heartbeatInfo;
        if(heartBeatInfo0 != null && this.userAgentPublisher != null) {
            HeartBeat heartBeatInfo$HeartBeat0 = heartBeatInfo0.getHeartBeatCode("fire-installations-id");
            if(heartBeatInfo$HeartBeat0 != HeartBeat.NONE) {
                httpURLConnection0.addRequestProperty("x-firebase-client", this.userAgentPublisher.getUserAgent());
                httpURLConnection0.addRequestProperty("x-firebase-client-log-type", Integer.toString(heartBeatInfo$HeartBeat0.getCode()));
            }
        }
        httpURLConnection0.addRequestProperty("X-Android-Cert", this.getFingerprintHashForPackage());
        httpURLConnection0.addRequestProperty("x-goog-api-key", s);
        return httpURLConnection0;
    }

    static long parseTokenExpirationTimestamp(String s) {
        Preconditions.checkArgument(FirebaseInstallationServiceClient.EXPIRATION_TIMESTAMP_PATTERN.matcher(s).matches(), "Invalid Expiration Timestamp.");
        return s == null || s.length() == 0 ? 0L : Long.parseLong(s.substring(0, s.length() - 1));
    }

    private InstallationResponse readCreateResponse(HttpURLConnection httpURLConnection0) throws IOException {
        InputStream inputStream0 = httpURLConnection0.getInputStream();
        JsonReader jsonReader0 = new JsonReader(new InputStreamReader(inputStream0, FirebaseInstallationServiceClient.UTF_8));
        Builder tokenResult$Builder0 = TokenResult.builder();
        com.google.firebase.installations.remote.InstallationResponse.Builder installationResponse$Builder0 = InstallationResponse.builder();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("name")) {
                installationResponse$Builder0.setUri(jsonReader0.nextString());
            }
            else if(s.equals("fid")) {
                installationResponse$Builder0.setFid(jsonReader0.nextString());
            }
            else if(s.equals("refreshToken")) {
                installationResponse$Builder0.setRefreshToken(jsonReader0.nextString());
            }
            else if(s.equals("authToken")) {
                jsonReader0.beginObject();
                while(jsonReader0.hasNext()) {
                    String s1 = jsonReader0.nextName();
                    if(s1.equals("token")) {
                        tokenResult$Builder0.setToken(jsonReader0.nextString());
                    }
                    else if(s1.equals("expiresIn")) {
                        tokenResult$Builder0.setTokenExpirationTimestamp(FirebaseInstallationServiceClient.parseTokenExpirationTimestamp(jsonReader0.nextString()));
                    }
                    else {
                        jsonReader0.skipValue();
                    }
                }
                installationResponse$Builder0.setAuthToken(tokenResult$Builder0.build());
                jsonReader0.endObject();
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        jsonReader0.close();
        inputStream0.close();
        return installationResponse$Builder0.setResponseCode(ResponseCode.OK).build();
    }

    private static String readErrorResponse(HttpURLConnection httpURLConnection0) {
        String s1;
        InputStream inputStream0 = httpURLConnection0.getErrorStream();
        if(inputStream0 == null) {
            return null;
        }
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0, FirebaseInstallationServiceClient.UTF_8));
        try {
            StringBuilder stringBuilder0 = new StringBuilder();
            String s;
            while((s = bufferedReader0.readLine()) != null) {
                stringBuilder0.append(s);
                stringBuilder0.append('\n');
            }
            s1 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", httpURLConnection0.getResponseCode(), httpURLConnection0.getResponseMessage(), stringBuilder0);
        }
        catch(IOException unused_ex) {
            try {
                bufferedReader0.close();
            }
            catch(IOException unused_ex) {
            }
            return null;
        }
        finally {
            bufferedReader0.close();
        }
        try {
        }
        catch(IOException unused_ex) {
        }
        return s1;
    }

    private TokenResult readGenerateAuthTokenResponse(HttpURLConnection httpURLConnection0) throws IOException {
        InputStream inputStream0 = httpURLConnection0.getInputStream();
        JsonReader jsonReader0 = new JsonReader(new InputStreamReader(inputStream0, FirebaseInstallationServiceClient.UTF_8));
        Builder tokenResult$Builder0 = TokenResult.builder();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("token")) {
                tokenResult$Builder0.setToken(jsonReader0.nextString());
            }
            else if(s.equals("expiresIn")) {
                tokenResult$Builder0.setTokenExpirationTimestamp(FirebaseInstallationServiceClient.parseTokenExpirationTimestamp(jsonReader0.nextString()));
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        jsonReader0.close();
        inputStream0.close();
        return tokenResult$Builder0.setResponseCode(com.google.firebase.installations.remote.TokenResult.ResponseCode.OK).build();
    }

    private void writeFIDCreateRequestBodyToOutputStream(HttpURLConnection httpURLConnection0, String s, String s1) throws IOException {
        FirebaseInstallationServiceClient.writeRequestBodyToOutputStream(httpURLConnection0, FirebaseInstallationServiceClient.getJsonBytes(FirebaseInstallationServiceClient.buildCreateFirebaseInstallationRequestBody(s, s1)));
    }

    private void writeGenerateAuthTokenRequestBodyToOutputStream(HttpURLConnection httpURLConnection0) throws IOException {
        FirebaseInstallationServiceClient.writeRequestBodyToOutputStream(httpURLConnection0, new byte[]{0x7B, 34, 105, 110, 0x73, 0x74, 97, 108, 108, 97, 0x74, 105, 0x6F, 110, 34, 58, 0x7B, 34, 0x73, 100, 107, 86, 101, 0x72, 0x73, 105, 0x6F, 110, 34, 58, 34, 97, 58, 49, 54, 46, 51, 46, 51, 34, 0x7D, 0x7D});
    }

    private static void writeRequestBodyToOutputStream(URLConnection uRLConnection0, byte[] arr_b) throws IOException {
        OutputStream outputStream0 = uRLConnection0.getOutputStream();
        if(outputStream0 == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(outputStream0);
        int v = FIN.finallyOpen$NT();
        gZIPOutputStream0.write(arr_b);
        try {
            FIN.finallyCodeBegin$NT(v);
            gZIPOutputStream0.close();
            outputStream0.close();
            FIN.finallyCodeEnd$NT(v);
        }
        catch(IOException unused_ex) {
        }
    }
}

