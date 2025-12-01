// 函数: _ZN14ascensionrules40TriggerMayRecoverCardFromDiscardIntoHandEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11b5d4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *(arg2 + 0x14)
ascension::CPlayer* r0_1

if (r0 == 0)
    r0_1 = nullptr
else
    r0_1 = __dynamic_cast(r0, _typeinfo_for_core::CInstance, _typeinfo_for_ascension::CPlayer, 0)

ascensionrules::CreateStateRecoverCardFromDiscardPile(r0_1, 0, 0, nullptr)
return CStateMachine::PushListState(arg1) __tailcall
