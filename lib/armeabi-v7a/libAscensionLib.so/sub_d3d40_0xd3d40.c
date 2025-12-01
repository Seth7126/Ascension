// 函数: sub_d3d40
// 地址: 0xd3d40
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r10
int32_t var_c = r10
uint32_t r0 = zx.d(*(arg1 + 0x2f))

if (r0 == 0xff)
    return sub_d3e50(sub_d4018(arg1, 0xff, "upvalues")) __tailcall

void* r6 = *arg1
int32_t r5 = *(r6 + 0x28)
int32_t r2_2

if (r5 s<= r0)
    char const* const var_24_1 = "upvalues"
    int32_t r0_3 = sub_d1388(*(arg1[3] + 0x34), *(r6 + 0x1c), r6 + 0x28, 8, 0xff)
    r2_2 = *(r6 + 0x28)
    *(r6 + 0x1c) = r0_3

int32_t r1_1

if (r5 s> r0 || r5 s>= r2_2)
    r1_1 = *(r6 + 0x1c)
else
    r1_1 = *(r6 + 0x1c)
    
    do
        *(r1_1 + (r5 << 3)) = 0
        r5 += 1
    while (r5 s< r2_2)

uint32_t result = zx.d(*(arg1 + 0x2f))
int32_t temp0 = 0
uint32_t i = *arg3 - 7

while (i != 0)
    i u>>= 1
    temp0 += 1

void* r3 = r1_1 + (result << 3)
*(r3 + 4) = ((0x20 - temp0) u>> 5).b
char r2_7 = (arg3[2]).b
*(r1_1 + (result << 3)) = arg2
*(r3 + 5) = r2_7

if ((zx.d(*(arg2 + 5)) & 3) != 0 && (zx.d(*(r6 + 5)) & 4) != 0)
    sub_cade0(*(arg1[3] + 0x34), r6, arg2)
    result = zx.d(*(arg1 + 0x2f))

*(arg1 + 0x2f) = result.b + 1
return result
