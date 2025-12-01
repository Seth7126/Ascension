package com.google.firebase.iid;

final class InstanceIdResultImpl implements InstanceIdResult {
    private final String id;
    private final String token;

    InstanceIdResultImpl(String s, String s1) {
        this.id = s;
        this.token = s1;
    }

    @Override  // com.google.firebase.iid.InstanceIdResult
    public final String getId() {
        return this.id;
    }

    @Override  // com.google.firebase.iid.InstanceIdResult
    public final String getToken() {
        return this.token;
    }
}

