// 函数: _ZN14ascensionrules57CStateProcessAcquireOrDefeatTopOfCenterRowStackDeprecated10EnterStateER13CStateMachine
// 地址: 0x133030
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *(arg1 + 0x250)
int32_t r6 = *(*(arg1 + 0x24c) + 4)
*(arg1 + 0x258) = 0
void* r0_2
void* __offset(CStateMachine, 0x254) r7_1

if (r1 == 0xffffffff)
    r0_2 = ascension::CWorld::DrawCardFromPortalDeck()
    r7_1 = arg1 + 0x254
    *r7_1 = r0_2
    
    if (r0_2 != 0)
    label_1330d4:
        void* r5_1 = *(r0_2 + 0xc)
        core::CWorldBase::OutputMessageFormat(r6, "%s reveals %s\n", *(arg1 + 0x24c) + 0x10, 
            r5_1 + 4)
        int32_t r0_9 = *(r5_1 + 0x88)
        
        if (r0_9 - 1 u< 2)
        label_133110:
            ascension::CWorld::PushRevealCard(r6, *r7_1, 3)
        else if (r0_9 == 3)
            ascension::CWorld::PushRevealCard(r6, *r7_1, 4)
        else if (r0_9 == 6)
            goto label_133110
        
        int32_t r0_11 = *(arg1 + 0x250)
        int32_t var_48_1
        int32_t r0_12
        uint32_t r3_3
        
        if (r0_11 == 0xffffffff)
            var_48_1 = 0
            int32_t var_44_2 = 0xc
            r3_3 = 8
            int32_t var_40_2 = 0
            int32_t var_3c_2 = 0
            int32_t var_38_2 = 0
            r0_12 = r6
        else
            var_48_1 = r0_11
            int32_t var_44_1 = 0xc
            r0_12 = r6
            r3_3 = 7
            int32_t var_40_1 = 0
            int32_t var_3c_1 = 0
            int32_t var_38_1 = 0
        
        ascension::CWorld::OutputAnimationCard(r0_12, *(arg1 + 0x254), 0xa, r3_3, var_48_1, 0xc, 0, 
            0)
        ascension::CWorld::OutputPauseForAnimationConfirmation()
        int32_t r1_7 = *(arg1 + 0x250)
        
        if (r1_7 != 0xffffffff)
            core::CCardInstance* r2_5 = nullptr
            
            if (zx.d(*(arg1 + 0x258)) != 0)
                r2_5 = *r7_1
            
            ascensionrules::CreateStateRemoveCenterRowCard(*(arg1 + 0x24c), r1_7, r2_5, true, true, 
                0, 0, false, nullptr, arg1 + 0x2a8, 0xc, nullptr, 0)
            CState* entry_r1
            CStateMachine::PushOwnedState(entry_r1)
        
        *(arg1 + 0x259) = 0
        *(arg1 + 0x2a4) = 0
else
    r0_2 = ascension::CWorld::GetCenterRowCard(r6)
    r7_1 = arg1 + 0x254
    *r7_1 = r0_2
    
    if (*(r6 + 0x30) u< 0xd)
        goto label_1330b0
    
    *(arg1 + 0x250)
    int32_t* r0_4 = ascension::CWorld::GetCenterRowCardStackList(r6)
    void** r1_3 = *r0_4
    int32_t r0_5 = r0_4[1]
    
    if (r1_3 == r0_5 || *(r0_5 - 4) != 3 || r1_3[1] != 2)
        r0_2 = *r7_1
    label_1330b0:
        
        if (r0_2 != 0)
            goto label_1330d4
    else
        r0_2 = *r1_3
        *(arg1 + 0x258) = 1
        *(arg1 + 0x254) = r0_2
        
        if (r0_2 != 0)
            goto label_1330d4
*(arg1 + 0x25c) = 0
return 0
