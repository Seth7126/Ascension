// 函数: _ZN9ascension9CDatabase15AddActiveEffectEPKNS_23CActiveEffectDefinitionE
// 地址: 0xe5a34
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = *__stack_chk_guard
int32_t entry_r1
int32_t var_18 = entry_r1
int32_t* r2_1 = *(arg1 + 0x10)

if (r2_1 == *(arg1 + 0x14))
    std::__ndk1::vector<ascension::CActiveEffectDefinition const*, std::__ndk1::allocator<ascension::CActiveEffectDefinition const*> >::__push_back_slow_path<ascension::CActiveEffectDefinition const* const&>(
        arg1 + 0xc)
else
    *r2_1 = entry_r1
    *(arg1 + 0x10) += 4

int32_t r0_1 = *__stack_chk_guard

if (r0_1 == r2)
    return r0_1 - r2

__stack_chk_fail()
noreturn
