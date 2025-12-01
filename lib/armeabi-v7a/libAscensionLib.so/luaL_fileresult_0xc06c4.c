// 函数: luaL_fileresult
// 地址: 0xc06c4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = __errno()

if (arg2 != 0)
    lua_pushboolean(arg1, 1)
    return 1

int32_t errnum = *r0
lua_pushnil(arg1)
char* r0_5 = strerror(errnum)

if (arg3 == 0)
    lua_pushstring(arg1, r0_5)
else
    lua_pushfstring(arg1, "%s: %s", arg3, r0_5)

lua_pushinteger(arg1, errnum)
return 3
