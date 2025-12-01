// 函数: _ZN9ascension21CActiveEffectInstance21AddEffectDurationFuncEPKcj
// 地址: 0xe7778
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
strncpy(&arg1[0x1c + *(arg1 + 0x18) * 0x48], arg2, 0x40)
arg1[*(arg1 + 0x18) * 0x48 + 0x5b] = 0
arg1[*(arg1 + 0x18) * 0x48 + 0x5b] = 0
int32_t var_2c = 0
int32_t var_30 = 0
int32_t r0_11 = ascension::FindEffectActiveConditionFunc(arg2, &var_30)
int32_t r1_1 = *(arg1 + 0x18)
void* r2_1 = &arg1[0x1c + r1_1 * 0x48]
*(r2_1 + 0x40) = r0_11
int32_t r3 = *(arg1 + 0x14c)
*(arg1 + 0x148) |= var_30
*(arg1 + 0x14c) = r3 | var_2c
int32_t entry_r2
*(r2_1 + 0x44) = entry_r2
*(arg1 + 0x18) = r1_1 + 1
int32_t r0_15 = *__stack_chk_guard

if (r0_15 == r0)
    return r0_15 - r0

__stack_chk_fail()
noreturn
