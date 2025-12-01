// 函数: _ZN14ascensionrules28CStateProcessSetupPlayerDeck10EnterStateER13CStateMachine
// 地址: 0x16451c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *__stack_chk_guard
void* r6 = *(arg1 + 0x30)
core::CInstance* r10 = *(r6 + 4)
int16_t* r1_1 = *(r10 + 0xa28)

if (zx.d(*(r10 + 0xa2c)) != 0)
    int32_t (* const r7_1)() = ascensionrules::s_pOpponentCardDrawOrder
    
    if (*(r6 + 0xc) == 1)
        r7_1 = ascensionrules::s_pPlayerCardDrawOrder
    
    *(r6 + 0x188) = r7_1

int32_t r2_2 = *(r10 + 0x30)

if (r2_2 u< 4)
    uint32_t r3_2 = zx.d(*r1_1)
    
    if (r2_2 != 3)
        int32_t r6_4 = *(r10 + 0x1c) - *(r10 + 0x18)
        int32_t r5_3 = (0xffffffff + (r6_4 s>> 2)) * 3
        void* r10_2 = &(&data_1e4508)[r3_2 * 0xc + r5_3]
        
        if (*r10_2 == *(r10_2 + 4))
            std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::reserve(
                r10_2)
            
            if (r6_4 s>= 1)
                int32_t i = 0
                core::CCard* r6_5 = *(r10 + 4)
                void* r8_2 = &data_1e45c8 + (r3_2 << 4) + ((0xffffffff + (r6_4 s>> 2)) << 2)
                
                do
                    *r8_2 = 0
                    ascension::CDatabase::GetCard(ascension::g_Database)
                    core::CWorldBase* r0_22 = operator new(0x10)
                    core::CCardInstance::CCardInstance(r0_22, 0, r6_5)
                    core::CWorldBase** r0_23 = *(r10_2 + 4)
                    core::CWorldBase* var_2c_1 = r0_22
                    
                    if (r0_23 == (&data_1e4508)[r3_2 * 0xc + r5_3 + 2])
                        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                            r10_2)
                    else
                        *r0_23 = r0_22
                        *(r10_2 + 4) += 4
                    
                    *r8_2 += 1
                    ascension::CDatabase::GetCard(ascension::g_Database)
                    core::CWorldBase* r0_31 = operator new(0x10)
                    core::CCardInstance::CCardInstance(r0_31, 0, r6_5 + 1)
                    core::CWorldBase** r0_32 = *(r10_2 + 4)
                    core::CWorldBase* var_2c_2 = r0_31
                    
                    if (r0_32 == (&data_1e4508)[r3_2 * 0xc + r5_3 + 2])
                        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                            r10_2)
                    else
                        *r0_32 = r0_31
                        *(r10_2 + 4) += 4
                    
                    int32_t j = 0
                    *r8_2 += 1
                    
                    do
                        ascension::CDatabase::GetCard(ascension::g_Database)
                        core::CWorldBase* r0_40 = operator new(0x10)
                        core::CCardInstance::CCardInstance(r0_40, 0, r6_5 + 2 + j)
                        core::CWorldBase** r0_41 = *(r10_2 + 4)
                        core::CWorldBase* var_2c_3 = r0_40
                        
                        if (r0_41 == (&data_1e4508)[r3_2 * 0xc + r5_3 + 2])
                            std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                                r10_2)
                        else
                            *r0_41 = r0_40
                            *(r10_2 + 4) += 4
                        
                        j += 1
                        *r8_2 += 1
                    while (j u< 8)
                    
                    r6_5 = r6_5 + 2 + j
                    i += 1
                while (i s< r6_4 s>> 2)
        
        int32_t r6_7 =
            *(arg1 + 0x34) * *(&data_1e45c8 + (r3_2 << 4) + ((0xffffffff + (r6_4 s>> 2)) << 2))
        core::CInstance* r5_4
        
        if (ascension::CDatabase::GetCard(ascension::g_Database) == 0)
            r5_4 = r10
        else
            int32_t r8_3 = r6_7 + 1
            r5_4 = r10
            void* r4_7 = *(*r10_2 + (r6_7 << 2))
            int32_t r0_54 = *(r5_4 + 4)
            *(r5_4 + 4) = r0_54 + 1
            
            if (r0_54 == zx.d(*(r4_7 + 8)))
                core::CWorldBase::AddInstance(r5_4)
                ascension::CPlayer::PutCardInDeck(*(arg1 + 0x30))
                ascension::CPlayer::AddOwnedCard(*(arg1 + 0x30))
            
            r6_7 += 2
            void* r4_8 = *(*r10_2 + (r8_3 << 2))
            int32_t r0_60 = *(r5_4 + 4)
            *(r5_4 + 4) = r0_60 + 1
            
            if (r0_60 == zx.d(*(r4_8 + 8)))
                core::CWorldBase::AddInstance(r5_4)
                ascension::CPlayer::PutCardInDeck(*(arg1 + 0x30))
                ascension::CPlayer::AddOwnedCard(*(arg1 + 0x30))
        
        if (ascension::CDatabase::GetCard(ascension::g_Database) != 0)
            for (int32_t i_1 = 0; i_1 u< 8; i_1 += 1)
                void* r4_10 = *(*r10_2 + (r6_7 << 2) + (i_1 << 2))
                int32_t r0_76 = *(r5_4 + 4)
                *(r5_4 + 4) = r0_76 + 1
                
                if (r0_76 == zx.d(*(r4_10 + 8)))
                    core::CWorldBase::AddInstance(r5_4)
                    ascension::CPlayer::PutCardInDeck(*(arg1 + 0x30))
                    ascension::CPlayer::AddOwnedCard(*(arg1 + 0x30))
    else
        char const (** const r8_1)[0x8] = &data_1dafc8
        
        if ((r3_2 & 4) != 0)
            r8_1 = &data_1dafd8
        
        *r8_1
        
        if (ascension::CDatabase::GetCard(ascension::g_Database) != 0)
            int32_t r7_2 = r8_1[1]
            
            if (r7_2 != 0)
                int32_t r6_2 = 0
                
                do
                    ascension::CWorld::CreateCard(r10)
                    ascension::CPlayer::PutCardInDeck(*(arg1 + 0x30))
                    ascension::CPlayer::AddOwnedCard(*(arg1 + 0x30))
                    r6_2 += 1
                while (r6_2 u< r7_2)
        
        r8_1[2]
        
        if (ascension::CDatabase::GetCard(ascension::g_Database) != 0)
            int32_t r6_3 = r8_1[3]
            
            if (r6_3 != 0)
                int32_t r7_3 = 0
                
                do
                    ascension::CWorld::CreateCard(r10)
                    ascension::CPlayer::PutCardInDeck(*(arg1 + 0x30))
                    ascension::CPlayer::AddOwnedCard(*(arg1 + 0x30))
                    r7_3 += 1
                while (r7_3 u< r6_3)
