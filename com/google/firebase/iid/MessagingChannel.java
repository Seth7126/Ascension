package com.google.firebase.iid;

import com.google.android.gms.tasks.Task;
import javax.annotation.Nullable;

public interface MessagingChannel {
    Task ackMessage(String arg1);

    Task buildChannel(String arg1, @Nullable String arg2);

    Task deleteInstanceId(String arg1);

    Task deleteToken(String arg1, @Nullable String arg2, String arg3, String arg4);

    Task getToken(String arg1, @Nullable String arg2, String arg3, String arg4);

    boolean isAvailable();

    boolean isChannelBuilt();

    boolean needsRefresh();

    Task subscribeToTopic(String arg1, String arg2, String arg3);

    Task unsubscribeFromTopic(String arg1, String arg2, String arg3);
}

