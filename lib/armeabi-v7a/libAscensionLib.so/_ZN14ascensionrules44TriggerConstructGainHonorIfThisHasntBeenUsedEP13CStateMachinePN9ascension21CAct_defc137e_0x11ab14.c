// 函数: _ZN14ascensionrules44TriggerConstructGainHonorIfThisHasntBeenUsedEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11ab14
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r5 = *(arg3 + 0xc)
int32_t result = ascension::CWorld::HasPlayedActiveEffect(*(r5 + 4))

if (result != 0)
    return result

ascensionrules::CreateStateGainHonor(r5, *(arg2 + 0x10), arg5, false, nullptr, 0)
return CStateMachine::PushListState(arg1) __tailcall
