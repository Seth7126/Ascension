// 函数: _Z15FormatTimeWordsPcjjbPPKc
// 地址: 0xb9d80
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char const** r0 = &data_1d71b4

if (arg5 != 0)
    r0 = arg5

int32_t r3_1

if (arg3 u> &__elf_symbol_table[0x4f8].st_shndx:1)
    arg4 = arg3.b + 0x80
    
    if (arg4 u< &__elf_symbol_table[0x4f9])
        sprintf(arg1, "1 %s", r0[0xa], arg4)
        return arg1
    
    r3_1 = r0[0xb]
    arg3 u/= 0x15180
else
    int32_t r2_1
    
    if (arg3 u>= 0xe10)
        if ((arg3 - 0xe10) u>> 4 u<= 0xe0)
            r2_1 = 0x18
            
            if (arg4 != 0)
                r2_1 = 0x20
            
            goto label_b9e4c
        
        int32_t r2_3 = 0x1c
        
        if (arg4 != 0)
            r2_3 = 0x24
        
        r3_1 = *(r0 + r2_3)
        arg3 u/= 0xe10
    else if (arg3 u< 0x3c)
        if (arg3 == 1)
            if (arg4 != 0)
                r0 = &r0[2]
            
            sprintf(arg1, "1 %s", *r0, arg4)
            return arg1
        
        int32_t r12_3 = 4
        
        if (arg4 != 0)
            r12_3 = 8
        
        r3_1 = *(r0 + r12_3)
    else
        if (arg3 - 0x3c u<= 0x3b)
            r2_1 = 0xc
            
            if (arg4 != 0)
                r2_1 = 0x14
            
        label_b9e4c:
            sprintf(arg1, "1 %s", *(r0 + r2_1), arg4)
            return arg1
        
        int32_t r2_4 = 0x10
        
        if (arg4 != 0)
            r2_4 = 0x14
        
        r3_1 = *(r0 + r2_4)
        arg3 = (arg3 & 0xffff) u/ 0x3c

sprintf(arg1, "%d %s", arg3, r3_1)
return arg1
