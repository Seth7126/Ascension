// 函数: _ZN14ascensionrules23GainTempleOfImmortalityEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1164d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* r6 = *(arg2 + 0xa70)
ascension::CWorld* r5 = arg2
int32_t r7 = *(arg2 + 0xa74)
CStateMachine* r0_18

if (r6 == r7)
label_116544:
    int32_t result = (*(r5 + 0x1c) - *(r5 + 0x18)) s>> 2
    
    if (result u< 2)
        return result
    
    int32_t r7_1 = 1
    ascension::CWorld* var_2c_1 = r5
    void* r0_6
    void** r9_1
    int32_t r10_1
    
    while (true)
        r0_6 = ascension::CWorld::GetPlayerByTurnOrder(r5, arg3)
        r9_1 = *(r0_6 + 0x48)
        r10_1 = *(r0_6 + 0x4c)
        
        if (r9_1 != r10_1)
            break
        
    label_1165bc:
        r5 = var_2c_1
        r7_1 += 1
        result = *(r5 + 0x1c) - *(r5 + 0x18)
        
        if (r7_1 u>= result s>> 2)
            return result
    
    while (true)
        int32_t* r8_1 = *r9_1
        core::CCardInstance* r5_1 = r8_1[4]
        void* r0_7 = *(r5_1 + 0xc)
        
        if (*(r0_7 + 0x88) == 0xa && strcasecmp(r0_7 + 4, "Temple of Immortality") == 0)
            core::CWorldBase::OutputMessageFormat(var_2c_1, "%s acquires %s from %s\n", 
                arg3 + 0x10, (*(*r8_1 + 0xc))(r8_1), r0_6 + 0x10)
            ascensionrules::CreateStateProcessAcquireCardSequence(arg3, r5_1, 5, zx.d(r8_1[2].w), 
                5, nullptr, 0)
            r0_18 = arg1
            break
        
        r9_1 = &r9_1[1]
        
        if (r10_1 == r9_1)
            goto label_1165bc
else
    while (true)
        core::CCardInstance* r4_1 = *r6
        void* r0 = *(r4_1 + 0xc)
        
        if (*(r0 + 0x88) == 0xa && strcasecmp(r0 + 4, "Temple of Immortality") == 0)
            core::CWorldBase::OutputMessageFormat(r5, "%s acquires %s from Available Temples\n", 
                arg3 + 0x10, (*(*r4_1 + 0xc))(r4_1))
            ascensionrules::CreateStateProcessAcquireCardSequence(arg3, r4_1, 0x17, 0, 5, nullptr, 
                0)
            r0_18 = arg1
            break
        
        r6 = &r6[1]
        
        if (r7 == r6)
            goto label_116544

return CStateMachine::PushListState(r0_18) __tailcall
