// 函数: _Z23HandleEventAcquiredCardjjjb
// 地址: 0x18dfd4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (zx.d(*(*(s_InterfaceContext + 0xc) + 8)) != arg1)
    return 

int32_t r10_1 = arg4
uint32_t r0 = *s_pWorldData
uint32_t r6_1

if (r0 == 0)
    r6_1 = 0
else
    r6_1 = *(r0 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)

ascension::CCard* r5_1 = *(core::CWorldBase::GetInstanceByID(r6_1) + 0xc)
int32_t r4_1 = *(r5_1 + 0x88)

if (r4_1 == 0xa)
    *(s_localPlayerStats + 0xf6) |= 4

int32_t r0_5 = strcasecmp(r5_1 + 4, "Hedron Cannon")
int32_t r0_7

if (r0_5 != 0)
    r0_7 = strcasecmp(r5_1 + 4, "Hedron Cannon 10TH")

if ((r0_5 == 0 || r0_7 == 0) && (*(s_localPlayerStats + 0xe0) & 1) != 0 && r10_1 == 0)
    int32_t* r0_9 = data_1f5894
    
    if (r0_9 != 0 && &r0_9[6] u< data_1f5898 + data_1f589c)
        r0_9[1] = 0x25
        *r0_9 = 0x18
        data_1f5894 = &r0_9[6]
        data_1f5890 += 1
        r0_9[4] = 1
        r0_9[5] = 0
        r0_9[2] = 9

if (strcasecmp(r5_1 + 4, "Oziah, Judge of Logos") == 0 && *(r6_1 + 0xb4c) s>= 7 && r10_1 == 0)
    arg1 = data_1f5894
    
    if (arg1 == 0 || arg1 + 0x18 u>= data_1f5898 + data_1f589c)
        goto label_18e138
    
    *(arg1 + 4) = 0x25
    *arg1 = 0x18
    data_1f5894 = arg1 + 0x18
    data_1f5890 += 1
    *(arg1 + 0x10) = 1
    *(arg1 + 0x14) = 0
    *(arg1 + 8) = 0x23
    
    if (r4_1 != 6)
        goto label_18e140
    
    goto label_18e2b8

label_18e138:

if (r4_1 == 6)
label_18e2b8:
    int32_t r1_18 = *(s_localPlayerStats + 0xec) + 1
    *(s_localPlayerStats + 0xec) = r1_18
    
    if (r1_18 u>= 5 && r10_1 == 0)
        arg1 = data_1f5894
        
        if (arg1 != 0 && arg1 + 0x18 u< data_1f5898 + data_1f589c)
            *(arg1 + 4) = 0x25
            *arg1 = 0x18
            data_1f5894 = arg1 + 0x18
            data_1f5890 += 1
            *(arg1 + 0x10) = 1
            *(arg1 + 0x14) = 0
            *(arg1 + 8) = 0x1f
else
label_18e140:
    
    if (r4_1 == 1)
        if (zx.d(*(r5_1 + 0xc8)) == 0 && r10_1 == 0)
            int32_t* r0_27 = data_1f5894
            
            if (r0_27 != 0 && &r0_27[6] u< data_1f5898 + data_1f589c)
                r0_27[1] = 0x25
                *r0_27 = 0x18
                data_1f5894 = &r0_27[6]
                data_1f5890 += 1
                r0_27[4] = 1
                r0_27[5] = 0
                r0_27[2] = 0x10
        
        if (*(*s_InterfaceContext + 0xb20) != 0)
            int32_t r1_7 = *(s_localPlayerStats + 8) + 1
            *(s_localPlayerStats + 8) = r1_7
            
            if (r1_7 u>= 7 && r10_1 == 0 && zx.d(*(*s_pWorldData + 0xe)) == 0x40)
                arg1 = data_1f5894
                
                if (arg1 != 0 && arg1 + 0x18 u< data_1f5898 + data_1f589c)
                    *(arg1 + 4) = 0x25
                    *arg1 = 0x18
                    data_1f5894 = arg1 + 0x18
                    data_1f5890 += 1
                    *(arg1 + 0x10) = 1
                    *(arg1 + 0x14) = 0
                    *(arg1 + 8) = 0x2a

if (r10_1 != 0)
    return 

ProcessAquireDefeatAllAchievement(r5_1)

if (*(r5_1 + 0x88) != 3)
    return 

void* r9_1 = *(s_InterfaceContext + 0xc)
arg1 = *(r9_1 + 0x60)

if (*(r9_1 + 0x64) == arg1)
    return 

int32_t r8_1 = 0
int32_t i = 0

do
    char* __s1 = (*(**(arg1 + (i << 2)) + 0xc))()
    int32_t r0_16 = strcasecmp(__s1, "Fanatic SoS")
    int32_t r0_18
    
    if (r0_16 != 0)
        r0_18 = strcasecmp(__s1, "Fanatic")
    
    if (r0_16 == 0 || r0_18 == 0)
        r8_1 |= 1
    else if (strcasecmp(__s1, "Hoarding Tyrant") == 0)
        r8_1 |= 2
    else if (strcasecmp(__s1, "Hoarding Whelp") == 0)
        r8_1 |= 4
    else if (strcasecmp(__s1, "Minotaur") == 0)
        r8_1 |= 8
    else if (strcasecmp(__s1, "Unchained Fates") == 0)
        r8_1 |= 0x10
    
    arg1 = *(r9_1 + 0x60)
    i += 1
while (i u< (*(r9_1 + 0x64) - arg1) s>> 2)

if ((r8_1 & 0xff) != 0x1f)
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
*(arg1 + 8) = 0x16
