// 函数: GetPlayedCardPositionIndex
// 地址: 0x18b15c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r1 = *s_pWorldData

if (r1 == 0)
    return 0xffffffff

void* r1_2 = *(r1 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)

if (r1_2 != 0)
    int32_t r2_1 = *(r1_2 + 0xb80)
    int32_t r1_3 = *(r1_2 + 0xb84)
    
    if (r1_3 != r2_1)
        int32_t i = 0
        
        do
            void* r1_5 = *(r2_1 + (i << 3))
            
            if (r1_5 != 0 && zx.d(*(r1_5 + 8)) == arg1)
                return i
            
            i += 1
        while (i u< (r1_3 - r2_1) s>> 3)

return 0xffffffff
