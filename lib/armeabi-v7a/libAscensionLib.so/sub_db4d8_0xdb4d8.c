// 函数: sub_db4d8
// 地址: 0xdb4d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char r0_5
int32_t r1_3
int32_t r1_4

switch ((arg2[2] & 0x3f) - 1)
    case 0
        r0_5 = *(arg1 + 7)
        r1_4 = *arg2
    label_db618:
        return *(arg1 + 0x10) + ((r1_4 & not.d(0xffffffff << zx.d(r0_5))) << 5)
    case 2
        unimplemented  {vmov.f64 d0, #1.000000e+00}
        int128_t q0
        q0:8.q = *arg2
        q0.q = q0:8.q f+ q0.q
        int64_t var_20_1 = q0.q
        int32_t r1_6 = var_20_1:4.d + var_20_1.d
        int32_t r0_7
        
        if (r1_6 s<= 0xffffffff)
            r0_7 = r1_6 * 2
            
            if (r1_6 != neg.d(r1_6))
                r0_7 = 0 - r1_6
        else
            r0_7 = r1_6
        
        r1_3 = __aeabi_idivmod(r0_7, (1 | 0xffffffff << zx.d(*(arg1 + 7))) ^ 0xfffffffe, 
            0xfffffffe, 1, var_20_1)
        return *(arg1 + 0x10) + (r1_3 << 5)
    case 3
        return *(arg1 + 0x10) + ((*(*arg2 + 8) & not.d(0xffffffff << zx.d(*(arg1 + 7)))) << 5)
    case 0x13
        void* r6_1 = *arg2
        
        if (zx.d(*(r6_1 + 6)) == 0)
            int32_t r2_1
            int32_t r3_2
            r3_2:r2_1 = *(r6_1 + 8)
            *(r6_1 + 8) = sub_d7d40(r6_1 + 0x10, r3_2, r2_1)
            *(r6_1 + 6) = 1
            r6_1 = *arg2
        
        r0_5 = *(arg1 + 7)
        r1_4 = *(r6_1 + 8)
        goto label_db618
    default
        r1_3 = __aeabi_uidivmod(*arg2, (1 | 0xffffffff << zx.d(*(arg1 + 7))) ^ 0xfffffffe, 
            0xfffffffe, 1)
        return *(arg1 + 0x10) + (r1_3 << 5)
