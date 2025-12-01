// 函数: _ZN9ascension6CWorld16RemovePlayedCardEPN4core13CCardInstanceE
// 地址: 0xf7f24
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r6 = *(arg1 + 0xb84) - *(arg1 + 0xb80)
void* r0_3 =
    core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[0].physical_address:1)

if (r0_3 != 0)
    int32_t r1_1 = r6 s>> 3
    *(r0_3 + 0xc) = r1_1
    void* r12_1
    
    if (r6 s<= 0)
        r12_1 = r0_3 + 0x10
    else
        int32_t r7_1 = *(arg1 + 0xb80)
        r12_1 = r0_3 + 0x10
        int32_t r6_1 = 0
        
        do
            void* r2_1 = r0_3 + (r6_1 << 3)
            int32_t* r3_2 = r7_1 + (r6_1 << 3)
            r6_1 += 1
            *(r2_1 + 0x10) = zx.d(*(*r3_2 + 8))
            *(r2_1 + 0x14) = r3_2[1]
        while (r6_1 s< r1_1)
    
    void* r12_2 = r12_1 + (r1_1 << 3)
    *r12_2 = 0
    *(r12_2 + 4) = 0

int32_t* r6_2 = *(arg1 + 0xb80)
int32_t r1_2 = *(arg1 + 0xb84)

if (r1_2 != r6_2)
    int32_t r0_4 = 0
    
    do
        void* entry_r1
        
        if (zx.d(*(*r6_2 + 8)) == zx.d(*(entry_r1 + 8)))
            int32_t var_34_1 = 0x2b
            int32_t var_38 = 0x8000003
            int32_t var_30_1 = 3
            int32_t var_2c_1 = r0_4
            int32_t var_28_1 = 0
            core::CWorldBase::SendStateChange(arg1, &var_38)
            int32_t r0_6 = *(arg1 + 0xb84)
            
            if (r0_6 != &r6_2[2])
                __aeabi_memmove4(r6_2)
            
            *(arg1 + 0xb84) = &r6_2[((r0_6 - &r6_2[2]) s>> 3) * 2]
            break
        
        r6_2 = &r6_2[2]
        r0_4 += 1
    while (r1_2 != r6_2)

int32_t r0_9 = *__stack_chk_guard

if (r0_9 == r0)
    return r0_9 - r0

__stack_chk_fail()
noreturn
