// 函数: lua_remove
// 地址: 0xbc580
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r3_4 = *(arg1 + 0x10)
void* const r2

if (arg2 s>= 1)
    r2 = &data_1d13d0
    void* r1 = *r3_4 + (arg2 << 4)
    
    if (r1 u< *(arg1 + 8))
        r2 = r1
else if (arg2 s>= 0xfff0b9d9)
    r2 = *(arg1 + 8) + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r3_2 = *r3_4
    
    if (r3_2[2] != 0x16)
        void* r3_3 = *r3_2
        r2 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r3_3 + 6)))
            r2 = r3_3 + ((0xfff0b9d8 - arg2) << 4)
    else
        r2 = &data_1d13d0
else
    r2 = *(arg1 + 0xc) + 0x28

int32_t i = *(arg1 + 8)

for (void* r1_2 = r2 + 0x10; r1_2 u< i; i = *(arg1 + 8))
    int32_t r3_1 = *(r1_2 + 4)
    int32_t r12_2 = *(r1_2 + 8)
    *(r1_2 - 0x10) = *r1_2
    *(r1_2 - 0xc) = r3_1
    *(r1_2 - 8) = r12_2
    r1_2 += 0x10

*(arg1 + 8) = i - 0x10
