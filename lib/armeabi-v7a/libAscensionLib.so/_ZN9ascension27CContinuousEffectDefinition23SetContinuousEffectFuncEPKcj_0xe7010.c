// 函数: _ZN9ascension27CContinuousEffectDefinition23SetContinuousEffectFuncEPKcj
// 地址: 0xe7010
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
uint32_t r0_2 = strlen(arg2)
strncpy(&arg1[0x1c4], arg2, 0x40)
arg1[0x203] = 0
arg1[0x1c4 + r0_2] = 0
int32_t var_2c = 0
int32_t var_30 = 0
int32_t r0_5 = ascension::FindEffectContinuousFunc(arg2, &var_30)
int32_t r2
int32_t r3
r3:r2 = *(arg1 + 8)
int32_t r1_2 = var_30
*(arg1 + 0x204) = r0_5
int32_t entry_r2
*(arg1 + 0x208) = entry_r2
*(arg1 + 8) = (r3 | var_2c):(r2 | r1_2)
int32_t r0_6 = *__stack_chk_guard

if (r0_6 == r0)
    return r0_6 - r0

__stack_chk_fail()
noreturn
