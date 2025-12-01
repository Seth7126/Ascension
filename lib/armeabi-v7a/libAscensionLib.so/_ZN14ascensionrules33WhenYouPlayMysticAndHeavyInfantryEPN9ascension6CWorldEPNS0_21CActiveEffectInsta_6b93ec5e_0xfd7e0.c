// 函数: _ZN14ascensionrules33WhenYouPlayMysticAndHeavyInfantryEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfd7e0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) == 0x14 && *(arg3 + 0x4c) == *(arg2 + 0x14))
    void* r0_3 = *(*(arg3 + 0x50) + 0xc)
    
    if (*(r0_3 + 0x88) == 1 && *(r0_3 + 0x8c) == 0)
        if (strcasecmp(r0_3 + 0x44, "Mystic") == 0)
            int32_t* r6_3 = *(arg1 + 0xb80)
            int32_t r7_2 = *(arg1 + 0xb84)
            
            if (r6_3 != r7_2)
                while (true)
                    if ((zx.d(r6_3[1].b) & 1) == 0)
                        void* r0_15 = *r6_3
                        
                        if (r0_15 != 0)
                            void* r0_16 = *(r0_15 + 0xc)
                            
                            if (*(r0_16 + 0x88) == 1 && *(r0_16 + 0x8c) == 0
                                    && strcasecmp(r0_16 + 0x44, "Heavy Infantry") == 0)
                                return 1
                    
                    r6_3 = &r6_3[2]
                    
                    if (r7_2 == r6_3)
                        return 0
        else if (strcasecmp(r0_3 + 0x44, "Heavy Infantry") == 0)
            int32_t* r6_2 = *(arg1 + 0xb80)
            int32_t r7_1 = *(arg1 + 0xb84)
            
            if (r6_2 != r7_1)
                do
                    if ((zx.d(r6_2[1].b) & 1) == 0)
                        void* r0_10 = *r6_2
                        
                        if (r0_10 != 0)
                            void* r0_11 = *(r0_10 + 0xc)
                            
                            if (*(r0_11 + 0x88) == 1 && *(r0_11 + 0x8c) == 0
                                    && strcasecmp(r0_11 + 0x44, "Mystic") == 0)
                                return 1
                    
                    r6_2 = &r6_2[2]
                while (r7_1 != r6_2)

return 0
