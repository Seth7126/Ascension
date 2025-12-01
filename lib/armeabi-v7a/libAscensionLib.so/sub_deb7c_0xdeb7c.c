// 函数: sub_deb7c
// 地址: 0xdeb7c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = arg2[1].d

if (r0 == 3)
    int32_t r0_1 = arg3[1].d
    
    if (r0_1 == 3)
        int128_t q0
        q0.q = *arg3
        q0:8.q = *arg2
        unimplemented  {vcmpe.f64 d1, d0}
        unimplemented  {vmrs apsr_nzcv, fpscr}
        
        if (r0_1 - 3 s< 0)
            return 1
        
        return 0
else if ((r0 & 0xf) == 4 && (arg3[1].d & 0xf) == 4)
    void* r7 = *arg3
    void* r6_1 = *arg2
    char* __s2 = r7 + 0x10
    void* r4_1 = r6_1 + 0x10
    int32_t i = strcoll(r4_1, __s2)
    
    if (i == 0)
        int32_t r6_2 = *(r6_1 + 0xc)
        int32_t r7_3 = *(r7 + 0xc)
        
        do
            uint32_t r0_21 = strlen(r4_1)
            
            if (r0_21 == r7_3)
                return 0
            
            if (r0_21 == r6_2)
                return 1
            
            r4_1 += r0_21 + 1
            __s2 = &__s2[r0_21 + 1]
            i = strcoll(r4_1, __s2)
            r7_3 -= r0_21 + 1
            r6_2 -= r0_21 + 1
        while (i == 0)
    
    return i u>> 0x1f

int32_t r8 = arg1[2]
int32_t* r0_9 = sub_dc704(arg1, arg2, 0xd)

if (r0_9[2] == 0)
    r0_9 = sub_dc704(arg1, arg3, 0xd)
    
    if (r0_9[2] == 0)
        sub_c8aa4(arg1, arg2, arg3)
        noreturn

int32_t* r1_5 = arg1[2]
int32_t r7_1 = arg1[7]
arg1[2] = &r1_5[4]
int32_t r3 = r0_9[1]
*r1_5 = *r0_9
r1_5[1] = r3
r1_5[2] = r0_9[2]
int32_t* r0_12 = arg1[2]
arg1[2] = &r0_12[4]
int32_t r2_2 = *(arg2 + 4)
*r0_12 = *arg2
r0_12[1] = r2_2
r0_12[2] = arg2[1].d
int32_t* r0_13 = arg1[2]
arg1[2] = &r0_13[4]
int32_t r2_3 = *(arg3 + 4)
*r0_13 = *arg3
r0_13[1] = r2_3
r0_13[2] = arg3[1].d
sub_c9774(arg1, arg1[2] - 0x30, 1, zx.d(*(arg1[4] + 0x12)) & 1, r8)
int32_t r0_16 = arg1[2]
void* r1_14 = arg1[7]
arg1[2] = r0_16 - 0x10
int32_t r3_2 = *(r0_16 - 0xc)
int32_t* r1_15 = r1_14 + r8 - r7_1
*r1_15 = *(r0_16 - 0x10)
r1_15[1] = r3_2
r1_15[2] = *(r0_16 - 8)
int32_t* r1_16 = arg1[2]
int32_t r0_18 = r1_16[2]

if (r0_18 == 0)
    return r0_18

if (r0_18 != 1)
    return 1

int32_t r0_19 = *r1_16

if (r0_19 != 0)
    return 1

return r0_19
