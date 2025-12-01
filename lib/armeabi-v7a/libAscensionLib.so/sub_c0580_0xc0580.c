// 函数: sub_c0580
// 地址: 0xc0580
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = lua_gettop()
lua_getinfo(arg1, 0x1bff96, arg2)
lua_rawgeti(arg1, 0xfff0b9d8, 2)

if (sub_c2564(arg1, r0 + 1, 2) == 0)
    lua_settop(arg1, r0)
    return 0

lua_copy(arg1, 0xffffffff, r0 + 1)
lua_settop(arg1, 0xfffffffd)
return 1
