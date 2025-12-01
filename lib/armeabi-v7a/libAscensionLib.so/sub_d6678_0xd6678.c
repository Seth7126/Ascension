// 函数: sub_d6678
// 地址: 0xd6678
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r5 = *(arg1 + 0x30)
int32_t* r6 = *(arg1 + 0x40)
void* r7 = *r5
int32_t r4 = *(r7 + 0x3c)
int32_t r0_1

if (r4 s<= sx.d(r5[0xb].w))
    char const* const var_24_1 = "local variables"
    r0_1 = sub_d1388(*(arg1 + 0x34), *(r7 + 0x18), r7 + 0x3c, 0xc, 0x7fff)
    int32_t r1_1 = *(r7 + 0x3c)
    *(r7 + 0x18) = r0_1
    
    if (r4 s< r1_1)
        int32_t i_1 = r1_1 - r4
        int32_t* r2_3 = r0_1 + r4 * 0xc
        int32_t i
        
        do
            *r2_3 = 0
            r2_3 = &r2_3[3]
            i = i_1
            i_1 -= 1
        while (i != 1)
else
    r0_1 = *(r7 + 0x18)

int32_t r1_2 = sx.d(r5[0xb].w)
int16_t r4_1 = r1_2.w & 0xffff
*(r0_1 + r1_2 * 0xc) = arg2

if ((zx.d(*(arg2 + 5)) & 3) != 0 && (zx.d(*(r7 + 5)) & 4) != 0)
    sub_cade0(*(arg1 + 0x34), r7, arg2)
    r4_1 = r5[0xb].w

r5[0xb].w = r4_1 + 1
int32_t r1_3 = r6[1]
int32_t r3 = r1_3 + 1

if (r3 - r5[0xa] s>= 0xc9)
    int32_t* r0_13
    int32_t r1_6
    int32_t lr
    r0_13, r1_6, lr = sub_d4018(r5, 0xc8, "local variables")
    return sub_d67dc(r0_13, r1_6) __tailcall

int32_t r0_10

if (r1_3 + 2 s<= r6[2])
    r0_10 = *r6
else
    char const* const var_24_2 = "local variables"
    r0_10 = sub_d1388(*(arg1 + 0x34), *r6, &r6[2], 2, 0x7ffffffd)
    r1_3 = r6[1]
    *r6 = r0_10
    r3 = r1_3 + 1

int16_t* result = r0_10 + (r1_3 << 1)
r6[1] = r3
*result = r4_1
return result
