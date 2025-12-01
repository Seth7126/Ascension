// 函数: sub_c3e9c
// 地址: 0xc3e9c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg1[5] != arg3)
    sub_c4008(arg1, arg2, arg3, 0xff, arg3)
    return 

arg1[6] = arg3

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

if (r3_2 s< &__elf_symbol_table[0xfe1])
    *(r12_1 + (i_1 << 2)) = (0x7fffc000 + (r1 << 0xe)) | (lr_1 & 0x3fff)
    return 

int64_t* pc
arg1, arg2, arg3 = sub_ce78c(arg1[3], "control structure too long", pc)
sub_c4008(arg1, arg2, arg3, 0xff, arg3)
