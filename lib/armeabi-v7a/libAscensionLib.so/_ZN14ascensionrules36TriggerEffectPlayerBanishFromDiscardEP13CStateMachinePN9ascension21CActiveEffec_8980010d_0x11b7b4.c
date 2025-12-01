// 函数: _ZN14ascensionrules36TriggerEffectPlayerBanishFromDiscardEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11b7b4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3 = *(arg2 + 0x14)
ascension::CPlayer* r0 = nullptr

if (r3 != 0)
    r0 = __dynamic_cast(r3, _typeinfo_for_core::CInstance, _typeinfo_for_ascension::CPlayer, 0)

ascensionrules::CreateStateProcessBanishFromHandOrDiscardOrSource(r0, arg5, false, true, false, 0, 
    nullptr, nullptr, nullptr, nullptr, 0)
return CStateMachine::PushListState(arg1) __tailcall
