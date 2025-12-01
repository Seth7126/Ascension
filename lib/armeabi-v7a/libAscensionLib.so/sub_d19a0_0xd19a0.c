// 函数: sub_d19a0
// 地址: 0xd19a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0_4 = sub_d1b74(arg1, luaL_checklstring(arg1, 1, 0), luaL_checklstring(arg1, 2, 0))

if (r0_4 == 0)
    return 1

lua_pushnil(arg1)
lua_insert(arg1, 0xfffffffe)
char const* const r1_1 = "absent"

if (r0_4 != 1)
    r1_1 = "init"

lua_pushstring(arg1, r1_1)
return 3
