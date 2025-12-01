// 函数: sub_c5020
// 地址: 0xc5020
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r4_1
int32_t* r5_1
int64_t* pc
r4_1, r5_1, pc = sub_c4c4c(arg1, arg2)
int32_t r7 = arg2[2]

if (*arg2 == 6 && (r7 & 0x100) == 0 && r7 s>= zx.d(*(r4_1 + 0x2e)))
    r4_1[0xc].b -= 1

uint32_t r1 = zx.d(r4_1[0xc].b)
*arg2 = 6
arg2[2] = r1
void* r0_5 = *r4_1
uint32_t r2_1 = zx.d(*(r0_5 + 0x4e))
int32_t r1_2 = zx.d(r4_1[0xc].b) + 2

if (r1_2 u> r2_1)
    if (r1_2 u>= 0xfa)
        int32_t* r0_12
        int32_t* r1_8
        int32_t r9
        r0_12, r1_8, r9 = sub_ce78c(r4_1[3], "function or expression too complex", pc, r2_1)
        
        if (r1_2 != 0xfa)
            return sub_c5104(r0_12, r1_8) __tailcall
        
        *pc
        jump(&data_c5108 - r9)
    
    *(r0_5 + 0x4e) = r1_2.b

r4_1[0xc].b = r1_2.b
arg2[2]
sub_c4d64(r4_1, r5_1)
sub_c4198(r4_1)
int32_t result = *r5_1

if (result == 6)
    result = r5_1[2]
    
    if ((result & 0x100) == 0)
        if (result s>= zx.d(*(r4_1 + 0x2e)))
            result = zx.d(r4_1[0xc].b) - 1
            r4_1[0xc].b = result.b

return result
