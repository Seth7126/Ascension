// 函数: sub_dbe38
// 地址: 0xdbe38
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
luaL_checktype(arg1, 1, 5)
int32_t r0_1 = luaL_len(arg1, 1)
int32_t r5 = r0_1
int32_t r7 = r0_1 + 1
int32_t r0_3 = lua_gettop(arg1)

if (r0_3 != 2)
    if (r0_3 != 3)
        return luaL_error(arg1, "wrong number of arguments to 'insert'") __tailcall
    
    int32_t r0_5 = luaL_checkinteger(arg1, 2)
    
    if (r0_5 s< 1 || r0_5 s> r7)
        luaL_argerror(arg1, 2, "position out of bounds")
    
    if (r5 s>= r0_5)
        bool cond:0_1
        
        do
            lua_rawgeti(arg1, 1, r5)
            lua_rawseti(arg1, 1, r5 + 1)
            cond:0_1 = r5 s> r0_5
            r5 -= 1
        while (cond:0_1)
    
    r7 = r0_5

lua_rawseti(arg1, 1, r7)
return 0
