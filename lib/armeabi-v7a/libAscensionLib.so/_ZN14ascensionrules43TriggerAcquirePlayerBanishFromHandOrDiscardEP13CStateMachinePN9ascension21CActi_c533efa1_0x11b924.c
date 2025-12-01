// 函数: _ZN14ascensionrules43TriggerAcquirePlayerBanishFromHandOrDiscardEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11b924
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = *(arg4 + 4)

if (result != 0x12)
    return result

ascensionrules::CreateStateProcessBanishFromHandOrDiscardOrSource(*(arg4 + 0x4c), arg5, true, true, 
    false, 0, nullptr, nullptr, nullptr, nullptr, 0)
return CStateMachine::PushListState(arg1) __tailcall
