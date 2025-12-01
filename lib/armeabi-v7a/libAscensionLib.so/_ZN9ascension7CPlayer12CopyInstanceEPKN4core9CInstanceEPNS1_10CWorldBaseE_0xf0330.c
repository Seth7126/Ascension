// 函数: _ZN9ascension7CPlayer12CopyInstanceEPKN4core9CInstanceEPNS1_10CWorldBaseE
// 地址: 0xf0330
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
*(arg1 + 0x9c) = *(arg2 + 0x9c)
*(arg1 + 0xa0) = *(arg2 + 0xa0)
*(arg1 + 0x88) = *(arg2 + 0x88)
*(arg1 + 0x8c) = *(arg2 + 0x8c)
*(arg1 + 0x90) = *(arg2 + 0x90)
*(arg1 + 0x94) = *(arg2 + 0x94)
*(arg1 + 0x98) = *(arg2 + 0x98)

for (int32_t i = 0; i != 0xc0; )
    void* r1 = arg2 + i
    void* r3_1 = arg1 + i
    i += 0x20
    *(r3_1 + 0xb4) = *(r1 + 0xb4)
    *(r3_1 + 0xb8) = *(r1 + 0xb8)
    *(r3_1 + 0xbc) = *(r1 + 0xbc)
    *(r3_1 + 0xc0) = *(r1 + 0xc0)
    *(r3_1 + 0xc4) = *(r1 + 0xc4)
    *(r3_1 + 0xc8) = *(r1 + 0xc8)
    *(r3_1 + 0xcc) = *(r1 + 0xcc)
    *(r3_1 + 0xd0) = *(r1 + 0xd0)

*(arg1 + 0xa4) = *(arg2 + 0xa4)
*(arg1 + 0xa8) = *(arg2 + 0xa8)
*(arg1 + 0xac) = *(arg2 + 0xac)
*(arg1 + 0xb0) = *(arg2 + 0xb0)
*(*(arg2 + 0x38) + 8)
uint32_t entry_r2
*(arg1 + 0x38) = core::CWorldBase::GetInstanceByID(entry_r2)
*(*(arg2 + 0x3c) + 8)
int32_t r0_17 = core::CWorldBase::GetInstanceByID(entry_r2)
int32_t var_2c = r0_17
*(arg1 + 0x3c) = r0_17
void* r0_18 = *(arg2 + 0x184)
int32_t r0_20

if (r0_18 == 0)
    r0_20 = 0
else
    *(r0_18 + 8)
    r0_20 = core::CWorldBase::GetInstanceByID(entry_r2)
    int32_t var_2c_1 = r0_20

*(arg1 + 0x184) = r0_20
*(*(arg2 + 0x40) + 8)
int32_t r0_23 = core::CWorldBase::GetInstanceByID(entry_r2)
int32_t var_2c_2 = r0_23
*(arg1 + 0x40) = r0_23
void* r0_24 = *(arg2 + 0x44)
int32_t r0_26

if (r0_24 == 0)
    r0_26 = 0
else
    *(r0_24 + 8)
    r0_26 = core::CWorldBase::GetInstanceByID(entry_r2)
    int32_t var_2c_3 = r0_26

*(arg1 + 0x44) = r0_26
*(arg1 + 0x4c) = *(arg1 + 0x48)

for (int32_t* i_1 = *(arg2 + 0x48); i_1 != *(arg2 + 0x4c); i_1 = &i_1[1])
    *(*i_1 + 8)
    int32_t r0_31 = core::CWorldBase::GetInstanceByID(entry_r2)
    int32_t var_2c_4 = r0_31
    int32_t var_30_1 = r0_31
    int32_t* r1_8 = *(arg1 + 0x4c)
    
    if (r1_8 == *(arg1 + 0x50))
        std::__ndk1::vector<ascension::CCardInPlayInstance*, std::__ndk1::allocator<ascension::CCardInPlayInstance*> >::__push_back_slow_path<ascension::CCardInPlayInstance* const&>(
            arg1 + 0x48)
    else
        *r1_8 = r0_31
        *(arg1 + 0x4c) += 4

*(arg1 + 0x58) = *(arg1 + 0x54)

for (int32_t* i_2 = *(arg2 + 0x54); i_2 != *(arg2 + 0x58); i_2 = &i_2[1])
    *(*i_2 + 8)
    int32_t r0_40 = core::CWorldBase::GetInstanceByID(entry_r2)
    int32_t var_2c_5 = r0_40
    int32_t var_30_2 = r0_40
    int32_t* r1_10 = *(arg1 + 0x58)
    
    if (r1_10 == *(arg1 + 0x5c))
        std::__ndk1::vector<ascension::CConstructInstance*, std::__ndk1::allocator<ascension::CConstructInstance*> >::__push_back_slow_path<ascension::CConstructInstance* const&>(
            arg1 + 0x54)
    else
        *r1_10 = r0_40
        *(arg1 + 0x58) += 4

*(arg1 + 0x64) = *(arg1 + 0x60)

for (int32_t* i_3 = *(arg2 + 0x60); i_3 != *(arg2 + 0x64); i_3 = &i_3[1])
    *(*i_3 + 8)
    int32_t r0_49 = core::CWorldBase::GetInstanceByID(entry_r2)
    int32_t var_2c_6 = r0_49
    int32_t var_30_3 = r0_49
    int32_t* r1_12 = *(arg1 + 0x64)
    
    if (r1_12 == *(arg1 + 0x68))
        std::__ndk1::vector<ascension::CTrophyInstance*, std::__ndk1::allocator<ascension::CTrophyInstance*> >::__push_back_slow_path<ascension::CTrophyInstance* const&>(
            arg1 + 0x60)
    else
        *r1_12 = r0_49
        *(arg1 + 0x64) += 4

*(arg1 + 0x70) = *(arg1 + 0x6c)

for (int32_t* i_4 = *(arg2 + 0x6c); i_4 != *(arg2 + 0x70); i_4 = &i_4[1])
    *(*i_4 + 8)
    int32_t r0_58 = core::CWorldBase::GetInstanceByID(entry_r2)
    int32_t var_2c_7 = r0_58
    int32_t* r1_14 = *(arg1 + 0x70)
    
    if (r1_14 == *(arg1 + 0x74))
        std::__ndk1::vector<core::CInstance*, std::__ndk1::allocator<core::CInstance*> >::__push_back_slow_path<core::CInstance* const&>(
            arg1 + 0x6c)
    else
        *r1_14 = r0_58
        *(arg1 + 0x70) += 4

*(*(arg2 + 0x84) + 8)
int32_t r0_65 = core::CWorldBase::GetInstanceByID(entry_r2)
int32_t var_2c_8 = r0_65
*(arg1 + 0x84) = r0_65
core::CPlayerBase::CopyInstance(arg1, arg2)
int32_t r0_67 = *__stack_chk_guard

if (r0_67 == r0)
    return r0_67 - r0

__stack_chk_fail()
noreturn
