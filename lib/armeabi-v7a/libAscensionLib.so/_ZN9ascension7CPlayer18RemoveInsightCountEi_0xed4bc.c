// 函数: _ZN9ascension7CPlayer18RemoveInsightCountEi
// 地址: 0xed4bc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0_1 =
    core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), &__elf_program_headers[7])
int32_t r1_1 = *(arg1 + 0x8c)

if (r0_1 != 0)
    *(r0_1 + 0xc) = r1_1

int32_t entry_r1
int32_t r0_2 = r1_1 - entry_r1
int32_t result = r0_2 & not.d(r0_2 s>> 0x1f)
*(arg1 + 0x8c) = result
return result
