// 函数: sub_1a07fe
// 地址: 0x1a07fe
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*arg2 = 0
char* r3 = *arg1
char* r12 = arg1[1]

if (r12 == r3 || zx.d(*r3 - 0x30) u> 9)
    return 1

int32_t lr = 0

while (r12 != r3)
    if (zx.d(*r3 - 0x30) u> 9)
        break
    
    int32_t r2_8 = lr * 0xa
    *arg2 = r2_8
    uint32_t lr_1
    
    if (r3 == r12)
        lr_1 = 0
        r3 = r12
    else
        *arg1 = &r3[1]
        lr_1 = zx.d(*r3)
        r3 = &r3[1]
    
    lr = r2_8 + lr_1 - 0x30
    *arg2 = lr

return 0
