// 函数: sub_1a2bac
// 地址: 0x1a2bac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6
int32_t var_c = r6
void* r5
void* var_10 = r5
int32_t r4
int32_t var_14 = r4
int32_t __saved_r7
int32_t* var_28 = &__saved_r7
int32_t var_2c = r6
void* const var_30 = r5
int32_t var_34 = r4
int32_t var_38 = arg4
int32_t* sp = &var_38
int32_t r0 = *__stack_chk_guard
void* const var_2c_1 = &data_1cff01
void* const var_34_1 = &data_1cff00
var_30 = &data_1cff00

if (sub_1a2cac(arg1 + 0xc, &var_30) != 0)
    sub_19fca4(arg2, &data_1cffeb, 0x1cffec)

sub_19fca4(arg2, &data_1cffeb, 0x1cffec)
sub_19e510(*(arg1 + 8), arg2)
sub_19fca4(arg2, 0x1d0066, 0x1d0068)
sub_19fca4(arg2, *(arg1 + 0xc), *(arg1 + 0x10))
sub_19fca4(arg2, 0x1d0069, 0x1d006b)
sub_19e510(*(arg1 + 0x14), arg2)
sub_19fca4(arg2, &data_1cfebe, &data_1cfebf)
void* const var_2c_2 = &data_1cff01
var_30 = var_34_1
int32_t r0_13
void* const r2_1
r0_13, r2_1 = sub_1a2cac(arg1 + 0xc, &var_30)

if (r0_13 == 0)
    int32_t r1_7 = *__stack_chk_guard
    
    if (r1_7 == r0)
        return r1_7 - r0
    
    __stack_chk_fail()
    noreturn

void* const r1_5 = *__stack_chk_guard
int32_t* r0_15 = r1_5 - r0
bool cond:0 = r1_5 == r0

if (r1_5 == r0)
    r0_15 = arg2
    r1_5 = &data_1cfebe
    r2_1 = &data_1cfebf
    int32_t __saved_r8
    sp = &__saved_r8

if (not(cond:0))
    jump(0x1a2c6c)

*sp
sp[1]
sp[2]
sp[3]
sp[4]
sp[5]
sp[6]
sp[7]
sp[8]
return sub_19fca4(r0_15, r1_5, r2_1) __tailcall
