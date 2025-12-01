// 函数: _ZN20NetworkClientManager25InsertSortedAvailableGameEP13AvailableGame
// 地址: 0x186084
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = *__stack_chk_guard
int32_t entry_r1
int32_t var_18 = entry_r1
int32_t* r2_1 = *(arg1 + 0xd4)

if (r2_1 == *(arg1 + 0xd8))
    std::__ndk1::vector<AvailableGame*, std::__ndk1::allocator<AvailableGame*> >::__push_back_slow_path<AvailableGame* const&>(
        arg1 + 0xd0)
else
    *r2_1 = entry_r1
    *(arg1 + 0xd4) += 4

int32_t r0_1 = *__stack_chk_guard

if (r0_1 == r2)
    return r0_1 - r2

__stack_chk_fail()
noreturn
