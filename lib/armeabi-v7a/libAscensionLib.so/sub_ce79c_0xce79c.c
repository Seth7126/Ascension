// 函数: sub_ce79c
// 地址: 0xce79c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r4 = arg1
void var_5c
void* r6 = &var_5c
int32_t* r7 = arg3
sub_d2f94(&var_5c, *(arg1 + 0x44) + 0x10, 0x3c)
*(r4 + 4)
int32_t r0_3 = sub_d2f3c(*(r4 + 0x34), "%s:%d: %s", &var_5c)
bool cond:0 = r7 == 0

if (r7 != 0)
    int32_t r5_1 = r0_3
    r6 = *(r4 + 0x34)
    
    if (r7 - 0x11f u> 2)
        goto label_ce838
    
    r7 = *(r4 + 0x3c)
    int32_t r1_1 = r7[1]
    int32_t r2_1 = r7[2]
    int32_t r3_1 = r1_1 + 1
    cond:0 = r3_1 == r2_1
    char* r0_8
    
    if (r3_1 u<= r2_1)
        r0_8 = *r7
    label_ce8ec:
        r7[1] = r3_1
        r0_8[r1_1] = 0
        sub_d2f3c(*(r4 + 0x34), "'%s'", **(r4 + 0x3c))
    else
        if (r2_1 u< 0x7ffffffe)
            int32_t temp2_1 = r2_1 << 1
            cond:0 = 0xfffffffe == temp2_1
            
            if (0xfffffffe == temp2_1)
                sub_d14b4(r6)
                noreturn
            
            int32_t r8_2
            r0_8, r4, r5_1, r8_2 = sub_d14cc(r6, *r7, r2_1, r2_1 << 1)
            r1_1 = r7[1]
            *r7 = r0_8
            r3_1 = r1_1 + 1
            r7[2] = r8_2
            goto label_ce8ec
        
        sub_ce79c(r4, "lexical element too long", 0, r3_1, arg2)
    label_ce838:
        
        if (r7 s> 0x100)
            cond:0 = r7 == 0x11d
            
            if (r7 s<= 0x11d)
                sub_d2f3c(r6, "'%s'", (&_vtable_for_CState.IsWaitingForInput)[r7])
        else
            int32_t temp1_1 = zx.d(*(r7 + 0x1d12b5)) & 4
            cond:0 = temp1_1 == 0
            void* r1_2
            
            if (temp1_1 != 0)
                r1_2 = "'%c'"
            else
                r1_2 = "char(%d)"
            
            sub_d2f3c(r6, r1_2, r7)
    sub_d2f3c(r6, "%s near %s", r5_1)

void* r0_16
void* r1_4
uint32_t r2_5
r0_16, r1_4, r2_5 = sub_c8c5c(*(r4 + 0x34), 3)

if (not(cond:0))
    return sub_ce954(r0_16, r1_4, r2_5) __tailcall

*arg4 = r2_5:r1_4
jump(&data_ce938 - r6)
