// 函数: _ZN9ascension11LoadLuaFileEPKcS1_
// 地址: 0xec6b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char const* s = arg1
int32_t r0 = *__stack_chk_guard
char* r0_2 = strrchr(s, 0x2f)

if (r0_2 != 0)
    s = &r0_2[1]

char const* r2 = data_1e2500

if (arg2 != 0)
    r2 = arg2

char str[0x100]
sprintf(&str, "%s/%s", r2, s)
int32_t r5_1 = luaL_loadfilex(data_1e415c, &str, 0)
int32_t r0_6 = data_1e415c
char const* const format

if (r5_1 == 0)
    int32_t r0_8 = lua_pcallk(r0_6, 0, 0xffffffff, 0, 0, 0)
    
    if (r0_8 != 0)
        r5_1 = r0_8
        s = lua_tolstring(data_1e415c, 0xffffffff, 0)
        format = "lua call error (%s): %d\n"
        goto label_ec7a4
    
    if (zx.d(data_1e4160) == 0)
        printf("Loaded Lua file: %s\n", s)
else
    s = lua_tolstring(r0_6, 0xffffffff, 0)
    format = "lua load error (%s): %d\n"
label_ec7a4:
    printf(format, &str, r5_1)
    printf("    %s\n", s)
int32_t r0_12 = *__stack_chk_guard

if (r0_12 == r0)
    return r0_12 - r0

__stack_chk_fail()
noreturn
