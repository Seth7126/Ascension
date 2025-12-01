// 函数: _ZN9ascension18CCenterRowInstance12CopyInstanceEPKN4core9CInstanceEPNS1_10CWorldBaseE
// 地址: 0xebc3c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
*(arg1 + 0x10) = *(arg1 + 0xc)
uint32_t entry_r2

for (int32_t* i = *(arg2 + 0xc); i != *(arg2 + 0x10); i = &i[2])
    *(*i + 8)
    int32_t r0_5 = core::CWorldBase::GetInstanceByID(entry_r2)
    int32_t r0_6 = i[1]
    int32_t* r0_7 = *(arg1 + 0x10)
    
    if (r0_7 == *(arg1 + 0x14))
        std::__ndk1::vector<ascension::CenterRowCardEntry, std::__ndk1::allocator<ascension::CenterRowCardEntry> >::__push_back_slow_path<ascension::CenterRowCardEntry const&>(
            arg1 + 0xc)
    else
        *r0_7 = r0_5
        r0_7[1] = r0_6
        *(arg1 + 0x10) += 8

*(arg1 + 0x1c) = *(arg1 + 0x18)

for (int32_t* i_1 = *(arg2 + 0x18); i_1 != *(arg2 + 0x1c); i_1 = &i_1[1])
    *(*i_1 + 8)
    int32_t r0_16 = core::CWorldBase::GetInstanceByID(entry_r2)
    int32_t var_34_1 = r0_16
    int32_t* r1_4 = *(arg1 + 0x1c)
    
    if (r1_4 == *(arg1 + 0x20))
        std::__ndk1::vector<ascension::CActiveEffectInstance*, std::__ndk1::allocator<ascension::CActiveEffectInstance*> >::__push_back_slow_path<ascension::CActiveEffectInstance* const&>(
            arg1 + 0x18)
    else
        *r1_4 = r0_16
        *(arg1 + 0x1c) += 4

int32_t r0_21 = *__stack_chk_guard

if (r0_21 == r0)
    return r0_21 - r0

__stack_chk_fail()
noreturn
