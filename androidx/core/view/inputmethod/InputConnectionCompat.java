package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

public final class InputConnectionCompat {
    public interface OnCommitContentListener {
        boolean onCommitContent(InputContentInfoCompat arg1, int arg2, Bundle arg3);
    }

    private static final String COMMIT_CONTENT_ACTION = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final String COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final String COMMIT_CONTENT_CONTENT_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final String COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final String COMMIT_CONTENT_DESCRIPTION_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final String COMMIT_CONTENT_FLAGS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final String COMMIT_CONTENT_FLAGS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final String COMMIT_CONTENT_INTEROP_ACTION = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final String COMMIT_CONTENT_LINK_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final String COMMIT_CONTENT_LINK_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final String COMMIT_CONTENT_OPTS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final String COMMIT_CONTENT_OPTS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final String COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final String COMMIT_CONTENT_RESULT_RECEIVER_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;

    public static boolean commitContent(InputConnection inputConnection0, EditorInfo editorInfo0, InputContentInfoCompat inputContentInfoCompat0, int v, Bundle bundle0) {
        ClipDescription clipDescription0 = inputContentInfoCompat0.getDescription();
        String[] arr_s = EditorInfoCompat.getContentMimeTypes(editorInfo0);
        boolean z = false;
        for(int v1 = 0; true; ++v1) {
            boolean z1 = false;
            if(v1 >= arr_s.length) {
                break;
            }
            if(clipDescription0.hasMimeType(arr_s[v1])) {
                z1 = true;
                break;
            }
        }
        if(!z1) {
            return false;
        }
        if(Build.VERSION.SDK_INT >= 25) {
            return inputConnection0.commitContent(((InputContentInfo)inputContentInfoCompat0.unwrap()), v, bundle0);
        }
        switch(EditorInfoCompat.getProtocol(editorInfo0)) {
            case 2: {
                z = true;
                break;
            }
            case 3: 
            case 4: {
                break;
            }
            default: {
                return false;
            }
        }
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable((z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"), inputContentInfoCompat0.getContentUri());
        bundle1.putParcelable((z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"), inputContentInfoCompat0.getDescription());
        bundle1.putParcelable((z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"), inputContentInfoCompat0.getLinkUri());
        bundle1.putInt((z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"), v);
        bundle1.putParcelable((z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"), bundle0);
        return z ? inputConnection0.performPrivateCommand("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", bundle1) : inputConnection0.performPrivateCommand("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", bundle1);
    }

    public static InputConnection createWrapper(InputConnection inputConnection0, EditorInfo editorInfo0, OnCommitContentListener inputConnectionCompat$OnCommitContentListener0) {
        if(inputConnection0 == null) {
            throw new IllegalArgumentException("inputConnection must be non-null");
        }
        if(editorInfo0 == null) {
            throw new IllegalArgumentException("editorInfo must be non-null");
        }
        if(inputConnectionCompat$OnCommitContentListener0 == null) {
            throw new IllegalArgumentException("onCommitContentListener must be non-null");
        }
        if(Build.VERSION.SDK_INT >= 25) {
            return new InputConnectionWrapper(inputConnection0, false) {
                @Override  // android.view.inputmethod.InputConnectionWrapper
                public boolean commitContent(InputContentInfo inputContentInfo0, int v, Bundle bundle0) {
                    InputContentInfoCompat inputContentInfoCompat0 = InputContentInfoCompat.wrap(inputContentInfo0);
                    return inputConnectionCompat$OnCommitContentListener0.onCommitContent(inputContentInfoCompat0, v, bundle0) ? true : super.commitContent(inputContentInfo0, v, bundle0);
                }
            };
        }
        return EditorInfoCompat.getContentMimeTypes(editorInfo0).length == 0 ? inputConnection0 : new InputConnectionWrapper(inputConnection0, false) {
            // 去混淆评级： 低(20)
            @Override  // android.view.inputmethod.InputConnectionWrapper
            public boolean performPrivateCommand(String s, Bundle bundle0) {
                return InputConnectionCompat.handlePerformPrivateCommand(s, bundle0, inputConnectionCompat$OnCommitContentListener0) ? true : super.performPrivateCommand(s, bundle0);
            }
        };
    }

    static boolean handlePerformPrivateCommand(String s, Bundle bundle0, OnCommitContentListener inputConnectionCompat$OnCommitContentListener0) {
        ResultReceiver resultReceiver0;
        boolean z1;
        boolean z = false;
        if(bundle0 == null) {
            return false;
        }
        if(TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", s)) {
            z1 = false;
            goto label_8;
        }
        if(TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", s)) {
            z1 = true;
            try {
            label_8:
                resultReceiver0 = null;
                resultReceiver0 = (ResultReceiver)bundle0.getParcelable((z1 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"));
                Uri uri0 = (Uri)bundle0.getParcelable((z1 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"));
                ClipDescription clipDescription0 = (ClipDescription)bundle0.getParcelable((z1 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"));
                Uri uri1 = (Uri)bundle0.getParcelable((z1 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"));
                int v = bundle0.getInt((z1 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"));
                Bundle bundle1 = (Bundle)bundle0.getParcelable((z1 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"));
                if(uri0 != null && clipDescription0 != null) {
                    z = inputConnectionCompat$OnCommitContentListener0.onCommitContent(new InputContentInfoCompat(uri0, clipDescription0, uri1), v, bundle1);
                }
            }
            catch(Throwable throwable0) {
                if(resultReceiver0 != null) {
                    resultReceiver0.send(0, null);
                }
                throw throwable0;
            }
            if(resultReceiver0 != null) {
                resultReceiver0.send(((int)z), null);
            }
            return z;
        }
        return false;
    }
}

