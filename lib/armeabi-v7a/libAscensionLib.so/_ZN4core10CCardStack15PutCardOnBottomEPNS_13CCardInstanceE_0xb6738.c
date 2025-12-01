// 函数: _ZN4core10CCardStack15PutCardOnBottomEPNS_13CCardInstanceE
// 地址: 0xb6738
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::insert(
    arg1 + 0xc, *(arg1 + 0xc))
void* r0_3 = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 0x112)
int32_t r1_2
void* __offset(core::CCardInstance, 0x18) r4_1

if (r0_3 == 0)
    r4_1 = arg1 + 0x18
    r1_2 = *r4_1
else
    uint32_t r2_1 = 0
    void* entry_r1
    
    if (entry_r1 != 0)
        r2_1 = zx.d(*(entry_r1 + 8))
    
    *(r0_3 + 0x10) = 0
    *(r0_3 + 0xc) = r2_1
    r4_1 = arg1 + 0x18
    r1_2 = *r4_1
    *(r0_3 + 0x12) = r1_2.w

*r4_1 = r1_2 + 1
int32_t r0_5 = *__stack_chk_guard

if (r0_5 == r0)
    return r0_5 - r0

__stack_chk_fail()
noreturn
