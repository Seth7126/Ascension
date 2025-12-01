// 函数: sub_cda94
// 地址: 0xcda94
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* r0 = lua_touserdata(arg1, 0xfff0b9d7)
int32_t i_1 = lua_tointegerx(arg1, 0xfff0b9d6, 0)

if (r0[1] == 0)
    return luaL_error(arg1, "file is already closed") __tailcall

lua_settop(arg1, 1)

if (i_1 s>= 1)
    int32_t r5_1 = 0xfff0b9d4
    int32_t i
    
    do
        lua_pushvalue(arg1, r5_1)
        r5_1 -= 1
        i = i_1
        i_1 -= 1
    while (i != 1)

int32_t result_1 = sub_cdbe0(arg1, *r0, 2)
int32_t result = result_1

if (lua_type(arg1, 0 - result_1) == 0)
    if (result s>= 2)
        return luaL_error(arg1, 0x1bfc41, lua_tolstring(arg1, 1 - result, 0)) __tailcall
    
    result = 0
    
    if (lua_toboolean(arg1, 0xfff0b9d5) != 0)
        lua_settop(arg1, 0)
        lua_pushvalue(arg1, 0xfff0b9d7)
        void* r0_21 = luaL_checkudata(arg1, 1, "FILE*")
        int32_t r1_7 = *(r0_21 + 4)
        *(r0_21 + 4) = 0
        r1_7(arg1)
        return 0

return result
