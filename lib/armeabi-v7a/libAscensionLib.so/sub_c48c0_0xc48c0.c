// 函数: sub_c48c0
// 地址: 0xc48c0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r4 = arg2
int32_t* r9 = arg1
sub_c6170(arg1, arg2, arg3)
int32_t r12 = *r4
int32_t i_4
int32_t r2
int32_t i_5
bool cond:3_1

if (r12 != 0xa)
    i_4 = r4[4]
else
    i_4 = r4[2]
    
    if (i_4 == 0xffffffff)
        i_4 = r4[4]
    else
        int32_t i = r4[4]
        
        if (i == 0xffffffff)
            r4[4] = i_4
        else
            int32_t r1_1 = *(*r9 + 0xc)
            int32_t r7_1
            
            do
                r7_1 = *(r1_1 + (i << 2))
                i_5 = i
                i = 0xfffe0001 + (r7_1 u>> 0xe)
                
                if (i != 0xffffffff)
                    i = i_5 + i + 1
            while (i != 0xffffffff)
            
            int32_t r0 = not.d(i_5)
            int32_t r0_1 = i_4 + r0
            r2 = r0_1
            
            if (i_4 + r0 s< 0)
                r2 = 0 - r0_1
            
            cond:3_1 = r2 == &__elf_symbol_table[0xfe1]
            
            if (r2 s>= &__elf_symbol_table[0xfe1])
            label_c4c3c:
                int32_t* r0_22
                int32_t* r1_10
                int32_t r12_2
                r0_22, r1_10, r12_2 = sub_ce78c(r9[3], "control structure too long", arg4, r2, i_5)
                
                if (cond:3_1 && (r0_22 & r12_2 s>> 0x16) == 0)
                    *r0_22
                    r0_22 -= arg3
                    int32_t __saved_r11
                    *arg4 = &__saved_r11
                
                return sub_c4c4c(r0_22, r1_10) __tailcall
            
            *(r1_1 + (i_5 << 2)) = (0x7fffc000 + (r0_1 << 0xe)) | (r7_1 & 0x3fff)
            i_4 = r4[4]

int32_t i_3 = r4[5]

if (i_4 != i_3)
    int32_t r10_1
    
    if (i_4 != 0xffffffff)
        int32_t i_1
        
        do
            int32_t* r0_5 = *(*r9 + 0xc) + (i_4 << 2)
            int32_t r6_2
            
            if (i_4 s< 1)
                r6_2 = *r0_5
            else
                r6_2 = *(r0_5 - 4)
                
                if (sx.d((*"`qATPP\l<")[r6_2 & 0x3f]) s>= 0)
                    r6_2 = *r0_5
            
            if ((r6_2 & 0x3f) != 0x1c)
            label_c4a68:
                int32_t j_4 = 0xffffffff
                
                if (r12 != 0xa)
                    int32_t j_6 = r9[7]
                    r9[7] = 0xffffffff
                    int32_t j_5
                    j_5, r9 = sub_c4198(r9)
                    j_4 = j_5
                    
                    if (j_6 != 0xffffffff)
                        if (j_4 == 0xffffffff)
                            j_4 = j_6
                        else
                            int32_t j = j_4
                            int32_t r0_12 = *(*r9 + 0xc)
                            int32_t j_2
                            
                            do
                                r2 = *(r0_12 + (j << 2))
                                j_2 = j
                                j = 0xfffe0001 + (r2 u>> 0xe)
                                
                                if (j != 0xffffffff)
                                    j = j_2 + j + 1
                            while (j != 0xffffffff)
                            
                            int32_t r3_2 = not.d(j_2)
                            i_5 = j_6 + r3_2
                            int32_t i_6 = i_5
                            
                            if (j_6 + r3_2 s< 0)
                                i_6 = 0 - i_5
                            
                            cond:3_1 = i_6 == &__elf_symbol_table[0xfe1]
                            
                            if (i_6 s>= &__elf_symbol_table[0xfe1])
                                goto label_c4c3c
                            
                            *(r0_12 + (j_2 << 2)) = (0x7fffc000 + (i_5 << 0xe)) | (r2 & 0x3fff)
                
                r9[6] = r9[5]
                int32_t r0_15
                int32_t* r9_1
                r0_15, r9_1 = sub_c4198(r9)
                r10_1 = r0_15
                r9_1[6] = r9_1[5]
                int32_t r0_18
                r0_18, r9 = sub_c4198(r9_1)
                r9[6] = r9[5]
                
                if (j_4 == 0xffffffff)
                    goto label_c4bd8
                
                int32_t j_1 = r9[7]
                
                if (j_1 == 0xffffffff)
                    r9[7] = j_4
                    goto label_c4bd8
                
                int32_t r6_5 = *(*r9 + 0xc)
                int32_t j_3
                
                do
                    r2 = *(r6_5 + (j_1 << 2))
                    j_3 = j_1
                    j_1 = 0xfffe0001 + (r2 u>> 0xe)
                    
                    if (j_1 != 0xffffffff)
                        j_1 = j_3 + j_1 + 1
                while (j_1 != 0xffffffff)
                
                int32_t r3_4 = not.d(j_3)
                i_5 = j_4 + r3_4
                int32_t i_7 = i_5
                
                if (j_4 + r3_4 s< 0)
                    i_7 = 0 - i_5
                
                cond:3_1 = i_7 == &__elf_symbol_table[0xfe1]
                
                if (i_7 s>= &__elf_symbol_table[0xfe1])
                    goto label_c4c3c
                
                *(r6_5 + (j_3 << 2)) = (0x7fffc000 + (i_5 << 0xe)) | (r2 & 0x3fff)
                goto label_c4bd8
            
            i_1 = 0xfffe0001 + (*r0_5 u>> 0xe)
            
            if (i_1 != 0xffffffff)
                i_1 = i_4 + i_1 + 1
            
            i_4 = i_1
        while (i_1 != 0xffffffff)
    
    if (i_3 == 0xffffffff)
        r10_1 = 0xffffffff
    else
        int32_t i_2
        
        do
            int32_t* r0_8 = *(*r9 + 0xc) + (i_3 << 2)
            int32_t r6_3
            
            if (i_3 s< 1)
                r6_3 = *r0_8
            else
                r6_3 = *(r0_8 - 4)
                
                if (sx.d((*"`qATPP\l<")[r6_3 & 0x3f]) s>= 0)
                    r6_3 = *r0_8
            
            if ((r6_3 & 0x3f) != 0x1c)
                goto label_c4a68
            
            i_2 = 0xfffe0001 + (*r0_8 u>> 0xe)
            
            if (i_2 != 0xffffffff)
                i_2 = i_3 + i_2 + 1
            
            i_3 = i_2
        while (i_2 != 0xffffffff)
        r10_1 = 0xffffffff
    
label_c4bd8:
    int32_t r7_3 = r9[5]
    r9[6] = r7_3
    void* r4_1
    int32_t r5_14
    int32_t* r9_2
    r4_1, r5_14, r9_2 = sub_c4008(r9, r4[5], r7_3, arg3, r10_1)
    r4 = sub_c4008(r9_2, *(r4_1 + 0x10), r7_3, arg3, r5_14)

r4[4] = 0xffffffff
r4[5] = 0xffffffff
r4[2] = arg3
*r4 = 6
return 6
