// 函数: luaL_checkoption
// 地址: 0xc09dc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0_1
char* s2

if (arg3 != 0)
    s2 = arg3
    r0_1 = lua_type(arg1, arg2)

if (arg3 == 0 || r0_1 s>= 1)
    s2 = luaL_checklstring(arg1, arg2, 0)

char* s1 = *arg4

if (s1 != 0)
    int32_t result = 0
    
    do
        if (strcmp(s1, s2) == 0)
            return result
        
        s1 = arg4[1 + result]
        result += 1
    while (s1 != 0)

return luaL_argerror(arg1, arg2, lua_pushfstring(arg1, "invalid option '%s'", s2)) __tailcall
