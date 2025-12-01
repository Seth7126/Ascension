// 函数: _ZNK17GameOptionManager20GetOptionPlayerIndexEv
// 地址: 0x1807e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t r0 = *(entry_r0 + 0x20)

if (r0 == 0 || *(entry_r0 + 0xb8) s<= 0)
    r0 = *(entry_r0 + 0xc4)
    
    if (r0 == 0 || *(entry_r0 + 0x15c) s<= 0)
        r0 = *(entry_r0 + 0x168)
        
        if (r0 == 0 || *(entry_r0 + 0x200) s<= 0)
            r0 = *(entry_r0 + 0x20c)
            
            if (r0 == 0 || *(entry_r0 + 0x2a4) s<= 0)
                int32_t r0_1 = *(entry_r0 + 0x2b0)
                
                if (r0_1 != 0 && *(entry_r0 + 0x348) s> 0)
                    return r0_1
                
                int32_t r0_2 = *(entry_r0 + 0x354)
                
                if (r0_2 == 0)
                    return 0
                
                if (*(entry_r0 + 0x3ec) s<= 0)
                    return 0
                
                return r0_2

return r0
