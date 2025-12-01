// 函数: _ZN14ascensionrules35CStateProcessDiscardConstructInPlay11UpdateStateER13CStateMachine
// 地址: 0x13cd18
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (zx.d(*(arg1 + 0x2bc)) != 0)
    int32_t* r6_1 = *(arg1 + 0x2b0)
    int32_t r0_1 = *(arg1 + 0x2b4)
    *(arg1 + 0x2bc) = 0
    
    if (r6_1 != r0_1)
        int32_t r1_3
        
        do
            int32_t r7_1 = *r6_1
            int32_t r4_1 = *(arg1 + 0x250)
            void** r0_2 = operator new(0x3c)
            CState::CState()
            *r0_2 = _vtable_for_ascensionrules::CStateDiscardConstruct + 8
            r0_2[0xc] = r4_1
            r0_2[0xd] = r7_1
            r0_2[0xe].b = 0
            CState::AddOwnedChild(arg1)
            CStateList::AppendState(arg1)
            r1_3 = *(arg1 + 0x2b4)
            r6_1 = &r6_1[1]
        while (r6_1 != r1_3)
        
        int32_t* r0_5 = *(arg1 + 0x25c)
        
        if (r0_5 != 0)
            void* r2_1 = *(arg1 + 0x250)
            
            if (r2_1 != 0 && r1_3 != *(arg1 + 0x2b0))
                void* r3_4 = r0_5 + *r0_5 + 4
                uint32_t r1_6 = zx.d(*r3_4)
                
                if (r1_6 u<= 7)
                    uint32_t r2_3 = zx.d(*(r2_1 + 8))
                    *r3_4 = r1_6.b + 1
                    void* r0_9 = &r0_5[*r0_5 * 8 + r1_6]
                    *(r0_9 + 0x10) = r2_3
                    return r0_9
        
        return r0_5

return CGameStateOptions::UpdateState(arg1) __tailcall
