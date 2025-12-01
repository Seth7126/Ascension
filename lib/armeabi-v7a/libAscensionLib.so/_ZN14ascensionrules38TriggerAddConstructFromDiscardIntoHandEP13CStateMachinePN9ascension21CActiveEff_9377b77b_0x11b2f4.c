// 函数: _ZN14ascensionrules38TriggerAddConstructFromDiscardIntoHandEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11b2f4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg4 == 0)
    return 

ascension::CPlayer* r0_1 = __dynamic_cast(arg4, _typeinfo_for_ascension::CEvent, 
    _typeinfo_for_ascension::CEventPutConstructIntoPlay, 0)

if (r0_1 == 0)
    return 

r0_1 = *(r0_1 + 0x4c)

if (r0_1 != 0)
    ascensionrules::CreateStateRecoverConstructFromDiscardPile(r0_1, false, 0)
    return CStateMachine::PushListState(arg1) __tailcall
