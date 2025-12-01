// 函数: luaL_loadfilex
// 地址: 0xc13ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r9 = lua_gettop(arg1) + 1
int32_t result
FILE* stream
int32_t r0_9
char const* const r2_1
char* r4

if (arg2 == 0)
    lua_pushlstring(arg1, "=stdin", 6)
    stream = __sF
label_c14bc:
    int32_t var_438
    int32_t var_434
    int32_t r0_12
    void* r1_2
    r0_12, r1_2 = sub_c16ac(&var_434, &var_438)
    
    if (r0_12 != 0)
        int32_t r0_13 = var_434
        var_434 = r0_13 + 1
        r1_2 = 0xa
        *(&var_434 + r0_13 + 8) = 0xa
    
    int32_t r0_15 = var_438
    
    if (arg2 != 0 && r0_15 == 0x1b)
        FILE* stream_2 = freopen(arg2, "rb", stream)
        stream = stream_2
        
        if (stream_2 == 0)
            r4 = strerror(*__errno())
            r0_9 = lua_tolstring(arg1, r9, 0)
            r2_1 = "reopen"
            goto label_c1644
        
        r1_2 = sub_c16ac(&var_434, &var_438)
        r0_15 = var_438
    
    if (r0_15 != 0xffffffff)
        int32_t r1_5 = var_434
        r1_2 = &var_434 + r1_5
        var_434 = r1_5 + 1
    
    if (r0_15 != 0xffffffff)
        *(r1_2 + 8) = r0_15.b
    
    result = lua_load(arg1, sub_c1798, &var_434, lua_tolstring(arg1, 0xffffffff, 0), arg3)
    int32_t r0_23 = ferror(stream)
    
    if (arg2 != 0)
        fclose(stream)
    
    if (r0_23 == 0)
        lua_remove(arg1, r9)
    else
        lua_settop(arg1, r9)
        char* r0_28 = strerror(*__errno())
        lua_pushfstring(arg1, "cannot %s %s: %s", "read", lua_tolstring(arg1, r9, 0) + 1, r0_28)
        lua_remove(arg1, r9)
        result = 7
else
    lua_pushfstring(arg1, 0x1bfe47, arg2)
    FILE* stream_1 = fopen(arg2, "r")
    stream = stream_1
    
    if (stream_1 != 0)
        goto label_c14bc
    
    r4 = strerror(*__errno())
    r0_9 = lua_tolstring(arg1, r9, 0)
    r2_1 = "open"
label_c1644:
    lua_pushfstring(arg1, "cannot %s %s: %s", r2_1, r0_9 + 1, r4)
    lua_remove(arg1, r9)
    result = 7

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
