// 函数: lua_getupvalue
// 地址: 0xbfa30
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r12 = *(arg1 + 0x10)
void* const r3

if (arg2 s>= 1)
    r3 = &data_1d13d0
    void* r1 = *r12 + (arg2 << 4)
    
    if (r1 u< *(arg1 + 8))
        r3 = r1
else if (arg2 s>= 0xfff0b9d9)
    r3 = *(arg1 + 8) + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r12_4 = *r12
    
    if (r12_4[2] != 0x16)
        void* r12_5 = *r12_4
        r3 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r12_5 + 6)))
            r3 = r12_5 + ((0xfff0b9d8 - arg2) << 4)
    else
        r3 = &data_1d13d0
else
    r3 = *(arg1 + 0xc) + 0x28

void* const result = nullptr
int32_t r1_3 = *(r3 + 8) & 0x3f
void* r2

if (r1_3 == 6)
    if (arg3 s>= 1)
        void* r12_2 = *r3
        void* r3_3 = *(r12_2 + 0xc)
        
        if (*(r3_3 + 0x28) s>= arg3)
            void* r1_7 = *(*(r3_3 + 0x1c) + ((arg3 - 1) << 3))
            result = &data_1bfacb
            r2 = *(*(r12_2 + ((arg3 - 1) << 2) + 0x10) + 8)
            
            if (r1_7 != 0)
                result = r1_7 + 0x10
            
            goto label_bfb18
else if (r1_3 == 0x26 && arg3 s>= 1)
    void* r3_2 = *r3
    
    if (zx.d(*(r3_2 + 6)) s>= arg3)
        r2 = r3_2 + (arg3 << 4)
        result = &data_1bfacb
    label_bfb18:
        int32_t* r1_8 = *(arg1 + 8)
        int32_t r12_3 = *r2
        r1_8[1] = *(r2 + 4)
        *r1_8 = r12_3
        r1_8[2] = *(r2 + 8)
        *(arg1 + 8) += 0x10
return result
