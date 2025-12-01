// 函数: lua_rawsetp
// 地址: 0xbedfc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t* r0_1 = arg1[4]
void* const r6

if (arg2 s>= 1)
    r6 = &data_1d13d0
    void* r0_3 = *r0_1 + (arg2 << 4)
    
    if (r0_3 u< arg1[2])
        r6 = r0_3
else if (arg2 s>= 0xfff0b9d9)
    r6 = arg1[2] + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r0_13 = *r0_1
    
    if (r0_13[2] != 0x16)
        void* r0_14 = *r0_13
        r6 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r0_14 + 6)))
            r6 = r0_14 + ((0xfff0b9d8 - arg2) << 4)
    else
        r6 = &data_1d13d0
else
    r6 = arg1[3] + 0x28

int32_t var_28 = 2
int32_t var_30 = arg3
int32_t r7 = arg1[2]
int32_t __saved_r11
int32_t r10
int32_t* r0_7 = sub_daf38(arg1, *r6, &var_30, arg1, __stack_chk_guard, r6, r10, &__saved_r11)
int32_t r2_1 = *(r7 - 0xc)
*r0_7 = *(r7 - 0x10)
r0_7[1] = r2_1
r0_7[2] = *(r7 - 8)
int32_t r0_8 = arg1[2]

if ((zx.d(*(r0_8 - 8)) & 0x40) != 0 && (zx.d(*(*(r0_8 - 0x10) + 5)) & 3) != 0)
    void* r1_6 = *r6
    
    if ((zx.d(*(r1_6 + 5)) & 4) != 0)
        sub_cafb8(arg1, r1_6)
        r0_8 = arg1[2]

arg1[2] = r0_8 - 0x10
int32_t r0_10 = *__stack_chk_guard

if (r0_10 == r0)
    return r0_10 - r0

__stack_chk_fail()
noreturn
