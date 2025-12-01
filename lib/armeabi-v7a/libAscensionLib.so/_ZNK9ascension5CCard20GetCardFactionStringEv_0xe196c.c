// 函数: _ZNK9ascension5CCard20GetCardFactionStringEv
// 地址: 0xe196c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t r1 = *(entry_r0 + 0x8c)
int32_t r0 = 1

if ((r1 & 2) == 0)
    r0 = 2
    
    if ((r1 & 4) == 0)
        r0 = 3
        
        if ((r1 & 8) == 0)
            r0 = 4
            
            if ((r1 & 0x10) == 0)
                return "none"

return &(*"none")[r0 << 4]
