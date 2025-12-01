// 函数: sub_d541c
// 地址: 0xd541c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r11
int32_t var_8 = r11
int32_t* r11_1 = &var_8
int32_t* r10 = arg1[4]
int32_t* r9 = arg1
void* r8 = arg1[3]
int64_t* pc

if (*r10 != 0 && zx.d(*(r10 + 9)) != 0)
    int32_t r0_3
    int32_t* r9_1
    r0_3, r9_1 = sub_c3d14(r9)
    sub_c40e4(r9_1, r0_3, zx.d(r10[2].b))
    r9, r11_1 = sub_c3f64(r9_1, r0_3, r8, pc)

if (zx.d(*(r10 + 0xa)) != 0)
    int32_t r0_8 = sub_d807c(*(r8 + 0x34), "break")
    void* r6_2 = *(r8 + 0x40)
    void* r1_3 = *(r8 + 0x30)
    int32_t r7_1 = *(r6_2 + 0x1c)
    int32_t r5_1 = *(r1_3 + 0x14)
    int32_t r0_10
    int32_t r2_4
    void* r4_1
    
    if (r7_1 s>= *(r6_2 + 0x20))
        char const* const var_2c_1 = "labels/gotos"
        r0_10 = sub_d1388(*(r8 + 0x34), *(r6_2 + 0x18), r6_2 + 0x20, 0x10, 0x7fff)
        r2_4 = *(r6_2 + 0x1c)
        *(r6_2 + 0x18) = r0_10
        r1_3 = *(r8 + 0x30)
        r4_1 = *(r8 + 0x40)
    else
        r0_10 = *(r6_2 + 0x18)
        r4_1 = r6_2
        r2_4 = r7_1
    
    int32_t* r0_12 = r0_10 + (r7_1 << 4)
    *r0_12 = r0_8
    r0_12[2] = 0
    char r3_2 = *(r1_3 + 0x2e)
    r0_12[1] = r5_1
    r0_12[3].b = r3_2
    *(r6_2 + 0x1c) = r2_4 + 1
    int32_t i = sx.d(*(*(r1_3 + 0x10) + 6))
    
    if (*(r4_1 + 0x10) s> i)
        int32_t* r7_2 = *(r4_1 + 0x18) + (r7_1 << 4)
        
        do
            if (sub_d7cc4(*(*(r4_1 + 0xc) + (i << 4)), *r7_2) == 0)
                i += 1
            else
                r9 = sub_d6d14(r8, i, r7_2, pc)
        while (i s< *(r4_1 + 0x10))

void* r0_21 = r9[3]
int32_t r12 = *r10
r9[4] = r12
int32_t* r7_3 = *(r0_21 + 0x40)
uint32_t i_2 = zx.d(*(r9 + 0x2e))
uint32_t i_1 = zx.d(r10[2].b)
r7_3[1] += i_1 - i_2

if (i_1 u< i_2)
    int32_t r3_4 = r9[5]
    int32_t r6_3 = r9[0xa]
    int32_t r4_2 = *r7_3
    int32_t r1_11 = *(*r9 + 0x18)
    
    do
        i_2 -= 1
        *(r1_11 + sx.d(*(r4_2 + ((r6_3 + (i_2 & 0xff)) << 1))) * 0xc + 8) = r3_4
    while ((i_2 & 0xff) u> i_1)
    
    i_2 = i_1
    *(r9 + 0x2e) = i_1.b

r9[0xc].b = i_2.b
void* r1_12 = *(r8 + 0x40)
*(r1_12 + 0x1c) = sx.d(r10[1].w)
int32_t r6_4 = sx.d(*(r10 + 6))

if (r12 == 0)
    if (*(r1_12 + 0x10) s> r6_4)
        int32_t* r0_28
        int32_t* r1_20
        int32_t r2_8
        int32_t lr
        r0_28, r1_20, r2_8, lr = sub_d6ca4(r8, *(r1_12 + 0xc) + (r6_4 << 4), r6_4.b)
        return sub_d56a0(r0_28, r1_20, r2_8, r6_4) __tailcall
else if (r7_3[4] s> r6_4)
    while (true)
        int32_t r2_7 = i_1 & 0xff
        void* r1_15 = r7_3[3] + (r6_4 << 4)
        
        if (zx.d(*(r1_15 + 0xc)) u> r2_7)
            if (zx.d(*(r10 + 9)) != 0)
                sub_c40e4(r9, *(r1_15 + 4), r2_7)
                i_1 = zx.d(r10[2].b)
            
            *(r1_15 + 0xc) = i_1.b
        
        if (sub_d6df4(r9[3], r6_4) == 0)
            r6_4 += 1
        
        if (r6_4 s>= r7_3[4])
            break
        
        i_1 = zx.d(r10[2].b)

*(r11_1 - 0x1c)
*(r11_1 - 0x18)
*(r11_1 - 0x14)
*(r11_1 - 0x10)
*(r11_1 - 0xc)
*(r11_1 - 8)
*(r11_1 - 4)
*r11_1
jump(r11_1[1])
