// 函数: _ZN14ascensionrules23DefeatRandomVoidMonsterEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10c954
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (zx.d(*(arg2 + 0xa14)) != 0)
    return ascension::CPlayer::AddPendingDraw() __tailcall

void* r5 = *(arg2 + 0xa4c)
int32_t* result
core::CCardInstance* r1_3

if (*(arg2 + 0x30) u< 0xb)
    int32_t r7_3 = *(r5 + 0x18)
    result = (*(*arg2 + 0x10))(arg2, 0, r7_3)
    
    if (result s>= r7_3)
        result = nullptr
    
    if (r7_3 != 0)
        int32_t* result_1 = result
        
        while (true)
            result_1 += 1
            
            if (result_1 s>= r7_3)
                result_1 = nullptr
            
            r1_3 = *(*(r5 + 0xc) + (result_1 << 2))
            
            if (r1_3 != 0 && *(*(r1_3 + 0xc) + 0x88) == 3)
                break
            
            if (result_1 == result)
                r1_3 = nullptr
                break
        
    label_10ca90:
        
        if (r1_3 != 0)
            ascensionrules::CreateStateProcessDefeatMonsterSequence(arg3, r1_3, 9, 0, 8, false, 
                true, true, nullptr, 0)
            return CStateMachine::PushListState(arg1) __tailcall
else
    result = *(r5 + 0xc)
    int32_t r2_1 = *(r5 + 0x10)
    
    if (result != r2_1)
        int32_t r1_1 = 0
        
        do
            void* r3_1 = *result
            result = &result[1]
            
            if (*(*(r3_1 + 0xc) + 0x88) == 3)
                r1_1 += 1
        while (r2_1 != result)
        
        if (r1_1 != 0)
            result = (*(*arg2 + 0xc))(arg2)
            void* r1_2 = *(arg2 + 0xa4c)
            core::CCardInstance** r2_3 = *(r1_2 + 0xc)
            int32_t r3_4 = *(r1_2 + 0x10)
            
            if (r2_3 != r3_4)
                while (true)
                    r1_3 = *r2_3
                    
                    if (*(*(r1_3 + 0xc) + 0x88) == 3)
                        if (result == 0)
                            break
                        
                        result -= 1
                    
                    r2_3 = &r2_3[1]
                    
                    if (r3_4 == r2_3)
                        return result
                
                goto label_10ca90
return result
