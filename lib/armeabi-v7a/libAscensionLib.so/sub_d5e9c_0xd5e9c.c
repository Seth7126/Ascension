// 函数: sub_d5e9c
// 地址: 0xd5e9c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r4 = arg1
int32_t r0 = *__stack_chk_guard
int32_t* r8 = r4[0xc]
int32_t* r5 = r4[0xd]
void* r6 = *r8
int32_t r7 = *(r6 + 0x38)

if (r8[9] s>= r7)
    char const* const var_74_1 = "functions"
    int32_t r0_3 = sub_d1388(r5, *(r6 + 0x10), r6 + 0x38, 4, 
        "censionrules59MayPutAcquiredLifeboundHeroOrMechanaConstructOnDeckEachTurnEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj")
    int32_t r1_1 = *(r6 + 0x38)
    *(r6 + 0x10) = r0_3
    
    if (r7 s< r1_1)
        *(r0_3 + (r7 << 2)) = 0
        int32_t r0_4 = r7 + 1
        
        if (r0_4 s< r1_1)
            do
                *(*(r6 + 0x10) + (r0_4 << 2)) = 0
                r0_4 += 1
            while (r1_1 != r0_4)

void* r0_6 = sub_cac44(r5)
int32_t r1_2 = r8[9]
int32_t r0_7 = *(r6 + 0x10)
r8[9] = r1_2 + 1
*(r0_7 + (r1_2 << 2)) = r0_6

if ((zx.d(*(r0_6 + 5)) & 3) != 0 && (zx.d(*(r6 + 5)) & 4) != 0)
    sub_cade0(r5, r6, r0_6)

int32_t r5_1 = 0
void* var_5c = r0_6
*(r0_6 + 0x40) = arg4
int32_t* r6_1 = r4[0xd]
int32_t var_54 = r4[0xc]
r4[0xc] = &var_5c
char var_2c = 0
int24_t var_30 = 0
int32_t var_44 = 0
int32_t var_48 = 0
int32_t var_40 = 0xffffffff
int32_t var_3c = 0
int32_t var_38 = 0
void* r0_12
int32_t r1_3
r1_3:r0_12 = *(r4 + 0x40)
int32_t var_34 = *(r0_12 + 4)
int32_t var_4c = 0
*(r0_6 + 0x4e) = 2
*(r0_6 + 0x24) = r1_3
void* r0_15 = sub_dafac(r6_1)
void* var_58 = r0_15
void** r1_4 = r6_1[2]
r1_4[2] = 0x45
*r1_4 = r0_15
int32_t r1_5 = r6_1[6]
int32_t r0_17 = r6_1[2] + 0x10
r6_1[2] = r0_17

if (r1_5 - r0_17 s<= 0xf)
    sub_c8e8c(r6_1, 0)

char var_5e = 0
char var_60 = var_30:2.b
void* r0_21 = r4[0x10]
int16_t var_64 = (*(r0_21 + 0x1c)).w
char var_5f = 0
int16_t var_62 = (*(r0_21 + 0x10)).w
int32_t var_68
int32_t* var_4c_1 = &var_68
var_68 = var_4c
int32_t r0_23 = r4[4]
bool cond:1 = r0_23 == 0x28
int64_t* pc

if (r0_23 != 0x28)
    r4, pc = sub_d6ecc(r4, 0x28)
    sub_ce78c(r4, "<name> or '...' expected", pc)
