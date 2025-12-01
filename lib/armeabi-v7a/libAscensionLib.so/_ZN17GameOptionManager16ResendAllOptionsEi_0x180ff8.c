// 函数: _ZN17GameOptionManager16ResendAllOptionsEi
// 地址: 0x180ff8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = 0
int32_t result
int32_t entry_r1

if (*(arg1 + 0x20) == entry_r1)
label_181074:
    result = *(r1.w * 0xa4 + arg1 + 0xb8)
    
    if (result != 0)
        int32_t r2_1 = *(arg1 + 8)
        
        if (r2_1 != 0)
            result = r2_1(*(arg1 + 0xc), entry_r1)
        
        int32_t r4_1 = *(arg1 + 0x10)
        
        if (r4_1 != 0)
            result = *(r1.w * 0xa4 + arg1 + 0xb8)
            
            if (result s>= 1)
                int32_t r7_1 = 1
                int32_t r8_1 = 0
                
                while (true)
                    int32_t* r2_3 = *(r1.w * 0xa4 + arg1 + 0xc0) + r8_1
                    r4_1(*(arg1 + 0x14), *r2_3, r2_3 + 9, zx.d(r2_3[1].w), zx.d(*(r2_3 + 6)), 
                        entry_r1, r1)
                    result = *(r1.w * 0xa4 + arg1 + 0xb8)
                    
                    if (r7_1 s>= result)
                        break
                    
                    r8_1 += 0x40
                    r4_1 = *(arg1 + 0x10)
                    r7_1 += 1
        
        int32_t r7_2 = *(arg1 + 0x18)
        
        if (r7_2 != 0)
            void* r6_2 = r1.w * 0xa4 + arg1
            return r7_2(*(arg1 + 0x1c), entry_r1, r6_2 + 0x2c, *(r6_2 + 0x24), *(r6_2 + 0x28), 
                entry_r1, r1)
else
    r1 = 1
    
    if (*(arg1 + 0xc4) == entry_r1)
        goto label_181074
    
    r1 = 2
    
    if (*(arg1 + 0x168) == entry_r1)
        goto label_181074
    
    r1 = 3
    
    if (*(arg1 + 0x20c) == entry_r1)
        goto label_181074
    
    r1 = 4
    
    if (*(arg1 + 0x2b0) == entry_r1)
        goto label_181074
    
    result = *(arg1 + 0x354)
    r1 = 5
    
    if (result == entry_r1)
        goto label_181074

return result
