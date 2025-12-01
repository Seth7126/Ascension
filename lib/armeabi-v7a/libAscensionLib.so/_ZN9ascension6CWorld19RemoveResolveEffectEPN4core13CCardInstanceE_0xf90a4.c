// 函数: _ZN9ascension6CWorld19RemoveResolveEffectEPN4core13CCardInstanceE
// 地址: 0xf90a4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t* i = *(arg1 + 0xbd8)
int32_t r0_1 = *(arg1 + 0xbdc)
int32_t result
int32_t entry_r1

if (r0_1 == i)
    result = 0
else
    int32_t r7_1
    
    if (*i == entry_r1)
        r7_1 = 0
    label_f9138:
        void* r0_3 =
            core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[0].memory_size:1)
        
        if (r0_3 != 0)
            int32_t r1 = *(arg1 + 0xbdc)
            *(r0_3 + 0xc) = zx.d(*(*(r1 - 8) + 8))
            int32_t r2_5 = *(r1 - 4)
            *(r0_3 + 0x14) = r7_1.w
            *(r0_3 + 0x10) = r2_5
            *(r0_3 + 0x16) = ((r1 - *(arg1 + 0xbd8)) u>> 3).w
        
        int32_t var_34_1 = 0x2c
        int32_t var_38 = 0x8000003
        int32_t var_30_1 = 2
        int32_t var_2c_1 = r7_1
        int32_t var_28_1 = 0
        core::CWorldBase::SendStateChange(arg1, &var_38)
        int32_t r0_5 = *(arg1 + 0xbdc)
        
        if (r0_5 != &i[2])
            __aeabi_memmove4(i)
        
        *(arg1 + 0xbdc) = &i[((r0_5 - &i[2]) s>> 3) * 2]
        result = 1
    else
        result = 0
        r7_1 = 0
        
        while (r0_1 - 8 != i)
            void* i_1 = &i[2]
            r7_1 += 1
            bool cond:1_1 = i[2] != entry_r1
            i = i_1
            
            if (not(cond:1_1))
                i = i_1
                goto label_f9138

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
