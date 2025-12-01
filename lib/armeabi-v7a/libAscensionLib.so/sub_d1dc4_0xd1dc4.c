// 函数: sub_d1dc4
// 地址: 0xd1dc4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = luaL_checklstring(arg1, 1, 0)
lua_getfield(arg1, 0xfff0b9d8, "_PRELOAD")
lua_getfield(arg1, 0xffffffff, r0)

if (lua_type(arg1, 0xffffffff) != 0)
    return 1

lua_pushfstring(arg1, "\n\tno field package.preload['%s']", r0)
return 1
