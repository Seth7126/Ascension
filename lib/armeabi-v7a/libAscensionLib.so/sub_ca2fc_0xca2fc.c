// 函数: sub_ca2fc
// 地址: 0xca2fc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r4 = arg1
int32_t r0 = *__stack_chk_guard
int32_t i_2 = *(r4 + 0x40)
int32_t r0_2 = arg2[4]

if (r0_2 == 0)
    r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
    arg2[4] = r0_2

i_2 = *(r4 + 0x44)

if (r0_2 == 0)
    r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
    arg2[4] = r0_2

i_2.b = *(r4 + 0x4c)

if (r0_2 == 0)
    r0_2 = arg2[1](*arg2, &i_2, 1, arg2[2])
    arg2[4] = r0_2

i_2.b = *(r4 + 0x4d)

if (r0_2 == 0)
    r0_2 = arg2[1](*arg2, &i_2, 1, arg2[2])
    arg2[4] = r0_2

i_2.b = *(r4 + 0x4e)

if (r0_2 == 0)
    r0_2 = arg2[1](*arg2, &i_2, 1, arg2[2])
    arg2[4] = r0_2

int32_t r6 = *(r4 + 0xc)
int32_t i_3 = *(r4 + 0x30)
i_2 = i_3
int32_t i_4

if (r0_2 != 0)
label_ca420:
    i_4 = *(r4 + 0x2c)
    i_2 = i_4
label_ca428:
    
    if (i_4 s>= 1)
    label_ca430:
        int32_t r6_1 = 0
        
        do
            int32_t r8_1 = *(r4 + 8)
            int64_t* r9_1 = r8_1 + (r6_1 << 4)
            int32_t r1_10 = r9_1[1].d
            i_2.b = r1_10.b & 0xf
            
            if (r0_2 == 0)
                r0_2 = arg2[1](*arg2, &i_2, 1, arg2[2])
                arg2[4] = r0_2
                r1_10 = r9_1[1].d
            
            int32_t r1_12 = r1_10 & 0xf
            
            if (r1_12 == 4)
                void* r7_9 = *(r8_1 + (r6_1 << 4))
                
                if (r7_9 == 0)
                    i_2 = 0
                    
                    if (r0_2 == 0)
                        r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
                        arg2[4] = r0_2
                else
                    i_2 = *(r7_9 + 0xc) + 1
                    
                    if (r0_2 == 0)
                        int32_t i_9 = i_4
                        r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
                        i_4 = i_9
                        arg2[4] = r0_2
                        
                        if (r0_2 == 0)
                            r0_2 = arg2[1](*arg2, r7_9 + 0x10, i_2, arg2[2])
                            i_4 = i_9
                            arg2[4] = r0_2
            else if (r1_12 == 3)
                i_2.q = *r9_1
                
                if (r0_2 == 0)
                    r0_2 = arg2[1](*arg2, &i_2, 8, arg2[2])
                    arg2[4] = r0_2
            else if (r1_12 == 1)
                i_2.b = (*(r8_1 + (r6_1 << 4))).b
                
                if (r0_2 == 0)
                    r0_2 = arg2[1](*arg2, &i_2, 1, arg2[2])
                    arg2[4] = r0_2
            
            r6_1 += 1
        while (i_4 != r6_1)
else
    r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
    arg2[4] = r0_2
    
    if (r0_2 != 0)
        goto label_ca420
    
    r0_2 = arg2[1](*arg2, r6, i_3 << 2, arg2[2])
    arg2[4] = r0_2
    i_4 = *(r4 + 0x2c)
    i_2 = i_4
    
    if (r0_2 != 0)
        goto label_ca428
    
    r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
    arg2[4] = r0_2
    
    if (i_4 s>= 1)
        goto label_ca430
int32_t i_5 = *(r4 + 0x38)
i_2 = i_5

if (r0_2 == 0)
    r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
    arg2[4] = r0_2

if (i_5 s>= 1)
    int32_t r5_2 = 0
    
    do
        sub_ca2fc(*(*(r4 + 0x10) + (r5_2 << 2)), arg2)
        r5_2 += 1
    while (i_5 != r5_2)
    
    r0_2 = arg2[4]

int32_t i_6 = *(r4 + 0x28)
i_2 = i_6

if (r0_2 == 0)
    r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
    arg2[4] = r0_2

