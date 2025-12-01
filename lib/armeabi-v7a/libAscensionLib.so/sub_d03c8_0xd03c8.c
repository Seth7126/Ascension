// 函数: sub_d03c8
// 地址: 0xd03c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t* r4 = arg1
int32_t r5 = *arg1
int32_t* r0 = arg1[0xe]
int32_t r1 = *r0
*r0 = r1 - 1
uint32_t r0_1

if (r1 == 0)
    r0_1 = sub_e0ffc(r0)
else
    char* r1_1 = r0[1]
    r0[1] = &r1_1[1]
    r0_1 = zx.d(*r1_1)

*r4 = r0_1

if ((r0_1 == 0xd || r0_1 == 0xa) && r0_1 != r5)
    int32_t* r0_2 = r4[0xe]
    int32_t r1_2 = *r0_2
    *r0_2 = r1_2 - 1
    uint32_t r0_3
    
    if (r1_2 == 0)
        r0_3 = sub_e0ffc(r0_2)
    else
        char* r1_3 = r0_2[1]
        r0_2[1] = &r1_3[1]
        r0_3 = zx.d(*r1_3)
    
    *r4 = r0_3

int32_t result = r4[1]
r4[1] = result + 1

if (result s< 0x7ffffffc)
    return result

int64_t* pc
int32_t* r0_5 = sub_ce78c(r4, "chunk has too many lines", pc)

if (result == 0x7ffffffc)
    r0_5 = &data_d0480 & arg2 s>> 0xc

return sub_d047c(r0_5) __tailcall
