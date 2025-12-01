// 函数: sub_d64fc
// 地址: 0xd64fc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6
int32_t var_1c = r6
int32_t* r5 = arg1
int32_t r0 = *__stack_chk_guard
int32_t* r4 = r5[0xc]
char r10 = r4[0xc].b
bool cond:0
int32_t var_40
int32_t* r6_2

if (r5[4] != 0x120)
    sub_cea80(r5)
    sub_d56a0(r5, &var_40, 0, r6)
    sub_c4d50(r5[0xc], &var_40)
    int32_t r0_9 = r5[4]
    cond:0 = r0_9 == 0x5d
    
    if (r0_9 == 0x5d)
        sub_cea80(r5)
        r6_2 = arg2 + 0x1c
    label_d65c0:
        *r6_2 += 1
        int32_t r0_13 = r5[4]
        cond:0 = r0_13 == 0x3d
        
        if (r0_13 == 0x3d)
            sub_cea80(r5)
            uint32_t r0_16 = sub_c4d64(r4, &var_40)
            void var_58
            sub_d56a0(r5, &var_58, 0, &var_58)
            int32_t r5_1 = *(*(arg2 + 0x18) + 8)
            uint32_t var_60 = sub_c4d64(r4, &var_58)
            int32_t* r9 = sub_c3d00(r4, 0xa, r5_1, r0_16, var_60)
            r4[0xc].b = r10
            int32_t r0_22 = *r9
            
            if (r0_22 == r0)
                return r0_22 - r0
            
            __stack_chk_fail()
            noreturn
        
        r5 = sub_d4018(sub_d6ecc(r5, 0x3d), 0x7ffffffd, "items in a constructor")
else
    r6_2 = arg2 + 0x1c
    int32_t r0_2 = *r6_2
    cond:0 = r0_2 == 0x7ffffffe
    
    if (r0_2 s< 0x7ffffffe)
        void* r7_1 = r5[6]
        sub_cea80(r5)
        int32_t r0_5 = sub_c4370(r5[0xc], r7_1)
        int32_t var_30_1 = 0xffffffff
        int32_t var_2c_1 = 0xffffffff
        var_40 = 4
        int32_t var_38_1 = r0_5
        goto label_d65c0
    
    r5 = sub_d4018(r4, 0x7ffffffd, "items in a constructor")
int16_t* r0_27
void* r1_7
int32_t r4_1
int32_t lr
r0_27, r1_7, r4_1, lr = sub_d6ecc(r5, 0x5d)

if (cond:0)
    *r0_27
    r0_27 -= r4_1

return sub_d6678(r0_27, r1_7) __tailcall