if (i_6 s>= 1)
    int32_t r6_3 = 0
    
    do
        int32_t r1_23 = *(r4 + 0x1c)
        i_2.b = *(r1_23 + (r6_3 << 3) + 4)
        
        if (r0_2 == 0)
            r0_2 = arg2[1](*arg2, &i_2, 1, arg2[2])
            arg2[4] = r0_2
            r1_23 = *(r4 + 0x1c)
        
        i_2.b = *(r1_23 + (r6_3 << 3) + 5)
        
        if (r0_2 == 0)
            r0_2 = arg2[1](*arg2, &i_2, 1, arg2[2])
            arg2[4] = r0_2
        
        r6_3 += 1
    while (i_6 != r6_3)

void* r6_4

if (arg2[3] == 0)
    r6_4 = *(r4 + 0x24)

if (arg2[3] != 0 || r6_4 == 0)
    i_2 = 0
    
    if (r0_2 == 0)
        r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
        arg2[4] = r0_2
else
    i_2 = *(r6_4 + 0xc) + 1
    
    if (r0_2 == 0)
        r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
        arg2[4] = r0_2
        
        if (r0_2 == 0)
            r0_2 = arg2[1](*arg2, r6_4 + 0x10, i_2, arg2[2])
            arg2[4] = r0_2

int32_t i_7 = 0
int32_t r6_5 = *(r4 + 0x14)

if (arg2[3] == 0)
    i_7 = *(r4 + 0x34)

i_2 = i_7

if (r0_2 == 0)
    r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
    arg2[4] = r0_2
    
    if (r0_2 == 0)
        r0_2 = arg2[1](*arg2, r6_5, i_7 << 2, arg2[2])
        arg2[4] = r0_2

int32_t i_1 = 0

if (arg2[3] == 0)
    i_1 = *(r4 + 0x3c)

i_2 = i_1

if (r0_2 == 0)
    r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
    arg2[4] = r0_2

void* r9_2 = r4

if (i_1 s>= 1)
    int32_t r6_7 = 0
    int32_t i
    
    do
        void* r5_7 = *(*(r4 + 0x18) + r6_7)
        
        if (r5_7 == 0)
            i_2 = 0
            
            if (r0_2 == 0)
                r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
                arg2[4] = r0_2
        else
            i_2 = *(r5_7 + 0xc) + 1
            
            if (r0_2 == 0)
                r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
                r4 = r9_2
                arg2[4] = r0_2
                
                if (r0_2 == 0)
                    r0_2 = arg2[1](*arg2, r5_7 + 0x10, i_2, arg2[2])
                    r4 = r9_2
                    arg2[4] = r0_2
        
        void* r1_44 = *(r4 + 0x18)
        i_2 = *(r1_44 + r6_7 + 4)
        
        if (r0_2 == 0)
            r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
            arg2[4] = r0_2
            r1_44 = *(r4 + 0x18)
        
        i_2 = *(r1_44 + r6_7 + 8)
        
        if (r0_2 == 0)
            r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
            arg2[4] = r0_2
        
        r6_7 += 0xc
        i = i_1
        i_1 -= 1
    while (i != 1)

int32_t i_8 = 0

if (arg2[3] == 0)
    i_8 = *(r4 + 0x28)

i_2 = i_8

if (r0_2 == 0)
    r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
    arg2[4] = r0_2

if (i_8 s>= 1)
    int32_t r6_9 = 0
    
    do
        void* r5_11 = *(*(r4 + 0x1c) + (r6_9 << 3))
        
        if (r5_11 == 0)
            i_2 = 0
            
            if (r0_2 == 0)
                r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
                arg2[4] = r0_2
        else
            i_2 = *(r5_11 + 0xc) + 1
            
            if (r0_2 == 0)
                r0_2 = arg2[1](*arg2, &i_2, 4, arg2[2])
                r4 = r9_2
                arg2[4] = r0_2
                
                if (r0_2 == 0)
                    r0_2 = arg2[1](*arg2, r5_11 + 0x10, i_2, arg2[2])
                    r4 = r9_2
                    arg2[4] = r0_2
        
        r6_9 += 1
    while (i_8 != r6_9)

int32_t r0_33 = *__stack_chk_guard

if (r0_33 == r0)
    return r0_33 - r0

__stack_chk_fail()
noreturn
