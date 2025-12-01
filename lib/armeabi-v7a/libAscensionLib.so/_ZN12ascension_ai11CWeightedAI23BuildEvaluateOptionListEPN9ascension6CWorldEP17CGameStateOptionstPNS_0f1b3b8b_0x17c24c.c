// 函数: _ZN12ascension_ai11CWeightedAI23BuildEvaluateOptionListEPN9ascension6CWorldEP17CGameStateOptionstPNS_15OptionListEntryE
// 地址: 0x17c24c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6 = arg3
int32_t r0 = *__stack_chk_guard
*(arg1 + 4)
void* r0_2 = ascension::CWorld::GetPlayerByIndex(*(arg1 + 0x20))
int32_t r0_4 = CGameStateOptions::GetOptionCount()
char* arg_0
char* r12 = arg_0
int32_t r6_1 = r0_4
int32_t result
int32_t var_138
int32_t var_130_1
int32_t i_40
uint32_t num
uint32_t num_7
uint32_t num_8
uint32_t num_9
uint32_t num_10
int32_t var_100_1
int32_t var_fc_1
int32_t i_31
uint32_t num_1
uint32_t num_11
int32_t i_32
int32_t var_e4_1
int32_t i_41
int32_t i_33
int32_t var_c8
int32_t i_34
int32_t i_42
int32_t var_b0
int32_t r0_89
int32_t r1_66
int32_t r3_45
int32_t r4_21
int32_t r5_32
int32_t i_36
int32_t r7_58
int32_t r8_1
int32_t r9_3
int32_t r10
int32_t lr_11

if (r0_4 s< 1)
    var_c8 = 0xffffffff
    var_b0 = 0xffffffff
    var_138 = 0
    i_34 = 0
    i_42 = 0
    i_33 = 0
    var_100_1 = 0
    i_40 = 0
    num_10 = 0
    num_9 = 0
    num_7 = 0
    num_8 = 0
    var_fc_1 = 0
    num = 0
    lr_11 = r6_1
    var_130_1 = 0
    __builtin_memset(&i_31, 0, 0x14)
    r0_89 = 0xffffffff
    r1_66 = 0xffffffff
    r9_3 = 0
    r10 = 0
    i_36 = 0
    r3_45 = 0
    r5_32 = 0
    r7_58 = 0
    r8_1 = 0
    r4_21 = 0
    i_41 = 0
