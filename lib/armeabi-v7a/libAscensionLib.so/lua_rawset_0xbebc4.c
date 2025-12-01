// 函数: lua_rawset
// 地址: 0xbebc4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r10
int32_t var_c = r10
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
    int32_t* r0_11 = *r0
    
    if (r0_11[2] != 0x16)
        void* r0_12 = *r0_11
        r5 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r0_12 + 6)))
            r5 = r0_12 + ((0xfff0b9d8 - arg2) << 4)
    else
        r5 = &data_1d13d0
else
    r5 = arg1[3] + 0x28

int32_t r6 = arg1[2]
int32_t __saved_r11
int32_t* r0_6 = sub_daf38(arg1, *r5, r6 - 0x20, arg1, r5, r6, r10, &__saved_r11)
int32_t r2_3 = *(r6 - 0xc)
*r0_6 = *(r6 - 0x10)
r0_6[1] = r2_3
r0_6[2] = *(r6 - 8)
*(*r5 + 6) = 0
int32_t r0_8 = arg1[2]

if ((zx.d(*(r0_8 - 8)) & 0x40) != 0 && (zx.d(*(*(r0_8 - 0x10) + 5)) & 3) != 0)
    void* r1_6 = *r5
    
    if ((zx.d(*(r1_6 + 5)) & 4) != 0)
        sub_cafb8(arg1, r1_6)
        r0_8 = arg1[2]

arg1[2] = r0_8 - 0x20
return r0_8 - 0x20
