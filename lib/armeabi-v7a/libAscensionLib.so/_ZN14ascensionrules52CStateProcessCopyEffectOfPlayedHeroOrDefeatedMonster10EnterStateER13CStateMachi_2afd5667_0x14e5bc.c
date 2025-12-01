// 函数: _ZN14ascensionrules52CStateProcessCopyEffectOfPlayedHeroOrDefeatedMonster10EnterStateER13CStateMachine
// 地址: 0x14e5bc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x254)
void* r4 = *(*(arg1 + 0x24c) + 4)
bool cond:1 = r0 != 0

if (r0 != 0)
    r0 = *(r0 + 0xc)

uint32_t var_2c = 0
void* var_28 = nullptr

if (cond:1)
    var_28 = r0

void* r0_1 = *(arg1 + 0x25c)
int32_t* r9 = *(r4 + 0xb80)
int32_t r7 = *(r4 + 0xb84)

if (r0_1 != 0)
    int32_t temp0_1 = 0
    uint32_t i = *(r0_1 + 4) - 0x17
    
    while (i != 0)
        i u>>= 1
        temp0_1 += 1
    
    var_2c = (0x20 - temp0_1) u>> 5

if (r9 != r7)
    do
        if ((zx.d(r9[1].b) & 1) == 0)
            void* r8_1 = *r9
            
            if (r8_1 != 0)
                int32_t* r6_1 = *(r8_1 + 0xc)
                
                if (zx.d(*(r6_1 + 0xc9)) == 0)
                    int32_t r10_1 = *(r4 + 0x30)
                    
                    if (r10_1 u< 0xc)
                        if (r8_1 != *(arg1 + 0x254))
                            int32_t r0_14 = r6_1[0x22]
                            
                            if (r10_1 u< 3)
                                if (r0_14 == 3 || r0_14 == 1)
                                label_14e6e4:
                                    int32_t r0_16 = *(arg1 + 0x250)
                                    int32_t r1_1
                                    
                                    if (r0_16 s>= 1)
                                        r1_1 = 0x98
                                        
                                        if (r10_1 u< 0x14)
                                            r1_1 = 0x9c
                                    
                                    if (r0_16 s< 1 || *(r6_1 + r1_1) s<= r0_16)
                                        void* var_34_1 = r8_1
                                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r8_1 + 8), 
                                            0xa081, "Copy %s", 
                                            ascensionrules::CStateProcessCopyEffectOfPlayedHeroOrDefeatedMonster::SelectHeroToCopy)
                                        r7 = *(r4 + 0xb84)
                            else if (r0_14 == 1 || zx.d(*(r6_1 + 0xd3)) != 0)
                                goto label_14e6e4
                    else if (r6_1 != var_28)
                        if (var_2c == 0)
                        label_14e69c:
                            
                            if (r6_1[0x22] == 1 || zx.d(*(r6_1 + 0xd3)) != 0)
                                goto label_14e6e4
                        else if (strcasecmp(&r6_1[1], "Reality Sculptor") != 0)
                            goto label_14e69c
        
        r9 = &r9[2]
    while (r9 != r7)

int32_t* i_1 = *(r4 + 0xb9c)

for (int32_t r9_1 = *(r4 + 0xba0); i_1 != r9_1; i_1 = &i_1[2])
    void* r7_1 = *i_1
    
    if (r7_1 != 0)
        if (*(r4 + 0x30) u>= 0xc)
            void* r0_19 = *(r7_1 + 0xc)
            
            if (r0_19 != var_28)
                if (var_2c == 0)
                    goto label_14e7cc
                
                if (strcasecmp(r0_19 + 4, "Reality Sculptor") != 0)
                    goto label_14e7cc
        else if (r7_1 != *(arg1 + 0x254))
        label_14e7cc:
            void* var_34_2 = r7_1
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r7_1 + 8), 0xa083, "Copy %s", 
                ascensionrules::CStateProcessCopyEffectOfPlayedHeroOrDefeatedMonster::SelectMonsterToCopy)
            r9_1 = *(r4 + 0xba0)

*(arg1 + 0x24c)
jump(*(*arg1 + 0x34))
