// 函数: _Z28HandleEventHeroCardPutInPlayjjjb
// 地址: 0x18ebe8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t (* const result)() = s_InterfaceContext

if (zx.d(*(*(s_InterfaceContext + 0xc) + 8)) == arg1)
    int32_t r4_1 = arg4
    uint32_t r2_2 = *s_pWorldData
    uint32_t r7_1
    
    if (r2_2 == 0)
        r7_1 = 0
    else
        r7_1 = *(r2_2 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
    
    void* r8_1 = *(core::CWorldBase::GetInstanceByID(r7_1) + 0xc)
    
    if (strcasecmp("Canon Templar", r8_1 + 4) == 0)
        int32_t r1_2 = zx.d(*(s_localPlayerStats + 0xda)) | 0x10
        *(s_localPlayerStats + 0xda) = r1_2.b
        
        if ((r1_2 & 0x1c) == 0x1c && r4_1 == 0)
            int32_t* r0_24 = data_1f5894
            
            if (r0_24 != 0 && &r0_24[6] u< data_1f5898 + data_1f589c)
                r0_24[1] = 0x25
                *r0_24 = 0x18
                data_1f5894 = &r0_24[6]
                data_1f5890 += 1
                r0_24[4] = 1
                r0_24[5] = 0
                r0_24[2] = 0x30
    
    if (strcasecmp("Naka, Emri's Chosen", r8_1 + 4) == 0)
        uint32_t r0_8 = zx.d(*(s_localPlayerStats + 0xff))
        *(s_localPlayerStats + 0xfe) = 1
        
        if (r4_1 != 0 || r0_8 == 0)
            goto label_18ed14
        
        goto label_18ed08
    
    if (strcasecmp("Emri, Soulstealer", r8_1 + 4) != 0)
    label_18ed14:
        
        if (r4_1 == 0)
        label_18ed28:
            
            if (strcasecmp("Deadeye Assassin", r8_1 + 4) == 0)
                core::CCardInstance* r0_14 = core::CWorldBase::GetInstanceByID(r7_1)
                void* r0_15 = *(r0_14 + 0x40)
                int32_t* i = *(r0_15 + 0xc)
                
                if (i != *(r0_15 + 0x10))
                    int32_t r9_1 = 0
                    
                    do
                        int32_t r2_3 = *i
                        i = &i[1]
                        r9_1 += ascension::CWorld::QueryCardFaction(r7_1, r0_14, r2_3)
                    while (i != *(*(r0_14 + 0x40) + 0x10))
                    
                    if (r9_1 u>= 0xa)
                        int32_t* r0_19 = data_1f5894
                        
                        if (r0_19 != 0 && &r0_19[6] u< data_1f5898 + data_1f589c)
                            r0_19[1] = 0x25
                            *r0_19 = 0x18
                            data_1f5894 = &r0_19[6]
                            data_1f5890 += 1
                            r0_19[4] = 1
                            r0_19[5] = 0
                            r0_19[2] = 0x3a
            
            char const* const __s1 = "Sureshot Tracker"
            
            if (strcasecmp("Sureshot Tracker", r8_1 + 4) == 0)
                __s1 = "Flare Tracker"
            label_18ee54:
                void** r5_1 = *(r7_1 + 0xb80)
                int32_t r7_2 = *(r7_1 + 0xb84)
                
                if (r5_1 != r7_2)
                    do
                        void* r0_20 = *r5_1
                        r5_1 = &r5_1[2]
                        
                        if (strcasecmp(__s1, *(r0_20 + 0xc) + 4) == 0)
                            int32_t* r0_25 = data_1f5894
                            
                            if (r0_25 != 0 && &r0_25[6] u< data_1f5898 + data_1f589c)
                                r0_25[1] = 0x25
                                *r0_25 = 0x18
                                data_1f5894 = &r0_25[6]
                                data_1f5890 += 1
                                r0_25[4] = 1
                                r0_25[5] = 0
                                r0_25[2] = 0x39
                            
                            break
                    while (r7_2 != r5_1)
            else if (strcasecmp("Flare Tracker", r8_1 + 4) == 0)
                goto label_18ee54
    else
        uint32_t r1_5 = zx.d(*(s_localPlayerStats + 0xfe))
        *(s_localPlayerStats + 0xff) = 1
        
        if (r1_5 == 0 || r4_1 != 0 || 1 == 0)
            goto label_18ed14
        
    label_18ed08:
        int32_t* r0_9 = data_1f5894
        
        if (r0_9 == 0 || &r0_9[6] u>= data_1f5898 + data_1f589c)
            goto label_18ed14
        
        r0_9[1] = 0x25
        *r0_9 = 0x18
        data_1f5894 = &r0_9[6]
        data_1f5890 += 1
        r0_9[4] = 1
        r0_9[5] = 0
        r0_9[2] = 0x51
        
        if (r4_1 == 0)
            goto label_18ed28
    
    if (r8_1 == 0 || zx.d(*(*s_pWorldData + 0xe)) != 4)
        result = *(r8_1 + 0x88)
    else
        result = *(r8_1 + 0x88)
        
        if (result == 1)
            if (ascension::CCard::IsCardFaction(r8_1) != 0)
                int32_t r1_32 = *(s_localPlayerStats + 0xe4) + 1
                *(s_localPlayerStats + 0xe4) = r1_32
                
                if (r1_32 u>= 5 && r4_1 == 0)
                    int32_t* r0_30 = data_1f5894
                    
                    if (r0_30 != 0 && &r0_30[6] u< data_1f5898 + data_1f589c)
                        r0_30[1] = 0x25
                        *r0_30 = 0x18
                        data_1f5894 = &r0_30[6]
                        data_1f5890 += 1
                        r0_30[4] = 1
                        r0_30[5] = 0
                        r0_30[2] = 0x19
            
            result = *(r8_1 + 0x88)
    
    if (result == 5)
        uint32_t r5_2 = *ascensionrules::s_SoulGemDeckSet4ListCount
        
        if (r5_2 != 0)
            int32_t r6_2 = 0
            
            do
                if (r4_1 == 0 &&
                        strcasecmp(r8_1 + 4, *(ascensionrules::s_SoulGemDeckSet4List + (r6_2 << 3))) == 0)
                    int32_t* r0_33 = data_1f5894
                    
                    if (r0_33 != 0 && &r0_33[6] u< data_1f5898 + data_1f589c)
                        r0_33[1] = 0x25
                        *r0_33 = 0x18
                        data_1f5894 = &r0_33[6]
                        data_1f5890 += 1
                        uint32_t r1_49 = 1 u>> (0x20 - r6_2)
                        
                        if (r6_2 - 0x20 s>= 0)
                            r1_49 = 1 << (r6_2 - 0x20)
                        
                        int32_t r2_18 = 1 << r6_2
                        
                        if (r6_2 - 0x20 s>= 0)
                            r2_18 = 0
                        
                        r0_33[4] = r2_18
                        r0_33[5] = r1_49
                        r0_33[2] = 0x1c
                    
                    break
                
                r6_2 += 1
            while (r6_2 u< r5_2)
        
        result = s_localPlayerStats
        int32_t r1_39 = *(s_localPlayerStats + 0xe8) + 1
        *(s_localPlayerStats + 0xe8) = r1_39
        
        if (r1_39 u>= 5 && r4_1 == 0)
            result = data_1f5894
            
            if (result != 0 && result + 0x18 u< data_1f5898 + data_1f589c)
                *(result + 4) = 0x25
                *result = 0x18
                data_1f5894 = result + 0x18
                data_1f5890 += 1
                *(result + 0x10) = 1
                *(result + 0x14) = 0
                *(result + 8) = 0x1d

return result
