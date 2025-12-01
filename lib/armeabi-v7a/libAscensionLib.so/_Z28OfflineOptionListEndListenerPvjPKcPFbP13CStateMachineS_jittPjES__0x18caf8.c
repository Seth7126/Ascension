// 函数: _Z28OfflineOptionListEndListenerPvjPKcPFbP13CStateMachineS_jittPjES_
// 地址: 0x18caf8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
uint32_t r3 = *s_pWorldData
int32_t r5 = *(r3 + 0xd4)
int32_t r12 = *(s_InterfaceContext + 0x10)

if (r5 s>= 1)
    int32_t* r6_1 = r3 + 0x14
    int32_t r4_1 = 0
    
    do
        if (*r6_1 == arg2)
            if (*(r3 + 0xf8) != 3)
                *(r3 + 0xd8) |= (1 << (r4_1 & 0xff)).b
            
            void* r4_2 = r3 + r12 * 0x34 + (r4_1 << 2)
            *(r4_2 + 0x148) = arg5
            *(r4_2 + 0x138) = arg4
            break
        
        r4_1 += 1
        r6_1 = &r6_1[0xc]
    while (r4_1 s< r5)

int32_t result = *(r3 + r12 * 0x34 + 0x134)

if (result == 0)
    return result

for (int32_t i = *(r3 + (r12 << 2) + 0xfc); i u< *(r3 + 0x10c); i += 1)
    if (*(*(r3 + 0x120) + (i << 4)) == arg2)
        return GameOptionManager::OptionListCancel(result, arg2, OfflineOptionSelectFunc) __tailcall

uint32_t var_20_1 = r3
return GameOptionManager::OptionListEnd(result, arg2, arg3, OfflineOptionSelectFunc)
