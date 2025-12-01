// 函数: sub_cbfc0
// 地址: 0xcbfc0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r7 = arg1[3]
int32_t* r0_1 = *(r7 + 0x68)
int32_t r1 = *(r7 + 0x44)
*(r7 + 0x68) = *r0_1
*r0_1 = r1
*(r7 + 0x44) = r0_1
char r1_1 = *(r0_1 + 5)
*(r0_1 + 5) = r1_1 & 0xef

if (zx.d(*(r7 + 0x3d)) u>= 2)
    *(r0_1 + 5) = (*(r7 + 0x3c) & 3) | (r1_1 & 0xa8)

int32_t* var_38 = r0_1
int32_t* r0_3 = zx.d(r0_1[1].b) | 0x40
int32_t* r0_5 = sub_dc704(arg1, &var_38, 2)

if (r0_5 != 0 && (r0_5[2] & 0xf) == 6)
    char r8_1 = *(r7 + 0x3f)
    char r9_1 = *(arg1 + 0x29)
    *(arg1 + 0x29) = 0
    *(r7 + 0x3f) = 0
    int32_t* r1_7 = arg1[2]
    int32_t r5_1 = r0_5[1]
    *r1_7 = *r0_5
    r1_7[1] = r5_1
    r1_7[2] = r0_5[2]
    int32_t** r0_8 = arg1[2] + 0x10
    *r0_8 = var_38
    int32_t* var_34
    r0_8[1] = var_34
    r0_8[2] = r0_3
    int32_t r0_9 = arg1[2]
    int32_t r3_4 = r0_9 - arg1[7]
    arg1[2] = r0_9 + 0x20
    int32_t r0_11
    int32_t r1_9
    r0_11, r1_9 = sub_c9e5c(arg1, sub_cce70, 0, r3_4, 0)
    bool cond:1_1 = arg2 != 0
    *(arg1 + 0x29) = r9_1
    
    if (arg2 != 0)
        r1_9 = r0_11
        cond:1_1 = r0_11 != 0
    
    *(r7 + 0x3f) = r8_1
    
    if (cond:1_1)
        bool cond:2 = r1_9 == 2
        bool cond:3 = r1_9 == 2
        
        if (r1_9 == 2)
            int32_t r0_14 = arg1[2]
            int32_t r1_12 = *(r0_14 - 8) & 0xf
            cond:2 = r1_12 == 4
            cond:3 = r1_12 == 4
            char const* const r2_5
            
            if (r1_12 != 4)
                r2_5 = "no message"
            else
                r2_5 = *(r0_14 - 0x10) + 0x10
            
            sub_d2f3c(arg1, "error in __gc metamethod (%s)", r2_5)
            r1_9 = 5
        
        int32_t* r0_18
        int32_t r1_13
        char r2_6
        r0_18, r1_13, r2_6 = sub_c8c5c(arg1, r1_9)
        
        if (cond:2)
            int32_t r2_7 = r1_13 & r0_18 u>> zx.d(r2_6)
            cond:3 = r2_7 == 0
            
            if (r2_7 == 0)
                *r0_18 = r0_18.w
                jump(r1_13 * __stack_chk_guard)
        
        if (cond:3)
            jump(r0_18 * __stack_chk_guard)
        
        return sub_cc158(r0_18) __tailcall

int32_t r0_12 = *__stack_chk_guard

if (r0_12 == r0)
    return r0_12 - r0

__stack_chk_fail()
noreturn
