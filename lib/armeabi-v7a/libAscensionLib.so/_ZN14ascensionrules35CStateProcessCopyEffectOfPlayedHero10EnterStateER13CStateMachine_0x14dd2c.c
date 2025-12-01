// 函数: _ZN14ascensionrules35CStateProcessCopyEffectOfPlayedHero10EnterStateER13CStateMachine
// 地址: 0x14dd2c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x254)
int32_t r3 = 0
uint32_t r12 = 0
void* r6 = *(*(arg1 + 0x24c) + 4)

if (r0 != 0)
    r3 = *(r0 + 0xc)

void* r0_1 = *(arg1 + 0x25c)
int32_t* r8 = *(r6 + 0xb80)
int32_t r9 = *(r6 + 0xb84)

if (r0_1 != 0)
    int32_t temp0_1 = 0
    uint32_t i = *(r0_1 + 4) - 0x17
    
    while (i != 0)
        i u>>= 1
        temp0_1 += 1
    
    r12 = (0x20 - temp0_1) u>> 5

if (r8 != r9)
    do
        if ((zx.d(r8[1].b) & 1) == 0)
            void* r10_1 = *r8
            
            if (r10_1 != 0)
                int32_t* r4_2 = *(r10_1 + 0xc)
                
                if (zx.d(*(r4_2 + 0xc9)) == 0)
                    int32_t r7_1 = *(r6 + 0x30)
                    
                    if (r7_1 u< 0xc)
                        if (r10_1 != *(arg1 + 0x254))
                            int32_t r0_9 = r4_2[0x22]
                            
                            if ((r7_1 u< 3 && r0_9 == 3) || r0_9 == 1)
                            label_14de0c:
                                int32_t r0_10 = *(arg1 + 0x250)
                                int32_t r1_1
                                
                                if (r0_10 s>= 1)
                                    r1_1 = 0x98
                                    
                                    if (r7_1 u< 0x14)
                                        r1_1 = 0x9c
                                
                                if (r0_10 s< 1 || *(r4_2 + r1_1) s<= r0_10)
                                    void* r9_1 = r6
                                    void* var_34_1 = r10_1
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r10_1 + 8), 
                                        0xa081, "Copy %s", 
                                        ascensionrules::CStateProcessCopyEffectOfPlayedHero::SelectEffectToCopy)
                                    r6 = r9_1
                                    r9 = *(r9_1 + 0xb84)
                    else if (r4_2 != r3)
                        bool cond:2_1
                        
                        if (r12 != 0)
                            cond:2_1 = strcasecmp(&r4_2[1], "Reality Sculptor") == 0
                        
                        if ((r12 == 0 || not(cond:2_1)) && r4_2[0x22] == 1)
                            goto label_14de0c
        
        r8 = &r8[2]
    while (r8 != r9)
    
    *(arg1 + 0x24c)

jump(*(*arg1 + 0x34))
