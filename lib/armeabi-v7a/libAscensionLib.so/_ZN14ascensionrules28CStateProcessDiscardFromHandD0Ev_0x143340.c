// 函数: _ZN14ascensionrules28CStateProcessDiscardFromHandD0Ev
// 地址: 0x143340
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void** entry_r0
*entry_r0 = _vtable_for_ascensionrules::CStateProcessDiscardFromHand + 8
void* r0_1 = entry_r0[0xac]
entry_r0[0x97] = _vtable_for_ascension::CEventDiscardCardsFromHand + 8

if (r0_1 != 0)
    entry_r0[0xad] = r0_1
    operator delete(r0_1)

ascension::CEvent::~CEvent()
return operator delete(CGameStateOptions::~CGameStateOptions()) __tailcall
