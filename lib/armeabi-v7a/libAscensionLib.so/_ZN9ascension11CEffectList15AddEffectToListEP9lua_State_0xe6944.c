// 函数: _ZN9ascension11CEffectList15AddEffectToListEP9lua_State
// 地址: 0xe6944
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_2 = lua_touserdata(arg1, 1)
char* r0_4 = lua_touserdata(arg1, 2)
char* s = lua_tolstring(arg1, 3, 0)
strlen(s)
char* r0_8 = ascension::CDatabase::AllocateTextBuffer(ascension::g_Database)

if (r0_8 != 0)
    strcpy(r0_8, s)

char** r0_10 = *(r0_2 + 8)

if (r0_10 == *(r0_2 + 0xc))
    std::__ndk1::vector<ascension::CEffectList::CEffectEntry, std::__ndk1::allocator<ascension::CEffectList::CEffectEntry> >::__push_back_slow_path<ascension::CEffectList::CEffectEntry const&>(
        r0_2 + 4)
else
    *r0_10 = r0_8
    r0_10[1] = r0_4
    *(r0_2 + 8) += 8

if (*__stack_chk_guard == r0)
    return 0

__stack_chk_fail()
noreturn
