// 函数: _ZN4core10CCardStack12PutCardOnTopEPNS_13CCardInstanceE
// 地址: 0xb667c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t* r0_1 = *(arg1 + 0x10)
void* entry_r1

if (r0_1 == *(arg1 + 0x14))
    std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
        arg1 + 0xc)
else
    *r0_1 = entry_r1
    *(arg1 + 0x10) += 4

void* r0_6 = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 0x111)
int32_t r1_3
void* __offset(core::CCardInstance, 0x18) r4_1

if (r0_6 == 0)
    r4_1 = arg1 + 0x18
    r1_3 = *r4_1
else
    uint32_t r1_2
    
    if (entry_r1 != 0)
        r1_2 = zx.d(*(entry_r1 + 8))
    else
        r1_2 = 0
    
    *(r0_6 + 0xc) = r1_2
    r4_1 = arg1 + 0x18
    r1_3 = *r4_1
    *(r0_6 + 0x12) = r1_3.w
    *(r0_6 + 0x10) = r1_3.w

*r4_1 = r1_3 + 1
int32_t r0_8 = *__stack_chk_guard

if (r0_8 == r0)
    return r0_8 - r0

__stack_chk_fail()
noreturn
