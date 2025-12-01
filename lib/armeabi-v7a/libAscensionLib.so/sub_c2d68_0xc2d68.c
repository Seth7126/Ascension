// 函数: sub_c2d68
// 地址: 0xc2d68
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r0_2 = lua_gettop(arg1)
lua_getglobal(arg1, "tostring")
int32_t result

if (r0_2 s< 1)
label_c2e64:
    fputc(0xa, __sF + 0x54)
    fflush(__sF + 0x54)
    result = 0
else
    int32_t r6_1 = 0
    
    while (true)
        lua_pushvalue(arg1, 0xffffffff)
        r6_1 += 1
        lua_pushvalue(arg1, r6_1)
        lua_callk(arg1, 1, 1, 0, 0)
        uint32_t count
        void* r0_8 = lua_tolstring(arg1, 0xffffffff, &count)
        
        if (r0_8 == 0)
            result = luaL_error(arg1, "'tostring' must return a string to 'print'")
            break
        
        if (r6_1 u>= 2)
            fputc(9, __sF + 0x54)
        
        fwrite(r0_8, 1, count, __sF + 0x54)
        lua_settop(arg1, 0xfffffffe)
        
        if (r6_1 s>= r0_2)
            goto label_c2e64

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
