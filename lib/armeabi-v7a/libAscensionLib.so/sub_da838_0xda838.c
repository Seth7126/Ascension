// 函数: sub_da838
// 地址: 0xda838
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = arg3[2]
int32_t r1
int32_t r12
int128_t q0

if (r0 == 3)
    q0:8.q = 0x4338000000000000
    q0.q = *arg3
    q0:8.q = q0.q f+ q0:8.q
    int32_t var_28_1 = q0:8.d
    q0:8.d = var_28_1
    unimplemented  {vcvt.f64.s32 d1, s2}
    
    if (var_28_1 s< 1)
    label_da8b4:
        void* r0_3
        int32_t r2
        r0_3, r2, q0 = sub_db4d8(arg2, arg3)
        void* r7_1 = r0_3
        
        while (true)
            int32_t r0_5 = *(r7_1 + 0x18)
            
            if (r0_5 == arg3[2])
                uint32_t r0_4
                r0_4, r2, q0 = sub_df0d4(nullptr, r7_1 + 0x10, arg3)
                
                if (r0_4 != 0)
                label_da930:
                    r1 = *(arg2 + 0x1c)
                    r12 = r1 + ((r7_1 - *(arg2 + 0x10)) s>> 5)
                    break
                    break
                
                r0_5 = *(r7_1 + 0x18)
            
            if (r0_5 == 0xb && (zx.d(arg3[2].b) & 0x40) != 0 && *(r7_1 + 0x10) == *arg3)
                goto label_da930
            
            r7_1 = *(r7_1 + 0x1c)
            
            if (r7_1 == 0)
                sub_c89f0(arg1, "invalid key to 'next'", r2)
                noreturn
    else
        unimplemented  {vcmp.f64 d0, d1}
        unimplemented  {vmrs apsr_nzcv, fpscr}
        
        if (var_28_1 != 1)
            goto label_da8b4
        
        r1 = *(arg2 + 0x1c)
        
        if (var_28_1 s> r1)
            goto label_da8b4
        
        r12 = var_28_1 - 1
else
    if (r0 != 0)
        goto label_da8b4
    
    r1 = *(arg2 + 0x1c)
    r12 = 0xffffffff

int32_t r7_2 = r12 + 1
int32_t r0_11 = r12 << 4
int32_t r3 = 0
int32_t r0_13

while (true)
    if (r7_2 s>= r1)
        uint32_t r2_6 = zx.d(*(arg2 + 7))
        int32_t r7_3 = r7_2 - r1
        
        if (r7_3 s>= 1 << (r2_6 & 0xff))
            return 0
        
        void* r6_3
        
        while (true)
            r6_3 = *(arg2 + 0x10) + ((r12 - r1) << 5) + r3
            
            if (*(r6_3 + 0x28) != 0)
                break
            
            r7_3 += 1
            r3 += 0x20
            
            if (r7_3 s>= 1 << r2_6)
                return 0
        
        int32_t r2_9 = *(r6_3 + 0x34)
        *arg3 = *(r6_3 + 0x30)
        arg3[1] = r2_9
        arg3[2] = *(r6_3 + 0x38)
        void* r0_19 = *(arg2 + 0x10) + (r12 << 5) - (r1 << 5) + r3
        int32_t r1_8 = *(r0_19 + 0x20)
        arg3[5] = *(r0_19 + 0x24)
        arg3[4] = r1_8
        r0_13 = *(r0_19 + 0x28)
        break
    
    r7_2 += 1
    r3 += 0x20
    void* r2_3 = *(arg2 + 0xc) + r0_11
    r0_11 += 0x10
    
    if (*(r2_3 + 0x18) != 0)
        q0.d = r7_2
        unimplemented  {vcvt.f64.s32 d0, s0}
        arg3[2] = 3
        *arg3 = q0.q
        int32_t* r1_6 = *(arg2 + 0xc) + r0_11
        int32_t r0_12 = *r1_6
        arg3[5] = r1_6[1]
        arg3[4] = r0_12
        r0_13 = r1_6[2]
        break

arg3[6] = r0_13
return 1
