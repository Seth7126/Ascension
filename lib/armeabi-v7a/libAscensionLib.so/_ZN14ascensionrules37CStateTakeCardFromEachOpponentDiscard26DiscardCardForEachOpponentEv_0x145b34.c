// 函数: _ZN14ascensionrules37CStateTakeCardFromEachOpponentDiscard26DiscardCardForEachOpponentEv
// 地址: 0x145b34
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t r1 = *(entry_r0 + 0x24c)
ascension::CPlayer* r9 = *(r1 + 4)
int32_t r0_1 = *(r9 + 0x1c) - *(r9 + 0x18)

if (r0_1 s>= 5)
    uint32_t r8_1 = r0_1 u>> 2
    
    while (true)
        core::CCardInstance* r0_4 = ascension::CWorld::GetPlayerByTurnOrder(r9, r1)
        int32_t r0_5 = ascension::CPlayer::CountCardsInHand()
        
        if (r0_5 s>= 1)
            int32_t r1_2 = (*(*r9 + 0xc))(r9, r0_5)
            int32_t* r0_10 = *(r0_4 + 0x3c) + 0xc
            int32_t r2_3 = *r0_10
            uint32_t i
            
            do
                if ((r0_10[1] - r2_3) s>> 2 u<= r1_2)
                    CStateMachine* r0_24
                    int32_t r12_1
                    r0_24, r12_1 = std::__ndk1::__vector_base_common<true>::__throw_out_of_range()
                    return ascensionrules::CStateTakeCardFromEachOpponentDiscard::UpdateState(r0_24)
                        __tailcall
                
                i = *(r2_3 + (r1_2 << 2))
                
                if (*(*(i + 0xc) + 0x88) == 5)
                    r1_2 += 1
                    i = 0
                    
                    if (r1_2 s>= r0_5)
                        r1_2 = 0
            while (i == 0)
            
            *(entry_r0 + ((r8_1 - 1) << 2) + 0x250) = i
            int32_t var_40
            int32_t var_3c
            int32_t var_38
            int32_t var_34
            uint32_t var_30
            core::CWorldBase::OutputMessageFormat(r9, "%s discards %s\n", r0_4 + 0x10, 
                (*(*i + 0xc))(i), var_40, var_3c, var_38, var_34, var_30)
            ascension::CPlayer::RemoveCardFromHand(r0_4)
            ascension::CWorld::PushRevealCard(r9, i, 0xa)
            uint32_t r0_19 = zx.d(*(r0_4 + 8))
            var_3c = 0xc
            var_38 = 0
            var_34 = 2
            var_40 = r0_19
            var_30 = r0_19
            ascension::CWorld::OutputAnimationCard(r9, i, 5, 1, var_40, 0xc, 0, 2)
        
        if (r8_1 s< 3)
            break
        
        r8_1 -= 1
        r1 = *(entry_r0 + 0x24c)

ascension::CWorld::OutputPauseForAllAnimation()
return ascension::CWorld::OutputPauseForAnimationConfirmation() __tailcall
