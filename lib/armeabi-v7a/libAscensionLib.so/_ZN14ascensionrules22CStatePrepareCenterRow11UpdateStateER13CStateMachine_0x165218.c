// 函数: _ZN14ascensionrules22CStatePrepareCenterRow11UpdateStateER13CStateMachine
// 地址: 0x165218
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x34) s<= 5)
    int32_t i
    
    do
        *(arg1 + 0x30)
        int32_t r0_2 = ascension::CWorld::DrawCardFromPortalDeck()
        
        if (r0_2 != 0)
            void* r7 = *(r0_2 + 0xc)
            core::CCardInstance* r0_8 = *(arg1 + 0x30)
            
            if (*(r7 + 0x88) == 4)
                int32_t r1_4 = *(r0_8 + 0xa6c)
                
                if (r1_4 != 0)
                    ascension::CWorld::RemoveEventCardInPlay(r0_8, r1_4.b)
                    r0_8 = *(arg1 + 0x30)
                
                ascension::CWorld::PutEventCardInPlay(r0_8)
                return ascension::CWorld::OutputPauseBrief(*(arg1 + 0x30)) __tailcall
            
            int32_t r6_1 = 0
            int32_t var_20 = 0
            ascension::CWorld::OutputAnimationCard(r0_8, r0_2, 2, 8, 0, 7, *(arg1 + 0x34), 0)
            ascension::CWorld::OutputPauseBrief(*(arg1 + 0x30))
            
            if (*(r7 + 0x88) == 6)
                core::CCardInstance* r1_17 = *(arg1 + 0x34)
                void* r0_19 = arg1 + r1_17 * 0x84
                void* r2_6 = r0_19 + 0x9c
                int32_t r3_1 = *r2_6
                
                if (r3_1 s<= 7)
                    r0_19 += r3_1 << 2
                    *r2_6 = r3_1 + 1
                
                if (r3_1 s<= 7)
                    *(r0_19 + 0xa0) = r0_2
                
                return ascension::CWorld::PutCardOnCenterRow(*(arg1 + 0x30), r1_17, r0_2) __tailcall
            
            ascension::CWorld::PutCardOnCenterRow(*(arg1 + 0x30), *(arg1 + 0x34), r0_2)
            int32_t r0_24 = ascension::CWorld::GetPlayer(*(arg1 + 0x30))
            int32_t r1_21 = *(arg1 + 0x34)
            void* r2_11 = arg1 + r1_21 * 0x84
            *(r2_11 + 0x88) = r0_24
            *(r2_11 + 0x8c) = r0_2
            *(r2_11 + 0x90) = r1_21
            int32_t* r0_26 = ascension::CWorld::GetCenterRowCardStackList(*(arg1 + 0x30))
            
            if (r0_26 != 0)
                void* r1_22 = *r0_26
                int32_t r0_27 = r0_26[1]
                
                if (r1_22 != r0_27)
                    r6_1 = 0
                    
                    do
                        int32_t r2_12 = *(r1_22 + 4)
                        r1_22 += 8
                        
                        if (r2_12 == 3)
                            r6_1 += 1
                    while (r0_27 != r1_22)
            
            int32_t r0_28 = *(arg1 + 0x34)
            *(arg1 + r0_28 * 0x84 + 0x98) = r6_1
            *(arg1 + 0x34) = r0_28 + 1
            return r0_28 + 1
        
        i = *(arg1 + 0x34)
        *(arg1 + 0x34) = i + 1
    while (i s< 5)

int32_t r1_1 = *(arg1 + 0x38)
CState* entry_r1

if (r1_1 s<= 6)
    int32_t i_1 = r1_1 - 1
    void* r0_5 = arg1 + r1_1 * 0x84 + 0x8c
    
    do
        if (*r0_5 != 0)
            ascensionrules::CreateStateProcessPendingCenterRowEffect(
                ascension::CWorld::GetPlayer(*(arg1 + 0x30)), arg1 + *(arg1 + 0x38) * 0x84 + 0x3c, 
                nullptr, 0)
            CStateMachine::PushOwnedState(entry_r1)
            int32_t result = *(arg1 + 0x38) + 1
            *(arg1 + 0x38) = result
            return result
        
        int32_t r2_2 = i_1 + 2
        i_1 += 1
        r0_5 += 0x84
        *(arg1 + 0x38) = r2_2
    while (i_1 s< 6)

return CStateMachine::PopState(entry_r1)
