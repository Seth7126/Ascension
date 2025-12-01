// 函数: _ZN14ascensionrules45CStateProcessCopyEffectFromTopOfAnyPlayerDeck19ReturnRevealedCardsEv
// 地址: 0x1503f8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* entry_r0
core::CCardInstance* r4 = *(*(entry_r0 + 0x24c) + 4)
int32_t r0_2 = *(r4 + 0x1c) - *(r4 + 0x18)

if (r0_2 s>= 1)
    int32_t i = 0
    
    do
        uint32_t r7_1 = *(entry_r0 + 0x258 + (i << 2))
        
        if (r7_1 != 0)
            core::CCardInstance* r0_5 =
                ascension::CWorld::GetPlayerByTurnOrder(r4, *(entry_r0 + 0x24c))
            uint32_t r0_6 = zx.d(*(r0_5 + 8))
            
            if (zx.d(*(entry_r0 + 0x251)) == 0)
                int32_t var_30_2 = 0
                ascension::CWorld::OutputAnimationCard(r4, r7_1, 0xa, 0xc, 0, 2, r0_6, 0)
            else
                int32_t var_30_1 = 0
                ascension::CWorld::OutputAnimationCard(r4, r7_1, 0xa, 0xc, 0, 3, r0_6, 0)
                ascension::CPlayer::RemoveCardFromDeck(r0_5)
                ascension::CPlayer::PutCardInDiscard(r0_5)
            
            ascension::CWorld::PopRevealCard(r4)
            *(entry_r0 + 0x258 + (i << 2)) = 0
        
        i += 1
    while (i s< r0_2 s>> 2)

uint32_t result = zx.d(*(entry_r0 + 0x251))

if (result == 0)
    return result

return ascension::CWorld::OutputPauseForAnimationToDestination(r4) __tailcall
