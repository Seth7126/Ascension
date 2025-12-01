// 函数: _ZN14ascensionrules17CStateHandleEvent11UpdateStateER13CStateMachine
// 地址: 0x152fc8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x30) == 0)
    void* r12_1 = *(arg1 + 0x3c)
    int32_t r2_1 = *(arg1 + 0x48)
    uint32_t lr_1 = zx.d(*(r12_1 + 8))
    
    if (r2_1 u< lr_1)
        int32_t r5_1 = *(arg1 + 0x44)
        
        do
            ascension::CEvent* r3_1 = *(r12_1 + (r2_1 << 2) + 0xc)
            CStateMachine* r0_2 = *(r3_1 + 0xc)
            
            if (*(r0_2 + 0x1c4) == r5_1)
                void* var_20 = r12_1
                uint32_t entry_r1
                
                if (ascension::CTriggeredEffectDefinition::ProcessTriggerEffect(r0_2, entry_r1, 
                        *(arg1 + 0x4c), r3_1) != 0)
                    int32_t r0_7 = *(arg1 + 0x4c) + 1
                    *(arg1 + 0x4c) = r0_7
                    return r0_7
                
                int32_t r0_9 = *(arg1 + 0x48) + 1
                *(arg1 + 0x48) = r0_9
                *(arg1 + 0x4c) = 0
                return r0_9
            
            r2_1 += 1
            *(arg1 + 0x48) = r2_1
            *(arg1 + 0x4c) = 0
        while (r2_1 u< lr_1)

return CStateList::UpdateState(arg1) __tailcall
