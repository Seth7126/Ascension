// 函数: sub_dfc88
// 地址: 0xdfc88
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r7
int32_t var_18 = r7
int32_t r6
int32_t var_1c = r6
int32_t r5
int32_t var_20 = r5
int32_t r4
int32_t var_24 = r4
unimplemented  {vpush {d8, d9}}
int32_t r0 = *__stack_chk_guard
int32_t* r6_1 = arg1[4]

while (true)
    void* lr_2 = &r6_1[7]
    int64_t* r12_1 = r6_1[6]
    void* r0_3 = **r6_1
    void* var_40_1 = lr_2
    int64_t* r0_5 = *(*(r0_3 + 0xc) + 8)
    
    while (true)
        int32_t* r0_7 = *lr_2
        *lr_2 = &r0_7[1]
        uint32_t r6_3 = zx.d(arg1[0xa].b)
        int32_t r5_1 = *r0_7
        
        if ((r6_3 & 0xc) == 0)
            goto label_dfe2c
        
        int32_t r0_9 = arg1[0xc] - 1
        arg1[0xc] = r0_9
        
        if ((r6_3 & 4) == 0 && r0_9 != 0)
            goto label_dfe2c
        
        int32_t* r4_1 = arg1[4]
        int32_t r7_1 = 0
        
        if ((r6_3 & 8) != 0 && r0_9 == 0)
            r7_1 = 1
            arg1[0xc] = arg1[0xb]
        
        int32_t r0_11 = sx.d(*(r4_1 + 0x12))
        int64_t* entry_r2
        int128_t q0
        int128_t q4
        
        if (r0_11 s<= 0xffffffff)
            *(r4_1 + 0x12) = r0_11.b & 0x7f
        label_dfe28:
            r12_1 = r6_1[6]
        label_dfe2c:
            int32_t r0_26 = r5_1 & 0x3f
            int32_t r8 = r5_1 u>> 6 & 0xff
            
            if (r0_26 u> 0x26)
                continue
            else
                int64_t* r9_1 = &r12_1[r8 * 2]
                int32_t x
                void* y
                int32_t r0_28
                int32_t r0_83
                uint32_t r0_103
                int32_t x_1
                int32_t x_2
                int64_t* r1_4
                int32_t* r1_21
                int32_t* r1_25
                void* r2_11
                int64_t* r2_16
                int32_t* r2_20
                void* r3_2
                int64_t* r3_15
                void* r3_18
                
                switch (r0_26)
                    case 0
                        r1_4 = r12_1
                        r0_28 = 0x1ff0 & r5_1 u>> 0x13
                    label_e04c4:
                        void* r1_32 = r1_4 + r0_28
                        int32_t r0_112 = *r1_32
                        entry_r2 = *(r1_32 + 4)
                        *(r9_1 + 4) = entry_r2
                        *r9_1 = r0_112
                        r9_1[1].d = *(r1_32 + 8)
                        continue
                    case 1
                        r0_28 = 0x3ffff0 & r5_1 u>> 0xa
                        r1_4 = r0_5
                        goto label_e04c4
                    case 2
                        int32_t* r0_104 = *lr_2
                        *lr_2 = &r0_104[1]
                        r0_28 = 0x3ffffff0 & *r0_104 u>> 2
                        r1_4 = r0_5
                        goto label_e04c4
                    case 3
                        void* r1_31 = &r12_1[r8 * 2]
                        *r1_31 = r5_1 u>> 0x17
                        *(r1_31 + 8) = 1
                        
                        if ((r5_1 & 0x7fc000) == 0)
                            continue
                        
                        *lr_2 += 4
                        continue
                    case 4
                        uint32_t i_4 = not.d(r5_1 u>> 0x17)
                        void* r0_82 = &r12_1[r8 * 2 + 1]
                        uint32_t i
                        
                        do
                            entry_r2 = nullptr
                            i = i_4
                            i_4 += 1
                            *r0_82 = 0
                            r0_82 += 0x10
                        while (i != 0xffffffff)
                        continue
                    case 5
                        int64_t** r0_124 = *(*(r0_3 + (r5_1 u>> 0x17 << 2) + 0x10) + 8)
                        entry_r2 = r0_124[1]
                        int64_t** temp0_7 = r9_1
                        *temp0_7 = *r0_124
                        temp0_7[1] = entry_r2
                        r9_1[1].d = r0_124[2]
                        continue
                    case 6
                        r2_11 = r0_5 + (0xff0 & r5_1 u>> 0xa)
                        r0_83 = 0x1ff0 & r5_1 u>> 0xa
                        r1_21 = *(*(r0_3 + (r5_1 u>> 0x17 << 2) + 0x10) + 8)
                        goto label_e0660
                    case 7
                        r2_11 = r0_5 + (0xff0 & r5_1 u>> 0xa)
                        
                        if ((r5_1 & 0x400000) == 0)
                            r2_11 = r12_1 + (0x1ff0 & r5_1 u>> 0xa)
                        
                        entry_r2, q0, q4 =
                            sub_de7c0(arg1, r12_1 + (0x1ff0 & r5_1 u>> 0x13), r2_11, r9_1)
                        goto label_e0760
                    case 8
                        r2_20 = &r12_1[(r5_1 u>> 0x17) * 2]
                        
                        if (r5_1 s< 0)
                            r2_20 = &r0_5[(r5_1 u>> 0x17 & 0xff) * 2]
                        
                        r3_18 = r0_5 + (0xff0 & r5_1 u>> 0xa)
                        
                        if ((r5_1 & 0x400000) == 0)
                            r3_18 = r12_1 + (0x1ff0 & r5_1 u>> 0xa)
                        
                        entry_r2, q0, q4 =
                            sub_de974(arg1, *(*(r0_3 + (r8 << 2) + 0x10) + 8), r2_20, r3_18, r8)
                        goto label_e0760
                    case 9
                        void* r1_23 = *(r0_3 + (r5_1 u>> 0x17 << 2) + 0x10)
                        void* r0_86 = *(r1_23 + 8)
                        int32_t r3_13 = *(r9_1 + 4)
                        *r0_86 = *r9_1
                        *(r0_86 + 4) = r3_13
                        entry_r2 = r9_1[1].d
                        *(r0_86 + 8) = entry_r2
                        
                        if ((zx.d(r9_1[1].b) & 0x40) == 0)
                            continue
                        else
                            entry_r2 = *r9_1
                            
                            if ((zx.d(*(entry_r2 + 5)) & 3) == 0)
                                continue
                            else if ((zx.d(*(r1_23 + 5)) & 4) == 0)
                                continue
                            else
                                entry_r2 = sub_cade0(arg1, r1_23, entry_r2)
                                lr_2 = var_40_1
                                continue
                    case 0xa
                        r2_20 = &r12_1[(r5_1 u>> 0x17) * 2]
                        
                        if (r5_1 s< 0)
                            r2_20 = &r0_5[(r5_1 u>> 0x17 & 0xff) * 2]
                        
                        r3_18 = r0_5 + (0xff0 & r5_1 u>> 0xa)
                        
                        if ((r5_1 & 0x400000) == 0)
                            r3_18 = r12_1 + (0x1ff0 & r5_1 u>> 0xa)
                        
                        entry_r2, q0, q4 = sub_de974(arg1, r9_1, r2_20, r3_18, r8)
                        goto label_e0760
                    case 0xb
                        void* r0_62
                        r0_62, entry_r2, r9_1, q0, q4 = sub_dafac(arg1)
                        void* r4_6 = &r12_1[r8 * 2]
                        *r4_6 = r0_62
                        *(r4_6 + 8) = 0x45
                        int32_t r7_4 = r5_1 u>> 0xe & 0x1ff
                        
                        if ((r7_4 | r5_1 u>> 0x17) != 0)
                            entry_r2 = sub_daa54(arg1, r0_62, sub_d27f8(r5_1 u>> 0x17), 
                                sub_d27f8(r7_4), r8, x)
                        
                        goto label_e0b5c
                    case 0xc
                        r0_83 = 0x1ff0 & r5_1 u>> 0xa
                        r1_21 = r12_1 + (0x1ff0 & r5_1 u>> 0x13)
                        int32_t r2_8 = *r1_21
                        *(r9_1 + 0x14) = r1_21[1]
                        r9_1[2].d = r2_8
                        r9_1[3].d = r1_21[2]
                        r2_11 = r0_5 + (0xff0 & r5_1 u>> 0xa)
                    label_e0660:
                        
                        if ((r5_1 & 0x400000) != 0)
                            entry_r2, q0, q4 = sub_de7c0(arg1, r1_21, r2_11, r9_1)
                            goto label_e0760
                        
                        entry_r2, q0, q4 = sub_de7c0(arg1, r1_21, r12_1 + r0_83, r9_1)
                        goto label_e0760
                    case 0xd
                        entry_r2 = &r12_1[(r5_1 u>> 0x17) * 2]
                        
                        if (r5_1 s< 0)
                            entry_r2 = &r0_5[(r5_1 u>> 0x17 & 0xff) * 2]
                        
                        r3_2 = r0_5 + (0xff0 & r5_1 u>> 0xa)
                        
                        if ((r5_1 & 0x400000) == 0)
                            r3_2 = r12_1 + (0x1ff0 & r5_1 u>> 0xa)
                        
                        if (entry_r2[1].d != 3 || *(r3_2 + 8) != 3)
                            x_1 = 6
                            goto label_e05d0
                        
                        q0.q = *r3_2
                        q0:8.q = *entry_r2
                        q0.q = q0:8.q f+ q0.q
                        goto label_e0df8
                    case 0xe
                        entry_r2 = &r12_1[(r5_1 u>> 0x17) * 2]
                        
                        if (r5_1 s< 0)
                            entry_r2 = &r0_5[(r5_1 u>> 0x17 & 0xff) * 2]
                        
                        r3_2 = r0_5 + (0xff0 & r5_1 u>> 0xa)
                        
                        if ((r5_1 & 0x400000) == 0)
                            r3_2 = r12_1 + (0x1ff0 & r5_1 u>> 0xa)
                        
                        if (entry_r2[1].d != 3 || *(r3_2 + 8) != 3)
                            x_1 = 7
                            goto label_e05d0
                        
                        q0.q = *r3_2
                        q0:8.q = *entry_r2
                        q0.q = q0:8.q f- q0.q
                        goto label_e0df8
                    case 0xf
                        entry_r2 = &r12_1[(r5_1 u>> 0x17) * 2]
                        
                        if (r5_1 s< 0)
                            entry_r2 = &r0_5[(r5_1 u>> 0x17 & 0xff) * 2]
                        
                        r3_2 = r0_5 + (0xff0 & r5_1 u>> 0xa)
                        
                        if ((r5_1 & 0x400000) == 0)
                            r3_2 = r12_1 + (0x1ff0 & r5_1 u>> 0xa)
                        
                        if (entry_r2[1].d != 3 || *(r3_2 + 8) != 3)
                            x_1 = 8
                            goto label_e05d0
                        
                        q0.q = *r3_2
                        q0:8.q = *entry_r2
                        q0.q = q0:8.q f* q0.q
                        goto label_e0df8
                    case 0x10
                        entry_r2 = &r12_1[(r5_1 u>> 0x17) * 2]
                        
                        if (r5_1 s< 0)
                            entry_r2 = &r0_5[(r5_1 u>> 0x17 & 0xff) * 2]
                        
                        r3_2 = r0_5 + (0xff0 & r5_1 u>> 0xa)
                        
                        if ((r5_1 & 0x400000) == 0)
                            r3_2 = r12_1 + (0x1ff0 & r5_1 u>> 0xa)
                        
                        if (entry_r2[1].d == 3 && *(r3_2 + 8) == 3)
                            q0.q = *r3_2
                            q0:8.q = *entry_r2
                            q0.q = q0:8.q f/ q0.q
                            goto label_e0df8
                        
                        x_1 = 9
                    label_e05d0:
                        x = x_1
                        entry_r2, q0, q4 = sub_df8a0(arg1, r9_1, entry_r2, r3_2, x)
                        goto label_e0760
                    case 0x11
                        r2_16 = &r12_1[(r5_1 u>> 0x17) * 2]
                        
                        if (r5_1 s< 0)
                            r2_16 = &r0_5[(r5_1 u>> 0x17 & 0xff) * 2]
                        
                        r3_15 = r0_5 + (0xff0 & r5_1 u>> 0xa)
                        
                        if ((r5_1 & 0x400000) == 0)
                            r3_15 = r12_1 + (0x1ff0 & r5_1 u>> 0xa)
                        
                        if (r2_16[1].d != 3 || r3_15[1].d != 3)
                            x_2 = 0xa
                        label_e0700:
                            x = x_2
                            entry_r2, q0, q4 = sub_df8a0(arg1, r9_1, r2_16, r3_15, x)
                            goto label_e0b84
                        
                        q4.q = *r3_15
                        q4:8.q = *r2_16
                        q0.q = q4:8.q f/ q4.q
                        unimplemented  {vmov r0, r1, d0}
                        entry_r2 = floor(x)
                        unimplemented  {vmov d0, r0, r1}
                        unimplemented  {vmls.f64 d9, d8, d0}
                        *r9_1 = q4:8.q
                    label_e0e2c:
                        r9_1[1].d = 3
                        lr_2 = var_40_1
                        continue
                    case 0x12
                        r2_16 = &r12_1[(r5_1 u>> 0x17) * 2]
                        
                        if (r5_1 s< 0)
                            r2_16 = &r0_5[(r5_1 u>> 0x17 & 0xff) * 2]
                        
                        r3_15 = r0_5 + (0xff0 & r5_1 u>> 0xa)
                        
                        if ((r5_1 & 0x400000) == 0)
                            r3_15 = r12_1 + (0x1ff0 & r5_1 u>> 0xa)
                        
                        if (r2_16[1].d != 3 || r3_15[1].d != 3)
                            x_2 = 0xb
                            goto label_e0700
                        
                        q0.q = *r2_16
                        q0:8.q = *r3_15
                        unimplemented  {vmov r0, r1, d0}
                        unimplemented  {vmov r2, r3, d1}
                        entry_r2 = pow(x, y)
                        unimplemented  {vmov d0, r0, r1}
                        *r9_1 = q0.q
                        goto label_e0e2c
                    case 0x13
                        entry_r2 = r12_1 + (0x1ff0 & r5_1 u>> 0x13)
                        
                        if (entry_r2[1].d != 3)
                            x = 0xc
                            entry_r2, q0, q4 = sub_df8a0(arg1, r9_1, entry_r2, entry_r2, 0xc)
                            goto label_e0760
                        
                        q0.q = *entry_r2
                        unimplemented  {vneg.f64 d0, d0}
                    label_e0df8:
                        *r9_1 = q0.q
                        r9_1[1].d = 3
                        continue
                    case 0x14
                        uint32_t r1_42 = r5_1 u>> 0x17
                        entry_r2 = 1
                        int32_t r3_16 = r12_1[r1_42 * 2 + 1].d
                        
                        if (r3_16 != 0)
                            if (r3_16 != 1)
                                entry_r2 = nullptr
                            else
                                int32_t temp0_8 = 0
                                uint32_t i_1 = r12_1[r1_42 * 2].d
                                
                                while (i_1 != 0)
                                    i_1 u>>= 1
                                    temp0_8 += 1
                                
                                entry_r2 = (0x20 - temp0_8) u>> 5
                        
                        int64_t** r1_92 = &r12_1[r8 * 2]
                        *r1_92 = entry_r2
                        r1_92[2] = 1
                        continue
                    case 0x15
                        entry_r2, q0, q4 = sub_df734(arg1, r9_1, r12_1 + (0x1ff0 & r5_1 u>> 0x13))
                    label_e0760:
                        lr_2 = var_40_1
                        r12_1 = r6_1[6]
                        continue
                    case 0x16
                        int32_t r0_156 = r5_1 u>> 0xe & 0x1ff
                        arg1[2] = &r12_1[r0_156 * 2 + 2]
                        q0, q4 = sub_df3a0(arg1, 1 - (r5_1 u>> 0x17) + r0_156)
                        uint32_t r1_61 = r5_1 u>> 0x17
                        void* r2_21 = r6_1[6]
                        void* r0_160 = r2_21 + (r1_61 << 4)
                        int32_t r7_10 = *(r0_160 + 4)
                        *(r2_21 + (r8 << 4)) = *r0_160
                        entry_r2 = r2_21 + (r8 << 4)
                        *(entry_r2 + 4) = r7_10
                        entry_r2[1].d = *(r0_160 + 8)
                        int32_t r0_163
                        
                        if (*(arg1[3] + 0xc) s<= 0)
                            r0_163 = r6_1[1]
                        else
                            if (r8 u>= r1_61)
                                r0_160 = &entry_r2[2]
                            
                            arg1[2] = r0_160
                            entry_r2, q0, q4 = sub_cc158(arg1)
                            r0_163 = r6_1[1]
                            arg1[2] = r0_163
                        
                        lr_2 = var_40_1
                        r12_1 = r6_1[6]
                        arg1[2] = r0_163
                        continue
                    case 0x17
                        if (r8 != 0)
                            entry_r2, q0, q4 = sub_cab68(arg1, r6_1[6] + (r8 << 4) - 0x10)
                            lr_2 = var_40_1
                        
                        *lr_2 = *lr_2 + ((0xfffe0002 + (r5_1 u>> 0xe)) << 2) - 4
                        continue
                    case 0x18
                        int32_t* r1_24 = &r12_1[(r5_1 u>> 0x17) * 2]
                        
                        if (r5_1 s< 0)
                            r1_24 = &r0_5[(r5_1 u>> 0x17 & 0xff) * 2]
                        
                        entry_r2 = r0_5 + (0xff0 & r5_1 u>> 0xa)
                        
                        if ((r5_1 & 0x400000) == 0)
                            entry_r2 = r12_1 + (0x1ff0 & r5_1 u>> 0xa)
                        
                        uint32_t r0_95 = 0
                        
                        if (r1_24[2] == entry_r2[1].d)
                            r0_95, entry_r2, q0, q4 = sub_df0d4(arg1, r1_24, entry_r2)
                            lr_2 = var_40_1
                            
                            if (r0_95 != 0)
                                r0_95 = 1
                        
                        r1_25 = *lr_2
                        
                        if (r8 == r0_95)
                            goto label_e0a38
                        
                        goto label_e03d8
                    case 0x19
                        int64_t* r1_26 = &r12_1[(r5_1 u>> 0x17) * 2]
                        
                        if (r5_1 s< 0)
                            r1_26 = &r0_5[(r5_1 u>> 0x17 & 0xff) * 2]
                        
                        void* r2_15 = r0_5 + (0xff0 & r5_1 u>> 0xa)
                        
                        if ((r5_1 & 0x400000) == 0)
                            r2_15 = r12_1 + (0x1ff0 & r5_1 u>> 0xa)
                        
                        r0_103, entry_r2, q0, q4 = sub_deb7c(arg1, r1_26, r2_15)
                    label_e0a28:
                        lr_2 = var_40_1
                        r1_25 = *lr_2
                        
                        if (r0_103 != r8)
                        label_e03d8:
                            *lr_2 = &r1_25[1]
                            r12_1 = r6_1[6]
                            continue
                        else
                        label_e0a38:
                            int32_t r4_14 = *r1_25
                            int32_t r0_197 = r4_14 u>> 6 & 0xff
                            
                            if (r0_197 != 0)
                                entry_r2, q0, q4 = sub_cab68(arg1, r6_1[6] + (r0_197 << 4) - 0x10)
                                lr_2 = var_40_1
                                r1_25 = *lr_2
                            
                            *lr_2 = &r1_25[0xfffe0002 + (r4_14 u>> 0xe)]
                            r12_1 = r6_1[6]
                            continue
                    case 0x1a
                        void* r1_71 = &r12_1[(r5_1 u>> 0x17) * 2]
                        
                        if (r5_1 s< 0)
                            r1_71 = &r0_5[(r5_1 u>> 0x17 & 0xff) * 2]
                        
                        int64_t* r2_25 = r0_5 + (0xff0 & r5_1 u>> 0xa)
                        
                        if ((r5_1 & 0x400000) == 0)
                            r2_25 = r12_1 + (0x1ff0 & r5_1 u>> 0xa)
                        
                        r0_103, entry_r2, q0, q4 = sub_ded90(arg1, r1_71, r2_25)
                        goto label_e0a28
                    case 0x1b
                        int32_t r0_45 = r12_1[r8 * 2 + 1].d
                        
                        if ((r5_1 & 0x7fc000) == 0)
                            if (r0_45 == 0 || (r0_45 == 1 && *r9_1 == 0))
                                goto label_e0d08
                            
                            *lr_2 += 4
                            continue
                        else
                            if (r0_45 != 0 && (r0_45 != 1 || *r9_1 != 0))
                                goto label_e0d08
                            
                            *lr_2 += 4
                            continue
                    case 0x1c
                        entry_r2 = 0x7fc000
                        void* r1_64 = r12_1 + (0x1ff0 & r5_1 u>> 0x13)
                        int32_t r0_174 = *(r1_64 + 8)
                        
                        if ((r5_1 & 0x7fc000) == 0)
                            if (r0_174 != 0)
                                if (r0_174 == 1)
                                    entry_r2 = *r1_64
                                    
                                    if (entry_r2 != 0)
                                        *lr_2 += 4
                                        continue
                                        continue
                                else
                                    *lr_2 += 4
                                    continue
                                    continue
                        else if (r0_174 == 0)
                            *lr_2 += 4
                            continue
                            continue
                        else if (r0_174 == 1)
                            entry_r2 = *r1_64
                            
                            if (entry_r2 == 0)
                                *lr_2 += 4
                                continue
                                continue
                        
                        int32_t r3_29
                        r3_29:entry_r2 = *r1_64
                        *r9_1 = entry_r2
                        *(r9_1 + 4) = r3_29
                        r9_1[1].d = r0_174
                    label_e0d08:
                        int32_t* r0_234 = *lr_2
                        int32_t r4_18 = *r0_234
                        int32_t r1_88 = r4_18 u>> 6 & 0xff
                        
                        if (r1_88 != 0)
                            entry_r2, q0, q4 = sub_cab68(arg1, r6_1[6] + (r1_88 << 4) - 0x10)
                            lr_2 = var_40_1
                            r0_234 = *lr_2
                        
                        *lr_2 = &r0_234[0xfffe0002 + (r4_18 u>> 0xe)]
                        continue
                    case 0x1d
                        void* r0_175 = nullptr
                        uint32_t temp3_1 = r5_1 u>> 0x17
                        
                        if (0 != temp3_1)
                            r0_175 = r5_1 u>> 0x17
                        
                        int32_t r4_11 = r5_1 u>> 0xe & 0x1ff
                        
                        if (0 != temp3_1)
                            r0_175 = &r9_1[r0_175 * 2]
                        
                        if (0 != temp3_1)
                            arg1[2] = r0_175
                        
                        int32_t r0_177
                        r0_177, entry_r2, q0, q4 = sub_c90d4(arg1, r9_1, r4_11.w - 1)
                        
                        if (r0_177 == 0)
                            r6_1 = arg1[4]
                            *(r6_1 + 0x12) |= 4
                            break
                        
                        if (r4_11 != 0)
                            goto label_e0b7c
                        
                        goto label_e0b84
                    case 0x1e
                        uint32_t r0_152 = 0
                        uint32_t temp2_1 = r5_1 u>> 0x17
                        
                        if (0 != temp2_1)
                            r0_152 = r5_1 u>> 0x17
                        
                        if (0 != temp2_1)
                            arg1[2] = &r9_1[r0_152 * 2]
                        
                        int32_t r0_155
                        r0_155, entry_r2, q0, q4 = sub_c90d4(arg1, r9_1, 0xffff)
                        
                        if (r0_155 != 0)
                            goto label_e0b84
                        
                        int32_t* r4_21 = arg1[4]
                        int32_t* r5_8 = *r4_21
                        r6_1 = r4_21[2]
                        entry_r2 = *(*(r0_3 + 0xc) + 0x38)
                        void* r8_3 = *r6_1
                        int32_t r7_12 = r4_21[6] + (zx.d(*(*(*r5_8 + 0xc) + 0x4c)) << 4)
                        
                        if (entry_r2 s>= 1)
                            entry_r2, q0, q4 = sub_cab68(arg1, r6_1[6])
                        
                        if (r5_8 u< r7_12)
                            void* r0_249 = r8_3
                            int32_t* r1_101 = r5_8
                            
                            do
                                int32_t r3_30 = r1_101[1]
                                *r0_249 = *r1_101
                                *(r0_249 + 4) = r3_30
                                entry_r2 = r1_101[2]
                                r1_101 = &r1_101[4]
                                *(r0_249 + 8) = entry_r2
                                r0_249 += 0x10
                            while (r1_101 u< r7_12)
                        
                        r6_1[6] = r8_3 + r4_21[6] - r5_8
                        void* r0_255 = r8_3 + arg1[2] - r5_8
                        arg1[2] = r0_255
                        char r1_102 = *(r6_1 + 0x12)
                        r6_1[1] = r0_255
                        r6_1[7] = r4_21[7]
                        *(r6_1 + 0x12) = r1_102 | 0x40
                        arg1[4] = r6_1
                        break
                    case 0x1f
                        if (0 != r5_1 u>> 0x17)
                            arg1[2] = &r9_1[(r5_1 u>> 0x17) * 2] - 0x10
                        
                        if (*(*(r0_3 + 0xc) + 0x38) s>= 1)
                            r9_1 = sub_cab68(arg1, r12_1)
                        
                        int32_t r0_246
                        r0_246, entry_r2, q0, q4 = sub_c96a0(arg1, r9_1)
                        
                        if ((zx.d(*(r6_1 + 0x12)) & 4) != 0)
                            r6_1 = arg1[4]
                            
                            if (r0_246 == 0)
                                break
                            
                            arg1[2] = r6_1[1]
                            break
                        
                        if (*__stack_chk_guard == r0)
                            unimplemented  {vpopeq {d8, d9}}
                            jump(arg2)
                        
                        __stack_chk_fail()
                        noreturn
                    case 0x20
                        q0.q = *r9_1
                        unimplemented  {vcmpe.f64 d2, #0.000000}
                        q0.q = r9_1[4] f+ q0.q
                        q0:8.q = r9_1[2]
                        unimplemented  {vmrs apsr_nzcv, fpscr}
                        
                        if (r0_26 s<= 0x26)
                            unimplemented  {vcmpe.f64 d1, d0}
                            unimplemented  {vmrs apsr_nzcv, fpscr}
                            
                            if (r0_26 u> 0x26)
                                continue
                        else
                            unimplemented  {vcmpe.f64 d0, d1}
                            unimplemented  {vmrs apsr_nzcv, fpscr}
                            
                            if (r0_26 u> 0x26)
                                continue
                        
                        *lr_2 = *lr_2 + ((0xfffe0002 + (r5_1 u>> 0xe)) << 2) - 4
                        *r9_1 = q0.q
                        r9_1[1].d = 3
                        r9_1[7].d = 3
                        r9_1[6] = q0.q
                        continue
                    case 0x21
                        void* r7_3 = &r12_1[r8 * 2 + 1]
                        int32_t r0_29 = *r7_3
                        
                        if (r0_29 == 3)
                            goto label_dff4c
                        
                        if ((r0_29 & 0xf) == 4)
                            void* r0_31 = *r9_1
                            int64_t var_38
                            uint32_t r0_33
                            r0_33, entry_r2, q0 =
                                sub_d2950(r0_31 + 0x10, *(r0_31 + 0xc), &var_38, q0.q)
                            
                            if (r0_33 != 0)
                                lr_2 = var_40_1
                                q0.q = var_38
                                *r9_1 = q0.q
                                *r7_3 = 3
                            label_dff4c:
                                int32_t r0_34 = r9_1[3].d
                                
                                if (r0_34 != 3)
                                    uint32_t r0_38
                                    
                                    if ((r0_34 & 0xf) == 4)
                                        void* r0_36 = r9_1[2].d
                                        r0_38, entry_r2, q0 =
                                            sub_d2950(r0_36 + 0x10, *(r0_36 + 0xc), &var_38, q0.q)
                                    
                                    if ((r0_34 & 0xf) != 4 || r0_38 == 0)
                                        sub_c89f0(arg1, "'for' limit must be a number", entry_r2)
                                        noreturn
                                    
                                    lr_2 = var_40_1
                                    q0.q = var_38
                                    r9_1[3].d = 3
                                    r9_1[2] = q0.q
                                
                                int32_t r0_39 = r9_1[5].d
                                
                                if (r0_39 != 3)
                                    uint32_t r0_43
                                    
                                    if ((r0_39 & 0xf) == 4)
                                        void* r0_41 = r9_1[4].d
                                        r0_43, entry_r2, q0 =
                                            sub_d2950(r0_41 + 0x10, *(r0_41 + 0xc), &var_38, q0.q)
                                    
                                    if ((r0_39 & 0xf) != 4 || r0_43 == 0)
                                        sub_c89f0(arg1, "'for' step must be a number", entry_r2)
                                        noreturn
                                    
                                    lr_2 = var_40_1
                                    q0.q = var_38
                                    r9_1[5].d = 3
                                    r9_1[4] = q0.q
                                
                                q0.q = *r9_1
                                q0:8.q = r9_1[4]
                                q0.q = q0.q f- q0:8.q
                                *r9_1 = q0.q
                                *r7_3 = 3
                                *lr_2 = *lr_2 + ((0xfffe0002 + (r5_1 u>> 0xe)) << 2) - 4
                                continue
                    case 0x22
                        int32_t r12_4 = *r9_1
                        int32_t r1_15 = *(r9_1 + 4)
                        int32_t r7_6 = r9_1[3].d
                        int32_t r6_11 = r9_1[4].d
                        int32_t r4_7 = *(r9_1 + 0x24)
                        int32_t r0_69 = r9_1[5].d
                        r9_1[8].d = r9_1[2].d
                        *(r9_1 + 0x44) = *(r9_1 + 0x14)
                        r9_1[9].d = r7_6
                        r9_1[0xa].d = r6_11
                        *(r9_1 + 0x54) = r4_7
                        r9_1[0xb].d = r0_69
                        int32_t r0_70 = r9_1[1].d
                        *(r9_1 + 0x34) = r1_15
                        r9_1[6].d = r12_4
                        r9_1[7].d = r0_70
                        arg1[2] = &r9_1[0xc]
                        q0, q4 = sub_c9774(arg1, &r9_1[6], r5_1 u>> 0xe & 0x1ff, 1, r8)
                        entry_r2 = r6_1
                        lr_2 = var_40_1
                        r12_1 = entry_r2[3].d
                        arg1[2] = *(entry_r2 + 4)
                        int32_t* r0_74 = *(entry_r2 + 0x1c)
                        *(entry_r2 + 0x1c) = &r0_74[1]
                        r5_1 = *r0_74
                        r9_1 = r12_1 + (0xff0 & r5_1 u>> 2)
                    label_e0254:
                        int32_t r0_76 = r9_1[3].d
                        
                        if (r0_76 == 0)
                            continue
                        else
                            int64_t* r3_10
                            r3_10:entry_r2 = r9_1[2]
                            int64_t** temp0_3 = r9_1
                            *temp0_3 = entry_r2
                            temp0_3[1] = r3_10
                            r9_1[1].d = r0_76
                        
                        *lr_2 = *lr_2 + ((0xfffe0002 + (r5_1 u>> 0xe)) << 2) - 4
                        continue
                    case 0x23
                        goto label_e0254
                    case 0x24
                        uint32_t r4_12 = r5_1 u>> 0xe & 0x1ff
                        uint32_t i_5
                        
                        if (0 == r5_1 u>> 0x17)
                            i_5 = 0xffffffff + ((arg1[2] - r9_1) s>> 4)
                            
                            if (r4_12 == 0)
                            label_e0924:
                                int32_t* r0_178 = *lr_2
                                *lr_2 = &r0_178[1]
                                r4_12 = *r0_178 u>> 6
                        else
                            i_5 = r5_1 u>> 0x17
                            
                            if (r4_12 == 0)
                                goto label_e0924
                        
                        void* r7_11 = *r9_1
                        entry_r2 = i_5 + r4_12 * 0x32 - 0x32
                        
                        if (entry_r2 s> *(r7_11 + 0x1c))
                            entry_r2 = sub_daf84(arg1, r7_11, entry_r2)
                        
                        if (i_5 s>= 1)
                            uint32_t r4_13 = i_5 << 4
                            uint32_t i_2
                            
                            do
                                entry_r2 = sub_dadf8(arg1, r7_11, r4_12 * 0x32 - 0x32 + i_5, 
                                    r9_1 + r4_13, arg1, q4, x)
                                
                                if ((zx.d(r9_1[i_5 * 2 + 1].b) & 0x40) != 0
                                        && (zx.d(*(r9_1[i_5 * 2].d + 5)) & 3) != 0
                                        && (zx.d(*(r7_11 + 5)) & 4) != 0)
                                    entry_r2 = sub_cafb8(arg1, r7_11)
                                
                                r4_13 -= 0x10
                                i_2 = i_5
                                i_5 -= 1
                            while (i_2 s> 1)
                        
                        lr_2 = var_40_1
                        arg1[2] = r6_1[1]
                        continue
                    case 0x25
                        void* y_1 = *(*(*(r0_3 + 0xc) + 0x10) + (r5_1 u>> 0xe << 2))
                        int32_t r0_55 = *(y_1 + 0x20)
                        void* r5_2 = *(y_1 + 0x1c)
                        int32_t i_6 = *(y_1 + 0x28)
                        
                        if (r0_55 == 0)
                        label_e0ab8:
                            void* r0_203
                            r0_203, entry_r2, r9_1, q0, q4 = sub_caa04(arg1, i_6)
                            y = y_1
                            *(r0_203 + 0xc) = y_1
                            void* r3_26 = &r12_1[r8 * 2]
                            *r3_26 = r0_203
                            *(r3_26 + 8) = 0x46
                            
                            if (i_6 s>= 1)
                                char* r4_15 = r5_2 + 4
                                int32_t** r5_4 = r0_203 + 0x10
                                entry_r2 = r12_1
                                int32_t i_3
                                
                                do
                                    uint32_t r0_204 = zx.d(r4_15[1])
                                    int32_t* r0_206
                                    
                                    if (zx.d(*r4_15) == 0)
                                        r0_206 = *(r0_3 + (r0_204 << 2) + 0x10)
                                    else
                                        r0_206, r9_1, q0, q4 =
                                            sub_caa94(arg1, &entry_r2[r0_204 * 2])
                                        entry_r2 = r12_1
                                    
                                    *r5_4 = r0_206
                                    r4_15 = &r4_15[8]
                                    i_3 = i_6
                                    i_6 -= 1
                                    r5_4 = &r5_4[1]
                                while (i_3 != 1)
                            
                            if ((zx.d(*(y + 5)) & 4) != 0)
                                entry_r2 = sub_cafd8(arg1, y, r0_203)
                            
                            *(y + 0x20) = r0_203
                        else
                            if (i_6 s>= 1)
                                entry_r2 = nullptr
                                
                                do
                                    void* r3_3 = r5_2 + (entry_r2 << 3)
                                    uint32_t r3_4 = zx.d(*(r3_3 + 5))
                                    void* r3_5
                                    
                                    if (zx.d(*(r3_3 + 4)) == 0)
                                        r3_5 = *(*(r0_3 + (r3_4 << 2) + 0x10) + 8)
                                    else
                                        r3_5 = &r12_1[r3_4 * 2]
                                    
                                    if (*(*(r0_55 + 0x10 + (entry_r2 << 2)) + 8) != r3_5)
                                        goto label_e0ab8
                                    
                                    entry_r2 += 1
                                while (entry_r2 s< i_6)
                            
                            void* r12_3 = &r12_1[r8 * 2]
                            *r12_3 = r0_55
                            *(r12_3 + 8) = 0x46
                        
                    label_e0b5c:
                        
                        if (*(arg1[3] + 0xc) s< 1)
                            goto label_e0b84
                        
                        arg1[2] = &r9_1[2]
                        entry_r2, q0, q4 = sub_cc158(arg1)
                    label_e0b7c:
                        arg1[2] = r6_1[1]
                    label_e0b84:
                        lr_2 = var_40_1
                        r12_1 = r6_1[6]
                        continue
                    case 0x26
                        uint32_t r4_8 = zx.d(*(*(r0_3 + 0xc) + 0x4c))
                        void* r6_12 = r12_1 - *r6_1
                        int32_t r7_7 = not.d(r4_8) + (r6_12 s>> 4)
                        int32_t r0_80
                        
                        if (0 == r5_1 u>> 0x17)
                            if (r7_7 s>= (arg1[6] - arg1[2]) s>> 4)
                                entry_r2, q0, q4 = sub_c8e8c(arg1, r7_7)
                                lr_2 = var_40_1
                            
                            r12_1 = r6_1[6]
                            r9_1 = &r12_1[r8 * 2]
                            arg1[2] = &r9_1[r7_7 * 2]
                            r0_80 = r7_7
                            
                            if (r0_80 s< 1)
                                continue
                        else
                            r0_80 = 0xffffffff + (r5_1 u>> 0x17)
                            
                            if (r0_80 s< 1)
                                continue
                        
                        entry_r2 = nullptr
                        int32_t r3_28 = 0
                        void* r1_86 = &r12_1[(r4_8 - (r6_12 s>> 4)) * 2]
                        
                        do
                            int32_t r6_15 = 0
                            
                            if (r3_28 s< r7_7)
                                int32_t r4_17
                                int32_t r5_5
                                r5_5:r4_17 = *(r1_86 + entry_r2 + 0x10)
                                void* r6_18 = r9_1 + entry_r2
                                *r6_18 = r4_17
                                *(r6_18 + 4) = r5_5
                                r6_15 = *(r1_86 + (r3_28 << 4) + 0x18)
                            
                            void* r5_6 = &r9_1[r3_28 * 2]
                            r3_28 += 1
                            entry_r2 = &entry_r2[2]
                            *(r5_6 + 8) = r6_15
                        while (r0_80 != r3_28)
                        
                        continue
        else
            if (r7_1 != 0)
                entry_r2, q0, q4 = sub_c8f90(arg1, 3)
                lr_2 = var_40_1
            
            void* r6_4
            
            if ((r6_3 & 4) != 0)
                r6_4 = &r4_1[7]
                int32_t r3_1 = *r6_4
                void* r0_16 = *(**r4_1 + 0xc)
                int32_t r12_2 = *(r0_16 + 0xc)
                int32_t r1_2 = *(r0_16 + 0x14)
                
                if (r1_2 != 0)
                    entry_r2 = *(r1_2 + ((0xffffffff + ((r3_1 - r12_2) s>> 2)) << 2))
                else
                    entry_r2 = nullptr
                
                if ((r3_1 - r12_2) s>> 2 == 1)
                    entry_r2, q0, q4 = sub_c8f90(arg1, 2)
                    lr_2 = var_40_1
                else
                    int32_t r0_19 = arg1[5]
                    
                    if (r0_19 u>= r3_1)
                        entry_r2, q0, q4 = sub_c8f90(arg1, 2)
                        lr_2 = var_40_1
                    else if (r1_2 == 0)
                        if (entry_r2 != 0)
                            entry_r2, q0, q4 = sub_c8f90(arg1, 2)
                            lr_2 = var_40_1
                    else if (entry_r2 != *(r1_2 + r0_19 - r12_2 - 4))
                        entry_r2, q0, q4 = sub_c8f90(arg1, 2)
                        lr_2 = var_40_1
            else
                r6_4 = &r4_1[7]
            
            bool cond:39_1 = zx.d(*(arg1 + 6)) == 1
            arg1[5] = *r6_4
            
            if (not(cond:39_1))
                goto label_dfe28
            
            if (r7_1 != 0)
                arg1[0xc] = 1
            
            char r1_104 = *(r4_1 + 0x12)
            r4_1[7] -= 4
            *(r4_1 + 0x12) = r1_104 | 0x80
            *r4_1 = arg1[2] - 0x10
            entry_r2 = sub_c8c5c(arg1, 1)
        sub_c89f0(arg1, "'for' initial value must be a number", entry_r2)
        noreturn
