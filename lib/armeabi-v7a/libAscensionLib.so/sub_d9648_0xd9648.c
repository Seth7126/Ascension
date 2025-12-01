// 函数: sub_d9648
// 地址: 0xd9648
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char const* const r5 = arg2
int32_t r7 = 1
int32_t r0 = *__stack_chk_guard
int32_t var_148
int32_t r0_2 = luaL_checklstring(arg1, 1, &var_148)
int32_t var_14c
char* r6 = luaL_checklstring(arg1, 2, &var_14c)
int32_t r0_6 = luaL_optinteger(arg1, 3, 1)
int32_t r1 = var_148
int32_t result

if (r0_6 s<= 0xffffffff)
    if (r1 u>= 0 - r0_6)
        r0_6 = r1 + r0_6 + 1
        
        if (r0_6 != 0)
            goto label_d96c0
        
        goto label_d9704
    
label_d9704:
    char const* const var_154_1 = r5
    
    if (r5 == 0)
    label_d97f4:
        uint32_t r4_1 = zx.d(*r6)
        int32_t r1_4 = var_14c
        void* r7_2 = r0_2 + r7 - 1
        int32_t r0_25 = var_148
        
        if (r4_1 == 0x5e)
            r6 = &r6[1]
        
        if (r4_1 == 0x5e)
            r1_4 -= 1
            var_14c = r1_4
        
        int32_t var_144 = 0xc8
        int32_t var_140_1 = r0_2
        void* var_138_1 = &r6[r1_4]
        
        while (true)
            int32_t result_1 = 0
            char* r0_28 = sub_d99ec(&var_144, r7_2, r6, r5)
            
            if (r0_28 != 0)
                if (var_154_1 == 0)
                    result = result_1
                    
                    if (result == 0)
                        result = 1
                    
                    luaL_checkstack(arg1, result, "too many captures")
                    
                    if (result s>= 1)
                        int32_t r6_2 = 0
                        
                        do
                            sub_da604(&var_144, r6_2, r7_2, r0_28)
                            r6_2 += 1
                        while (result != r6_2)
                else
                    lua_pushinteger(arg1, 1 - r0_2 + r7_2)
                    lua_pushinteger(arg1, r0_28 - r0_2)
                    luaL_checkstack(arg1, result_1, "too many captures")
                    
                    if (result_1 s>= 1)
                        int32_t r5_3 = 0
                        
                        do
                            sub_da604(&var_144, r5_3, 0, 0)
                            r5_3 += 1
                        while (result_1 != r5_3)
                    
                    result = result_1 + 2
                
                break
            
            if (r7_2 u>= r0_2 + r0_25)
                goto label_d9874
            
            r7_2 += 1
            
            if (r4_1 == 0x5e)
                goto label_d9874
    else
        int32_t r0_10 = lua_toboolean(arg1, 4)
        int32_t r8_1 = var_14c
        
        if (r0_10 == 0)
            int32_t r7_1 = 0
            r5 = "^$*+?.([%-"
            
            do
                char* s = &r6[r7_1]
                
                if (strpbrk(s, "^$*+?.([%-") != 0)
                    goto label_d97f4
                
                r7_1 = r7_1 + strlen(s) + 1
            while (r7_1 u<= r8_1)
        
        int32_t r1_7 = r0_2
        void* __s = r1_7 + r7 - 1
        void* __s_1
        
        if (r8_1 == 0)
            __s_1 = __s
        label_d9894:
            void* r4_2 = __s_1 - r1_7
            lua_pushinteger(arg1, r4_2 + 1)
            lua_pushinteger(arg1, r4_2 + var_14c)
            result = 2
        else
            uint32_t __n
            
            if (r8_1 u<= var_148 - r7 + 1)
                __n = var_148 - r7 + 1 - (r8_1 - 1)
            
            if (r8_1 u<= var_148 - r7 + 1 && var_148 - r7 + 1 != r8_1 - 1)
                int32_t __c = sx.d(*r6)
                
                while (true)
                    void* __s_2 = memchr(__s, __c, __n)
                    
                    if (__s_2 == 0)
                        goto label_d9874
                    
                    __s_1 = __s_2
                    
                    if (memcmp(__s_2 + 1, &r6[1], r8_1 - 1) == 0)
                        r1_7 = r0_2
                        break
                    
                    void* r0_23 = __n + __s
                    __s = __s_2 + 1
                    __n = r0_23 - (__s_2 + 1)
                    
                    if (r0_23 == __s_2 + 1)
                        goto label_d9874
                
                goto label_d9894
            
        label_d9874:
            lua_pushnil(arg1)
            result = 1
else
    if (r0_6 == 0)
        goto label_d9704
    
label_d96c0:
    r7 = r0_6
    
    if (r0_6 u<= r1 + 1)
        goto label_d9704
    
    lua_pushnil(arg1, r1 + 1)
    result = 1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
