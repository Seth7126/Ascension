// 函数: _ZN14ascensionrules33CStateProcessDiscardMultipleCardsD1Ev
// 地址: 0x143aa0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void** entry_r0
*entry_r0 = _vtable_for_ascensionrules::CStateProcessDiscardMultipleCards + 8
void* r0_1 = entry_r0[0xb0]
entry_r0[0x9b] = _vtable_for_ascension::CEventDiscardCardsFromHand + 8

if (r0_1 != 0)
    entry_r0[0xb1] = r0_1
    operator delete(r0_1)

ascension::CEvent::~CEvent()
return CGameStateOptions::~CGameStateOptions() __tailcall
