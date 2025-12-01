// 函数: sub_1a29c4
// 地址: 0x1a29c4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t* var_24 = arg2
void* var_20 = arg1
sub_19e536(arg2, 0x28)

if (zx.d(*(arg1 + 0x18)) == 0)
    sub_1a2ac0(&var_24)
    sub_19e536(arg2, 0x20)
    sub_19fca4(arg2, *(arg1 + 0x10), *(arg1 + 0x14))
    sub_19fca4(arg2, " ...", &data_1d005e[4])
    
    if (*(arg1 + 0xc) != 0)
        sub_19e536(arg2, 0x20)
        sub_19fca4(arg2, *(arg1 + 0x10), *(arg1 + 0x14))
        sub_19e536(arg2, 0x20)
        sub_19e510(*(arg1 + 0xc), arg2)
else
    int32_t* r0_3 = *(arg1 + 0xc)
    void* r5_1
    void* r6_2
    
    if (r0_3 == 0)
        r6_2 = arg1 + 0x14
        r5_1 = arg1 + 0x10
    else
        sub_19e510(r0_3, arg2)
        sub_19e536(arg2, 0x20)
        r5_1 = arg1 + 0x10
        r6_2 = r5_1 + 4
        sub_19fca4(arg2, *r5_1, *r6_2)
        sub_19e536(arg2, 0x20)
    
    sub_19fca4(arg2, "... ", &data_1d0059[4])
    sub_19fca4(arg2, *r5_1, *r6_2)
    sub_19e536(arg2, 0x20)
    sub_1a2ac0(&var_24)

sub_19e536(arg2, 0x29)
int32_t r1_6 = *__stack_chk_guard

if (r1_6 == r0)
    return r1_6 - r0

__stack_chk_fail()
noreturn
