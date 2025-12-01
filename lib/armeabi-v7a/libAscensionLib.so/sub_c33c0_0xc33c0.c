// 函数: sub_c33c0
// 地址: 0xc33c0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = lua_gettop()

if (r0 s<= 1)
    luaL_argerror(arg1, 2, "value expected")

lua_pushvalue(arg1, 1)
lua_copy(arg1, 2, 1)
lua_replace(arg1, 2)
int32_t temp0 = 0
uint32_t i = lua_pcallk(arg1, r0 - 2, 0xffffffff, 1, 0, sub_c365c)

while (i != 0)
    i u>>= 1
    temp0 += 1

return sub_c3688(arg1, (0x20 - temp0) u>> 5) __tailcall
