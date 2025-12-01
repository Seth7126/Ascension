// 函数: _ZN14ascensionrules30IfHasCenterRowHeroWithLessCostEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0xff8a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = ascension::CWorld::GetCenterRowCard(arg1)
int32_t result

if (r0 == 0)
label_ff8e0:
    void* r0_4 = ascension::CWorld::GetCenterRowCard(arg1)
    
    if (r0_4 == 0)
    label_ff90c:
        void* r0_8 = ascension::CWorld::GetCenterRowCard(arg1)
        
        if (r0_8 == 0)
        label_ff938:
            void* r0_12 = ascension::CWorld::GetCenterRowCard(arg1)
            
            if (r0_12 == 0)
            label_ff964:
                void* r0_16 = ascension::CWorld::GetCenterRowCard(arg1)
                
                if (r0_16 == 0)
                label_ff990:
                    void* r0_20 = ascension::CWorld::GetCenterRowCard(arg1)
                    
                    if (r0_20 == 0)
                    label_ff9bc:
                        void* r0_24 = ascension::CWorld::GetCenterRowCard(arg1)
                        int32_t* r1_13
                        
                        if (r0_24 != 0)
                            r1_13 = *(r0_24 + 0xc)
                        
                        if (r0_24 == 0 || zx.d(*(r1_13 + 0xc9)) != 0 || r1_13[0x22] != 1)
                            return 0
                        
                        result = 1
                        
                        if (arg4 != 0)
                            int32_t r3_6 = 0x98
                            
                            if (*(arg1 + 0x30) u< 0x14)
                                r3_6 = 0x9c
                            
                            if (*(r1_13 + r3_6) s> arg4)
                                return 0
                    else
                        int32_t* r1_11 = *(r0_20 + 0xc)
                        
                        if (zx.d(*(r1_11 + 0xc9)) != 0 || r1_11[0x22] != 1)
                            goto label_ff9bc
                        
                        result = 1
                        
                        if (arg4 != 0)
                            int32_t r3_5 = 0x98
                            
                            if (*(arg1 + 0x30) u< 0x14)
                                r3_5 = 0x9c
                            
                            if (*(r1_11 + r3_5) s> arg4)
                                goto label_ff9bc
                else
                    int32_t* r1_9 = *(r0_16 + 0xc)
                    
                    if (zx.d(*(r1_9 + 0xc9)) != 0 || r1_9[0x22] != 1)
                        goto label_ff990
                    
                    result = 1
                    
                    if (arg4 != 0)
                        int32_t r3_4 = 0x98
                        
                        if (*(arg1 + 0x30) u< 0x14)
                            r3_4 = 0x9c
                        
                        if (*(r1_9 + r3_4) s> arg4)
                            goto label_ff990
            else
                int32_t* r1_7 = *(r0_12 + 0xc)
                
                if (zx.d(*(r1_7 + 0xc9)) != 0 || r1_7[0x22] != 1)
                    goto label_ff964
                
                result = 1
                
                if (arg4 != 0)
                    int32_t r3_3 = 0x98
                    
                    if (*(arg1 + 0x30) u< 0x14)
                        r3_3 = 0x9c
                    
                    if (*(r1_7 + r3_3) s> arg4)
                        goto label_ff964
        else
            int32_t* r1_5 = *(r0_8 + 0xc)
            
            if (zx.d(*(r1_5 + 0xc9)) != 0 || r1_5[0x22] != 1)
                goto label_ff938
            
            result = 1
            
            if (arg4 != 0)
                int32_t r3_2 = 0x98
                
                if (*(arg1 + 0x30) u< 0x14)
                    r3_2 = 0x9c
                
                if (*(r1_5 + r3_2) s> arg4)
                    goto label_ff938
    else
        int32_t* r1_3 = *(r0_4 + 0xc)
        
        if (zx.d(*(r1_3 + 0xc9)) != 0 || r1_3[0x22] != 1)
            goto label_ff90c
        
        result = 1
        
        if (arg4 != 0)
            int32_t r3_1 = 0x98
            
            if (*(arg1 + 0x30) u< 0x14)
                r3_1 = 0x9c
            
            if (*(r1_3 + r3_1) s> arg4)
                goto label_ff90c
else
    int32_t* r1_1 = *(r0 + 0xc)
    
    if (zx.d(*(r1_1 + 0xc9)) != 0 || r1_1[0x22] != 1)
        goto label_ff8e0
    
    result = 1
    
    if (arg4 != 0)
        int32_t r3 = 0x98
        
        if (*(arg1 + 0x30) u< 0x14)
            r3 = 0x9c
        
        if (*(r1_1 + r3) s> arg4)
            goto label_ff8e0

return result
