package com.google.firebase.components;

public final class Dependency {
    private final Class anInterface;
    private final int injection;
    private final int type;

    private Dependency(Class class0, int v, int v1) {
        this.anInterface = (Class)Preconditions.checkNotNull(class0, "Null dependency anInterface.");
        this.type = v;
        this.injection = v1;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof Dependency && this.anInterface == ((Dependency)object0).anInterface && this.type == ((Dependency)object0).type && this.injection == ((Dependency)object0).injection;
    }

    public Class getInterface() {
        return this.anInterface;
    }

    @Override
    public int hashCode() {
        return ((this.anInterface.hashCode() ^ 1000003) * 1000003 ^ this.type) * 1000003 ^ this.injection;
    }

    public boolean isDirectInjection() {
        return this.injection == 0;
    }

    public boolean isRequired() {
        return this.type == 1;
    }

    public boolean isSet() {
        return this.type == 2;
    }

    public static Dependency optional(Class class0) {
        return new Dependency(class0, 0, 0);
    }

    public static Dependency optionalProvider(Class class0) {
        return new Dependency(class0, 0, 1);
    }

    public static Dependency required(Class class0) {
        return new Dependency(class0, 1, 0);
    }

    public static Dependency requiredProvider(Class class0) {
        return new Dependency(class0, 1, 1);
    }

    public static Dependency setOf(Class class0) {
        return new Dependency(class0, 2, 0);
    }

    public static Dependency setOfProvider(Class class0) {
        return new Dependency(class0, 2, 1);
    }

    @Override
    public String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("Dependency{anInterface=");
        stringBuilder0.append(this.anInterface);
        stringBuilder0.append(", type=");
        int v = this.type;
        boolean z = true;
        if(v == 1) {
            s = "required";
        }
        else {
            s = v == 0 ? "optional" : "set";
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", direct=");
        if(this.injection != 0) {
            z = false;
        }
        stringBuilder0.append(z);
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}

