// 函数: _ZN22CGameStateSimultaneous23CloneSimultaneousStatesEPN4core10CWorldBaseERPcRj
// 地址: 0xb8d58
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result = *(arg1 + 0x28)

if (result != 0)
    result = __dynamic_cast(result, _typeinfo_for_CState, _typeinfo_for_CGameStateSimultaneous, 0)
    
    if (result != 0)
        void* result_1 = result
        *(arg1 + 0x34) = *(result + 0x34)
        result = *(result_1 + 0x34)
        
        if (result s>= 1)
            int32_t r8_1 = 0
            int32_t r9_1 = 0
            
            do
                void* r10_1 = arg1 + r8_1
                *(arg1 + 0x30)
                CStateMachine::SetParentStateMachine(r10_1 + 0x38)
                void* r6_1 = result_1 + r8_1
                int32_t r3
                int32_t var_38_1 = r3
                int32_t r0_4 =
                    CStateMachine::CloneStateMachine(r10_1 + 0x38, r6_1 + 0x38, arg2, arg3)
                *(r10_1 + 0x58) = *(r6_1 + 0x58)
                uint32_t r0_6 = 1
                
                if (zx.d(*(r6_1 + 0x5c)) == 0)
                    r0_6 = zx.d(arg2[0x285].b)
                    
                    if (r0_6 != 0)
                        r0_6 = 1
                
                *(r10_1 + 0x5c) = r0_6.b
                *(r10_1 + 0x60) = 0
                *(r10_1 + 0x64) = 0
                
                if (r0_4 != 0)
                    CState::AddOwnedChild(arg1)
                
                result = *(result_1 + 0x34)
                r9_1 += 1
                r8_1 += 0x30
            while (r9_1 s< result)

return result
