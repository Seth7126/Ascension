// 函数: sub_d3558
// 地址: 0xd3558
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t status

if (lua_type(arg1, 1) != 1)
    status = luaL_optinteger(arg1, 1, 0)
else
    int32_t temp0_1 = 0
    uint32_t i = lua_toboolean(arg1, 1)
    
    while (i != 0)
        i u>>= 1
        temp0_1 += 1
    
    status = (0x20 - temp0_1) u>> 5

if (lua_toboolean(arg1, 2) != 0)
    lua_close(arg1)

if (arg1 == 0)
    return 0

exit(status)
noreturn
