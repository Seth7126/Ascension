// 函数: _ZN9ascension7CEffect9AddEffectEPKcj
// 地址: 0xe610c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r1_1 = &arg1[0x98 + *(arg1 + 0x94) * 0x90]
*r1_1 = 0
*(r1_1 + 0x40) = 0
*(r1_1 + 0x44) = 0
uint32_t r0_3 = strlen(arg2)
strncpy(r1_1 + 0x48, arg2, 0x40)
void* r0_7 = &arg1[0x98 + *(arg1 + 0x94) * 0x90]
*(r0_7 + 0x87) = 0
*(r0_7 + r0_3 + 0x48) = 0
int32_t r0_10 = ascension::FindEffectFunc(arg2)
int32_t r1_3 = *(arg1 + 0x94)
void* r2_1 = &arg1[0x98 + r1_3 * 0x90]
*(r2_1 + 0x88) = r0_10
int32_t entry_r2
*(r2_1 + 0x8c) = entry_r2
*(arg1 + 0x94) = r1_3 + 1
return r1_3 + 1
