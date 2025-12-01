// 函数: sub_19da7c
// 地址: 0x19da7c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6
int32_t var_c = r6
int32_t r5
int32_t var_10 = r5
int32_t __saved_r7
int32_t* var_28 = &__saved_r7
int32_t var_2c = r6
int32_t var_30 = r5
uint32_t result

if (sub_19d38c(arg1, arg2[2], arg5) == 0)
    if (sub_19d38c(arg1, *arg2, arg5) == 0)
        int32_t r11_1 = *(arg1 + 0xc)
        result = sub_19dc54(arg1 + 0x10, arg2, arg3, arg4, arg5)
        
        if (r11_1 s>= 2)
            int32_t r0_4 = *(arg1 + 8)
            void* r11_2 = &(arg1 + 0x10)[r11_1 * 2]
            int32_t* r5_2 = arg1 + 0x18
            
            if (r0_4 << 0x1e s< 0 || arg2[9] == 1)
                do
                    result = zx.d(*(arg2 + 0x36))
                    
                    if (result != 0)
                        break
                    
                    result = sub_19dc54(r5_2, arg2, arg3, arg4, arg5)
                    r5_2 = &r5_2[2]
                while (r5_2 u< r11_2)
            else if (r0_4 << 0x1f != 0)
                do
                    result = zx.d(*(arg2 + 0x36))
                    
                    if (result != 0)
                        break
                    
                    result = arg2[9]
                    bool cond:1_1 = result == 1
                    
                    if (result == 1)
                        result = arg2[6]
                        cond:1_1 = result == 1
                    
                    if (cond:1_1)
                        break
                    
                    result = sub_19dc54(r5_2, arg2, arg3, arg4, arg5)
                    r5_2 = &r5_2[2]
                while (r5_2 u< r11_2)
            else
                do
                    result = zx.d(*(arg2 + 0x36))
                    
                    if (result != 0)
                        break
                    
                    result = arg2[9]
                    
                    if (result == 1)
                        break
                    
                    result = sub_19dc54(r5_2, arg2, arg3, arg4, arg5)
                    r5_2 = &r5_2[2]
                while (r5_2 u< r11_2)
    else
        result = arg2[4]
        bool cond:0_1 = result != arg3
        
        if (result != arg3)
            result = arg2[5]
            cond:0_1 = result != arg3
        
        if (cond:0_1)
            result = arg2[0xb]
            arg2[8] = arg4
            
            if (result != 4)
                void* r5_3 = arg1 + 0x10
                int32_t r9_1 = 0
                void* r11_3 = r5_3 + (*(arg1 + 0xc) << 3)
                var_28 = nullptr
                
                while (true)
                    if (r5_3 u< r11_3)
                        arg2[0xd].w = 0
                        var_30 = 1
                        sub_19dc1a(r5_3, arg2, arg3, arg3, 1, arg5)
                        
                        if (zx.d(*(arg2 + 0x36)) == 0)
                            if (zx.d(*(arg2 + 0x35)) == 0)
                                goto label_19db8e
                            
                            if (zx.d(arg2[0xd].b) == 0)
                                r9_1 = 1
                                
                                if (zx.d(*(arg1 + 8)) << 0x1f != 0)
                                    goto label_19db8e
                            else
                                if (arg2[6] == 1 || zx.d(*(arg1 + 8)) << 0x1e s>= 0)
                                    result = 3
                                    break
                                    break
                                
                                r9_1 = 1
                                var_28 = 1
                            label_19db8e:
                                r5_3 += 8
                                continue
                                continue
                    
                    if (var_28 << 0x1f == 0)
                        int32_t r0_18 = arg2[9]
                        int32_t r1_7 = arg2[0xa]
                        arg2[5] = arg3
                        arg2[0xa] = r1_7 + 1
                        
                        if (r0_18 == 1)
                            *(arg2 + 0x36) = 1
                    
                    if (r9_1 << 0x1f == 0)
                        result = 4
                        break
                    
                    result = 3
                    break
                
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
