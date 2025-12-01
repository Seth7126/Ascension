// 函数: sub_ddbec
// 地址: 0xddbec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r7
int32_t var_c = r7
int32_t (* const r6)() = __stack_chk_guard
int32_t r0 = *__stack_chk_guard
uint32_t r0_1 = zx.d(*arg4)

if (r0_1 == 0x1b)
    arg4 = "binary string"
else if (r0_1 == 0x40 || r0_1 == 0x3d)
    arg4 = &arg4[1]

char* var_48 = arg4
int32_t* var_54 = arg1
int32_t* var_50 = arg2
int32_t s1 = 0x61754c1b
int32_t var_4c = arg3
int32_t var_2c = 0x4010052
char* const var_28 = "terSequenceE"
int16_t var_20 = 0xa1a
int32_t var_24 = 0xa0d9319
char s2 = 0x1b
void var_41
int32_t r8
int32_t r10

if (sub_e1090(arg2, &var_41, 0x11) != 0)
    sub_de668(&var_54, arg2.b)
else if (memcmp(&s1, &s2, 0x12) == 0)
    void* result = sub_caa04(arg1, 1)
    void** r0_8 = arg1[2]
    r0_8[2] = 0x46
    *r0_8 = result
    int32_t r1_2 = arg1[6]
    int32_t r0_10 = arg1[2] + 0x10
    arg1[2] = r0_10
    
    if (r1_2 - r0_10 s<= 0xf)
        sub_c8e8c(arg1, 0)
    
    void* r0_14 = sub_cac44(arg1)
    *(result + 0xc) = r0_14
    sub_dde0c(&var_54, r0_14, r6, r8, r10)
    void* r7_1 = *(result + 0xc)
    int32_t r1_4 = *(r7_1 + 0x28)
    
    if (r1_4 != 1)
        void* result_1 = sub_caa04(arg1, r1_4)
        *(result_1 + 0xc) = r7_1
        result = result_1
        int32_t r0_17 = arg1[2]
        *(r0_17 - 8) = 0x46
        *(r0_17 - 0x10) = result
    
    if (*__stack_chk_guard == r0)
        return result
    
    __stack_chk_fail()
    noreturn

int32_t r0_22 = s2.d
int32_t s1_1 = s1
bool cond:0 = s1_1 == r0_22

if (s1_1 != r0_22)
    sub_de668(&var_54, arg2.b)
    sub_de668(&var_54, arg2.b)
else
    int32_t r0_24 = memcmp(&s1, &s2, 6)
    cond:0 = r0_24 == 0
    
    if (r0_24 != 0)
        sub_de668(&var_54, arg2.b)
    else
        int32_t r0_26 = memcmp(&s1, &s2, 0xc)
        cond:0 = r0_26 == 0
        
        if (r0_26 == 0)
            sub_de668(&var_54, arg2.b)
            sub_de668(&var_54, arg2.b)
            sub_de668(&var_54, arg2.b)

void* r0_31
void* r1_13
int32_t r4_1
int64_t* lr
r0_31, r1_13, r4_1, lr = sub_de668(&var_54, arg2.b)

if (cond:0)
    r0_31 &= r4_1 << 0xc
    
    if (r0_31 == 0)
        *lr

return sub_dde0c(r0_31, r1_13, r6, r8, r10) __tailcall
