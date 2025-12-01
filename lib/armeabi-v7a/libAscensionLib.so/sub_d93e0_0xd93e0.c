// 函数: sub_d93e0
// 地址: 0xd93e0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t var_430
int32_t r0_2 = luaL_checklstring(arg1, 1, &var_430)
void var_42c
char* r0_4 = luaL_buffinitsize(arg1, &var_42c, var_430)
int32_t r1_1 = var_430

if (r1_1 == 0)
    r1_1 = 0
else
    int32_t r3_1 = 0
    
    do
        r0_4[r3_1] = *(r0_2 - 1 + r1_1 - r3_1)
        r3_1 += 1
        r1_1 = var_430
    while (r1_1 u> r3_1)

luaL_pushresultsize(&var_42c, r1_1)

if (*__stack_chk_guard == r0)
    return 1

__stack_chk_fail()
noreturn
