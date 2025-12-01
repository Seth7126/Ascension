package androidx.core.view;

import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.core.util.Preconditions;
import androidx.core.util.Predicate;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public final class ContentInfoCompat {
    public static final class Builder {
        ClipData mClip;
        Bundle mExtras;
        int mFlags;
        Uri mLinkUri;
        int mSource;

        public Builder(ClipData clipData0, int v) {
            this.mClip = clipData0;
            this.mSource = v;
        }

        public Builder(ContentInfoCompat contentInfoCompat0) {
            this.mClip = contentInfoCompat0.mClip;
            this.mSource = contentInfoCompat0.mSource;
            this.mFlags = contentInfoCompat0.mFlags;
            this.mLinkUri = contentInfoCompat0.mLinkUri;
            this.mExtras = contentInfoCompat0.mExtras;
        }

        public ContentInfoCompat build() {
            return new ContentInfoCompat(this);
        }

        public Builder setClip(ClipData clipData0) {
            this.mClip = clipData0;
            return this;
        }

        public Builder setExtras(Bundle bundle0) {
            this.mExtras = bundle0;
            return this;
        }

        public Builder setFlags(int v) {
            this.mFlags = v;
            return this;
        }

        public Builder setLinkUri(Uri uri0) {
            this.mLinkUri = uri0;
            return this;
        }

        public Builder setSource(int v) {
            this.mSource = v;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }

    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
    public static final int SOURCE_APP = 0;
    public static final int SOURCE_CLIPBOARD = 1;
    public static final int SOURCE_DRAG_AND_DROP = 3;
    public static final int SOURCE_INPUT_METHOD = 2;
    final ClipData mClip;
    final Bundle mExtras;
    final int mFlags;
    final Uri mLinkUri;
    final int mSource;

    ContentInfoCompat(Builder contentInfoCompat$Builder0) {
        this.mClip = (ClipData)Preconditions.checkNotNull(contentInfoCompat$Builder0.mClip);
        this.mSource = Preconditions.checkArgumentInRange(contentInfoCompat$Builder0.mSource, 0, 3, "source");
        this.mFlags = Preconditions.checkFlagsArgument(contentInfoCompat$Builder0.mFlags, 1);
        this.mLinkUri = contentInfoCompat$Builder0.mLinkUri;
        this.mExtras = contentInfoCompat$Builder0.mExtras;
    }

    private static ClipData buildClipData(ClipDescription clipDescription0, List list0) {
        ClipData clipData0 = new ClipData(new ClipDescription(clipDescription0), ((ClipData.Item)list0.get(0)));
        for(int v = 1; v < list0.size(); ++v) {
            clipData0.addItem(((ClipData.Item)list0.get(v)));
        }
        return clipData0;
    }

    static String flagsToString(int v) {
        return (v & 1) == 0 ? String.valueOf(v) : "FLAG_CONVERT_TO_PLAIN_TEXT";
    }

    public ClipData getClip() {
        return this.mClip;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public Uri getLinkUri() {
        return this.mLinkUri;
    }

    public int getSource() {
        return this.mSource;
    }

    public Pair partition(Predicate predicate0) {
        ContentInfoCompat contentInfoCompat0 = null;
        if(this.mClip.getItemCount() == 1) {
            boolean z = predicate0.test(this.mClip.getItemAt(0));
            if(!z) {
                contentInfoCompat0 = this;
            }
            return Pair.create((z ? this : null), contentInfoCompat0);
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < this.mClip.getItemCount(); ++v) {
            ClipData.Item clipData$Item0 = this.mClip.getItemAt(v);
            if(predicate0.test(clipData$Item0)) {
                arrayList0.add(clipData$Item0);
            }
            else {
                arrayList1.add(clipData$Item0);
            }
        }
        if(arrayList0.isEmpty()) {
            return Pair.create(null, this);
        }
        return arrayList1.isEmpty() ? Pair.create(this, null) : Pair.create(new Builder(this).setClip(ContentInfoCompat.buildClipData(this.mClip.getDescription(), arrayList0)).build(), new Builder(this).setClip(ContentInfoCompat.buildClipData(this.mClip.getDescription(), arrayList1)).build());
    }

    static String sourceToString(int v) {
        switch(v) {
            case 0: {
                return "SOURCE_APP";
            }
            case 1: {
                return "SOURCE_CLIPBOARD";
            }
            case 2: {
                return "SOURCE_INPUT_METHOD";
            }
            case 3: {
                return "SOURCE_DRAG_AND_DROP";
            }
            default: {
                return String.valueOf(v);
            }
        }
    }

    @Override
    public String toString() {
        return "ContentInfoCompat{clip=" + this.mClip + ", source=" + ContentInfoCompat.sourceToString(this.mSource) + ", flags=" + ContentInfoCompat.flagsToString(this.mFlags) + ", linkUri=" + this.mLinkUri + ", extras=" + this.mExtras + "}";
    }
}