else
    int32_t r9_1
    r9_1, pc = sub_cea80(r4)
    int32_t* r7_2
    void* r8_1
    
    if (r9_1 == 0)
        r7_2 = r4[0xc]
        r8_1 = *r7_2
    else
        pc = sub_d6678(r4, sub_ce954(r4, "self", 4))
        r7_2 = r4[0xc]
        void* r0_28 = r7_2[3]
        r8_1 = *r7_2
        char r3_2 = *(r7_2 + 0x2e) + 1
        int32_t r2_5 = r7_2[0xa]
        int32_t r1_8 = r7_2[5]
        *(r7_2 + 0x2e) = r3_2
        *(*(r8_1 + 0x18) + sx.d(*(**(r0_28 + 0x40) + ((r2_5 + zx.d(r3_2)) << 1) - 2)) * 0xc + 4) =
            r1_8
    
    int32_t i_2 = 0
    *(r8_1 + 0x4d) = 0
    int32_t r0_35 = r4[4]
    
    if (r0_35 == 0x29)
        goto label_d6120
    
    i_2 = 0
    
    if (r0_35 == 0x120)
        while (true)
            r4[6]
            sub_d6678(r4, sub_cea80(r4))
            
            if (zx.d(*(r8_1 + 0x4d)) != 0 || r4[4] != 0x2c)
                i_2 += 1
                break
            
            i_2 += 1
            pc = sub_cea80(r4)
            r0_35 = r4[4]
            
            if (r0_35 != 0x120)
                goto label_d6108
            
            continue
        
        goto label_d6120
    
label_d6108:
    cond:1 = r0_35 == 0x118
    
    if (r0_35 != 0x118)
        sub_ce78c(r4, "<name> or '...' expected", pc)
    else
        sub_cea80(r4)
        *(r8_1 + 0x4d) = 1
    label_d6120:
        int32_t* r1_9 = r4[0xc]
        char r2_8 = *(r1_9 + 0x2e) + i_2.b
        *(r1_9 + 0x2e) = r2_8
        
        if (i_2 != 0)
            int32_t r0_38 = r1_9[5]
            r5_1 = r1_9[0xa] + zx.d(r2_8) - i_2
            int32_t r1_12 = *(*r1_9 + 0x18)
            int16_t* r2_10 = **(r1_9[3] + 0x40) + (r5_1 << 1)
            int32_t i
            
            do
                int32_t r3_4 = sx.d(*r2_10)
                r2_10 = &r2_10[1]
                i = i_2
                i_2 -= 1
                *(r1_12 + r3_4 * 0xc + 4) = r0_38
            while (i != 1)
        
        uint32_t r1_13 = zx.d(*(r7_2 + 0x2e))
        *(r8_1 + 0x4c) = r1_13.b
        sub_c4328(r7_2, r1_13)
        int32_t r0_40 = r4[4]
        cond:1 = r0_40 == 0x29
        
        if (r0_40 == 0x29)
            sub_cea80(r4)
            int32_t* i_1
            
            do
                i_1 = r4[4]
                
                if (i_1 - 0x104 u<= 0x1a && (0x4020007 & 1 << ((i_1 - 0x104) & 0xff)) != 0)
                    break
                
                sub_d4098(r4, 0x112, i_1, 1)
            while (i_1 != 0x112)
            *(var_5c + 0x44) = r4[1]
            sub_d507c(r4, 0x106, 0x109, arg4)
            int32_t* r6_2 = *(r4[0xc] + 8)
            int32_t r0_49 = sub_c3dd0(r6_2, 0x25, 0, r6_2[9] - 1)
            arg2[4] = 0xffffffff
            arg2[5] = 0xffffffff
            *arg2 = 0xb
            arg2[2] = r0_49
            sub_d3e50(sub_c482c(r6_2, arg2, arg2.b))
            int32_t r0_52 = *__stack_chk_guard
            
            if (r0_52 == r0)
                return r0_52 - r0
            
            __stack_chk_fail()
            noreturn
int32_t* r0_63
int32_t* r1_19
int32_t r4_2
int32_t r12
int16_t* lr
r0_63, r1_19, r4_2, r12, lr = sub_d6ecc(r4, 0x29)

if (cond:1 && (r0_63 & r12 s>> 6) == 0)
    *lr = (lr & r5_1 s>> 6).w

return sub_d62fc(r0_63, r1_19) __tailcall
