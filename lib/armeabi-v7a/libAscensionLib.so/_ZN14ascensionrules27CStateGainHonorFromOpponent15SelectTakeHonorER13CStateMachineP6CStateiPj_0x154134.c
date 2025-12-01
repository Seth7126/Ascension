// 函数: _ZN14ascensionrules27CStateGainHonorFromOpponent15SelectTakeHonorER13CStateMachineP6CStateiPj
// 地址: 0x154134
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r4 = *(arg2 + 0x250)
ascension::CPlayer* r0 = *(arg3 + 0x90)
int32_t r7 = *(arg2 + 0x24c)

if (r4 s> r0)
    r4 = r0

int32_t r5 = *(r7 + 4)
ascension::CPlayer::RemoveHonorTokens(arg3)
ascension::CPlayer::AddHonorTokens(r7)
ascension::CWorld::AddHonorGainedThisTurn(r5)
int32_t var_20 = 0
ascension::CWorld::OutputAnimationHonor(r5, r4, r7, arg3)
return core::CWorldBase::OutputMessageFormat(r5, "%s takes %d honor tokens from %s\n", 
    (*(*r7 + 0xc))(r7), r4, (*(*arg3 + 0xc))(arg3))
