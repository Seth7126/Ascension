// 函数: _ZNK17GameOptionManager17IsHiddenHintMatchEtt
// 地址: 0x180af4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r3 = arg1

if (arg2 != 0)
    r3 = *(r3 + 0x3fc)

if (arg2 != 0 && r3 != 0)
    int32_t r12_1 = *(r3 + 0x98)
    
    if (r12_1 s>= 1)
        void* r3_1 = *(r3 + 0xa0)
        int16_t* r0_1 = r3_1 + 4
        int32_t r3_2 = 0
        
        do
            int32_t entry_r2
            
            if (zx.d(*(r3_1 + 8 + (r3_2 << 6))) != 0 && zx.d(*r0_1) == arg2
                    && zx.d(r0_1[1]) == entry_r2)
                return 1
            
            r3_2 += 1
            r0_1 = &r0_1[0x20]
        while (r3_2 s< r12_1)

return 0