label_17db88:
    int32_t i_35 = i_42
    
    if (r7_58 s> 0)
        r1_66 = 0xffffffff
    
    if (r3_45 s> 0)
        r5_32 = 0
    
    if (r7_58 s> 0)
        r8_1 = 0
    
    if (r8_1 s> 0)
        r4_21 = 0
    
    if (r7_58 s> 0)
        r4_21 = 0
    
    int32_t var_dc_2 = r4_21
    
    if (r1_66 == 0xffffffff)
    label_17dcc0:
        int32_t r1_71 = var_130_1
        
        if (r1_71 s> 0)
            r0_89 = 0xffffffff
            i_35 = 0
        
        int32_t r0_94 = var_c8
        
        if (r1_71 s> 0)
            r0_94 = 0xffffffff
        
        int32_t r0_95 = var_b0
        
        if (r1_71 s> 0)
            r0_95 = 0xffffffff
        
        if (i_36 s< 1)
            i_36 = 0
        else
            void* r0_96 = &r12[2]
            int32_t i_22 = i_36
            void* r1_72 = &data_1ee0ec
            int32_t i
            
            do
                i = i_22
                i_22 -= 1
                *(r0_96 - 2) = (*(r1_72 - 4)).b
                int16_t r3_49 = *r1_72
                r1_72 += 0x10
                *r0_96 = r3_49
                r0_96 += 4
            while (i != 1)
        
        if (var_138 s>= 1)
            void* r2_48 = &r12[i_36 << 2]
            *r2_48 = (data_1edce8).b
            i_36 += 1
            *(r2_48 + 2) = data_1edcec
        
        int32_t i_23 = i_34
        int32_t result_3 = i_36
        
        if (i_23 s>= 1)
            void* r0_100 = &r12[(i_36 << 2) + 2]
            void* r1_74 = &data_1ee4ec
            int32_t i_1
            
            do
                i_1 = i_23
                i_23 -= 1
                *(r0_100 - 2) = (*(r1_74 - 4)).b
                int16_t r3_51 = *r1_74
                r1_74 += 0x10
                *r0_100 = r3_51
                r0_100 += 4
            while (i_1 != 1)
            i_23 = i_34
            result_3 = i_36 + i_23
        
        if (i_32 s>= 1)
            void* r0_102 = &r12[(result_3 << 2) + 2]
            int32_t i_24 = i_32
            void* r1_75 = &data_1ee8ec
            int32_t i_2
            
            do
                i_2 = i_24
                i_24 -= 1
                *(r0_102 - 2) = (*(r1_75 - 4)).b
                int16_t r3_53 = *r1_75
                r1_75 += 0x10
                *r0_102 = r3_53
                r0_102 += 4
            while (i_2 != 1)
            result_3 += i_32
        
        int32_t r1_77 = r3_45
        
        if (r1_77 s>= 1)
            void* r0_103 = &r12[result_3 << 2]
            int32_t i_3 = 0
            int32_t r3_54 = 4
            int32_t r7_59 = 0xfffffffe
            
            do
                *(r0_103 - (i_3 << 2)) = (*(&data_1eece8 - (i_3 << 4))).b
                i_3 -= 1
                int16_t r5_35 = *(&data_1eece8 + r3_54)
                r3_54 += 0x10
                *(r0_103 - r7_59) = r5_35
                r7_59 -= 4
            while (0 - r1_77 != i_3)
            
            r1_77 = r3_45
            result_3 += r1_77
        
        if (r5_32 s>= 1)
            int32_t i_43 = i_36
            int32_t i_4 = 0
            
            if (r1_77 s> 0)
                i_43 += r1_77
            
            if (i_32 s> 0)
                i_43 += i_32
            
            if (i_23 s> 0)
                i_43 += i_23
            
            void* r1_80 = &r12[(result_3 << 2) + 2]
            int32_t r7_60 = 4
            
            do
                *(&r12[i_43 << 2] - (i_4 << 2)) = (*(&data_1ef0e8 - (i_4 << 4))).b
                i_4 -= 1
                int16_t r5_38 = *(&data_1ef0e8 + r7_60)
                r7_60 += 0x10
                *r1_80 = r5_38
                r1_80 += 4
            while (0 - r5_32 != i_4)
            
            result_3 += r5_32
        
        if (r7_58 s>= 1)
            void* r0_106 = &r12[result_3 << 2]
            void* r1_81 = r0_106 + 2
            int32_t i_5 = 0
            int32_t r7_61 = 4
            
            do
                *(r0_106 - (i_5 << 2)) = (*(&data_1ef4e8 - (i_5 << 4))).b
                i_5 -= 1
                int16_t r5_41 = *(&data_1ef4e8 + r7_61)
                r7_61 += 0x10
                *r1_81 = r5_41
                r1_81 += 4
            while (0 - r7_58 != i_5)
            
            result_3 += r7_58
        
        int32_t result_2 = result_3
        
        if (r8_1 s>= 1)
            void* r0_107 = &r12[result_2 << 2]
            void* r1_82 = r0_107 + 2
            int32_t i_6 = 0
            int32_t r7_62 = 4
            
            do
                *(r0_107 - (i_6 << 2)) = (*(&data_1efce8 - (i_6 << 4))).b
                i_6 -= 1
                int16_t r5_44 = *(&data_1efce8 + r7_62)
                r7_62 += 0x10
                *r1_82 = r5_44
                r1_82 += 4
            while (0 - r8_1 != i_6)
            
            result_2 += r8_1
        
        if (var_dc_2 s>= 1)
            void* r0_109 = &r12[result_2 << 2]
            void* r1_83 = r0_109 + 2
            int32_t i_7 = 0
            int32_t r7_63 = 4
            
            do
                *(r0_109 - (i_7 << 2)) = (*(&data_1f00e8 - (i_7 << 4))).b
                i_7 -= 1
                int16_t r5_47 = *(&data_1f00e8 + r7_63)
                r7_63 += 0x10
                *r1_83 = r5_47
                r1_83 += 4
            while (0 - var_dc_2 != i_7)
            
            result_2 += var_dc_2
        
        uint32_t num_2 = num_11
        int32_t i_37
        int32_t lr_13
        uint32_t num_12
        
        if (num_2 s< 5)
            lr_13 = var_100_1
            i_37 = i_40
            num_12 = num_2
            
            if (num_2 s>= 1)
                goto label_17e0d4
        else
            qsort(&data_1f04e8, num_2, 0x10, compar_17ec70)
            num_2 = num_11
            lr_13 = var_100_1
            int32_t r7_64 = (&data_1f04d8)[num_2 * 4]
            int32_t r2_56 = (&data_1f04dc)[num_2 * 4]
            int32_t r3_55 = (&data_1f04e0)[num_2 * 4]
            data_1f0524 = (&data_1f04e4)[num_2 * 4]
            num_12 = 4
            data_1f0518 = r7_64
            data_1f051c = r2_56
            data_1f0520 = r3_55
            i_37 = i_40
        label_17e0d4:
            void* r4_25 = &r12[(result_2 << 2) + 2]
            int32_t r3_57 = 0
            void* r2_57 = &data_1f04ec
            
            do
                r3_57 += 1
                *(r4_25 - 2) = (*(r2_57 - 4)).b
                int16_t r7_66 = *r2_57
                r2_57 += 0x10
                *r4_25 = r7_66
                r4_25 += 4
            while (r3_57 s< num_12)
            
            if (num_2 s>= 4)
                num_2 = 4
            
            result_2 += num_2
        
        if (i_37 s>= 1)
            void* r0_114 = &r12[(result_2 << 2) + 2]
            int32_t i_25 = i_37
            void* r1_84 = &data_1f14ec
            int32_t i_8
            
            do
                i_8 = i_25
                i_25 -= 1
                *(r0_114 - 2) = (*(r1_84 - 4)).b
                int16_t r3_59 = *r1_84
                r1_84 += 0x10
                *r0_114 = r3_59
                r0_114 += 4
            while (i_8 != 1)
            result_2 += i_37
        
        if (lr_13 s>= 1)
            int32_t r0_115 = 0
            
            do
                if (r9_3 s< 1)
                label_17e1ac:
                    void* r6_23 = &r12[result_2 << 2]
                    *r6_23 = (*(&data_1f10e8 + (r0_115 << 4))).b
                    result_2 += 1
                    *(r6_23 + 2) = *((r0_115 << 4) + 0x1f10ec)
                else
                    int32_t r7_67 = 0
                    
                    while (*(&data_1ed0e8 + (r7_67 << 2)) != *((r0_115 << 4) + 0x1f10f4))
                        r7_67 += 1
                        
                        if (r7_67 s>= r9_3)
                            goto label_17e1ac
                
                r0_115 += 1
            while (r0_115 != lr_13)
        
        uint32_t num_5 = num_9
        uint32_t num_6
        uint32_t num_13
        uint32_t num_4
        
        if (num_5 s< 5)
            num_6 = num_8
            num_4 = num_7
            num_13 = num_5
            
            if (num_5 s>= 1)
                goto label_17e230
            
            if (num_5 == 0)
            label_17e278:
                uint32_t num_14
                
                if (num_4 s< 5)
                    num_14 = num_4
                    
                    if (num_4 s>= 1)
                        goto label_17e2dc
                else
                    qsort(&data_1f20e8, num_4, 0x10, compar_17ec98)
                    num_14 = 4
                label_17e2dc:
                    void* r1_90 = &r12[(result_2 << 2) + 2]
                    int32_t r3_65 = 0
                    void* r2_59 = &data_1f20ec
                    
                    do
                        r3_65 += 1
                        *(r1_90 - 2) = (*(r2_59 - 4)).b
                        int16_t r7_72 = *r2_59
                        r2_59 += 0x10
                        *r1_90 = r7_72
                        r1_90 += 4
                    while (r3_65 s< num_14)
                    
                    if (num_4 s>= 4)
                        num_4 = 4
                    
                    result_2 += num_4
        else
            qsort(&data_1f1ce8, num_5, 0x10, compar_17ec98)
            num_6 = num_8
            num_4 = num_7
            num_13 = 4
        label_17e230:
            void* r1_87 = &r12[(result_2 << 2) + 2]
            int32_t r3_64 = 0
            void* r2_58 = &data_1f1cec
            
            do
                r3_64 += 1
                *(r1_87 - 2) = (*(r2_58 - 4)).b
                int16_t r7_70 = *r2_58
                r2_58 += 0x10
                *r1_87 = r7_70
                r1_87 += 4
            while (r3_64 s< num_13)
            
            if (num_5 s>= 4)
                num_5 = 4
            
            result_2 += num_5
            
            if (num_13 == 0)
                goto label_17e278
        uint32_t num_3
        uint32_t num_15
        
        if (num_6 s< 5)
            num_3 = num_10
            num_15 = num_6
            
            if (num_6 s>= 1)
                goto label_17e378
        else
            qsort(&data_1f24e8, num_6, 0x10, compar_17ec98)
            num_15 = 4
            num_3 = num_10
        label_17e378:
            void* r6_25 = &r12[(result_2 << 2) + 2]
            int32_t r3_67 = 0
            void* r2_60 = &data_1f24ec
            
            do
                r3_67 += 1
                *(r6_25 - 2) = (*(r2_60 - 4)).b
                int16_t r7_74 = *r2_60
                r2_60 += 0x10
                *r6_25 = r7_74
                r6_25 += 4
            while (r3_67 s< num_15)
            
            if (num_6 s>= 4)
                num_6 = 4
            
            result_2 += num_6
        int32_t r9_4
        int32_t lr_14
        
        if (num_3 s< 5)
            r9_4 = r0_95
            lr_14 = r0_94
            
            if (num_3 s>= 1)
                goto label_17e41c
        else
            qsort(&data_1f18e8, num_3, 0x10, compar_17ec98)
            num_3 = 4
            r9_4 = r0_95
            lr_14 = r0_94
        label_17e41c:
            int32_t r0_117 = 0
            
            do
                if (r10 s< 1)
                label_17e464:
                    void* r6_28 = &r12[result_2 << 2]
                    *r6_28 = (*(&data_1f18e8 + (r0_117 << 4))).b
                    result_2 += 1
                    *(r6_28 + 2) = *((r0_117 << 4) + 0x1f18ec)
                else
                    int32_t r7_75 = 0
                    
                    while (*(&data_1ed4e8 + (r7_75 << 2)) != *((r0_117 << 4) + 0x1f18f4))
                        r7_75 += 1
                        
                        if (r7_75 s>= r10)
                            goto label_17e464
                
                r0_117 += 1
            while (r0_117 s< num_3)
        
        int32_t i_26 = i_33
        int32_t i_38
        
        if (i_26 s< 1)
            i_38 = i_41
        else
            i_38 = i_41
            void* r0_119 = &r12[(result_2 << 2) + 2]
            void* r1_92 = &data_1f0cec
            int32_t i_9
            
            do
                i_9 = i_26
                i_26 -= 1
                *(r0_119 - 2) = (*(r1_92 - 4)).b
                int16_t r3_73 = *r1_92
                r1_92 += 0x10
                *r0_119 = r3_73
                r0_119 += 4
            while (i_9 != 1)
            result_2 += i_33
        
        int32_t i_27 = i_35
        
        if (i_27 s>= 1)
            void* r0_122 = &r12[(result_2 << 2) + 2]
            void* r1_93 = &data_1f08ec
            int32_t i_10
            
            do
                i_10 = i_27
                i_27 -= 1
                *(r0_122 - 2) = (*(r1_93 - 4)).b
                int16_t r3_75 = *r1_93
                r1_93 += 0x10
                *r0_122 = r3_75
                r0_122 += 4
            while (i_10 != 1)
            result_2 += i_35
        
        if (var_fc_1 s>= 1)
            void* r0_124 = &r12[result_2 << 2]
            int32_t i_11 = 0
            int32_t r3_76 = 4
            int32_t r7_77 = 0xfffffffe
            
            do
                *(r0_124 - (i_11 << 2)) = (*(&data_1f2ce8 - (i_11 << 4))).b
                i_11 -= 1
                int16_t r5_50 = *(&data_1f2ce8 + r3_76)
                r3_76 += 0x10
                *(r0_124 - r7_77) = r5_50
                r7_77 -= 4
            while (0 - var_fc_1 != i_11)
            
            result_2 += var_fc_1
        else if (var_e4_1 s>= 1)
            void* r0_126 = &r12[result_2 << 2]
            int32_t i_12 = 0
            int32_t r3_77 = 4
            int32_t r7_78 = 0xfffffffe
            
            do
                *(r0_126 - (i_12 << 2)) = (*(&data_1f28e8 - (i_12 << 4))).b
                i_12 -= 1
                int16_t r5_54 = *(&data_1f28e8 + r3_77)
                r3_77 += 0x10
                *(r0_126 - r7_78) = r5_54
                r7_78 -= 4
            while (0 - var_e4_1 != i_12)
            
            result_2 += var_e4_1
        
        uint32_t num_16 = num_1
        uint32_t num_17
        
        if (num_16 s>= 1)
            if (num_16 s>= 5)
                qsort(&data_1f34e8, num_1, 0x10, compar_17ecb0)
                lr_14 = r0_94
                r9_4 = r0_95
                num_16 = 4
            
            void* r1_100 = &r12[(result_2 << 2) + 2]
            int32_t r3_78 = 0
            void* r2_61 = &data_1f34ec
            
            do
                r3_78 += 1
                *(r1_100 - 2) = (*(r2_61 - 4)).b
                int16_t r7_80 = *r2_61
                r2_61 += 0x10
                *r1_100 = r7_80
                r1_100 += 4
            while (r3_78 s< num_16)
            
            num_17 = num_1
            goto label_17e72c
        
        uint32_t num_18 = num
        
        if (num_18 s>= 1)
            if (num_18 s>= 5)
                qsort(&data_1f30e8, num, 0x10, compar_17ecb0)
                lr_14 = r0_94
                r9_4 = r0_95
                num_18 = 4
            
            void* r1_103 = &r12[(result_2 << 2) + 2]
            int32_t r3_79 = 0
            void* r2_62 = &data_1f30ec
            
            do
                r3_79 += 1
                *(r1_103 - 2) = (*(r2_62 - 4)).b
                int16_t r7_82 = *r2_62
                r2_62 += 0x10
                *r1_103 = r7_82
                r1_103 += 4
            while (r3_79 s< num_18)
            
            num_17 = num
        label_17e72c:
            
            if (num_17 s>= 4)
                num_17 = 4
            
            result_2 += num_17
        
        int32_t i_28 = i_31
        
        if (i_28 s>= 1)
            void* r0_128 = &r12[(result_2 << 2) + 2]
            void* r1_104 = &data_1f44ec
            int32_t i_13
            
            do
                i_13 = i_28
                i_28 -= 1
                *(r0_128 - 2) = (*(r1_104 - 4)).b
                int16_t r3_81 = *r1_104
                r1_104 += 0x10
                *r0_128 = r3_81
                r0_128 += 4
            while (i_13 != 1)
            result_2 += i_31
        
        if (i_38 s>= 1)
            void* r0_131 = &r12[(result_2 << 2) + 2]
            int32_t i_29 = i_38
            void* r1_105 = &data_1f48ec
            int32_t i_14
            
            do
                i_14 = i_29
                i_29 -= 1
                *(r0_131 - 2) = (*(r1_105 - 4)).b
                int16_t r3_83 = *r1_105
                r1_105 += 0x10
                *r0_131 = r3_83
                r0_131 += 4
            while (i_14 != 1)
            result_2 += i_38
        
        if (lr_14 s>= 0)
            void* r0_133 = &r12[result_2 << 2]
            *r0_133 = lr_14.b
            result_2 += 1
            *(r0_133 + 2) = 0x100
        
        if (r9_4 s>= 0)
            void* r0_135 = &r12[result_2 << 2]
            *r0_135 = r9_4.b
            result_2 += 1
            *(r0_135 + 2) = 0x100
        
        if (r1_66 s>= 0)
            void* r0_137 = &r12[result_2 << 2]
            *r0_137 = r1_66.b
            result_2 += 1
            *(r0_137 + 2) = 0
        
        int32_t r0_138 = r0_89
        bool cond:42_1 = r0_138 s>= 0
        
        if (r0_138 s>= 0)
            r12 = &r12[result_2 << 2]
            *r12 = r0_138.b
            r0_138 = 0
            result_2 += 1
        
        result = result_2
        
        if (cond:42_1)
            *(r12 + 2) = r0_138.w
    else
        int32_t* r0_90
        char r1_67
        
        if (lr_11 != 3 || i_33 != 1 || i_35 != 1)
            var_dc_2 = 0
            
            if (lr_11 != 2)
                goto label_17dcc0
            
            if (i_33 == 1)
                goto label_17dbfc
            
            if (i_35 != 1)
                goto label_17dcc0
            
            r0_90 = &data_1f08e8
            r1_67 = (data_1f08e8).b
        else
        label_17dbfc:
            r0_90 = &data_1f0ce8
            r1_67 = (data_1f0ce8).b
        
        *r12 = r1_67
        *(r12 + 2) = r0_90[1].w
    label_17dc58:
        result = 1
