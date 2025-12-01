// 函数: sub_cd3a8
// 地址: 0xcd3a8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (lua_type(arg1, 1) == 0xffffffff)
    lua_pushnil(arg1)

int32_t r5 = 1

if (lua_type(arg1, 1) == 0)
    lua_getfield(arg1, 0xfff0b9d8, "_IO_input")
    lua_replace(arg1, 1)
    r5 = 0
    
    if (*(luaL_checkudata(arg1, 1, "FILE*") + 4) == 0)
        luaL_error(arg1, "attempt to use a closed file")
else
    sub_cd91c(arg1, luaL_checklstring(arg1, 1, 0), "r")
    lua_replace(arg1, 1)

sub_cd9f4(arg1, r5)
return 1
