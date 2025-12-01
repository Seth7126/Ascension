// 函数: sub_c3ddc
// 地址: 0xc3ddc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0xffffffff)
    return 

int32_t i = *arg2

if (i == 0xffffffff)
    *arg2 = arg3
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
int32_t r2 = r3_1 + arg3
int32_t r3_2 = r2

if (r3_1 + arg3 s< 0)
    r3_2 = 0 - r2

if (r3_2 s>= &__elf_symbol_table[0xfe1])
    int32_t* r0_2
    int32_t r1_1
    int32_t r2_1
    int64_t* pc
    r0_2, r1_1, r2_1 = sub_ce78c(arg1[3], "control structure too long", pc, r2, r3_2)
    &__elf_symbol_table[0xfe1]
    return sub_c3e78(r0_2, r1_1, r2_1) __tailcall

*(r12_1 + (i_1 << 2)) = (lr_1 & 0x3fff) | (0x7fffc000 + (r2 << 0xe))
