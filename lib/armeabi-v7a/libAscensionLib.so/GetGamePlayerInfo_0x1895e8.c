// 函数: GetGamePlayerInfo
// 地址: 0x1895e8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r2 = *s_pWorldData

if (r2 != 0)
    int32_t r12_1 = *(r2 + 0xd4)
    
    if (r12_1 s>= 1)
        int32_t* lr_1 = r2 + 0x14
        int32_t r3_1 = 0
        
        do
            if (*lr_1 == arg1)
                *arg2 = arg1
                int32_t temp0 = 0
                uint32_t i = zx.d(*(lr_1 + 0xa)) - 4
                
                while (i != 0)
                    i u>>= 1
                    temp0 += 1
                
                arg2[1] = (0x20 - temp0) u>> 5
                arg2[2].w = lr_1[1].w
                strcpy(arg2 + 0xa, &lr_1[4])
                return 0x2c
            
            r3_1 += 1
            lr_1 = &lr_1[0xc]
        while (r3_1 s< r12_1)

*(arg2 + 0xa) = 0
arg2[2].w = 0
*arg2 = 0
arg2[1] = 0
return 0x2c
