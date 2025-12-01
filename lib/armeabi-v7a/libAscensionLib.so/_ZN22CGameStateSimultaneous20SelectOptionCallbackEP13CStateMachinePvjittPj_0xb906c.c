// 函数: _ZN22CGameStateSimultaneous20SelectOptionCallbackEP13CStateMachinePvjittPj
// 地址: 0xb906c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg2 != 0)
    int32_t r5_1 = *(arg2 + 0x34)
    
    if (r5_1 s>= 1)
        void* r0_1 = arg2 + 0x64
        int32_t r1 = 0
        
        do
            if (*(r0_1 - 0xc) == arg3)
                int32_t r5_2 = *(r0_1 - 4)
                int32_t r1_1 = *r0_1
                *(r0_1 - 4) = 0
                *r0_1 = 0
                
                if (r5_2 == 0)
                    return 1
                
                int32_t var_28 = arg5.d
                int32_t var_24 = arg6.d
                uint32_t* var_20 = arg7
                return r5_2(r0_1 - 0x2c, r1_1)
            
            r1 += 1
            r0_1 += 0x30
        while (r1 s< r5_1)

return 0
