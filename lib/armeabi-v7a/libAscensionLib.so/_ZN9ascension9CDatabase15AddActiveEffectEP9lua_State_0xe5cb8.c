// 函数: _ZN9ascension9CDatabase15AddActiveEffectEP9lua_State
// 地址: 0xe5cb8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *__stack_chk_guard
int32_t r0 = lua_touserdata(arg1, 1)
int32_t var_18 = r0
int32_t* r2 = *(ascension::g_Database + 0x10)

if (r2 == *(ascension::g_Database + 0x14))
    std::__ndk1::vector<ascension::CActiveEffectDefinition const*, std::__ndk1::allocator<ascension::CActiveEffectDefinition const*> >::__push_back_slow_path<ascension::CActiveEffectDefinition const* const&>(
        ascension::g_Database + 0xc)
else
    *r2 = r0
    *(ascension::g_Database + 0x10) += 4

if (*__stack_chk_guard == r1)
    return 0

__stack_chk_fail()
noreturn
