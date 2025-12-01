// 函数: _ZN14ascensionrules32CStateProcessMayDiscardTopOfDeck15SelectPutOnDeckER13CStateMachineP6CStateiPj
// 地址: 0x147c14
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r6 = *(arg2 + 0x24c)
uint32_t r5 = *(arg2 + 0x254)
core::CCardInstance* r4 = *(r6 + 4)
int32_t var_20 = 0
ascension::CWorld::OutputAnimationCard(r4, r5, 2, 0xc, 0, 2, zx.d(*(r6 + 8)), 0)
core::CWorldBase::OutputMessageFormat(r4, "%s puts %s on deck\n", r6 + 0x10, (*(*r5 + 0xc))(r5))
ascension::CPlayer::PutCardOnTopOfDeck(r6)
ascension::CWorld::PopRevealCard(r4)
return ascension::CWorld::OutputPauseForAnimationToDestination(r4) __tailcall
