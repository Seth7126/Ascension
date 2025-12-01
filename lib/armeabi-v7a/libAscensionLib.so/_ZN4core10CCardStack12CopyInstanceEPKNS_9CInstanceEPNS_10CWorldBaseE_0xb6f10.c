// 函数: _ZN4core10CCardStack12CopyInstanceEPKNS_9CInstanceEPNS_10CWorldBaseE
// 地址: 0xb6f10
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r0_1 = *(arg1 + 0xc)
*(arg1 + 0x18) = *(arg2 + 0x18)
*(arg1 + 0x1c) = *(arg2 + 0x1c)
*(arg1 + 0x10) = r0_1

for (int32_t* i = *(arg2 + 0xc); i != *(arg2 + 0x10); i = &i[1])
    *(*i + 8)
    uint32_t entry_r2
    int32_t r0_5 = core::CWorldBase::GetInstanceByID(entry_r2)
    int32_t var_2c_1 = r0_5
    int32_t* r1_3 = *(arg1 + 0x10)
    
    if (r1_3 == *(arg1 + 0x14))
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
            arg1 + 0xc)
    else
        *r1_3 = r0_5
        *(arg1 + 0x10) += 4

int32_t r0_10 = *__stack_chk_guard

if (r0_10 == r0)
    return r0_10 - r0

__stack_chk_fail()
noreturn
