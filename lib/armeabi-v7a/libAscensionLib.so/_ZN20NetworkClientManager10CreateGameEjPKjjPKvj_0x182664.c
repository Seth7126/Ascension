// 函数: _ZN20NetworkClientManager10CreateGameEjPKjjPKvj
// 地址: 0x182664
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t* r10_1

if (zx.d(*(arg1 + 0x8e)) != 0)
    r10_1 = *(arg1 + 4)

int32_t r0_2
int32_t result

if (zx.d(*(arg1 + 0x8e)) != 0 && r10_1 != 0)
    int32_t var_54_1 = 0
    int32_t var_58 = 0xfafafafa
    result = 1
    int16_t var_50_1 = arg2.w
    void const* var_40_1 = arg4
    int16_t r3 = 1
    int32_t var_44_1 = 0
    int32_t var_48_1 = 0
    int32_t var_4c = 0
    
    if (arg3 != 0)
        int32_t i = *arg3
        r3 = 1
        
        if (i != 0)
            int32_t r5_2 = 0
            
            do
                (&var_4c)[r5_2] = i
                i = *(arg3 + 4 + (r5_2 << 2))
                r5_2 += 1
            while (i != 0)
            
            r3 = r5_2.w + 1
    
    int32_t arg_4
    int32_t var_3c_1 = arg_4
    int16_t var_4e_1 = r3
    void var_38
    __aeabi_memcpy(&var_38, arg5)
    (*(*r10_1 + 8))(r10_1, &var_58, 0x30)
    r0_2 = 0xffffffff
else
    r0_2 = 1
    result = 0

*(arg1 + 0x98) = r0_2

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
