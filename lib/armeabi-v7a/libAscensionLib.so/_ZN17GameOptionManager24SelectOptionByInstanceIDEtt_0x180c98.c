// 函数: _ZN17GameOptionManager24SelectOptionByInstanceIDEtt
// 地址: 0x180c98
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (arg2 != 0)
    void* r4_1 = *(arg1 + 0x3fc)
    int32_t* r6_1 = arg1
    
    if (r4_1 != 0)
        int32_t r0_1 = *(r4_1 + 0x98)
        
        if (r0_1 s>= 1)
            int16_t* r5 = *(r4_1 + 0xa0) + 4
            int32_t r3_2 = 0
            int32_t entry_r2
            
            while (zx.d(*r5) != arg2 || zx.d(r5[1]) != entry_r2)
                r3_2 += 1
                r5 = &r5[0x20]
                
                if (r3_2 s>= r0_1)
                    return 0
            
            int32_t r7_3 = *(r4_1 + 4)
            result = 1
            
            if (r7_3 != 0)
                int32_t var_28_1 = arg2
                int32_t var_24_1 = entry_r2
                int32_t var_20_1 = 0
                r7_3(*r6_1, *(r4_1 + 8), r6_1[1])
                r6_1[1]
                GameOptionManager::ResetPlayerOptionEntry(r6_1)

return result
