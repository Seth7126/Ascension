// 函数: _ZN9ascension7CPlayer14AddPendingDrawEv
// 地址: 0xef120
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
void* r0_1 = core::CWorldBase::AddRollbackData(*(entry_r0 + 4), zx.d(*(entry_r0 + 8)), 
    &__elf_program_headers[7].offset)
int32_t r1_1 = *(entry_r0 + 0xa0)

if (r0_1 != 0)
    *(r0_1 + 0xc) = r1_1

*(entry_r0 + 0xa0) = r1_1 + 1
return r1_1 + 1
