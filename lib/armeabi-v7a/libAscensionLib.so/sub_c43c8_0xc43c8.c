// 函数: sub_c43c8
// 地址: 0xc43c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r10
int32_t var_c = r10
int32_t r5
int32_t var_20 = r5
int32_t* r8 = *(arg1[3] + 0x34)
int32_t __saved_r11
int64_t* r0_2 = sub_daf38(r8, arg1[1], arg2, arg1, r5, arg3, r10, &__saved_r11)
void* r9 = *arg1
int32_t result
int128_t q0

if (r0_2[1].d != 3)
label_c4448:
    result = arg1[8]
    q0.d = result
    unimplemented  {vcvt.f64.s32 d0, s0}
    int32_t r5_1 = *(r9 + 0x2c)
    r0_2[1].d = 3
    *r0_2 = q0.q
    int32_t r1_2 = *(r9 + 0x2c)
    int32_t r0_7
    
    if (result s>= r1_2)
        char const* const var_34_1 = "constants"
        r0_7 = sub_d1388(r8, *(r9 + 8), r9 + 0x2c, 0x10, 0x3ffffff)
        r1_2 = *(r9 + 0x2c)
        *(r9 + 8) = r0_7
        
        if (r5_1 s< r1_2)
        label_c44cc:
            
            do
                void* r3_1 = r0_7 + (r5_1 << 4)
                r5_1 += 1
                *(r3_1 + 8) = 0
            while (r5_1 s< r1_2)
    else
        r0_7 = *(r9 + 8)
        
        if (r5_1 s< r1_2)
            goto label_c44cc
    
    int32_t r2_5 = arg3[1]
    void** r0_9 = r0_7 + (result << 4)
    *r0_9 = *arg3
    r0_9[1] = r2_5
    r0_9[2] = arg3[2]
    arg1[8] += 1
    
    if ((zx.d(arg3[2].b) & 0x40) != 0)
        void* r2_6 = *arg3
        
        if ((zx.d(*(r2_6 + 5)) & 3) != 0 && (zx.d(*(r9 + 5)) & 4) != 0)
            sub_cade0(r8, r9, r2_6)
else
    q0.q = 0x4338000000000000
    q0:8.q = *r0_2
    q0.q = q0:8.q f+ q0.q
    result = q0.d
    int32_t* r1_1 = *(r9 + 8) + (result << 4)
    
    if (r1_1[2] != arg3[2])
        goto label_c4448
    
    uint32_t r0_6
    r0_6, r9, q0 = sub_df0d4(nullptr, r1_1, arg3)
    
    if (r0_6 == 0)
        goto label_c4448
return result
