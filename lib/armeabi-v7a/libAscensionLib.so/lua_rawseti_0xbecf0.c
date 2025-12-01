// 函数: lua_rawseti
// 地址: 0xbecf0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = arg1[4]
void* const r5

if (arg2 s>= 1)
    r5 = &data_1d13d0
    void* r0_2 = *r0 + (arg2 << 4)
    
    if (r0_2 u< arg1[2])
        r5 = r0_2
else if (arg2 s>= 0xfff0b9d9)
    r5 = arg1[2] + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r0_10 = *r0
    
    if (r0_10[2] != 0x16)
        void* r0_11 = *r0_10
        r5 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r0_11 + 6)))
            r5 = r0_11 + ((0xfff0b9d8 - arg2) << 4)
    else
        r5 = &data_1d13d0
else
    r5 = arg1[3] + 0x28

int32_t r10
int128_t q4
sub_dadf8(arg1, *r5, arg3, arg1[2] - 0x10, r10, q4)
int32_t r0_7 = arg1[2]

if ((zx.d(*(r0_7 - 8)) & 0x40) != 0 && (zx.d(*(*(r0_7 - 0x10) + 5)) & 3) != 0)
    void* r1_4 = *r5
    
    if ((zx.d(*(r1_4 + 5)) & 4) != 0)
        sub_cafb8(arg1, r1_4)
        r0_7 = arg1[2]

arg1[2] = r0_7 - 0x10
return r0_7 - 0x10
