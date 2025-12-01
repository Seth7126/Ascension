package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

final class FirelogAnalyticsEvent {
    static class FirelogAnalyticsEventEncoder implements ObjectEncoder {
        public void encode(FirelogAnalyticsEvent firelogAnalyticsEvent0, ObjectEncoderContext objectEncoderContext0) throws EncodingException, IOException {
            Intent intent0 = firelogAnalyticsEvent0.getIntent();
            objectEncoderContext0.add("ttl", MessagingAnalytics.getTtl(intent0));
            objectEncoderContext0.add("event", firelogAnalyticsEvent0.getEventType());
            objectEncoderContext0.add("instanceId", MessagingAnalytics.getInstanceId());
            objectEncoderContext0.add("priority", MessagingAnalytics.getPriority(intent0));
            objectEncoderContext0.add("packageName", MessagingAnalytics.getPackageName());
            objectEncoderContext0.add("sdkPlatform", "ANDROID");
            objectEncoderContext0.add("messageType", MessagingAnalytics.getMessageTypeForFirelog(intent0));
            String s = MessagingAnalytics.getMessageId(intent0);
            if(s != null) {
                objectEncoderContext0.add("messageId", s);
            }
            String s1 = MessagingAnalytics.getTopic(intent0);
            if(s1 != null) {
                objectEncoderContext0.add("topic", s1);
            }
            String s2 = MessagingAnalytics.getCollapseKey(intent0);
            if(s2 != null) {
                objectEncoderContext0.add("collapseKey", s2);
            }
            if(MessagingAnalytics.getMessageLabel(intent0) != null) {
                objectEncoderContext0.add("analyticsLabel", MessagingAnalytics.getMessageLabel(intent0));
            }
            if(MessagingAnalytics.getComposerLabel(intent0) != null) {
                objectEncoderContext0.add("composerLabel", MessagingAnalytics.getComposerLabel(intent0));
            }
            String s3 = MessagingAnalytics.getProjectNumber();
            if(s3 != null) {
                objectEncoderContext0.add("projectNumber", s3);
            }
        }

        @Override  // com.google.firebase.encoders.Encoder
        public void encode(Object object0, Object object1) throws IOException {
            this.encode(((FirelogAnalyticsEvent)object0), ((ObjectEncoderContext)object1));
        }
    }

    static final class FirelogAnalyticsEventWrapper {
        private final FirelogAnalyticsEvent firelogAnalyticsEvent;

        FirelogAnalyticsEventWrapper(FirelogAnalyticsEvent firelogAnalyticsEvent0) {
            this.firelogAnalyticsEvent = (FirelogAnalyticsEvent)Preconditions.checkNotNull(firelogAnalyticsEvent0);
        }

        final FirelogAnalyticsEvent getFirelogAnalyticsEvent() {
            return this.firelogAnalyticsEvent;
        }
    }

    static final class FirelogAnalyticsEventWrapperEncoder implements ObjectEncoder {
        public final void encode(FirelogAnalyticsEventWrapper firelogAnalyticsEvent$FirelogAnalyticsEventWrapper0, ObjectEncoderContext objectEncoderContext0) throws EncodingException, IOException {
            objectEncoderContext0.add("messaging_client_event", firelogAnalyticsEvent$FirelogAnalyticsEventWrapper0.getFirelogAnalyticsEvent());
        }

        @Override  // com.google.firebase.encoders.Encoder
        public final void encode(Object object0, Object object1) throws IOException {
            this.encode(((FirelogAnalyticsEventWrapper)object0), ((ObjectEncoderContext)object1));
        }
    }

    private final String eventType;
    private final Intent intent;

    FirelogAnalyticsEvent(String s, Intent intent0) {
        this.eventType = Preconditions.checkNotEmpty(s, "evenType must be non-null");
        this.intent = (Intent)Preconditions.checkNotNull(intent0, "intent must be non-null");
    }

    final String getEventType() {
        return this.eventType;
    }

    final Intent getIntent() {
        return this.intent;
    }
}

