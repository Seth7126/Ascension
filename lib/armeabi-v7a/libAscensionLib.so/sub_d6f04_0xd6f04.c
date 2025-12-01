// 函数: sub_d6f04
// 地址: 0xd6f04
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t i_3 = arg4
int32_t r5 = arg2
int32_t var_28 = *__stack_chk_guard
int32_t* r10 = arg1[0xc]
void* r2 = r10[3]
void* r1 = *r10
char r0_2 = *(r10 + 0x2e) + 3
int32_t r3 = r10[5]
int32_t r7 = r10[0xa]
*(r10 + 0x2e) = r0_2
int32_t r1_1 = *(r1 + 0x18)
int32_t r0_4 = **(r2 + 0x40) + ((r7 + zx.d(r0_2)) << 1)
*(r1_1 + sx.d(*(r0_4 - 6)) * 0xc + 4) = r3
*(r1_1 + sx.d(*(r0_4 - 4)) * 0xc + 4) = r3
*(r1_1 + sx.d(*(r0_4 - 2)) * 0xc + 4) = r3
int32_t r0_8 = arg1[4]

if (r0_8 != 0x103)
    void* r0_42
    int32_t r1_14
    int32_t r2_18
    int32_t* r3_2
    int32_t r4_2
    r0_42, r1_14, r2_18, r3_2, r4_2 = sub_d6ecc(arg1, 0x103)
    
    if (r0_8 == 0x103)
        unimplemented  {and.seq r7, r0, r4, ror  #0x5}
    
    return sub_d71e4(r0_42, r1_14, r2_18, r3_2) __tailcall

sub_cea80(arg1)
int32_t r0_11

if (arg5 == 0)
    r0_11, i_3, r5 = sub_c3d14(r10)
else
    r0_11 = sub_c3dd0(r10, 0x21, r5, &__elf_symbol_table[0xfe0].st_shndx)

char var_36 = 0
char var_38 = *(r10 + 0x2e)
void* r0_14 = *(r10[3] + 0x40)
int16_t var_3c = (*(r0_14 + 0x1c)).w
char var_37 = 0
int16_t var_3a = (*(r0_14 + 0x10)).w
int32_t var_40 = r10[4]
r10[4] = &var_40
int32_t* r1_3 = arg1[0xc]
char r2_10 = *(r1_3 + 0x2e) + i_3.b
*(r1_3 + 0x2e) = r2_10

if (i_3 != 0)
    int32_t r0_18 = r1_3[5]
    int32_t r1_6 = *(*r1_3 + 0x18)
    int32_t i_2 = i_3
    int16_t* r2_12 = **(r1_3[3] + 0x40) + ((r1_3[0xa] + zx.d(r2_10) - i_3) << 1)
    int32_t i
    
    do
        int32_t r7_5 = sx.d(*r2_12)
        r2_12 = &r2_12[1]
        i = i_2
        i_2 -= 1
        *(r1_6 + r7_5 * 0xc + 4) = r0_18
    while (i != 1)

char r9 = sub_c4328(r10, i_3)
int32_t* r8_1 = arg1[0xc]
char var_2a = r9
char var_2c = *(r8_1 + 0x2e)
void* r0_22 = *(r8_1[3] + 0x40)
int16_t var_30 = (*(r0_22 + 0x1c)).w
char var_2b = r9
int32_t r9_1 = 0x4020007
int16_t var_2e = (*(r0_22 + 0x10)).w
int32_t var_34 = r8_1[4]
r8_1[4] = &var_34
void* i_1

do
    i_1 = arg1[4]
    
    if (i_1 - 0x104 u<= 0x1a && (r9_1 & 1 << ((i_1 - 0x104) & 0xff)) != 0)
        break
    
    r9_1 = sub_d4098(arg1, 1, arg1, i_1)
while (i_1 != 0x112)
sub_d541c(r8_1)
void* r11 = sub_c3f64(r10, r0_11, r8_1, sub_d541c(r10))
int32_t r1_10
int32_t r4

if (*(r11 + 8) == 0)
    sub_c3d00(r10, 0x22, r5, 0, i_3)
    r4 = arg3
    sub_c604c(r10, r4)
    r1_10 = sub_c3dd0(r10, 0x23, r5 + 2, &__elf_symbol_table[0xfe0].st_shndx)
else
    r1_10 = sub_c3dd0(r10, 0x20, r5, &__elf_symbol_table[0xfe0].st_shndx)
    r4 = arg3

sub_c3e9c(r10, r1_10, r0_11 + 1)
sub_c604c(r10, r4)

if (*__stack_chk_guard != *(r11 - 0x20))
    __stack_chk_fail()
    noreturn

*(r11 - 0x1c)
*(r11 - 0x18)
*(r11 - 0x14)
*(r11 - 0x10)
*(r11 - 0xc)
*(r11 - 8)
*(r11 - 4)
*r11
jump(*(r11 + 4))
