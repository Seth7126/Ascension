// 函数: lua_topointer
// 地址: 0xbdca8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r12 = *(arg1 + 0x10)
void* const r3

if (arg2 s>= 1)
    r3 = &data_1d13d0
    void* r0_1 = *r12 + (arg2 << 4)
    
    if (r0_1 u< *(arg1 + 8))
        r3 = r0_1
else if (arg2 s>= 0xfff0b9d9)
    r3 = *(arg1 + 8) + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r3_1 = *r12
    
    if (r3_1[2] != 0x16)
        void* r2_3 = *r3_1
        r3 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r2_3 + 6)))
            r3 = r2_3 + ((0xfff0b9d8 - arg2) << 4)
    else
        r3 = &data_1d13d0
else
    r3 = *(arg1 + 0xc) + 0x28

switch ((*(r3 + 8) & 0x3f) - 2)
    case 0, 5
        if (arg2 s>= 1)
            r3 = &data_1d13d0
            void* r1 = *r12 + (arg2 << 4)
            
            if (r1 u< *(arg1 + 8))
                r3 = r1
        else if (arg2 s>= 0xfff0b9d9)
            r3 = *(arg1 + 8) + (arg2 << 4)
        else if (arg2 != 0xfff0b9d8)
            int32_t* r2_8 = *r12
            
            if (r2_8[2] != 0x16)
                void* r2_9 = *r2_8
                r3 = &data_1d13d0
                
                if (0xfff0b9d8 - arg2 s<= zx.d(*(r2_9 + 6)))
                    r3 = r2_9 + ((0xfff0b9d8 - arg2) << 4)
            else
                r3 = &data_1d13d0
        else
            r3 = *(arg1 + 0xc) + 0x28
        
        int32_t r1_4 = *(r3 + 8) & 0xf
        
        if (r1_4 == 2)
            return *r3
        
        if (r1_4 == 7)
            return *r3 + 0x18
    case 3, 4, 6, 0x14, 0x24
        return *r3

return 0
