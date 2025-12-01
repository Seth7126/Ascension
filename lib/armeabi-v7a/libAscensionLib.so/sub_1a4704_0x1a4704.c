// 函数: sub_1a4704
// 地址: 0x1a4704
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* var_c = arg5
void* r5
void* var_10 = r5
int32_t r4
int32_t var_14 = r4
int32_t __saved_r7
int32_t* var_24 = &__saved_r7
void* var_2c = r5
int32_t var_30 = r4
int32_t var_38 = arg3
int32_t r0 = *__stack_chk_guard
char* r0_1 = *arg1
uint32_t r1 = arg1[1]
void* result

if (r0_1 == r1)
label_1a47a2:
    int32_t r0_13
    int32_t r1_4
    int32_t r2
    void* r3
    r0_13, r1_4, r2, r3 = sub_1a0180(arg1, r1)
    void* result_1 = sub_19ec40(arg1, r1_4, r2, r3, arg5)
    
    if (result_1 == 0)
        result = nullptr
    else if (r0_13 == 0)
        result = result_1
    else
        result = sub_19fbde(&arg1[0x5c], 0x10)
        char r2_1 = *(result_1 + 7)
        int16_t r3_1 = *(result_1 + 5)
        *result = &_vtable_for_(anonymous namespace)::QualType{for `(anonymous namespace)::Node'}
        *(result + 5) = r3_1
        *(result + 8) = r0_13
        *(result + 0xc) = result_1
        *(result + 7) = r2_1
        *(result + 4) = 3
else
    r1 = zx.d(*r0_1)
    
    if (r1 != 0x55)
        goto label_1a47a2
    
    *arg1 = &r0_1[1]
    sub_1a3ecc(&var_2c, arg1)
    void* r5_1 = var_2c
    
    if (r5_1 == arg5)
        result = nullptr
    else if (sub_19f488(&var_2c, "objcproto", &data_1d05fd[9]) == 0)
        int32_t r0_17 = sub_1a4704(arg1)
        
        if (r0_17 == 0)
            result = nullptr
        else
            result = sub_19fbde(&arg1[0x5c], 0x14)
            *result = &_vtable_for_(anonymous namespace)::VendorExtQualType{for `(anonymous namespace)::Node'}
            *(result + 4) = 0x1010102
            *(result + 8) = r0_17
            *(result + 0xc) = r5_1
            *(result + 0x10) = arg5
    else
        void* r0_6 = arg5 - r5_1
        int32_t r9_1 = *arg1
        int32_t r10_1 = arg1[1]
        void* r1_2 = r0_6 - 1
        
        if (r0_6 u> 9)
            r1_2 = 9
        
        *arg1 = r5_1 + r1_2
        arg1[1] = arg5
        sub_1a3ecc(&var_38, arg1)
        int32_t r6_1 = var_38
        *arg1 = r9_1
        arg1[1] = r10_1
        
        if (r6_1 == arg4)
            result = nullptr
        else
            int32_t r0_10 = sub_1a4704(arg1)
            
            if (r0_10 == 0)
                result = nullptr
            else
                result = sub_19fbde(&arg1[0x5c], 0x14)
                *result = &_vtable_for_(anonymous namespace)::ObjCProtoName{for `(anonymous namespace)::Node'}
                *(result + 4) = 0x101010a
                *(result + 8) = r0_10
                *(result + 0xc) = r6_1
                *(result + 0x10) = arg4

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
