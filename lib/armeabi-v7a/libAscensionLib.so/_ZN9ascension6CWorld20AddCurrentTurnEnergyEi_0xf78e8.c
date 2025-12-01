// 函数: _ZN9ascension6CWorld20AddCurrentTurnEnergyEi
// 地址: 0xf78e8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_2 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_header.program_header_offset:1)
int32_t r1 = *(arg1 + 0xb4c)

if (r0_2 != 0)
    *(r0_2 + 0xc) = r1

void* r0_3 = *(arg1 + 0xb20)
int32_t entry_r1
int32_t r1_1 = r1 + entry_r1
*(arg1 + 0xb4c) = r1_1
uint32_t r0_4 = zx.d(*(r0_3 + 8))
int32_t var_2c = 0xd
int32_t var_30 = 0x8000003
uint32_t var_28 = r0_4
int32_t var_24 = r1_1
int32_t var_20 = 0
core::CWorldBase::SendStateChange(arg1, &var_30)
int32_t r0_6 = *__stack_chk_guard

if (r0_6 == r0)
    return r0_6 - r0

__stack_chk_fail()
noreturn
