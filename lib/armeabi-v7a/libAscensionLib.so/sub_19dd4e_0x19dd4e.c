// 函数: sub_19dd4e
// 地址: 0x19dd4e
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t result

if (sub_19d38c(arg1, arg2[2], arg5) == 0)
    result = sub_19d38c(arg1, *arg2, arg5)
    
    if (result != 0)
        result = arg2[4]
        bool cond:0_1 = result != arg3
        
        if (result != arg3)
            result = arg2[5]
            cond:0_1 = result != arg3
        
        if (cond:0_1)
            int32_t r0_2 = arg2[9]
            int32_t r1_2 = arg2[0xa]
            arg2[5] = arg3
            arg2[8] = arg4
            arg2[0xa] = r1_2 + 1
            
            if (r0_2 == 1)
                *(arg2 + 0x36) = 1
            
            result = 4
            arg2[0xb] = 4
        else if (arg4 == 1)
            result = 1
            arg2[8] = 1
else
    result = arg2[1]
    
    if (result == arg3)
        result = arg2[7]
        
        if (result != 1)
            arg2[7] = arg4

return result
