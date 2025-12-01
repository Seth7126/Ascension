// 函数: _ZN9ascension18CCenterRowInstance19CreateActiveEffectsEPN4core13CCardInstanceE
// 地址: 0xeb15c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
core::CInstance* entry_r1

if (entry_r1 != 0)
    void* r9_1 = *(entry_r1 + 0xc)
    int32_t* r10_1 = *(r9_1 + 0x124)
    int32_t r0_1 = *(r9_1 + 0x128)
    
    if (r10_1 != r0_1)
        uint32_t r6_1 = *(arg1 + 4)
        
        do
            core::CInstance* r7_1 = *r10_1
            int32_t r1_1 = *(r7_1 + 0x10)
            bool cond:1_1 = r1_1 s> 1
            
            if (r1_1 s>= 1)
                cond:1_1 = *(r6_1 + 0x30) s> r1_1
            
            if (not(cond:1_1))
                int32_t r1_2 = *(r7_1 + 0x14)
                
                if (r1_2 s< 1 || *(r6_1 + 0x30) s>= r1_2)
                    core::CWorldBase* r0_2 = operator new(0x150)
                    ascension::CActiveEffectDefinition* r2_3 = *(r6_1 + 4)
                    *(r6_1 + 4) = r2_3 + 1
                    core::CCardInstance* var_34_1 = arg1
                    ascension::CActiveEffectInstance::CActiveEffectInstance(r0_2, r6_1, r2_3, r7_1, 
                        entry_r1)
                    core::CWorldBase::AddInstance(r6_1)
                    core::CWorldBase** r0_6 = *(arg1 + 0x1c)
                    
                    if (r0_6 == *(arg1 + 0x20))
                        std::__ndk1::vector<ascension::CActiveEffectInstance*, std::__ndk1::allocator<ascension::CActiveEffectInstance*> >::__push_back_slow_path<ascension::CActiveEffectInstance* const&>(
                            arg1 + 0x18)
                    else
                        *r0_6 = r0_2
                        *(arg1 + 0x1c) += 4
                    
                    void* r0_11 = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 
                        &__elf_symbol_table[0x23].st_name:2)
                    
                    if (r0_11 != 0)
                        *(r0_11 + 0xc) = zx.d(*(r0_2 + 8))
                    
                    ascension::CWorld::AddActiveEffect(r6_1)
                    r0_1 = *(r9_1 + 0x128)
            
            r10_1 = &r10_1[1]
        while (r10_1 != r0_1)

int32_t r0_13 = *__stack_chk_guard

if (r0_13 == r0)
    return r0_13 - r0

__stack_chk_fail()
noreturn
