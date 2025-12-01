// 函数: _ZN9ascension6CWorld21ClearPlayedConstructsEv
// 地址: 0xf87e8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
void* result = *(entry_r0 + 0xb8c)

if (*(result + 0x18) s>= 1)
    do
        core::CCardStack::RemoveTopCard()
        result = *(entry_r0 + 0xb8c)
    while (*(result + 0x18) s> 0)

return result
