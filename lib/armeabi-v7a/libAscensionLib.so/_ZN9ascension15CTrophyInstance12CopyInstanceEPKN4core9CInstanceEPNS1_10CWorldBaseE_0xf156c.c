// 函数: _ZN9ascension15CTrophyInstance12CopyInstanceEPKN4core9CInstanceEPNS1_10CWorldBaseE
// 地址: 0xf156c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
ascension::CCardInPlayInstance::CopyInstance(arg1, arg2)
*(arg1 + 0x40) = *(arg1 + 0x3c)

for (int32_t* i = *(arg2 + 0x3c); i != *(arg2 + 0x40); i = &i[1])
    *(*i + 8)
    uint32_t entry_r2
    int32_t r0_6 = core::CWorldBase::GetInstanceByID(entry_r2)
    int32_t var_2c_1 = r0_6
    int32_t* r1_1 = *(arg1 + 0x40)
    
    if (r1_1 == *(arg1 + 0x44))
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
            arg1 + 0x3c)
    else
        *r1_1 = r0_6
        *(arg1 + 0x40) += 4

int32_t r0_11 = *__stack_chk_guard

if (r0_11 == r0)
    return r0_11 - r0

__stack_chk_fail()
noreturn
