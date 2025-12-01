// 函数: _ZN17GameOptionManager24SelectOptionByInstanceIDEt
// 地址: 0x180bf0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0
int32_t entry_i

if (entry_i != 0)
    void* r4_1 = *(arg1 + 0x3fc)
    int32_t* r7_1 = arg1
    
    if (r4_1 != 0)
        int32_t r0_1 = *(r4_1 + 0x98)
        
        if (r0_1 s>= 1)
            int32_t r3_1 = 0
            int16_t* r6_1 = *(r4_1 + 0xa0) + 4
            
            while (zx.d(*r6_1) != entry_i)
                r3_1 += 1
                r6_1 = &r6_1[0x20]
                
                if (r3_1 s>= r0_1)
                    return 0
            
            int32_t lr_1 = *(r4_1 + 4)
            result = 1
            
            if (lr_1 != 0)
                int32_t entry_i_1 = entry_i
                uint32_t var_24_1 = zx.d(r6_1[1])
                int32_t var_20_1 = 0
                lr_1(*r7_1, *(r4_1 + 8), r7_1[1])
                r7_1[1]
                GameOptionManager::ResetPlayerOptionEntry(r7_1)

return result
