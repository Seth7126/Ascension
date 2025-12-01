// 函数: sub_cd5e0
// 地址: 0xcd5e0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = luaL_checklstring(arg1, 1, 0)
luaL_optlstring(arg1, 2, 0x1bfe4b, 0)
int32_t* r0_3 = lua_newuserdata(arg1, 8)
r0_3[1] = 0
luaL_setmetatable(arg1, "FILE*")
luaL_error(arg1, "'popen' not supported")
*r0_3 = 0
r0_3[1] = sub_ce0e0
return luaL_fileresult(arg1, 0, r0) __tailcall
