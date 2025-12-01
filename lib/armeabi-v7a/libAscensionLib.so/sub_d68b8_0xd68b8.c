// 函数: sub_d68b8
// 地址: 0xd68b8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r7 = arg1
int32_t r0 = *__stack_chk_guard
int32_t r0_1 = r7[4]
int32_t* r5 = r7[0xc]
int32_t var_40

if (r0_1 == 0x121)
    int32_t r0_6 = sub_c4370(r5, r7[6])
    int32_t var_30_1 = 0xffffffff
    int32_t var_2c_1 = 0xffffffff
    var_40 = 4
    int32_t var_38_1 = r0_6
    sub_cea80(r7)
else if (r0_1 == 0x7b)
    sub_d5be8(r7, &var_40)
else
    if (r0_1 != 0x28)
        int32_t* r0_26
        int32_t* r1_10
        char r9_1
        int32_t lr
        int64_t* pc
        r0_26, r1_10, r9_1, lr = sub_ce78c(r7, "function arguments expected", pc)
        
        if (r0_1 == 0x28)
            r7 = r0_26 & r0_26 u>> zx.d(r9_1)
        
        return sub_d6a80(r0_26, r1_10, r7) __tailcall
    
    sub_cea80(r7)
    
    if (r7[4] != 0x29)
        sub_d56a0(r7, &var_40, 0, arg2)
        
        if (r7[4] == 0x2c)
            int32_t* r4_1 = &var_40
            
            do
                sub_cea80(r7)
                r4_1, r5 = sub_c482c(r7[0xc], r4_1, arg4.b)
                sub_d56a0(r7, r4_1, 0, arg2)
            while (r7[4] == 0x2c)
        
        sub_c4608(r5, &var_40, 0xffffffff)
    else
        var_40 = 0
    
    r5 = sub_d507c(r7, 0x29, 0x28, arg3)

int32_t r0_16 = var_40
int32_t r3_2 = 0
int32_t r7_1 = arg2[2]

if (r0_16 - 0xc u>= 2)
    if (r0_16 != 0)
        r5 = sub_c482c(r5, &var_40, arg4.b)
    
    r3_2 = zx.d(r5[0xc].b) - r7_1

int32_t r0_20
int32_t* r9
r0_20, r9 = sub_c3d00(r5, 0x1d, r7_1, r3_2, 2)
arg2[4] = 0xffffffff
arg2[5] = 0xffffffff
*arg2 = 0xc
arg2[2] = r0_20
sub_c604c(r5, arg3)
r5[0xc].b = r7_1.b + 1
int32_t r0_23 = *r9

if (r0_23 == r0)
    return r0_23 - r0

__stack_chk_fail()
noreturn
