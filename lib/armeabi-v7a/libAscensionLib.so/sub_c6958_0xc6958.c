// 函数: sub_c6958
// 地址: 0xc6958
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *__stack_chk_guard
fwrite("lua_debug> ", 0xb, 1, __sF + 0xa8)
fflush(__sF + 0xa8)
char var_126[0xfa]

if (fgets(&var_126, 0xfa, __sF) != 0)
    char* i
    
    do
        if (strcmp(&var_126, "cont\n") == 0)
            break
        
        int32_t var_12c
        int32_t r0_8 =
            luaL_loadbufferx(arg1, &var_126, strlen(&var_126), "=(debug command)", 0, var_12c)
        int32_t r0_10
        
        if (r0_8 == 0)
            var_12c = 0
            r0_10 = lua_pcallk(arg1, 0, 0, 0, 0, 0)
        
        if (r0_8 != 0 || r0_10 != 0)
            fprintf(__sF + 0xa8, "%s\n", lua_tolstring(arg1, 0xffffffff, 0))
            fflush(__sF + 0xa8)
        
        lua_settop(arg1, 0)
        fwrite("lua_debug> ", 0xb, 1, __sF + 0xa8)
        fflush(__sF + 0xa8)
        i = fgets(&var_126, 0xfa, __sF)
    while (i != 0)

if (*__stack_chk_guard == r1)
    return 0

__stack_chk_fail()
noreturn
