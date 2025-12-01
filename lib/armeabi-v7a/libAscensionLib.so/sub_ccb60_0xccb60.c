// 函数: sub_ccb60
// 地址: 0xccb60
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r6 = *(arg2 + 0x10)
int32_t r0 = *(arg2 + 0x1c)
void* r7 = &r6[(1 << zx.d(*(arg2 + 7))) * 8]
int32_t result

if (r0 s< 1)
    result = 0
    
    if (r6 u>= r7)
        *(arg2 + 0x18) = *(arg1 + 0x58)
        *(arg1 + 0x58) = arg2
    else
    label_ccbf8:
        int32_t r9_1 = 0
        int32_t r10_1 = 0
        
        do
            int32_t r2_4 = r6[6]
            int32_t r0_2 = r6[2]
            int32_t r1_4 = r2_4 & 0x40
            
            if (r0_2 == 0)
                if (r1_4 != 0 && (zx.d(*(r6[4] + 5)) & 3) != 0)
                    r6[6] = 0xb
            else if (r1_4 == 0)
            label_ccc48:
                
                if ((r0_2 & 0x40) != 0)
                label_ccc50:
                    void* r1_6 = *r6
                    
                    if ((zx.d(*(r1_6 + 5)) & 3) != 0)
                        sub_cae14(arg1, r1_6)
                        result = 1
            else
                void* r1_5 = r6[4]
                
                if ((r2_4 & 0xf) == 4)
                    if (r1_5 != 0 && (zx.d(*(r1_5 + 5)) & 3) != 0)
                        sub_cae14(arg1, r1_5)
                        r0_2 = r6[2]
                    
                    goto label_ccc48
                
                int32_t r0_8 = r0_2 & 0x40
                
                if ((zx.d(*(r1_5 + 5)) & 3) != 0)
                    r10_1 = 1
                    
                    if (r0_8 != 0)
                        r10_1 = 1
                        
                        if ((zx.d(*(*r6 + 5)) & 3) != 0)
                            r9_1 = 1
                else if (r0_8 != 0)
                    goto label_ccc50
            
            r6 = &r6[8]
        while (r6 u< r7)
        
        if (r9_1 != 0)
            *(arg2 + 0x18) = *(arg1 + 0x60)
            *(arg1 + 0x60) = arg2
        else if (r10_1 == 0)
            *(arg2 + 0x18) = *(arg1 + 0x58)
            *(arg1 + 0x58) = arg2
        else
            *(arg2 + 0x18) = *(arg1 + 0x64)
            *(arg1 + 0x64) = arg2
else
    int32_t r6_1 = 0
    result = 0
    
    do
        int32_t r1_2 = *(arg2 + 0xc)
        
        if ((zx.d(*(r1_2 + (r6_1 << 4) + 8)) & 0x40) != 0)
            void* r1_3 = *(r1_2 + (r6_1 << 4))
            
            if ((zx.d(*(r1_3 + 5)) & 3) != 0)
                sub_cae14(arg1, r1_3)
                r0 = *(arg2 + 0x1c)
                result = 1
        
        r6_1 += 1
    while (r6_1 s< r0)
    
    r6 = *(arg2 + 0x10)
    
    if (r6 u< r7)
        goto label_ccbf8
    
    *(arg2 + 0x18) = *(arg1 + 0x58)
    *(arg1 + 0x58) = arg2

return result
