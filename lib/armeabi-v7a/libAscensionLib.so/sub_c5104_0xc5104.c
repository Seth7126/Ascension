// 函数: sub_c5104
// 地址: 0xc5104
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r5 = arg1
sub_c471c(arg1, arg2)
int32_t r0 = *arg2

if (r0 - 4 u< 2 || r0 == 2)
    goto label_c5230

int32_t r0_6

if (r0 == 0xa)
    int32_t r1_1 = arg2[2]
    int32_t* r0_3 = *(*r5 + 0xc) + (r1_1 << 2)
    int32_t* r1_3
    int32_t r2_1
    
    if (r1_1 s>= 1)
        r1_3 = r0_3 - 4
        r2_1 = *r1_3
    
    if (r1_1 s< 1 || sx.d((*"`qATPP\l<")[r2_1 & 0x3f]) s>= 0)
        r2_1 = *r0_3
        r1_3 = r0_3
    
    int32_t temp0_1 = 0
    uint32_t i = r2_1 & 0x3fc0
    
    while (i != 0)
        i u>>= 1
        temp0_1 += 1
    
    *r1_3 = (r2_1 & 0xffffc03f) | (0x20 - temp0_1) u>> 5 << 6
    r0_6 = arg2[2]
    
    if (r0_6 != 0xffffffff)
        goto label_c51bc
    
    goto label_c5230

int64_t* pc
r0_6, r5, pc = sub_c52dc(r5, arg2, 0)

if (r0_6 == 0xffffffff)
    goto label_c5230

label_c51bc:
int32_t i_2 = arg2[5]
int32_t r2_6
int32_t r3_5

if (i_2 == 0xffffffff)
    arg2[5] = r0_6
label_c5230:
    int32_t r1_7 = arg2[4]
    r5[6] = r5[5]
    
    if (r1_7 == 0xffffffff)
        arg2[4] = 0xffffffff
        return 0xffffffff
    
    int32_t i_1 = r5[7]
    
    if (i_1 == 0xffffffff)
        r5[7] = r1_7
        arg2[4] = 0xffffffff
        return 0xffffffff
    
    int32_t r0_13 = *(*r5 + 0xc)
    int32_t i_4
    
    do
        r3_5 = *(r0_13 + (i_1 << 2))
        i_4 = i_1
        i_1 = 0xfffe0001 + (r3_5 u>> 0xe)
        
        if (i_1 != 0xffffffff)
            i_1 = i_4 + i_1 + 1
    while (i_1 != 0xffffffff)
    
    int32_t r2_7 = not.d(i_4)
    int32_t r1_8 = r1_7 + r2_7
    r2_6 = r1_8
    
    if (r1_7 + r2_7 s< 0)
        r2_6 = 0 - r1_8
    
    &__elf_symbol_table[0xfe1]
    
    if (r2_6 s< &__elf_symbol_table[0xfe1])
        *(r0_13 + (i_4 << 2)) = (0x7fffc000 + (r1_8 << 0xe)) | (r3_5 & 0x3fff)
        arg2[4] = 0xffffffff
        return 0xffffffff
else
    int32_t r1_6 = *(*r5 + 0xc)
    int32_t i_3
    
    do
        r3_5 = *(r1_6 + (i_2 << 2))
        i_3 = i_2
        i_2 = 0xfffe0001 + (r3_5 u>> 0xe)
        
        if (i_2 != 0xffffffff)
            i_2 = i_3 + i_2 + 1
    while (i_2 != 0xffffffff)
    
    int32_t r2_5 = not.d(i_3)
    int32_t r0_8 = r0_6 + r2_5
    r2_6 = r0_8
    
    if (r0_6 + r2_5 s< 0)
        r2_6 = 0 - r0_8
    
    &__elf_symbol_table[0xfe1]
    
    if (r2_6 s< &__elf_symbol_table[0xfe1])
        *(r1_6 + (i_3 << 2)) = (0x7fffc000 + (r0_8 << 0xe)) | (r3_5 & 0x3fff)
        goto label_c5230

int32_t* r0_15
int32_t* r1_11
uint32_t r2_8
char r3_6
int32_t r12
r0_15, r1_11, r2_8, r3_6, r12 = sub_ce78c(r5[3], "control structure too long", pc, r2_6, r3_5)
return sub_c52dc(r0_15, r1_11, r2_8) __tailcall
