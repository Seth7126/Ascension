package com.androidnative.gms.listeners.quests;

import android.util.Log;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.event.Event;
import com.google.android.gms.games.event.Events.LoadEventsResult;
import com.unity3d.player.UnityPlayer;

public class AN_EventsLoadListner implements ResultCallback {
    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((LoadEventsResult)result0));
    }

    public void onResult(LoadEventsResult events$LoadEventsResult0) {
        Log.d("AndroidNative", "AN_EventsLoadListner+");
        int v = events$LoadEventsResult0.getStatus().getStatusCode();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(v);
        if(v == 0) {
            stringBuilder0.append("|");
            for(Object object0: events$LoadEventsResult0.getEvents()) {
                stringBuilder0.append(((Event)object0).getEventId());
                stringBuilder0.append("|");
                stringBuilder0.append(((Event)object0).getDescription());
                stringBuilder0.append("|");
                stringBuilder0.append(((Event)object0).getIconImageUrl());
                stringBuilder0.append("|");
                stringBuilder0.append(((Event)object0).getFormattedValue());
                stringBuilder0.append("|");
                stringBuilder0.append(Long.toString(((Event)object0).getValue()));
                stringBuilder0.append("|");
            }
            events$LoadEventsResult0.getEvents().close();
            stringBuilder0.append("endofline");
        }
        UnityPlayer.UnitySendMessage("GooglePlayEvents", "OnGPEventsLoaded", stringBuilder0.toString());
    }
}

