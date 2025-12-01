// 函数: _ZN14ascensionrules50TriggerGainHonorForAcquiredCardIfThisHasntBeenUsedEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11a508
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* result = *(arg4 + 4)

if (result == 0x12)
    result = *(arg4 + 0x50)
    
    if (result != 0)
        ascension::CPlayer* r6_1 = *(arg2 + 0x14)
        void* r7_1 = *(result + 0xc)
        result = ascension::CWorld::HasPlayedActiveEffect(*(r6_1 + 4))
        
        if (result == 0)
            ascensionrules::CreateStateGainHonor(r6_1, *(arg2 + 0x10), *(r7_1 + 0xa4), false, 
                nullptr, 0)
            return CStateMachine::PushListState(arg1) __tailcall

return result
