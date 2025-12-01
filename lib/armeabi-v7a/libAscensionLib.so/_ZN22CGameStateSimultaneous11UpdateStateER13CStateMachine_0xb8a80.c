// 函数: _ZN22CGameStateSimultaneous11UpdateStateER13CStateMachine
// 地址: 0xb8a80
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg1 + 0x34) s>= 1)
    void* __offset(CStateMachine, 0x38) r6_1 = arg1 + 0x38
    int32_t r9_1 = 1
    int32_t r7_1 = 0
    int32_t r5_1 = 0
    int32_t result
    
    do
        if (zx.d(*(r6_1 + 0x24)) == 0)
            int32_t* r0_1 = *r6_1
            
            if (r0_1 != 0 && (*(*r0_1 + 0x1c))(r0_1, *(r6_1 + 0x20)) == 0)
                CStateMachine::Update()
                r5_1 = 1
                r9_1 = 0
        
        result = *(arg1 + 0x34)
        r7_1 += 1
        r6_1 += 0x30
    while (r7_1 s< result)
    
    if (result s>= 1)
        void* __offset(CStateMachine, 0x38) r6_2 = arg1 + 0x38
        int32_t r7_2 = 0
        
        do
            if ((r5_1 & 1) == 0)
                r5_1 = 0
                
                if (zx.d(*(r6_2 + 0x24)) != 0)
                    int32_t* r0_8 = *r6_2
                    
                    if (r0_8 != 0 && (*(*r0_8 + 0x1c))(r0_8, *(r6_2 + 0x20)) == 0)
                        CStateMachine::Update()
                        r9_1 = 0
                        r5_1 = 1
            else
                r5_1 = 1
            
            result = *(arg1 + 0x34)
            r7_2 += 1
            r6_2 += 0x30
        while (r7_2 s< result)
    
    if ((r9_1 & 1) == 0)
        return result

CState* entry_r1
return CStateMachine::PopState(entry_r1)
