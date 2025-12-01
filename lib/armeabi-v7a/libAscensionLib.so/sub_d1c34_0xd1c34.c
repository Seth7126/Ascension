// 函数: sub_d1c34
// 地址: 0xd1c34
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r5 = arg2
char* s = arg3
int32_t r0 = *__stack_chk_guard
void var_43c
luaL_buffinit(arg1, &var_43c)

if (zx.d(*arg4) != 0)
    r5 = luaL_gsub(arg1, r5, arg4, arg5)

char* filename

while (true)
    uint32_t r0_5 = zx.d(*s)
    
    if (r0_5 != 0x3b)
        if (r0_5 != 0)
            char* s_2 = strchr(s, 0x3b)
            void* s_1 = s_2
            
            if (s_2 == 0)
                s_1 = &s[strlen(s)]
            
            lua_pushlstring(arg1, s, s_1 - s)
            
            if (s_1 != 0)
                filename = luaL_gsub(arg1, lua_tolstring(arg1, 0xffffffff, 0), &data_1bfd31, r5)
                lua_remove(arg1, 0xfffffffe)
                FILE* stream = fopen(filename, "r")
                
                if (stream != 0)
                    fclose(stream)
                    break
                
                lua_pushfstring(arg1, "\n\tno file '%s'", filename)
                lua_remove(arg1, 0xfffffffe)
                luaL_addvalue(&var_43c)
                s = s_1
                continue
        
        luaL_pushresult(&var_43c)
        filename = nullptr
        break
    
    s = &s[1]

if (*__stack_chk_guard == r0)
    return filename

__stack_chk_fail()
noreturn
