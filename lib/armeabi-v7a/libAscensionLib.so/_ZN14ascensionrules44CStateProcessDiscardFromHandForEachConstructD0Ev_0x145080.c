// 函数: _ZN14ascensionrules44CStateProcessDiscardFromHandForEachConstructD0Ev
// 地址: 0x145080
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void** entry_r0
*entry_r0 = _vtable_for_ascensionrules::CStateProcessDiscardFromHandForEachConstruct + 8
void* r0_1 = entry_r0[0xaa]
entry_r0[0x96] = _vtable_for_ascension::CEventPreventDestroyConstruct + 8

if (r0_1 != 0)
    entry_r0[0xab] = r0_1
    operator delete(r0_1)

ascension::CEvent::~CEvent()
return operator delete(CGameStateOptions::~CGameStateOptions()) __tailcall
