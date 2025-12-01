// 函数: sub_dad30
// 地址: 0xdad30
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r4 = arg2
void* const r0_3
char r5_1
int32_t r7

if (arg3 == 0)
    r5_1 = 0
    r7 = 0
    r0_3 = &data_1d1540
    *(r4 + 0x10) = &data_1d1540
else
    int32_t r0_1
    int32_t r2
    r0_1, r2 = sub_d2814(arg3)
    
    if (r0_1 s>= 0x1f)
        sub_c89f0(arg1, "table overflow", r2)
        noreturn
    
    if (1 + (1 << (r0_1 & 0xff)) u>= 0x8000000)
        sub_d14b4(arg1)
        noreturn
    
    r7 = 1 << r0_1
    r0_3, r4, r5_1 = sub_d14cc(arg1, 0, 0, r7 << 5)
    int32_t r1_1 = 0
    *(r4 + 0x10) = r0_3
    
    do
        void* r0_4 = r0_3 + (r1_1 << 5)
        r1_1 += 1
        *(r0_4 + 0x18) = 0
        *(r0_4 + 0x1c) = 0
        *(r0_4 + 8) = 0
        r0_3 = *(r4 + 0x10)
    while (r1_1 s< r7)

void* result = r0_3 + (r7 << 5)
*(r4 + 0x14) = result
*(r4 + 7) = r5_1
return result
