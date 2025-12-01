// 函数: sub_c8d68
// 地址: 0xc8d68
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg2 + 1 u>= 0x10000000)
    sub_d14b4(arg1)
    noreturn

int32_t r7 = arg1[8]
int32_t r0_2
void* r4_1
int32_t r5_1
r0_2, r4_1, r5_1 = sub_d14cc(arg1, arg1[7], r7 << 4, arg2 << 4)
*(r4_1 + 0x1c) = r0_2

if (r7 s< arg2)
    int32_t i_3 = arg2 - r7
    int32_t* r2_2 = r0_2 + (r7 << 4) + 8
    int32_t i
    
    do
        *r2_2 = 0
        r2_2 = &r2_2[4]
        i = i_3
        i_3 -= 1
    while (i != 1)

int32_t* r2_3 = *(r4_1 + 0x38)
int32_t r1_2 = *(r4_1 + 8) - r5_1
*(r4_1 + 0x20) = arg2
*(r4_1 + 0x18) = r0_2 + (arg2 << 4) - 0x50
*(r4_1 + 8) = r0_2 + r1_2

if (r2_3 != 0)
    int32_t* i_4 = *r2_3
    r2_3[2] = r0_2 + r2_3[2] - r5_1
    
    if (i_4 != 0)
        int32_t* i_1
        
        do
            i_1 = *i_4
            i_4[2] = *(r4_1 + 0x1c) + i_4[2] - r5_1
            i_4 = i_1
        while (i_1 != 0)

int32_t* i_2

for (i_2 = *(r4_1 + 0x10); i_2 != 0; i_2 = i_2[2])
    int32_t r1_4 = *(r4_1 + 0x1c)
    int32_t r3_8 = r1_4 + i_2[1] - r5_1
    bool cond:3_1 = (zx.d(*(i_2 + 0x12)) & 1) != 0
    *i_2 = r1_4 + *i_2 - r5_1
    i_2[1] = r3_8
    
    if (cond:3_1)
        i_2[6] = r1_4 + i_2[6] - r5_1

return i_2
