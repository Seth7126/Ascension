// 函数: _ZN17GameOptionManager18SelectOptionByTextEtPKc
// 地址: 0x180ec4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (arg2 != 0)
    void* r9_1 = *(arg1 + 0x3fc)
    
    if (r9_1 != 0)
        int32_t r8_1 = *(r9_1 + 0x98)
        
        if (r8_1 s>= 1)
            int32_t* var_28_1 = arg1
            int32_t r4_1 = 0
            int16_t* r6_1 = *(r9_1 + 0xa0) + 4
            char* entry___s2
            
            while (zx.d(r6_1[1]) != arg2 || strcasecmp(r6_1 + 5, entry___s2) != 0)
                r4_1 += 1
                r6_1 = &r6_1[0x20]
                
                if (r4_1 s>= r8_1)
                    return 0
            
            int32_t r12_1 = *(r9_1 + 4)
            result = 1
            
            if (r12_1 != 0)
                r12_1(*var_28_1, *(r9_1 + 8), var_28_1[1], r4_1, zx.d(*r6_1), arg2, 0)
                var_28_1[1]
                GameOptionManager::ResetPlayerOptionEntry(var_28_1)

return result
