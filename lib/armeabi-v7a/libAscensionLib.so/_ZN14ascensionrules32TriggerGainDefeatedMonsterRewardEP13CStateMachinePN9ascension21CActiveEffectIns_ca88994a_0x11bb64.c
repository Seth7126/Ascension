// 函数: _ZN14ascensionrules32TriggerGainDefeatedMonsterRewardEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11bb64
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* result = *(arg4 + 4)

if (result == 0x1b)
    core::CInstance* r4_1 = *(arg4 + 0x50)
    result = *(r4_1 + 0xc)
    ascension::CEffect* r2 = *(result + 0xec)
    
    if (r2 != 0)
        ascension::CPlayer* r1 = *(arg4 + 0x4c)
        ascensionrules::CreateStateProcessCardEffect(*(r1 + 4), r1, r2, r4_1, arg4, nullptr, 0)
        return CStateMachine::PushListState(arg1) __tailcall

return result
