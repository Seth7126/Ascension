// 函数: _ZN14ascensionrules30CStatePutCardIntoPlayerDiscard12SelectPlayerER13CStateMachineP6CStateiPj
// 地址: 0x146564
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r8 = *(arg2 + 0x24c)
uint32_t r5 = *(arg2 + 0x250)
uint32_t r4 = *(r8 + 4)
int32_t var_38 = 0
ascension::CWorld::OutputEvent(r4, 4, zx.d(*(arg3 + 8)), zx.d(*(r5 + 8)))
uint32_t var_38_1 = zx.d(*(r5 + 8))
ascension::CWorld::OutputEvent(r4, 0x29, zx.d(*(r8 + 8)), zx.d(*(arg3 + 8)))
int32_t var_28 = 0
ascension::CWorld::OutputAnimationCard(r4, r5, 3, 0xb, 0, 3, zx.d(*(arg3 + 8)), 0)
void* r7_1 = *(arg2 + 0x25c)

if (r7_1 != 0)
    int32_t r0_5 = *(r7_1 + 4)
    
    if (r0_5 == 0x15)
        ascension::CPlayer::RemoveOwnedCard(r8)
        ascension::CWorld::SetPlayedCardsFlags(r4, r5)
        *(r7_1 + 0x54) = 0
    else if (r0_5 == 0x1b)
        if (*(r7_1 + 0x60) != 8)
            ascension::CWorld::RemoveCardFromVoid(r4)
        else
            ascension::CWorld::RemoveCardFromPortalDeck(r4)
        
        *(r7_1 + 0x65) = 1

ascension::CPlayer::AddOwnedCard(arg3)
ascension::CPlayer::PutCardInDiscard(arg3)
ascension::CWorld::PopResolveEffect(r4)
return ascension::CWorld::OutputPauseForAnimationToDestination(r4) __tailcall
