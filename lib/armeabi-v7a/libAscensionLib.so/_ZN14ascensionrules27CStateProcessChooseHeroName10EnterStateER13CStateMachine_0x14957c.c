// 函数: _ZN14ascensionrules27CStateProcessChooseHeroName10EnterStateER13CStateMachine
// 地址: 0x14957c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x24c)
void* r1 = *(r0 + 0x84)
int32_t r10 = *(r0 + 4)
int32_t* i = *(r1 + 0xc)

if (i != *(r1 + 0x10))
    do
        void* r1_2 = *i
        
        if (*(*(r1_2 + 0xc) + 0x88) == 1)
            void* var_2c_1 = r1_2
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r1_2 + 8) + 0x4000, 0xa0e1, "Name %s", 
                ascensionrules::CStateProcessChooseHeroName::SelectCard)
            r0 = *(arg1 + 0x24c)
        
        i = &i[1]
    while (i != *(*(r0 + 0x84) + 0x10))

void* r0_5 = ascension::CWorld::GetCenterRowCard(r10)

if (r0_5 != 0 && *(*(r0_5 + 0xc) + 0x88) == 1)
    void* var_2c_2 = r0_5
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_5 + 8), 0xa0e1, "Name %s", 
        ascensionrules::CStateProcessChooseHeroName::SelectCard)

void* r0_8 = ascension::CWorld::GetCenterRowCard(r10)

if (r0_8 != 0 && *(*(r0_8 + 0xc) + 0x88) == 1)
    void* var_2c_3 = r0_8
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_8 + 8), 0xa0e1, "Name %s", 
        ascensionrules::CStateProcessChooseHeroName::SelectCard)

void* r0_11 = ascension::CWorld::GetCenterRowCard(r10)

if (r0_11 != 0 && *(*(r0_11 + 0xc) + 0x88) == 1)
    void* var_2c_4 = r0_11
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_11 + 8), 0xa0e1, "Name %s", 
        ascensionrules::CStateProcessChooseHeroName::SelectCard)

void* r0_14 = ascension::CWorld::GetCenterRowCard(r10)

if (r0_14 != 0 && *(*(r0_14 + 0xc) + 0x88) == 1)
    void* var_2c_5 = r0_14
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_14 + 8), 0xa0e1, "Name %s", 
        ascensionrules::CStateProcessChooseHeroName::SelectCard)

void* r0_17 = ascension::CWorld::GetCenterRowCard(r10)

if (r0_17 != 0 && *(*(r0_17 + 0xc) + 0x88) == 1)
    void* var_2c_6 = r0_17
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_17 + 8), 0xa0e1, "Name %s", 
        ascensionrules::CStateProcessChooseHeroName::SelectCard)

void* r0_20 = ascension::CWorld::GetCenterRowCard(r10)

if (r0_20 != 0 && *(*(r0_20 + 0xc) + 0x88) == 1)
    void* var_2c_7 = r0_20
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_20 + 8), 0xa0e1, "Name %s", 
        ascensionrules::CStateProcessChooseHeroName::SelectCard)

void* r0_23 = ascension::CWorld::GetCenterRowCard(r10)

if (r0_23 != 0 && *(*(r0_23 + 0xc) + 0x88) == 1)
    void* var_2c_8 = r0_23
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_23 + 8), 0xa0e1, "Name %s", 
        ascensionrules::CStateProcessChooseHeroName::SelectCard)

int32_t* i_1 = *(r10 + 0xa30)

for (int32_t r0_25 = *(r10 + 0xa34); i_1 != r0_25; i_1 = &i_1[1])
    void* r1_35 = *i_1
    
    if (*(r1_35 + 0x10) != 0)
        int32_t r2_4 = *(r1_35 + 0x14)
        
        if (r2_4 != 0 && *(*(r1_35 + 0xc) + 0x88) == 1)
            int32_t var_2c_9 = r2_4
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r1_35 + 8), 0xa0e1, "Name %s", 
                ascensionrules::CStateProcessChooseHeroName::SelectCard)
            r0_25 = *(r10 + 0xa34)

void* r0_27 = *(r10 + 0xa4c)

for (int32_t* i_2 = *(r0_27 + 0xc); i_2 != *(r0_27 + 0x10); i_2 = &i_2[1])
    void* r2_5 = *i_2
    
    if (*(*(r2_5 + 0xc) + 0x88) == 1)
        void* var_2c_10 = r2_5
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_5 + 8), 0xa0e1, "Name %s", 
            ascensionrules::CStateProcessChooseHeroName::SelectCard)
        r0_27 = *(r10 + 0xa4c)

if (*(r10 + 0x30) u<= 0x19)
    *(arg1 + 0x24c)
else
    void* r2_6 = *(arg1 + 0x24c)
    void* r0_30 = *(r2_6 + 0x44)
    
    if (r0_30 != 0)
        int32_t* i_3 = *(r0_30 + 0xc)
        
        if (i_3 != *(r0_30 + 0x10))
            do
                void* r0_32 = *i_3
                
                if (*(*(r0_32 + 0xc) + 0x88) == 1)
                    void* var_2c_11 = r0_32
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_32 + 8), 0xa0e1, "Name %s", 
                        ascensionrules::CStateProcessChooseHeroName::SelectCard)
                    r2_6 = *(arg1 + 0x24c)
                
                i_3 = &i_3[1]
            while (i_3 != *(*(r2_6 + 0x44) + 0x10))

jump(*(*arg1 + 0x34))
