// 函数: sub_d82f0
// 地址: 0xd82f0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r0_2 = lua_gettop(arg1)
void var_43c
char* r0_4 = luaL_buffinitsize(arg1, &var_43c, r0_2)

if (r0_2 s>= 1)
    int32_t r10_1 = 0
    bool cond:0_1
    
    do
        int32_t r0_6 = luaL_checkinteger(arg1, r10_1 + 1)
        
        if (r0_6 u>= 0x100)
            luaL_argerror(arg1, r10_1 + 1, "value out of range")
        
        r0_4[r10_1] = r0_6.b
        cond:0_1 = r0_2 != r10_1 + 1
        r10_1 += 1
    while (cond:0_1)

luaL_pushresultsize(&var_43c, r0_2)

if (*__stack_chk_guard == r0)
    return 1

__stack_chk_fail()
noreturn
