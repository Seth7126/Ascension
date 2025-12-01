// 函数: _ZN14ascensionrules45CStateProcessCopyEffectFromTopOfAnyPlayerDeck20RevealCardsFromDecksEv
// 地址: 0x15009c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t r1 = *(entry_r0 + 0x24c)
char* r9 = *(r1 + 4)
int32_t r0_1 = *(r9 + 0x1c) - *(r9 + 0x18)

if (r0_1 s>= 1)
    int32_t r4_1 = 0x95 + (r0_1 u>> 2)
    
    while (true)
        void* r0_3 = ascension::CWorld::GetPlayerByTurnOrder(r9, r1)
        
        if (zx.d(*(entry_r0 + 0x250)) == 0 || r0_3 != *(entry_r0 + 0x24c))
            int32_t r0_7 = *(*(r0_3 + 0x38) + 0x18)
            
            if (r0_7 == 0)
                ascension::CPlayer::ShuffleDiscardIntoDeck()
                
                if (*(*(r0_3 + 0x38) + 0x18) s>= 1)
                label_150148:
                    uint32_t r0_12 = ascension::CPlayer::RevealTopCardFromDeck(r0_3.b)
                    *(entry_r0 + (r4_1 << 2)) = r0_12
                    
                    if (r0_12 != 0)
                        int32_t var_38
                        int32_t var_34
                        int32_t var_30
                        int32_t var_2c
                        int32_t var_28
                        core::CWorldBase::OutputMessageFormat(r9, "%s reveals %s\n", r0_3 + 0x10, 
                            (*(*r0_12 + 0xc))(r0_12), var_38, var_34, var_30, var_2c, var_28)
                        ascension::CWorld::PushRevealCard(r9, r0_12, 0xa)
                        var_38 = zx.d(*(r0_3 + 8))
                        var_34 = 0xc
                        var_30 = 0
                        var_2c = 0
                        var_28 = 0
                        ascension::CWorld::OutputAnimationCard(r9, r0_12, 0xa, 2, var_38, 0xc, 0, 0)
            else if (r0_7 s>= 1)
                goto label_150148
        
        if (r4_1 - 0x95 s< 2)
            break
        
        r1 = *(entry_r0 + 0x24c)
        r4_1 -= 1

ascension::CWorld::OutputPauseForAnimationToDestination(r9)
return ascension::CWorld::OutputPauseForAnimationConfirmation() __tailcall
