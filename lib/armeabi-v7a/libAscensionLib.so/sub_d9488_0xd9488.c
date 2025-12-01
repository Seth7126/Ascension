// 函数: sub_d9488
// 地址: 0xd9488
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t var_20
int32_t r0_2 = luaL_checklstring(arg1, 1, &var_20)
int32_t r0_4 = luaL_checkinteger(arg1, 2)
int32_t r7 = r0_4

if (r0_4 s<= 0xffffffff)
    int32_t r1_1 = var_20
    r7 = 0
    
    if (r1_1 u>= 0 - r0_4)
        r7 = r0_4 + r1_1 + 1

int32_t r0_7 = luaL_optinteger(arg1, 3, 0xffffffff)
int32_t r2_2 = var_20
int32_t r1_2 = r0_7

if (r0_7 s<= 0xffffffff)
    r1_2 = 0
    
    if (r2_2 u>= 0 - r0_7)
        r1_2 = r0_7 + r2_2 + 1

if (r1_2 u> r2_2)
    r1_2 = r2_2

if (r7 == 0)
    r7 = 1

int32_t r0_9
void* const r1_3
int32_t r2_3

if (r1_2 u>= r7)
    r2_3 = 1 - r7 + r1_2
    r1_3 = r0_2 + r7 - 1
    r0_9 = arg1
else
    r0_9 = arg1
    r2_3 = 0
    r1_3 = &data_1bfacb

lua_pushlstring(r0_9, r1_3, r2_3)

if (*__stack_chk_guard == r0)
    return 1

__stack_chk_fail()
noreturn
