// 函数: _ZN9ascension19CCardInPlayInstance31CreateCardInPlayAbilityInstanceEPKNS_28CCardInPlayAbilityDefinitionE
// 地址: 0xea938
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
uint32_t r6 = *(arg1 + 4)
void** r0_1 = operator new(0x14)
*(r6 + 4) += 1
core::CInstance::CInstance(r0_1, r6)
r0_1[3] = arg1
int32_t entry_r1
r0_1[4] = entry_r1
*r0_1 = _vtable_for_ascension::CCardInPlayAbilityInstance + 8
core::CWorldBase::AddInstance(r6)
void** r0_6 = *(arg1 + 0x24)

if (r0_6 == *(arg1 + 0x28))
    std::__ndk1::vector<ascension::CCardInPlayAbilityInstance*, std::__ndk1::allocator<ascension::CCardInPlayAbilityInstance*> >::__push_back_slow_path<ascension::CCardInPlayAbilityInstance* const&>(
        arg1 + 0x20)
else
    *r0_6 = r0_1
    *(arg1 + 0x24) += 4

void* r0_11 = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 
    &__elf_symbol_table[0x1002].st_name:2)

if (r0_11 != 0)
    *(r0_11 + 0xc) = zx.d(r0_1[2].w)

int32_t r0_12 = *__stack_chk_guard

if (r0_12 == r0)
    return r0_12 - r0

__stack_chk_fail()
noreturn
