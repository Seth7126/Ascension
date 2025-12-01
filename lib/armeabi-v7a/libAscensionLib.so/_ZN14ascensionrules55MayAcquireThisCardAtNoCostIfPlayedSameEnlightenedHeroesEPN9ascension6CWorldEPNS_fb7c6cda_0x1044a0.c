// 函数: _ZN14ascensionrules55MayAcquireThisCardAtNoCostIfPlayedSameEnlightenedHeroesEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x1044a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 6)
    return 0

if (*(arg3 + 0x50) s>= 1)
    int32_t r0_2 = *(arg2 + 0x10)
    int32_t r6_1 = 0
    
    while (true)
        int32_t r1 = r6_1 * 0x11
        
        if (*(*(arg3 + 0x54) + (r1 << 2)) == r0_2 && *(arg3 + 0x4c) == *(arg1 + 0xb20))
            int32_t* r8_1 = *(arg1 + 0xb80)
            void* r9_1 = *(arg1 + 0xb84)
            
            if (r8_1 != r9_1)
                while (true)
                    if ((zx.d(r8_1[1].b) & 1) == 0)
                        void* r2_1 = *r8_1
                        
                        if (r2_1 != 0)
                            void* r10_1 = *(r2_1 + 0xc)
                            
                            if (*(r10_1 + 0x88) == 1)
                                if (ascension::CWorld::QueryCardFaction(arg1, *(arg3 + 0x4c), r2_1)
                                        == 0)
                                    r9_1 = *(arg1 + 0xb84)
                                    r8_1 = &r8_1[2]
                                    
                                    if (r8_1 == r9_1)
                                        break
                                    
                                    continue
                                
                                r9_1 = &r8_1[2]
                                
                                if (r9_1 != *(arg1 + 0xb84))
                                    while (true)
                                        if ((zx.d(*(r9_1 + 4)) & 1) == 0)
                                            void* r2_2 = *r9_1
                                            
                                            if (r2_2 != 0)
                                                void* r7_1 = *(r2_2 + 0xc)
                                                
                                                if (*(r7_1 + 0x88) == 1 &&
                                                        ascension::CWorld::QueryCardFaction(arg1, 
                                                        *(arg3 + 0x4c), r2_2) != 0)
                                                    if (r7_1 == r10_1)
                                                        *(*(arg3 + 0x54) + (r1 << 2) + 0x14) = 0
                                                        break
                                                    
                                                    if (*(arg1 + 0x30) u>= 0x17 &&
                                                            strcasecmp(r7_1 + 0x44, r10_1 + 0x44) == 0)
                                                        *(*(arg3 + 0x54) + (r1 << 2) + 0x14) = 0
                                                        break
                                        
                                        r9_1 += 8
                                        
                                        if (r9_1 == *(arg1 + 0xb84))
                                            goto label_10451c
                                
                                break
                    
                label_10451c:
                    r8_1 = &r8_1[2]
                    
                    if (r8_1 == r9_1)
                        break
        
        r6_1 += 1
        
        if (r6_1 s>= *(arg3 + 0x50))
            break

return 1
