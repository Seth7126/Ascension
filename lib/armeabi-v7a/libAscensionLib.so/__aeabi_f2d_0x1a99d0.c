// 函数: __aeabi_f2d
// 地址: 0x1a99d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = arg1 << 1
int32_t result = r2 << 0x1c

if ((arg1 & 0x7fffffff) != 0 && (r2 & 0xff000000) != 0)
    return result

if (r2 == 0)
    return result

int32_t r1_3 = (test_bit(arg1, 0x1f) << 0x1f | r2 s>> 3 u>> 1) & 0x7fffffff

if (r1_3 == 0)
    r1_3 = result
    result = 0

int32_t temp0 = 0
int32_t i = r1_3

while (i != 0)
    i u>>= 1
    temp0 += 1

int32_t r3_2
int32_t r2_1 = r3_2 - 0x2b
bool cond:1 = r3_2 - 0xb s<= 0x20
bool cond:2 = r3_2 - 0xb s<= 0x20

if (r3_2 - 0xb s>= 0x20)
    goto label_1a9860

cond:1 = r2_1 s<= 0xfffffff4
cond:2 = r2_1 s<= 0xfffffff4
uint32_t r1_4

if (r2_1 s<= 0xfffffff4)
    r2_1 += 0x20
label_1a9860:
    
    if (cond:1)
        arg2 = 0x20 - r2_1.b
    
    r1_4 = r1_3 << r2_1
    
    if (cond:2)
        r1_4 |= result u>> zx.d(arg2)
        result <<= r2_1
else
    result = r1_3 << (r2_1 + 0x20)
    r1_4 = r1_3 u>> (0xc * 0 - r2_1)

if (0x380 s>= r3_2 - 0xb)
    return result

int32_t r4_1 = not.d(0x380 - (r3_2 - 0xb))

if (r4_1 s>= 0x1f)
    return r1_4 u>> (r4_1 - 0x1f)

if (r4_1 - 0x1f s> 0xfffffff4)
    return result u>> (0x20 - (0xc * 0 - (r4_1 - 0x1f)))
        | r1_4 << ((0xc * 0 - (r4_1 - 0x1f)) & 0xff)

return result u>> (r4_1 + 1) | r1_4 << zx.d(0x20 - (r4_1 + 1).b)
