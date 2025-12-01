// 函数: _Z24HandleEventDefeatMonsterjjjb
// 地址: 0x18d1bc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r10 = arg4
uint32_t r0 = *s_pWorldData
uint32_t r5

if (r0 == 0)
    r5 = 0
else
    r5 = *(r0 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)

int32_t* result = core::CWorldBase::GetInstanceByID(r5)
void* r1 = *(s_InterfaceContext + 0xc)

if (zx.d(*(r1 + 8)) == arg1)
    ascension::CCard* r0_3 = result[3]
    bool cond:0_1 = arg3 == 7
    
    if (arg3 == 7)
        cond:0_1 = r10 == 0
    
    if (cond:0_1)
        int32_t r8_2 = *(r1 + 0x54)
        int32_t r0_78 = *(r1 + 0x58)
        
        if (r0_78 != r8_2)
            int32_t i = 0
            
            do
                if (strcasecmp("Emri's Sting", *(*(*(r8_2 + (i << 2)) + 0x10) + 0xc) + 4) == 0)
                    int32_t r5_3 = *(r5 + 0xb80)
                    int32_t r0_85 = *(r5 + 0xb84)
                    
                    if (r0_85 != r5_3)
                        int32_t j = 0
                        
                        do
                            if (strcasecmp("Emri, Demonsbane", *(*(r5_3 + (j << 3)) + 0xc) + 4)
                                    == 0)
                                int32_t* r0_100 = data_1f5894
                                
                                if (r0_100 != 0 && &r0_100[6] u< data_1f5898 + data_1f589c)
                                    r0_100[1] = 0x25
                                    *r0_100 = 0x18
                                    data_1f5894 = &r0_100[6]
                                    data_1f5890 += 1
                                    r0_100[4] = 1
                                    r0_100[5] = 0
                                    r0_100[2] = 0x2e
                                
                                break
                            
                            j += 1
                        while (j u< (r0_85 - r5_3) s>> 3)
                    
                    break
                
                i += 1
            while (i u< (r0_78 - r8_2) s>> 2)
    
    int32_t r0_5 = strcasecmp(r0_3 + 4, "Avatar of the Fallen")
    int32_t r0_7
    
    if (r0_5 != 0)
        r0_7 = strcasecmp(r0_3 + 4, "Avatar of the Fallen 10TH")
    
    if (r0_5 == 0 || r0_7 == 0)
        *(s_localPlayerStats + 0xe0) |= 1
    
    if (strcasecmp(r0_3 + 4, "Samael the Fallen") == 0)
        *(s_localPlayerStats + 0xe0) |= 2
    
    if (strcasecmp(r0_3 + 4, "Hellfrost Imps") == 0)
        int32_t r1_20 = zx.d(*(s_localPlayerStats + 0xf8)) + 1
        *(s_localPlayerStats + 0xf8) = r1_20.b
        
        if (r1_20 << 0xfffffffc s>> 0x18 s>= 5 && r10 == 0)
            int32_t* r0_29 = data_1f5894
            
            if (r0_29 != 0 && &r0_29[6] u< data_1f5898 + data_1f589c)
                r0_29[1] = 0x25
                *r0_29 = 0x18
                data_1f5894 = &r0_29[6]
                data_1f5890 += 1
                r0_29[4] = 1
                r0_29[5] = 0
                r0_29[2] = 0x44
    
    int32_t* r0_24
    
    if (strcasecmp(r0_3 + 4, "Cultist") == 0)
    label_18d408:
        *s_localPlayerStats += 1
        
        if (r10 == 0)
            r0_24 = data_1f5894
            
            if (r0_24 != 0 && &r0_24[6] u< data_1f5898 + data_1f589c)
                r0_24[1] = 0x25
                *r0_24 = 0x18
                data_1f5894 = &r0_24[6]
                data_1f5890 += 1
                r0_24[4] = 1
                r0_24[5] = 0
                r0_24[2] = 0xf
    else
        if (strcasecmp(r0_3 + 4, "Cultist SoS") == 0)
            goto label_18d408
        
        if (strcasecmp(r0_3 + 4, "Cultist RoV") == 0)
            goto label_18d408
        
        if (strcasecmp(r0_3 + 4, "Cultist RU") == 0)
            goto label_18d408
        
        if (strcasecmp(r0_3 + 4, "Cultist 10TH") == 0)
            goto label_18d408
        
        if (r10 == 0 && strcasecmp(r0_3 + 4, "Fanatic SoS") != 0)
            r0_24 = data_1f5894
            
            if (r0_24 != 0 && &r0_24[6] u< data_1f5898 + data_1f589c)
                r0_24[1] = 0x25
                *r0_24 = 0x18
                data_1f5894 = &r0_24[6]
                data_1f5890 += 1
                r0_24[4] = 1
                r0_24[5] = 0
                r0_24[2] = 0x12
    
    if (strcasecmp(r0_3 + 4, "Xeron, Lord of Deofol") == 0)
        *(s_localPlayerStats + 0xda) |= 1
    
    result = strcasecmp(r0_3 + 4, "Aranyx, the Glutton")
    
    if (result == 0)
        result = s_localPlayerStats
        *(s_localPlayerStats + 0xda) |= 2
        
        if (r10 == 0)
        label_18d5b4:
            
            if ((zx.d(*(s_localPlayerStats + 0xda)) & 3) == 3)
                int32_t* r0_32 = data_1f5894
                
                if (r0_32 != 0 && &r0_32[6] u< data_1f5898 + data_1f589c)
                    r0_32[1] = 0x25
                    *r0_32 = 0x18
                    data_1f5894 = &r0_32[6]
                    data_1f5890 += 1
                    r0_32[4] = 1
                    r0_32[5] = 0
                    r0_32[2] = 0x2f
            
            int32_t r0_34 = strcasecmp(r0_3 + 4, &data_1cc3e7)
            int32_t r0_36
            
            if (r0_34 != 0)
                r0_36 = strcasecmp(r0_3 + 4, "Xeron, Duke of Lies 10TH")
            
            if ((r0_34 == 0 || r0_36 == 0) && *(*s_pWorldData + 0xd4) == 4)
                int32_t* r0_39 = data_1f5894
                
                if (r0_39 != 0 && &r0_39[6] u< data_1f5898 + data_1f589c)
                    r0_39[1] = 0x25
                    *r0_39 = 0x18
                    data_1f5894 = &r0_39[6]
                    data_1f5890 += 1
                    r0_39[4] = 1
                    r0_39[5] = 0
                    r0_39[2] = 8
            
            if (strcasecmp(r0_3 + 4, "Herald of Doom") == 0 && *(r5 + 0xb4c) s>= 7)
                int32_t* r0_43 = data_1f5894
                
                if (r0_43 != 0 && &r0_43[6] u< data_1f5898 + data_1f589c)
                    r0_43[1] = 0x25
                    *r0_43 = 0x18
                    data_1f5894 = &r0_43[6]
                    data_1f5890 += 1
                    r0_43[4] = 1
                    r0_43[5] = 0
                    r0_43[2] = 0x21
            
            if (*(s_localPlayerStats + 0xe0) == 3)
                int32_t* r0_45 = data_1f5894
                
                if (r0_45 != 0 && &r0_45[6] u< data_1f5898 + data_1f589c)
                    r0_45[1] = 0x25
                    *r0_45 = 0x18
                    data_1f5894 = &r0_45[6]
                    data_1f5890 += 1
                    r0_45[4] = 1
                    r0_45[5] = 0
                    r0_45[2] = 0xa
            
            if (strcasecmp(r0_3 + 4, "Growmites") == 0)
                int32_t r6_2 = *(r1 + 0x60)
                int32_t r1_58 = *(r1 + 0x64) - r6_2
                
                if (r1_58 s>= 1)
                    int32_t r1_59 = 0
                    int32_t i_1 = 0
                    
                    do
                        void* r7_1 = *(r6_2 + (i_1 << 2))
                        i_1 += 1
                        
                        if (*(*(r7_1 + 0x10) + 0xc) == r0_3)
                            r1_59 += 1
                    while (i_1 s< r1_58 s>> 2)
                    
                    if (r1_59 u> 3)
                        int32_t* r6_3 = data_1f5894
                        
                        if (r6_3 != 0 && &r6_3[6] u< data_1f5898 + data_1f589c)
                            r6_3[1] = 0x25
                            *r6_3 = 0x18
                            data_1f5894 = &r6_3[6]
                            data_1f5890 += 1
                            r6_3[4] = 1
                            r6_3[5] = 0
                            r6_3[2] = 0x1a
            
            ProcessAquireDefeatAllAchievement(r0_3)
            void* r0_49 = *s_InterfaceContext
            int32_t* i_2 = *(r0_49 + 0xbd8)
            
            if (i_2 != *(r0_49 + 0xbdc))
                do
                    int32_t* r0_53 = *i_2
                    
                    if (r0_53 != 0)
                        if (strcasecmp((*(*r0_53 + 0xc))(), "Wicked End") == 0
                                && strcasecmp(r0_3 + 4, "Ender of Days") == 0)
                            int32_t* r0_51 = data_1f5894
                            
                            if (r0_51 != 0 && &r0_51[6] u< data_1f5898 + data_1f589c)
                                r0_51[1] = 0x25
                                *r0_51 = 0x18
                                data_1f5894 = &r0_51[6]
                                data_1f5890 += 1
                                r0_51[4] = 1
                                r0_51[5] = 0
                                r0_51[2] = 0x34
                        
                        int32_t* r0_58 = *i_2
                        
                        if (r0_58 != 0
                                && strcasecmp((*(*r0_58 + 0xc))(), "Adayu the Omnipotent") == 0
                                && strcasecmp(r0_3 + 4, "Samael the Fallen") == 0)
                            int32_t* r0_52 = data_1f5894
                            
                            if (r0_52 != 0 && &r0_52[6] u< data_1f5898 + data_1f589c)
                                r0_52[1] = 0x25
                                *r0_52 = 0x18
                                data_1f5894 = &r0_52[6]
                                data_1f5890 += 1
                                r0_52[4] = 1
                                r0_52[5] = 0
                                r0_52[2] = 0xb
                    
                    i_2 = &i_2[2]
                while (i_2 != *(*s_InterfaceContext + 0xbdc))
            
            void* r6_1 = *(s_InterfaceContext + 0xc)
            uint32_t r8_1
            
            if (strcasecmp(r0_3 + 4, "Fanatic SoS") == 0)
                r8_1 = 1
            else if (strcasecmp(r0_3 + 4, "Hoarding Tyrant") == 0)
                r8_1 = 2
            else if (strcasecmp(r0_3 + 4, "Hoarding Whelp") == 0)
                r8_1 = 4
            else if (strcasecmp(r0_3 + 4, "Minotaur") == 0)
                r8_1 = 8
            else
                int32_t temp0_1 = 0
                int32_t i_3 = strcasecmp(r0_3 + 4, "Unchained Fates")
                
                while (i_3 != 0)
                    i_3 u>>= 1
                    temp0_1 += 1
                
                r8_1 = (0x20 - temp0_1) u>> 5 << 4
            
            result = *(r6_1 + 0x60)
            
            if (*(r6_1 + 0x64) != result)
                int32_t i_4 = 0
                
                do
                    char* __s1 = (*(*result[i_4] + 0xc))()
                    
                    if (strcasecmp(__s1, "Fanatic SoS") == 0)
                        r8_1 |= 1
                    else if (strcasecmp(__s1, "Hoarding Tyrant") == 0)
                        r8_1 |= 2
                    else if (strcasecmp(__s1, "Hoarding Whelp") == 0)
                        r8_1 |= 4
                    else if (strcasecmp(__s1, "Minotaur") == 0)
                        r8_1 |= 8
                    else if (strcasecmp(__s1, "Unchained Fates") == 0)
                        r8_1 |= 0x10
                    
                    result = *(r6_1 + 0x60)
                    i_4 += 1
                while (i_4 u< (*(r6_1 + 0x64) - result) s>> 2)
                
                result = r8_1 & 0xff
                
                if (result == 0x1f)
                    result = data_1f5894
                    
                    if (result != 0 && &result[6] u< data_1f5898 + data_1f589c)
                        result[1] = 0x25
                        *result = 0x18
                        data_1f5894 = &result[6]
                        data_1f5890 += 1
                        result[4] = 1
                        result[5] = 0
                        result[2] = 0x16
    else if (r10 == 0)
        goto label_18d5b4

return result
