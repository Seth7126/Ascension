// 函数: _ZN9ascension6CWorld25AddToDefeatedMonsterCountEv
// 地址: 0xf89e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t entry_r0
void* r0 = core::CWorldBase::AddRollbackData(entry_r0, 0, &__elf_header.flags:2)
int32_t r1 = *(entry_r0 + 0xb7c)

if (r0 != 0)
    *(r0 + 0xc) = r1

*(entry_r0 + 0xb7c) = r1 + 1
return r1 + 1
