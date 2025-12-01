package androidx.profileinstaller;

class ProfileVersion {
    static final int MIN_SUPPORTED_SDK = 24;
    static final byte[] V001_N;
    static final byte[] V005_O;
    static final byte[] V010_P;

    static {
        ProfileVersion.V010_P = new byte[]{0x30, 49, 0x30, 0};
        ProfileVersion.V005_O = new byte[]{0x30, 0x30, 53, 0};
        ProfileVersion.V001_N = new byte[]{0x30, 0x30, 49, 0};
    }
}

