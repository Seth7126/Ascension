// 函数: sub_19dc84
// 地址: 0x19dc84
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r6
int32_t* var_c = r6
int32_t* var_28 = r6
int32_t result

if (sub_19d38c(arg1, arg2[2], arg5) == 0)
    if (sub_19d38c(arg1, *arg2, arg5) == 0)
        int32_t* r0_3 = *(arg1 + 8)
        int32_t __saved_r7
        return (*(*r0_3 + 0x18))(r0_3, arg2, arg3, arg4, arg5, &__saved_r7)
    
    result = arg2[4]
    bool cond:0_1 = result != arg3
    
    if (result != arg3)
        result = arg2[5]
        cond:0_1 = result != arg3
    
    if (cond:0_1)
        result = arg2[0xb]
        arg2[8] = arg4
        
        if (result != 4)
            int32_t r9_1 = 0
            arg2[0xd].w = 0
            int32_t* r0_4 = *(arg1 + 8)
            var_28 = 1
            (*(*r0_4 + 0x14))(r0_4, arg2, arg3, arg3, 1, arg5)
            
            if (zx.d(*(arg2 + 0x35)) == 0)
                goto label_19dd26
            
            if (zx.d(arg2[0xd].b) != 0)
                result = 3
            else
                r9_1 = 1
            label_19dd26:
                int32_t r0_7 = arg2[9]
                int32_t r1_6 = arg2[0xa]
                arg2[5] = arg3
                arg2[0xa] = r1_6 + 1
                
                if (r0_7 == 1)
                    *(arg2 + 0x36) = 1
                
                result = r9_1 == 0 ? 4 : 3
            
            arg2[0xb] = result
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
