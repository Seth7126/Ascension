// 函数: _ZN9ascension6CWorld22RemoveCurrentTurnDeathEi
// 地址: 0xf7b20
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_header.program_header_offset:3)
int32_t r1 = *(arg1 + 0xb54)

if (r0 != 0)
    *(r0 + 0xc) = r1

int32_t entry_r1
int32_t r0_1 = r1 - entry_r1
int32_t result = r0_1 & not.d(r0_1 s>> 0x1f)
*(arg1 + 0xb54) = result
return result
