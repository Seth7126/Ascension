// 函数: sub_c3d14
// 地址: 0xc3d14
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r8 = arg1[7]
arg1[7] = 0xffffffff
int32_t i_1 = sub_c4198(arg1)

if (r8 != 0xffffffff)
    if (i_1 == 0xffffffff)
        return r8
    
    int32_t i = i_1
    int32_t r1_2 = *(*arg1 + 0xc)
    int32_t r3_1
    int32_t i_2
    
    do
        r3_1 = *(r1_2 + (i << 2))
        i_2 = i
        i = 0xfffe0001 + (r3_1 u>> 0xe)
        
        if (i != 0xffffffff)
            i = i_2 + i + 1
    while (i != 0xffffffff)
    
    int32_t r2_1 = not.d(i_2)
    int32_t r2_2 = r8 + r2_1
    int32_t r7_2 = r2_2
    
    if (r8 + r2_1 s< 0)
        r7_2 = 0 - r2_2
    
    if (r7_2 s>= &__elf_symbol_table[0xfe1])
        int32_t* r0_3
        int32_t r1_3
        int32_t r2_5
        int32_t r3_3
        int64_t* pc
        r0_3, r1_3, r2_5, r3_3 = sub_ce78c(arg1[3], "control structure too long", pc, r2_2)
        &__elf_symbol_table[0xfe1]
        return sub_c3dd0(r0_3, r1_3, r2_5, r3_3) __tailcall
    
    *(r1_2 + (i_2 << 2)) = (0x7fffc000 + (r2_2 << 0xe)) | (r3_1 & 0x3fff)

return i_1
