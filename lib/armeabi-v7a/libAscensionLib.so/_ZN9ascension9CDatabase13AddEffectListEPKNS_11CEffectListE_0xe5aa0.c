// 函数: _ZN9ascension9CDatabase13AddEffectListEPKNS_11CEffectListE
// 地址: 0xe5aa0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = *__stack_chk_guard
int32_t entry_r1
int32_t var_18 = entry_r1
int32_t* r2_1 = *(arg1 + 0x1c)

if (r2_1 == *(arg1 + 0x20))
    std::__ndk1::vector<ascension::CEffectList const*, std::__ndk1::allocator<ascension::CEffectList const*> >::__push_back_slow_path<ascension::CEffectList const* const&>(
        arg1 + 0x18)
else
    *r2_1 = entry_r1
    *(arg1 + 0x1c) += 4

int32_t r0_1 = *__stack_chk_guard

if (r0_1 == r2)
    return r0_1 - r2

__stack_chk_fail()
noreturn
