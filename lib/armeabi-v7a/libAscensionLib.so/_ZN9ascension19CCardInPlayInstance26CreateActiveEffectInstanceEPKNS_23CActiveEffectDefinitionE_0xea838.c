// 函数: _ZN9ascension19CCardInPlayInstance26CreateActiveEffectInstanceEPKNS_23CActiveEffectDefinitionE
// 地址: 0xea838
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
ascension::CActiveEffectInstance* r4 = *(arg1 + 4)
core::CWorldBase* r0_1 = operator new(0x150)
ascension::CActiveEffectDefinition* r2 = *(r4 + 4)
*(r4 + 4) = r2 + 1
int32_t var_2c = *(arg1 + 0xc)
core::CInstance* entry_r1
ascension::CActiveEffectInstance::CActiveEffectInstance(r0_1, r4, r2, entry_r1, arg1)
core::CWorldBase::AddInstance(r4)
int32_t* r0_6 = *(arg1 + 0x18)

if (r0_6 == *(arg1 + 0x1c))
    std::__ndk1::vector<ascension::CActiveEffectInstance*, std::__ndk1::allocator<ascension::CActiveEffectInstance*> >::__push_back_slow_path<ascension::CActiveEffectInstance* const&>(
        arg1 + 0x14)
else
    *r0_6 = r0_1
    *(arg1 + 0x18) += 4

void* r0_11 = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 
    &__elf_symbol_table[0x1002].st_name:1)

if (r0_11 != 0)
    *(r0_11 + 0xc) = zx.d(*(r0_1 + 8))

ascension::CWorld::AddActiveEffect(r4)
int32_t r0_13 = *__stack_chk_guard

if (r0_13 == r0)
    return r0_13 - r0

__stack_chk_fail()
noreturn
