package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.zzb;

public final class EventEntity extends zzb implements Event {
    public static final Parcelable.Creator CREATOR;
    private final String description;
    private final String name;
    private final long value;
    private final PlayerEntity zzcr;
    private final String zzcx;
    private final String zzcy;
    private final boolean zzcz;
    private final Uri zzm;
    private final String zzx;

    static {
        EventEntity.CREATOR = new zza();
    }

    public EventEntity(Event event0) {
        this.zzcx = event0.getEventId();
        this.name = event0.getName();
        this.description = event0.getDescription();
        this.zzm = event0.getIconImageUri();
        this.zzx = event0.getIconImageUrl();
        this.zzcr = (PlayerEntity)event0.getPlayer().freeze();
        this.value = event0.getValue();
        this.zzcy = event0.getFormattedValue();
        this.zzcz = event0.isVisible();
    }

    EventEntity(String s, String s1, String s2, Uri uri0, String s3, Player player0, long v, String s4, boolean z) {
        this.zzcx = s;
        this.name = s1;
        this.description = s2;
        this.zzm = uri0;
        this.zzx = s3;
        this.zzcr = new PlayerEntity(player0);
        this.value = v;
        this.zzcy = s4;
        this.zzcz = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return EventEntity.zza(this, object0);
    }

    public final Event freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.event.Event
    public final String getDescription() {
        return this.description;
    }

    @Override  // com.google.android.gms.games.event.Event
    public final void getDescription(CharArrayBuffer charArrayBuffer0) {
        DataUtils.copyStringToBuffer(this.description, charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.event.Event
    public final String getEventId() {
        return this.zzcx;
    }

    @Override  // com.google.android.gms.games.event.Event
    public final String getFormattedValue() {
        return this.zzcy;
    }

    @Override  // com.google.android.gms.games.event.Event
    public final void getFormattedValue(CharArrayBuffer charArrayBuffer0) {
        DataUtils.copyStringToBuffer(this.zzcy, charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.event.Event
    public final Uri getIconImageUri() {
        return this.zzm;
    }

    @Override  // com.google.android.gms.games.event.Event
    public final String getIconImageUrl() {
        return this.zzx;
    }

    @Override  // com.google.android.gms.games.event.Event
    public final String getName() {
        return this.name;
    }

    @Override  // com.google.android.gms.games.event.Event
    public final void getName(CharArrayBuffer charArrayBuffer0) {
        DataUtils.copyStringToBuffer(this.name, charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.event.Event
    public final Player getPlayer() {
        return this.zzcr;
    }

    @Override  // com.google.android.gms.games.event.Event
    public final long getValue() {
        return this.value;
    }

    @Override
    public final int hashCode() {
        return EventEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override  // com.google.android.gms.games.event.Event
    public final boolean isVisible() {
        return this.zzcz;
    }

    @Override
    public final String toString() {
        return EventEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.getEventId(), false);
        SafeParcelWriter.writeString(parcel0, 2, this.getName(), false);
        SafeParcelWriter.writeString(parcel0, 3, this.getDescription(), false);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.getIconImageUri(), v, false);
        SafeParcelWriter.writeString(parcel0, 5, this.getIconImageUrl(), false);
        SafeParcelWriter.writeParcelable(parcel0, 6, this.getPlayer(), v, false);
        SafeParcelWriter.writeLong(parcel0, 7, this.getValue());
        SafeParcelWriter.writeString(parcel0, 8, this.getFormattedValue(), false);
        SafeParcelWriter.writeBoolean(parcel0, 9, this.isVisible());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    static int zza(Event event0) {
        return Objects.hashCode(new Object[]{event0.getEventId(), event0.getName(), event0.getDescription(), event0.getIconImageUri(), event0.getIconImageUrl(), event0.getPlayer(), event0.getValue(), event0.getFormattedValue(), Boolean.valueOf(event0.isVisible())});
    }

    // 去混淆评级： 低(36)
    static boolean zza(Event event0, Object object0) {
        if(!(object0 instanceof Event)) {
            return false;
        }
        return event0 == object0 ? true : Objects.equal(((Event)object0).getEventId(), event0.getEventId()) && Objects.equal(((Event)object0).getName(), event0.getName()) && Objects.equal(((Event)object0).getDescription(), event0.getDescription()) && Objects.equal(((Event)object0).getIconImageUri(), event0.getIconImageUri()) && Objects.equal(((Event)object0).getIconImageUrl(), event0.getIconImageUrl()) && Objects.equal(((Event)object0).getPlayer(), event0.getPlayer()) && Objects.equal(((Event)object0).getValue(), event0.getValue()) && Objects.equal(((Event)object0).getFormattedValue(), event0.getFormattedValue()) && Objects.equal(Boolean.valueOf(((Event)object0).isVisible()), Boolean.valueOf(event0.isVisible()));
    }

    static String zzb(Event event0) {
        return Objects.toStringHelper(event0).add("Id", event0.getEventId()).add("Name", event0.getName()).add("Description", event0.getDescription()).add("IconImageUri", event0.getIconImageUri()).add("IconImageUrl", event0.getIconImageUrl()).add("Player", event0.getPlayer()).add("Value", event0.getValue()).add("FormattedValue", event0.getFormattedValue()).add("isVisible", Boolean.valueOf(event0.isVisible())).toString();
    }
}

