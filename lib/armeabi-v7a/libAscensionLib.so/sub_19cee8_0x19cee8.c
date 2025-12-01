// 函数: sub_19cee8
// 地址: 0x19cee8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t result

if (arg2 == 0xff)
    result = 0
else
    int16_t* r1 = *arg1
    int32_t r0_1 = arg2 & 0xf
    void* var_20 = r1
    
    if (r0_1 u> 0xc)
        abort()
        noreturn
    
    switch (r0_1)
        case 0, 3, 0xb
            result = *r1
            var_20 = &r1[2]
        case 1
            result = sub_19cf90(&var_20)
        case 2
            result = zx.d(*r1)
            var_20 = &r1[1]
        case 4, 0xc
            result = *r1
            var_20 = &r1[4]
        case 5, 6, 7, 8
            abort()
            noreturn
        case 9
            result = sub_19d024(&var_20)
        case 0xa
            result = sx.d(*r1)
            var_20 = &r1[1]
    
    int32_t r1_2 = arg2 u>> 4 & 7
    
    if (r1_2 == 0)
        goto label_19cf60
    
    if (r1_2 != 1)
        abort()
        noreturn
    
    if (result == 0)
        result = 0
        *arg1 = var_20
    else
        result += *arg1
    label_19cf60:
        
        if (sx.d(arg2.b) s> 0xffffffff)
            *arg1 = var_20
        else
            if (result != 0)
                result = *result
            
            *arg1 = var_20

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
