// 函数: sub_1a32a4
// 地址: 0x1a32a4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r6
void* var_c = r6
void* r5
void* var_10 = r5
int32_t r4
int32_t var_14 = r4
int32_t __saved_r7
int32_t* var_24 = &__saved_r7
void* var_28 = r6
void* var_2c = r5
int32_t var_30 = r4
int32_t r0 = *__stack_chk_guard
char* r2 = *arg1
int32_t r0_1 = arg1[1]
void* r1 = r0_1 - r2
void* result

if (r0_1 == r2)
    result = nullptr
else
    void* r3_1 = zx.d(*r2) - 0x61
    result = nullptr
    
    switch (r3_1)
        case nullptr
            if (r1 u< 2)
                result = nullptr
            else
                uint32_t r0_3 = zx.d(r2[1])
                
                if (r0_3 == 0x4e)
                    *arg1 = &r2[2]
                    result = sub_1a37a8(arg1, "operator&=")
                else if (r0_3 == 0x53)
                    *arg1 = &r2[2]
                    result = sub_1a37c4(arg1, "operator=")
                else
                    bool cond:2_1 = r0_3 != 0x6e
                    
                    if (r0_3 != 0x6e)
                        cond:2_1 = r0_3 != 0x64
                    
                    if (not(cond:2_1))
                        *arg1 = &r2[2]
                        result = sub_1a37c4(arg1, "operator&")
                    else if (r0_3 != 0x61)
                        result = nullptr
                    else
                        *arg1 = &r2[2]
                        result = sub_1a37a8(arg1, "operator&&")
        case 2
            if (r1 u< 2)
                result = nullptr
            else
                uint32_t r1_5 = zx.d(r2[1])
                result = nullptr
                
                if (r1_5 == 0x76)
                    uint32_t r8_1 = zx.d(*(arg1 + 0x169))
                    char r9_1 = arg1[0x5a].b
                    *arg1 = &r2[2]
                    arg1[0x5a].b = 0
                    int32_t r0_25 = arg2 | r8_1
                    
                    if (r0_25 != 0)
                        r0_25 = 1
                    
                    *(arg1 + 0x169) = r0_25.b
                    void* r0_27 = sub_19ec40(arg1, &r2[2], r2, r3_1, r6)
                    var_28 = r0_27
                    
                    if (r0_27 == 0)
                        result = nullptr
                    else
                        if (arg2 != 0)
                            *arg2 = 1
                        
                        result = sub_1a37e0(arg1, &var_28)
                    
                    arg1[0x5a].b = r9_1
                    *(arg1 + 0x169) = r8_1.b
                else if (r1_5 == 0x6d)
                    *arg1 = &r2[2]
                    result = sub_1a37c4(arg1, "operator,")
                else if (r1_5 == 0x6f)
                    *arg1 = &r2[2]
                    result = sub_1a37c4(arg1, "operator~")
                else if (r1_5 == 0x6c)
                    *arg1 = &r2[2]
                    result = sub_1a37a8(arg1, "operator()")
        case 3
            if (r1 u< 2)
                result = nullptr
            else
                uint32_t r0_4 = zx.d(r2[1])
                
                if (r0_4 == 0x56)
                    *arg1 = &r2[2]
                    result = sub_1a37a8(arg1, "operator/=")
                else if (r0_4 == 0x76)
                    *arg1 = &r2[2]
                    result = sub_1a37c4(arg1, "operator/")
                else if (r0_4 == 0x65)
                label_1a3526:
                    *arg1 = &r2[2]
                    result = sub_1a37c4(arg1, "operator*")
                else if (r0_4 == 0x6c)
                    *arg1 = &r2[2]
                    result = sub_19fbde(&arg1[0x5c], 0x10)
                    *result = &_vtable_for_(anonymous namespace)::NameType{for `(anonymous namespace)::Node'}
                    *(result + 4) = 0x1010107
                    *(result + 8) = "operator delete"
                    *(result + 0xc) = &data_1d0113[0xf]
                else if (r0_4 != 0x61)
                    result = nullptr
                else
                    *arg1 = &r2[2]
                    result = sub_1a3808(arg1, "operator delete[]")
        case 4
            if (r1 u< 2)
                result = nullptr
            else
                uint32_t r0_11 = zx.d(r2[1])
                
                if (r0_11 == 0x4f)
                    *arg1 = &r2[2]
                    result = sub_1a37a8(arg1, "operator^=")
                else if (r0_11 == 0x71)
                    *arg1 = &r2[2]
                    result = sub_1a37a8(arg1, "operator==")
                else if (r0_11 != 0x6f)
                    result = nullptr
                else
                    *arg1 = &r2[2]
                    result = sub_1a37c4(arg1, "operator^")
        case 6
            if (r1 u< 2)
                result = nullptr
            else
                uint32_t r0_12 = zx.d(r2[1])
                
                if (r0_12 == 0x74)
                    *arg1 = &r2[2]
                    result = sub_1a37c4(arg1, "operator>")
                else if (r0_12 != 0x65)
                    result = nullptr
                else
                    *arg1 = &r2[2]
                    result = sub_1a37a8(arg1, "operator>=")
        case 8
            if (r1 u< 2 || zx.d(r2[1]) != 0x78)
                result = nullptr
            else
                *arg1 = &r2[2]
                result = sub_1a37a8(arg1, "operator[]")
        case 0xb
            if (r1 u< 2)
                result = nullptr
            else
                uint32_t r0_13 = zx.d(r2[1])
                
                if (r0_13 == 0x53)
                    *arg1 = &r2[2]
                    result = sub_1a3824(arg1, "operator<<=")
                else if (r0_13 == 0x74)
                    *arg1 = &r2[2]
                    result = sub_1a37c4(arg1, "operator<")
                else if (r0_13 == 0x69)
                    *arg1 = &r2[2]
                    void* r0_33 = sub_1a31a4(arg1)
                    
                    if (r0_33 == 0)
                        result = nullptr
                    else
                        result = sub_19fbde(&arg1[0x5c], 0xc)
                        *result = &_vtable_for_(anonymous namespace)::LiteralOperator{for `(anonymous namespace)::Node'}
                        *(result + 4) = 0x1010114
                        *(result + 8) = r0_33
                else if (r0_13 == 0x73)
                    *arg1 = &r2[2]
                    result = sub_1a37a8(arg1, "operator<<")
                else if (r0_13 != 0x65)
                    result = nullptr
                else
                    *arg1 = &r2[2]
                    result = sub_1a37a8(arg1, "operator<=")
        case 0xc
            if (r1 u< 2)
                result = nullptr
            else
                uint32_t r0_14 = zx.d(r2[1])
                
                if (r0_14 == 0x49)
                    *arg1 = &r2[2]
                    result = sub_1a37a8(arg1, "operator-=")
                else if (r0_14 == 0x4c)
                    *arg1 = &r2[2]
                    result = sub_1a37a8(arg1, "operator*=")
                else if (r0_14 == 0x6d)
                    *arg1 = &r2[2]
                    result = sub_1a37a8(arg1, "operator--")
                else
                    if (r0_14 == 0x6c)
                        goto label_1a3526
                    
                    if (r0_14 == 0x69)
                        goto label_1a352c
                    
                    result = nullptr
        case 0xd
            if (r1 u< 2)
                result = nullptr
            else
                uint32_t r0_15 = zx.d(r2[1])
                
                if (r0_15 == 0x77)
                    *arg1 = &r2[2]
                    result = sub_1a385c(arg1, "operator new")
                else if (r0_15 == 0x65)
                    *arg1 = &r2[2]
                    result = sub_1a37a8(arg1, "operator!=")
                else if (r0_15 == 0x67)
                label_1a352c:
                    *arg1 = &r2[2]
                    result = sub_1a37c4(arg1, "operator-")
                else if (r0_15 == 0x74)
                    *arg1 = &r2[2]
                    result = sub_1a37c4(arg1, "operator!")
                else if (r0_15 != 0x61)
                    result = nullptr
                else
                    *arg1 = &r2[2]
                    result = sub_1a3840(arg1, "operator new[]")
        case 0xe
            if (r1 u< 2)
                result = nullptr
            else
                uint32_t r0_18 = zx.d(r2[1])
                
                if (r0_18 == 0x52)
                    *arg1 = &r2[2]
                    result = sub_1a37a8(arg1, "operator|=")
                else if (r0_18 == 0x72)
                    *arg1 = &r2[2]
                    result = sub_1a37c4(arg1, "operator|")
                else if (r0_18 != 0x6f)
                    result = nullptr
                else
                    *arg1 = &r2[2]
                    result = sub_1a37a8(arg1, "operator||")
        case 0xf
            if (r1 u< 2)
                result = nullptr
            else
                uint32_t r3_2 = zx.d(r2[1])
                result = nullptr
                
                if (r3_2 - 0x6c u<= 8)
                    switch (r3_2)
                        case 0x6c, 0x73
                            *arg1 = &r2[2]
                            result = sub_1a37c4(arg1, "operator+")
                        case 0x6d
                            *arg1 = &r2[2]
                            result = sub_1a3824(arg1, "operator->*")
                        case 0x70
                            *arg1 = &r2[2]
                            result = sub_1a37a8(arg1, "operator++")
                        case 0x74
                            *arg1 = &r2[2]
                            result = sub_1a37a8(arg1, "operator->")
                else if (r3_2 == 0x4c)
                    *arg1 = &r2[2]
                    result = sub_1a37a8(arg1, "operator+=")
        case 0x10
            if (r1 u< 2 || zx.d(r2[1]) != 0x75)
                result = nullptr
            else
                *arg1 = &r2[2]
                result = sub_1a37c4(arg1, "operator?")
        case 0x11
            if (r1 u< 2)
                result = nullptr
            else
                uint32_t r0_9 = zx.d(r2[1])
                
                if (r0_9 == 0x4d)
                    *arg1 = &r2[2]
                    result = sub_1a37a8(arg1, "operator%=")
                else if (r0_9 == 0x53)
                    *arg1 = &r2[2]
                    result = sub_1a3824(arg1, "operator>>=")
                else if (r0_9 == 0x73)
                    *arg1 = &r2[2]
                    result = sub_1a37a8(arg1, "operator>>")
                else if (r0_9 != 0x6d)
                    result = nullptr
                else
                    *arg1 = &r2[2]
                    result = sub_1a37c4(arg1, "operator%")
        case 0x12
            if (r1 u< 2 || zx.d(r2[1]) != 0x73)
                result = nullptr
            else
                *arg1 = &r2[2]
                result = sub_1a3824(arg1, "operator<=>")
        case 0x15
            if (r1 u< 2 || zx.d(r2[1]) - 0x30 u> 9)
                result = nullptr
            else
                *arg1 = &r2[2]
                void* r0_23 = sub_1a31a4(arg1)
                var_2c = r0_23
                
                if (r0_23 == 0)
                    result = nullptr
                else
                    result = sub_1a37e0(arg1, &var_2c)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
