// 函数: GetGamePlayerAICount
// 地址: 0x1893f8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r2 = *s_pWorldData
int32_t result = 0

if (r2 != 0)
    int32_t r12_1 = *(r2 + 0xd4)
    
    if (r12_1 s< 1)
        return 0
    
    char* r2_1 = r2 + 0x1c
    int32_t r3_1 = 0
    result = 0
    
    do
        uint32_t r1_1 = zx.d(*r2_1)
        r2_1 = &r2_1[0x30]
        r3_1 += 1
        
        if (r1_1 == 2)
            result += 1
    while (r3_1 s< r12_1)

return result
