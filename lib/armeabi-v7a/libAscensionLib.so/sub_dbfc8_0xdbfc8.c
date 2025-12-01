// 函数: sub_dbfc8
// 地址: 0xdbfc8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
luaL_checktype(arg1, 1, 5)
int32_t r5 = luaL_optinteger(arg1, 2, 1)
int32_t r0_5

if (lua_type(arg1, 3) s<= 0)
    r0_5 = luaL_len(arg1, 1)
else
    r0_5 = luaL_checkinteger(arg1, 3)

int32_t result = 0

if (r0_5 s>= r5)
    int32_t r0_8 = r0_5 - r5
    int32_t r0_10
    
    if (r0_8 s>= 0)
        result = r0_8 + 1
        r0_10 = lua_checkstack(arg1, result)
    
    if (r0_8 s< 0 || r0_10 == 0)
        return luaL_error(arg1, "too many results to unpack") __tailcall
    
    lua_rawgeti(arg1, 1, r5)
    
    if (r0_5 s> r5)
        do
            r5 += 1
            lua_rawgeti(arg1, 1, r5)
        while (r0_5 != r5)

return result
