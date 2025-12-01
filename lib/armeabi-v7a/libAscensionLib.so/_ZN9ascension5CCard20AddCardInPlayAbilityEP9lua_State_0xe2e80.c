// 函数: _ZN9ascension5CCard20AddCardInPlayAbilityEP9lua_State
// 地址: 0xe2e80
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_2 = lua_touserdata(arg1, 1)
int32_t r0_4 = lua_touserdata(arg1, 2)
int32_t var_20 = r0_4
int32_t* r1 = *(r0_2 + 0x104)

if (r1 == *(r0_2 + 0x108))
    std::__ndk1::vector<ascension::CCardInPlayAbilityDefinition const*, std::__ndk1::allocator<ascension::CCardInPlayAbilityDefinition const*> >::__push_back_slow_path<ascension::CCardInPlayAbilityDefinition const* const&>(
        r0_2 + 0x100)
else
    *r1 = r0_4
    *(r0_2 + 0x104) += 4

if (*__stack_chk_guard == r0)
    return 0

__stack_chk_fail()
noreturn
