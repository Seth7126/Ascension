// 函数: sub_d9258
// 地址: 0xd9258
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 1
int32_t r0 = *__stack_chk_guard
int32_t var_440
int32_t r0_2 = luaL_checklstring(arg1, 1, &var_440)
int32_t r0_4 = luaL_checkinteger(arg1, 2)
int32_t var_444
int32_t r0_6 = luaL_optlstring(arg1, 3, &data_1bfacb, &var_444)

if (r0_4 s<= 0)
    lua_pushlstring(arg1, &data_1bfacb, 0)
else
    int32_t r4_1 = var_440
    int32_t r5 = var_444
    int32_t r0_7
    
    if (r5 + r4_1 u>= r5)
        r0_7 = __aeabi_uidiv(0x7fffffff, r0_4)
    
    if (r5 + r4_1 u< r5 || r5 + r4_1 u>= r0_7)
        result = luaL_error(arg1, "resulting string too large")
    else
        int32_t r4_2 = r4_1 * r0_4 + r5 * (r0_4 - 1)
        void var_43c
        int32_t r0_10 = luaL_buffinitsize(arg1, &var_43c, r4_2)
        int32_t r7_1 = r0_10
        __aeabi_memcpy(r0_10, r0_2, var_440)
        
        if (r0_4 s>= 2)
            int32_t i = r0_4 + 1
            
            do
                int32_t r2_4 = var_440
                int32_t r3_1 = var_444
                r7_1 += r2_4
                
                if (r3_1 != 0)
                    __aeabi_memcpy(r7_1, r0_6, r3_1, r3_1)
                    r2_4 = var_440
                    r7_1 += var_444
                
                __aeabi_memcpy(r7_1, r0_2, r2_4)
                i -= 1
            while (i s> 2)
        
        luaL_pushresultsize(&var_43c, r4_2)
        result = 1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
