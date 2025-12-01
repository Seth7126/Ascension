// 函数: sub_1a23c8
// 地址: 0x1a23c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r6
void* var_c = r6
int32_t r5
int32_t var_10 = r5
int32_t r4
int32_t var_14 = r4
int32_t __saved_r7
int32_t* var_24 = &__saved_r7
void* var_28 = r6
int32_t var_2c = r5
int32_t var_30 = r4
int32_t r0 = *__stack_chk_guard
char* r0_1 = *arg1
int32_t r1 = arg1[1]
bool cond:0 = r1 != r0_1

if (r1 != r0_1)
    cond:0 = r1 - r0_1 != 1

if (cond:0 && zx.d(*r0_1) == 0x64)
    uint32_t r1_5 = zx.d(r0_1[1])
    void* result
    
    if (r1_5 == 0x58)
        *arg1 = &r0_1[2]
        void* r0_12 = sub_1a09b8(arg1)
        
        if (r0_12 == 0)
        label_1a24aa:
            result = nullptr
        label_1a24b0:
            
            if (*__stack_chk_guard == r0)
                return result
            
            __stack_chk_fail()
            noreturn
        
        void* r0_14 = sub_1a09b8(arg1)
        
        if (r0_14 == 0)
            goto label_1a24aa
        
        int32_t r0_16 = sub_1a23c8(arg1)
        
        if (r0_16 == 0)
            goto label_1a24aa
        
        result = sub_19fbde(&arg1[0x5c], 0x14)
        *result =
            &_vtable_for_(anonymous namespace)::BracedRangeExpr{for `(anonymous namespace)::Node'}
        *(result + 4) = 0x101012c
        *(result + 8) = r0_12
        *(result + 0xc) = r0_14
        *(result + 0x10) = r0_16
        goto label_1a24b0
    
    if (r1_5 == 0x78)
        *arg1 = &r0_1[2]
        void* r0_20 = sub_1a09b8(arg1)
        var_28 = r0_20
        
        if (r0_20 == 0)
            goto label_1a24aa
        
        int32_t r0_22 = sub_1a23c8(arg1)
        var_2c = r0_22
        
        if (r0_22 == 0)
            goto label_1a24aa
        
        result = 1
    label_1a249e:
        var_30:3.b = result.b
        result = sub_1a39b4(arg1, &var_28, &var_2c, &var_30:3)
        goto label_1a24b0
    
    if (r1_5 == 0x69)
        *arg1 = &r0_1[2]
        void* r0_7 = sub_1a31a4(arg1)
        var_28 = r0_7
        
        if (r0_7 == 0)
            goto label_1a24aa
        
        int32_t r0_9 = sub_1a23c8(arg1)
        var_2c = r0_9
        result = nullptr
        
        if (r0_9 != 0)
            goto label_1a249e
        
        goto label_1a24b0

int32_t r1_2 = *__stack_chk_guard
int32_t* r0_3 = r1_2 - r0

if (r1_2 == r0)
    r0_3 = arg1

if (r1_2 == r0)
    return sub_1a09b8(r0_3) __tailcall

jump(0x1a2402)
