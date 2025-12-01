// 函数: _ZN14ascensionrules27TriggerConstructGainInsightEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11ac70
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* r5 = *(arg3 + 0xc)
char* r4 = r5[1]
core::CWorldBase::OutputMessageFormat(r4, "%s gains %d insight from %s\n", (*(*r5 + 0xc))(r5), 
    arg5, (*(*arg3 + 0xc))(arg3))
int32_t var_28_1 = 0
ascension::CWorld::OutputAnimationInsight(r4, arg5, r5, arg3)
ascension::CPlayer::AddInsightCount(r5)
int32_t result = *(r4 + 0xb20)

if (r5 == result)
    return ascension::CWorld::AddInsightGainedThisTurn(r4) __tailcall

return result
