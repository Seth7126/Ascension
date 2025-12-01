// 函数: _ZN14ascensionrules52CStateProcessRevealAndDrawTopOfDeckUntilEndCondition11UpdateStateER13CStateMachine
// 地址: 0x148440
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (zx.d(*(arg1 + 0x48)) != 0)
    CState* entry_r1
    return CStateMachine::PopState(entry_r1)

void* r6 = *(arg1 + 0x38)
core::CCardInstance* r4 = *(r6 + 4)

if (zx.d(*(r4 + 0xa14)) == 0)
    void* r0_4 = *(arg1 + 0x44)
    
    if (r0_4 != 0)
        void* r7 = *(r0_4 + 0xc)
        uint32_t r0_5 = zx.d(*(arg1 + 0x3c))
        *(arg1 + 0x48) = 1
        
        if (r0_5 != 0 && strcasecmp(r7 + 0x44, "Mystic") == 0)
            int32_t var_30_1 = 0
            ascension::CWorld::OutputEvent(r4, 0x3a, zx.d(*(r6 + 8)), 0)
            *(arg1 + 0x48) = 0
        
        if (zx.d(*(arg1 + 0x3d)) != 0 && strcasecmp(r7 + 0x44, "Heavy Infantry") == 0)
            int32_t var_30_2 = 0
            ascension::CWorld::OutputEvent(r4, 0x3a, zx.d(*(*(arg1 + 0x38) + 8)), 0)
            *(arg1 + 0x48) = 0
        
        int32_t r0_14 = *(arg1 + 0x40)
        
        if (r0_14 != 0 && (*(r7 + 0x8c) & r0_14) != 0)
            int32_t var_30_3 = 0
            ascension::CWorld::OutputEvent(r4, 0x3a, zx.d(*(*(arg1 + 0x38) + 8)), 0)
            *(arg1 + 0x48) = 0
        
        void* r0_18 = *(arg1 + 0x38)
        
        if (*(*(r0_18 + 0x38) + 0x18) == 0 && *(*(r0_18 + 0x40) + 0x18) == 0)
            int32_t var_30_4 = 0
            ascension::CWorld::OutputEvent(r4, 0x3a, zx.d(*(r0_18 + 8)), 1)
            r0_18 = *(arg1 + 0x38)
            *(arg1 + 0x48) = 1
        
        int32_t var_20 = 0
        ascension::CWorld::OutputAnimationCard(r4, *(arg1 + 0x44), 2, 0xc, 0, 1, 
            zx.d(*(r0_18 + 8)), 0)
        core::CWorldBase::OutputMessageFormat(r4, "%s draws the revealed %s\n", 
            *(arg1 + 0x38) + 0x10, (*(**(arg1 + 0x44) + 0xc))())
        *(arg1 + 0x44)
        ascension::CPlayer::PutCardInHand(*(arg1 + 0x38))
        *(arg1 + 0x44)
        int32_t result = ascension::CWorld::PopRevealCard(r4)
        *(arg1 + 0x44) = 0
        return result
    
    int32_t* r0_27 = ascension::CPlayer::RemoveTopCardFromDeck()
    *(arg1 + 0x44) = r0_27
    
    if (r0_27 != 0)
        core::CWorldBase::OutputMessageFormat(r4, "%s reveals %s\n", *(arg1 + 0x38) + 0x10, 
            (*(*r0_27 + 0xc))())
        int32_t var_20_1 = 0
        ascension::CWorld::OutputAnimationCard(r4, *(arg1 + 0x44), 2, 2, 
            zx.d(*(*(arg1 + 0x38) + 8)), 0xc, 0, 0)
        *(*(arg1 + 0x38) + 8)
        ascension::CWorld::PushRevealCard(r4, *(arg1 + 0x44), 5)
        ascension::CWorld::OutputPauseForAnimationConfirmation()
        ascension::CWorld::OutputPauseForAnimationToDestination(r4)
        return ascension::CWorld::OutputPauseBrief(r4) __tailcall

*(arg1 + 0x48) = 1
return 1
