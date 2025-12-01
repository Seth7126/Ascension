// 函数: sub_d8c58
// 地址: 0xd8c58
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t var_55c
void* r5 = luaL_checklstring(arg1, 1, &var_55c)
int32_t var_560
char* r8 = luaL_checklstring(arg1, 2, &var_560)
int32_t r0_6 = lua_type(arg1, 3)
int32_t r0_9 = luaL_optinteger(arg1, 4, var_55c + 1)
uint32_t r0_10 = zx.d(*r8)

if (r0_6 - 3 u>= 4)
    luaL_argerror(arg1, 3, "string/function/table expected")

char* var_554
luaL_buffinit(arg1, &var_554)
int32_t var_144 = 0xc8
int32_t r0_15 = var_560

if (r0_10 == 0x5e)
    r8 = &r8[1]

if (r0_10 == 0x5e)
    r0_15 -= 1

int32_t r4_1 = r0_6
int32_t r6_1 = 0
int32_t r1_1 = var_55c

if (r0_10 == 0x5e)
    var_560 = r0_15

void* var_140 = r5
void* var_138 = &r8[r0_15]
void* r0_17 = r5 + r1_1
char* var_574 = r8
char* r9_1

while (true)
    if (r6_1 u< r0_9)
        int32_t var_130_1 = 0
        char* r0_20 = sub_d99ec(&var_144, r5, r8, r5)
        r9_1 = r0_20
        int32_t var_550
        int32_t var_54c
        
        if (r0_20 == 0)
        label_d8fa4:
            
            if (r9_1 u> r5)
            label_d90cc:
                r5 = r9_1
                
                if (r0_10 == 0x5e)
                    break
                
                continue
        else
            r6_1 += 1
            
            if (r4_1 != 5)
                if (r4_1 == 6)
                    lua_pushvalue(arg1, 3)
                    int32_t r6_2 = var_130_1
                    
                    if (var_130_1 == 0)
                        r6_2 = 1
                    
                    if (r5 == 0)
                        r6_2 = var_130_1
                    
                    luaL_checkstack(arg1, r6_2, "too many captures")
                    
                    if (r6_2 s>= 1)
                        int32_t r8_1 = 0
                        
                        do
                            sub_da604(&var_144, r8_1, r5, r9_1)
                            r8_1 += 1
                        while (r6_2 != r8_1)
                    
                    lua_callk(arg1, r6_2, 1, 0, 0)
                    r4_1 = r0_6
                    goto label_d9008
                
                int32_t var_558
                char* r0_29 = lua_tolstring(arg1, 3, &var_558)
                
                if (var_558 != 0)
                    int32_t r4_3 = 0
                    
                    do
                        uint32_t r0_35 = zx.d(r0_29[r4_3])
                        
                        if (r0_35 != 0x25)
                            int32_t r1_12 = var_54c
                            
                            if (r1_12 u>= var_550)
                                luaL_prepbuffsize(&var_554, 1, var_550)
                                r0_35 = zx.d(r0_29[r4_3])
                                r1_12 = var_54c
                            
                            var_54c = r1_12 + 1
                            var_554[r1_12] = r0_35.b
                        else
                            r4_3 += 1
                            int32_t r0_32 = sx.d(r0_29[r4_3])
                            int32_t r1_10 = r0_32 & 0xff
                            
                            if (0xffffffd0 + (r0_32 & 0xff) u>= 0xa)
                                if (r1_10 != 0x25)
                                    luaL_error(arg1, "invalid use of '%c' in replacement string", 
                                        0x25)
                                
                                int32_t r0_37 = var_54c
                                
                                if (r0_37 u>= var_550)
                                    luaL_prepbuffsize(&var_554, 1)
                                    r0_37 = var_54c
                                
                                var_54c = r0_37 + 1
                                var_554[r0_37] = r0_29[r4_3]
                            else if (r1_10 != 0x30)
                                sub_da604(&var_144, r0_32 - 0x31, r5, r9_1)
                                luaL_addvalue(&var_554)
                            else
                                luaL_addlstring(&var_554, r5, r9_1 - r5)
                        
                        r4_3 += 1
                    while (r4_3 u< var_558)
                
                r4_1 = r0_6
                goto label_d8fa4
            
            if (var_130_1 s<= 0)
                lua_pushlstring(arg1, r5, r9_1 - r5)
            else
                int32_t var_128
                int32_t var_12c
                
                if (var_128 == 0xffffffff)
                    luaL_error(arg1, "unfinished capture")
                    lua_pushlstring(arg1, var_12c, var_128)
                else if (var_128 != 0xfffffffe)
                    lua_pushlstring(arg1, var_12c, var_128)
                else
                    lua_pushinteger(arg1, var_12c + 1 - var_140)
                r8 = var_574
            
            lua_gettable(arg1, 3)
        label_d9008:
            
            if (lua_toboolean(arg1, 0xffffffff) == 0)
                lua_settop(arg1, 0xfffffffe)
                lua_pushlstring(arg1, r5, r9_1 - r5)
            else if (lua_isstring(arg1, 0xffffffff) == 0)
                luaL_error(arg1, "invalid replacement value (a %s)", 
                    lua_typename(arg1, lua_type(arg1, 0xffffffff)))
            
            luaL_addvalue(&var_554)
            
            if (r9_1 u> r5)
                goto label_d90cc
        
        if (r5 u< r0_17)
            int32_t r0_59 = var_54c
            
            if (r0_59 u>= var_550)
                luaL_prepbuffsize(&var_554, 1)
                r0_59 = var_54c
            
            r9_1 = r5 + 1
            var_54c = r0_59 + 1
            var_554[r0_59] = *r5
            goto label_d90cc
    
    r9_1 = r5
    break

luaL_addlstring(&var_554, r9_1, r0_17 - r9_1)
luaL_pushresult(&var_554)
lua_pushinteger(arg1, r6_1)

if (*__stack_chk_guard == r0)
    return 2

__stack_chk_fail()
noreturn
