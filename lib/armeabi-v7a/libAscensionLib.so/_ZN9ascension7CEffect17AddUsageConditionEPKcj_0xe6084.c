// 函数: _ZN9ascension7CEffect17AddUsageConditionEPKcj
// 地址: 0xe6084
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0_1 = strlen(arg2)
strncpy(&arg1[4 + *arg1 * 0x48], arg2, 0x40)
arg1[*arg1 * 0x48 + 0x43] = 0
arg1[4 + *arg1 * 0x48 + r0_1] = 0
int32_t r0_12 = ascension::FindEffectConditionFunc(arg2)
int32_t r1_1 = *arg1
void* r2_1 = &arg1[4 + r1_1 * 0x48]
*(r2_1 + 0x40) = r0_12
int32_t entry_r2
*(r2_1 + 0x44) = entry_r2
*arg1 = r1_1 + 1
return r1_1 + 1
