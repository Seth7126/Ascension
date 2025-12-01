// 函数: sub_c453c
// 地址: 0xc453c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

unimplemented  {vmov d0, r2, r3}
unimplemented  {vcmp.f64 d0, #0.000000}
unimplemented  {vmrs apsr_nzcv, fpscr}
int32_t r0 = *__stack_chk_guard
int64_t q0
int64_t var_28 = q0
int32_t* r5 = *(arg1[3] + 0x34)
int32_t var_30 = 3
int64_t var_38 = q0
int32_t result
bool n
bool z
bool v

if (n || (not(z) && n == v))
    result = sub_c43c8(arg1, &var_38, &var_38)
else
    void** r7_1 = r5[2]
    r5[2] = &r7_1[4]
    void* r0_5 = sub_d7eb4(r5, &var_28, 8)
    *r7_1 = r0_5
    r7_1[2] = zx.d(*(r0_5 + 4)) | 0x40
    result = sub_c43c8(arg1, r5[2] - 0x10, &var_38)
    r5[2] -= 0x10

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
