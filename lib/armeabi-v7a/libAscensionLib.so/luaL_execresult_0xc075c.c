// 函数: luaL_execresult
// 地址: 0xc075c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t errnum = arg2
char* r1

if (arg2 == 0)
    lua_pushboolean(arg1, 1)
    r1 = "exit"
else if (errnum != 0xffffffff)
    lua_pushnil(arg1)
    r1 = "exit"
else
    errnum = *__errno()
    lua_pushnil(arg1)
    r1 = strerror(errnum)

lua_pushstring(arg1, r1)
lua_pushinteger(arg1, errnum)
return 3
