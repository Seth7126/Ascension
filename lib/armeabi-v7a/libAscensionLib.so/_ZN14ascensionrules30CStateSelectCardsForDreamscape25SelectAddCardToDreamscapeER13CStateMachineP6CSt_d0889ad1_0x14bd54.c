// 函数: _ZN14ascensionrules30CStateSelectCardsForDreamscape25SelectAddCardToDreamscapeER13CStateMachineP6CStateiPj
// 地址: 0x14bd54
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0)
    return 

core::CCardInstance* r5 = *(arg2 + 0x24c)
core::CCardInstance* r6 = *(r5 + 4)
ascension::CPlayer::RemoveCardFromHand(r5)
ascension::CPlayer::PutCardInDreamscape(r5)
uint32_t r0_2 = zx.d(*(r5 + 8))
int32_t var_20 = 0
ascension::CWorld::OutputAnimationCard(r6, arg3, 8, 1, r0_2, 0x14, r0_2, 0)
