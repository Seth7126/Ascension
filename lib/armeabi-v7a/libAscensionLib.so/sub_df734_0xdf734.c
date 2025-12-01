// 函数: sub_df734
// 地址: 0xdf734
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0_1 = arg3[2] & 0xf
int64_t q0

if (r0_1 == 4)
    q0.d = *(*arg3 + 0xc)
    unimplemented  {vcvt.f64.u32 d0, s0}
else
    int32_t* r0_3
    
    if (r0_1 != 5)
        r0_3 = sub_dc704(arg1, arg3, 4)
        
        if (r0_3[2] != 0)
            goto label_df7e0
        
        sub_c841c(arg1, arg3, "get length of")
        noreturn
    
    void* r7_1 = *arg3
    void* r0_2 = *(r7_1 + 8)
    int32_t r8
    
    if (r0_2 != 0 && (zx.d(*(r0_2 + 6)) & 0x10) == 0)
        r0_3 = sub_dc6c8(r0_2, 4, *(arg1[3] + 0xc8))
        
        if (r0_3 != 0)
        label_df7e0:
            int32_t* r1_4 = arg1[2]
            int32_t r7_2 = arg1[7]
            arg1[2] = &r1_4[4]
            int32_t r3 = r0_3[1]
            *r1_4 = *r0_3
            r1_4[1] = r3
            r1_4[2] = r0_3[2]
            int32_t* r0_9 = arg1[2]
            arg1[2] = &r0_9[4]
            int32_t r2_3 = arg3[1]
            *r0_9 = *arg3
            r0_9[1] = r2_3
            r0_9[2] = arg3[2]
            int32_t* r0_10 = arg1[2]
            arg1[2] = &r0_10[4]
            int32_t r2_4 = arg3[1]
            *r0_10 = *arg3
            r0_10[1] = r2_4
            r0_10[2] = arg3[2]
            sub_c9774(arg1, arg1[2] - 0x30, 1, zx.d(*(arg1[4] + 0x12)) & 1, r8)
            int32_t r0_13 = arg1[2]
            void* r1_13 = arg1[7]
            arg1[2] = r0_13 - 0x10
            int32_t r3_2 = *(r0_13 - 0xc)
            void* r1_14 = r1_13 + arg2 - r7_2
            *r1_14 = *(r0_13 - 0x10)
            *(r1_14 + 4) = r3_2
            int32_t result = *(r0_13 - 8)
            *(r1_14 + 8) = result
            return result
    
    int128_t q4
    q0.d = sub_db934(r7_1, r8, q4)
    unimplemented  {vcvt.f64.s32 d0, s0}

arg2[1].d = 3
*arg2 = q0
return 3
