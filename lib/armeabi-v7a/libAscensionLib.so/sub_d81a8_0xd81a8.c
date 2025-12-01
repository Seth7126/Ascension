// 函数: sub_d81a8
// 地址: 0xd81a8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t var_28
int32_t r0_2 = luaL_checklstring(arg1, 1, &var_28)
int32_t r0_4 = luaL_optinteger(arg1, 2, 1)
int32_t r6 = r0_4

if (r0_4 s<= 0xffffffff)
    int32_t r1_1 = var_28
    r6 = 0
    
    if (r1_1 u>= 0 - r0_4)
        r6 = r0_4 + r1_1 + 1

int32_t r0_7 = luaL_optinteger(arg1, 3, r6)
int32_t r2_3 = var_28
int32_t r1_2 = r0_7

if (r0_7 s<= 0xffffffff)
    r1_2 = 0
    
    if (r2_3 u>= 0 - r0_7)
        r1_2 = r0_7 + r2_3 + 1

int32_t result = 0

if (r1_2 u> r2_3)
    r1_2 = r2_3

if (r6 == 0)
    r6 = 1

if (r1_2 u>= r6)
    if (r1_2 == 0xffffffff)
        result = luaL_error(arg1, "string slice too long")
    else
        result = r1_2 - r6 + 1
        luaL_checkstack(arg1, result, "string slice too long")
        
        if (result s>= 1)
            int32_t r6_1 = 0
            
            do
                lua_pushinteger(arg1, zx.d(*(r0_2 + r6 - 1 + r6_1)))
                r6_1 += 1
            while (r6_1 s< result)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
