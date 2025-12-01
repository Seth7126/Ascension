// 函数: GetWinnerID
// 地址: 0x18ad10
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r1 = *s_pWorldData

if (r1 == 0)
    return 0

void* r2_1 = *(r1 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)

if (r2_1 != 0)
    int32_t* r1_2 = *(r2_1 + 0x24)
    
    if (*(r2_1 + 0x28) != r1_2)
        return *(*r1_2 + 0xc)

return 0
