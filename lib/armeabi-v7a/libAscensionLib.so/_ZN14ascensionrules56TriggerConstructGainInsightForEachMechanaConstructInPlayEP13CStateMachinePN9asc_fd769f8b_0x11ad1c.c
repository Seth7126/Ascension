// 函数: _ZN14ascensionrules56TriggerConstructGainInsightForEachMechanaConstructInPlayEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11ad1c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CInstance* r4 = *(arg3 + 0xc)
int32_t r0_1 = ascension::CPlayer::CountConstructsInPlay(r4, true, nullptr)
int32_t r5 = *(r4 + 4)
core::CInstance* r7 = r0_1 * arg5
core::CWorldBase::OutputMessageFormat(r5, "%s gains %d insight from %s\n", (*(*r4 + 0xc))(r4), r7, 
    (*(*arg3 + 0xc))(arg3))
int32_t var_28_1 = 0
ascension::CWorld::OutputAnimationInsight(r5, r7, r4, arg3)
ascension::CPlayer::AddInsightCount(r4)
int32_t result = *(r5 + 0xb20)

if (r4 == result)
    return ascension::CWorld::AddInsightGainedThisTurn(r5) __tailcall

return result
