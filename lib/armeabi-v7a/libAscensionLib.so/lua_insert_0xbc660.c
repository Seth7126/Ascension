// 函数: lua_insert
// 地址: 0xbc660
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r3 = *(arg1 + 0x10)
void* const lr

if (arg2 s>= 1)
    lr = &data_1d13d0
    void* r1 = *r3 + (arg2 << 4)
    
    if (r1 u< *(arg1 + 8))
        lr = r1
else if (arg2 s>= 0xfff0b9d9)
    lr = *(arg1 + 8) + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r3_3 = *r3
    
    if (r3_3[2] != 0x16)
        void* r3_4 = *r3_3
        lr = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r3_4 + 6)))
            lr = r3_4 + ((0xfff0b9d8 - arg2) << 4)
    else
        lr = &data_1d13d0
else
    lr = *(arg1 + 0xc) + 0x28

int32_t* r1_2 = *(arg1 + 8)

if (r1_2 u> lr)
    int32_t* r3_2 = r1_2
    
    do
        int32_t r12_2 = *(r1_2 - 8)
        r3_2 -= 0x10
        int32_t r2_2 = *(r1_2 - 0xc)
        *r1_2 = *r3_2
        r1_2[1] = r2_2
        r1_2[2] = r12_2
        r1_2 = r3_2
    while (r3_2 u> lr)
    
    r1_2 = *(arg1 + 8)

int32_t r2_3 = r1_2[1]
*lr = *r1_2
*(lr + 4) = r2_3
int32_t result = r1_2[2]
*(lr + 8) = result
return result
