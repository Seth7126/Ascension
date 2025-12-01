// 函数: _ZN9ascension18CConstructInstance12CopyInstanceEPKN4core9CInstanceEPNS1_10CWorldBaseE
// 地址: 0xe5434
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
ascension::CCardInPlayInstance::CopyInstance(arg1, arg2)
*(arg1 + 0x40) = *(arg1 + 0x3c)
uint32_t entry_r2

for (int32_t* i = *(arg2 + 0x3c); i != *(arg2 + 0x40); i = &i[1])
    *(*i + 8)
    int32_t r0_6 = core::CWorldBase::GetInstanceByID(entry_r2)
    int32_t var_2c_1 = r0_6
    int32_t* r1_1 = *(arg1 + 0x40)
    
    if (r1_1 == *(arg1 + 0x44))
        std::__ndk1::vector<ascension::CConstructAbilityInstance*, std::__ndk1::allocator<ascension::CConstructAbilityInstance*> >::__push_back_slow_path<ascension::CConstructAbilityInstance* const&>(
            arg1 + 0x3c)
    else
        *r1_1 = r0_6
        *(arg1 + 0x40) += 4

*(arg1 + 0x4c) = *(arg1 + 0x48)

for (int32_t* i_1 = *(arg2 + 0x48); i_1 != *(arg2 + 0x4c); i_1 = &i_1[1])
    *(*i_1 + 8)
    int32_t r0_15 = core::CWorldBase::GetInstanceByID(entry_r2)
    int32_t var_30_1 = r0_15
    int32_t* r1_3 = *(arg1 + 0x4c)
    
    if (r1_3 == *(arg1 + 0x50))
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
            arg1 + 0x48)
    else
        *r1_3 = r0_15
        *(arg1 + 0x4c) += 4

int32_t r0_20 = *__stack_chk_guard

if (r0_20 == r0)
    return r0_20 - r0

__stack_chk_fail()
noreturn
