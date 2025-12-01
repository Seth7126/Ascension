// 函数: _ZN17GameOptionManager23OptionListBeginListenerEPvj
// 地址: 0x18065c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg1 == 0)
    return 

void* r3_1 = arg1 + 0x20
int32_t r2 = *r3_1
int16_t lr

if (r2 == 0)
    lr = 0
else
    lr = 0
    
    if (r2 != arg2)
        lr = 1
        r3_1 = arg1 + 0xc4
        int32_t r2_1 = *r3_1
        
        if (r2_1 != 0 && r2_1 != arg2)
            lr = 2
            r3_1 = arg1 + 0x168
            int32_t r2_2 = *r3_1
            
            if (r2_2 != 0 && r2_2 != arg2)
                lr = 3
                r3_1 = arg1 + 0x20c
                int32_t r2_3 = *r3_1
                
                if (r2_3 != 0 && r2_3 != arg2)
                    lr = 4
                    r3_1 = arg1 + 0x2b0
                    int32_t r2_4 = *r3_1
                    
                    if (r2_4 != 0 && r2_4 != arg2)
                        lr = 5
                        r3_1 = arg1 + 0x354
                        int32_t r2_5 = *r3_1
                        
                        if (r2_5 != 0 && r2_5 != arg2)
                            return 

*(arg1 + 0x3f8) = r3_1
*r3_1 = arg2
*(lr * 0xa4 + arg1 + 0x2c) = 0
void* r0 = *(arg1 + 0x3f8)
*(r0 + 0x98) = 0
*(r0 + 4) = 0
*(r0 + 8) = 0
