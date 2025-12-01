// 函数: _ZN14ascensionrules30CStateProcessDiscardRandomCard10EnterStateER13CStateMachine
// 地址: 0x1430e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
*(arg1 + 0x30)
int32_t result = ascension::CPlayer::CountCardsInHand()

if (result s< 1)
    return result

int32_t* r8 = *(*(arg1 + 0x30) + 4)
int32_t i_1 = (*(*r8 + 0xc))(r8, result)
void* r12 = *(arg1 + 0x30)
int32_t i = i_1
int32_t* r0_5 = *(r12 + 0x3c) + 0xc
int32_t r3 = *r0_5

while ((r0_5[1] - r3) s>> 2 u> i)
    int32_t* r6_1 = *(r3 + (i << 2))
    
    if (*(r6_1[3] + 0x88) == 5)
        i += 1
        r6_1 = nullptr
        
        if (i s>= result)
            i = 0
    
    if (r6_1 != 0)
        uint32_t r0_6 = zx.d(*(r12 + 8))
        uint32_t var_28 = r0_6
        ascension::CWorld::OutputAnimationCard(r8, r6_1, 5, 1, r0_6, 3, r0_6, 3)
        ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 5)
        ascension::CPlayer::RemoveCardFromHand(*(arg1 + 0x30))
        core::CWorldBase::OutputMessageFormat(r8, "%s discards %s\n", *(arg1 + 0x30) + 0x10, 
            (*(*r6_1 + 0xc))(r6_1))
        return ascension::CPlayer::PutCardInDiscard(*(arg1 + 0x30)) __tailcall

return ascensionrules::CStateProcessDiscardRandomCard::UpdateState(
    std::__ndk1::__vector_base_common<true>::__throw_out_of_range()) __tailcall
