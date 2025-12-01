// 函数: sub_c2cf0
// 地址: 0xc2cf0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

luaL_checkany(arg1, 1)
lua_pushnil(arg1)
lua_insert(arg1, 1)
int32_t temp0 = 0
uint32_t i = lua_pcallk(arg1, lua_gettop(arg1) - 2, 0xffffffff, 0, 0, sub_c365c)

while (i != 0)
    i u>>= 1
    temp0 += 1

return sub_c3688(arg1, (0x20 - temp0) u>> 5) __tailcall
