// 函数: sub_dda94
// 地址: 0xdda94
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char const* const r1 = "_PROMPT"

if (arg2 == 0)
    r1 = "_PROMPT2"

int32_t r2 = *__stack_chk_guard
lua_getglobal(arg1, r1, r2)
int32_t result = 0
void* const str = lua_tolstring(arg1, 0xffffffff, 0)
void* const str_1 = &data_1c1b85

if (arg2 == 0)
    str_1 = &data_1c1b88

if (str == 0)
    str = str_1

fputs(str, __sF + 0x54)
fflush(__sF + 0x54)
char var_228
char* r0_4 = fgets(&var_228, 0x200, __sF)
lua_settop(arg1, 0xfffffffe)

if (r0_4 != 0)
    uint32_t r0_7 = strlen(&var_228)
    
    if (r0_7 != 0 && zx.d((&var_228)[r0_7 - 1]) == 0xa)
        (&var_228)[r0_7 - 1] = 0
    
    void var_227
    
    if (arg2 == 0 || zx.d(var_228) != 0x3d)
        lua_pushstring(arg1, &var_228)
    else
        lua_pushfstring(arg1, "return %s", &var_227)
    result = 1

if (*__stack_chk_guard == r2)
    return result

__stack_chk_fail()
noreturn
