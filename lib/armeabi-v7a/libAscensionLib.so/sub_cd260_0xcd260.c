// 函数: sub_cd260
// 地址: 0xcd260
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (lua_type(arg1, 1) == 0xffffffff)
    lua_getfield(arg1, 0xfff0b9d8, "_IO_output")

if (*(luaL_checkudata(arg1, 1, "FILE*") + 4) == 0)
    luaL_error(arg1, "attempt to use a closed file")

void* r0_7 = luaL_checkudata(arg1, 1, "FILE*")
int32_t r1 = *(r0_7 + 4)
*(r0_7 + 4) = 0
jump(r1)
