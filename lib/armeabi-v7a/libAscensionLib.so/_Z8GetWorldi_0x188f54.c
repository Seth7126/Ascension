// 函数: _Z8GetWorldi
// 地址: 0x188f54
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int16_t r3 = 0
uint32_t r2 = *s_pWorldData

if (*(r2 + 0x14) != arg1)
    r3 = 1
    
    if (*(r2 + 0x44) != arg1)
        r3 = 2
        
        if (*(r2 + 0x74) != arg1)
            r3 = 3
            
            if (*(r2 + 0xa4) != arg1)
                return 0

return *(r3 * 0x34 + r2 + 0x124)
