// 函数: sub_d1858
// 地址: 0xd1858
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t i_2 = luaL_len(arg1, 1)

if (i_2 s>= 1)
    int32_t i_1 = i_2
    int32_t i
    
    do
        lua_rawgeti(arg1, 1, i_1)
        lua_touserdata(arg1, 0xffffffff)
        lua_settop(arg1, 0xfffffffe)
        i = i_1
        i_1 -= 1
    while (i s> 1)

return 0
