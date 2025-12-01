// 函数: _ZN9ascension6CWorld18AddCurrentTurnLifeEi
// 地址: 0xf7988
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_header.program_header_offset:2)
int32_t r1 = *(arg1 + 0xb50)

if (r0 != 0)
    *(r0 + 0xc) = r1

int32_t entry_r1
int32_t result = r1 + entry_r1
*(arg1 + 0xb50) = result
return result
