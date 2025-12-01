// 函数: sub_d3ad4
// 地址: 0xd3ad4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* result = sub_caa04(arg1, 1)
void** r0_2 = arg1[2]
r0_2[2] = 0x46
*r0_2 = result
int32_t r1 = arg1[6]
int32_t r0_4 = arg1[2] + 0x10
arg1[2] = r0_4

if (r1 - r0_4 s<= 0xf)
    sub_c8e8c(arg1, 0)

void* r0_8
int32_t r9_1
r0_8, r9_1 = sub_cac44(arg1)
*(result + 0xc) = r0_8
void* var_d4 = r0_8
int32_t r0_10 = sub_d807c(arg1, arg5)
*(r0_8 + 0x24) = r0_10
int32_t var_64 = arg3
*(arg4 + 0x10) = 0
*(arg4 + 0x1c) = 0
*(arg4 + 4) = 0
void var_a0
sub_ce9f0(arg1, &var_a0, r9_1, r0_10, arg6)
char var_a4 = 0
int24_t var_a8 = 0
void* var_c8 = &var_a0
int32_t var_c0 = 0
int32_t var_bc = 0
int32_t var_b8 = 0xffffffff
int32_t var_b4 = 0
int32_t var_b0 = 0
int32_t var_70
int32_t var_cc = var_70
void** var_70_1 = &var_d4
int32_t var_ac = *(arg4 + 4)
int32_t var_c4 = 0
*(r0_8 + 0x4e) = 2
int32_t var_5c
*(r0_8 + 0x24) = var_5c
int32_t* var_6c
void* r0_17 = sub_dafac(var_6c)
void* var_d0 = r0_17
void** r1_4 = var_6c[2]
r1_4[2] = 0x45
*r1_4 = r0_17
int32_t r1_5 = var_6c[6]
int32_t r0_19 = var_6c[2] + 0x10
var_6c[2] = r0_19

if (r1_5 - r0_19 s<= 0xf)
    sub_c8e8c(var_6c, 0)

char var_2a = 0
char var_2c = var_a8:2.b
void* r1_7 = *(var_c8 + 0x40)
void* r0_22 = var_d4
int16_t var_30 = (*(r1_7 + 0x1c)).w
int16_t r1_8 = (*(r1_7 + 0x10)).w
int32_t var_34 = var_c4
char var_2b = 0
int32_t* var_c4_1 = &var_34
int16_t var_2e = r1_8
*(r0_22 + 0x4d) = 1
int32_t var_3c = 0xffffffff
int32_t var_40 = 0xffffffff
int32_t var_50 = 7
int32_t var_48 = 0
void* var_58
sub_d3d40(&var_d4, var_58, &var_50)
sub_cea80(&var_a0)
int32_t* r6_1

while (true)
    int32_t* var_90
    r6_1 = var_90
    
    if (r6_1 - 0x104 u<= 0x1a && (0x4020007 & 1 << ((r6_1 - 0x104) & 0xff)) != 0)
        break
    
    sub_d4098(&var_a0, 0x4020007, r6_1, 0x112)
    
    if (r6_1 == 0x112)
        r6_1 = var_90
        break

void* r0_27 = &var_a0

if (r6_1 != 0x11e)
    int32_t* r0_31
    void* r1_11
    int32_t* r2_3
    r0_31, r1_11, r2_3 = sub_d6ecc(r0_27, 0x11e)
    
    if (r6_1 == 0x11e && (r0_31 & r0_31 << 0x12) == 0)
        *r0_31
        r0_31 -= 1
    
    return sub_d3d40(r0_31, r1_11, r2_3) __tailcall

sub_d3e50(r0_27)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
