// 函数: sub_da6ac
// 地址: 0xda6ac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t var_148
void* r0_2 = lua_tolstring(arg1, 0xfff0b9d7, &var_148)
int32_t var_14c
char* r0_4 = lua_tolstring(arg1, 0xfff0b9d6, &var_14c)
int32_t var_144 = 0xc8
int32_t result = 0
int32_t r6 = var_148
void* var_140 = r0_2
void* var_138 = &r0_4[var_14c]
int32_t r0_8 = lua_tointegerx(arg1, 0xfff0b9d5, 0)

if (r0_8 s<= r6)
    void* r6_1 = r0_2 + r0_8
    
    while (true)
        int32_t result_1 = 0
        char* r0_10 = sub_d99ec(&var_144, r6_1, r0_4, &var_144)
        
        if (r0_10 != 0)
            int32_t r1_2 = r0_10 - r0_2
            
            if (r6_1 == r0_10)
                r1_2 += 1
            
            lua_pushinteger(arg1, r1_2)
            lua_replace(arg1, 0xfff0b9d5)
            result = result_1
            
            if (result_1 == 0)
                result = 1
            
            if (r6_1 == 0)
                result = result_1
            
            luaL_checkstack(arg1, result, "too many captures")
            
            if (result s>= 1)
                int32_t r4_1 = 0
                
                do
                    sub_da604(&var_144, r4_1, r6_1, r0_10)
                    r4_1 += 1
                while (result != r4_1)
            
            break
        
        r6_1 += 1
        
        if (r6_1 u> r0_2 + r6)
            result = 0
            break

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
