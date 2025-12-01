// 函数: sub_19fb7c
// 地址: 0x19fb7c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* r3 = *arg1
int32_t r12 = arg1[1]

if (r12 != r3)
    uint32_t r2_1 = zx.d(*r3)
    
    if (r2_1 u>= 0x30)
        bool cond:0_1 = r2_1 u> 0x3a
        
        if (r2_1 u>= 0x3a)
            cond:0_1 = zx.d(r2_1.b - 0x41) u> 0x19
        
        if (not(cond:0_1))
            int32_t lr = 0
            
            while (r12 != r3)
                uint32_t r2_4 = zx.d(*r3)
                
                if (r2_4 u< 0x30)
                    break
                
                int32_t r5_1
                
                if (r2_4 u>= 0x3a)
                    if (zx.d(r2_4.b - 0x41) u>= 0x1a)
                        break
                    
                    r5_1 = 0xffffffc9
                else
                    r5_1 = 0xffffffd0
                
                r3 = &r3[1]
                *arg1 = r3
                lr = r5_1 + lr * 0x24 + r2_4
            
            *arg2 = lr
            return 0

return 1
