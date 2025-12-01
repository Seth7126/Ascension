// 函数: sub_d3e50
// 地址: 0xd3e50
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* r6 = *(arg1 + 0x30)
int32_t* r5 = *(arg1 + 0x34)
void* r7 = *r6
sub_c3e78(r6, 0, 0)
sub_d541c(r6)
int32_t r0_2 = r6[5]

if (r0_2 + 1 u< 0x40000000)
    int32_t r0_4
    r0_4, r5 = sub_d14cc(r5, *(r7 + 0xc), *(r7 + 0x30) << 2, r0_2 << 2)
    *(r7 + 0xc) = r0_4
    int32_t r0_5 = r6[5]
    *(r7 + 0x30) = r0_5
    
    if (r0_5 + 1 u< 0x40000000)
        int32_t r0_7
        r0_7, r5 = sub_d14cc(r5, *(r7 + 0x14), *(r7 + 0x34) << 2, r0_5 << 2)
        *(r7 + 0x14) = r0_7
        *(r7 + 0x34) = r6[5]
        int32_t r0_9 = r6[8]
        
        if (r0_9 + 1 u< 0x10000000)
            int32_t r0_11
            r0_11, r5 = sub_d14cc(r5, *(r7 + 8), *(r7 + 0x2c) << 4, r0_9 << 4)
            *(r7 + 8) = r0_11
            *(r7 + 0x2c) = r6[8]
            int32_t r0_13 = r6[9]
            
            if (r0_13 + 1 u< 0x40000000)
                int32_t r0_15
                r0_15, r5 = sub_d14cc(r5, *(r7 + 0x10), *(r7 + 0x38) << 2, r0_13 << 2)
                *(r7 + 0x10) = r0_15
                *(r7 + 0x38) = r6[9]
                int32_t r0_17 = sx.d(r6[0xb].w)
                
                if (r0_17 + 1 u< 0x15555556)
                    int32_t r0_21
                    int32_t* r5_1
                    r0_21, r5_1 = sub_d14cc(r5, *(r7 + 0x18), *(r7 + 0x3c) * 0xc, r0_17 * 0xc)
                    *(r7 + 0x18) = r0_21
                    int32_t r2_11 = *(r7 + 0x28)
                    int32_t r1_10 = *(r7 + 0x1c)
                    *(r7 + 0x3c) = sx.d(r6[0xb].w)
                    int32_t r0_25
                    void* r4_1
                    int32_t* r5_2
                    r0_25, r4_1, r5_2 = sub_d14cc(r5_1, r1_10, r2_11 << 3, zx.d(*(r6 + 0x2f)) << 3)
                    *(r7 + 0x1c) = r0_25
                    *(r7 + 0x28) = zx.d(*(r6 + 0x2f))
                    int32_t r0_28 = *(r4_1 + 0x10) & 0xfffffffe
                    *(r4_1 + 0x30) = r6[2]
                    
                    if (r0_28 == 0x120)
                        void* r0_29 = *(r4_1 + 0x18)
                        sub_ce954(r4_1, r0_29 + 0x10, *(r0_29 + 0xc))
                    
                    void* r1_13 = r5_2[3]
                    r5_2[2] -= 0x10
                    int32_t result = *(r1_13 + 0xc)
                    
                    if (result s< 1)
                        return result
                    
                    return sub_cc158(r5_2) __tailcall

sub_d14b4(r5)
noreturn
