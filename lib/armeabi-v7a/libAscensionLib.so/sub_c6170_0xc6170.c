// 函数: sub_c6170
// 地址: 0xc6170
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t* r9 = sub_c471c(arg1, arg2)
int32_t r0_2 = *arg2
int32_t r7_3

if (r0_2 - 1 u<= 0xa)
    switch (r0_2)
        case 1
            int32_t r1_4 = arg1[5]
            
            if (r1_4 s<= arg1[6])
                goto label_c63a4
            
            int32_t r12_1 = *(*arg1 + 0xc)
            int32_t r2 = *(r12_1 + ((r1_4 - 1) << 2))
            
            if ((r2 & 0x3f) != 4)
                goto label_c63a4
            
            uint32_t r7_2 = (r2 u>> 0x17) + zx.d((r2 u>> 6).b)
            uint32_t r3_3 = r2 u>> 6 & 0xff
            
            if ((r3_3 s> arg3 || r7_2 + 1 s< arg3) && (r3_3 s< arg3 || r3_3 s> arg3 + 1))
                goto label_c63a4
            
            if (r3_3 s>= arg3)
                r3_3 = arg3
            
            if (r7_2 s<= arg3)
                r7_2 = arg3
            
            *(r12_1 + ((r1_4 - 1) << 2)) =
                (r2 & 0x7fc03f) | (r3_3 & 0xff) << 6 | (r7_2 - r3_3) << 0x17
            *arg2 = 6
            arg2[2] = arg3
        case 2, 3
            int32_t temp0_1 = 0
            uint32_t i = r0_2 - 2
            
            while (i != 0)
                i u>>= 1
                temp0_1 += 1
            
            goto label_c63a4
        case 4
            r7_3 = arg2[2]
        label_c6378:
            
            if (r7_3 s< "ensionrules59MayPutAcquiredLifeboundHeroOrMechanaConstructOnDeckEachTurnEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj")
                goto label_c63a4
            
            sub_c4198(arg1)
        label_c63a4:
            r9 = sub_c4198(arg1)
            *arg2 = 6
            arg2[2] = arg3
        case 5
            int64_t q0_1 = *(arg2 + 8)
            int64_t var_30 = q0_1
            unimplemented  {vcmp.f64 d0, #0.000000}
            int32_t* r8_1 = *(arg1[3] + 0x34)
            unimplemented  {vmrs apsr_nzcv, fpscr}
            int32_t var_38_1 = 3
            int64_t var_40 = q0_1
            
            if (r0_2 - 0xb s< 0 || r0_2 - 1 s> 0xa)
                r7_3 = sub_c43c8(arg1, &var_40, &var_40)
            else
                void** r7_4 = r8_1[2]
                r8_1[2] = &r7_4[4]
                void* r0_22 = sub_d7eb4(r8_1, &var_30, 8)
                *r7_4 = r0_22
                r7_4[2] = zx.d(*(r0_22 + 4)) | 0x40
                r7_3 = sub_c43c8(arg1, r8_1[2] - 0x10, &var_40)
                r8_1[2] -= 0x10
            
            goto label_c6378
        case 6
            if (arg2[2] != arg3)
                goto label_c63a4
            
            *arg2 = 6
            arg2[2] = arg3
        case 0xb
            int32_t r1_7 = arg2[2]
            int32_t r0_19 = *(*arg1 + 0xc)
            *(r0_19 + (r1_7 << 2)) = (*(r0_19 + (r1_7 << 2)) & 0xffffc03f) | (arg3 & 0xff) << 6
            *arg2 = 6
            arg2[2] = arg3
int32_t r0_34 = *r9

if (r0_34 == r0)
    return r0_34 - r0

__stack_chk_fail()
noreturn
