// 函数: sub_ce600
// 地址: 0xce600
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = luaL_checkudata(arg1, 1, "FILE*")

if (r0[1] == 0)
    lua_pushlstring(arg1, "file (closed)", 0xd)
    return 1

lua_pushfstring(arg1, "file (%p)", *r0)
return 1
