// 函数: _ZN14ascensionrules38CStateProcessCopyEffectOfLifeboundHero10EnterStateER13CStateMachine
// 地址: 0x14f098
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r6 = *(*(arg1 + 0x24c) + 4)
int32_t* r5 = *(r6 + 0xac8)
int32_t r0_1 = *(r6 + 0xacc)
void* r1 = r0_1 - r5

if (r0_1 != r5)
    do
        if (zx.d(r5[1].b) == 0)
            void* r0_2 = *r5
            void* var_3c_1 = r0_2
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_2 + 8) + 0x4000, 0xa082, "Copy %s", 
                ascensionrules::CStateProcessCopyEffectOfLifeboundHero::SelectEffectToCopy)
            r0_1 = *(r6 + 0xacc)
        
        r5 = &r5[2]
    while (r5 != r0_1)

int32_t* i = *(r6 + 0xb80)
int32_t r0_6 = r1 s>> 3

if (i != *(r6 + 0xb84))
    do
        if ((zx.d(i[1].b) & 1) == 0)
            void* r7_1 = *i
            
            if (r7_1 != 0 && r7_1 != *(arg1 + 0x250))
                void* r4_1 = *(r7_1 + 0xc)
                
                if (*(r4_1 + 0x88) == 1 && ascension::CCard::IsCardFaction(r4_1) == 0
                        && ascension::CWorld::QueryCardFaction(r6, *(arg1 + 0x24c), r7_1) != 0)
                    int32_t r5_1
                    
                    if (r1 != 0)
                        r5_1 = 0
                        int32_t r10_1 = 0
                        
                        do
                            void* r4_2 = *(*(*(r6 + 0xac8) + (r10_1 << 3)) + 0xc)
                            
                            if (ascension::CCard::IsCardFaction(r4_2) == 0)
                                int32_t j_2 = strcasecmp(r4_2 + 4, r4_1 + 4)
                                
                                if (j_2 == 0)
                                    goto label_14f140
                                
                                int32_t temp0_1 = 0
                                int32_t j = j_2
                                
                                while (j != 0)
                                    j u>>= 1
                                    temp0_1 += 1
                                
                                r5_1 |= (0x20 - temp0_1) u>> 5
                            
                            r10_1 += 1
                        while (r10_1 u< r0_6)
                    
                    if (r1 == 0 || (r5_1 & 1) == 0)
                        void* var_3c_2 = r7_1
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r7_1 + 8), 0xa082, 
                            "Copy %s", 
                            ascensionrules::CStateProcessCopyEffectOfLifeboundHero::SelectEffectToCopy)
        
    label_14f140:
        i = &i[2]
    while (i != *(r6 + 0xb84))

void* r0_27 = *(*(arg1 + 0x24c) + 0x3c)
int32_t* i_1 = *(r0_27 + 0xc)

if (i_1 != *(r0_27 + 0x10))
    do
        void* r7_2 = *i_1
        
        if (r7_2 != 0 && r7_2 != *(arg1 + 0x250))
            void* r4_3 = *(r7_2 + 0xc)
            
            if (*(r4_3 + 0x88) == 1 && ascension::CCard::IsCardFaction(r4_3) == 0
                    && ascension::CWorld::QueryCardFaction(r6, *(arg1 + 0x24c), r7_2) != 0)
                int32_t r10_2
                
                if (r1 != 0)
                    int32_t r8 = 0
                    r10_2 = 0
                    
                    do
                        void* r4_4 = *(*(*(r6 + 0xac8) + (r8 << 3)) + 0xc)
                        
                        if (ascension::CCard::IsCardFaction(r4_4) == 0)
                            int32_t j_3 = strcasecmp(r4_4 + 4, r4_3 + 4)
                            
                            if (j_3 == 0)
                                goto label_14f268
                            
                            int32_t temp0_2 = 0
                            int32_t j_1 = j_3
                            
                            while (j_1 != 0)
                                j_1 u>>= 1
                                temp0_2 += 1
                            
                            r10_2 |= (0x20 - temp0_2) u>> 5
                        
                        r8 += 1
                    while (r8 u< r0_6)
                
                if (r1 == 0 || (r10_2 & 1) == 0)
                    void* var_3c_3 = r7_2
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r7_2 + 8), 0xa082, "Copy %s", 
                        ascensionrules::CStateProcessCopyEffectOfLifeboundHero::SelectEffectToCopy)
        
    label_14f268:
        i_1 = &i_1[1]
    while (i_1 != *(*(*(arg1 + 0x24c) + 0x3c) + 0x10))

jump(*(*arg1 + 0x34))
