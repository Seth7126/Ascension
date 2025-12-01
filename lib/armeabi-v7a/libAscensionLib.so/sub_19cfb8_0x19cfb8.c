// 函数: sub_19cfb8
// 地址: 0x19cfb8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6
int32_t var_c = r6
int32_t __saved_r7
int32_t* var_24 = &__saved_r7
int32_t var_28 = r6
int32_t r1 = *__stack_chk_guard

if (arg3 == 0)
    sub_19ccf4(0, arg6)
    noreturn

int32_t* r6_1 = (0xfffffffc ^ arg1 << 2) + arg3
int32_t result

while (true)
    int32_t* r0_1 = *r6_1
    
    if (r0_1 == 0)
        result = 1
        break
    
    int32_t* r0_2 = *(r0_1 + r6_1)
    var_28 = arg5
    r6_1 = &r6_1[1]
    
    if ((*(*r0_2 + 0x10))(r0_2, arg4, &var_28) != 0)
        result = 0
        break

if (*__stack_chk_guard == r1)
    return result

__stack_chk_fail()
noreturn
