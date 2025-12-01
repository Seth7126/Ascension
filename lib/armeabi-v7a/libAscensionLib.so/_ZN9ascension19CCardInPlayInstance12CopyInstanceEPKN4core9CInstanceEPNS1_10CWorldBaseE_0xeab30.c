// 函数: _ZN9ascension19CCardInPlayInstance12CopyInstanceEPKN4core9CInstanceEPNS1_10CWorldBaseE
// 地址: 0xeab30
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg2 + 0xc)
int32_t r0_3
uint32_t entry_r2

if (r0_1 == 0)
    r0_3 = 0
else
    *(r0_1 + 8)
    r0_3 = core::CWorldBase::GetInstanceByID(entry_r2)

*(arg1 + 0xc) = r0_3
*(*(arg2 + 0x10) + 8)
int32_t r0_6 = core::CWorldBase::GetInstanceByID(entry_r2)
int32_t r1_2 = *(arg1 + 0x14)
*(arg1 + 0x10) = r0_6
*(arg1 + 0x18) = r1_2

for (int32_t* i = *(arg2 + 0x14); i != *(arg2 + 0x18); i = &i[1])
    *(*i + 8)
    int32_t r0_10 = core::CWorldBase::GetInstanceByID(entry_r2)
    int32_t var_2c_1 = r0_10
    int32_t* r1_4 = *(arg1 + 0x18)
    
    if (r1_4 == *(arg1 + 0x1c))
        std::__ndk1::vector<ascension::CActiveEffectInstance*, std::__ndk1::allocator<ascension::CActiveEffectInstance*> >::__push_back_slow_path<ascension::CActiveEffectInstance* const&>(
            arg1 + 0x14)
    else
        *r1_4 = r0_10
        *(arg1 + 0x18) += 4

*(arg1 + 0x24) = *(arg1 + 0x20)

for (int32_t* i_1 = *(arg2 + 0x20); i_1 != *(arg2 + 0x24); i_1 = &i_1[1])
    *(*i_1 + 8)
    int32_t r0_19 = core::CWorldBase::GetInstanceByID(entry_r2)
    int32_t var_30_1 = r0_19
    int32_t* r1_6 = *(arg1 + 0x24)
    
    if (r1_6 == *(arg1 + 0x28))
        std::__ndk1::vector<ascension::CCardInPlayAbilityInstance*, std::__ndk1::allocator<ascension::CCardInPlayAbilityInstance*> >::__push_back_slow_path<ascension::CCardInPlayAbilityInstance* const&>(
            arg1 + 0x20)
    else
        *r1_6 = r0_19
        *(arg1 + 0x24) += 4

*(arg1 + 0x2c) = *(arg2 + 0x2c)
*(arg1 + 0x30) = *(arg2 + 0x30)
*(arg1 + 0x34) = *(arg2 + 0x34)
*(arg1 + 0x38) = *(arg2 + 0x38)
int32_t r0_28 = *__stack_chk_guard

if (r0_28 == r0)
    return r0_28 - r0

__stack_chk_fail()
noreturn
