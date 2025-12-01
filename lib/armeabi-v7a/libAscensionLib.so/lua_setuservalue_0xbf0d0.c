// 函数: lua_setuservalue
// 地址: 0xbf0d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r2 = *(arg1 + 0x10)
void* const r0

if (arg2 s>= 1)
    r0 = &data_1d13d0
    void* r1 = *r2 + (arg2 << 4)
    
    if (r1 u< *(arg1 + 8))
        r0 = r1
else if (arg2 s>= 0xfff0b9d9)
    r0 = *(arg1 + 8) + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r2_5 = *r2
    
    if (r2_5[2] != 0x16)
        void* r2_6 = *r2_5
        r0 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r2_6 + 6)))
            r0 = r2_6 + ((0xfff0b9d8 - arg2) << 4)
    else
        r0 = &data_1d13d0
else
    r0 = *(arg1 + 0xc) + 0x28

int32_t r1_1 = *(arg1 + 8)

if (*(r1_1 - 8) == 0)
    *(*r0 + 0xc) = 0
else
    *(*r0 + 0xc) = *(r1_1 - 0x10)
    void* r2_4 = *(*(arg1 + 8) - 0x10)
    
    if ((zx.d(*(r2_4 + 5)) & 3) != 0)
        void* r1_5 = *r0
        
        if ((zx.d(*(r1_5 + 5)) & 4) != 0)
            sub_cade0(arg1, r1_5, r2_4)

int32_t result = *(arg1 + 8) - 0x10
*(arg1 + 8) = result
return result
