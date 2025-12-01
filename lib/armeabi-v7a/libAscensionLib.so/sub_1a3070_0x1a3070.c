// 函数: sub_1a3070
// 地址: 0x1a3070
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0 = *__stack_chk_guard
char* r0_1 = *arg1

if (arg1[1] != r0_1 && zx.d(*r0_1) - 0x30 u<= 9)
    int32_t r1_1 = *__stack_chk_guard
    int32_t* r0_5 = r1_1 - r0
    
    if (r1_1 == r0)
        r0_5 = arg1
    
    if (r1_1 == r0)
        return sub_1a2fd4(r0_5) __tailcall
    
    jump(0x1a30b6)

void* result

if (sub_19e5e0(arg1, "dn", 0x1d00aa) == 0)
    sub_19e5e0(arg1, "on", 0x1d00ad)
    void* result_1 = sub_1a32a4(arg1, nullptr)
    void* result_2 = result_1
    
    if (result_1 == 0)
        result = nullptr
    else
        result = result_1
        char* r0_16 = *arg1
        
        if (arg1[1] != r0_16 && zx.d(*r0_16) == 0x49)
            result = nullptr
            void* r0_19 = sub_19fe78(arg1, 0)
            void* var_24 = r0_19
            
            if (r0_19 != 0)
                result = sub_1a0150(arg1, &result_2, &var_24)
else
    char* r0_9 = *arg1
    int32_t r1_3 = arg1[1]
    void* r0_13
    
    if (r1_3 == r0_9 || zx.d(*r0_9) - 0x30 u> 9)
        r0_13 = sub_1a2f44(arg1, r1_3)
    else
        r0_13 = sub_1a2fd4(arg1)
    
    if (r0_13 == 0)
        result = nullptr
    else
        result = sub_19fbde(&arg1[0x5c], 0xc)
        *result = &_vtable_for_(anonymous namespace)::DtorName{for `(anonymous namespace)::Node'}
        *(result + 4) = 0x1010126
        *(result + 8) = r0_13

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
