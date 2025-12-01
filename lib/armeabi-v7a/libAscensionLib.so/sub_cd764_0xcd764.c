// 函数: sub_cd764
// 地址: 0xcd764
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

luaL_checkany(arg1, 1)
void* r0_1 = luaL_testudata(arg1, 1, "FILE*")

if (r0_1 == 0)
    lua_pushnil(arg1)
    return 1

int32_t r0_3
char const* const r1
int32_t r2

if (*(r0_1 + 4) == 0)
    r0_3 = arg1
    r2 = 0xb
    r1 = "closed file"
else
    r0_3 = arg1
    r2 = 4
    r1 = "file"

lua_pushlstring(r0_3, r1, r2)
return 1
