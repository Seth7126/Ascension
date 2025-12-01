// 函数: sub_db788
// 地址: 0xdb788
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6
int32_t var_10 = r6
int32_t r5
int32_t var_14 = r5
int32_t r4
int32_t var_18 = r4
unimplemented  {vpush {d8}}
int32_t r0_1 = arg2[2] & 0x3f

if (r0_1 != 0)
    void* const i
    
    if (r0_1 == 3)
        int128_t q0
        q0.q = 0x4338000000000000
        q0:8.q = *arg2
        q0.q = q0:8.q f+ 6755399441055744.0
        int32_t var_20
        var_20.q = q0.q
        q0.d = var_20
        unimplemented  {vcvt.f64.s32 d8, s0}
        unimplemented  {vcmp.f64 d1, d8}
        unimplemented  {vmrs apsr_nzcv, fpscr}
        
        if (r0_1 != 3)
        label_db854:
            i = sub_db4d8(arg1, arg2)
            
            do
                if (*(i + 0x18) == arg2[2] && sub_df0d4(nullptr, i + 0x10, arg2) != 0)
                    break
                
                i = *(i + 0x1c)
            while (i != 0)
        else if (var_20 - 1 u>= *(arg1 + 0x1c))
            unimplemented  {vmov.f64 d0, #1.000000e+00}
            q0.q = arg4 f+ q0.q
            var_20.q = q0.q
            int32_t var_1c
            int32_t r1_10 = var_1c + var_20
            int32_t r0_10
            
            if (r1_10 s<= 0xffffffff)
                r0_10 = r1_10 * 2
                
                if (r1_10 != neg.d(r1_10))
                    r0_10 = 0 - r1_10
            else
                r0_10 = r1_10
            
            int32_t r1_14 = __aeabi_idivmod(r0_10, 
                (1 | 0xffffffff << zx.d(*(arg1 + 7))) ^ 0xfffffffe, 0xfffffffe, 1, var_20)
            i = *(arg1 + 0x10) + (r1_14 << 5)
            
            do
                int32_t r0_12 = *(i + 0x18)
                
                if (r0_12 == 3)
                    q0.q = *(i + 0x10)
                    unimplemented  {vcmp.f64 d0, d8}
                    unimplemented  {vmrs apsr_nzcv, fpscr}
                    
                    if (r0_12 == 3)
                        break
                
                i = *(i + 0x1c)
            while (i != 0)
        else
            *(arg1 + 0xc)
    else
        if (r0_1 != 4)
            goto label_db854
        
        void* i_1 = *arg2
        i = *(arg1 + 0x10) + ((*(i_1 + 8) & not.d(0xffffffff << zx.d(*(arg1 + 7)))) << 5)
        
        while (*(i + 0x18) != 0x44 || *(i + 0x10) != i_1)
            i = *(i + 0x1c)
            
            if (i == 0)
                break

unimplemented  {vpop {d8}}
jump(arg3)
