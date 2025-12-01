// 函数: _ZN9ascension23CActiveEffectDefinition22SetEffectConditionFuncEjPKcj
// 地址: 0xe6af0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r4 = arg1 + (arg2 << 6)
int32_t r0 = *__stack_chk_guard
strncpy(r4 + 0x5c, arg3, 0x40)
*(r4 + 0x9b) = 0
int32_t var_2c = 0
int32_t var_30 = 0
int32_t r1_2 = arg1 + (arg2 << 2)
*(r1_2 + 0x19c) = ascension::FindEffectActiveConditionFunc(arg3, &var_30)
int32_t r3 = *(arg1 + 0xc)
*(arg1 + 8) |= var_30
*(arg1 + 0xc) = r3 | var_2c
int32_t entry_r3
*(r1_2 + 0x1b0) = entry_r3
int32_t r0_6 = *__stack_chk_guard

if (r0_6 == r0)
    return r0_6 - r0

__stack_chk_fail()
noreturn
