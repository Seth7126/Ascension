// 函数: sub_1a2f44
// 地址: 0x1a2f44
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0 = *__stack_chk_guard
char* r0_1 = *arg1
int32_t r1 = arg1[1]

if (r1 != r0_1)
    uint32_t r0_2 = zx.d(*r0_1)
    void* r0_4
    int32_t* r1_1
    int32_t result
    
    if (r0_2 == 0x44)
        void* entry_r2
        int32_t result_2 = sub_1a0370(arg1, r1, entry_r2)
        result = result_2
        int32_t result_3 = result_2
        
        if (result_2 == 0)
            goto label_1a2fbc
        
        r0_4 = &arg1[0x25]
        r1_1 = &result_3
    label_1a2fb4:
        sub_19f9dc(r0_4, r1_1)
    label_1a2fbc:
        
        if (*__stack_chk_guard == r0)
            return result
        
        __stack_chk_fail()
        noreturn
    
    if (r0_2 == 0x54)
        int32_t result_1 = sub_1a01e4(arg1)
        result = result_1
        int32_t result_4 = result_1
        
        if (result_1 == 0)
            goto label_1a2fbc
        
        r0_4 = &arg1[0x25]
        r1_1 = &result_4
        goto label_1a2fb4

int32_t r1_2 = *__stack_chk_guard
int32_t* r0_6 = r1_2 - r0

if (r1_2 == r0)
    r0_6 = arg1

if (r1_2 == r0)
    return sub_19fd40(r0_6) __tailcall

jump(0x1a2f9c)
