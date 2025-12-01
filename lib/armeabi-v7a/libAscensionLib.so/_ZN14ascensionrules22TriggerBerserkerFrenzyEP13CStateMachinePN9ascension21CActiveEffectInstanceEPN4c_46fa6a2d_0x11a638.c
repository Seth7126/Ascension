// 函数: _ZN14ascensionrules22TriggerBerserkerFrenzyEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11a638
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = *(arg4 + 4)

if (result == 0x1c)
    ascension::CPlayer* r7_1 = *(arg4 + 0x4c)
    result = ascension::CWorld::HasPlayedActiveEffect(*(r7_1 + 4))
    
    if (result == 0)
        ascensionrules::CreateStateMayDoubleHonorGain(r7_1, arg4, arg2)
        return CStateMachine::PushListState(arg1) __tailcall

return result