else
    uint32_t r1_2 = zx.d(*r1_1)
    int32_t r0 = *(arg1 + 0x34)
    void* r3_1
    int32_t* r6_1
    int32_t r9_6
    
    if ((r1_2 & 0x4000) != 0)
        r3_1 = &data_1e44c0
        r6_1 = &data_1e4258
    label_1649f4:
        r9_6 = *(r3_1 + (r0 << 2))
        
        if (r9_6 != 0)
        label_164a04:
            int32_t r3_7 = r1_2 & 0x2000
            int32_t r5_5 = 0
            int32_t var_30_2 = r3_7
            
            do
                void* r0_66 = *(*(r6_1[r0 * 3] + (r5_5 << 2)) + 0xc)
                
                if (((r1_2 & 0x30) != 0 || *(r0_66 + 0x88) != 6)
                        && (r3_7 != 0 || *(r0_66 + 0x90) != 0xd))
                    core::CWorldBase::AddInstance(r10)
                    ascension::CPlayer::PutCardInDeck(*(arg1 + 0x30))
                    ascension::CPlayer::AddOwnedCard(*(arg1 + 0x30))
                    r3_7 = var_30_2
                
                r5_5 += 1
            while (r9_6 != r5_5)
    else
        if ((r1_2 & 0x2000) != 0)
            r3_1 = &data_1e44a8
            r6_1 = &data_1e4228
            goto label_1649f4
        
        if ((r1_2 & 0x1fc0) != 0)
            r3_1 = &data_1e445c
            r6_1 = &data_1e41f8
            goto label_1649f4
        
        if ((r1_2 & 0x30) != 0)
            r3_1 = &data_1e4444
            r6_1 = &data_1e41c8
            goto label_1649f4
        
        if ((r1_2 & 0xc) != 0)
            r3_1 = &data_1e440c
            r6_1 = &data_1e4198
            goto label_1649f4
        
        r9_6 = *(&data_1e43fc + (r0 << 2))
        r6_1 = &data_1e4168
        
        if (r9_6 != 0)
            goto label_164a04

*(arg1 + 0x30)
ascension::CPlayer::ShuffleDeck()
int32_t r0_82 = *__stack_chk_guard

if (r0_82 == r1)
    return r0_82 - r1

__stack_chk_fail()
noreturn
