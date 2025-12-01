// 函数: _ZN14ascensionrules32CStateProcessRevealTopCardOfDeck11UpdateStateER13CStateMachine
// 地址: 0x147624
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(*(*(arg1 + 0x38) + 0x38) + 0x18) == 0)
    ascension::CPlayer::ShuffleDiscardIntoDeck()
    *(arg1 + 0x38)

int32_t* r0_2 = ascension::CPlayer::GetTopCardFromDeck()

if (r0_2 != 0)
    void* r5_1 = *(arg1 + 0x38)
    char* r7_1 = *(r5_1 + 4)
    core::CWorldBase::OutputMessageFormat(r7_1, "%s reveals %s\n", r5_1 + 0x10, 
        (*(*r0_2 + 0xc))(r0_2))
    ascension::CWorld::PushRevealCard(r7_1, r0_2, 0xa)
    int32_t var_28_1 = 0
    ascension::CWorld::OutputAnimationCard(r7_1, r0_2, 0xa, 2, zx.d(*(*(arg1 + 0x38) + 8)), 0xc, 0, 
        0)
    ascension::CWorld::OutputPauseForAllAnimation()
    ascension::CWorld::OutputPauseForAnimationConfirmation()
    int32_t* r0_13 = *(arg1 + 0x3c)
    
    if (r0_13 != 0)
        void* r2_3 = r0_13 + *r0_13 + 4
        uint32_t r1_6 = zx.d(*r2_3)
        
        if (r1_6 u<= 7)
            uint32_t r3_3 = zx.d(r0_2[2].w)
            *r2_3 = r1_6.b + 1
            r0_13[*r0_13 * 8 + r1_6 + 4] = r3_3

CState* entry_r1
return CStateMachine::PopState(entry_r1) __tailcall
