// 函数: GetGamePlayerState
// 地址: 0x1897a4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0 = *s_pWorldData

if (r0 != 0)
    int32_t r2_1 = *(r0 + 0xd4)
    
    if (r2_1 s>= 1)
        int32_t r5_1 = 0
        int32_t r6_1 = 0
        
        do
            if (*(r0 + 0x14 + r5_1) == arg1)
                *arg2 = arg1
                ascension::CPlayer* r6_2 = *(r0 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                
                if (r6_2 != 0)
                    void* r0_3 = ascension::CWorld::GetPlayerByIndex(r6_2)
                    
                    if (r0_3 != 0)
                        void* r0_4 = *(r6_2 + 0xb20)
                        uint32_t r0_8
                        
                        if (r0_4 == 0)
                            r0_8 = 0
                        else
                            int32_t temp0_1 = 0
                            uint32_t i = zx.d(*(r0_4 + 8)) - zx.d(*(r0_3 + 8))
                            
                            while (i != 0)
                                i u>>= 1
                                temp0_1 += 1
                            
                            r0_8 = (0x20 - temp0_1) u>> 5
                        
                        arg2[1] = r0_8
                        
                        if (ascension::CWorld::GetPlayerTurnOrderIndex(r6_2, nullptr)
                                == 0xffffffff + ((*(r6_2 + 0x1c) - *(r6_2 + 0x18)) s>> 2))
                            arg2[1] |= 2
                        
                        uint32_t r0_15 = *s_pWorldData
                        
                        if (zx.d(*(r0_15 + r5_1 + 0x1e)) == 4)
                            arg2[1] |= 4
                        
                        if ((zx.d(*(r0_15 + 0xe)) & 0x80) != 0)
                            void* r0_17 = *(r0_3 + 0x184)
                            
                            if (r0_17 != 0)
                                int32_t r0_19 = *(*(r0_17 + 0xc) + 0x8c)
                                
                                if ((r0_19 & 2) != 0)
                                    arg2[1] |= 8
                                
                                if ((r0_19 & 4) != 0)
                                    arg2[1] |= 0x10
                                
                                if ((r0_19 & 8) != 0)
                                    arg2[1] |= 0x20
                                
                                if ((r0_19 & 0x10) != 0)
                                    arg2[1] |= 0x40
                        
                        arg2[2] = *(r0_3 + 0x90)
                        uint32_t r5_2 = 0
                        arg2[3] = *(*(r0_3 + 0x3c) + 0x18)
                        arg2[4] = *(*(r0_3 + 0x38) + 0x18)
                        arg2[5] = *(*(r0_3 + 0x40) + 0x18)
                        arg2[6] = ascension::CPlayer::CountConstructsInPlay(r0_3, false, nullptr)
                        arg2[7] = *(r0_3 + 0x88)
                        int32_t r0_32 = 0
                        void* r1_15 = *(r0_3 + 0x44)
                        
                        if (r1_15 != 0)
                            r0_32 = *(r1_15 + 0x18)
                        
                        arg2[8] = r0_32
                        arg2[9] = *(r0_3 + 0x8c)
                        arg2[0xa] = ascension::CPlayer::GetHonorCardTotal()
                        void* r0_36 = *(r0_3 + 0x38)
                        
                        if (r0_36 != 0)
                            r5_2 = zx.d(*(r0_36 + 8))
                        
                        arg2[0xb] = r5_2
                        return 0x30
                
                break
            
            r6_1 += 1
            r5_1 += 0x30
        while (r6_1 s< r2_1)

*arg2 = 0
__aeabi_memclr4(&arg2[2], 0x28)
return 0x30
