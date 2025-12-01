// 函数: _ZN17GameOptionManager19SetLocalPlayerIndexEj
// 地址: 0x1805e0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r2 = arg1 + 0x20
int32_t entry_r1
bool cond:0 = *r2 == entry_r1
*(r2 - 0x1c) = entry_r1

if (not(cond:0))
    r2 = arg1 + 0xc4
    
    if (*r2 != entry_r1)
        r2 = arg1 + 0x168
        
        if (*r2 != entry_r1)
            r2 = arg1 + 0x20c
            
            if (*r2 != entry_r1)
                r2 = arg1 + 0x2b0
                
                if (*r2 != entry_r1)
                    int32_t* r3_6 = nullptr
                    
                    if (*(arg1 + 0x354) == entry_r1)
                        r3_6 = arg1 + 0x354
                    
                    *(arg1 + 0x3fc) = r3_6
                    return 

*(arg1 + 0x3fc) = r2
