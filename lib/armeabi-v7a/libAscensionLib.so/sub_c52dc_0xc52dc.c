// 函数: sub_c52dc
// 地址: 0xc52dc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *arg2
void* r6_1

if (r0 == 6)
label_c5398:
    r6_1 = &arg2[2]
    int32_t r0_8 = *r6_1
    
    if ((r0_8 & 0x100) == 0 && r0_8 s>= zx.d(*(arg1 + 0x2e)))
        arg1[0xc].b -= 1
    
    goto label_c53c0

int32_t r0_3

if (r0 == 0xb)
    r0_3 = *(*(*arg1 + 0xc) + (arg2[2] << 2))

uint32_t var_20
int32_t* r0_4
int32_t r1_6
uint32_t r2
int32_t r3_1

if (r0 != 0xb || (r0_3 & 0x3f) != 0x14)
    void* r1_7 = *arg1
    uint32_t r2_1 = zx.d(arg1[0xc].b)
    
    if (r2_1 u>= zx.d(*(r1_7 + 0x4e)))
        if (r2_1 u>= 0xf9)
            int32_t* r0_12
            int32_t* r1_10
            int32_t r9
            int64_t* pc
            r0_12, r1_10, r9 = sub_ce78c(arg1[3], "function or expression too complex", pc)
            return sub_c53f4(r0_12, r1_10) __tailcall
        
        *(r1_7 + 0x4e) = r2_1.b + 1
    
    arg1[0xc].b = r2_1.b + 1
    sub_c6170(arg1, arg2, 0xffffffff + zx.d(r2_1.b + 1))
    
    if (*arg2 == 6)
        goto label_c5398
    
    r6_1 = &arg2[2]
label_c53c0:
    r3_1 = *r6_1
    r0_4 = arg1
    r1_6 = 0x1c
    r2 = 0xff
    var_20 = arg3
else
    r2 = r0_3 u>> 0x17
    r0_4 = arg1
    r3_1 = 0
    arg1[5] -= 1
    int32_t temp0_1 = 0
    uint32_t i = arg3
    
    while (i != 0)
        i u>>= 1
        temp0_1 += 1
    
    var_20 = (0x20 - temp0_1) u>> 5
    r1_6 = 0x1b

int32_t* sp = sub_c63d0(r0_4, r1_6, r2, r3_1, var_20) - 0x10
*sp
sp[1]
sp[2]
sp[3]
sp[4]
jump(sp[5])
