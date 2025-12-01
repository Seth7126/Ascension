// 函数: sub_ce78c
// 地址: 0xce78c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r11
int32_t var_8 = r11
void* r0
int32_t r1
int32_t* r2_1
int32_t lr
r0, r1, r2_1, lr = sub_ce79c(arg1, arg2, *(arg1 + 0x10), arg3)
int32_t var_c = lr
int32_t* var_10 = &var_8
void* r4 = r0
void var_64
void* r6 = &var_64
int32_t* r7 = r2_1
sub_d2f94(&var_64, *(r0 + 0x44) + 0x10, 0x3c)
*(r4 + 4)
int32_t r0_4 = sub_d2f3c(*(r4 + 0x34), "%s:%d: %s", &var_64)
bool cond:0 = r7 == 0

if (r7 != 0)
    int32_t r5_1 = r0_4
    r6 = *(r4 + 0x34)
    
    if (r7 - 0x11f u> 2)
        goto label_ce838
    
    r7 = *(r4 + 0x3c)
    int32_t r1_2 = r7[1]
    int32_t r2_3 = r7[2]
    int32_t r3_1 = r1_2 + 1
    cond:0 = r3_1 == r2_3
    char* r0_9
    
    if (r3_1 u<= r2_3)
        r0_9 = *r7
    label_ce8ec:
        r7[1] = r3_1
        r0_9[r1_2] = 0
        sub_d2f3c(*(r4 + 0x34), "'%s'", **(r4 + 0x3c))
    else
        if (r2_3 u< 0x7ffffffe)
            int32_t temp2_1 = r2_3 << 1
            cond:0 = 0xfffffffe == temp2_1
            
            if (0xfffffffe == temp2_1)
                sub_d14b4(r6)
                noreturn
            
            int32_t r8_2
            r0_9, r4, r5_1, r8_2 = sub_d14cc(r6, *r7, r2_3, r2_3 << 1)
            r1_2 = r7[1]
            *r7 = r0_9
            r3_1 = r1_2 + 1
            r7[2] = r8_2
            goto label_ce8ec
        
        sub_ce79c(r4, "lexical element too long", nullptr, arg3, r3_1, r1)
    label_ce838:
        
        if (r7 s> 0x100)
            cond:0 = r7 == 0x11d
            
            if (r7 s<= 0x11d)
                sub_d2f3c(r6, "'%s'", (&_vtable_for_CState.IsWaitingForInput)[r7])
        else
            int32_t temp1_1 = zx.d(*(r7 + 0x1d12b5)) & 4
            cond:0 = temp1_1 == 0
            void* r1_3
            
            if (temp1_1 != 0)
                r1_3 = "'%c'"
            else
                r1_3 = "char(%d)"
            
            sub_d2f3c(r6, r1_3, r7)
    sub_d2f3c(r6, "%s near %s", r5_1)

void* r0_17
void* r1_5
uint32_t r2_7
r0_17, r1_5, r2_7 = sub_c8c5c(*(r4 + 0x34), 3)

if (not(cond:0))
    return sub_ce954(r0_17, r1_5, r2_7) __tailcall

*arg3 = r2_7:r1_5
jump(&data_ce938 - r6)
