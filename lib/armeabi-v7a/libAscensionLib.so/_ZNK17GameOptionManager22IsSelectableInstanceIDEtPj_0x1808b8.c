// 函数: _ZNK17GameOptionManager22IsSelectableInstanceIDEtPj
// 地址: 0x1808b8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r3 = arg1

if (arg2 != 0)
    r3 = *(r3 + 0x3fc)

int32_t result = 0

if (arg2 != 0 && r3 != 0)
    int32_t i_1 = *(r3 + 0x98)
    int32_t entry_r2
    
    if (entry_r2 == 0)
        if (i_1 s< 1)
            return 0
        
        void* r2 = *(r3 + 0xa0)
        int32_t r3_2 = 0
        int16_t* r0_1 = r2 + 4
        
        do
            if (zx.d(*(r2 + 8 + (r3_2 << 6))) == 0 && zx.d(*r0_1) == arg2)
                return 1
            
            r3_2 += 1
            r0_1 = &r0_1[0x20]
        while (r3_2 s< i_1)
        
        return 0
    
    if (i_1 s>= 1)
        void* lr_1 = *(r3 + 0xa0) + 4
        result = 0
        int32_t i
        
        do
            uint32_t r3_1 = zx.d(*(lr_1 + 4))
            bool cond:1_1 = r3_1 == 0
            
            if (r3_1 == 0)
                r3_1 = zx.d(*lr_1)
                cond:1_1 = r3_1 == arg2
                
                if (r3_1 == arg2)
                    r3_1 = zx.d(*(lr_1 + 2))
            
            lr_1 += 0x40
            
            if (cond:1_1)
                *(entry_r2 + (result << 2)) = r3_1
                result += 1
            
            i = i_1
            i_1 -= 1
        while (i != 1)

return result
