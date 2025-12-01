// 函数: _ZN9ascension18CConstructInstance30CreateConstructAbilityInstanceEPKNS_7CEffectE
// 地址: 0xe50c4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
uint32_t r7 = *(arg1 + 4)
void** r0_1 = operator new(0x18)
*(r7 + 4) += 1
core::CInstance::CInstance(r0_1, r7)
*r0_1 = _vtable_for_ascension::CConstructAbilityInstance + 8
r0_1[3] = arg1
r0_1[4] = 0
int32_t entry_r1
r0_1[5] = entry_r1
core::CWorldBase::AddInstance(r7)
void*** r0_6 = *(arg1 + 0x40)

if (r0_6 == *(arg1 + 0x44))
    std::__ndk1::vector<ascension::CConstructAbilityInstance*, std::__ndk1::allocator<ascension::CConstructAbilityInstance*> >::__push_back_slow_path<ascension::CConstructAbilityInstance* const&>(
        arg1 + 0x3c)
else
    *r0_6 = r0_1
    *(arg1 + 0x40) += 4

void* r0_11 = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 
    &__elf_symbol_table[2].st_name:1)

if (r0_11 != 0)
    *(r0_11 + 0xc) = zx.d(r0_1[2].w)

int32_t r0_12 = *__stack_chk_guard

if (r0_12 == r0)
    return r0_12 - r0

__stack_chk_fail()
noreturn
