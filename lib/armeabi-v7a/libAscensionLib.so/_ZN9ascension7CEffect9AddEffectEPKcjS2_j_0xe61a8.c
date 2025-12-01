// 函数: _ZN9ascension7CEffect9AddEffectEPKcjS2_j
// 地址: 0xe61a8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0_1 = strlen(arg4)
strncpy(&arg1[0x98 + *(arg1 + 0x94) * 0x90], arg4, 0x40)
arg1[*(arg1 + 0x94) * 0x90 + 0xd7] = 0
arg1[0x98 + *(arg1 + 0x94) * 0x90 + r0_1] = 0
int32_t r0_12 = ascension::FindEffectConditionFunc(arg4)
void* r7_1 = &arg1[0x98 + *(arg1 + 0x94) * 0x90]
*(r7_1 + 0x40) = r0_12
int32_t arg_0
*(r7_1 + 0x44) = arg_0
uint32_t r0_14 = strlen(arg2)
strncpy(r7_1 + 0x48, arg2, 0x40)
void* r0_18 = &arg1[0x98 + *(arg1 + 0x94) * 0x90]
*(r0_18 + 0x87) = 0
*(r0_18 + r0_14 + 0x48) = 0
int32_t r0_21 = ascension::FindEffectFunc(arg2)
int32_t r1_4 = *(arg1 + 0x94)
void* r2_2 = &arg1[0x98 + r1_4 * 0x90]
*(r2_2 + 0x88) = r0_21
*(r2_2 + 0x8c) = arg3
*(arg1 + 0x94) = r1_4 + 1
return r1_4 + 1
