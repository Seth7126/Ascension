// 函数: _ZN14ascensionrules30CStateTransformConstructInPlay11UpdateStateER13CStateMachine
// 地址: 0x141580
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x30) == 0 && *(arg1 + 0x38) s<= 0)
    void* r1_2 = *(arg1 + 0x254)
    
    if (r1_2 != 0)
        ascension::CWorld* r5 = *(*(arg1 + 0x24c) + 4)
        *(arg1 + 0x254) = 0
        core::CCardInstance* r6 = *(r1_2 + 0x10)
        void* r7 = *(r6 + 0xc)
        int32_t result = *(r7 + 0x150)
        
        if (result != 0)
            result = ascension::CPlayer::RemoveConstructFromPlay(*(r1_2 + 0xc))
            
            if (result != 0)
                bool r0_6 = true
                ascension::CCard* r3_1 = *(r7 + 0x150)
                
                if (*(r5 + 0x30) u>= 0x22)
                    int32_t temp0_1 = 0
                    uint32_t i = *(r3_1 + 0x88) - 2
                    
                    while (i != 0)
                        i u>>= 1
                        temp0_1 += 1
                    
                    r0_6 = ((0x20 - temp0_1) u>> 5).b
                
                ascensionrules::TransformCard(r5, *(arg1 + 0x24c), r6, r3_1, r0_6)
                return ascension::CWorld::PopResolveEffect(r5) __tailcall
        
        return result

return CGameStateOptions::UpdateState(arg1) __tailcall
