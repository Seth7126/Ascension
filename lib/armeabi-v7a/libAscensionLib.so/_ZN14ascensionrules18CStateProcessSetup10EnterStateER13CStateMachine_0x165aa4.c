// 函数: _ZN14ascensionrules18CStateProcessSetup10EnterStateER13CStateMachine
// 地址: 0x165aa4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r0_1 = *(arg1 + 0x38)
int16_t* r7 = *(r0_1 + 0xa28)
int32_t r1_2 = (*(r0_1 + 0x1c) - *(r0_1 + 0x18)) s>> 2

if (zx.d(*r7) != 1)
    if (r1_2 - 1 u< 2)
        r7[2]
    else if (r1_2 != 3)
        r7[2]
    else
        r7[2]
else if (r1_2 - 1 u< 2)
    r7[2]
else if (r1_2 != 3)
    r7[2]
else
    r7[2]

ascension::CWorld::SetHonorTokenPool(r0_1)
uint32_t r2_4 = zx.d(*r7)
uint32_t r0_4
char* r1_13
char const* const r2_5

if ((r2_4 & 0x4000) != 0)
    uint32_t r0_5 = *(arg1 + 0x38)
    char* r1_14 = *(r0_5 + 4)
    *(r0_5 + 4) = &r1_14[1]
    ascension::CWorld::CreateKingdomStack(r0_5, r1_14, "Mystic 10TH")
    uint32_t r0_6 = *(arg1 + 0x38)
    char* r1_15 = *(r0_6 + 4)
    *(r0_6 + 4) = &r1_15[1]
    ascension::CWorld::CreateKingdomStack(r0_6, r1_15, "Heavy Infantry 10TH")
    r0_4 = *(arg1 + 0x38)
    r1_13 = *(r0_4 + 4)
    r2_5 = "Cultist 10TH"
label_165c04:
    *(r0_4 + 4) = &r1_13[1]
    ascension::CWorld::CreateKingdomStack(r0_4, r1_13, r2_5)
    
    if ((zx.d(*r7) & 0xc) != 0)
        goto label_165c1c
else
    if ((r2_4 & 0x3fc0) != 0)
        uint32_t r0_2 = *(arg1 + 0x38)
        char* r1_11 = *(r0_2 + 4)
        *(r0_2 + 4) = &r1_11[1]
        ascension::CWorld::CreateKingdomStack(r0_2, r1_11, "Mystic RU")
        uint32_t r0_3 = *(arg1 + 0x38)
        char* r1_12 = *(r0_3 + 4)
        *(r0_3 + 4) = &r1_12[1]
        ascension::CWorld::CreateKingdomStack(r0_3, r1_12, "Heavy Infantry RU")
        r0_4 = *(arg1 + 0x38)
        r1_13 = *(r0_4 + 4)
        r2_5 = "Cultist RU"
        goto label_165c04
    
    if ((r2_4 & 0x30) != 0)
        uint32_t r0_601 = *(arg1 + 0x38)
        char* r1_354 = *(r0_601 + 4)
        *(r0_601 + 4) = &r1_354[1]
        ascension::CWorld::CreateKingdomStack(r0_601, r1_354, "Mystic RoV")
        uint32_t r0_602 = *(arg1 + 0x38)
        char* r1_355 = *(r0_602 + 4)
        *(r0_602 + 4) = &r1_355[1]
        ascension::CWorld::CreateKingdomStack(r0_602, r1_355, "Heavy Infantry RoV")
        r0_4 = *(arg1 + 0x38)
        r1_13 = *(r0_4 + 4)
        r2_5 = "Cultist RoV"
        goto label_165c04
    
    uint32_t r0_615 = *(arg1 + 0x38)
    char* r1_365 = *(r0_615 + 4)
    *(r0_615 + 4) = &r1_365[1]
    uint32_t r0_8
    char* r1_16
    
    if ((r2_4 & 0xc) == 0)
        ascension::CWorld::CreateKingdomStack(r0_615, r1_365, "Mystic")
        uint32_t r0_648 = *(arg1 + 0x38)
        char* r1_385 = *(r0_648 + 4)
        *(r0_648 + 4) = &r1_385[1]
        ascension::CWorld::CreateKingdomStack(r0_648, r1_385, "Heavy Infantry")
        r0_8 = *(arg1 + 0x38)
        r1_16 = *(r0_8 + 4)
        *(r0_8 + 4) = &r1_16[1]
        ascension::CWorld::CreateKingdomStack(r0_8, r1_16, "Cultist")
    else
        ascension::CWorld::CreateKingdomStack(r0_615, r1_365, "Mystic SoS")
        uint32_t r0_616 = *(arg1 + 0x38)
        char* r1_366 = *(r0_616 + 4)
        *(r0_616 + 4) = &r1_366[1]
        ascension::CWorld::CreateKingdomStack(r0_616, r1_366, "Heavy Infantry SoS")
        uint32_t r0_617 = *(arg1 + 0x38)
        char* r1_367 = *(r0_617 + 4)
        *(r0_617 + 4) = &r1_367[1]
        ascension::CWorld::CreateKingdomStack(r0_617, r1_367, "Cultist SoS")
    label_165c1c:
        r0_8 = *(arg1 + 0x38)
        r1_16 = *(r0_8 + 4)
        *(r0_8 + 4) = &r1_16[1]
        ascension::CWorld::CreateKingdomStack(r0_8, r1_16, "Fanatic SoS")
uint32_t r0_9 = zx.d(*r7)
int16_t* var_40 = r7
int32_t r8_1

