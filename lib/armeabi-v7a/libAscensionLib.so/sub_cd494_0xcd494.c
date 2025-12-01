// 函数: sub_cd494
// 地址: 0xcd494
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
char* filename = luaL_checklstring(arg1, 1, 0)
char* mode = luaL_optlstring(arg1, 2, 0x1bfe4b, 0)
int32_t* r0_2 = lua_newuserdata(arg1, 8)
r0_2[1] = 0
luaL_setmetatable(arg1, "FILE*")
*r0_2 = 0
r0_2[1] = sub_cd9b4
int32_t __c = sx.d(*mode)

if (__c == 0)
    luaL_argerror(arg1, 2, "invalid mode")
else if (memchr(0x1c0926, __c, 4) == 0)
    luaL_argerror(arg1, 2, "invalid mode")
else
    int32_t r2_1 = 1
    void* r0_5 = &mode[1]
    
    if (zx.d(mode[1]) == 0x2b)
        r2_1 = 2
        r0_5 = &mode[2]
    
    if (zx.d(mode[r2_1]) == 0x62)
        r0_5 += 1
    
    if (zx.d(*r0_5) != 0)
        luaL_argerror(arg1, 2, "invalid mode")

FILE* r0_9 = fopen(filename, mode)
*r0_2 = r0_9

if (r0_9 == 0)
    return luaL_fileresult(arg1, 0, filename) __tailcall

return 1
