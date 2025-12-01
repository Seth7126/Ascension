// 函数: lua_setupvalue
// 地址: 0xbfb98
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r4 = *(arg1 + 0x10)
void* const r3

if (arg2 s>= 1)
    r3 = &data_1d13d0
    void* r1 = *r4 + (arg2 << 4)
    
    if (r1 u< *(arg1 + 8))
        r3 = r1
else if (arg2 s>= 0xfff0b9d9)
    r3 = *(arg1 + 8) + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r4_2 = *r4
    
    if (r4_2[2] != 0x16)
        void* r4_3 = *r4_2
        r3 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r4_3 + 6)))
            r3 = r4_3 + ((0xfff0b9d8 - arg2) << 4)
    else
        r3 = &data_1d13d0
else
    r3 = *(arg1 + 0xc) + 0x28

void* const result = nullptr
int32_t r1_4 = *(r3 + 8) & 0x3f
void* r1_5
void* r12_3

if (r1_4 == 6)
    if (arg3 s>= 1)
        void* r12_4 = *r3
        void* r3_4 = *(r12_4 + 0xc)
        
        if (*(r3_4 + 0x28) s>= arg3)
            void* r3_5 = *(*(r3_4 + 0x1c) + ((arg3 - 1) << 3))
            r1_5 = *(r12_4 + ((arg3 - 1) << 2) + 0x10)
            result = &data_1bfacb
            r12_3 = *(r1_5 + 8)
            
            if (r3_5 != 0)
                result = r3_5 + 0x10
            
            goto label_bfcbc
else if (r1_4 == 0x26 && arg3 s>= 1)
    r1_5 = *r3
    
    if (zx.d(*(r1_5 + 6)) s>= arg3)
        r12_3 = r1_5 + (arg3 << 4)
        result = &data_1bfacb
    label_bfcbc:
        int32_t r3_6 = *(arg1 + 8)
        *(arg1 + 8) = r3_6 - 0x10
        int32_t lr_1 = *(r3_6 - 0x10)
        *(r12_3 + 4) = *(r3_6 - 0xc)
        *r12_3 = lr_1
        *(r12_3 + 8) = *(r3_6 - 8)
        void** r2_4 = *(arg1 + 8)
        
        if ((zx.d(r2_4[2].b) & 0x40) != 0)
            void* r2_5 = *r2_4
            
            if ((zx.d(*(r2_5 + 5)) & 3) != 0 && (zx.d(*(r1_5 + 5)) & 4) != 0)
                sub_cade0(arg1, r1_5, r2_5)
return result
