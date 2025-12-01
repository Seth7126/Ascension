// 函数: sub_c3f64
// 地址: 0xc3f64
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

arg1[6] = arg1[5]

if (arg2 == 0xffffffff)
    return 

int32_t i = arg1[7]

if (i == 0xffffffff)
    arg1[7] = arg2
    return 

int32_t r12_1 = *(*arg1 + 0xc)
int32_t i_1
int32_t lr_1

do
    lr_1 = *(r12_1 + (i << 2))
    i_1 = i
    i = 0xfffe0001 + (lr_1 u>> 0xe)
    
    if (i != 0xffffffff)
        i = i_1 + i + 1
while (i != 0xffffffff)

int32_t r3_1 = not.d(i_1)
int32_t r1 = r3_1 + arg2
int32_t r3_2 = r1

if (r3_1 + arg2 s< 0)
    r3_2 = 0 - r1

if (r3_2 s>= &__elf_symbol_table[0xfe1])
    int32_t* r0_2
    int32_t r1_1
    int32_t r2_2
    int32_t r3_3
    int32_t r12_2
    r0_2, r1_1, r2_2, r3_3, r12_2 = sub_ce78c(arg1[3], "control structure too long", arg4)
    
    if (r3_2 != &__elf_symbol_table[0xfe1])
        return sub_c4008(r0_2, r1_1, r2_2, r3_3) __tailcall
    
    int32_t __saved_r4
    *arg4 = (&__saved_r4):r12_2
    jump(&data_c400c - arg3)

*(r12_1 + (i_1 << 2)) = (0x7fffc000 + (r1 << 0xe)) | (lr_1 & 0x3fff)
