// 函数: sub_c53f4
// 地址: 0xc53f4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r5 = arg1
sub_c471c(arg1, arg2)
int32_t r0 = *arg2

if (r0 == 1 || r0 == 3)
    goto label_c5418

int32_t r0_4

if (r0 == 0xa)
    r0_4 = arg2[2]
    
    if (r0_4 != 0xffffffff)
        goto label_c54dc
    
    goto label_c5418

int64_t* pc
r0_4, r5, pc = sub_c52dc(r5, arg2, 1)

if (r0_4 == 0xffffffff)
    goto label_c5418

label_c54dc:
int32_t i_1 = arg2[4]
int32_t r2_2
int32_t r3_3
bool cond:3_1

if (i_1 == 0xffffffff)
    arg2[4] = r0_4
label_c5418:
    int32_t r1 = arg2[5]
    r5[6] = r5[5]
    
    if (r1 == 0xffffffff)
        arg2[5] = 0xffffffff
        return 0xffffffff
    
    int32_t i = r5[7]
    
    if (i == 0xffffffff)
        r5[7] = r1
        arg2[5] = 0xffffffff
        return 0xffffffff
    
    int32_t r0_3 = *(*r5 + 0xc)
    int32_t i_2
    
    do
        r3_3 = *(r0_3 + (i << 2))
        i_2 = i
        i = 0xfffe0001 + (r3_3 u>> 0xe)
        
        if (i != 0xffffffff)
            i = i_2 + i + 1
    while (i != 0xffffffff)
    
    int32_t r2_1 = not.d(i_2)
    int32_t r1_1 = r1 + r2_1
    r2_2 = r1_1
    
    if (r1 + r2_1 s< 0)
        r2_2 = 0 - r1_1
    
    cond:3_1 = r2_2 == &__elf_symbol_table[0xfe1]
    
    if (r2_2 s< &__elf_symbol_table[0xfe1])
        *(r0_3 + (i_2 << 2)) = (0x7fffc000 + (r1_1 << 0xe)) | (r3_3 & 0x3fff)
        arg2[5] = 0xffffffff
        return 0xffffffff
else
    int32_t r1_6 = *(*r5 + 0xc)
    int32_t i_3
    
    do
        r3_3 = *(r1_6 + (i_1 << 2))
        i_3 = i_1
        i_1 = 0xfffe0001 + (r3_3 u>> 0xe)
        
        if (i_1 != 0xffffffff)
            i_1 = i_3 + i_1 + 1
    while (i_1 != 0xffffffff)
    
    int32_t r2_3 = not.d(i_3)
    int32_t r0_6 = r0_4 + r2_3
    r2_2 = r0_6
    
    if (r0_4 + r2_3 s< 0)
        r2_2 = 0 - r0_6
    
    cond:3_1 = r2_2 == &__elf_symbol_table[0xfe1]
    
    if (r2_2 s< &__elf_symbol_table[0xfe1])
        *(r1_6 + (i_3 << 2)) = (0x7fffc000 + (r0_6 << 0xe)) | (r3_3 & 0x3fff)
        goto label_c5418

int32_t* r0_10
int32_t* r1_7
int32_t* r2_4
r0_10, r1_7, r2_4 = sub_ce78c(r5[3], "control structure too long", pc, r2_2, r3_3)
int32_t __saved_r4

if (cond:3_1)
    jump(arg2 * &__saved_r4)
return sub_c5568(r0_10, r1_7, r2_4) __tailcall
