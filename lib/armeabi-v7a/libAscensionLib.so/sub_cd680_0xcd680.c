// 函数: sub_cd680
// 地址: 0xcd680
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

lua_getfield(arg1, 0xfff0b9d8, "_IO_input")
int32_t* r0_1 = lua_touserdata(arg1, 0xffffffff)

if (r0_1[1] == 0)
    luaL_error(arg1, "standard %s file is closed", "input")

return sub_cdbe0(arg1, *r0_1, 1) __tailcall
