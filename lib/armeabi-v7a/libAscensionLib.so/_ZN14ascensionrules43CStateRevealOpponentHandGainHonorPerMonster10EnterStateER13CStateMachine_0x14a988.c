// 函数: _ZN14ascensionrules43CStateRevealOpponentHandGainHonorPerMonster10EnterStateER13CStateMachine
// 地址: 0x14a988
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r5 = *(*(arg1 + 0x30) + 4)
void* r6 = *(*(arg1 + 0x34) + 0x3c)

if (*(r6 + 0x18) s>= 1)
    do
        int32_t* r0_3 = core::CCardStack::GetTopCard()
        int32_t var_38
        int32_t var_34
        int32_t var_30
        int32_t var_2c
        int32_t var_28
        core::CWorldBase::OutputMessageFormat(r5, "%s reveals %s\n", *(arg1 + 0x34) + 0x10, 
            (*(*r0_3 + 0xc))(r0_3), var_38, var_34, var_30, var_2c, var_28)
        ascension::CWorld::PushRevealCard(r5, r0_3, 0xa)
        var_38 = zx.d(*(*(arg1 + 0x34) + 8))
        var_34 = 0xc
        var_30 = 0
        var_2c = 0
        var_28 = 0
        ascension::CWorld::OutputAnimationCard(r5, r0_3, 0xa, 1, var_38, 0xc, 0, 0)
        ascension::CPlayer::RemoveCardFromHand(*(arg1 + 0x34))
    while (*(r6 + 0x18) s> 0)

ascension::CWorld::OutputPauseForAnimationToDestination(r5)
*(arg1 + 0x40) = 0x101
return 0x101
