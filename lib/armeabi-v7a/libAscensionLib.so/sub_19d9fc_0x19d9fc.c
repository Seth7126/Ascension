// 函数: sub_19d9fc
// 地址: 0x19d9fc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = *(arg2 + 4)
*(arg2 + 0x35) = 1

if (result == arg4)
    int32_t r3 = *(arg2 + 0x10)
    *(arg2 + 0x34) = 1
    
    if (r3 == 0)
        *(arg2 + 0x18) = arg5
        bool cond:2_1 = arg5 != 1
        *(arg2 + 0x10) = arg3
        result = *(arg2 + 0x30)
        *(arg2 + 0x24) = 1
        
        if (arg5 == 1)
            cond:2_1 = result != 1
        
        if (not(cond:2_1))
            *(arg2 + 0x36) = 1
            return 1
    else
        if (r3 != arg3)
            int32_t r0 = *(arg2 + 0x24)
            *(arg2 + 0x36) = 1
            *(arg2 + 0x24) = r0 + 1
            return r0 + 1
        
        int32_t r2 = *(arg2 + 0x18)
        
        if (r2 == 2)
            *(arg2 + 0x18) = arg5
            r2 = arg5
        
        result = *(arg2 + 0x30)
        
        if (result != 1)
            return result
        
        if (r2 == 1)
            *(arg2 + 0x36) = 1
            return 1

return result
