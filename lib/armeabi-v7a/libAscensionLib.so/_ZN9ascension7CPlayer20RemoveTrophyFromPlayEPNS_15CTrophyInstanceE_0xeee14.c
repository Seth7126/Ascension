// 函数: _ZN9ascension7CPlayer20RemoveTrophyFromPlayEPNS_15CTrophyInstanceE
// 地址: 0xeee14
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t* i_1 = *(arg1 + 0x60)
int32_t r0_1 = *(arg1 + 0x64)
int32_t result

if (r0_1 == i_1)
    result = 0
else
    uint32_t r6_1 = *(arg1 + 4)
    void* entry_r1
    int32_t r5_1
    
    if (*i_1 == entry_r1)
        r5_1 = 0
    label_eeeac:
        void* r0_3 = core::CWorldBase::AddRollbackData(r6_1, zx.d(*(arg1 + 8)), 
            &__elf_program_headers[7].file_size:2)
        
        if (r0_3 != 0)
            *(r0_3 + 0xc) = zx.d(*(entry_r1 + 8))
            *(r0_3 + 0x10) = r5_1
        
        int32_t* i = *(entry_r1 + 0x14)
        
        while (i != *(entry_r1 + 0x18))
            *i
            i = &i[1]
            ascension::CWorld::RemoveActiveEffect(r6_1)
        
        int32_t r0_6 = *(arg1 + 0x64)
        
        if (r0_6 != &i_1[1])
            __aeabi_memmove4(i_1)
        
        *(arg1 + 0x64) = &i_1[(r0_6 - &i_1[1]) s>> 2]
        void* var_28_1 = entry_r1
        void** r0_9 = *(arg1 + 0x70)
        
        if (r0_9 u>= *(arg1 + 0x74))
            std::__ndk1::vector<core::CInstance*, std::__ndk1::allocator<core::CInstance*> >::__push_back_slow_path<core::CInstance*>(
                arg1 + 0x6c)
        else
            *r0_9 = entry_r1
            *(arg1 + 0x70) += 4
        
        int32_t var_30_1 = 0
        ascension::CWorld::OutputEvent(r6_1, 6, zx.d(*(entry_r1 + 8)), zx.d(*(arg1 + 8)))
        result = 1
    else
        result = 0
        r5_1 = 0
        
        while (r0_1 - 4 != i_1)
            void* i_2 = &i_1[1]
            r5_1 += 1
            bool cond:0_1 = i_1[1] != entry_r1
            i_1 = i_2
            
            if (not(cond:0_1))
                i_1 = i_2
                goto label_eeeac

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
