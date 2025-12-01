// 函数: sub_c6704
// 地址: 0xc6704
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

luaL_checktype(arg1, 1, 6)
int32_t r0_1 = lua_newthread(arg1)
lua_pushvalue(arg1, 1)
lua_xmove(arg1, r0_1, 1)
lua_pushcclosure(arg1, sub_c68a0, 1)
return 1
