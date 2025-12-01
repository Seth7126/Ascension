// 函数: lua_replace
// 地址: 0xbc754
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = *(arg1 + 8)
int32_t* r0 = *(arg1 + 0x10)
void* const r3

if (arg2 s>= 1)
    r3 = &data_1d13d0
    void* r0_2 = *r0 + (arg2 << 4)
    
    if (r0_2 u< r2)
        r3 = r0_2
else if (arg2 s>= 0xfff0b9d9)
    r3 = r2 + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r0_13 = *r0
    
    if (r0_13[2] != 0x16)
        void* r0_14 = *r0_13
        r3 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r0_14 + 6)))
            r3 = r0_14 + ((0xfff0b9d8 - arg2) << 4)
    else
        r3 = &data_1d13d0
else
    r3 = *(arg1 + 0xc) + 0x28

int32_t r5_1 = *(r2 - 0xc)
*r3 = *(r2 - 0x10)
*(r3 + 4) = r5_1
*(r3 + 8) = *(r2 - 8)

if (arg2 s< 0xfff0b9d8 && (zx.d(*(r2 - 8)) & 0x40) != 0)
    void* r2_1 = *(r2 - 0x10)
    
    if ((zx.d(*(r2_1 + 5)) & 3) != 0)
        void* r1 = ***(arg1 + 0x10)
        
        if ((zx.d(*(r1 + 5)) & 4) != 0)
            sub_cade0(arg1, r1, r2_1)

int32_t result = *(arg1 + 8) - 0x10
*(arg1 + 8) = result
return result
