// 函数: _ZN9ascension21CActiveEffectInstance17AddEffectDurationEP9lua_State
// 地址: 0xe7c64
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_2 = lua_touserdata(arg1, 1)
char* r0_4 = lua_tolstring(arg1, 2, 0)
int32_t r0_6 = lua_tointegerx(arg1, 3, 0)
strncpy(r0_2 + 0x1c + *(r0_2 + 0x18) * 0x48, r0_4, 0x40)
*(r0_2 + 0x1c + *(r0_2 + 0x18) * 0x48 + 0x3f) = 0
*(r0_2 + 0x1c + *(r0_2 + 0x18) * 0x48 + 0x3f) = 0
int32_t var_2c = 0
int32_t var_30 = 0
int32_t r0_17 = ascension::FindEffectActiveConditionFunc(r0_4, &var_30)
int32_t r1_2 = *(r0_2 + 0x18)
void* r2_1 = r0_2 + 0x1c + r1_2 * 0x48
*(r2_1 + 0x40) = r0_17
int32_t r3 = *(r0_2 + 0x14c)
*(r0_2 + 0x148) |= var_30
*(r0_2 + 0x14c) = r3 | var_2c
*(r2_1 + 0x44) = r0_6
*(r0_2 + 0x18) = r1_2 + 1

if (*__stack_chk_guard == r0)
    return 0

__stack_chk_fail()
noreturn
