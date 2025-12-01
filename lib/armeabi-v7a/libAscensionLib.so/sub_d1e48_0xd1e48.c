// 函数: sub_d1e48
// 地址: 0xd1e48
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = luaL_checklstring(arg1, 1, 0)
lua_getfield(arg1, 0xfff0b9d7, "path")
char* r0_3 = lua_tolstring(arg1, 0xffffffff, 0)

if (r0_3 == 0)
    luaL_error(arg1, "'package.%s' must be a string", "path")

char* r0_6 = sub_d1c34(arg1, r0, r0_3, ".", &data_1c0e1b)

if (r0_6 == 0)
    return 1

if (luaL_loadfilex(arg1, r0_6, 0) != 0)
    return luaL_error(arg1, "error loading module '%s' from file '%s':\n\t%s", 
        lua_tolstring(arg1, 1, 0), r0_6, lua_tolstring(arg1, 0xffffffff, 0))

lua_pushstring(arg1, r0_6)
return 2
