// 函数: sub_c4140
// 地址: 0xc4140
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr = not.d(arg2)
int32_t r2 = lr + arg3
int32_t r12 = *(*arg1 + 0xc)
int32_t r3_1 = r2

if (lr + arg3 s< 0)
    r3_1 = 0 - r2

if (r3_1 s< &__elf_symbol_table[0xfe1])
    int32_t result = (*(r12 + (arg2 << 2)) & 0x3fff) | (0x7fffc000 + (r2 << 0xe))
    *(r12 + (arg2 << 2)) = result
    return result

int64_t* pc
int32_t* r0_3 = sub_ce78c(arg1[3], "control structure too long", pc, r2, r3_1)
&__elf_symbol_table[0xfe1]
return sub_c4198(r0_3) __tailcall
