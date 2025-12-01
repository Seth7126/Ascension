// 函数: _ZN9ascension7CPlayer17RemoveHonorTokensEi
// 地址: 0xed584
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0_1 = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 
    &__elf_program_headers[7].type:1)
int32_t r1_1 = *(arg1 + 0x90)

if (r0_1 != 0)
    *(r0_1 + 0xc) = r1_1

int32_t entry_r1
int32_t r0_2 = r1_1 - entry_r1
int32_t result = r0_2 & not.d(r0_2 s>> 0x1f)
*(arg1 + 0x90) = result
return result
