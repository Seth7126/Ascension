// 函数: sub_ccd20
// 地址: 0xccd20
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = arg2[2]

if ((r2 & 0x40) != 0)
    void* r1 = *arg2
    
    if ((r2 & 0xf) != 4)
        return zx.d(*(r1 + 5)) & 3
    
    if (r1 != 0 && (zx.d(*(r1 + 5)) & 3) != 0)
        sub_cae14(arg1, r1)

return 0
