// 函数: sub_d510c
// 地址: 0xd510c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

arg1[1]
int32_t r5 = arg1[4]
int32_t r9_1 = sub_cea80(arg1)
int32_t r6

if (r5 != 0x10a)
    r6 = sub_d807c(arg1[0xd], "break")
else
    if (arg1[4] != 0x120)
        int32_t* r0_12
        int32_t* r1_4
        int32_t r9_2
        r0_12, r1_4, r9_2 = sub_d6ecc(arg1, 0x120)
        return sub_d51fc(r0_12, r1_4) __tailcall
    
    r6 = arg1[6]
    r9_1 = sub_cea80(arg1)

void* r5_1 = arg1[0x10]
int32_t r7 = *(r5_1 + 0x10)
int32_t r0_5
int32_t r1

if (r7 s>= *(r5_1 + 0x14))
    char const* const var_24_1 = "labels/gotos"
    r0_5 = sub_d1388(arg1[0xd], *(r5_1 + 0xc), r5_1 + 0x14, 0x10, 0x7fff)
    r1 = *(r5_1 + 0x10)
    *(r5_1 + 0xc) = r0_5
else
    r0_5 = *(r5_1 + 0xc)
    r1 = r7

int32_t* r0_7 = r0_5 + (r7 << 4)
*r0_7 = r6
r0_7[2] = r9_1
char r2_3 = *(arg1[0xc] + 0x2e)
r0_7[1] = arg2
r0_7[3].b = r2_3
*(r5_1 + 0x10) = r1 + 1
return sub_d6df4(arg1, r7) __tailcall
