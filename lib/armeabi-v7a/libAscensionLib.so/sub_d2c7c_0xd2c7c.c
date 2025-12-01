// 函数: sub_d2c7c
// 地址: 0xd2c7c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* s = arg2
int32_t* r10 = arg3
int32_t r0 = *__stack_chk_guard
char* i = strchr(arg2, 0x25)
void** r9 = arg1[2]
int32_t r8 = 0
void* r0_4 = arg1[6] - r9

while (i != 0)
    if (r0_4 s<= 0x2f)
        sub_c8e8c(arg1, 2)
        r9 = arg1[2]
    
    arg1[2] = &r9[4]
    void* r0_8
    int64_t q0_1
    r0_8, q0_1 = sub_d7eb4(arg1, s, i - s)
    *r9 = r0_8
    r9[2] = zx.d(*(r0_8 + 4)) | 0x40
    int32_t r2_1 = sx.d(i[1])
    char str[0x18]
    uint32_t r0_17
    int64_t* r0_18
    char* s_1
    int32_t* r0_15
    void* s_2
    uint32_t r2_2
    void** r5_1
    
    if (r2_1 - 0x63 u> 0x10)
        if (r2_1 != 0x25)
            sub_c89f0(arg1, "invalid option '%%%c' to 'lua_pushfstring'", r2_1)
            noreturn
        
        r5_1 = arg1[2]
        r2_2 = 1
        arg1[2] = &r5_1[4]
        r0_15 = arg1
        s_2 = &data_1c0f6d
    label_d2e4c:
        void* r0_21 = sub_d7eb4(r0_15, s_2, r2_2)
        *r5_1 = r0_21
        r5_1[2] = zx.d(*(r0_21 + 4)) | 0x40
    else
        switch (r2_1)
            case 0x63
                char r0_13 = (*r10).b
                r10 = &r10[1]
                s_2 = &str
                str[0] = r0_13
                r2_2 = 1
                r5_1 = arg1[2]
            label_d2e44:
                arg1[2] = &r5_1[4]
                r0_15 = arg1
                goto label_d2e4c
            case 0x64
                r0_18 = arg1[2]
                arg1[2] = &r0_18[2]
                int32_t r1_2 = *r10
                r10 = &r10[1]
                q0_1.d = r1_2
                unimplemented  {vcvt.f64.s32 d0, s0}
                r0_18[1].d = 3
                *r0_18 = q0_1
            case 0x65, 0x67, 0x68, 0x69, 0x6a, 0x6b, 0x6c, 0x6d, 0x6e, 0x6f, 0x71, 0x72
                sub_c89f0(arg1, "invalid option '%%%c' to 'lua_pushfstring'", r2_1)
                noreturn
            case 0x66
                r0_18 = arg1[2]
                arg1[2] = &r0_18[2]
                void* r1_5 = (r10 + 7) & 0xfffffff8
                r10 = r1_5 + 8
                r0_18[1].d = 3
                *r0_18 = *r1_5
            case 0x70
                int32_t r2_3 = *r10
                r10 = &r10[1]
                s_1 = &str
                r0_17 = sprintf(&str, "%p", r2_3)
            label_d2e34:
                r5_1 = arg1[2]
                r2_2 = r0_17
                s_2 = s_1
                goto label_d2e44
            case 0x73
                s_1 = *r10
                r10 = &r10[1]
                
                if (s_1 == 0)
                    s_1 = "(null)"
                
                r0_17 = strlen(s_1)
                goto label_d2e34
    s = &i[2]
    i = strchr(s, 0x25)
    r9 = arg1[2]
    r8 += 2
    r0_4 = arg1[6] - r9

if (r0_4 s<= 0x1f)
    sub_c8e8c(arg1, 1)
    r9 = arg1[2]

uint32_t r0_29 = strlen(s)
arg1[2] = &r9[4]
void* r0_32 = sub_d7eb4(arg1, s, r0_29)
*r9 = r0_32
r9[2] = zx.d(*(r0_32 + 4)) | 0x40

if (r8 != 0)
    sub_df3a0(arg1, r8 | 1)

if (*__stack_chk_guard == r0)
    return *(arg1[2] - 0x10) + 0x10

__stack_chk_fail()
noreturn
