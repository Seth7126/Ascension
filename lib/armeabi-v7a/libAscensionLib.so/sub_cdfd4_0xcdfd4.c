// 函数: sub_cdfd4
// 地址: 0xcdfd4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void var_438
luaL_buffinit(arg1, &var_438)
char* str = luaL_prepbuffsize(&var_438, 0x400)
char* s = str
int32_t result

if (fgets(str, 0x400, arg2) == 0)
label_ce08c:
    luaL_pushresult(&var_438)
    result = lua_rawlen(arg1, 0xffffffff)
    
    if (result != 0)
        result = 1
else
    while (true)
        uint32_t r0_5 = strlen(s)
        int32_t var_430
        
        if (r0_5 != 0 && zx.d(*(&s[r0_5] - 1)) == 0xa)
            int32_t var_430_1 = r0_5 - arg3 + var_430
            luaL_pushresult(&var_438)
            result = 1
            break
        
        var_430 += r0_5
        char* str_1 = luaL_prepbuffsize(&var_438, 0x400)
        s = str_1
        
        if (fgets(str_1, 0x400, arg2) == 0)
            goto label_ce08c

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
