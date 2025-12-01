// 函数: _ZN14ascensionrules44CStateProcessBanishFromHandOrDiscardOrSource22SelectBanishSourceCardER13CStateMachineP6CStateiPj
// 地址: 0x136da0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = *(arg2 + 0x260)

if (r0 != 0)
    void* r2_1 = r0 + *r0 + 4
    uint32_t r1_1 = zx.d(*r2_1)
    
    if (r1_1 u<= 7)
        uint32_t r3 = zx.d(*(arg3 + 8))
        *r2_1 = r1_1.b + 1
        r0[*r0 * 8 + r1_1 + 4] = r3

core::CCardInstance* r0_4 = *(arg2 + 0x24c)
core::CCardInstance* r5_2 = *(r0_4 + 4)
int32_t r1_2 = *(r5_2 + 0xbd8)
int32_t r2_3 = *(r5_2 + 0xbdc)

if (r2_3 != r1_2)
    int32_t i = 0
    
    do
        if (*(r1_2 + (i << 3)) == arg3 && *(r1_2 + (i << 3) + 4) == 7)
            goto label_136e84
        
        i += 1
    while (i u< (r2_3 - r1_2) s>> 3)

if (*(r5_2 + 0xb20) == r0_4)
    ascension::CWorld::AddToBanishedCardCount()
    r0_4 = *(arg2 + 0x24c)

ascension::CPlayer::RemoveOwnedCard(r0_4)
ascension::CPlayer::AddTurnLog(*(arg2 + 0x24c), 6)
ascension::CWorld::PutCardInVoid(r5_2)
label_136e84:
ascension::CWorld::SetPlayedCardsFlags(r5_2, arg3)
ascension::CWorld::OutputPauseForAnimationToDestination(r5_2)
int32_t var_20 = 0
return ascension::CWorld::OutputAnimationCard(r5_2, arg3, 6, 0xb, 0, 9, 0, &__elf_header)
