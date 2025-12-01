// 函数: main
// 地址: 0xdc75c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = luaL_newstate()

if (r0 == 0)
    int32_t r2_3 = *arg2
    
    if (r2_3 != 0)
        fprintf(__sF + 0xa8, "%s: ", r2_3)
        fflush(__sF + 0xa8)
    
    fprintf(__sF + 0xa8, "%s\n", "cannot create state: not enough memory")
    fflush(__sF + 0xa8)
    return 1

char* r7 = nullptr
lua_pushcclosure(r0, sub_dc940, 0)
lua_pushinteger(r0, arg1)
lua_pushlightuserdata(r0, arg2)
int32_t r5_1 = lua_pcallk(r0, 2, 1, 0, 0, 0)
uint32_t i_1 = lua_toboolean(r0, 0xffffffff)

if (r5_1 != 0)
    if (lua_type(r0, 0xffffffff) == 4)
        r7 = lua_tolstring(r0, 0xffffffff, 0)
    
    char const* const r6_1 = "(error object is not a string)"
    
    if (r7 != 0)
        r6_1 = r7
    
    void* r2_1 = data_1e205c
    
    if (r2_1 != 0)
        fprintf(__sF + 0xa8, "%s: ", r2_1)
        fflush(__sF + 0xa8)
    
    fprintf(__sF + 0xa8, "%s\n", r6_1)
    fflush(__sF + 0xa8)
    lua_settop(r0, 0xfffffffe)

lua_close(r0)
int32_t temp0 = 0
uint32_t i = i_1

while (i != 0)
    i u>>= 1
    temp0 += 1

if (r5_1 != 0)
    r5_1 = 1

return r5_1 | (0x20 - temp0) u>> 5
