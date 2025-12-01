// 函数: _Z28HandleEventContructPutInPlayjjjb
// 地址: 0x18e648
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r8 = *(s_InterfaceContext + 0xc)

if (zx.d(*(r8 + 8)) != arg1)
    return 

if (arg4 == 0)
    int32_t* r0 = data_1f5894
    
    if (r0 != 0 && &r0[6] u< data_1f5898 + data_1f589c)
        r0[1] = 0x25
        *r0 = 0x18
        data_1f5894 = &r0[6]
        data_1f5890 += 1
        r0[4] = 1
        r0[5] = 0
        r0[2] = 0x11
    
    int32_t r0_1 = *(r8 + 0x54)
    
    if (*(r8 + 0x58) != r0_1)
        uint32_t var_28_1 = arg2
        int32_t r7_1 = 0
        int32_t r4_1 = 0
        int32_t i = 0
        
        do
            char* __s1 = (*(**(r0_1 + (i << 2)) + 0xc))()
            
            if (strcasecmp(__s1, "Umbral Edge") == 0)
                r7_1 |= 1
            else if (strcasecmp(__s1, "Penumbral Edge") == 0)
                r7_1 |= 2
            
            int32_t r0_7 = strcasecmp(__s1, "Burrower Mark II")
            int32_t r0_9
            
            if (r0_7 != 0)
                r0_9 = strcasecmp(__s1, "Burrower Mark II 10TH")
            
            if (r0_7 == 0 || r0_9 == 0)
                r4_1 |= 1
            else
                int32_t r0_11 = strcasecmp(__s1, "Hedron Cannon")
                int32_t r0_13
                
                if (r0_11 != 0)
                    r0_13 = strcasecmp(__s1, "Hedron Cannon 10TH")
                
                if (r0_11 == 0 || r0_13 == 0)
                    r4_1 |= 2
                else
                    int32_t r0_15 = strcasecmp(__s1, "Hedron Link Device")
                    int32_t r0_17
                    
                    if (r0_15 != 0)
                        r0_17 = strcasecmp(__s1, "Hedron Link Device 10TH")
                    
                    if (r0_15 == 0 || r0_17 == 0)
                        r4_1 |= 4
                    else
                        int32_t r0_19 = strcasecmp(__s1, "Rocket Courier X-99")
                        int32_t r0_21
                        
                        if (r0_19 != 0)
                            r0_21 = strcasecmp(__s1, "Rocket Courier X-99 10TH")
                        
                        if (r0_19 == 0 || r0_21 == 0)
                            r4_1 |= 8
                        else
                            int32_t r0_23 = strcasecmp(__s1, "The Grand Design")
                            int32_t r0_25
                            
                            if (r0_23 != 0)
                                r0_25 = strcasecmp(__s1, "The Grand Design 10TH")
                            
                            if (r0_23 == 0 || r0_25 == 0)
                                r4_1 |= 0x10
                            else if (strcasecmp(__s1, "Watchmaker's Altar") == 0)
                                r4_1 |= 0x20
                            else if (strcasecmp(__s1, "Watchmaker's Altar 10TH") == 0)
                                r4_1 |= 0x20
            
            r0_1 = *(r8 + 0x54)
            i += 1
        while (i u< (*(r8 + 0x58) - r0_1) s>> 2)
        
        if ((r7_1 & 0xff) == 3)
            int32_t* r0_31 = data_1f5894
            
            if (r0_31 != 0 && &r0_31[6] u< data_1f5898 + data_1f589c)
                r0_31[1] = 0x25
                *r0_31 = 0x18
                data_1f5894 = &r0_31[6]
                data_1f5890 += 1
                r0_31[4] = 1
                r0_31[5] = 0
                r0_31[2] = 0xd
        
        if ((r4_1 & 0xff) == 0x3f)
            int32_t* r0_33 = data_1f5894
            
            if (r0_33 != 0 && &r0_33[6] u< data_1f5898 + data_1f589c)
                r0_33[1] = 0x25
                *r0_33 = 0x18
                data_1f5894 = &r0_33[6]
                data_1f5890 += 1
                r0_33[4] = 1
                r0_33[5] = 0
                r0_33[2] = 0x14

uint32_t r0_34 = *s_pWorldData
uint32_t r0_36

if (r0_34 == 0)
    r0_36 = 0
else
    r0_36 = *(r0_34 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)

char* __s2 = *(core::CWorldBase::GetInstanceByID(r0_36) + 0xc) + 4
int32_t r0_38 = strcasecmp("Hedron Cannon", __s2)
int32_t r0_39

if (r0_38 != 0)
    r0_39 = strcasecmp("Hedron Cannon 10TH", __s2)

uint32_t r1_24

if (r0_38 == 0 || r0_39 == 0)
    r1_24 = zx.d(*(s_localPlayerStats + 0xda)) | 4
    *(s_localPlayerStats + 0xda) = r1_24.b
else
    bool cond:0_1 = strcasecmp("Plasma Cannon", __s2) != 0
    r1_24 = zx.d(*(s_localPlayerStats + 0xda))
    
    if (not(cond:0_1))
        r1_24 |= 8
        *(s_localPlayerStats + 0xda) = r1_24.b

if ((r1_24 & 0x1c) != 0x1c)
    return 

arg1 = data_1f5894

if (arg1 == 0 || arg1 + 0x18 u>= data_1f5898 + data_1f589c)
    return 

*(arg1 + 4) = 0x25
*arg1 = 0x18
data_1f5894 = arg1 + 0x18
data_1f5890 += 1
*(arg1 + 0x10) = 1
*(arg1 + 0x14) = 0
*(arg1 + 8) = 0x30
