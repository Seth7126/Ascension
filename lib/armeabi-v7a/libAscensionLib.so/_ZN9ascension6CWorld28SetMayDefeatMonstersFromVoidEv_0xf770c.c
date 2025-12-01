// 函数: _ZN9ascension6CWorld28SetMayDefeatMonstersFromVoidEv
// 地址: 0xf770c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t entry_r0
void* r0 = core::CWorldBase::AddRollbackData(entry_r0, 0, &__elf_header.version:2)

if (r0 != 0)
    *(r0 + 0xc) = zx.d(*(entry_r0 + 0xb34))

*(entry_r0 + 0xb34) = 1
return 1
