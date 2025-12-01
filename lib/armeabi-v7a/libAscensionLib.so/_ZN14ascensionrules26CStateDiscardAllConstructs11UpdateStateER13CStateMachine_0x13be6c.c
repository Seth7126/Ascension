// 函数: _ZN14ascensionrules26CStateDiscardAllConstructs11UpdateStateER13CStateMachine
// 地址: 0x13be6c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r4 = *(arg1 + 0x38)
char* r6 = *(r4 + 4)

if (*(r6 + 0x30) u< 7)
    int32_t r0_6 = *(r4 + 0x58)
    
    if (*(r4 + 0x54) != r0_6)
        void* r2_1 = r4
        
        while (true)
            void* r7_2 = *(r0_6 - 4)
            uint32_t r0_7 = zx.d(*(r2_1 + 8))
            uint32_t r1_5 = *(r7_2 + 0x10)
            void* r5_2 = *(r1_5 + 0xc)
            int32_t var_48_1 = zx.d(*(r7_2 + 8))
            int32_t var_44_1 = 3
            int32_t var_3c_1 = 3
            uint32_t var_40_1 = r0_7
            uint32_t var_38_1 = r0_7
            ascension::CWorld::OutputAnimationCard(r6, r1_5, 5, 4, var_48_1, 3, var_40_1, 3)
            uint32_t* r10_2 = *(r7_2 + 0x48)
            int32_t i = *(r7_2 + 0x4c)
            
            if (zx.d(*(r5_2 + 0xcb)) != 0)
                for (; r10_2 != i; i = *(r7_2 + 0x4c))
                    uint32_t r5_3 = *r10_2
                    r10_2 = &r10_2[1]
                    core::CWorldBase::OutputMessageFormat(r6, "%s puts %s on top of portal deck\n", 
                        *(arg1 + 0x38) + 0x10, (*(*r5_3 + 0xc))(r5_3), var_48_1, var_44_1, 
                        var_40_1, var_3c_1, var_38_1)
                    var_48_1 = zx.d(*(r7_2 + 8))
                    var_44_1 = 8
                    var_40_1 = 0
                    var_3c_1 = 0
                    var_38_1 = 0
                    ascension::CWorld::OutputAnimationCard(r6, r5_3, 5, 4, var_48_1, 8, 0, 0)
                    ascension::CWorld::PutCardOnTopOfPortalDeck(r6)
            else
                for (; r10_2 != i; i = *(r7_2 + 0x4c))
                    uint32_t r8_1 = *r10_2
                    r10_2 = &r10_2[1]
                    core::CWorldBase::OutputMessageFormat(r6, "%s puts %s into discard pile\n", 
                        *(arg1 + 0x38) + 0x10, (*(*r8_1 + 0xc))(r8_1), var_48_1, 3, var_40_1, 3, 
                        var_38_1)
                    uint32_t r0_21 = zx.d(*(*(arg1 + 0x38) + 8))
                    var_48_1 = zx.d(*(r7_2 + 8))
                    var_40_1 = r0_21
                    var_38_1 = r0_21
                    ascension::CWorld::OutputAnimationCard(r6, r8_1, 5, 4, var_48_1, 3, var_40_1, 3)
                    ascension::CPlayer::PutCardInDiscard(*(arg1 + 0x38))
            
            if (ascension::CPlayer::RemoveConstructFromPlay(*(arg1 + 0x38)) != 0)
                ascension::CPlayer::PutCardInDiscard(*(arg1 + 0x38))
                ascension::CPlayer::AddTurnLog(*(arg1 + 0x38), 5)
            
            r0_6 = *(r4 + 0x58)
            
            if (*(r4 + 0x54) == r0_6)
                break
            
            r2_1 = *(arg1 + 0x38)
else if (zx.d(*(arg1 + 0x3c)) != 0)
    int32_t r0_2 = *(arg1 + 0x90)
    int32_t r1_1 = *(arg1 + 0x94)
    *(arg1 + 0x3c) = 0
    
    if (r0_2 != r1_1)
        int32_t r7_1 = r0_2 + 4
        int32_t result
        
        while (true)
            int32_t r6_1 = *(r7_1 - 4)
            void** r0_3 = operator new(0x3c)
            CState::CState()
            *r0_3 = _vtable_for_ascensionrules::CStateDiscardConstruct + 8
            r0_3[0xc] = r4
            r0_3[0xd] = r6_1
            r0_3[0xe].b = 0
            CState::AddOwnedChild(arg1)
            CStateList::AppendState(arg1)
            result = *(arg1 + 0x94)
            
            if (r7_1 == result)
                break
            
            r4 = *(arg1 + 0x38)
            r7_1 += 4
        
        return result

return CStateList::UpdateState(arg1) __tailcall
