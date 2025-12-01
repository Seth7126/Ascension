// 函数: _ZN9ascension6CWorld22AddToBanishedCardCountEv
// 地址: 0xf89ac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t entry_r0
void* r0 = core::CWorldBase::AddRollbackData(entry_r0, 0, &__elf_header.flags:1)
int32_t r1 = *(entry_r0 + 0xb6c)

if (r0 != 0)
    *(r0 + 0xc) = r1

*(entry_r0 + 0xb6c) = r1 + 1
return r1 + 1
