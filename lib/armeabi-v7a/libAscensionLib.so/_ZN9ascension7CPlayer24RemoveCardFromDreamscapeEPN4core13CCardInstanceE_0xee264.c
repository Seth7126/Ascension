// 函数: _ZN9ascension7CPlayer24RemoveCardFromDreamscapeEPN4core13CCardInstanceE
// 地址: 0xee264
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r0_2 = *(arg1 + 0x44)

if (r0_2 == 0)
    return 0

return core::CCardStack::RemoveCard(r0_2) __tailcall
