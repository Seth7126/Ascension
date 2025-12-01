// 函数: _ZN9ascension5CCard15AddActiveEffectEP9lua_State
// 地址: 0xe2fa0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_2 = lua_touserdata(arg1, 1)
int32_t r0_4 = lua_touserdata(arg1, 2)
int32_t var_20 = r0_4
int32_t* r1 = *(r0_2 + 0x11c)

if (r1 == *(r0_2 + 0x120))
    std::__ndk1::vector<ascension::CActiveEffectDefinition const*, std::__ndk1::allocator<ascension::CActiveEffectDefinition const*> >::__push_back_slow_path<ascension::CActiveEffectDefinition const* const&>(
        r0_2 + 0x118)
else
    *r1 = r0_4
    *(r0_2 + 0x11c) += 4

if (*__stack_chk_guard == r0)
    return 0

__stack_chk_fail()
noreturn
