// 函数: _ZN14ascensionrules35CStateProcessPendingCenterRowEffect11UpdateStateER13CStateMachine
// 地址: 0x14b8e8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x3c)
char* r9 = *(*(arg1 + 0x30) + 4)
int32_t var_38
int32_t var_34
uint32_t var_30
int32_t var_2c
int32_t var_28

if (r0 != 0 && *(*(r0 + 0xc) + 0xf4) != 0)
    ascension::CWorld::OutputPauseBrief(r9)
    var_34 = 7
    var_30 = *(*(arg1 + 0x34) + 0x54)
    var_38 = 0
    var_2c = 0
    var_28 = 0
    ascension::CWorld::OutputAnimationCard(r9, *(arg1 + 0x3c), 9, 0xb, 0, 7, var_30, 0)
    *(arg1 + 0x3c)
    ascension::CWorld::PopResolveEffect(r9)
    *(arg1 + 0x3c) = 0

void* r0_8 = *(arg1 + 0x34)
int32_t r2 = *(arg1 + 0x38)
int32_t r1_4 = *(r0_8 + 0x60)
CState* entry_r1

if (r2 s<= r1_4)
    void* r6_1 = r0_8 + (r2 << 2) + 0x64
    bool cond:1_1
    
    do
        void* r3_2 = r6_1
        
        if (r2 s>= r1_4)
            r3_2 = r0_8 + 0x50
        
        uint32_t r7_1 = *r3_2
        
        if (r7_1 != 0)
            void* r5_1 = *(r7_1 + 0xc)
            int32_t r3_3 = *(r5_1 + 0xf4)
            
            if (r3_3 != 0)
                core::CWorldBase::OutputMessageFormat(r9, "%s has entered the center row\n", 
                    r5_1 + 4, r3_3, var_38, var_34, var_30, var_2c, var_28)
                ascension::CWorld::PushResolveEffect(r9, r7_1)
                int32_t var_28_1 = 0
                ascension::CWorld::OutputAnimationCard(r9, r7_1, 9, 7, *(*(arg1 + 0x34) + 0x54), 
                    0xb, 0, 0)
                ascension::CWorld::OutputPauseForAnimationToDestination(r9)
                ascensionrules::CreateStateProcessCardEffect(r9, *(arg1 + 0x30), *(r5_1 + 0xf4), 
                    r7_1, *(arg1 + 0x34), nullptr, 0)
                CStateMachine::PushOwnedState(entry_r1)
                int32_t result = *(arg1 + 0x38) + 1
                *(arg1 + 0x38) = result
                *(arg1 + 0x3c) = r7_1
                return result
        
        r6_1 += 4
        cond:1_1 = r2 s< r1_4
        *(arg1 + 0x38) = r2 + 1
        r2 += 1
    while (cond:1_1)

return CStateMachine::PopState(entry_r1)
