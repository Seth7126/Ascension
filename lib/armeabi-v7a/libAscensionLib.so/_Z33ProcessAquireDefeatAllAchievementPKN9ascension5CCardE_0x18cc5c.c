// 函数: _Z33ProcessAquireDefeatAllAchievementPKN9ascension5CCardE
// 地址: 0x18cc5c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg1 != 0)
    void* __offset(ascension::CCard, 0x4) __s1 = arg1 + 4
    uint32_t r7_1 = *ascensionrules::s_StartingCenterDeckSet1ListCount
    int32_t r6_1
    
    if (r7_1 != 0)
        r6_1 = 0
        
        while (strcasecmp(__s1, *(ascensionrules::s_StartingCenterDeckSet1List + (r6_1 << 3))) != 0)
            r6_1 += 1
            
            if (r6_1 u>= r7_1)
                goto label_18ccbc
        
        goto label_18ce1c
    
label_18ccbc:
    uint32_t r7_2 = *ascensionrules::s_StartingCenterDeckSet1AnnivListCount
    
    if (r7_2 == 0)
    label_18ccfc:
        uint32_t r7_3 = *ascensionrules::s_StartingCenterDeckSet2ListCount
        
        if (r7_3 == 0)
        label_18cd3c:
            uint32_t r7_4 = *ascensionrules::s_StartingCenterDeckSet3ListCount
            
            if (r7_4 != 0)
                int32_t r6_3 = 0
                
                do
                    if (strcasecmp(__s1, 
                            *(ascensionrules::s_StartingCenterDeckSet3List + (r6_3 << 3))) == 0)
                        arg1 = data_1f5894
                        
                        if (arg1 == 0 || arg1 + 0x18 u>= data_1f5898 + data_1f589c)
                            goto label_18d110
                        
                        *(arg1 + 4) = 0x25
                        *arg1 = 0x18
                        data_1f5894 = arg1 + 0x18
                        data_1f5890 += 1
                        uint32_t r1_24 = 1 u>> (0x20 - r6_3)
                        
                        if (r6_3 - 0x20 s>= 0)
                            r1_24 = 1 << (r6_3 - 0x20)
                        
                        int32_t r2_9 = 1 << r6_3
                        
                        if (r6_3 - 0x20 s>= 0)
                            r2_9 = 0
                        
                        *(arg1 + 0x10) = r2_9
                        *(arg1 + 0x14) = r1_24
                        *(arg1 + 8) = 5
                        return 
                    
                    r6_3 += 1
                while (r6_3 u< r7_4)
            
            if (zx.d(*(arg1 + 0xd1)) != 0 && *(arg1 + 0x88) == 9)
                uint32_t r7_5 = *ascensionrules::s_StartingDreamDeckSet9ListCount
                
                if (r7_5 != 0)
                    int32_t r6_4 = 0
                    
                    do
                        if (strcasecmp(__s1, 
                                *(ascensionrules::s_StartingDreamDeckSet9List + (r6_4 << 3))) == 0)
                            arg1 = data_1f5894
                            
                            if (arg1 == 0 || arg1 + 0x18 u>= data_1f5898 + data_1f589c)
                                goto label_18d110
                            
                            *(arg1 + 4) = 0x25
                            *arg1 = 0x18
                            data_1f5894 = arg1 + 0x18
                            data_1f5890 += 1
                            uint32_t r1_30 = 1 u>> (0x20 - r6_4)
                            
                            if (r6_4 - 0x20 s>= 0)
                                r1_30 = 1 << (r6_4 - 0x20)
                            
                            int32_t r2_12 = 1 << r6_4
                            
                            if (r6_4 - 0x20 s>= 0)
                                r2_12 = 0
                            
                            *(arg1 + 0x10) = r2_12
                            *(arg1 + 0x14) = r1_30
                            *(arg1 + 8) = 0x32
                            return 
                        
                        r6_4 += 1
                    while (r6_4 u< r7_5)
            
            if (zx.d(*(arg1 + 0xd2)) != 0)
                uint32_t r6_5 = *ascensionrules::s_StartingCenterDeckSet9ListCount
                
                if (r6_5 != 0)
                    int32_t r5_1 = 0
                    
                    do
                        if (strcasecmp(__s1, 
                                *(ascensionrules::s_StartingCenterDeckSet9List + (r5_1 << 3))) == 0)
                            arg1 = data_1f5894
                            
                            if (arg1 == 0 || arg1 + 0x18 u>= data_1f5898 + data_1f589c)
                                break
                            
                            *(arg1 + 4) = 0x25
                            *arg1 = 0x18
                            data_1f5894 = arg1 + 0x18
                            data_1f5890 += 1
                            uint32_t r1_36 = 1 u>> (0x20 - r5_1)
                            
                            if (r5_1 - 0x20 s>= 0)
                                r1_36 = 1 << (r5_1 - 0x20)
                            
                            int32_t r2_15 = 1 << r5_1
                            
                            if (r5_1 - 0x20 s>= 0)
                                r2_15 = 0
                            
                            *(arg1 + 0x10) = r2_15
                            *(arg1 + 0x14) = r1_36
                            *(arg1 + 8) = 0x36
                            return 
                        
                        r5_1 += 1
                    while (r5_1 u< r6_5)
        else
            int32_t r6_2 = 0
            
            while (true)
                if (strcasecmp(__s1, *(ascensionrules::s_StartingCenterDeckSet2List + (r6_2 << 3)))
                        == 0)
                    arg1 = data_1f5894
                    
                    if (arg1 == 0 || arg1 + 0x18 u>= data_1f5898 + data_1f589c)
                        break
                    
                    *(arg1 + 4) = 0x25
                    *arg1 = 0x18
                    data_1f5894 = arg1 + 0x18
                    data_1f5890 += 1
                    uint32_t r1_18 = 1 u>> (0x20 - r6_2)
                    
                    if (r6_2 - 0x20 s>= 0)
                        r1_18 = 1 << (r6_2 - 0x20)
                    
                    int32_t r2_6 = 1 << r6_2
                    
                    if (r6_2 - 0x20 s>= 0)
                        r2_6 = 0
                    
                    *(arg1 + 0x10) = r2_6
                    *(arg1 + 0x14) = r1_18
                    *(arg1 + 8) = 4
                    return 
                
                r6_2 += 1
                
                if (r6_2 u>= r7_3)
                    goto label_18cd3c
    else
        r6_1 = 0
        
        while (strcasecmp(__s1, *(ascensionrules::s_StartingCenterDeckSet1AnnivList + (r6_1 << 3)))
                != 0)
            r6_1 += 1
            
            if (r6_1 u>= r7_2)
                goto label_18ccfc
        
    label_18ce1c:
        arg1 = data_1f5894
        
        if (arg1 != 0 && arg1 + 0x18 u< data_1f5898 + data_1f589c)
            *(arg1 + 4) = 0x25
            *arg1 = 0x18
            data_1f5894 = arg1 + 0x18
            data_1f5890 += 1
            uint32_t r1_12 = 1 u>> (0x20 - r6_1)
            
            if (r6_1 - 0x20 s>= 0)
                r1_12 = 1 << (r6_1 - 0x20)
            
            int32_t r2_3 = 1 << r6_1
            
            if (r6_1 - 0x20 s>= 0)
                r2_3 = 0
            
            *(arg1 + 0x10) = r2_3
            *(arg1 + 0x14) = r1_12
            *(arg1 + 8) = 3
            return 

label_18d110:
