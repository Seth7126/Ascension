// 函数: lua_getinfo
// 地址: 0xc7e4c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* s = arg2
int32_t r0 = *__stack_chk_guard
int32_t* r1
int32_t* r9

if (zx.d(*arg2) != 0x3e)
    r9 = *(arg3 + 0x60)
    r1 = *r9
else
    s = &s[1]
    r9 = nullptr
    r1 = arg1[2] - 0x10
    arg1[2] = r1

void* r8 = nullptr
uint32_t i = zx.d(*s)

if ((r1[2] & 0x1f) == 6)
    r8 = *r1

void* var_48
void* var_40
int32_t result

if (i == 0)
    result = 1
else
    var_48 = arg3 + 4
    void* r5_1 = &s[1]
    var_40 = arg3 + 0x24
    result = 1
    
    do
        if ((i << 0xfffffffc s>> 0x18) - 0x4c u> 0x29)
            result = 0
        else
            switch (i << 0xfffffffc s>> 0x18)
                case 0x4d, 0x4e, 0x4f, 0x50, 0x51, 0x52, 0x54, 0x55, 0x56, 0x57, 0x58, 0x59, 0x5a, 
                        0x5b, 0x5c, 0x5d, 0x5e, 0x5f, 0x60, 0x61, 0x62, 0x63, 0x64, 0x65, 0x67, 
                        0x68, 0x69, 0x6a, 0x6b, 0x6d, 0x6f, 0x70, 0x71, 0x72, 0x73
                    result = 0
                case 0x53
                    void* const r0_22
                    char* r1_10
                    
                    if (r8 != 0 && zx.d(*(r8 + 4)) != 0x26)
                        void* r0_33 = *(r8 + 0xc)
                        void* r2_4 = *(r0_33 + 0x24)
                        r1_10 = &data_1c0691
                        
                        if (r2_4 != 0)
                            r1_10 = r2_4 + 0x10
                        
                        *(arg3 + 0x10) = r1_10
                        int32_t r2_5 = *(r0_33 + 0x40)
                        *(arg3 + 0x18) = r2_5
                        *(arg3 + 0x1c) = *(r0_33 + 0x44)
                        r0_22 = &data_1c0699
                        
                        if (r2_5 == 0)
                            r0_22 = "main"
                    else
                        *(arg3 + 0x18) = 0xffffffff
                        *(arg3 + 0x1c) = 0xffffffff
                        r1_10 = "=[C]"
                        *(arg3 + 0x10) = "=[C]"
                        r0_22 = &data_1c068f
                    
                    *(arg3 + 0xc) = r0_22
                    sub_d2f94(var_40, r1_10, 0x3c)
                case 0x6c
                    if (r9 != 0 && (zx.d(*(r9 + 0x12)) & 1) != 0)
                        void* r1_3 = *(**r9 + 0xc)
                        int32_t r0_7 = *(r1_3 + 0x14)
                        
                        if (r0_7 == 0)
                            *(arg3 + 0x14) = 0
                        else
                            *(arg3 + 0x14) = *(r0_7 + r9[7] - *(r1_3 + 0xc) - 4)
                    else
                        *(arg3 + 0x14) = 0xffffffff
                case 0x6e
                    if (r9 == 0 || (zx.d(*(r9 + 0x12)) & 0x40) != 0)
                    label_c81f0:
                        *(arg3 + 8) = 0
                        *(arg3 + 4) = 0
                        *(arg3 + 8) = &data_1bfacb
                    else
                        void*** r0_24 = r9[2]
                        
                        if ((zx.d(*(r0_24 + 0x12)) & 1) == 0)
                            goto label_c81f0
                        
                        void* r0_11 = *(**r0_24 + 0xc)
                        int32_t r3_1 = *(r0_11 + 0xc)
                        int32_t r1_8 = 0xffffffff + ((r0_24[7] - r3_1) s>> 2)
                        int32_t r3_2 = *(r3_1 + (r1_8 << 2))
                        
                        if ((r3_2 & 0x3f) - 6 u> 0x1c)
                            goto label_c81f0
                        
                        switch (r3_2 & 0x3f)
                            case 6, 7, 0xc
                                *var_48 = *(arg1[3] + (0 << 2) + 0xb8) + 0x10
                                *(arg3 + 8) = "metamethod"
                            case 8, 0xa
                                *var_48 = *(arg1[3] + (1 << 2) + 0xb8) + 0x10
                                *(arg3 + 8) = "metamethod"
                            case 9, 0xb, 0x14, 0x17, 0x1b, 0x1c, 0x1f, 0x20, 0x21
                                goto label_c81f0
                            case 0xd
                                *var_48 = *(arg1[3] + (6 << 2) + 0xb8) + 0x10
                                *(arg3 + 8) = "metamethod"
                            case 0xe
                                *var_48 = *(arg1[3] + (7 << 2) + 0xb8) + 0x10
                                *(arg3 + 8) = "metamethod"
                            case 0xf
                                *var_48 = *(arg1[3] + (8 << 2) + 0xb8) + 0x10
                                *(arg3 + 8) = "metamethod"
                            case 0x10
                                *var_48 = *(arg1[3] + (9 << 2) + 0xb8) + 0x10
                                *(arg3 + 8) = "metamethod"
                            case 0x11
                                *var_48 = *(arg1[3] + (0xa << 2) + 0xb8) + 0x10
                                *(arg3 + 8) = "metamethod"
                            case 0x12
                                *var_48 = *(arg1[3] + (0xb << 2) + 0xb8) + 0x10
                                *(arg3 + 8) = "metamethod"
                            case 0x13
                                *var_48 = *(arg1[3] + (0xc << 2) + 0xb8) + 0x10
                                *(arg3 + 8) = "metamethod"
                            case 0x15
                                *var_48 = *(arg1[3] + (4 << 2) + 0xb8) + 0x10
                                *(arg3 + 8) = "metamethod"
                            case 0x16
                                *var_48 = *(arg1[3] + (0xf << 2) + 0xb8) + 0x10
                                *(arg3 + 8) = "metamethod"
                            case 0x18
                                *var_48 = *(arg1[3] + (5 << 2) + 0xb8) + 0x10
                                *(arg3 + 8) = "metamethod"
                            case 0x19
                                *var_48 = *(arg1[3] + (0xd << 2) + 0xb8) + 0x10
                                *(arg3 + 8) = "metamethod"
                            case 0x1a
                                *var_48 = *(arg1[3] + (0xe << 2) + 0xb8) + 0x10
                                *(arg3 + 8) = "metamethod"
                            case 0x1d, 0x1e
                                char* r0_12 = sub_c8570(r0_11, r1_8, r3_2 u>> 6 & 0xff, var_48)
                                *(arg3 + 8) = r0_12
                                
                                if (r0_12 == 0)
                                    *(arg3 + 4) = 0
                                    *(arg3 + 8) = &data_1bfacb
                            case 0x22
                                *var_48 = "for iterator"
                                *(arg3 + 8) = "for iterator"
                case 0x74
                    if (r9 == 0)
                        *(arg3 + 0x23) = 0
                    else
                        *(arg3 + 0x23) = *(r9 + 0x12) & 0x40
                case 0x75
                    if (r8 == 0)
                        *(arg3 + 0x20) = 0
                        *(arg3 + 0x21) = 0x100
                    else
                        *(arg3 + 0x20) = *(r8 + 6)
                        
                        if (zx.d(*(r8 + 4)) == 0x26)
                            *(arg3 + 0x21) = 0x100
                        else
                            *(arg3 + 0x22) = *(*(r8 + 0xc) + 0x4d)
                            *(arg3 + 0x21) = *(*(r8 + 0xc) + 0x4c)
        
        i = zx.d(*r5_1)
        r5_1 += 1
    while (i != 0)

