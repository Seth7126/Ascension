// 函数: sub_d9588
// 地址: 0xd9588
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t var_438
void* r0_2 = luaL_checklstring(arg1, 1, &var_438)
void var_434
char* r0_4 = luaL_buffinitsize(arg1, &var_434, var_438)
int32_t r1_1

if (var_438 == 0)
    r1_1 = 0
else
    int32_t r7_1 = 0
    
    do
        r0_4[r7_1] = toupper(zx.d(*(r0_2 + r7_1)))
        r7_1 += 1
        r1_1 = var_438
    while (r7_1 u< r1_1)

luaL_pushresultsize(&var_434, r1_1)

if (*__stack_chk_guard == r0)
    return 1

__stack_chk_fail()
noreturn
