// 函数: lua_arith
// 地址: 0xbd0b8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r5 = arg1[2]

if (arg2 == 6)
    int32_t r2_1 = *(r5 - 0xc)
    int32_t r3_2 = *(r5 - 8)
    *r5 = *(r5 - 0x10)
    r5[1] = r2_1
    r5[2] = r3_2
    r5 = arg1[2] + 0x10
    arg1[2] = r5

if (*(r5 - 0x18) == 3 && *(r5 - 8) == 3)
    unimplemented  {vmov r2, r3, d1}
    int32_t var_18
    var_18.q = *(r5 - 0x10)
    int32_t __saved_r11
    int64_t q0_1 = sub_d2860(arg2, &__saved_r11, var_18)
    unimplemented  {vmov d0, r0, r1}
    *(r5 - 0x18) = 3
    *(r5 - 0x20) = q0_1
else
    sub_df8a0(arg1, r5 - 0x20, r5 - 0x20, r5 - 0x10, arg2 + 6)

int32_t result = arg1[2] - 0x10
arg1[2] = result
return result
