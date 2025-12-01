package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build.VERSION;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.Preconditions;
import androidx.versionedparcelable.VersionedParcelable;

public final class RemoteActionCompat implements VersionedParcelable {
    public PendingIntent mActionIntent;
    public CharSequence mContentDescription;
    public boolean mEnabled;
    public IconCompat mIcon;
    public boolean mShouldShowIcon;
    public CharSequence mTitle;

    public RemoteActionCompat() {
    }

    public RemoteActionCompat(RemoteActionCompat remoteActionCompat0) {
        Preconditions.checkNotNull(remoteActionCompat0);
        this.mIcon = remoteActionCompat0.mIcon;
        this.mTitle = remoteActionCompat0.mTitle;
        this.mContentDescription = remoteActionCompat0.mContentDescription;
        this.mActionIntent = remoteActionCompat0.mActionIntent;
        this.mEnabled = remoteActionCompat0.mEnabled;
        this.mShouldShowIcon = remoteActionCompat0.mShouldShowIcon;
    }

    public RemoteActionCompat(IconCompat iconCompat0, CharSequence charSequence0, CharSequence charSequence1, PendingIntent pendingIntent0) {
        this.mIcon = (IconCompat)Preconditions.checkNotNull(iconCompat0);
        this.mTitle = (CharSequence)Preconditions.checkNotNull(charSequence0);
        this.mContentDescription = (CharSequence)Preconditions.checkNotNull(charSequence1);
        this.mActionIntent = (PendingIntent)Preconditions.checkNotNull(pendingIntent0);
        this.mEnabled = true;
        this.mShouldShowIcon = true;
    }

    public static RemoteActionCompat createFromRemoteAction(RemoteAction remoteAction0) {
        Preconditions.checkNotNull(remoteAction0);
        RemoteActionCompat remoteActionCompat0 = new RemoteActionCompat(IconCompat.createFromIcon(remoteAction0.getIcon()), remoteAction0.getTitle(), remoteAction0.getContentDescription(), remoteAction0.getActionIntent());
        remoteActionCompat0.setEnabled(remoteAction0.isEnabled());
        if(Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat0.setShouldShowIcon(remoteAction0.shouldShowIcon());
        }
        return remoteActionCompat0;
    }

    public PendingIntent getActionIntent() {
        return this.mActionIntent;
    }

    public CharSequence getContentDescription() {
        return this.mContentDescription;
    }

    public IconCompat getIcon() {
        return this.mIcon;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public void setShouldShowIcon(boolean z) {
        this.mShouldShowIcon = z;
    }

    public boolean shouldShowIcon() {
        return this.mShouldShowIcon;
    }

    public RemoteAction toRemoteAction() {
        RemoteAction remoteAction0 = new RemoteAction(this.mIcon.toIcon(), this.mTitle, this.mContentDescription, this.mActionIntent);
        remoteAction0.setEnabled(this.isEnabled());
        if(Build.VERSION.SDK_INT >= 28) {
            remoteAction0.setShouldShowIcon(this.shouldShowIcon());
        }
        return remoteAction0;
    }
}

