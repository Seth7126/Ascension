// 函数: GetGamePlayerScoreState
// 地址: 0x189bb4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0 = *s_pWorldData
void* r3_1

if (r0 != 0)
    r3_1 = *(s_InterfaceContext + 0xc)

uint32_t r12

if (r0 != 0 && r3_1 != 0)
    int32_t r2_1 = 0
    r12 = 0
    *arg2 = *s_localPlayerStats
    void* r1_1 = *(r3_1 + 0x184)
    
    if (r1_1 != 0)
        r2_1 = *(*(r1_1 + 0xc) + 0x8c)
    
    arg2[1] = r2_1
    uint32_t r1_3 = zx.d(*(r0 + 0xe))
    
    if (r1_3 == 0x2000)
        int32_t temp0_2 = 0
        uint32_t i = zx.d(*(r0 + 0x10))
        
        while (i != 0)
            i u>>= 1
            temp0_2 += 1
        
        r12 = (0x20 - temp0_2) u>> 5
    
    void* r0_3 = *(r3_1 + 0x84)
    int32_t i_3 = *(r0_3 + 0x18)
    arg2[8] = i_3
    int32_t var_38_1
    int32_t r1_4
    int32_t r2_2
    int32_t r7_1
    int32_t r8_1
    int32_t i_2
    
    if (i_3 s< 1)
        r7_1 = 0
        i_2 = 0
        r2_2 = 1
        r1_4 = 0
        r8_1 = 0
        var_38_1 = 1
    else
        int32_t* r4_1 = *(r0_3 + 0xc)
        r2_2 = 1
        r8_1 = 0
        r1_4 = 0
        i_2 = 0
        r7_1 = 0
        var_38_1 = 1
        int32_t i_1
        
        do
            void* r6_1 = *(*r4_1 + 0xc)
            int32_t r2_4 = *(r6_1 + 0x8c)
            int32_t r3_2
            
            if (r2_4 == 0)
                r3_2 = r2_2
            else
                r3_2 = 0
                
                if (*(r6_1 + 0xdc) == 0)
                    int32_t r2_6 = *(r6_1 + 0xe0)
                    
                    if (r2_6 != 0)
                        r2_6 = 1
                    
                    r3_2 = r2_2 & r2_6
                    var_38_1 = 0
            
            uint32_t r0_5 = 0
            
            if ((r12 & 1) != 0)
                r0_5 = zx.d(*(r6_1 + 0xd3))
                
                if (r0_5 != 0)
                    r0_5 = 1
            
            uint32_t r9_1 = zx.d(*(r6_1 + 0xc4))
            
            if (r9_1 != 0)
                r9_1 = 1
            
            if ((r1_4 & 1) != 0)
                r1_4 = 1
            else if (strcasecmp(r6_1 + 4, "Nom Tribe Gremlin") == 0)
                r1_4 = 1
            else if (strcasecmp(r6_1 + 4, "Yuk Tribe Gremlin") == 0)
                r1_4 = 1
            else if (strcasecmp(r6_1 + 4, "Bam Tribe Gremlins") == 0)
                r1_4 = 1
            else
                r1_4 = 0
                
                if (strcasecmp(r6_1 + 4, "Eek Tribe Gremlin") == 0)
                    r1_4 = 1
            
            r4_1 = &r4_1[1]
            i_2 |= r2_4
            r12 = r0_5
            r7_1 |= r9_1
            r2_2 = r3_2
            
            if (*(r6_1 + 0x88) == 0xa)
                r8_1 += 1
            
            i_1 = i_3
            i_3 -= 1
        while (i_1 != 1)
    
    int32_t r0_16 = r1_3 & 0x200
    arg2[2] = var_38_1 & r0_16 u>> 9
    arg2[3] = r2_2 & r0_16 u>> 9
    int32_t r0_19 = (r1_4 ^ 1) & r1_3 u>> 0xa
    
    if (zx.d(*(s_localPlayerStats + 0xf5)) != 0)
        r0_19 |= 2
    
    arg2[6] = r0_19
    
    if ((r1_3 & 0x800) != 0)
        int32_t r0_20 = r0_19 | (4 & not.d(zx.d(*(s_localPlayerStats + 0xf6))))
        int32_t r1_8 = r0_20
        
        if (zx.d(*(s_localPlayerStats + 0xf7)) == 3)
            r1_8 |= 8
        
        if (r8_1 != 3)
            r1_8 = r0_20
        
        arg2[6] = r1_8
    
    int32_t r0_21
    
    if (r1_3 != 0x40)
        r0_21 = 0
    else
        r0_21 = 1
        
        if (i_2 != 0)
            int32_t r1_9 = 0
            
            do
                r1_9 += 1
                i_2 &= i_2 - 1
            while (i_2 != 0)
            
            if (r1_9 u>= 3)
                r0_21 = 0
    
    arg2[5] = r0_21
    int32_t r0_23
    
    if ((r7_1 & 1) == 0)
        r0_23 = 0
    else
        r0_23 = 1
        
        if (*(r3_1 + 0x154) s<= 9)
            r0_23 = 0
    
    arg2[4] = r0_23
else
    r12 = 0
    *arg2 = 1
    arg2[1] = 0
    arg2[2] = 0
    arg2[3] = 0
    arg2[4] = 0
    arg2[5] = 0xff
    arg2[6] = 0
    arg2[8] = 0xa

arg2[7] = r12
return 0x24
