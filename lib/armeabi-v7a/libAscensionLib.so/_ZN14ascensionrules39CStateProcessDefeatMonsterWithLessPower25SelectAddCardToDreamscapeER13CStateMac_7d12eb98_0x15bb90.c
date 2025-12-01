// 函数: _ZN14ascensionrules39CStateProcessDefeatMonsterWithLessPower25SelectAddCardToDreamscapeER13CStateMachineP6CStateiPj
// 地址: 0x15bb90
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r6 = *(arg2 + 0x24c)
core::CCardInstance* r4 = *(r6 + 4)
uint32_t result = ascension::CWorld::DrawCardFromDreamDeck()

if (result == 0)
    return result

ascension::CPlayer::PutCardInDreamscape(r6)
uint32_t r0_2 = zx.d(*(r6 + 8))
uint32_t var_20_1 = r0_2
return ascension::CWorld::OutputAnimationCard(r4, result, 0, 8, 0, 0x14, r0_2, 8)
