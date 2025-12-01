// 函数: _ZN9ascension6CWorld19AddCurrentTurnPowerEi
// 地址: 0xf78ac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_header.program_header_offset)
int32_t r1 = *(arg1 + 0xb48)

if (r0 != 0)
    *(r0 + 0xc) = r1

int32_t entry_r1
int32_t result = r1 + entry_r1
*(arg1 + 0xb48) = result
return result
