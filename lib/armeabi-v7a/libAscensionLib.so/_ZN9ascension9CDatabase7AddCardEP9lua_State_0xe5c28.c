// 函数: _ZN9ascension9CDatabase7AddCardEP9lua_State
// 地址: 0xe5c28
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *__stack_chk_guard
int32_t r0 = lua_touserdata(arg1, 1)
ascension::CCard::CacheTextureHandle()
int32_t* r1_1 = *(ascension::g_Database + 4)
int32_t var_18 = r0

if (r1_1 u>= *(ascension::g_Database + 8))
    std::__ndk1::vector<ascension::CCard const*, std::__ndk1::allocator<ascension::CCard const*> >::__push_back_slow_path<ascension::CCard const*>(
        ascension::g_Database)
else
    *r1_1 = r0
    *(ascension::g_Database + 4) += 4

if (*__stack_chk_guard == r1)
    return 0

__stack_chk_fail()
noreturn
