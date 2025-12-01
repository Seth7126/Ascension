// 函数: _ZN9ascension27CConstructAbilityDefinition23SetAbilityConditionFuncEjPKcj
// 地址: 0xe4834
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r4 = arg1 + (arg2 << 6)
strncpy(r4 + 0x30, arg3, 0x40)
*(r4 + 0x6f) = 0
int32_t r4_1 = arg1 + (arg2 << 2)
int32_t result = ascension::FindEffectConditionFunc(arg3)
int32_t entry_r3
*(r4_1 + 0x184) = entry_r3
*(r4_1 + 0x170) = result
return result
