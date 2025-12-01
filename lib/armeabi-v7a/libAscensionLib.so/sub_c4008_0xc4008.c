// 函数: sub_c4008
// 地址: 0xc4008
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r11
int32_t var_8 = r11
int32_t* r11_1 = &var_8

if (arg2 != 0xffffffff)
    int32_t i_1 = arg2
    int32_t r9_1 = 0xfffe0001
    int32_t i
    
    do
        i = r9_1 + (*(*(*arg1 + 0xc) + (i_1 << 2)) u>> 0xe)
        
        if (i != 0xffffffff)
            i = i_1 + i + 1
        
        if (sub_c60dc(arg1, i_1, arg4) == 0)
            int32_t r2_2 = r11_1[2]
            int32_t r1_2 = not.d(i_1)
            int32_t r1_3 = r1_2 + r2_2
            int32_t r2_3 = r1_3
            int32_t r0_8 = *(*arg1 + 0xc)
            
            if (r1_2 + r2_2 s< 0)
                r2_3 = 0 - r1_3
            
            if (r2_3 s>= &__elf_symbol_table[0xfe1])
                int32_t* r0_10
                int32_t r1_6
                int32_t r2_6
                int32_t r12
                int64_t* pc
                r0_10, r1_6, r2_6, r12 = sub_ce78c(arg1[3], "control structure too long", pc, r2_3)
                &__elf_symbol_table[0xfe1]
                return sub_c40e4(r0_10, r1_6, r2_6) __tailcall
            
            *(r0_8 + (i_1 << 2)) = (*(r0_8 + (i_1 << 2)) & 0x3fff) | (0x7fffc000 + (r1_3 << 0xe))
        else
            r9_1, r11_1 = sub_c4140(arg1, i_1, arg3, i_1)
        
        i_1 = i
    while (i != 0xffffffff)

*(r11_1 - 0x1c)
*(r11_1 - 0x18)
*(r11_1 - 0x14)
*(r11_1 - 0x10)
*(r11_1 - 0xc)
*(r11_1 - 8)
*(r11_1 - 4)
*r11_1
jump(r11_1[1])
