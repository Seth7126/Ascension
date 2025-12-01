// 函数: _ZN14ascensionrules48IfOppControlsMostConstructsDestroyAllTheyControlEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x112028
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t i = 0
int32_t r1 = *__stack_chk_guard
int32_t var_30 = 0
int32_t r1_2 = *(arg2 + 0x1c) - *(arg2 + 0x18)
void** var_34 = nullptr
ascension::CPlayer* const& var_38 = nullptr

if (r1_2 s>= 1)
    int32_t r10_1 = 0xffffffff
    
    do
        void* r0_1 = ascension::CWorld::GetPlayerByTurnOrder(arg2, arg3)
        void* var_3c_1 = r0_1
        int32_t r1_5 = *(r0_1 + 0x58) - *(r0_1 + 0x54)
        int32_t r9_1 = r1_5 s>> 2
        
        if (r10_1 s< r1_5 s>> 2)
            void** r1_6 = var_38
            var_34 = r1_6
            
            if (var_30 == r1_6)
                std::__ndk1::vector<ascension::CPlayer*, std::__ndk1::allocator<ascension::CPlayer*> >::__push_back_slow_path<ascension::CPlayer* const&>(
                    &var_38)
                r10_1 = r9_1
            else
                *r1_6 = r0_1
                r10_1 = r9_1
                var_34 = &var_34[1]
        else if (r9_1 == r10_1)
            int32_t* r1_7 = var_34
            
            if (r1_7 == var_30)
                std::__ndk1::vector<ascension::CPlayer*, std::__ndk1::allocator<ascension::CPlayer*> >::__push_back_slow_path<ascension::CPlayer* const&>(
                    &var_38)
            else
                *r1_7 = r0_1
                var_34 = &var_34[1]
        
        i += 1
    while (i s< r1_2 s>> 2)
    
    void* r0_6 = var_34
    void* var_34_1
    
    if (var_38 != r0_6)
        do
            ascension::CPlayer* r6_1 = *(r0_6 - 4)
            
            if (r6_1 != arg3)
                CState* r0_8 = ascensionrules::CreateStateDiscardAllConstructs(r6_1)
                
                if (zx.d(*(arg2 + 0xa2d)) == 0)
                    CStateMachine::PushListState(arg1)
                else
                    ascensionrules::CreateStateProcessPendingAsyncResolveEffect(arg3, arg5, 
                        nullptr, 0, r6_1, r0_8, false)
                    ascension::CPlayer::AddPendingAsyncState(r6_1)
            
            r0_6 = var_34 - 4
            var_34 = r0_6
        while (var_38 != r0_6)
        
        var_34_1 = r0_6
        operator delete(r0_6)
    else if (r0_6 != 0)
        var_34_1 = r0_6
        operator delete(r0_6)

int32_t r0_15 = *__stack_chk_guard

if (r0_15 == r1)
    return r0_15 - r1

__stack_chk_fail()
noreturn