if ((r0_9 & 1) != 0)
    core::CInstance* r0_20 = *(arg1 + 0x38)
    
    if (zx.d(*(r0_20 + 0xa2c)) != 0)
        for (int32_t i = 0; i != 0x64; i += 1)
            int32_t j = 0
            void* r0_21 =
                &(&_vtable_for_ascensionrules::CStateProcessSetup{for `CStateList'}.vFunc_13)[i * 2]
            *r0_21
            
            do
                if (ascension::CDatabase::GetCard(ascension::g_Database) != 0)
                    ascension::CWorld::CreateCard(*(arg1 + 0x38))
                    ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
                
                j += 1
            while (j u< *(r0_21 + 4))
        
        r8_1 = 1
        r7 = var_40
    else if (*(r0_20 + 0x30) u< 4)
        int32_t r5_52 = 0xffffffff + ((*(r0_20 + 0x1c) - *(r0_20 + 0x18)) s>> 2)
        int32_t r2_11 = r5_52 * 3
        void* r4_60 = (&data_1e44d8)[r2_11]
        int32_t r0_614 = (&data_1e44dc)[r2_11]
        void* r6_18
        
        if (r4_60 == r0_614)
            if ((*((r2_11 << 2) + 0x1e44e0) - r4_60) s>> 2 u<= 0x63)
                void* r6_19 = r0_614 - r4_60
                void* r0_618 = operator new(0x190)
                
                if (r6_19 s>= 1)
                    __aeabi_memcpy4(r0_618, r4_60, r6_19)
                
                (&data_1e44d8)[r2_11] = r0_618
                (&data_1e44dc)[r2_11] = r0_618 + r6_19
                *((r2_11 << 2) + 0x1e44e0) = r0_618 + 0x190
                
                if (r4_60 != 0)
                    operator delete(r4_60)
            
            int32_t i_1 = 0
            *(&data_1e4608 + (r5_52 << 2)) = 0
            core::CCard* r7_5 = *(*(arg1 + 0x38) + 4)
            
            do
                int32_t j_1 = 0
                void* r0_626 = ascensionrules::s_StartingCenterDeckSet1List + (i_1 << 3)
                *r0_626
                
                do
                    if (ascension::CDatabase::GetCard(ascension::g_Database) != 0)
                        core::CWorldBase* r0_629 = operator new(0x10)
                        core::CCardInstance::CCardInstance(r0_629, 0, r7_5)
                        core::CWorldBase* var_2c_1 = r0_629
                        core::CWorldBase** r0_630 = (&data_1e44dc)[r2_11]
                        
                        if (r0_630 == *((r2_11 << 2) + 0x1e44e0))
                            std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                                &(&data_1e44d8)[r2_11])
                        else
                            *r0_630 = r0_629
                            (&data_1e44dc)[r2_11] += 4
                        
                        r7_5 += 1
                        *(&data_1e4608 + (r5_52 << 2)) += 1
                    
                    j_1 += 1
                while (j_1 u< *(r0_626 + 4))
                
                i_1 += 1
            while (i_1 u< 0x30)
            
            r7 = var_40
            r6_18 = &data_1e4608 + (r5_52 << 2)
        else
            r6_18 = &data_1e4608 + (r5_52 << 2)
        
        r8_1 = 1
        
        if (*r6_18 != 0)
            int32_t i_2 = 0
            
            do
                core::CInstance* r0_639 = *(arg1 + 0x38)
                void* r4_62 = *((&data_1e44d8)[r2_11] + (i_2 << 2))
                int32_t r1_378 = *(r0_639 + 4)
                *(r0_639 + 4) = r1_378 + 1
                
                if (r1_378 == zx.d(*(r4_62 + 8)))
                    core::CWorldBase::AddInstance(r0_639)
                    ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
                    void* r5_53 = *(r4_62 + 0xc)
                    int32_t r0_641 = *(r5_53 + 0x88)
                    
                    if (r0_641 == 2)
                        ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
                    else if (r0_641 == 1)
                        ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                        
                        if (ascension::CCard::IsCardFaction(r5_53) != 0)
                            ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
                
                i_2 += 1
            while (i_2 u< *r6_18)
            
            r7 = var_40
    else
        r8_1 = 1
        
        if (data_1e441c != 0)
            int32_t r6_17 = 0
            
            while (true)
                void* r4_59 = *(data_1e4288 + (r6_17 << 2))
                core::CWorldBase::AddInstance(r0_20)
                ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
                void* r5_51 = *(r4_59 + 0xc)
                int32_t r0_604 = *(r5_51 + 0x88)
                
                if (r0_604 == 2)
                    ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
                else if (r0_604 == 1)
                    ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                    
                    if (ascension::CCard::IsCardFaction(r5_51) != 0)
                        ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
                
                r6_17 += 1
                
                if (r6_17 u>= data_1e441c)
                    break
                
                r0_20 = *(arg1 + 0x38)
else
    r8_1 = 0
    
    if ((r0_9 & 0x4000) == 0 && data_1e441c != 0)
        int32_t i_3 = 0
        
        do
            void* r5_1 = *(*(data_1e4288 + (i_3 << 2)) + 0xc)
            int32_t r0_12 = *(r5_1 + 0x88)
            
            if (r0_12 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_12 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_1) != 0)
                    core::CWorldBase::AddInstance(*(arg1 + 0x38))
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            i_3 += 1
        while (i_3 u< data_1e441c)
        
        r8_1 = 0

if ((zx.d(*(r7 + 1)) & 0x40) != 0)
    if (data_1e44d0 != 0)
        int32_t i_4 = 0
        
        do
            void* r4_2 = *(data_1e4294 + (i_4 << 2))
            core::CWorldBase::AddInstance(*(arg1 + 0x38))
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            void* r5_3 = *(r4_2 + 0xc)
            int32_t r0_33 = *(r5_3 + 0x88)
            
            if (r0_33 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_33 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_3) != 0)
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            i_4 += 1
        while (i_4 u< data_1e44d0)
    
    core::CInstance* r0_40 = *(arg1 + 0x38)
    r8_1 += 1
    
    if (*(r0_40 + 0x30) u>= 0x21 && data_1e44d4 != 0)
        int32_t r6_1 = 0
        
        while (true)
            void* r4_3 = *(data_1e42a0 + (r6_1 << 2))
            core::CWorldBase::AddInstance(r0_40)
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            void* r5_4 = *(r4_3 + 0xc)
            int32_t r0_42 = *(r5_4 + 0x88)
            
            if (r0_42 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_42 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_4) != 0)
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            r6_1 += 1
            
            if (r6_1 u>= data_1e44d4)
                break
            
            r0_40 = *(arg1 + 0x38)

int32_t r9_1

if ((zx.d(*r7) & 2) != 0)
    core::CInstance* r0_60 = *(arg1 + 0x38)
    
    if (*(r0_60 + 0x30) u<= 3)
        for (int32_t i_5 = 0; i_5 != 0x1f; i_5 += 1)
            *(ascensionrules::s_StartingCenterDeckSet2List + (i_5 << 3))
            void* r0_70 = ascension::CDatabase::GetCard(ascension::g_Database)
            
            if (r0_70 != 0)
                int32_t j_2 = 0
                
                do
                    ascension::CWorld::CreateCard(*(arg1 + 0x38))
                    ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
                    
                    if (j_2 == 0)
                        int32_t r0_72 = *(r0_70 + 0x88)
                        
                        if (r0_72 == 2)
                            ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
                        else if (r0_72 == 1)
                            ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                            
                            if (ascension::CCard::IsCardFaction(r0_70) != 0)
                                ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
                    
                    j_2 += 1
                while (j_2 u< *(ascensionrules::s_StartingCenterDeckSet2List + (i_5 << 3) + 4))
        
        r9_1 = 1
        r7 = var_40
    else
        r9_1 = 1
        
        if (data_1e4420 != 0)
            int32_t r6_2 = 0
            
            while (true)
                void* r4_5 = *(data_1e42ac + (r6_2 << 2))
                core::CWorldBase::AddInstance(r0_60)
                ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
                void* r5_6 = *(r4_5 + 0xc)
                int32_t r0_62 = *(r5_6 + 0x88)
                
                if (r0_62 == 2)
                    ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
                else if (r0_62 == 1)
                    ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                    
                    if (ascension::CCard::IsCardFaction(r5_6) != 0)
                        ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
                
                r6_2 += 1
                
                if (r6_2 u>= data_1e4420)
                    break
                
                r0_60 = *(arg1 + 0x38)
else
    if (data_1e4420 != 0)
        int32_t i_6 = 0
        
        do
            void* r5_5 = *(*(data_1e42ac + (i_6 << 2)) + 0xc)
            int32_t r0_52 = *(r5_5 + 0x88)
            
            if (r0_52 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_52 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_5) != 0)
                    core::CWorldBase::AddInstance(*(arg1 + 0x38))
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            i_6 += 1
        while (i_6 u< data_1e4420)
    
    r9_1 = 0

if ((zx.d(*r7) & 4) != 0)
    core::CInstance* r0_93 = *(arg1 + 0x38)
    r8_1 += 1
    
    if (*(r0_93 + 0x30) u<= 3)
        for (int32_t i_7 = 0; i_7 != 0x34; i_7 += 1)
            *(ascensionrules::s_StartingCenterDeckSet3List + (i_7 << 3))
            void* r0_103 = ascension::CDatabase::GetCard(ascension::g_Database)
            
            if (r0_103 != 0)
                int32_t j_3 = 0
                
                do
                    ascension::CWorld::CreateCard(*(arg1 + 0x38))
                    ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
                    
                    if (j_3 == 0)
                        int32_t r0_105 = *(r0_103 + 0x88)
                        
                        if (r0_105 == 2)
                            ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
                        else if (r0_105 == 1)
                            ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                            
                            if (ascension::CCard::IsCardFaction(r0_103) != 0)
                                ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
                    
                    j_3 += 1
                while (j_3 u< *(ascensionrules::s_StartingCenterDeckSet3List + (i_7 << 3) + 4))
        
        r7 = var_40
    else if (data_1e4424 != 0)
        int32_t r6_3 = 0
        
        while (true)
            void* r4_8 = *(data_1e42b8 + (r6_3 << 2))
            core::CWorldBase::AddInstance(r0_93)
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            void* r5_9 = *(r4_8 + 0xc)
            int32_t r0_95 = *(r5_9 + 0x88)
            
            if (r0_95 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_95 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_9) != 0)
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            r6_3 += 1
            
            if (r6_3 u>= data_1e4424)
                break
            
            r0_93 = *(arg1 + 0x38)
else if (data_1e4424 != 0)
    int32_t i_8 = 0
    
    do
        void* r5_8 = *(*(data_1e42b8 + (i_8 << 2)) + 0xc)
        int32_t r0_85 = *(r5_8 + 0x88)
        
        if (r0_85 == 2)
            ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
        else if (r0_85 == 1)
            ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
            
            if (ascension::CCard::IsCardFaction(r5_8) != 0)
                core::CWorldBase::AddInstance(*(arg1 + 0x38))
                ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
        
        i_8 += 1
    while (i_8 u< data_1e4424)

if ((zx.d(*r7) & 8) != 0)
    core::CInstance* r0_126 = *(arg1 + 0x38)
    r9_1 += 1
    
    if (*(r0_126 + 0x30) u<= 6)
        if (data_1e442c != 0)
            int32_t r6_6 = 0
            
            while (true)
                void* r4_12 = *(data_1e42c4 + (r6_6 << 2))
                core::CWorldBase::AddInstance(r0_126)
                ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
                void* r5_13 = *(r4_12 + 0xc)
                int32_t r0_136 = *(r5_13 + 0x88)
                
                if (r0_136 == 2)
                    ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
                else if (r0_136 == 1)
                    ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                    
                    if (ascension::CCard::IsCardFaction(r5_13) != 0)
                        ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
                
                r6_6 += 1
                
                if (r6_6 u>= data_1e442c)
                    break
                
                r0_126 = *(arg1 + 0x38)
    else if (data_1e4438 != 0)
        int32_t r6_5 = 0
        
        while (true)
            void* r4_11 = *(data_1e42d0 + (r6_5 << 2))
            core::CWorldBase::AddInstance(r0_126)
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            void* r5_12 = *(r4_11 + 0xc)
            int32_t r0_128 = *(r5_12 + 0x88)
            
            if (r0_128 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_128 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_12) != 0)
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            r6_5 += 1
            
            if (r6_5 u>= data_1e4438)
                break
            
            r0_126 = *(arg1 + 0x38)
else if (data_1e4438 != 0)
    int32_t i_9 = 0
    
    do
        void* r5_11 = *(*(data_1e42d0 + (i_9 << 2)) + 0xc)
        int32_t r0_118 = *(r5_11 + 0x88)
        
        if (r0_118 == 2)
            ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
        else if (r0_118 == 1)
            ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
            
            if (ascension::CCard::IsCardFaction(r5_11) != 0)
                core::CWorldBase::AddInstance(*(arg1 + 0x38))
                ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
        
        i_9 += 1
    while (i_9 u< data_1e4438)

uint32_t r0_160 = zx.d(*r7)

if ((r0_160 & 8) != 0 || (zx.d(r7[1].b) & 0x18) != 0)
    if (data_1e4430 != 0)
        int32_t i_10 = 0
        
        do
            *(data_1e42dc + (i_10 << 2))
            core::CWorldBase::AddInstance(*(arg1 + 0x38))
            ascension::CWorld::AddCardToSoulGemDeck(*(arg1 + 0x38))
            i_10 += 1
        while (i_10 u< data_1e4430)
    
    if (*(*(arg1 + 0x38) + 0x30) u> 7 && ascension::CDatabase::GetCard(ascension::g_Database) != 0)
        ascension::CWorld::CreateCard(*(arg1 + 0x38))
        ascension::CWorld::AddCardToSoulGemDeck(*(arg1 + 0x38))
        ascension::CWorld::CreateCard(*(arg1 + 0x38))
        ascension::CWorld::AddCardToSoulGemDeck(*(arg1 + 0x38))
    
    *(*(arg1 + 0x38) + 0xa5c)
    core::CCardStack::Shuffle()
    r0_160 = zx.d(*r7)

if ((r0_160 & 0x10) != 0)
    r8_1 += 1
    
    if (data_1e4454 != 0)
        int32_t i_11 = 0
        
        do
            void* r4_16 = *(data_1e42e8 + (i_11 << 2))
            core::CWorldBase::AddInstance(*(arg1 + 0x38))
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            void* r5_15 = *(r4_16 + 0xc)
            int32_t r0_177 = *(r5_15 + 0x88)
            
            if (r0_177 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_177 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_15) != 0)
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            i_11 += 1
        while (i_11 u< data_1e4454)
else if (*(*(arg1 + 0x38) + 0x30) u>= 0x11 && data_1e4454 != 0)
    int32_t i_12 = 0
    
    do
        void* r5_14 = *(*(data_1e42e8 + (i_12 << 2)) + 0xc)
        int32_t r0_165 = *(r5_14 + 0x88)
        
        if (r0_165 == 2)
            ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
        else if (r0_165 == 1)
            ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
            
            if (ascension::CCard::IsCardFaction(r5_14) != 0)
                core::CWorldBase::AddInstance(*(arg1 + 0x38))
                ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
        
        i_12 += 1
    while (i_12 u< data_1e4454)

if ((zx.d(*r7) & 0x20) != 0)
    core::CInstance* r0_197 = *(arg1 + 0x38)
    r9_1 += 1
    
    if (*(r0_197 + 0x30) u<= 0xe)
        for (int32_t i_13 = 0; i_13 != 0x22; i_13 += 1)
            (&data_1db328)[i_13 * 2]
            void* r0_199 = ascension::CDatabase::GetCard(ascension::g_Database)
            
            if (r0_199 != 0)
                int32_t j_4 = 0
                
                do
                    ascension::CWorld::CreateCard(*(arg1 + 0x38))
                    ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
                    int32_t r0_204 = *(r0_199 + 0x88)
                    
                    if (r0_204 == 2)
                        ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
                    else if (r0_204 == 1)
                        ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                        
                        if (ascension::CCard::IsCardFaction(r0_199) != 0)
                            ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
                    
                    j_4 += 1
                while (j_4 u< *((i_13 << 3) + 0x1db32c))
        
        r7 = var_40
    else if (data_1e4458 != 0)
        int32_t r6_8 = 0
        
        while (true)
            void* r4_19 = *(data_1e42f4 + (r6_8 << 2))
            core::CWorldBase::AddInstance(r0_197)
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            void* r5_18 = *(r4_19 + 0xc)
            int32_t r0_212 = *(r5_18 + 0x88)
            
            if (r0_212 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_212 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_18) != 0)
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            r6_8 += 1
            
            if (r6_8 u>= data_1e4458)
                break
            
            r0_197 = *(arg1 + 0x38)
else if (*(*(arg1 + 0x38) + 0x30) u>= 0x11 && data_1e4458 != 0)
    int32_t i_14 = 0
    
    do
        void* r5_16 = *(*(data_1e42f4 + (i_14 << 2)) + 0xc)
        int32_t r0_189 = *(r5_16 + 0x88)
        
        if (r0_189 == 2)
            ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
        else if (r0_189 == 1)
            ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
            
            if (ascension::CCard::IsCardFaction(r5_16) != 0)
                core::CWorldBase::AddInstance(*(arg1 + 0x38))
                ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
        
        i_14 += 1
    while (i_14 u< data_1e4458)

if ((zx.d(*r7) & 0x40) != 0)
    core::CInstance* r0_232 = *(arg1 + 0x38)
    r8_1 += 1
    
    if (*(r0_232 + 0x30) u<= 0x11)
        if (data_1e446c != 0)
            int32_t r6_10 = 0
            
            while (true)
                void* r4_22 = *(data_1e4300 + (r6_10 << 2))
                core::CWorldBase::AddInstance(r0_232)
                ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
                void* r5_21 = *(r4_22 + 0xc)
                int32_t r0_242 = *(r5_21 + 0x88)
                
                if (r0_242 == 2)
                    ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
                else if (r0_242 == 1)
                    ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                    
                    if (ascension::CCard::IsCardFaction(r5_21) != 0)
                        ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
                
                r6_10 += 1
                
                if (r6_10 u>= data_1e446c)
                    break
                
                r0_232 = *(arg1 + 0x38)
    else if (data_1e4470 != 0)
        int32_t r6_9 = 0
        
        while (true)
            void* r4_21 = *(data_1e430c + (r6_9 << 2))
            core::CWorldBase::AddInstance(r0_232)
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            void* r5_20 = *(r4_21 + 0xc)
            int32_t r0_234 = *(r5_20 + 0x88)
            
            if (r0_234 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_234 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_20) != 0)
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            r6_9 += 1
            
            if (r6_9 u>= data_1e4470)
                break
            
            r0_232 = *(arg1 + 0x38)
else if (*(*(arg1 + 0x38) + 0x30) u>= 0x13 && data_1e4470 != 0)
    int32_t i_15 = 0
    
    do
        void* r5_19 = *(*(data_1e430c + (i_15 << 2)) + 0xc)
        int32_t r0_224 = *(r5_19 + 0x88)
        
        if (r0_224 == 2)
            ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
        else if (r0_224 == 1)
            ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
            
            if (ascension::CCard::IsCardFaction(r5_19) != 0)
                core::CWorldBase::AddInstance(*(arg1 + 0x38))
                ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
        
        i_15 += 1
    while (i_15 u< data_1e4470)

if ((zx.d(*r7) & 0x80) != 0)
    r8_1 += 1
    
    if (data_1e4474 != 0)
        int32_t i_16 = 0
        
        do
            void* r4_24 = *(data_1e4318 + (i_16 << 2))
            core::CWorldBase::AddInstance(*(arg1 + 0x38))
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            void* r5_23 = *(r4_24 + 0xc)
            int32_t r0_266 = *(r5_23 + 0x88)
            
            if (r0_266 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_266 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_23) != 0)
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            i_16 += 1
        while (i_16 u< data_1e4474)
else if (*(*(arg1 + 0x38) + 0x30) u>= 0x15 && data_1e4474 != 0)
    int32_t i_17 = 0
    
    do
        void* r5_22 = *(*(data_1e4318 + (i_17 << 2)) + 0xc)
        int32_t r0_254 = *(r5_22 + 0x88)
        
        if (r0_254 == 2)
            ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
        else if (r0_254 == 1)
            ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
            
            if (ascension::CCard::IsCardFaction(r5_22) != 0)
                core::CWorldBase::AddInstance(*(arg1 + 0x38))
                ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
        
        i_17 += 1
    while (i_17 u< data_1e4474)

if ((zx.d(*(r7 + 1)) & 1) != 0)
    r8_1 += 1
    
    if (data_1e4480 != 0)
        int32_t i_18 = 0
        
        do
            void* r4_26 = *(data_1e4330 + (i_18 << 2))
            core::CWorldBase::AddInstance(*(arg1 + 0x38))
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            void* r5_25 = *(r4_26 + 0xc)
            int32_t r0_290 = *(r5_25 + 0x88)
            
            if (r0_290 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_290 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_25) != 0)
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            i_18 += 1
        while (i_18 u< data_1e4480)
else if (*(*(arg1 + 0x38) + 0x30) u>= 0x16 && data_1e4480 != 0)
    int32_t i_19 = 0
    
    do
        void* r5_24 = *(*(data_1e4330 + (i_19 << 2)) + 0xc)
        int32_t r0_278 = *(r5_24 + 0x88)
        
        if (r0_278 == 2)
            ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
        else if (r0_278 == 1)
            ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
            
            if (ascension::CCard::IsCardFaction(r5_24) != 0)
                core::CWorldBase::AddInstance(*(arg1 + 0x38))
                ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
        
        i_19 += 1
    while (i_19 u< data_1e4480)

core::CInstance* r0_297 = *(arg1 + 0x38)

if (*(r0_297 + 0x30) u>= 0x16 && ((zx.d(*(r7 + 1)) & 1) != 0 || (zx.d(r7[1].b) & 0x18) != 0))
    if (data_1e4484 != 0)
        *data_1e433c
        core::CWorldBase::AddInstance(r0_297)
        ascension::CWorld::AddCardToDreamDeck(*(arg1 + 0x38))
        
        if (data_1e4484 u>= 2)
            int32_t i_20 = 1
            
            do
                *(data_1e433c + (i_20 << 2))
                core::CWorldBase::AddInstance(*(arg1 + 0x38))
                ascension::CWorld::AddCardToDreamDeck(*(arg1 + 0x38))
                i_20 += 1
            while (i_20 u< data_1e4484)
        
        r0_297 = *(arg1 + 0x38)
    
    *(r0_297 + 0xa60)
    core::CCardStack::Shuffle()

if ((zx.d(*(r7 + 1)) & 2) != 0)
    r8_1 += 1
    
    if (data_1e4488 != 0)
        int32_t i_21 = 0
        
        do
            void* r4_30 = *(data_1e4348 + (i_21 << 2))
            core::CWorldBase::AddInstance(*(arg1 + 0x38))
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            void* r5_27 = *(r4_30 + 0xc)
            int32_t r0_322 = *(r5_27 + 0x88)
            
            if (r0_322 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_322 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_27) != 0)
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            i_21 += 1
        while (i_21 u< data_1e4488)
else if (*(*(arg1 + 0x38) + 0x30) u>= 0x18 && data_1e4488 != 0)
    int32_t i_22 = 0
    
    do
        void* r5_26 = *(*(data_1e4348 + (i_22 << 2)) + 0xc)
        int32_t r0_310 = *(r5_26 + 0x88)
        
        if (r0_310 == 2)
            ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
        else if (r0_310 == 1)
            ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
            
            if (ascension::CCard::IsCardFaction(r5_26) != 0)
                core::CWorldBase::AddInstance(*(arg1 + 0x38))
                ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
        
        i_22 += 1
    while (i_22 u< data_1e4488)

if ((zx.d(*(r7 + 1)) & 4) != 0)
    if (data_1e4490 != 0)
        int32_t i_23 = 0
        
        do
            void* r4_33 = *(data_1e4354 + (i_23 << 2))
            core::CWorldBase::AddInstance(*(arg1 + 0x38))
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            void* r5_30 = *(r4_33 + 0xc)
            int32_t r0_356 = *(r5_30 + 0x88)
            
            if (r0_356 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_356 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_30) != 0)
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            i_23 += 1
        while (i_23 u< data_1e4490)
    
    core::CInstance* r0_363 = *(arg1 + 0x38)
    r8_1 += 1
    
    if (*(r0_363 + 0x30) u>= 0x1b && data_1e4494 != 0)
        int32_t r6_11 = 0
        
        while (true)
            void* r4_34 = *(data_1e4360 + (r6_11 << 2))
            core::CWorldBase::AddInstance(r0_363)
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            void* r5_31 = *(r4_34 + 0xc)
            int32_t r0_365 = *(r5_31 + 0x88)
            
            if (r0_365 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_365 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_31) != 0)
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            r6_11 += 1
            
            if (r6_11 u>= data_1e4494)
                break
            
            r0_363 = *(arg1 + 0x38)
else
    int32_t r0_331 = *(*(arg1 + 0x38) + 0x30)
    
    if (r0_331 u>= 0x1a)
        if (data_1e4490 != 0)
            int32_t i_24 = 0
            
            do
                void* r5_28 = *(*(data_1e4354 + (i_24 << 2)) + 0xc)
                int32_t r0_333 = *(r5_28 + 0x88)
                
                if (r0_333 == 2)
                    ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
                else if (r0_333 == 1)
                    ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                    
                    if (ascension::CCard::IsCardFaction(r5_28) != 0)
                        core::CWorldBase::AddInstance(*(arg1 + 0x38))
                        ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
                
                i_24 += 1
            while (i_24 u< data_1e4490)
            
            r0_331 = *(*(arg1 + 0x38) + 0x30)
        
        if (r0_331 u>= 0x1b && data_1e4494 != 0)
            int32_t i_25 = 0
            
            do
                void* r5_29 = *(*(data_1e4360 + (i_25 << 2)) + 0xc)
                int32_t r0_344 = *(r5_29 + 0x88)
                
                if (r0_344 == 2)
                    ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
                else if (r0_344 == 1)
                    ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                    
                    if (ascension::CCard::IsCardFaction(r5_29) != 0)
                        core::CWorldBase::AddInstance(*(arg1 + 0x38))
                        ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
                
                i_25 += 1
            while (i_25 u< data_1e4494)

if ((zx.d(*(r7 + 1)) & 8) != 0)
    if (data_1e44a0 != 0)
        int32_t i_26 = 0
        
        do
            *(data_1e4378 + (i_26 << 2))
            core::CWorldBase::AddInstance(*(arg1 + 0x38))
            ascension::CWorld::AddAvailableTemple(*(arg1 + 0x38))
            i_26 += 1
        while (i_26 u< data_1e44a0)
    
    r8_1 += 1
    
    if (data_1e449c != 0)
        int32_t i_27 = 0
        
        do
            void* r4_37 = *(data_1e436c + (i_27 << 2))
            core::CWorldBase::AddInstance(*(arg1 + 0x38))
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            void* r5_33 = *(r4_37 + 0xc)
            int32_t r0_394 = *(r5_33 + 0x88)
            
            if (r0_394 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_394 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_33) != 0)
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            i_27 += 1
        while (i_27 u< data_1e449c)
else if (*(*(arg1 + 0x38) + 0x30) u>= 0x1d && data_1e449c != 0)
    int32_t i_28 = 0
    
    do
        void* r5_32 = *(*(data_1e436c + (i_28 << 2)) + 0xc)
        int32_t r0_377 = *(r5_32 + 0x88)
        
        if (r0_377 == 2)
            ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
        else if (r0_377 == 1)
            ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
            
            if (ascension::CCard::IsCardFaction(r5_32) != 0)
                core::CWorldBase::AddInstance(*(arg1 + 0x38))
                ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
        
        i_28 += 1
    while (i_28 u< data_1e449c)

if ((zx.d(*(r7 + 1)) & 0x10) != 0)
    *(arg1 + 0x38)
    ascension::CWorld::CreateDeliriumDie()
    r8_1 += 1
    
    if (data_1e44a4 != 0)
        int32_t i_29 = 0
        
        do
            void* r4_39 = *(data_1e4384 + (i_29 << 2))
            core::CWorldBase::AddInstance(*(arg1 + 0x38))
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            void* r5_35 = *(r4_39 + 0xc)
            int32_t r0_419 = *(r5_35 + 0x88)
            
            if (r0_419 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_419 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_35) != 0)
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            i_29 += 1
        while (i_29 u< data_1e44a4)
else if (*(*(arg1 + 0x38) + 0x30) u>= 0x1e && data_1e44a4 != 0)
    int32_t i_30 = 0
    
    do
        void* r5_34 = *(*(data_1e4384 + (i_30 << 2)) + 0xc)
        int32_t r0_406 = *(r5_34 + 0x88)
        
        if (r0_406 == 2)
            ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
        else if (r0_406 == 1)
            ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
            
            if (ascension::CCard::IsCardFaction(r5_34) != 0)
                core::CWorldBase::AddInstance(*(arg1 + 0x38))
                ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
        
        i_30 += 1
    while (i_30 u< data_1e44a4)

int32_t var_30_4

if ((zx.d(*(r7 + 1)) & 0x20) != 0)
    if (data_1e44bc != 0)
        int32_t i_31 = 0
        
        do
            int32_t r4_41 = *(data_1e439c + (i_31 << 2))
            core::CWorldBase::AddInstance(*(arg1 + 0x38))
            ascension::CWorld::AddUniqueAvailableCard(*(arg1 + 0x38), r4_41.b)
            i_31 += 1
        while (i_31 u< data_1e44bc)
    
    var_30_4 = r8_1 + 1
    
    if (data_1e44b8 != 0)
        int32_t i_32 = 0
        
        do
            void* r4_42 = *(data_1e4390 + (i_32 << 2))
            core::CWorldBase::AddInstance(*(arg1 + 0x38))
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            void* r5_37 = *(r4_42 + 0xc)
            int32_t r0_448 = *(r5_37 + 0x88)
            
            if (r0_448 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_448 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_37) != 0)
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            i_32 += 1
        while (i_32 u< data_1e44b8)
else
    var_30_4 = r8_1
    
    if (*(*(arg1 + 0x38) + 0x30) u>= 0x20 && data_1e44b8 != 0)
        int32_t i_33 = 0
        
        do
            void* r5_36 = *(*(data_1e4390 + (i_33 << 2)) + 0xc)
            int32_t r0_431 = *(r5_36 + 0x88)
            
            if (r0_431 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_431 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_36) != 0)
                    core::CWorldBase::AddInstance(*(arg1 + 0x38))
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            i_33 += 1
        while (i_33 u< data_1e44b8)

if ((zx.d(r7[1].b) & 1) != 0)
    core::CInstance* r0_456 = *(arg1 + 0x38)
    
    if (*(r0_456 + 0x30) u<= 3)
        for (int32_t i_34 = 0; i_34 != 6; i_34 += 1)
            (&data_1dafe8)[i_34 * 2]
            void* r0_466 = ascension::CDatabase::GetCard(ascension::g_Database)
            
            if (r0_466 != 0)
                int32_t j_5 = 0
                
                do
                    ascension::CWorld::CreateCard(*(arg1 + 0x38))
                    ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
                    
                    if (j_5 == 0)
                        int32_t r0_468 = *(r0_466 + 0x88)
                        
                        if (r0_468 == 2)
                            ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
                        else if (r0_468 == 1)
                            ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                            
                            if (ascension::CCard::IsCardFaction(r0_466) != 0)
                                ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
                    
                    j_5 += 1
                while (j_5 u< *((i_34 << 3) + 0x1dafec))
    else if (data_1e4428 != 0)
        int32_t r6_12 = 0
        
        while (true)
            void* r4_43 = *(data_1e43a8 + (r6_12 << 2))
            core::CWorldBase::AddInstance(r0_456)
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            void* r5_38 = *(r4_43 + 0xc)
            int32_t r0_458 = *(r5_38 + 0x88)
            
            if (r0_458 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_458 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_38) != 0)
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            r6_12 += 1
            
            if (r6_12 u>= data_1e4428)
                break
            
            r0_456 = *(arg1 + 0x38)

int16_t* r7_2 = var_40
uint32_t r0_478 = zx.d(r7_2[1])
CStateMachine& r9_3

if ((r0_478 & 2) == 0)
    r9_3 = arg1
else
    r9_3 = arg1
    
    if (data_1e4434 != 0)
        int32_t r8_3 = 1
        int32_t i_35 = 0
        
        do
            int32_t* r4_45 = *(data_1e43b4 + (i_35 << 2))
            int32_t r0_483
            
            if ((r8_3 & 1) != 0)
                r0_483 = strcasecmp((*(*r4_45 + 0xc))(r4_45), "Askara of Fortune")
            
            if ((r8_3 & 1) != 0 && r0_483 == 0)
                r8_3 = 0
            else
                core::CWorldBase::AddInstance(*(arg1 + 0x38))
                ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
                void* r5_40 = r4_45[3]
                int32_t r0_486 = *(r5_40 + 0x88)
                
                if (r0_486 == 2)
                    ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
                else if (r0_486 == 1)
                    ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                    
                    if (ascension::CCard::IsCardFaction(r5_40) != 0)
                        ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            i_35 += 1
        while (i_35 u< data_1e4434)
        
        r7_2 = var_40
        r0_478 = zx.d(r7_2[1])

if ((r0_478 & 4) != 0 && data_1e443c != 0)
    int32_t i_36 = 0
    
    do
        void* r4_46 = *(data_1e43c0 + (i_36 << 2))
        core::CWorldBase::AddInstance(*(arg1 + 0x38))
        ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
        void* r5_41 = *(r4_46 + 0xc)
        int32_t r0_496 = *(r5_41 + 0x88)
        
        if (r0_496 == 2)
            ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
        else if (r0_496 == 1)
            ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
            
            if (ascension::CCard::IsCardFaction(r5_41) != 0)
                ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
        
        i_36 += 1
    while (i_36 u< data_1e443c)
    
    r0_478 = zx.d(r7_2[1])

if ((r0_478 & 8) != 0 && data_1e4440 != 0)
    int32_t i_37 = 0
    
    do
        void* r4_47 = *(data_1e43cc + (i_37 << 2))
        core::CWorldBase::AddInstance(*(arg1 + 0x38))
        ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
        int32_t r0_506 = *(*(r4_47 + 0xc) + 0x88)
        
        if (r0_506 == 2)
            ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
        else if (r0_506 == 1)
            ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
        
        i_37 += 1
    while (i_37 u< data_1e4440)
    
    if ((zx.d(r7_2[1]) & 0x10) != 0)
        goto label_167d08
else if ((r0_478 & 0x10) != 0)
label_167d08:
    
    if (data_1e447c != 0)
        int32_t i_38 = 0
        
        do
            void* r4_48 = *(data_1e43d8 + (i_38 << 2))
            core::CWorldBase::AddInstance(*(arg1 + 0x38))
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            void* r5_42 = *(r4_48 + 0xc)
            int32_t r0_515 = *(r5_42 + 0x88)
            
            if (r0_515 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_515 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_42) != 0)
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            i_38 += 1
        while (i_38 u< data_1e447c)
    
    if (ascension::CDatabase::GetCard(ascension::g_Database) != 0)
        int32_t i_47 = 0x14
        int32_t i_39
        
        do
            ascension::CWorld::CreatePortalCard(*(arg1 + 0x38))
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            i_39 = i_47
            i_47 -= 1
        while (i_39 != 1)

uint32_t r0_527 = zx.d(r7_2[1])

if ((r0_527 & 0x40) != 0 && data_1e4498 != 0)
    int32_t i_40 = 0
    
    do
        void* r4_50 = *(data_1e43e4 + (i_40 << 2))
        core::CWorldBase::AddInstance(*(arg1 + 0x38))
        ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
        void* r5_43 = *(r4_50 + 0xc)
        int32_t r0_531 = *(r5_43 + 0x88)
        
        if (r0_531 == 2)
            ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
        else if (r0_531 == 1)
            ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
            
            if (ascension::CCard::IsCardFaction(r5_43) != 0)
                ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
        
        i_40 += 1
    while (i_40 u< data_1e4498)
    
    if ((zx.d(r7_2[1]) & 0x20) != 0)
        goto label_167ec8
else if ((r0_527 & 0x20) != 0)
label_167ec8:
    uint32_t r0_539 = *(arg1 + 0x38)
    char* r1_323 = *(r0_539 + 4)
    *(r0_539 + 4) = &r1_323[1]
    ascension::CWorld::CreateEndOfRainbowStack(r0_539, r1_323, "Pot of Gold")
    
    if (data_1e448c != 0)
        int32_t i_41 = 0
        
        do
            void* r4_51 = *(data_1e43f0 + (i_41 << 2))
            core::CWorldBase::AddInstance(*(arg1 + 0x38))
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            void* r5_44 = *(r4_51 + 0xc)
            int32_t r0_544 = *(r5_44 + 0x88)
            
            if (r0_544 == 2)
                ascension::CWorld::AddConstructToList(*(arg1 + 0x38))
            else if (r0_544 == 1)
                ascension::CWorld::AddHeroToList(*(arg1 + 0x38))
                
                if (ascension::CCard::IsCardFaction(r5_44) != 0)
                    ascension::CWorld::AddLifeboundHeroToList(*(arg1 + 0x38))
            
            i_41 += 1
        while (i_41 u< data_1e448c)

uint32_t r5_45 = zx.d(*r7_2)

if ((r5_45 & 0x30) != 0)
    int32_t r6_14 = r5_45 & 0x20
    int32_t i_48 = var_30_4 * 0x1e + r9_1 * 0x14
    
    if (r6_14 != 0)
        i_48 -= 0xa
    
    if (ascension::CDatabase::GetCard(ascension::g_Database) != 0 && i_48 s>= 1)
        int32_t i_42
        
        do
            ascension::CWorld::CreateCard(*(arg1 + 0x38))
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            i_42 = i_48
            i_48 -= 1
        while (i_42 != 1)
    
    r7_2 = var_40
    
    if (r6_14 != 0 && ascension::CDatabase::GetCard(ascension::g_Database) != 0)
        int32_t i_43 = 0
        
        do
            ascension::CWorld::CreateCard(*(arg1 + 0x38))
            ascension::CWorld::AddCardToPortalDeck(*(arg1 + 0x38))
            i_43 += 1
        while (i_43 u< (0xa & r5_45 << 0x1a s>> 0x1f))

if (zx.d(*(*(arg1 + 0x38) + 0xa2c)) == 0)
    core::CWorldBase::RandomizePlayerOrder()

void* r6_15 = *(arg1 + 0x38)
int32_t* i_44

if ((zx.d(*(r7_2 + 1)) & 0x30) == 0)
    i_44 = *(r6_15 + 0x1c)
else
    i_44 = *(r6_15 + 0x18)
    
    if (i_44 != *(r6_15 + 0x1c))
        int32_t r4_54 = 0
        
        do
            if (r4_54 != 0)
                ascension::CPlayer::AddInsightCount(*i_44)
                r6_15 = *(arg1 + 0x38)
            
            i_44 = &i_44[1]
            r4_54 += 1
        while (i_44 != *(r6_15 + 0x1c))

int32_t* i_45 = *(r6_15 + 0x18)

if (i_45 != i_44)
    int32_t r7_3 = 0
    
    do
        void** r0_570 = operator new(0x38)
        int32_t r6_16 = *i_45
        CState::CState()
        *r0_570 = _vtable_for_ascensionrules::CStateProcessSetupPlayerDeck + 8
        r0_570[0xc] = r6_16
        r0_570[0xd] = r7_3
        CState::AddOwnedChild(r9_3)
        CStateList::AppendState(r9_3)
        r6_15 = *(r9_3 + 0x38)
        i_45 = &i_45[1]
        r7_3 += 1
    while (i_45 != *(r6_15 + 0x1c))
    
    r7_2 = var_40

uint32_t r0_578 = zx.d(*r7_2)

if ((r0_578 & 0x80) != 0)
    int32_t* r0_574 = operator new(0x84)
    CState::CState()
    *r0_574 = _vtable_for_ascensionrules::CStateProcessSetupChampions + 8
    r0_574[0xc] = r6_15
    r0_574[0xd] = 0
    r0_574[0x1e] = 0
    r0_574[0x1f] = 0
    r0_574[0x20] = 0
    CState::AddOwnedChild(r9_3)
    CStateList::AppendState(r9_3)
    r0_578 = zx.d(*r7_2)

if ((r0_578 & 0x100) != 0)
    CStateMachine* entry_r1
    ascensionrules::CreateStateSetupDreamscape(entry_r1, *(r9_3 + 0x38), 5, 3)
    CState::AddOwnedChild(r9_3)
    CStateList::AppendState(r9_3)

int32_t r4_57 = *(arg1 + 0x38)
int32_t* i_46 = *(r4_57 + 0x18)

while (i_46 != *(r4_57 + 0x1c))
    ascension::CPlayer* r0_583 = *i_46
    i_46 = &i_46[1]
    ascensionrules::CreateStateProcessDrawHand(r0_583, nullptr, 0)
    CState::AddOwnedChild(r9_3)
    CStateList::AppendState(r9_3)
    r4_57 = *(r9_3 + 0x38)

if (zx.d(*(r4_57 + 0xa2c)) != 0)
    int32_t* r0_589 = operator new(0x3c)
    int32_t r0_591 = ascension::CWorld::GetPlayer(r4_57)
    CStateList::CStateList()
    r0_589[0xe] = r0_591
    *r0_589 = _vtable_for_ascensionrules::CStateHandleTutorialIntro + 8
    CState::AddOwnedChild(r9_3)
    CStateList::AppendState(r9_3)

ascension::CWorld* r0_596 = operator new(0x3d8)
*(arg1 + 0x38)
ascensionrules::CStatePrepareCenterRow::CStatePrepareCenterRow(r0_596)
CState::AddOwnedChild(r9_3)
CStateList::AppendState(r9_3)
int32_t r0_599 = *__stack_chk_guard

if (r0_599 == r0)
    return r0_599 - r0

__stack_chk_fail()
noreturn