else
    void* r0_5 = arg4 & 0x100
    int32_t var_d4_1 = 0x64
    int32_t var_13c_1 = 0xffffffff
    __builtin_memset(&var_130_1, 0, 0x28)
    int32_t var_140_1 = 0xffffffff
    var_c8 = 0xffffffff
    int32_t var_134_1 = 0xffffffff
    int32_t var_d0_1 = 0xffffffff
    int32_t var_14c_1 = 0xffffffff
    var_b0 = 0xffffffff
    int32_t var_174_1 = 0xffffffff
    int32_t var_178_1 = 0xffffffff
    int32_t var_1a8_1 = 0
    int32_t var_170_1
    __builtin_memset(&var_170_1, 0, 0x24)
    int32_t var_1a4_1 = 0
    int32_t var_144_1 = 0
    int32_t var_198_1
    __builtin_memset(&var_198_1, 0, 0x20)
    var_138 = 0
    int32_t i_39 = 0
    i_34 = 0
    int32_t var_1a0_1 = 0
    int32_t var_1ac_1 = 0
    int32_t var_dc_1 = 0
    i_42 = 0
    i_33 = 0
    __builtin_memset(&var_100_1, 0, 0x20)
    int32_t r7_1 = r6
    int32_t r8 = 0
    result = 0
    int32_t r4_1 = 0
    r10 = 0
    CGameStateOptions* r5_1 = arg2
    i_41 = 0
    int32_t var_104_1 = r6_1
    int32_t result_1
    int32_t var_15c_1
    int32_t var_12c_1
    int32_t var_124_1
    int32_t var_110_1
    uint32_t num_19
    int32_t var_f8_1
    
    while (true)
        int16_t* r0_7 = CGameStateOptions::GetOption(r7_1)
        int32_t r2 = zx.d(r0_7[1]) - 0xa000
        
        if (r2 u> 0xf0)
            goto label_17d67c
        
        int32_t var_194_1
        int32_t var_190_1
        int32_t var_18c_1
        int32_t var_188_1
        int32_t var_184_1
        int32_t var_180_1
        int32_t var_17c_1
        int32_t var_16c_1
        int32_t var_168_1
        int32_t var_164_1
        int32_t var_158_1
        int32_t var_154_1
        int32_t var_150_1
        int32_t var_e0_1
        void* r0_11
        void* r0_65
        int32_t r0_85
        int32_t i_16
        void* i_17
        int32_t* r2_28
        int32_t* r3_3
        int32_t r9_1
        CGameStateOptions* lr_2
        bool cond:6_1
        
        switch (r2)
            case 0
                var_140_1 = r8
                goto label_17da3c
            case 1
                var_13c_1 = r8
                goto label_17da3c
            case 2, 0x15
                goto label_17da3c
            case 3, 4, 5, 6, 7, 8, 9, 0xa, 0xb, 0xc, 0xd, 0xe, 0xf, 0x12, 0x13, 0x14, 0x16, 0x17, 
                    0x18, 0x19, 0x1a, 0x1b, 0x1c, 0x1d, 0x1e, 0x1f, 0x21, 0x29, 0x2a, 0x2b, 0x2c, 
                    0x34, 0x38, 0x39, 0x3a, 0x3b, 0x3c, 0x3d, 0x3e, 0x3f, 0x47, 0x48, 0x49, 0x4a, 
                    0x4b, 0x4c, 0x4d, 0x4e, 0x4f, 0x53, 0x54, 0x55, 0x57, 0x58, 0x59, 0x5a, 0x5b, 
                    0x5c, 0x5d, 0x5e, 0x5f, 0x60, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6a, 0x6b, 
                    0x6c, 0x6d, 0x6e, 0x6f, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7a, 0x7b, 
                    0x7c, 0x7d, 0x7e, 0x7f, 0x84, 0x85, 0x86, 0x87, 0x88, 0x89, 0x8a, 0x8b, 0x8c, 
                    0x8d, 0x8e, 0x8f, 0x90, 0x91, 0x92, 0x93, 0x94, 0x95, 0x96, 0x97, 0x98, 0x99, 
                    0x9a, 0x9b, 0x9c, 0x9d, 0x9e, 0x9f, 0xa0, 0xa1, 0xa2, 0xa3, 0xa4, 0xa5, 0xa6, 
                    0xa7, 0xa8, 0xa9, 0xaa, 0xab, 0xac, 0xad, 0xae, 0xaf, 0xb0, 0xb1, 0xb2, 0xb3, 
                    0xb4, 0xb5, 0xb6, 0xb7, 0xb8, 0xb9, 0xba, 0xbb, 0xbc, 0xbd, 0xbe, 0xbf, 0xc0, 
                    0xc1, 0xc2, 0xc3, 0xc4, 0xc5, 0xc6, 0xc7, 0xc8, 0xc9, 0xca, 0xcb, 0xcc, 0xcd, 
                    0xce, 0xcf, 0xd0, 0xd1, 0xd2, 0xd3, 0xd4, 0xd5, 0xd6, 0xd7, 0xd8, 0xd9, 0xda, 
                    0xdb, 0xdc, 0xdd, 0xde, 0xdf, 0xe0, 0xe7, 0xe8, 0xe9, 0xea, 0xeb, 0xec, 0xed, 
                    0xee, 0xef
                goto label_17d67c
            case 0x10
                if (r0_5 == 0)
                    *r0_7
                    void* r0_37 = core::CWorldBase::GetInstanceByID(r5_1)
                    void* r1_22 = *(r0_37 + 0xc)
                    
                    if (zx.d(*(r1_22 + 0x162)) == 0)
                    label_17d8b4:
                        r7_1 = r6
                        
                        if (var_1a8_1 s>= 1)
                            int32_t r2_41 = 0
                            
                            do
                                if (*(&data_1ecae8 + (r2_41 << 2)) == r1_22)
                                    goto label_17d794
                                
                                r2_41 += 1
                            while (r2_41 s< var_1a8_1)
                        
                        int32_t r4_19 = var_110_1
                        int32_t r5_31 = var_134_1
                        *(&data_1ecae8 + (var_1a8_1 << 2)) = r1_22
                        int32_t r2_42 = *(r1_22 + 0x15c)
                        bool cond:14_1 = r2_42 s> r4_19
                        
                        if (r2_42 s> r4_19)
                            r4_19 = r2_42
                        
                        if (cond:14_1)
                            r5_31 = r8
                        
                        bool cond:15_1 = zx.d(*(r1_22 + 0x158)) == 0
                        var_134_1 = r5_31
                        var_110_1 = r4_19
                        var_130_1 += zx.d(*(r1_22 + 0x164)) ^ 1
                        var_1a8_1 += 1
                        int32_t* r2_44
                        
                        if (cond:15_1)
                            r2_44 = &data_1ee0e8 + (i_39 << 4)
                            *r2_44 = r8
                            i_39 += 1
                        else
                            r2_44 = &(&data_1edce8)[var_138 * 4]
                            *r2_44 = r8
                            var_138 += 1
                        
                        r2_44[1].w = 0
                        r2_44[2] = r0_37
                        r2_44[3] = r1_22
                        r5_1 = arg2
                        r7_1 = r6
                    else
                        int32_t* r2_16 = *(arg2 + 0xb80)
                        int32_t r3_11 = *(arg2 + 0xb84)
                        
                        if (r2_16 != r3_11)
                            do
                                if (zx.d(*(*(*r2_16 + 0xc) + 0xc9)) == 0
                                        && zx.d(*(r1_22 + 0x163)) == 0)
                                    goto label_17d8b4
                                
                                r2_16 = &r2_16[2]
                            while (r3_11 != r2_16)
                        
                        r5_1 = arg2
                        r7_1 = r6
                
                goto label_17da3c
            case 0x11, 0x35, 0xf0
            label_17dc20:
                *(arg_0 + 2) = 0
                *arg_0 = r8.b
                goto label_17dc58_1
            case 0x20, 0x2d, 0x2e, 0x2f
                *r0_7
                void* r0_9 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_9 != 0)
                    var_e0_1 = r4_1
                    int32_t r0_10 = __dynamic_cast(r0_9, _typeinfo_for_core::CInstance, 
                        _typeinfo_for_ascension::CCardStackUniformAscension, 0, r0_2, var_1ac_1, 
                        var_1a8_1, var_1a4_1, var_1a0_1, arg1, var_198_1, var_194_1, var_190_1, 
                        var_18c_1, var_188_1, var_184_1, var_180_1, var_17c_1, var_178_1, 
                        var_174_1, var_170_1, var_16c_1, var_168_1, var_164_1, result_1, var_15c_1, 
                        var_158_1, var_154_1, var_150_1, var_14c_1, i_39, var_144_1, var_140_1, 
                        var_13c_1, var_138, var_134_1, var_130_1, var_12c_1, i_40, var_124_1, num, 
                        num_7, num_8, num_9, var_110_1, num_19, r0_5, var_104_1, var_100_1, 
                        var_fc_1, var_f8_1, i_31, num_1, num_11, i_32, var_e4_1, var_e0_1, 
                        var_dc_1, i_41, var_d4_1, var_d0_1, i_33, var_c8, i_34, i_42, r6, result, 
                        arg2, var_b0)
                    
                    if (r0_10 != 0)
                        r0_11 = &(&data_1f08e8)[i_42 * 4]
                        *r0_11 = r8
                        i_42 += 1
                        *(r0_11 + 4) = 0x100
                    label_17ca44:
                        *(r0_11 + 8) = 0
                        *(r0_11 + 0xc) = 0
                    label_17da2c:
                        r6_1 = var_104_1
                        r5_1 = arg2
                        r7_1 = r6
                        r4_1 = var_e0_1
                        goto label_17da3c
                    
                    if (r0_5 != 0)
                        goto label_17da2c
                    
                    r7_1 = r6
                    r4_1 = var_e0_1
                    
                    if (r0_9 == 0)
                        r6_1 = var_104_1
                        r5_1 = arg2
                        goto label_17da3c
                    
                    void* r0_87 = *(r0_9 + 0xc)
                    r6_1 = var_104_1
                    
                    if (*(r0_87 + 0x88) != 8)
                        if (var_17c_1 s>= 1)
                            int32_t r1_54 = 0
                            
                            do
                                if (*(&data_1ecfe8 + (r1_54 << 2)) == r0_87)
                                    goto label_17d794
                                
                                r1_54 += 1
                            while (r1_54 s< var_17c_1)
                        
                        *(&data_1ecfe8 + (var_17c_1 << 2)) = r0_87
                        var_17c_1 += 1
                    
                    int32_t r3_32 = var_100_1
                    *(&data_1f10e8 + (r3_32 << 4)) = r8
                    var_100_1 = r3_32 + 1
                    *((r3_32 << 4) + 0x1f10ec) = 0
                    *((r3_32 << 4) + 0x1f10f0) = r0_9
                    *((r3_32 << 4) + 0x1f10f4) = r0_87
            case 0x22, 0x24
                *r0_7
                void* r0_21 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_21 != 0)
                    var_e0_1 = r4_1
                    int32_t r0_22 = __dynamic_cast(r0_21, _typeinfo_for_core::CInstance, 
                        _typeinfo_for_ascension::CCardStackUniformAscension, 0, r0_2, var_1ac_1, 
                        var_1a8_1, var_1a4_1, var_1a0_1, arg1, var_198_1, var_194_1, var_190_1, 
                        var_18c_1, var_188_1, var_184_1, var_180_1, var_17c_1, var_178_1, 
                        var_174_1, var_170_1, var_16c_1, var_168_1, var_164_1, result_1, var_15c_1, 
                        var_158_1, var_154_1, var_150_1, var_14c_1, i_39, var_144_1, var_140_1, 
                        var_13c_1, var_138, var_134_1, var_130_1, var_12c_1, i_40, var_124_1, num, 
                        num_7, num_8, num_9, var_110_1, num_19, r0_5, var_104_1, var_100_1, 
                        var_fc_1, var_f8_1, i_31, num_1, num_11, i_32, var_e4_1, var_e0_1, 
                        var_dc_1, i_41, var_d4_1, var_d0_1, i_33, var_c8, i_34, i_42, r6, result, 
                        arg2, var_b0)
                    
                    if (r0_22 != 0)
                        r0_11 = &(&data_1f0ce8)[i_33 * 4]
                        *r0_11 = r8
                        i_33 += 1
                        *(r0_11 + 4) = 0
                        goto label_17ca44
                    
                    int32_t i_15 = *(r0_21 + 0xc)
                    r7_1 = r6
                    
                    if (var_17c_1 s< 1)
                    label_17d7ec:
                        int32_t r3_35 = var_100_1
                        *(&data_1ecfe8 + (var_17c_1 << 2)) = i_15
                        *(&data_1f10e8 + (r3_35 << 4)) = r8
                        var_100_1 = r3_35 + 1
                        *((r3_35 << 4) + 0x1f10ec) = 0
                        *((r3_35 << 4) + 0x1f10f0) = r0_21
                        *((r3_35 << 4) + 0x1f10f4) = i_15
                        var_17c_1 += 1
                    else
                        int32_t r1_56 = 0
                        
                        while (*(&data_1ecfe8 + (r1_56 << 2)) != i_15)
                            r1_56 += 1
                            
                            if (r1_56 s>= var_17c_1)
                                goto label_17d7ec
                    
                    r4_1 = var_e0_1
                    r5_1 = arg2
                    r6_1 = var_104_1
                    goto label_17da3c
            case 0x23
                *r0_7
                void* r0_39 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_5 == 0 && r0_39 != 0)
                    int32_t r1_25 = *(r0_39 + 0xc)
                    
                    if (var_1a4_1 s>= 1)
                        int32_t r2_17 = 0
                        
                        do
                            if (*(&data_1ed0e8 + (r2_17 << 2)) == r1_25)
                                goto label_17da3c
                            
                            r2_17 += 1
                        while (r2_17 s< var_1a4_1)
                    
                    *(&data_1ed0e8 + (var_1a4_1 << 2)) = r1_25
                    int32_t* r3_13 = &data_1f14e8 + (i_40 << 4)
                    *r3_13 = r8
                    i_40 += 1
                    r3_13[1].w = 0
                    r3_13[2] = r0_39
                    var_1a4_1 += 1
                    r3_13[3] = r1_25
                
                goto label_17da3c
            case 0x25
                *r0_7
                void* r0_41 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_41 != 0)
                    int32_t r1_27 = *(r0_41 + 0xc)
                    
                    if (var_180_1 s>= 1)
                        int32_t r2_18 = 0
                        
                        do
                            if (*(&data_1ed1e8 + (r2_18 << 2)) == r1_27)
                                goto label_17da3c
                            
                            r2_18 += 1
                        while (r2_18 s< var_180_1)
                    
                    *(&data_1ed1e8 + (var_180_1 << 2)) = r1_27
                    void* r3_15 = &data_1f18e8 + (num_19 << 4)
                    *r3_15 = r8
                    num_19 += 1
                    *(r3_15 + 4) = 0
                    *(r3_15 + 8) = r0_41
                    var_180_1 += 1
                    *(r3_15 + 0xc) = r1_27
                
                goto label_17da3c
            case 0x26
                *r0_7
                void* r0_43 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_43 == 0)
                    goto label_17da3c
                
                lr_2 = r5_1
                i_16 = *(r0_43 + 0xc)
                
                if (var_188_1 s< 1)
                label_17cee4:
                    *(&data_1ed3e8 + (var_188_1 << 2)) = i_16
                    r3_3 = &data_1f20e8 + (num_7 << 4)
                    *r3_3 = r8
                    num_7 += 1
                    r3_3[1].w = 0
                    r3_3[2] = r0_43
                    var_188_1 += 1
                    goto label_17d330
                
                int32_t r2_19 = 0
                
                while (*(&data_1ed3e8 + (r2_19 << 2)) != i_16)
                    r2_19 += 1
                    
                    if (r2_19 s>= var_188_1)
                        goto label_17cee4
                
                r5_1 = lr_2
                goto label_17da3c
            case 0x27
                *r0_7
                void* r0_45 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_45 != 0)
                    int32_t r1_30 = *(r0_45 + 0xc)
                    
                    if (r10 s>= 1)
                        int32_t r2_20 = 0
                        
                        do
                            if (*(&data_1ed4e8 + (r2_20 << 2)) == r1_30)
                                goto label_17da3c
                            
                            r2_20 += 1
                        while (r2_20 s< r10)
                    
                    *(&data_1ed4e8 + (r10 << 2)) = r1_30
                    r10 += 1
                    void* r3_18 = &data_1f24e8 + (num_8 << 4)
                    *r3_18 = r8
                    num_8 += 1
                    *(r3_18 + 4) = 0
                    *(r3_18 + 8) = r0_45
                    *(r3_18 + 0xc) = r1_30
                
                goto label_17da3c
            case 0x28
                *r0_7
                void* r0_47 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_47 == 0)
                    goto label_17da3c
                
                lr_2 = r5_1
                i_16 = *(r0_47 + 0xc)
                
                if (var_184_1 s< 1)
                label_17d024:
                    *(&data_1ed2e8 + (var_184_1 << 2)) = i_16
                    r3_3 = &data_1f1ce8 + (num_9 << 4)
                    *r3_3 = r8
                    num_9 += 1
                    r3_3[1].w = 0
                    r3_3[2] = r0_47
                    var_184_1 += 1
                    goto label_17d330
                
                int32_t r2_21 = 0
                
                while (*(&data_1ed2e8 + (r2_21 << 2)) != i_16)
                    r2_21 += 1
                    
                    if (r2_21 s>= var_184_1)
                        goto label_17d024
                
                r5_1 = lr_2
                goto label_17da3c
            case 0x30, 0x37
                *r0_7
                void* r0_24 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_24 == 0)
                    goto label_17da3c
                
                lr_2 = r5_1
                i_16 = *(r0_24 + 0xc)
                
                if (var_154_1 s>= 1)
                    int32_t r2_9 = 0
                    
                    while (*(&data_1edae8 + (r2_9 << 2)) != i_16)
                        r2_9 += 1
                        
                        if (r2_9 s>= var_154_1)
                            goto label_17cabc
                    
                    r5_1 = lr_2
                    goto label_17da3c
                
            label_17cabc:
                *(&data_1edae8 + (var_154_1 << 2)) = i_16
                r3_3 = &data_1f3ce8 + (result_1 << 4)
                *r3_3 = r8
                result_1 += 1
                r3_3[1].w = 0
                r3_3[2] = r0_24
                var_154_1 += 1
            label_17d330:
                r5_1 = lr_2
                r3_3[3] = i_16
                goto label_17da3c
            case 0x31
                *r0_7
                void* r0_49 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_49 == 0)
                    goto label_17da3c
                
                lr_2 = r5_1
                int32_t r5_19 = var_198_1
                i_16 = *(r0_49 + 0xc)
                
                if (r5_19 s< 1)
                label_17d0c4:
                    *(&data_1edbe8 + (r5_19 << 2)) = i_16
                    r3_3 = &data_1f40e8 + (result << 4)
                    *r3_3 = r8
                    result += 1
                    r3_3[1].w = 0
                    r3_3[2] = r0_49
                    var_198_1 = r5_19 + 1
                    goto label_17d330
                
                int32_t r2_22 = 0
                
                while (*(&data_1edbe8 + (r2_22 << 2)) != i_16)
                    r2_22 += 1
                    
                    if (r2_22 s>= r5_19)
                        goto label_17d0c4
                
                r5_1 = lr_2
                goto label_17da3c
            case 0x32
                *r0_7
                void* r0_51 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_51 == 0 || zx.d(*(*(r0_51 + 0xc) + 0x160)) != 0)
                    goto label_17da3c
                
                goto label_17dc20
            case 0x33
                *r0_7
                void* r0_55 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_55 == 0 || zx.d(*(*(r0_55 + 0xc) + 0x160)) == 0)
                    goto label_17da3c
                
                goto label_17dc20
            case 0x36, 0x51, 0x56
                *r0_7
                int32_t r2_5 = 0x98
                int32_t* r0_15 = *(*(core::CWorldBase::GetInstanceByID(r5_1) + 0x10) + 0xc)
                
                if (*(r5_1 + 0x30) u< 0x14)
                    r2_5 = 0x9c
                
                int32_t r2_6 = var_d4_1
                int32_t r0_17 = r0_15[0x28] + *(r0_15 + r2_5)
                int32_t r1_8 = var_d0_1
                
                if (r0_17 s< r2_6)
                    r1_8 = r8
                    r2_6 = r0_17
                
                var_d0_1 = r1_8
                var_d4_1 = r2_6
                goto label_17da3c
            case 0x40, 0x45, 0x46
                *r0_7
                void* r0_19 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_19 != 0)
                    int32_t r1_10 = *(r0_19 + 0xc)
                    
                    if (var_144_1 s>= 1)
                        int32_t r2_7 = 0
                        
                        do
                            if (*(&data_1ed5e8 + (r2_7 << 2)) == r1_10)
                                goto label_17da3c
                            
                            r2_7 += 1
                        while (r2_7 s< var_144_1)
                    
                    *(&data_1ed5e8 + (var_144_1 << 2)) = r1_10
                    int32_t* r3_1 = &data_1f28e8 + (var_e4_1 << 4)
                    *r3_1 = r8
                    var_e4_1 += 1
                    r3_1[1].w = 0
                    r3_1[2] = r0_19
                    r3_1[3] = r1_10
                    var_144_1 += 1
                
                goto label_17da3c
            case 0x41
                var_c8 = r8
                goto label_17da3c
            case 0x42
                *r0_7
                void* r0_59 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_59 != 0)
                    int32_t r1_36 = *(r0_59 + 0xc)
                    
                    if (var_190_1 s>= 1)
                        int32_t r2_23 = 0
                        
                        do
                            if (*(&data_1ed7e8 + (r2_23 << 2)) == r1_36)
                                goto label_17da3c
                            
                            r2_23 += 1
                        while (r2_23 s< var_190_1)
                    
                    *(&data_1ed7e8 + (var_190_1 << 2)) = r1_36
                    int32_t* r3_22 = &data_1f30e8 + (num << 4)
                    *r3_22 = r8
                    num += 1
                    r3_22[1].w = 0
                    r3_22[2] = r0_59
                    r3_22[3] = r1_36
                    var_190_1 += 1
                
                goto label_17da3c
            case 0x43
                *r0_7
                void* r0_61 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_61 == 0)
                    goto label_17da3c
                
                lr_2 = r5_1
                i_16 = *(r0_61 + 0xc)
                
                if (var_18c_1 s< 1)
                label_17d260:
                    *(&data_1ed6e8 + (var_18c_1 << 2)) = i_16
                    r3_3 = &data_1f2ce8 + (var_fc_1 << 4)
                    *r3_3 = r8
                    var_fc_1 += 1
                    r3_3[1].w = 0
                    r3_3[2] = r0_61
                    var_18c_1 += 1
                    goto label_17d330
                
                int32_t r2_24 = 0
                
                while (*(&data_1ed6e8 + (r2_24 << 2)) != i_16)
                    r2_24 += 1
                    
                    if (r2_24 s>= var_18c_1)
                        goto label_17d260
                
                r5_1 = lr_2
                goto label_17da3c
            case 0x44
                *r0_7
                void* r0_63 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_63 == 0)
                    goto label_17da3c
                
                lr_2 = r5_1
                i_16 = *(r0_63 + 0xc)
                
                if (var_194_1 s< 1)
                label_17d300:
                    *(&data_1ed8e8 + (var_194_1 << 2)) = i_16
                    r3_3 = &data_1f34e8 + (num_1 << 4)
                    *r3_3 = r8
                    num_1 += 1
                    r3_3[1].w = 0
                    r3_3[2] = r0_63
                    var_194_1 += 1
                    goto label_17d330
                
                int32_t r2_25 = 0
                
                while (*(&data_1ed8e8 + (r2_25 << 2)) != i_16)
                    r2_25 += 1
                    
                    if (r2_25 s>= var_194_1)
                        goto label_17d300
                
                r5_1 = lr_2
                goto label_17da3c
            case 0x50
                *r0_7
                r9_1 = r7_1
                r0_65 = core::CWorldBase::GetInstanceByID(r5_1)
                i_17 = *(r0_65 + 0xc)
                
                if (var_164_1 s>= 1)
                    int32_t r2_26 = 0
                    
                    while (*(&data_1ecbe8 + (r2_26 << 2)) != i_17)
                        r2_26 += 1
                        
                        if (r2_26 s>= var_164_1)
                            goto label_17d390
                    
                    r7_1 = r9_1
                    goto label_17da3c
                
            label_17d390:
                *(&data_1ecbe8 + (var_164_1 << 2)) = i_17
                var_164_1 += 1
                
                if (zx.d(*(i_17 + 0x160)) == 0)
                    r2_28 = &data_1ef0e8 + (var_12c_1 << 4)
                    *r2_28 = r8
                    var_12c_1 += 1
                else
                    r2_28 = &data_1eece8 + (var_f8_1 << 4)
                    *r2_28 = r8
                    var_f8_1 += 1
                
            label_17d894:
                r7_1 = r9_1
                r2_28[1].w = 0
                r2_28[2] = r0_65
                r2_28[3] = i_17
                goto label_17da3c
            case 0x52
                *r0_7
                int32_t r2_29 = 0x98
                int32_t* r0_69 = *(*(core::CWorldBase::GetInstanceByID(r5_1) + 0x10) + 0xc)
                
                if (*(r5_1 + 0x30) u< 0x14)
                    r2_29 = 0x9c
                
                int32_t r2_30 = var_158_1
                int32_t r0_71 = r0_69[0x28] + *(r0_69 + r2_29)
                int32_t r1_43 = var_14c_1
                
                if (r0_71 s> r2_30)
                    r1_43 = r8
                    r2_30 = r0_71
                
                var_14c_1 = r1_43
                var_158_1 = r2_30
                goto label_17da3c
            case 0x61
                *r0_7
                r9_1 = r7_1
                r0_65 = core::CWorldBase::GetInstanceByID(r5_1)
                i_17 = *(r0_65 + 0xc)
                
                if (var_16c_1 s>= 1)
                    int32_t r2_31 = 0
                    
                    while (*(&data_1ecde8 + (r2_31 << 2)) != i_17)
                        r2_31 += 1
                        
                        if (r2_31 s>= var_16c_1)
                            goto label_17d464
                    
                    r7_1 = r9_1
                    goto label_17da3c
                
            label_17d464:
                *(&data_1ecde8 + (var_16c_1 << 2)) = i_17
                var_16c_1 += 1
                
                if (zx.d(*(i_17 + 0x161)) == 0)
                    r2_28 = &data_1f00e8 + (var_dc_1 << 4)
                    *r2_28 = r8
                    var_dc_1 += 1
                else
                    r2_28 = &data_1efce8 + (var_124_1 << 4)
                    *r2_28 = r8
                    var_124_1 += 1
                
                goto label_17d894
            case 0x62
                *r0_7
                r9_1 = r7_1
                r0_65 = core::CWorldBase::GetInstanceByID(r5_1)
                i_17 = *(r0_65 + 0xc)
                
                if (var_168_1 s>= 1)
                    int32_t r2_33 = 0
                    
                    while (*(&data_1ecce8 + (r2_33 << 2)) != i_17)
                        r2_33 += 1
                        
                        if (r2_33 s>= var_168_1)
                            goto label_17d4e8
                    
                    r7_1 = r9_1
                    goto label_17da3c
                
            label_17d4e8:
                *(&data_1ecce8 + (var_168_1 << 2)) = i_17
                var_168_1 += 1
                
                if (zx.d(*(i_17 + 0x161)) == 0)
                    r2_28 = &data_1ef8e8 + (var_1ac_1 << 4)
                    *r2_28 = r8
                    var_1ac_1 += 1
                else
                    r2_28 = &data_1ef4e8 + (var_1a0_1 << 4)
                    *r2_28 = r8
                    var_1a0_1 += 1
                
                goto label_17d894
            case 0x63
                *r0_7
                void* r0_75 = core::CWorldBase::GetInstanceByID(r5_1)
                int32_t r5_27 = var_170_1
                int32_t r1_47 = *(r0_75 + 0xc)
                
                if (r5_27 s>= 1)
                    int32_t r2_35 = 0
                    
                    do
                        if (*(&data_1ecee8 + (r2_35 << 2)) == r1_47)
                            goto label_17da3c
                        
                        r2_35 += 1
                    while (r2_35 s< r5_27)
                
                *(&data_1ecee8 + (r5_27 << 2)) = r1_47
                int32_t* r3_29 = &data_1f04e8 + (num_11 << 4)
                *r3_29 = r8
                num_11 += 1
                r3_29[1].w = 0
                r3_29[2] = r0_75
                var_170_1 = r5_27 + 1
                r3_29[3] = r1_47
                goto label_17da3c
            case 0x70, 0x72
                *r0_7
                void* r2_10 = *(core::CWorldBase::GetInstanceByID(r5_1) + 0x10)
                int16_t r1_17 = 0
                
                if (r2_10 != 0)
                    if (r0_5 != 0)
                        r1_17 = 0x100
                    
                    if (r0_5 != 0 && zx.d(*(r2_10 + 0x198)) == 0)
                        goto label_17da3c
                    
                    int32_t r3_6 = *(r2_10 + 0x19c)
                    int32_t r5_8 = var_110_1
                    int32_t r7_6 = var_134_1
                    
                    if (r3_6 s> r5_8)
                        r5_8 = r3_6
                        r7_6 = r8
                    
                    var_110_1 = r5_8
                    var_134_1 = r7_6
                    
                    if (zx.d(*(r2_10 + 0x199)) != 0)
                        goto label_17dc20
                
                void* r2_12 = &data_1ee4e8 + (i_34 << 4)
                *r2_12 = r8
                i_34 += 1
                *(r2_12 + 4) = r1_17
                *(r2_12 + 8) = 0
                *(r2_12 + 0xc) = 0
                goto label_17da3c
            case 0x71
                *r0_7
                void* r0_78 = *(core::CWorldBase::GetInstanceByID(r5_1) + 0x10)
                int32_t r2_36 = *(r0_78 + 0xc)
                void* r1_49 = &data_1ee8e8 + (i_32 << 4)
                *r1_49 = r8
                i_32 += 1
                *(r1_49 + 4) = 0
                *(r1_49 + 8) = r0_78
                *(r1_49 + 0xc) = r2_36
                goto label_17da3c
            case 0x80
                char __s1[0x80]
                CUserOption::DisplayOption(r0_7, &__s1)
                int32_t r5_30 = 0
                int32_t r0_81 = 0
                
                if (strcasecmp(&__s1, "Destroy Even") != 0)
                    if (strcasecmp(&__s1, "Destroy Odd") == 0)
                        r0_81 = 1
                    else
                        r5_1 = arg2
                    label_17d67c:
                        void* r0_84 = &data_1f48e8 + (i_41 << 4)
                        *r0_84 = r8
                        i_41 += 1
                        *(r0_84 + 4) = 0
                        *(r0_84 + 8) = 0
                        *(r0_84 + 0xc) = 0
                    label_17da3c:
                        r8 += 1
                        
                        if (r8 s>= r6_1)
                            break
                        
                        continue
                
                var_e0_1 = r4_1
                int32_t* r2_46 = *(*(arg1 + 0x20) + 0x18)
                int32_t r12_16 = *(arg2 + 0x1c)
                
                if (r2_46 != r12_16)
                    r5_30 = 0
                    
                    do
                        void* r7_56 = *r2_46
                        
                        if (*(r7_56 + 0xc) != *(arg1 + 4))
                            int32_t* r6_19 = *(r7_56 + 0x54)
                            int32_t r4_20 = *(r7_56 + 0x58)
                            
                            if (r6_19 != r4_20)
                                do
                                    void* r1_61 = *r6_19
                                    r6_19 = &r6_19[1]
                                    int32_t r3_41 = 0x98
                                    
                                    if (*(arg2 + 0x30) u< 0x14)
                                        r3_41 = 0x9c
                                    
                                    int32_t r1_64 = *(*(*(r1_61 + 0x10) + 0xc) + r3_41)
                                    
                                    if (r1_64 - ((r1_64 + (r1_64 u>> 0x1f)) & 0xfffffffe) == r0_81)
                                        r5_30 += r1_64
                                while (r4_20 != r6_19)
                        
                        r2_46 = &r2_46[1]
                    while (r2_46 != r12_16)
                
                int32_t r1_65 = var_178_1
                int32_t r0_88 = var_174_1
                
                if (r5_30 s> r1_65)
                    r0_88 = r8
                    r1_65 = r5_30
                
                var_174_1 = r0_88
                var_178_1 = r1_65
                goto label_17da2c
            case 0x81, 0x83
                *r0_7
                void* r0_29 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_29 != 0 && zx.d(*(*(r0_29 + 0xc) + 0x163)) == 0)
                    int32_t i_44 = i_31
                    *(&data_1f44e8 + (i_44 << 4)) = r8
                    i_31 = i_44 + 1
                    *((i_44 << 4) + &data_1f44ec) = 0
                    *((i_44 << 4) + 0x1f44f0) = 0
                    *((i_44 << 4) + 0x1f44f4) = 0
                
                goto label_17da3c
            case 0x82, 0xe1
                *r0_7
                void* r0_35 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_35 == 0)
                    goto label_17da3c
                
                lr_2 = r5_1
                i_16 = *(r0_35 + 0xc)
                
                if (var_150_1 s< 1)
                label_17cc60:
                    *(&data_1ed9e8 + (var_150_1 << 2)) = i_16
                    r3_3 = &data_1f38e8 + (var_15c_1 << 4)
                    *r3_3 = r8
                    var_15c_1 += 1
                    r3_3[1].w = 0
                    r3_3[2] = r0_35
                    var_150_1 += 1
                    goto label_17d330
                
                int32_t r2_14 = 0
                
                while (*(&data_1ed9e8 + (r2_14 << 2)) != i_16)
                    r2_14 += 1
                    
                    if (r2_14 s>= var_150_1)
                        goto label_17cc60
                
                r5_1 = lr_2
                goto label_17da3c
            case 0xe2
                r0_85 = var_b0
                cond:6_1 = r4_1 s< 1
                
                if (r4_1 s< 1)
                    r4_1 = 1
                
            label_17d6e4:
                
                if (cond:6_1)
                    r0_85 = r8
                
                var_b0 = r0_85
                goto label_17da3c
            case 0xe3
                r0_85 = var_b0
                cond:6_1 = r4_1 s< 2
                
                if (r4_1 s< 2)
                    r4_1 = 2
                
                goto label_17d6e4
            case 0xe4
                r0_85 = var_b0
                cond:6_1 = r4_1 s< 3
                
                if (r4_1 s< 3)
                    r4_1 = 3
                
                goto label_17d6e4
            case 0xe5
                r0_85 = var_b0
                cond:6_1 = r4_1 s< 4
                
                if (r4_1 s< 4)
                    r4_1 = 4
                
                goto label_17d6e4
            case 0xe6
                r0_85 = var_b0
                cond:6_1 = r4_1 s< 5
                
                if (r4_1 s< 5)
                    r4_1 = 5
                
                goto label_17d6e4
        
    label_17d794:
        r5_1 = arg2
        goto label_17da3c
    
    if (var_110_1 s< 1)
        int32_t r1_70 = var_d0_1
        r12 = arg_0
        
        if (r1_70 == 0xffffffff)
            r1_70 = var_14c_1
            
            if (r1_70 != 0xffffffff)
                goto label_17dc8c
            
            r1_70 = var_174_1
            
            if (r1_70 != 0xffffffff)
                goto label_17dc8c
            
            if (var_15c_1 s>= 1)
                if (*(r0_2 + 0x9c) s< 1)
                label_17e8b8:
                    void* r1_108 = *(r0_2 + 0x38)
                    
                    if (*(r1_108 + 0x18) != 0)
                    label_17e8d8:
                        int32_t* i_18 = *(r1_108 + 0xc)
                        
                        for (int32_t r1_109 = *(r1_108 + 0x10); i_18 != r1_109; i_18 = &i_18[1])
                            void* r3_86 = &data_1f38f4
                            int32_t r6_29 = 0
                            
                            do
                                if (*r3_86 == *(*i_18 + 0xc))
                                    *(r3_86 - 8) += 1
                                    break
                                
                                r6_29 += 1
                                r3_86 += 0x10
                            while (r6_29 s< var_15c_1)
                        
                        int32_t r0_148 = var_15c_1 - 1
                        void* r1_110 = &data_1f38fc
                        int16_t r3_87 = data_1f38ec
                        char r2_64 = 0
                        int16_t r7_87 = r3_87
                        
                        while (true)
                            if (zx.d(r3_87) s> sx.d(r7_87))
                                r2_64 = (*(r1_110 - 0x14)).b
                                r7_87 = r3_87
                            
                            if (r0_148 == 0)
                                break
                            
                            r3_87 = *r1_110
                            r1_110 += 0x10
                            r0_148 -= 1
                        
                        *(r12 + 2) = 0
                        *r12 = r2_64
                    else
                        r1_108 = *(r0_2 + 0x40)
                        
                        if (*(r1_108 + 0x18) != 0)
                            goto label_17e8d8
                        
                        *(r12 + 2) = 0
                        *r12 = 0
                else
                    int32_t i_19 = *(ascension::CPlayer::GetTopCardFromDeck() + 0xc)
                    int32_t r0_145 = 0
                    r12 = arg_0
                    
                    while (*((r0_145 << 4) + &data_1f38f4) != i_19)
                        r0_145 += 1
                        
                        if (r0_145 s>= var_15c_1)
                            goto label_17e8b8
                    
                    char r0_152 = (*(&data_1f38e8 + (r0_145 << 4))).b
                    *(r12 + 2) = 0
                    *r12 = r0_152
                
                result = 1
            else
                void* r0_153
                int32_t r3_90
                
                if (result_1 s< 1)
                    lr_11 = r6_1
                    r1_66 = var_140_1
                    r0_89 = var_13c_1
                    r8_1 = var_124_1
                    r7_58 = var_1a0_1
                    r5_32 = var_12c_1
                    i_36 = i_39
                    r3_45 = var_f8_1
                    r4_21 = var_dc_1
                    r9_3 = var_1a4_1
                    num_10 = num_19
                    
                    if (result s< 1)
                        goto label_17db88
                    
                    void* r0_155 = *(arg2 + 0xb20)
                    
                    if (r0_155 == 0 || *(r0_155 + 0xc) != *(arg1 + 4))
                        int32_t r2_68 = 0
                        int32_t r7_89 = 0
                        r3_90 = 0
                        r0_153 = &data_1f40e8
                        
                        do
                            int32_t r5_62 = 0x98
                            int32_t* r6_36 = *((r2_68 << 4) + 0x1f40f4)
                            
                            if (*(arg2 + 0x30) u< 0x14)
                                r5_62 = 0x9c
                            
                            int32_t r6_38 = ((r6_36[0x28] + *(r6_36 + r5_62)) << 1) - r6_36[0x29]
                            
                            if (r6_38 s> r7_89)
                                r3_90 = r2_68
                            
                            r2_68 += 1
                            
                            if (r6_38 s> r7_89)
                                r7_89 = r6_38
                        while (result != r2_68)
                        
                    label_17eb78:
                        int32_t* r0_158 = r0_153 + (r3_90 << 4)
                        *r12 = (*r0_158).b
                        *(r12 + 2) = r0_158[1].w
                        result = 1
                    else
                        void* r0_157 = &r12[2]
                        int32_t r2_67 = result
                        void* r1_117 = &data_1f40ec
                        int32_t i_20
                        
                        do
                            i_20 = r2_67
                            r2_67 -= 1
                            *(r0_157 - 2) = (*(r1_117 - 4)).b
                            int16_t r3_92 = *r1_117
                            r1_117 += 0x10
                            *r0_157 = r3_92
                            r0_157 += 4
                        while (i_20 != 1)
                else
                    void* r0_149 = *(r5_1 + 0xb20)
                    
                    if (r0_149 == 0 || *(r0_149 + 0xc) != *(arg1 + 4))
                        int32_t r2_65 = 0
                        int32_t r7_88 = 0
                        r3_90 = 0
                        r0_153 = &data_1f3ce8
                        
                        do
                            int32_t r5_59 = 0x98
                            int32_t* r6_32 = *((r2_65 << 4) + 0x1f3cf4)
                            
                            if (*(r5_1 + 0x30) u< 0x14)
                                r5_59 = 0x9c
                            
                            int32_t r6_34 = ((r6_32[0x28] + *(r6_32 + r5_59)) << 1) - r6_32[0x29]
                            
                            if (r6_34 s> r7_88)
                                r3_90 = r2_65
                            
                            r2_65 += 1
                            
                            if (r6_34 s> r7_88)
                                r7_88 = r6_34
                        while (result_1 != r2_65)
                        
                        goto label_17eb78
                    
                    void* r0_151 = &r12[2]
                    int32_t i_30 = result_1
                    void* r1_113 = &data_1f3cec
                    int32_t i_21
                    
                    do
                        i_21 = i_30
                        i_30 -= 1
                        *(r0_151 - 2) = (*(r1_113 - 4)).b
                        int16_t r3_89 = *r1_113
                        r1_113 += 0x10
                        *r0_151 = r3_89
                        r0_151 += 4
                    while (i_21 != 1)
                    result = result_1
        else
        label_17dc8c:
            *(r12 + 2) = 0
            *r12 = r1_70.b
            result = 1
    else
        *(arg_0 + 2) = 0
        *arg_0 = var_134_1.b
    label_17dc58_1:
        result = 1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
