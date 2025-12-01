// 函数: _ZNK17GameOptionManager16IsSelectableTextEtPKc
// 地址: 0x1809e8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg2 != 0)
    void* r1_1 = *(arg1 + 0x3fc)
    
    if (r1_1 != 0)
        int32_t r6_1 = *(r1_1 + 0x98)
        
        if (r6_1 s>= 1)
            void* r0_1 = *(r1_1 + 0xa0)
            int32_t r5 = 0
            int16_t* r7 = r0_1 + 6
            
            do
                char* entry___s2
                
                if (zx.d(*(r0_1 + 8 + (r5 << 6))) == 0 && zx.d(*r7) == arg2
                        && strcasecmp(r7 + 3, entry___s2) == 0)
                    return 1
                
                r5 += 1
                r7 = &r7[0x20]
            while (r5 s< r6_1)

return 0
