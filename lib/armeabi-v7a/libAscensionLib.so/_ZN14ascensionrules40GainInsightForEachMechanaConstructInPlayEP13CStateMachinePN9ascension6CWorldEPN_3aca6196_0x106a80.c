// 函数: _ZN14ascensionrules40GainInsightForEachMechanaConstructInPlayEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x106a80
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CInstance* r0_1 = ascension::CPlayer::CountConstructsInPlay(arg3, true, nullptr)
int32_t var_20 = 0
ascension::CWorld::OutputAnimationInsight(arg2, r0_1, arg3, arg5)
ascension::CPlayer::AddInsightCount(arg3)

if (*(arg2 + 0xb20) == arg3)
    ascension::CWorld::AddInsightGainedThisTurn(arg2)

return core::CWorldBase::OutputMessageFormat(arg2, "%s gains %d insight\n", (*(*arg3 + 0xc))(arg3), 
    r0_1) __tailcall
