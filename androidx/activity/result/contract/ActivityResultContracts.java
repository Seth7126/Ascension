package androidx.activity.result.contract;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public final class ActivityResultContracts {
    public static class CaptureVideo extends ActivityResultContract {
        public Intent createIntent(Context context0, Uri uri0) {
            return new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri0);
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context0, Object object0) {
            return this.createIntent(context0, ((Uri)object0));
        }

        public final SynchronousResult getSynchronousResult(Context context, Uri input) {
            return null;
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult getSynchronousResult(Context context0, Object object0) {
            return this.getSynchronousResult(context0, ((Uri)object0));
        }

        public final Boolean parseResult(int v, Intent intent0) {
            return v == -1;
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object parseResult(int v, Intent intent0) {
            return this.parseResult(v, intent0);
        }
    }

    public static class CreateDocument extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context0, Object object0) {
            return this.createIntent(context0, ((String)object0));
        }

        public Intent createIntent(Context context0, String s) {
            return new Intent("android.intent.action.CREATE_DOCUMENT").setType("*/*").putExtra("android.intent.extra.TITLE", s);
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult getSynchronousResult(Context context0, Object object0) {
            return this.getSynchronousResult(context0, ((String)object0));
        }

        public final SynchronousResult getSynchronousResult(Context context, String input) {
            return null;
        }

        public final Uri parseResult(int v, Intent intent0) {
            return intent0 == null || v != -1 ? null : intent0.getData();
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object parseResult(int v, Intent intent0) {
            return this.parseResult(v, intent0);
        }
    }

    public static class GetContent extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context0, Object object0) {
            return this.createIntent(context0, ((String)object0));
        }

        public Intent createIntent(Context context0, String s) {
            return new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(s);
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult getSynchronousResult(Context context0, Object object0) {
            return this.getSynchronousResult(context0, ((String)object0));
        }

        public final SynchronousResult getSynchronousResult(Context context, String input) {
            return null;
        }

        public final Uri parseResult(int v, Intent intent0) {
            return intent0 == null || v != -1 ? null : intent0.getData();
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object parseResult(int v, Intent intent0) {
            return this.parseResult(v, intent0);
        }
    }

    public static class GetMultipleContents extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context0, Object object0) {
            return this.createIntent(context0, ((String)object0));
        }

        public Intent createIntent(Context context0, String s) {
            return new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(s).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }

        static List getClipDataUris(Intent intent0) {
            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
            if(intent0.getData() != null) {
                linkedHashSet0.add(intent0.getData());
            }
            ClipData clipData0 = intent0.getClipData();
            if(clipData0 == null && linkedHashSet0.isEmpty()) {
                return Collections.emptyList();
            }
            if(clipData0 != null) {
                for(int v = 0; v < clipData0.getItemCount(); ++v) {
                    Uri uri0 = clipData0.getItemAt(v).getUri();
                    if(uri0 != null) {
                        linkedHashSet0.add(uri0);
                    }
                }
            }
            return new ArrayList(linkedHashSet0);
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult getSynchronousResult(Context context0, Object object0) {
            return this.getSynchronousResult(context0, ((String)object0));
        }

        public final SynchronousResult getSynchronousResult(Context context, String input) {
            return null;
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object parseResult(int v, Intent intent0) {
            return this.parseResult(v, intent0);
        }

        public final List parseResult(int v, Intent intent0) {
            return intent0 == null || v != -1 ? Collections.emptyList() : GetMultipleContents.getClipDataUris(intent0);
        }
    }

    public static class OpenDocument extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context0, Object object0) {
            return this.createIntent(context0, ((String[])object0));
        }

        public Intent createIntent(Context context0, String[] arr_s) {
            return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", arr_s).setType("*/*");
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult getSynchronousResult(Context context0, Object object0) {
            return this.getSynchronousResult(context0, ((String[])object0));
        }

        public final SynchronousResult getSynchronousResult(Context context, String[] input) {
            return null;
        }

        public final Uri parseResult(int v, Intent intent0) {
            return intent0 == null || v != -1 ? null : intent0.getData();
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object parseResult(int v, Intent intent0) {
            return this.parseResult(v, intent0);
        }
    }

    public static class OpenDocumentTree extends ActivityResultContract {
        public Intent createIntent(Context context0, Uri uri0) {
            Intent intent0 = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if(Build.VERSION.SDK_INT >= 26 && uri0 != null) {
                intent0.putExtra("android.provider.extra.INITIAL_URI", uri0);
            }
            return intent0;
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context0, Object object0) {
            return this.createIntent(context0, ((Uri)object0));
        }

        public final SynchronousResult getSynchronousResult(Context context, Uri input) {
            return null;
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult getSynchronousResult(Context context0, Object object0) {
            return this.getSynchronousResult(context0, ((Uri)object0));
        }

        public final Uri parseResult(int v, Intent intent0) {
            return intent0 == null || v != -1 ? null : intent0.getData();
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object parseResult(int v, Intent intent0) {
            return this.parseResult(v, intent0);
        }
    }

    public static class OpenMultipleDocuments extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context0, Object object0) {
            return this.createIntent(context0, ((String[])object0));
        }

        public Intent createIntent(Context context0, String[] arr_s) {
            return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", arr_s).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult getSynchronousResult(Context context0, Object object0) {
            return this.getSynchronousResult(context0, ((String[])object0));
        }

        public final SynchronousResult getSynchronousResult(Context context, String[] input) {
            return null;
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object parseResult(int v, Intent intent0) {
            return this.parseResult(v, intent0);
        }

        public final List parseResult(int v, Intent intent0) {
            return v != -1 || intent0 == null ? Collections.emptyList() : GetMultipleContents.getClipDataUris(intent0);
        }
    }

    public static final class PickContact extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context0, Object object0) {
            return this.createIntent(context0, ((Void)object0));
        }

        public Intent createIntent(Context context0, Void void0) {
            return new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
        }

        public Uri parseResult(int v, Intent intent0) {
            return intent0 == null || v != -1 ? null : intent0.getData();
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object parseResult(int v, Intent intent0) {
            return this.parseResult(v, intent0);
        }
    }

    public static final class RequestMultiplePermissions extends ActivityResultContract {
        public static final String ACTION_REQUEST_PERMISSIONS = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        public static final String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";
        public static final String EXTRA_PERMISSION_GRANT_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        static Intent createIntent(String[] arr_s) {
            return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", arr_s);
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context0, Object object0) {
            return this.createIntent(context0, ((String[])object0));
        }

        public Intent createIntent(Context context0, String[] arr_s) {
            return RequestMultiplePermissions.createIntent(arr_s);
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult getSynchronousResult(Context context0, Object object0) {
            return this.getSynchronousResult(context0, ((String[])object0));
        }

        public SynchronousResult getSynchronousResult(Context context0, String[] arr_s) {
            if(arr_s != null && arr_s.length != 0) {
                ArrayMap arrayMap0 = new ArrayMap();
                boolean z = true;
                for(int v = 0; v < arr_s.length; ++v) {
                    String s = arr_s[v];
                    boolean z1 = ContextCompat.checkSelfPermission(context0, s) == 0;
                    arrayMap0.put(s, Boolean.valueOf(z1));
                    if(!z1) {
                        z = false;
                    }
                }
                return z ? new SynchronousResult(arrayMap0) : null;
            }
            return new SynchronousResult(Collections.emptyMap());
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object parseResult(int v, Intent intent0) {
            return this.parseResult(v, intent0);
        }

        public Map parseResult(int v, Intent intent0) {
            if(v != -1) {
                return Collections.emptyMap();
            }
            if(intent0 == null) {
                return Collections.emptyMap();
            }
            String[] arr_s = intent0.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] arr_v = intent0.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if(arr_v != null && arr_s != null) {
                Map map0 = new HashMap();
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    map0.put(arr_s[v1], Boolean.valueOf(arr_v[v1] == 0));
                }
                return map0;
            }
            return Collections.emptyMap();
        }
    }

    public static final class RequestPermission extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context0, Object object0) {
            return this.createIntent(context0, ((String)object0));
        }

        public Intent createIntent(Context context0, String s) {
            return RequestMultiplePermissions.createIntent(new String[]{s});
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult getSynchronousResult(Context context0, Object object0) {
            return this.getSynchronousResult(context0, ((String)object0));
        }

        public SynchronousResult getSynchronousResult(Context context0, String s) {
            if(s == null) {
                return new SynchronousResult(Boolean.FALSE);
            }
            return ContextCompat.checkSelfPermission(context0, s) == 0 ? new SynchronousResult(Boolean.TRUE) : null;
        }

        public Boolean parseResult(int v, Intent intent0) {
            boolean z = false;
            if(intent0 != null && v == -1) {
                int[] arr_v = intent0.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if(arr_v != null && arr_v.length != 0) {
                    if(arr_v[0] == 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }
            return false;
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object parseResult(int v, Intent intent0) {
            return this.parseResult(v, intent0);
        }
    }

    public static final class StartActivityForResult extends ActivityResultContract {
        public static final String EXTRA_ACTIVITY_OPTIONS_BUNDLE = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        public Intent createIntent(Context context, Intent input) {
            return input;
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context0, Object object0) {
            return this.createIntent(context0, ((Intent)object0));
        }

        public ActivityResult parseResult(int v, Intent intent0) {
            return new ActivityResult(v, intent0);
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object parseResult(int v, Intent intent0) {
            return this.parseResult(v, intent0);
        }
    }

    public static final class StartIntentSenderForResult extends ActivityResultContract {
        public static final String ACTION_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        public static final String EXTRA_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        public static final String EXTRA_SEND_INTENT_EXCEPTION = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        public Intent createIntent(Context context0, IntentSenderRequest intentSenderRequest0) {
            return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest0);
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context0, Object object0) {
            return this.createIntent(context0, ((IntentSenderRequest)object0));
        }

        public ActivityResult parseResult(int v, Intent intent0) {
            return new ActivityResult(v, intent0);
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object parseResult(int v, Intent intent0) {
            return this.parseResult(v, intent0);
        }
    }

    public static class TakePicture extends ActivityResultContract {
        public Intent createIntent(Context context0, Uri uri0) {
            return new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri0);
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context0, Object object0) {
            return this.createIntent(context0, ((Uri)object0));
        }

        public final SynchronousResult getSynchronousResult(Context context, Uri input) {
            return null;
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult getSynchronousResult(Context context0, Object object0) {
            return this.getSynchronousResult(context0, ((Uri)object0));
        }

        public final Boolean parseResult(int v, Intent intent0) {
            return v == -1;
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object parseResult(int v, Intent intent0) {
            return this.parseResult(v, intent0);
        }
    }

    public static class TakePicturePreview extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context0, Object object0) {
            return this.createIntent(context0, ((Void)object0));
        }

        public Intent createIntent(Context context0, Void void0) {
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult getSynchronousResult(Context context0, Object object0) {
            return this.getSynchronousResult(context0, ((Void)object0));
        }

        public final SynchronousResult getSynchronousResult(Context context, Void input) {
            return null;
        }

        public final Bitmap parseResult(int v, Intent intent0) {
            return intent0 == null || v != -1 ? null : ((Bitmap)intent0.getParcelableExtra("data"));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object parseResult(int v, Intent intent0) {
            return this.parseResult(v, intent0);
        }
    }

    @Deprecated
    public static class TakeVideo extends ActivityResultContract {
        public Intent createIntent(Context context0, Uri uri0) {
            return new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri0);
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context0, Object object0) {
            return this.createIntent(context0, ((Uri)object0));
        }

        public final SynchronousResult getSynchronousResult(Context context, Uri input) {
            return null;
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult getSynchronousResult(Context context0, Object object0) {
            return this.getSynchronousResult(context0, ((Uri)object0));
        }

        public final Bitmap parseResult(int v, Intent intent0) {
            return intent0 == null || v != -1 ? null : ((Bitmap)intent0.getParcelableExtra("data"));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object parseResult(int v, Intent intent0) {
            return this.parseResult(v, intent0);
        }
    }

}

