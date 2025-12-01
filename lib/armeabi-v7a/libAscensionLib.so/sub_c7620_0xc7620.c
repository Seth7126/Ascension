// 函数: sub_c7620
// 地址: 0xc7620
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r7 = 0
int32_t r10 = arg1

if (lua_type(arg1, 1) == 8)
    r10 = lua_tothread(arg1, 1)
    r7 = 1

char* r7_1
int32_t r8
int32_t (* r9)(int32_t arg1, int32_t* arg2)

if (lua_type(arg1, r7 + 1) s<= 0)
    lua_settop(arg1, r7 + 1)
    r9 = nullptr
    r8 = 0
    r7_1 = nullptr
else
    char* s = luaL_checklstring(arg1, r7 | 2, 0)
    luaL_checktype(arg1, r7 + 1, 6)
    r8 = luaL_optinteger(arg1, r7 + 3, 0)
    r7_1 = strchr(s, 0x63)
    char* r0_12 = strchr(s, 0x72)
    
    if (r7_1 != 0)
        r7_1 = 1
    
    r9 = sub_c7a6c
    
    if (r0_12 != 0)
        r7_1 |= 2
    
    if (strchr(s, 0x6c) != 0)
        r7_1 |= 4
    
    if (r8 s> 0)
        r7_1 |= 8

if (luaL_getsubtable(arg1, 0xfff0b9d8, "_HKEY") == 0)
    lua_pushstring(arg1, 0x1c05cd)
    lua_setfield(arg1, 0xfffffffe, "__mode")
    lua_pushvalue(arg1, 0xffffffff)
    lua_setmetatable(arg1, 0xfffffffe)

lua_pushthread(r10)
lua_xmove(r10, arg1, 1)
lua_pushvalue(arg1, r7 + 1)
lua_rawset(arg1, 0xfffffffd)
lua_sethook(r10, r9, r7_1, r8)
return 0