if (strchr(s, 0x66) != 0)
    int32_t* r0_38 = arg1[2]
    int32_t r2_6 = r1[1]
    *r0_38 = *r1
    r0_38[1] = r2_6
    r0_38[2] = r1[2]
    arg1[2] += 0x10

if (strchr(s, 0x4c) != 0)
    if (r8 != 0 && zx.d(*(r8 + 4)) != 0x26)
        int32_t r5_2 = *(*(r8 + 0xc) + 0x14)
        void* r0_48
        int128_t q4_1
        r0_48, q4_1 = sub_dafac(arg1)
        void** r0_49 = arg1[2]
        r0_49[2] = 0x45
        *r0_49 = r0_48
        arg1[2] += 0x10
        int32_t var_30_1 = 1
        int32_t var_38 = 1
        
        if (*(*(r8 + 0xc) + 0x34) s>= 1)
            int32_t i_1 = 0
            
            do
                sub_dadf8(arg1, r0_48, *(r5_2 + (i_1 << 2)), &var_38, arg1, q4_1, var_48, r1, 
                    var_40, result)
                i_1 += 1
            while (i_1 s< *(*(r8 + 0xc) + 0x34))
    else
        void* r0_44 = arg1[2]
        *(r0_44 + 8) = 0
        arg1[2] = r0_44 + 0x10

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
