// 函数: _ZNK20NetworkClientManager19GetGameWaitingCountEv
// 地址: 0x185624
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t* i = *(entry_r0 + 0xdc)
int32_t result = 0

for (; i != *(entry_r0 + 0xe0); i = &i[1])
    void* r1_1 = *i
    
    if (*(r1_1 + 0xa04) != 1)
        int32_t r4_3 = *(r1_1 + 0xa08)
        
        if (r4_3 != 0)
            void* r6_4 = r1_1 + 0x14
            int32_t r5_4 = 0
            
            do
                if (*r6_4 == *(entry_r0 + 0xa4))
                    if ((zx.d(*(r1_1 + 0xd8)) & 1 << (r5_4 & 0xff)) != 0)
                        result += 1
                    
                    break
                
                r5_4 += 1
                r6_4 += 0x30
            while (r5_4 u< r4_3)
    else
        int32_t j = *(entry_r0 + 0xa4)
        int32_t r5_1 = *(r1_1 + 0x14)
        
        if (r5_1 != j)
            int32_t r5_5 = *(r1_1 + 0xa08)
            
            if (r5_5 u>= 2)
                void* r1_3 = r1_1 + 0x4e
                int32_t r6_5 = 1
                
                while (*(r1_3 - 0xa) != j || zx.d(*r1_3) != 2)
                    r6_5 += 1
                    r1_3 += 0x30
                    
                    if (r6_5 u>= r5_5)
                        goto label_185744
                
                result += 1
        else
            int32_t r4_2 = *(r1_1 + 0xa08)
            
            if (*(r1_1 + 0xd4) s>= r4_2)
                if (r4_2 == 0)
                    result += 1
                else if (r5_1 != 0)
                    void* r5_2 = r1_1 + 0x44
                    int32_t r1_2 = 0
                    
                    while (true)
                        if (zx.d(*(r5_2 - 0x26)) != 1)
                            goto label_185744
                        
                        r1_2 += 1
                        
                        if (r1_2 u>= r4_2)
                            break
                        
                        bool cond:0_1 = *r5_2 != 0
                        r5_2 += 0x30
                        
                        if (not(cond:0_1))
                            goto label_185744
                    
                    result += 1
    
label_185744:

return result
