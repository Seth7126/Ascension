// 函数: sub_d2244
// 地址: 0xd2244
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
char* s = luaL_gsub(arg1, arg3, &data_1bff98, 0x1c0e99)
void* s_1 = s
char* r0 = strchr(s, 0x2d)

if (r0 != 0)
    int32_t result = sub_d1b74(arg1, arg2, 
        lua_pushfstring(arg1, "luaopen_%s", lua_pushlstring(arg1, s_1, r0 - s_1)))
    
    if (result != 2)
        return result
    
    s_1 = &r0[1]

return sub_d1b74(arg1, arg2, lua_pushfstring(arg1, "luaopen_%s", s_1)) __tailcall
