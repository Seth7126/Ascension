// 函数: luaL_traceback
// 地址: 0xc0048
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r7 = arg4
int32_t r0 = *__stack_chk_guard
int32_t r0_2 = lua_gettop(arg1)
int32_t r1 = 1
int32_t r9 = 1
int32_t r6_1
int32_t i

do
    r6_1 = r9
    r9 = r1
    i = lua_getstack(arg2)
    r1 = r9 << 1
while (i != 0)
void var_8c

while (r6_1 s< r9)
    int32_t r0_4 = r9 + r6_1
    int32_t r10_1 = r0_4 + (r0_4 u>> 0x1f)
    
    if (lua_getstack(arg2, r10_1 s>> 1, &var_8c) != 0)
        r6_1 = 1 + (r10_1 s>> 1)
    else
        r9 = r10_1 s>> 1

int32_t r4 = 0

if (r9 s> 0x17)
    r4 = 0xc

if (arg3 != 0)
    lua_pushfstring(arg1, 0x1bfd33, arg3)

lua_pushlstring(arg1, "stack traceback:", 0x10)

if (lua_getstack(arg2, r7, &var_8c) != 0)
    int32_t i_1
    
    do
        r7 += 1
        
        if (r7 != r4)
            lua_getinfo(arg2, "Slnt", &var_8c)
            void var_68
            lua_pushfstring(arg1, "\n\t%s:", &var_68)
            int32_t var_78
            
            if (var_78 s>= 1)
                lua_pushfstring(arg1, 0x1bfd59, var_78)
            
            lua_pushlstring(arg1, " in ", 4)
            char* var_84
            int32_t var_88
            
            if (zx.d(*var_84) == 0)
                char* var_80
                uint32_t r0_12 = zx.d(*var_80)
                
                if (r0_12 == 0x43)
                    if (sub_c0580(arg1, &var_8c) == 0)
                        lua_pushlstring(arg1, &data_1bfd31, 1)
                    else
                        lua_pushfstring(arg1, "function '%s'", lua_tolstring(arg1, 0xffffffff, 0))
                        lua_remove(arg1, 0xfffffffe)
                else
                    int32_t var_74
                    
                    if (r0_12 != 0x6d)
                        lua_pushfstring(arg1, "function <%s:%d>", &var_68, var_74)
                    else
                        lua_pushlstring(arg1, "main chunk", 0xa)
            else
                lua_pushfstring(arg1, "function '%s'", var_88)
            char var_69
            
            if (zx.d(var_69) != 0)
                lua_pushlstring(arg1, "\n\t(...tail calls...)", 0x14)
            
            lua_concat(arg1, lua_gettop(arg1) - r0_2)
        else
            lua_pushlstring(arg1, "\n\t...", 5)
            r7 = r9 - 0xb
        
        i_1 = lua_getstack(arg2, r7, &var_8c)
    while (i_1 != 0)

lua_concat(arg1, lua_gettop(arg1) - r0_2)
int32_t r0_39 = *__stack_chk_guard

if (r0_39 == r0)
    return r0_39 - r0

__stack_chk_fail()
noreturn
