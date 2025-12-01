// 函数: sub_1a2cac
// 地址: 0x1a2cac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* r2 = *arg2
char* r1 = *arg1
int32_t lr = arg1[1]

if (lr - r1 == arg2[1] - r2)
    while (true)
        if (lr == r1)
            return 1
        
        if (zx.d(*r1) != zx.d(*r2))
            break
        
        r2 = &r2[1]
        r1 = &r1[1]

return 0
