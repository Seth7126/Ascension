// 函数: _ZN12ascension_ai11CWeightedAIC1EjPN9ascension6CWorldEiPKf
// 地址: 0x17c198
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(arg1 + 8) = 0
*(arg1 + 4) = arg2
*(arg1 + 0xc8) = 0
*(arg1 + 0xcc) = 0
*arg1 = _vtable_for_ascension_ai::CWeightedAI + 8
__builtin_memset(arg1 + 0xc, 0, 0x14)
*(arg1 + 0x20) = arg3
*(arg1 + 0xc0) = 0
__aeabi_memclr4(arg1 + 0x24, 0x88)
int32_t arg_0

if (arg4 s>= 1 && arg_0 != 0)
    __aeabi_memcpy4(arg1 + 0x2c, arg_0, arg4 << 2)
    return 

int32_t r3 = *(ascension_ai::s_DefaultAIWeights + 4)
int32_t r4 = *(ascension_ai::s_DefaultAIWeights + 8)
int32_t r5_1 = *(ascension_ai::s_DefaultAIWeights + 0xc)
*(arg1 + 0x2c) = *ascension_ai::s_DefaultAIWeights
*(arg1 + 0x30) = r3
*(arg1 + 0x34) = r4
*(arg1 + 0x38) = r5_1
int32_t r3_1 = *(ascension_ai::s_DefaultAIWeights + 0x14)
int32_t r4_1 = *(ascension_ai::s_DefaultAIWeights + 0x18)
int32_t r5_2 = *(ascension_ai::s_DefaultAIWeights + 0x1c)
int32_t r6 = *(ascension_ai::s_DefaultAIWeights + 0x20)
*(arg1 + 0x3c) = *(ascension_ai::s_DefaultAIWeights + 0x10)
*(arg1 + 0x40) = r3_1
*(arg1 + 0x44) = r4_1
*(arg1 + 0x48) = r5_2
*(arg1 + 0x4c) = r6
