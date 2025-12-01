// 函数: _ZN14ascensionrules27CStateProcessSetupChampions11UpdateStateER13CStateMachine
// 地址: 0x164da8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0 = *(arg1 + 0x34)
core::CCardInstance* r2 = *(arg1 + 0x78)

if (r2 s< r0)
    uint32_t r5_1 = *(arg1 + (r2 << 2) + 0x38)
    ascension::CWorld::SetUnassignedChampionList(*(arg1 + 0x30), r2)
    int32_t var_20_1 = 0
    ascension::CWorld::OutputAnimationCard(*(arg1 + 0x30), r5_1, 8, 0x12, 0, 0x11, *(arg1 + 0x78), 
        0)
    ascension::CWorld::OutputPauseBrief(*(arg1 + 0x30))
else if (r2 != r0)
    if (r2 != r0 + 1)
        core::CCardInstance* r0_9 = *(arg1 + 0x30)
        int32_t r2_2 = *(arg1 + 0x7c)
        int32_t r3_1 = *(r0_9 + 0x1c) - *(r0_9 + 0x18)
        
        if (r2_2 s>= r3_1 s>> 2)
            if (r2_2 != r3_1 s>> 2)
                int32_t r3_3 = *(arg1 + 0x80) + 0xd
                uint32_t i
                
                do
                    CState* entry_r1
                    
                    if (r3_3 - 0xd s< 1)
                        return CStateMachine::PopState(entry_r1)
                    *(arg1 + 0x80) = r3_3 - 0xe
                    i = *(arg1 + (r3_3 << 2))
                    r3_3 -= 1
                while (i == 0)
                
                int32_t var_20_3 = 0
                ascension::CWorld::OutputAnimationCard(r0_9, i, 5, 0x11, r3_3 - 0xd, 0x13, 0, 0)
                ascension::CWorld::OutputPauseBrief(*(arg1 + 0x30))
                return ascension::CWorld::SetUnassignedChampionList(*(arg1 + 0x30), *(arg1 + 0x80))
                    __tailcall
            
            ascension::CWorld::OutputPauseLong(r0_9)
        else
            int32_t r5_2 = *(arg1 + (r2_2 << 2) + 0x58)
            void* r7_1 = arg1 + (r5_2 << 2)
            uint32_t r6_1 = *(r7_1 + 0x38)
            void* r0_11 = ascension::CPlayer::PutCardInPlay(ascension::CWorld::GetPlayer(r0_9))
            *(r7_1 + 0x38) = 0
            int32_t var_20_2 = 0
            ascension::CWorld::OutputAnimationCard(*(arg1 + 0x30), r6_1, 3, 0x11, r5_2, 5, 
                zx.d(*(r0_11 + 8)), 0)
            ascension::CWorld::OutputPauseForAnimationToDestination(*(arg1 + 0x30))
            ascension::CWorld::SetUnassignedChampionList(*(arg1 + 0x30), r5_2)
        
        int32_t r0_16 = *(arg1 + 0x7c) + 1
        *(arg1 + 0x7c) = r0_16
        return r0_16
    
    ascension::CWorld::OutputPauseLong(*(arg1 + 0x30))
else
    ascension::CWorld::OutputPauseForAnimationToDestination(*(arg1 + 0x30))

int32_t r0_8 = *(arg1 + 0x78) + 1
*(arg1 + 0x78) = r0_8
return r0_8
