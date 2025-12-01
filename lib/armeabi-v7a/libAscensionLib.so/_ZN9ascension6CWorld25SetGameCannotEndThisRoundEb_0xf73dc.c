// 函数: _ZN9ascension6CWorld25SetGameCannotEndThisRoundEb
// 地址: 0xf73dc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r5 = arg1
void* result = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_header.header_size:1)

if (result != 0)
    *(result + 0xc) = zx.d(*(r5 + 0xb1c))

char entry_r1
*(r5 + 0xb1c) = entry_r1
return result
