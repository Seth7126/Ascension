// 函数: _ZNSt6__ndk16vectorIN9ascension14CPlayerTurnLogENS_9allocatorIS2_EEE21__push_back_slow_pathIRKS2_EEvOT_
// 地址: 0xf0cc8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayerTurnLog const& r5 = *arg1
void* r3 = arg1[1]
void* r6 = 0x9249249
void* r4 = ((r3 - r5) s>> 2) * 0xb6db6db7
void* r0_2 = r4 + 1
void* var_34
void* var_2c

if (r0_2 u> 0x9249249)
    std::__ndk1::__vector_base_common<true>::__throw_length_error()
else
    int32_t r1 = ((arg1[2] - r5) s>> 2) * 0xb6db6db7
    
    if (r1 u<= 0x4924923)
        if (r0_2 u<= r1 << 1)
            r0_2 = r1 << 1
        
        r6 = r0_2
    
    void* var_30_1
    void* r9_1
    
    if (r1 u<= 0x4924923 && r0_2 == 0)
        r9_1 = nullptr
        var_30_1 = nullptr
    else
        var_30_1 = r6
        r9_1 = operator new(r6 * 0x1c)
    
    int32_t* entry_r1
    int32_t r1_1 = entry_r1[1]
    int32_t r2_4 = entry_r1[2]
    int16_t r3_1 = entry_r1[3].w
    var_2c = r9_1
    int32_t* r9_2 = r9_1 + r4 * 0x1c
    *r9_2 = *entry_r1
    r9_2[3].w = r3_1
    r9_2[1] = r1_1
    r9_2[2] = r2_4
    r6 = &r9_2[4]
    *r6 = 0
    r9_2[5] = 0
    r9_2[6] = 0
    int32_t r2_5 = entry_r1[4]
    int32_t r0_6 = entry_r1[5]
    uint32_t r7_1 = r0_6 - r2_5
    
    if (r0_6 == r2_5)
    label_f0e14:
        void* r1_6 = var_2c + var_30_1 * 0x1c
        
        if (r3 == r5)
            *arg1 = r9_2
            arg1[1] = &r9_2[7]
            arg1[2] = r1_6
            
            if (r5 == 0)
                return r3
        else
            int32_t i = 0
            
            do
                void* r8_1 = r9_2 + i
                void* r6_4 = r3 + i
                int32_t r2_10 = *(r6_4 - 0x1c)
                int32_t r12_1 = *(r6_4 - 0x18)
                int32_t lr_2 = *(r6_4 - 0x14)
                *(r8_1 - 0x10) = *(r6_4 - 0x10)
                *(r8_1 - 0x1c) = r2_10
                *(r8_1 - 0x18) = r12_1
                *(r8_1 - 0x14) = lr_2
                void* r2_11 = r9_2 - 4 + i
                *(r2_11 - 8) = 0
                *(r2_11 - 4) = 0
                *(r9_2 - 4 + i) = 0
                *(r2_11 - 8) = *(r3 - 0xc + i)
                *(r2_11 - 4) = *(r3 - 8 + i)
                *(r9_2 - 4 + i) = *(r3 - 4 + i)
                *(r3 - 4 + i) = 0
                *(r3 - 8 + i) = 0
                *(r3 - 0xc + i) = 0
                i -= 0x1c
            while (r5 - r3 != i)
            
            r5 = *arg1
            int32_t r1_7 = arg1[1]
            *arg1 = r9_2 + i
            arg1[1] = &r9_2[7]
            void* r0_16 = r1_6
            arg1[2] = r0_16
            
            if (r1_7 != r5)
                bool cond:4_1
                
                do
                    r0_16 = *(r1_7 - 0xc)
                    
                    if (r0_16 != 0)
                        *(r1_7 - 8) = r0_16
                        r0_16 = operator delete(r0_16)
                    
                    cond:4_1 = r5 != r1_7 - 0x1c
                    r1_7 -= 0x1c
                while (cond:4_1)
            
            if (r5 == 0)
                return r0_16
        
        return operator delete(r5) __tailcall
    
    int32_t r0_7 = r7_1 s>> 3
    var_34 = &r9_2[5]
    
    if (r0_7 u< 0x20000000)
        int32_t r0_9 = operator new(r7_1)
        *var_34 = r0_9
        *r6 = r0_9
        r9_2[6] = r0_9 + (r0_7 << 3)
        
        if (r7_1 s>= 1)
            __aeabi_memcpy4(r0_9, r2_5, r7_1)
            *var_34 = r0_9 + r7_1
        
        goto label_f0e14

int32_t r0_24 = std::__ndk1::__vector_base_common<true>::__throw_length_error()
void* r0_25 = *r6

if (r0_25 != 0)
    *var_34 = r0_25
    operator delete(r0_25)

operator delete(var_2c)
sub_1a86c0(r0_24)
noreturn
