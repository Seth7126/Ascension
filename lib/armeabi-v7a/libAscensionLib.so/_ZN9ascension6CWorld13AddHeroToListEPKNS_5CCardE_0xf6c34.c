// 函数: _ZN9ascension6CWorld13AddHeroToListEPKNS_5CCardE
// 地址: 0xf6c34
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = *__stack_chk_guard
int32_t entry_r1
int32_t var_28 = entry_r1
int32_t r4 = *(arg1 + 0xad4)
int32_t* r3 = *(arg1 + 0xad8)

if (r3 != r4)
    int32_t i = 0
    
    do
        if (*(r4 + (i << 2)) == entry_r1)
            goto label_f6cb8
        
        i += 1
    while (i u< (r3 - r4) s>> 2)

if (*(arg1 + 0xadc) == r3)
    std::__ndk1::vector<ascension::CCard const*, std::__ndk1::allocator<ascension::CCard const*> >::__push_back_slow_path<ascension::CCard const* const&>(
        arg1 + 0xad4)
else
    *r3 = entry_r1
    *(arg1 + 0xad8) += 4

label_f6cb8:
int32_t r0_1 = *__stack_chk_guard

if (r0_1 == r2)
    return r0_1 - r2

__stack_chk_fail()
noreturn
