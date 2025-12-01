// 函数: _ZNK9ascension6CWorld11HandleQueryEPNS_6CEventE
// 地址: 0xf3c14
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r1
ascension::CWorld* result = *(entry_r1 + 4)
ascension::CWorld** r6 = *(arg1 + 0xaa4)
int32_t r1 = *(arg1 + 0xaa8)
int32_t r4 = 1 << result
uint32_t r7 = 1 u>> (0x20 - result)

if (result - 0x20 s>= 0)
    r7 = 1 << (result - 0x20)
    r4 = 0

if (r6 != r1)
    do
        result = *r6
        
        if (((*(result + 0x148) & r4) | (*(result + 0x14c) & r7)) != 0)
            result = ascension::CActiveEffectInstance::HandleQuery(result, arg1)
            r1 = *(arg1 + 0xaa8)
        
        r6 = &r6[1]
    while (r6 != r1)

return result
