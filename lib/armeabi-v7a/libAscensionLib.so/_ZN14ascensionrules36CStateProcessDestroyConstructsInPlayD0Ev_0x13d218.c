// 函数: _ZN14ascensionrules36CStateProcessDestroyConstructsInPlayD0Ev
// 地址: 0x13d218
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void** entry_r0
*entry_r0 = _vtable_for_ascensionrules::CStateProcessDestroyConstructsInPlay + 8
void* r0_1 = entry_r0[0xab]
entry_r0[0x97] = _vtable_for_ascension::CEventPreventDestroyConstruct + 8

if (r0_1 != 0)
    entry_r0[0xac] = r0_1
    operator delete(r0_1)

ascension::CEvent::~CEvent()
return operator delete(CGameStateOptions::~CGameStateOptions()) __tailcall
