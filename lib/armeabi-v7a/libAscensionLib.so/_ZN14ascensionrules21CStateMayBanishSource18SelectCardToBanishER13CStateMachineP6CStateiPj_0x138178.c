// 函数: _ZN14ascensionrules21CStateMayBanishSource18SelectCardToBanishER13CStateMachineP6CStateiPj
// 地址: 0x138178
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = *(arg2 + 0x254)
core::CCardInstance* r7 = *(arg2 + 0x24c)

if (r0 != 0)
    void* r2_1 = r0 + *r0 + 4
    uint32_t r1_1 = zx.d(*r2_1)
    
    if (r1_1 u<= 7)
        uint32_t r3 = zx.d(*(arg3 + 8))
        *r2_1 = r1_1.b + 1
        r0[*r0 * 8 + r1_1 + 4] = r3

core::CCardInstance* r6_2 = *(r7 + 4)
int32_t r0_3 = *(r6_2 + 0xbd8)
int32_t r1_2 = *(r6_2 + 0xbdc)

if (r1_2 != r0_3)
    int32_t i = 0
    
    do
        if (*(r0_3 + (i << 3)) == arg3 && *(r0_3 + (i << 3) + 4) == 7)
            goto label_13825c
        
        i += 1
    while (i u< (r1_2 - r0_3) s>> 3)

if (r7 == *(r6_2 + 0xb20))
    ascension::CWorld::AddToBanishedCardCount()

ascension::CPlayer::RemoveOwnedCard(r7)
ascension::CPlayer::AddTurnLog(r7, 6)
ascension::CWorld::PutCardInVoid(r6_2)
label_13825c:
ascension::CWorld::SetPlayedCardsFlags(r6_2, arg3)
ascension::CWorld::OutputPauseForAnimationToDestination(r6_2)
int32_t var_20 = 0
ascension::CWorld::OutputAnimationCard(r6_2, arg3, 6, 0xb, 0, 9, 0, &__elf_header)
*(arg2 + 0x258) = 1
return 1
