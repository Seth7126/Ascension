// 函数: _ZN14ascensionrules31TriggerGainHonorForAcquiredCardEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11a49c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* result = *(arg4 + 4)

if (result == 0x12)
    result = *(arg4 + 0x50)
    
    if (result != 0)
        core::CInstance* r6
        ascension::CPlayer* r7
        r7:r6 = *(arg2 + 0x10)
        ascensionrules::CreateStateGainHonor(r7, r6, *(*(result + 0xc) + 0xa4), false, nullptr, 0)
        return CStateMachine::PushListState(arg1) __tailcall

return result
