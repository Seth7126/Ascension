// 函数: sub_19ebc4
// 地址: 0x19ebc4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* r12 = *arg2
void* r2_1
int32_t lr

if (arg3 == 0)
    lr = arg2[1]
    r2_1 = r12
else
    lr = arg2[1]
    
    if (r12 == lr || zx.d(*r12) != 0x6e)
        r2_1 = r12
    else
        r2_1 = &r12[1]
        *arg2 = r2_1

if (lr == r2_1 || zx.d(*r2_1) - 0x30 u> 9)
    *arg1 = nullptr
    arg1[1] = 0
    return 

void* r3_3 = r2_1 + 1

while (lr != r2_1)
    if (zx.d(*(r3_3 - 1)) - 0x30 u> 9)
        break
    
    *arg2 = r3_3
    r2_1 = r3_3
    r3_3 += 1

*arg1 = r12
arg1[1] = r2_1
