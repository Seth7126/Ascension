// 函数: sub_c3a24
// 地址: 0xc3a24
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = luaL_checkinteger(arg1, 2)
int32_t r1 = luaL_checkunsigned(arg1, 1)
int32_t r0_3 = r0 & 0x1f

if (r0_3 != 0)
    r1 = ror.d(r1, 0x20 - r0_3.b)

lua_pushunsigned(arg1, r1)
return 1
