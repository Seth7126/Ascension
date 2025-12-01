// 函数: _ZN14ascensionrules25CStateRemoveCenterRowCard11UpdateStateER13CStateMachine
// 地址: 0x14afa4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* __offset(CStateMachine, 0x5c) r6 = *(arg1 + 0x50)
int32_t r5 = *(*(arg1 + 0x30) + 4)

if (r6 == 0)
    r6 = arg1 + 0x5c

CState* entry_r1

if (*(arg1 + 0x58) == 0)
    *(arg1 + 0x48)
    int32_t* r0_7 = ascension::CWorld::ReplaceCenterRowCard(r5, *(arg1 + 0x34), (*(arg1 + 0x38)).b)
    
    if (r0_7 != 0)
        if (*(r0_7[3] + 0x88) == 6)
            *(r6 + 0x58) = 0
            *(arg1 + 0x4c) = 0
            int32_t r0_10 = *(r6 + 0x60)
            
            if (r0_10 s<= 7)
                *(r6 + 0x60) = r0_10 + 1
                *(r6 + (r0_10 << 2) + 0x64) = r0_7
            
            if (*(arg1 + 0x40) s>= 1)
                *(arg1 + 0x3c)
                ascension::CWorld::RemoveCenterRowCard(r5, (*(arg1 + 0x34)).b)
                int32_t var_38_1 = 0
                ascension::CWorld::AddToAcquiredCards(r5, r0_7.b, 7, 3)
                ascension::CWorld::OutputEvent(r5, 4, zx.d(*(*(arg1 + 0x30) + 8)), zx.d(r0_7[2].w))
                ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 3)
                ascension::CPlayer::AddOwnedCard(*(arg1 + 0x30))
                core::CWorldBase::OutputMessageFormat(r5, "%s acquires %s\n", 
                    *(arg1 + 0x30) + 0x10, (*(*r0_7 + 0xc))(r0_7), 0)
                int32_t var_28_1 = 0
                ascension::CWorld::OutputAnimationCard(r5, r0_7, 3, 7, *(arg1 + 0x34), 3, 
                    zx.d(*(*(arg1 + 0x30) + 8)), 1)
                ascension::CWorld::OutputPauseForAllAnimation()
                ascension::CPlayer::PutCardInDiscard(*(arg1 + 0x30))
                *(arg1 + 0x40) -= 1
            
            return ascension::CWorld::OutputPauseBrief(r5) __tailcall
        
        int32_t r1_21 = *(arg1 + 0x54)
        *(arg1 + 0x58) = r0_7
        
        if (r1_21 != 0)
            ascension::CWorld::OutputPauseForAnimationToDestination(r5)
        
        int32_t r0_41 = *(arg1 + 0x30)
        *(r6 + 0x50) = r0_7
        *(r6 + 0x4c) = r0_41
        *(r6 + 0x54) = *(arg1 + 0x34)
        int32_t* r0_43 = ascension::CWorld::GetCenterRowCardStackList(r5)
        int32_t r1_23 = 0
        
        if (r0_43 != 0)
            void* r2_10 = *r0_43
            int32_t r0_44 = r0_43[1]
            
            if (r2_10 != r0_44)
                r1_23 = 0
                
                do
                    int32_t r3_8 = *(r2_10 + 4)
                    r2_10 += 8
                    
                    if (r3_8 == 3)
                        r1_23 += 1
                while (r0_44 != r2_10)
        
        *(r6 + 0x5c) = r1_23
        
        if (*(arg1 + 0x50) == 0)
            core::CWorldBase::OutputMessageFormat(r5, "%s has entered the center row\n", 
                r0_7[3] + 4)
            int32_t r5_1 = *(arg1 + 0x30)
            int32_t* r0_49 = operator new(0x40)
            CState::CState()
            *r0_49 = _vtable_for_ascensionrules::CStateProcessPendingCenterRowEffect + 8
            r0_49[0xc] = r5_1
            r0_49[0xd] = r6
            r0_49[0xe] = 0
            r0_49[0xf] = 0
            return CStateMachine::PushOwnedState(entry_r1) __tailcall

if (*(arg1 + 0x58) != 0 || *(arg1 + 0x58) != 0)
    *(arg1 + 0x34)
    uint32_t r0_2 = ascension::CWorld::GetCenterRowCard(r5)
    void* r0_3 = *(arg1 + 0x58)
    
    if (r0_2 == r0_3)
        int32_t r3_5 = *(r6 + 0x58)
        
        if (r3_5 != 0)
            void* r9_1 = *(r0_2 + 0xc)
            
            if ((r3_5 & 1 << zx.d((*(r9_1 + 0x88)).b + 5)) != 0)
                goto label_14b1b4
            
            if (ascension::CWorld::QueryCardFactionFlags(r5, *(arg1 + 0x30), r0_2) != 0)
                r3_5 = *(r6 + 0x58)
                r0_3 = *(arg1 + 0x58)
            label_14b1b4:
                int32_t var_38_3 = r3_5 & *(r9_1 + 0x8c)
                ascension::CWorld::OutputEvent(r5, 0x16, zx.d(*(*(arg1 + 0x30) + 8)), 
                    zx.d(*(r0_3 + 8)))
                ascensionrules::CreateStateProcessAcquireOrDefeatTopOfCenterRowStack(
                    *(arg1 + 0x30), *(arg1 + 0x34), true)
                CStateMachine::PushOwnedState(entry_r1)
                *(arg1 + 0x58) = 0
                return 0
        
        int32_t r7_3 = *(arg1 + 0x4c)
        
        if (r7_3 != 0)
            int32_t result = r7_3(entry_r1, *(arg1 + 0x30), *(arg1 + 0x34), *(arg1 + 0x58), 0)
            
            if (result != 0)
                *(arg1 + 0x58) = 0
                return result

return CStateMachine::PopState(entry_r1)
