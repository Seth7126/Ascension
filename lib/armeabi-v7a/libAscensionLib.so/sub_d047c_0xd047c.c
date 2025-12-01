// 函数: sub_d047c
// 地址: 0xd047c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r6 = arg1[0xf]
int32_t* r4 = arg1
int32_t r8 = *arg1
int32_t r1 = r6[1]
int32_t r2 = r6[2]
int32_t r3 = r1 + 1
int32_t* r0
char* r0_1

if (r3 u<= r2)
    r0_1 = *r6
else
    if (r2 u>= 0x7ffffffe)
    label_d05f4:
        int64_t* pc
        r0 = sub_ce79c(r4, "lexical element too long", nullptr, pc, r3)
    label_d05f8:
        sub_d14b4(r0)
        noreturn
    
    r0 = r4[0xd]
    
    if (0xfffffffe == r2 << 1)
        goto label_d05f8
    
    int32_t r5_2
    r0_1, r4, r5_2, r8 = sub_d14cc(r0, *r6, r2, r2 << 1)
    r1 = r6[1]
    *r6 = r0_1
    r3 = r1 + 1
    r6[2] = r5_2

r6[1] = r3
r0_1[r1] = r8.b
int32_t* r0_2 = r4[0xe]
int32_t r1_2 = *r0_2
*r0_2 = r1_2 - 1
uint32_t i

if (r1_2 == 0)
    i = sub_e0ffc(r0_2)
else
    char* r1_3 = r0_2[1]
    r0_2[1] = &r1_3[1]
    i = zx.d(*r1_3)

int32_t result = 0
*r4 = i

if (i == 0x3d)
    result = 0
    int32_t r9_1 = 0xfffffffe
    
    do
        int32_t* r7_1 = r4[0xf]
        int32_t r1_4 = r7_1[1]
        int32_t r2_3 = r7_1[2]
        r3 = r1_4 + 1
        char* r0_3
        
        if (r3 u<= r2_3)
            r0_3 = *r7_1
        else
            if (r2_3 u>= 0x7ffffffe)
                goto label_d05f4
            
            r0 = r4[0xd]
            
            if (r9_1 == r2_3 << 1)
                goto label_d05f8
            
            int32_t r6_1 = r2_3 << 1
            r0_3, r4, result, r8, r9_1 = sub_d14cc(r0, *r7_1, r2_3, r6_1)
            r1_4 = r7_1[1]
            *r7_1 = r0_3
            r3 = r1_4 + 1
            r7_1[2] = r6_1
        
        r7_1[1] = r3
        r0_3[r1_4] = 0x3d
        int32_t* r0_4 = r4[0xe]
        int32_t r1_6 = *r0_4
        *r0_4 = r1_6 - 1
        
        if (r1_6 == 0)
            i = sub_e0ffc(r0_4)
        else
            char* r1_7 = r0_4[1]
            r0_4[1] = &r1_7[1]
            i = zx.d(*r1_7)
        
        result += 1
        *r4 = i
    while (i == 0x3d)

if (i != r8)
    return not.d(result)

return result
