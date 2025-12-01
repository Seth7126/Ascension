// 函数: frexpl
// 地址: 0x1a6d88
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*arg3 = 0
int32_t r3 = arg2 & 0x7fffffff
double q0 = arg2:arg1

if (r3 u<= 0x7fefffff && (r3 | arg1) != 0)
    int32_t r4_2 = 0
    
    if (0 == r3 u>> 0x14)
        r4_2 = 0xffffffca
        *arg3 = 0xffffffca
        arg2:arg1 = 0 * 0.0
        r3 = arg2 & 0x7fffffff
    
    *arg3 = r4_2 + (r3 u>> 0x14) - 0x3fe
    q0 = ((arg2 & 0x800fffff) | 0x3fe00000):arg1

int32_t result
int32_t r1_2
r1_2:result = q0
return result
