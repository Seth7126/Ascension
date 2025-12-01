// 函数: lua_getuservalue
// 地址: 0xbe8a4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r3_3 = *(arg1 + 0x10)
void* const r2

if (arg2 s>= 1)
    r2 = &data_1d13d0
    void* r1 = *r3_3 + (arg2 << 4)
    
    if (r1 u< *(arg1 + 8))
        r2 = r1
else if (arg2 s>= 0xfff0b9d9)
    r2 = *(arg1 + 8) + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r3_1 = *r3_3
    
    if (r3_1[2] != 0x16)
        void* r3_2 = *r3_1
        r2 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r3_2 + 6)))
            r2 = r3_2 + ((0xfff0b9d8 - arg2) << 4)
    else
        r2 = &data_1d13d0
else
    r2 = *(arg1 + 0xc) + 0x28

int32_t* r1_2 = *(arg1 + 8)
int32_t r2_3 = *(*r2 + 0xc)
int32_t r2_4

if (r2_3 != 0)
    *r1_2 = r2_3
    r2_4 = 0x45
else
    r2_4 = 0

r1_2[2] = r2_4
*(arg1 + 8) += 0x10
