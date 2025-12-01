// 函数: _ZN12ascension_ai9CMediumAI23BuildEvaluateOptionListEPN9ascension6CWorldEP17CGameStateOptionstPNS_15OptionListEntryE
// 地址: 0x176e38
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

CGameStateOptions* r8 = arg2
int32_t r5 = arg3
int32_t r1 = *__stack_chk_guard
int32_t r1_2 = *(*(arg3 + 0x48) + 0xc)
void* r0_1 = ascension::CWorld::GetPlayerByIndex(*(arg1 + 0x20))
int32_t r0_3 = CGameStateOptions::GetOptionCount()
char* arg_0
char* r9 = arg_0
CGameStateOptions* var_c4 = r8
int32_t result
int32_t var_154
int32_t var_14c
char var_148
uint32_t num
uint32_t num_7
void* var_134
void* var_130
uint32_t num_8
uint32_t num_9
int32_t var_11c_1
uint32_t num_10
int32_t var_114_1
void* var_110
int32_t var_10c
uint32_t num_11
int32_t var_100
int32_t var_f4
uint32_t num_1
void* var_e8
int32_t var_e4_1
int32_t var_e0_1
int32_t i_33
int32_t var_c8_1
int32_t var_b4
int32_t var_b0
void* r0_103
int16_t r0_104
int16_t r0_107
void* r2_54
int32_t r3_47
int32_t r4_14
int32_t r5_40
void* r6_5
int32_t r7_41
int32_t r8_2
int32_t r10
int32_t r12_2

if (r0_3 s< 1)
    var_148 = -1
    var_100 = 0
    num = 0
    var_10c = 0
    var_f4 = 0
    num_11 = 0
    __builtin_memset(&num_8, 0, 0x14)
    num_7 = 0
    var_b0 = 0
    var_e0_1 = 0
    var_c8_1 = 0
    num_1 = 0
    var_e4_1 = 0
    i_33 = 0
    var_154 = 0
    var_b4 = 0
    var_130 = 0xffffffff
    var_134 = 0xffffffff
    var_110 = 0xffffffff
    r3_47 = 0
    r4_14 = 0
    r8_2 = 0
    r12_2 = 0
    r7_41 = 0
    r5_40 = 0
    r10 = 0
    r0_103 = 0xffffffff
    r2_54 = 0xffffffff
    r6_5 = 0xffffffff
    var_e8 = 0xffffffff
    var_14c = 0
label_178818:
    
    if (r8_2 s> 0)
        r2_54 = 0xffffffff
    
    if (r7_41 s> 0)
        r12_2 = 0
    
    if (r8_2 s> 0)
        r4_14 = 0
    
    if (r4_14 s> 0)
        r3_47 = 0
    
    if (r8_2 s> 0)
        r3_47 = 0
    
    int32_t var_128_2 = r3_47
    
    if (r2_54 == 0xffffffff)
    label_1789b8:
        void* r1_84 = var_e8
        int32_t i_32 = i_33
        
        if (var_14c s> 0)
            r0_103 = 0xffffffff
            r6_5 = 0xffffffff
        
        if (var_14c s> 0)
            r1_84 = 0xffffffff
        
        int32_t r0_108 = var_c8_1
        
        if (var_14c s> 0)
            r0_108 = 0
        
        int32_t var_cc_2 = r5_40
        int32_t result_4
        
        if (i_32 s< 1)
            result_4 = 0
        else
            int32_t r1_85 = 4
            int32_t i_34 = i_32
            int32_t r7_42 = 0
            int32_t i
            
            do
                i = i_32
                i_32 -= 1
                char* r5_42 = &r9[r7_42]
                *r5_42 = (*(&data_1e5c38 + (r7_42 << 1))).b
                void* r6_7 = &data_1e5c38 + r1_85
                r1_85 += 0x10
                r7_42 += 8
                int16_t r6_8 = *r6_7
                *(r5_42 + 4) = 0
                *(r5_42 + 2) = r6_8
            while (i != 1)
            r5_40 = var_cc_2
            result_4 = i_34
        
        int32_t r8_3 = var_e4_1
        int32_t r6_9 = r12_2
        
        if (var_154 s>= 1)
            void* r2_62 = &r9[result_4 << 3]
            *r2_62 = (data_1e5838).b
            result_4 += 1
            int16_t r0_110 = data_1e583c
            *(r2_62 + 4) = 0
            *(r2_62 + 2) = r0_110
        
        int32_t result_3 = result_4
        int32_t result_5 = result_4
        
        if (r5_40 s>= 1)
            void* r2_63 = &r9[result_4 << 3]
            int32_t r3_49 = 4
            int32_t r7_43 = 2
            int32_t i_1 = 0
            
            do
                void* r1_87 = &data_1e6038 + r3_49
                void* r0_112 = r2_63 - (i_1 << 3)
                *r0_112 = (*(&data_1e6038 - (i_1 << 4))).b
                void* r4_16 = r2_63 + r7_43
                i_1 -= 1
                r7_43 += 8
                r3_49 += 0x10
                *r4_16 = *r1_87
                *(r0_112 + 4) = 0
            while (0 - r5_40 != i_1)
            
            r5_40 = var_cc_2
            result_4 = result_5
            r6_9 = r12_2
            result_3 = result_4 + r5_40
        
        if (r8_3 s>= 1)
            void* r2_64 = &r9[result_3 << 3]
            int32_t r3_50 = 4
            int32_t r7_44 = 2
            int32_t i_2 = 0
            
            do
                void* r1_89 = &data_1e6438 + r3_50
                void* r0_115 = r2_64 - (i_2 << 3)
                *r0_115 = (*(&data_1e6438 - (i_2 << 4))).b
                void* r4_18 = r2_64 + r7_44
                i_2 -= 1
                r7_44 += 8
                r3_50 += 0x10
                *r4_18 = *r1_89
                *(r0_115 + 4) = 0
            while (0 - r8_3 != i_2)
            
            r8_3 = var_e4_1
            r5_40 = var_cc_2
            result_4 = result_5
            result_3 += r8_3
            r6_9 = r12_2
        
        int32_t r2_66 = r7_41
        
        if (r2_66 s>= 1)
            int32_t result_6 = result_4
            
            if (r8_3 s> 0)
                result_6 += r8_3
            
            if (r5_40 s> 0)
                result_6 += r5_40
            
            void* r1_92 = &r9[result_3 << 3]
            int32_t r7_45 = 4
            int32_t r6_10 = 2
            int32_t i_3 = 0
            
            do
                void* r0_116 = r1_92 + r6_10
                r6_10 += 8
                *(r1_92 - (i_3 << 3)) = (*(&data_1e6838 - (i_3 << 4))).b
                void* r3_52 = &data_1e6838 + r7_45
                r7_45 += 0x10
                *r0_116 = *r3_52
                void* r0_117 = &r9[result_6 << 3] - (i_3 << 3)
                i_3 -= 1
                *(r0_117 + 4) = 0
            while (0 - r2_66 != i_3)
            
            r2_66 = r7_41
            r5_40 = var_cc_2
            result_3 += r2_66
            result_4 = result_5
            r8_3 = var_e4_1
            r6_9 = r12_2
        
        if (r6_9 s>= 1)
            int32_t result_7 = result_4
            
            if (r2_66 s> 0)
                result_7 += r2_66
            
            if (r8_3 s> 0)
                result_7 += r8_3
            
            if (r5_40 s> 0)
                result_7 += r5_40
            
            void* r1_94 = &r9[(result_3 << 3) + 2]
            int32_t r7_46 = 4
            int32_t i_4 = 0
            
            do
                void* r0_119 = &r9[result_7 << 3] - (i_4 << 3)
                *r0_119 = (*(&data_1e6c38 - (i_4 << 4))).b
                void* r4_20 = &data_1e6c38 + r7_46
                i_4 -= 1
                r7_46 += 0x10
                *r1_94 = *r4_20
                r1_94 += 8
                *(r0_119 + 4) = 0
            while (0 - r6_9 != i_4)
            
            r6_9 = r12_2
            r5_40 = var_cc_2
            result_4 = result_5
            result_3 += r6_9
            r2_66 = r7_41
        
        int32_t r7_48 = r8_2
        
        if (r7_48 s>= 1)
            int32_t result_8 = result_4
            
            if (r6_9 s> 0)
                result_8 += r6_9
            
            if (r2_66 s> 0)
                result_8 += r2_66
            
            if (r8_3 s> 0)
                result_8 += r8_3
            
            if (r5_40 s> 0)
                result_8 += r5_40
            
            void* r1_96 = &r9[(result_3 << 3) + 2]
            int32_t r7_47 = 4
            int32_t i_5 = 0
            
            do
                void* r0_121 = &r9[result_8 << 3] - (i_5 << 3)
                *r0_121 = (*(&data_1e7038 - (i_5 << 4))).b
                void* r4_23 = &data_1e7038 + r7_47
                i_5 -= 1
                r7_47 += 0x10
                *r1_96 = *r4_23
                r1_96 += 8
                *(r0_121 + 4) = 0
            while (0 - r7_48 != i_5)
            
            r7_48 = r8_2
            r5_40 = var_cc_2
            result_4 = result_5
            result_3 += r7_48
            r2_66 = r7_41
            r6_9 = r12_2
        
        int32_t r4_28 = r4_14
        
        if (r4_28 s>= 1)
            int32_t result_9 = result_4
            
            if (r6_9 s> 0)
                result_9 += r6_9
            
            if (r7_48 s> 0)
                result_9 += r7_48
            
            if (r2_66 s> 0)
                result_9 += r2_66
            
            if (r8_3 s> 0)
                result_9 += r8_3
            
            if (r5_40 s> 0)
                result_9 += r5_40
            
            void* r1_98 = &r9[(result_3 << 3) + 2]
            int32_t r7_49 = 4
            int32_t i_6 = 0
            
            do
                void* r0_123 = &r9[result_9 << 3] - (i_6 << 3)
                *r0_123 = (*(&data_1e7838 - (i_6 << 4))).b
                void* r4_26 = &data_1e7838 + r7_49
                i_6 -= 1
                r7_49 += 0x10
                *r1_98 = *r4_26
                r1_98 += 8
                *(r0_123 + 4) = 0
            while (0 - r4_28 != i_6)
            
            r4_28 = r4_14
            r5_40 = var_cc_2
            result_4 = result_5
            result_3 += r4_28
            r2_66 = r7_41
            r7_48 = r8_2
            r6_9 = r12_2
        
        if (var_128_2 s>= 1)
            if (r4_28 s> 0)
                result_4 += r4_28
            
            if (r6_9 s> 0)
                result_4 += r6_9
            
            if (r7_48 s> 0)
                result_4 += r7_48
            
            if (r2_66 s> 0)
                result_4 += r2_66
            
            if (r8_3 s> 0)
                result_4 += r8_3
            
            if (r5_40 s> 0)
                result_4 += r5_40
            
            void* r1_100 = &r9[(result_3 << 3) + 2]
            int32_t r7_50 = 4
            int32_t i_7 = 0
            
            do
                void* r0_126 = &r9[result_4 << 3] - (i_7 << 3)
                *r0_126 = (*(&data_1e7c38 - (i_7 << 4))).b
                void* r4_30 = &data_1e7c38 + r7_50
                i_7 -= 1
                r7_50 += 0x10
                *r1_100 = *r4_30
                r1_100 += 8
                *(r0_126 + 4) = 0
            while (0 - var_128_2 != i_7)
            
            result_3 += var_128_2
        
        uint32_t num_19
        
        if (num_1 s< 5)
            num_19 = num_1
            
            if (num_1 s>= 1)
                goto label_178f54
            
            result = result_3
        else
            qsort(&data_1e8038, num_1, 0x10, compar)
            num_19 = 4
            int32_t r2_71 = *((num_1 << 4) + 0x2c)
            int32_t r3_59 = *((num_1 << 4) + 0x30)
            int32_t r0_129 = (&data_1e8034)[num_1 * 4]
            data_1e8068 = (&data_1e8028)[num_1 * 4]
            data_1e806c = r2_71
            data_1e8070 = r3_59
            data_1e8074 = r0_129
        label_178f54:
            void* r2_72 = &r9[result_3 << 3]
            int32_t r3_60 = 4
            int32_t r7_51 = 2
            int32_t r5_43 = 0
            
            do
                void* r0_130 = &data_1e8038 + r3_60
                void* r1_104 = r2_72 + (r5_43 << 3)
                *r1_104 = (*(&data_1e8038 + (r5_43 << 4))).b
                void* r4_33 = r2_72 + r7_51
                r5_43 += 1
                r7_51 += 8
                r3_60 += 0x10
                *r4_33 = *r0_130
                *(r1_104 + 4) = 0
            while (r5_43 s< num_19)
            
            uint32_t num_12 = num_1
            
            if (num_12 s>= 4)
                num_12 = 4
            
            result = result_3 + num_12
        
        if (var_11c_1 s>= 1)
            void* r2_73 = &r9[result << 3]
            int32_t r3_61 = 4
            int32_t r7_52 = 2
            int32_t i_8 = 0
            
            do
                void* r1_105 = &data_1e9038 + r3_61
                void* r0_134 = r2_73 - (i_8 << 3)
                *r0_134 = (*(&data_1e9038 - (i_8 << 4))).b
                void* r4_35 = r2_73 + r7_52
                i_8 -= 1
                r7_52 += 8
                r3_61 += 0x10
                *r4_35 = *r1_105
                *(r0_134 + 4) = 0
            while (0 - var_11c_1 != i_8)
            
            result += var_11c_1
        
        uint32_t num_5 = num_7
        uint32_t num_6 = num_10
        int32_t r1_107 = var_b4
        
        if (var_b0 s>= 1)
            int32_t r3_62 = 0
            
            do
                if (r1_107 s< 1)
                label_17908c:
                    void* r6_13 = &r9[result << 3]
                    *r6_13 = (*(&data_1e8c38 + (r3_62 << 4))).b
                    result += 1
                    int16_t r1_109 = *((r3_62 << 4) + 0x1e8c3c)
                    *(r6_13 + 4) = 0
                    *(r6_13 + 2) = r1_109
                    r1_107 = var_b4
                else
                    int32_t r6_11 = 0
                    
                    while (*(&data_1e4c18 + (r6_11 << 2)) != *((r3_62 << 4) + 0x1e8c44))
                        r6_11 += 1
                        
                        if (r6_11 s>= r1_107)
                            goto label_17908c
                
                r3_62 += 1
            while (r3_62 != var_b0)
        
        uint32_t num_2
        uint32_t num_13
        uint32_t num_4
        
        if (num_6 s< 5)
            num_2 = num_11
            num_4 = num_8
            num_13 = num_6
            
            if (num_6 s>= 1)
                goto label_17911c
            
            if (num_6 == 0)
            label_17916c:
                uint32_t num_14
                
                if (num_4 s< 5)
                    num_14 = num_4
                    
                    if (num_4 s>= 1)
                        goto label_1791e0
                else
                    qsort(&data_1e9c38, num_4, 0x10, compar_179fd8)
                    num_4 = num_8
                    num_2 = num_11
                    num_14 = 4
                label_1791e0:
                    void* r5_48 = &r9[(result << 3) + 2]
                    int32_t r7_57 = 0
                    void* r2_75 = &data_1e9c3c
                    
                    do
                        r7_57 += 1
                        *(r5_48 - 2) = (*(r2_75 - 4)).b
                        int16_t r6_17 = *r2_75
                        r2_75 += 0x10
                        *(r5_48 + 2) = 0
                        *r5_48 = r6_17
                        r5_48 += 8
                    while (r7_57 s< num_14)
                    
                    if (num_4 s>= 4)
                        num_4 = 4
                    
                    result += num_4
        else
            qsort(&data_1e9838, num_6, 0x10, compar_179fd8)
            num_6 = num_10
            num_2 = num_11
            num_13 = 4
            num_4 = num_8
        label_17911c:
            void* r5_46 = &r9[(result << 3) + 2]
            int32_t r7_56 = 0
            void* r2_74 = &data_1e983c
            
            do
                r7_56 += 1
                *(r5_46 - 2) = (*(r2_74 - 4)).b
                int16_t r6_15 = *r2_74
                r2_74 += 0x10
                *(r5_46 + 2) = 0
                *r5_46 = r6_15
                r5_46 += 8
            while (r7_56 s< num_13)
            
            if (num_6 s>= 4)
                num_6 = 4
            
            result += num_6
            
            if (num_13 == 0)
                goto label_17916c
        uint32_t num_15
        
        if (num_2 s< 5)
            num_15 = num_2
            
            if (num_2 s>= 1)
                goto label_179274
        else
            qsort(&data_1ea038, num_2, 0x10, compar_179fd8)
            num_2 = num_11
            num_15 = 4
        label_179274:
            void* r5_49 = &r9[(result << 3) + 2]
            int32_t r7_58 = 0
            void* r2_76 = &data_1ea03c
            
            do
                r7_58 += 1
                *(r5_49 - 2) = (*(r2_76 - 4)).b
                int16_t r6_19 = *r2_76
                r2_76 += 0x10
                *(r5_49 + 2) = 0
                *r5_49 = r6_19
                r5_49 += 8
            while (r7_58 s< num_15)
            
            if (num_2 s>= 4)
                num_2 = 4
            
            result += num_2
        int32_t r12_3
        
        if (num_5 s< 5)
            r12_3 = var_e0_1
            
            if (num_5 s>= 1)
                goto label_179328
        else
            qsort(&data_1e9438, num_5, 0x10, compar_179fd8)
            num_5 = 4
            r12_3 = var_e0_1
        label_179328:
            int32_t r3_66 = 0
            
            do
                if (r10 s< 1)
                label_17936c:
                    void* r6_22 = &r9[result << 3]
                    *r6_22 = (*(&data_1e9438 + (r3_66 << 4))).b
                    result += 1
                    int16_t r1_114 = *((r3_66 << 4) + 0x1e943c)
                    *(r6_22 + 4) = 0
                    *(r6_22 + 2) = r1_114
                else
                    int32_t r6_20 = 0
                    
                    while (*(&data_1e5018 + (r6_20 << 2)) != *((r3_66 << 4) + 0x1e9444))
                        r6_20 += 1
                        
                        if (r6_20 s>= r10)
                            goto label_17936c
                
                r3_66 += 1
            while (r3_66 s< num_5)
        
        int32_t r10_1
        
        if (r12_3 s< 1)
            r10_1 = var_100
        else
            r10_1 = var_100
            void* r2_77 = &r9[result << 3]
            int32_t r3_67 = 4
            int32_t r7_62 = 2
            int32_t i_9 = 0
            
            do
                void* r1_115 = &data_1e8838 + r3_67
                void* r0_139 = r2_77 - (i_9 << 3)
                *r0_139 = (*(&data_1e8838 - (i_9 << 4))).b
                void* r4_40 = r2_77 + r7_62
                i_9 -= 1
                r7_62 += 8
                r3_67 += 0x10
                *r4_40 = *r1_115
                *(r0_139 + 4) = 0
            while (0 - r12_3 != i_9)
            
            result += var_e0_1
        
        if (r0_108 s>= 1)
            void* r2_78 = &r9[result << 3]
            int32_t r3_68 = 4
            int32_t r7_63 = 2
            int32_t i_10 = 0
            
            do
                void* r1_117 = &data_1e8438 + r3_68
                void* r0_143 = r2_78 - (i_10 << 3)
                *r0_143 = (*(&data_1e8438 - (i_10 << 4))).b
                void* r4_42 = r2_78 + r7_63
                i_10 -= 1
                r7_63 += 8
                r3_68 += 0x10
                *r4_42 = *r1_117
                *(r0_143 + 4) = 0
            while (0 - r0_108 != i_10)
            
            result += r0_108
        
        if (var_10c s>= 1)
            void* r0_145 = &r9[result << 3]
            int32_t r3_69 = 4
            int32_t r7_64 = 2
            int32_t i_11 = 0
            
            do
                void* r2_79 = r0_145 + r7_64
                r7_64 += 8
                *(r0_145 - (i_11 << 3)) = (*(&data_1ea838 - (i_11 << 4))).b
                void* r4_44 = &data_1ea838 + r3_69
                r3_69 += 0x10
                *r2_79 = *r4_44
                void* r2_80 = r0_145 - (i_11 << 3)
                i_11 -= 1
                *(r2_80 + 4) = 0
            while (0 - var_10c != i_11)
            
            result += var_10c
        else if (var_f4 s>= 1)
            void* r0_147 = &r9[result << 3]
            int32_t r3_70 = 4
            int32_t r7_65 = 2
            int32_t i_12 = 0
            
            do
                void* r2_81 = r0_147 + r7_65
                r7_65 += 8
                *(r0_147 - (i_12 << 3)) = (*(&data_1ea438 - (i_12 << 4))).b
                void* r4_47 = &data_1ea438 + r3_70
                r3_70 += 0x10
                *r2_81 = *r4_47
                void* r2_82 = r0_147 - (i_12 << 3)
                i_12 -= 1
                *(r2_82 + 4) = 0
            while (0 - var_f4 != i_12)
            
            result += var_f4
        
        uint32_t num_3 = num_9
        
        if (num_3 s< 1)
            uint32_t num_17 = num
            
            if (num_17 s>= 1)
                if (num_17 s>= 5)
                    qsort(&data_1eac38, num, 0x10, compar_179ff0)
                    num_17 = 4
                
                void* r1_125 = &r9[(result << 3) + 2]
                int32_t r7_67 = 0
                void* r2_84 = &data_1eac3c
                
                do
                    r7_67 += 1
                    *(r1_125 - 2) = (*(r2_84 - 4)).b
                    int16_t r6_26 = *r2_84
                    r2_84 += 0x10
                    *(r1_125 + 2) = 0
                    *r1_125 = r6_26
                    r1_125 += 8
                while (r7_67 s< num_17)
                
                uint32_t num_18 = num
                
                if (num_18 s>= 4)
                    num_18 = 4
                
                result += num_18
        else
            uint32_t num_16 = num_3
            
            if (num_3 s>= 5)
                qsort(&data_1eb038, num_3, 0x10, compar_179ff0)
                num_3 = num_9
                num_16 = 4
            
            void* r5_51 = &r9[(result << 3) + 2]
            int32_t r7_66 = 0
            void* r2_83 = &data_1eb03c
            
            do
                r7_66 += 1
                *(r5_51 - 2) = (*(r2_83 - 4)).b
                int16_t r6_24 = *r2_83
                r2_83 += 0x10
                *(r5_51 + 2) = 0
                *r5_51 = r6_24
                r5_51 += 8
            while (r7_66 s< num_16)
            
            if (num_3 s>= 4)
                num_3 = 4
            
            result += num_3
        
        if (var_114_1 s>= 1)
            void* r2_85 = &r9[result << 3]
            int32_t r3_72 = 4
            int32_t r7_68 = 2
            int32_t i_13 = 0
            
            do
                void* r1_126 = &data_1ec0b8 + r3_72
                void* r0_150 = r2_85 - (i_13 << 3)
                *r0_150 = (*(&data_1ec0b8 - (i_13 << 4))).b
                void* r4_52 = r2_85 + r7_68
                i_13 -= 1
                r7_68 += 8
                r3_72 += 0x10
                *r4_52 = *r1_126
                *(r0_150 + 4) = 0
            while (0 - var_114_1 != i_13)
            
            result += var_114_1
        
        if (r10_1 s>= 1)
            void* r2_86 = &r9[result << 3]
            int32_t r3_73 = 4
            int32_t r7_69 = 2
            int32_t i_14 = 0
            
            do
                void* r1_128 = &data_1ec4b8 + r3_73
                void* r0_153 = r2_86 - (i_14 << 3)
                *r0_153 = (*(&data_1ec4b8 - (i_14 << 4))).b
                void* r4_54 = r2_86 + r7_69
                i_14 -= 1
                r7_69 += 8
                r3_73 += 0x10
                *r4_54 = *r1_128
                *(r0_153 + 4) = 0
            while (0 - r10_1 != i_14)
            
            result += r10_1
        
        void* r0_174 = var_110
        CGameStateOptions* r6_27 = var_c4
        char* r10_2
        
        if (r0_174 s< 0)
            r10_2 = r9
        else
            r10_2 = r9
            void* r3_74 = *(r0_1 + 0xac)
            int32_t lr_12 = *(r3_74 + 0x14)
            int32_t r5_52 = *(r3_74 + 0x18)
            int32_t r12_4 = *(r3_74 + 0x1c)
            int32_t r1_130
            int32_t r8_13
            
            if (lr_12 s< 1)
                lr_12 = 0
                r1_130 = 0
            label_17980c:
                r8_13 = 0
                
                if (r5_52 s>= 1)
                label_179838:
                    int32_t r7_74 = 0
                    void* r4_56 = *(arg1 + 0x20)
                    int32_t r0_158 = *(r4_56 + 0xb48)
                    int32_t r6_28 = r5_52 - r0_158
                    
                    if (r5_52 s<= r0_158)
                        r6_28 = 0
                    else
                        r5_52 = r0_158
                    
                    if ((zx.d(*(r3_74 + 0x20)) & 4) != 0)
                        int32_t r0_159 = *(r4_56 + 0xb40)
                        int32_t r2_89 = r6_28 - r0_159
                        bool cond:59_1 = r6_28 s> r0_159
                        
                        if (r6_28 s> r0_159)
                            r6_28 = r0_159
                        
                        lr_12 += r6_28
                        
                        if (cond:59_1)
                            r7_74 = r2_89
                    else
                        r7_74 = r6_28
                    
                    r1_130 += r5_52
                    r6_27 = var_c4
                    
                    if ((zx.d(*(r3_74 + 0x28)) & 4) != 0)
                        int32_t r0_162 = *(r0_1 + 0x8c)
                        
                        if (r0_162 s< r7_74)
                            r7_74 = r0_162
                        
                        r8_13 += r7_74
            else
                void* r2_87 = *(arg1 + 0x20)
                int32_t r7_70 = *(r2_87 + 0xb40)
                r1_130 = lr_12 - r7_70
                
                if (lr_12 s<= r7_70)
                    r1_130 = 0
                else
                    lr_12 = r7_70
                
                if ((zx.d(*(r3_74 + 0x24)) & 2) != 0)
                    int32_t r7_71 = *(r2_87 + 0xb48)
                    r8_13 = r1_130 - r7_71
                    
                    if (r1_130 s<= r7_71)
                        r8_13 = 0
                    else
                        r1_130 = r7_71
                else
                    r8_13 = r1_130
                    r1_130 = 0
                
                r6_27 = var_c4
                
                if ((zx.d(*(r3_74 + 0x28)) & 2) == 0)
                    goto label_17980c
                
                int32_t r7_73 = *(r0_1 + 0x8c)
                
                if (r7_73 s< r8_13)
                    r8_13 = r7_73
                
                if (r5_52 s>= 1)
                    goto label_179838
            
            if (r12_4 s>= 1)
                int32_t r7_75
                
                if ((zx.d(*(r3_74 + 0x24)) & 8) != 0)
                    int32_t r0_166 = *(*(arg1 + 0x20) + 0xb48)
                    r7_75 = r12_4 - r0_166
                    bool cond:60_1 = r12_4 s<= r0_166
                    
                    if (r12_4 s> r0_166)
                        r12_4 = r0_166
                    
                    r1_130 += r12_4
                    
                    if (cond:60_1)
                        r7_75 = 0
                else
                    r7_75 = r12_4
                
                int32_t r3_75
                
                if ((zx.d(*(r3_74 + 0x20)) & 8) != 0)
                    int32_t r0_170 = *(*(arg1 + 0x20) + 0xb40)
                    r3_75 = r7_75 - r0_170
                    bool cond:61_1 = r7_75 s<= r0_170
                    
                    if (r7_75 s> r0_170)
                        r7_75 = r0_170
                    
                    lr_12 += r7_75
                    
                    if (cond:61_1)
                        r3_75 = 0
                else
                    r3_75 = r7_75
                
                int32_t r0_172 = *(r0_1 + 0x8c)
                
                if (r0_172 s< r3_75)
                    r3_75 = r0_172
                
                r8_13 += r3_75
            
            r0_174 = &r10_2[result << 3]
            *r0_174 = var_110.b
            result += 1
            *(r0_174 + 2) = 0
            *(r0_174 + 4) = lr_12 | r1_130 << 8 | r8_13 << 0x10
        
        if (var_134 s>= 0)
            r0_174 = r10_2
        
        if (var_134 s>= 0)
            void* r0_175 = r0_174 + (result << 3)
            *r0_175 = var_134.b
            result += 1
            *(r0_175 + 2) = 0
            *(r0_175 + 4) = 0
        
        if (var_130 s>= 0)
            int32_t r2_91 = *(r6_27 + 0x18)
            int32_t r0_176 = 0
            int32_t r3_77 = *(r6_27 + 0x1c)
            
            if (r3_77 != r2_91)
                int32_t i_15 = 0
                r0_176 = 0
                
                do
                    void* r7_76 = *(r0_1 + 0xb0) + (i_15 << 2)
                    
                    if (*(r7_76 + 8) != r1_2)
                        int32_t r7_77 = *(r7_76 + 0x28)
                        
                        if (r7_77 s> r0_176)
                            r0_176 = r7_77
                    
                    i_15 += 1
                while (i_15 u< (r3_77 - r2_91) s>> 2)
            
            if (*(arg1 + 0x28) == 1)
                void* r1_138 = &r10_2[result << 3]
                *r1_138 = var_130.b
                result += 1
                *(r1_138 + 2) = 0
                *(r1_138 + 4) = r0_176 + 1
            
            void* r0_181 = &r10_2[result << 3]
            *r0_181 = var_148
            result += 1
            *(r0_181 + 2) = 0
            *(r0_181 + 4) = 0
            
            if (r1_84 s>= 0)
                goto label_179a60
        else if (r1_84 s>= 0)
        label_179a60:
            char* r0_183 = &r10_2[result << 3]
            *r0_183 = r1_84.b
            result += 1
            *(r0_183 + 2) = 0x100
            *(r0_183 + 4) = 0
        
        if (r0_103 s>= 0)
            void* r0_185 = &r10_2[result << 3]
            *r0_185 = r0_103.b
            result += 1
            *(r0_185 + 2) = 0x100
            *(r0_185 + 4) = 0
        
        if (r2_54 s>= 0)
            void* r0_187 = &r10_2[result << 3]
            *r0_187 = r2_54.b
            result += 1
            *(r0_187 + 2) = 0
            *(r0_187 + 4) = 0
        
        if (r6_5 s>= 0)
            void* r10_3 = &r10_2[result << 3]
            *r10_3 = r6_5.b
            result += 1
            *(r10_3 + 2) = 0
            *(r10_3 + 4) = 0
    else
        int32_t* r0_106
        char r1_83
        
        if (r0_3 == 3 && var_e0_1 == 1 && var_c8_1 == 1)
            r0_106 = &data_1e8838
            r1_83 = (data_1e8838).b
        label_178978:
            *r9 = r1_83
            r0_107 = r0_106[1].w
            goto label_178984
        
        var_128_2 = 0
        
        if (r0_3 != 2)
            goto label_1789b8
        
        if (var_e0_1 != 1)
            if (var_c8_1 != 1)
                goto label_1789b8
            
            r0_106 = &data_1e8438
            r1_83 = (data_1e8438).b
            goto label_178978
        
        result = 1
        *r9 = (data_1e8838).b
        r0_104 = data_1e883c
        *(r9 + 4) = 0
        *(r9 + 2) = r0_104
else
    int32_t r7 = r0_3
    void* r0_4 = arg4 & 0x100
    int32_t var_f8_1 = 0x64
    void* var_158_1 = 0xffffffff
    var_14c = 0
    void* var_12c_1 = 0xffffffff
    var_e8 = 0xffffffff
    void* var_16c_1 = 0xffffffff
    int32_t var_164_1 = 0
    void* var_f0_1 = 0xffffffff
    void* var_170_1 = 0xffffffff
    void* var_c0_1 = 0xffffffff
    void* var_198_1 = 0xffffffff
    int32_t var_19c_1 = 0xffffffff
    var_110 = 0xffffffff
    var_134 = 0xffffffff
    var_130 = 0xffffffff
    var_148 = -1
    int32_t var_194_1
    __builtin_memset(&var_194_1, 0, 0x24)
    var_b4 = 0
    int32_t var_160_1 = 0
    var_154 = 0
    __builtin_memset(&var_e4_1, 0, 0x20)
    int32_t var_fc_1 = 0
    int32_t var_1cc_1
    __builtin_memset(&var_1cc_1, 0, 0x30)
    int32_t var_144_1 = 0
    int32_t var_128_1
    __builtin_memset(&var_128_1, 0, 0x18)
    num_1 = 0
    var_b0 = 0
    num_7 = 0
    num_11 = 0
    var_f4 = 0
    var_10c = 0
    num = 0
    int32_t result_2 = 0
    void* r9_1 = nullptr
    r10 = 0
    var_100 = 0
    int32_t var_bc_1 = r5
    int32_t var_1a4_1
    int32_t result_1
    int32_t var_180_1
    int32_t var_dc_1
    int32_t var_d8_1
    int32_t var_cc_1
    char* r1_81
    
    while (true)
        int16_t* r0_6 = CGameStateOptions::GetOption(r5)
        int32_t r2 = zx.d(r0_6[1]) - 0xa000
        
        if (r2 u> 0xf0)
            goto label_178148
        
        int32_t var_1a0_1
        int32_t var_d0_1
        void** r0_10
        void* r0_66
        void* r0_94
        int32_t i_16
        void* i_24
        int32_t r1_61
        void** r2_28
        void** r3_11
        int32_t r4_1
        
        switch (r2)
            case 0
                var_12c_1 = r9_1
            label_1786b8:
                r9_1 += 1
                
                if (r9_1 s>= r7)
                    break
                
                continue
            case 1
                var_158_1 = r9_1
                goto label_1786b8
            case 2, 0x15
                goto label_1786b8
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
                    0xb4, 0xb5, 0xb6, 0xb7, 0xb8, 0xb9, 0xba, 0xbb, 0xbc, 0xbd, 0xbe, 0xbf, 0xc1, 
                    0xc2, 0xc3, 0xc4, 0xc5, 0xc6, 0xc7, 0xc8, 0xc9, 0xca, 0xcb, 0xcc, 0xcd, 0xce, 
                    0xcf, 0xd1, 0xd2, 0xd6, 0xd7, 0xd8, 0xd9, 0xda, 0xdb, 0xdc, 0xdd, 0xde, 0xdf, 
                    0xe0, 0xe7, 0xe8, 0xe9, 0xea, 0xeb, 0xec, 0xed, 0xee, 0xef
                goto label_178148
            case 0x10
                if (r0_4 != 0)
                    goto label_1786b8
                
                *r0_6
                void* r0_38 = core::CWorldBase::GetInstanceByID(r8)
                void* r1_27 = *(r0_38 + 0xc)
                
                if (zx.d(*(r1_27 + 0x162)) != 0)
                    int32_t* r2_15 = *(r8 + 0xb80)
                    int32_t r3_6 = *(r8 + 0xb84)
                    
                    if (r2_15 != r3_6)
                        do
                            if (zx.d(*(*(*r2_15 + 0xc) + 0xc9)) == 0 && zx.d(*(r1_27 + 0x163)) == 0)
                                goto label_1784f4
                            
                            r2_15 = &r2_15[2]
                        while (r3_6 != r2_15)
                    
                    goto label_177944
                
            label_1784f4:
                r7 = r0_3
                int32_t var_1c8_1
                
                if (var_1c8_1 s>= 1)
                    int32_t r2_46 = 0
                    
                    do
                        if (*(&data_1e4618 + (r2_46 << 2)) == r1_27)
                            goto label_17859c
                        
                        r2_46 += 1
                    while (r2_46 s< var_1c8_1)
                
                int32_t r6_2 = var_164_1
                void* r4_12 = var_16c_1
                *(&data_1e4618 + (var_1c8_1 << 2)) = r1_27
                int32_t r2_47 = *(r1_27 + 0x15c)
                bool cond:14_1 = r2_47 s> r6_2
                
                if (r2_47 s> r6_2)
                    r6_2 = r2_47
                
                if (cond:14_1)
                    r4_12 = r9_1
                
                var_16c_1 = r4_12
                var_164_1 = r6_2
                var_14c += zx.d(*(r1_27 + 0x164)) ^ 1
                var_1c8_1 += 1
                void** r2_49
                
                if (zx.d(*(r1_27 + 0x158)) == 0)
                    r2_49 = &data_1e5c38 + (i_33 << 4)
                    *r2_49 = r9_1
                    i_33 += 1
                else
                    r2_49 = &(&data_1e5838)[var_154 * 4]
                    *r2_49 = r9_1
                    var_154 += 1
                
                r2_49[1].w = 0
                r2_49[2] = r0_38
                r2_49[3] = r1_27
                r7 = r0_3
                r5 = var_bc_1
                goto label_1786b8
            case 0x11, 0x35, 0xf0
            label_1788c8:
                r1_81 = arg_0
                *(r1_81 + 2) = 0
                *r1_81 = r9_1.b
                goto label_178900
            case 0x20, 0x2d, 0x2e, 0x2f
                *r0_6
                void* r0_8 = core::CWorldBase::GetInstanceByID(r8)
                
                if (r0_8 != 0)
                    if (__dynamic_cast(r0_8, _typeinfo_for_core::CInstance, 
                            _typeinfo_for_ascension::CCardStackUniformAscension, 0) != 0)
                        r0_10 = &(&data_1e8438)[var_c8_1 * 4]
                        *r0_10 = r9_1
                        var_c8_1 += 1
                        r0_10[1].w = 0x100
                    label_177638:
                        r0_10[2] = 0
                        r0_10[3] = 0
                        r5 = var_bc_1
                        goto label_1786b8
                    
                    if (r0_4 == 0 && r0_8 != 0)
                        void* r0_96 = *(r0_8 + 0xc)
                        
                        if (*(r0_96 + 0x88) != 8)
                            if (var_1a0_1 s>= 1)
                                int32_t r1_63 = 0
                                
                                do
                                    if (*(&data_1e4b18 + (r1_63 << 2)) == r0_96)
                                        goto label_17859c
                                    
                                    r1_63 += 1
                                while (r1_63 s< var_1a0_1)
                            
                            *(&data_1e4b18 + (var_1a0_1 << 2)) = r0_96
                            var_1a0_1 += 1
                        
                        void** r1_64 = &data_1e8c38 + (var_b0 << 4)
                        *r1_64 = r9_1
                        var_b0 += 1
                        r1_64[1].w = 0
                        r1_64[2] = r0_8
                        r1_64[3] = r0_96
                        r5 = var_bc_1
                        goto label_1786b8
            case 0x22, 0x24
                *r0_6
                void* r0_20 = core::CWorldBase::GetInstanceByID(r8)
                
                if (r0_20 != 0)
                    if (__dynamic_cast(r0_20, _typeinfo_for_core::CInstance, 
                            _typeinfo_for_ascension::CCardStackUniformAscension, 0) != 0)
                        r0_10 = &(&data_1e8838)[var_e0_1 * 4]
                        *r0_10 = r9_1
                        var_e0_1 += 1
                        r0_10[1].w = 0
                        goto label_177638
                    
                    int32_t r0_97 = *(r0_20 + 0xc)
                    
                    if (var_1a0_1 s>= 1)
                        int32_t r1_65 = 0
                        
                        do
                            if (*(&data_1e4b18 + (r1_65 << 2)) == r0_97)
                                goto label_17859c
                            
                            r1_65 += 1
                        while (r1_65 s< var_1a0_1)
                    
                    *(&data_1e4b18 + (var_1a0_1 << 2)) = r0_97
                    void** r2_42 = &data_1e8c38 + (var_b0 << 4)
                    *r2_42 = r9_1
                    var_b0 += 1
                    r2_42[1].w = 0
                    r2_42[2] = r0_20
                    r2_42[3] = r0_97
                    var_1a0_1 += 1
                    r5 = var_bc_1
                    goto label_1786b8
            case 0x23
                *r0_6
                void* r0_40 = core::CWorldBase::GetInstanceByID(r8)
                
                if (r0_4 != 0 || r0_40 == 0)
                    goto label_1786b8
                
                int32_t r1_30 = *(r0_40 + 0xc)
                
                if (var_b4 s>= 1)
                    int32_t r2_17 = 0
                    
                    do
                        if (*(&data_1e4c18 + (r2_17 << 2)) == r1_30)
                            goto label_17859c
                        
                        r2_17 += 1
                    while (r2_17 s< var_b4)
                
                *(&data_1e4c18 + (var_b4 << 2)) = r1_30
                void** r3_9 = &data_1e9038 + (var_11c_1 << 4)
                *r3_9 = r9_1
                var_11c_1 += 1
                r3_9[1].w = 0
                r3_9[2] = r0_40
                r3_9[3] = r1_30
                var_b4 += 1
            label_177944:
                r7 = r0_3
                r5 = var_bc_1
                goto label_1786b8
            case 0x25
                *r0_6
                void* r0_42 = core::CWorldBase::GetInstanceByID(r8)
                
                if (r0_42 == 0)
                    goto label_1786b8
                
                i_16 = *(r0_42 + 0xc)
                int32_t var_1a8_1
                
                if (var_1a8_1 s>= 1)
                    int32_t r2_18 = 0
                    
                    while (*(&data_1e4d18 + (r2_18 << 2)) != i_16)
                        r2_18 += 1
                        
                        if (r2_18 s>= var_1a8_1)
                            goto label_1779b0
                    
                    r5 = r5
                    goto label_1786b8
                
            label_1779b0:
                *(&data_1e4d18 + (var_1a8_1 << 2)) = i_16
                r3_11 = &data_1e9438 + (num_7 << 4)
                *r3_11 = r9_1
                num_7 += 1
                r3_11[1].w = 0
                r3_11[2] = r0_42
                var_1a8_1 += 1
                r5 = r5
            label_177ae0:
                r3_11[3] = i_16
                r7 = r0_3
                goto label_1786b8
            case 0x26
                *r0_6
                void* r0_44 = core::CWorldBase::GetInstanceByID(r8)
                
                if (r0_44 == 0)
                    goto label_1786b8
                
                r4_1 = r5
                int32_t i_17 = *(r0_44 + 0xc)
                uint32_t num_20 = num_8
                int32_t var_1b0_1
                
                if (var_1b0_1 s< 1)
                label_177a3c:
                    *(&data_1e4f18 + (var_1b0_1 << 2)) = i_17
                    *(&data_1e9c38 + (num_20 << 4)) = r9_1
                    num_8 = num_20 + 1
                    *((num_20 << 4) + &data_1e9c3c) = 0
                    *((num_20 << 4) + 0x1e9c40) = r0_44
                    *((num_20 << 4) + 0x1e9c44) = i_17
                    var_1b0_1 += 1
                else
                    int32_t r2_19 = 0
                    
                    while (*(&data_1e4f18 + (r2_19 << 2)) != i_17)
                        r2_19 += 1
                        
                        if (r2_19 s>= var_1b0_1)
                            goto label_177a3c
                
                goto label_1784a8
            case 0x27
                *r0_6
                void* r0_46 = core::CWorldBase::GetInstanceByID(r8)
                
                if (r0_46 == 0)
                    goto label_1786b8
                
                i_16 = *(r0_46 + 0xc)
                
                if (r10 s< 1)
                label_177ac0:
                    *(&data_1e5018 + (r10 << 2)) = i_16
                    r10 += 1
                    r3_11 = &data_1ea038 + (num_11 << 4)
                    *r3_11 = r9_1
                    num_11 += 1
                    r3_11[1].w = 0
                    r3_11[2] = r0_46
                    goto label_177ae0
                
                int32_t r2_20 = 0
                
                while (*(&data_1e5018 + (r2_20 << 2)) != i_16)
                    r2_20 += 1
                    
                    if (r2_20 s>= r10)
                        goto label_177ac0
                
                r7 = r0_3
                goto label_1786b8
            case 0x28
                *r0_6
                void* r0_48 = core::CWorldBase::GetInstanceByID(r8)
                
                if (r0_48 == 0)
                    goto label_1786b8
                
                r4_1 = r5
                int32_t i_18 = *(r0_48 + 0xc)
                int32_t var_1ac_1
                
                if (var_1ac_1 s< 1)
                label_177b4c:
                    *(&data_1e4e18 + (var_1ac_1 << 2)) = i_18
                    void** r3_16 = &data_1e9838 + (num_10 << 4)
                    *r3_16 = r9_1
                    num_10 += 1
                    r3_16[1].w = 0
                    r3_16[2] = r0_48
                    r3_16[3] = i_18
                    var_1ac_1 += 1
                else
                    int32_t r2_21 = 0
                    
                    while (*(&data_1e4e18 + (r2_21 << 2)) != i_18)
                        r2_21 += 1
                        
                        if (r2_21 s>= var_1ac_1)
                            goto label_177b4c
                
                goto label_1784a8
            case 0x30, 0x37
                *r0_6
                void* r0_23 = core::CWorldBase::GetInstanceByID(r8)
                
                if (r0_23 != 0)
                    int32_t r1_17 = *(r0_23 + 0xc)
                    int32_t var_178_1
                    
                    if (var_178_1 s>= 1)
                        int32_t r2_9 = 0
                        
                        do
                            if (*(&data_1e5618 + (r2_9 << 2)) == r1_17)
                                goto label_1786b8
                            
                            r2_9 += 1
                        while (r2_9 s< var_178_1)
                    
                    *(&data_1e5618 + (var_178_1 << 2)) = r1_17
                    void** r3_3 = &data_1eb838 + (result_1 << 4)
                    *r3_3 = r9_1
                    result_1 += 1
                    r3_3[1].w = 0
                    r3_3[2] = r0_23
                    r3_3[3] = r1_17
                    r5 = var_bc_1
                    var_178_1 += 1
                
                goto label_1786b8
            case 0x31
                *r0_6
                void* r0_50 = core::CWorldBase::GetInstanceByID(r8)
                
                if (r0_50 == 0)
                    goto label_1786b8
                
                r4_1 = r5
                int32_t i_19 = *(r0_50 + 0xc)
                int32_t var_1c0_1
                
                if (var_1c0_1 s< 1)
                label_177bd8:
                    *(&data_1e5718 + (var_1c0_1 << 2)) = i_19
                    void** r3_18 = &data_1ebc38 + (result_2 << 4)
                    *r3_18 = r9_1
                    result_2 += 1
                    r3_18[1].w = 0
                    r3_18[2] = r0_50
                    r3_18[3] = i_19
                    var_1c0_1 += 1
                else
                    int32_t r2_22 = 0
                    
                    while (*(&data_1e5718 + (r2_22 << 2)) != i_19)
                        r2_22 += 1
                        
                        if (r2_22 s>= var_1c0_1)
                            goto label_177bd8
                
                goto label_1784a8
            case 0x32
                *r0_6
                void* r0_52 = core::CWorldBase::GetInstanceByID(r8)
                
                if (r0_52 == 0 || zx.d(*(*(r0_52 + 0xc) + 0x160)) != 0)
                    goto label_1786b8
                
                goto label_1788c8
            case 0x33
                *r0_6
                void* r0_56 = core::CWorldBase::GetInstanceByID(r8)
                
                if (r0_56 == 0 || zx.d(*(*(r0_56 + 0xc) + 0x160)) == 0)
                    goto label_1786b8
                
                goto label_1788c8
            case 0x36, 0x51, 0x56
                *r0_6
                int32_t r2_5 = 0x98
                int32_t* r0_14 = *(*(core::CWorldBase::GetInstanceByID(r8) + 0x10) + 0xc)
                
                if (*(r8 + 0x30) u< 0x14)
                    r2_5 = 0x9c
                
                int32_t r2_6 = var_f8_1
                int32_t r0_16 = r0_14[0x28] + *(r0_14 + r2_5)
                void* r1_10 = var_f0_1
                
                if (r0_16 s< r2_6)
                    r1_10 = r9_1
                    r2_6 = r0_16
                
                var_f0_1 = r1_10
                var_f8_1 = r2_6
                goto label_1786b8
            case 0x40, 0x45, 0x46
                *r0_6
                void* r0_18 = core::CWorldBase::GetInstanceByID(r8)
                
                if (r0_18 == 0)
                    goto label_1786b8
                
                r4_1 = r5
                int32_t i_20 = *(r0_18 + 0xc)
                
                if (var_160_1 s< 1)
                label_1775b4:
                    *(&data_1e5118 + (var_160_1 << 2)) = i_20
                    void** r3_1 = &data_1ea438 + (var_f4 << 4)
                    *r3_1 = r9_1
                    var_f4 += 1
                    r3_1[1].w = 0
                    r3_1[2] = r0_18
                    r3_1[3] = i_20
                    var_160_1 += 1
                else
                    int32_t r2_7 = 0
                    
                    while (*(&data_1e5118 + (r2_7 << 2)) != i_20)
                        r2_7 += 1
                        
                        if (r2_7 s>= var_160_1)
                            goto label_1775b4
                
                goto label_1784a8
            case 0x41
                var_e8 = r9_1
                goto label_1786b8
            case 0x42
                *r0_6
                void* r0_60 = core::CWorldBase::GetInstanceByID(r8)
                
                if (r0_60 == 0)
                    goto label_1786b8
                
                r4_1 = r5
                int32_t i_21 = *(r0_60 + 0xc)
                int32_t var_1b8_1
                
                if (var_1b8_1 s< 1)
                label_177cbc:
                    *(&data_1e5318 + (var_1b8_1 << 2)) = i_21
                    void** r3_20 = &data_1eac38 + (num << 4)
                    *r3_20 = r9_1
                    num += 1
                    r3_20[1].w = 0
                    r3_20[2] = r0_60
                    r3_20[3] = i_21
                    var_1b8_1 += 1
                else
                    int32_t r2_23 = 0
                    
                    while (*(&data_1e5318 + (r2_23 << 2)) != i_21)
                        r2_23 += 1
                        
                        if (r2_23 s>= var_1b8_1)
                            goto label_177cbc
                
                goto label_1784a8
            case 0x43
                *r0_6
                void* r0_62 = core::CWorldBase::GetInstanceByID(r8)
                
                if (r0_62 == 0)
                    goto label_1786b8
                
                r4_1 = r5
                int32_t i_22 = *(r0_62 + 0xc)
                int32_t var_1b4_1
                
                if (var_1b4_1 s< 1)
                label_177d48:
                    *(&data_1e5218 + (var_1b4_1 << 2)) = i_22
                    void** r3_22 = &data_1ea838 + (var_10c << 4)
                    *r3_22 = r9_1
                    var_10c += 1
                    r3_22[1].w = 0
                    r3_22[2] = r0_62
                    r3_22[3] = i_22
                    var_1b4_1 += 1
                else
                    int32_t r2_24 = 0
                    
                    while (*(&data_1e5218 + (r2_24 << 2)) != i_22)
                        r2_24 += 1
                        
                        if (r2_24 s>= var_1b4_1)
                            goto label_177d48
                
                goto label_1784a8
            case 0x44
                *r0_6
                void* r0_64 = core::CWorldBase::GetInstanceByID(r8)
                
                if (r0_64 == 0)
                    goto label_1786b8
                
                r4_1 = r5
                int32_t i_23 = *(r0_64 + 0xc)
                int32_t var_1bc_1
                
                if (var_1bc_1 s< 1)
                label_177dd4:
                    *(&data_1e5418 + (var_1bc_1 << 2)) = i_23
                    void** r3_24 = &data_1eb038 + (num_9 << 4)
                    *r3_24 = r9_1
                    num_9 += 1
                    r3_24[1].w = 0
                    r3_24[2] = r0_64
                    r3_24[3] = i_23
                    var_1bc_1 += 1
                else
                    int32_t r2_25 = 0
                    
                    while (*(&data_1e5418 + (r2_25 << 2)) != i_23)
                        r2_25 += 1
                        
                        if (r2_25 s>= var_1bc_1)
                            goto label_177dd4
                
                goto label_1784a8
            case 0x50
                *r0_6
                r4_1 = r5
                r0_66 = core::CWorldBase::GetInstanceByID(r8)
                i_24 = *(r0_66 + 0xc)
                int32_t var_188_1
                
                if (var_188_1 s>= 1)
                    int32_t r2_26 = 0
                    
                    while (*(&data_1e4718 + (r2_26 << 2)) != i_24)
                        r2_26 += 1
                        
                        if (r2_26 s>= var_188_1)
                            goto label_177e50
                    
                    r5 = r4_1
                    goto label_1786b8
                
            label_177e50:
                *(&data_1e4718 + (var_188_1 << 2)) = i_24
                var_188_1 += 1
                
                if (zx.d(*(i_24 + 0x160)) == 0)
                    r2_28 = &data_1e6c38 + (var_d8_1 << 4)
                    *r2_28 = r9_1
                    var_d8_1 += 1
                else
                    r2_28 = &data_1e6838 + (var_dc_1 << 4)
                    *r2_28 = r9_1
                    var_dc_1 += 1
                
                goto label_17849c
            case 0x52
                *r0_6
                int32_t r2_29 = 0x98
                int32_t* r0_70 = *(*(core::CWorldBase::GetInstanceByID(r8) + 0x10) + 0xc)
                
                if (*(r8 + 0x30) u< 0x14)
                    r2_29 = 0x9c
                
                int32_t var_17c_1
                int32_t r2_30 = var_17c_1
                int32_t r0_72 = r0_70[0x28] + *(r0_70 + r2_29)
                void* r1_45 = var_170_1
                
                if (r0_72 s> r2_30)
                    r1_45 = r9_1
                    r2_30 = r0_72
                
                var_170_1 = r1_45
                var_17c_1 = r2_30
                goto label_1786b8
            case 0x61
                *r0_6
                void* i_25 = core::CWorldBase::GetInstanceByID(r8)
                int32_t r4_6 = var_194_1
                void* i_26 = *(i_25 + 0xc)
                
                if (r4_6 s< 1)
                label_177f28:
                    
                    if (strcasecmp(i_26 + 4, "Wandering Askara") == 0)
                        int32_t r0_77 = *(var_c4 + 0xbd8)
                        int32_t r1_49 = *(var_c4 + 0xbdc)
                        
                        if (r1_49 != r0_77)
                            int32_t r2_31 = 0
                            
                            while (*(r0_77 + (r2_31 << 3)) != i_25)
                                r2_31 += 1
                                
                                if (r2_31 u>= (r1_49 - r0_77) s>> 3)
                                    goto label_177f74
                            
                            result = 1
                            *(arg_0 + 2) = 0
                            *arg_0 = r9_1.b
                            *(arg_0 + 4) = 0
                            goto label_179adc
                    
                label_177f74:
                    *(&data_1e4918 + (r4_6 << 2)) = i_26
                    uint32_t r0_78 = zx.d(*(i_26 + 0x161))
                    var_194_1 = r4_6 + 1
                    void** r0_79
                    
                    if (r0_78 == 0)
                        int32_t r2_52 = var_128_1
                        r0_79 = &data_1e7c38 + (r2_52 << 4)
                        *r0_79 = r9_1
                        var_128_1 = r2_52 + 1
                    else
                        r0_79 = &data_1e7838 + (var_144_1 << 4)
                        *r0_79 = r9_1
                        var_144_1 += 1
                    
                    r0_79[1].w = 0
                    r0_79[2] = i_25
                    r0_79[3] = i_26
                else
                    int32_t r0_74 = 0
                    
                    while (*(&data_1e4918 + (r0_74 << 2)) != i_26)
                        r0_74 += 1
                        
                        if (r0_74 s>= r4_6)
                            goto label_177f28
                
                r8 = var_c4
                r5 = var_bc_1
                goto label_1786b8
            case 0x62
                *r0_6
                r4_1 = r5
                r0_66 = core::CWorldBase::GetInstanceByID(r8)
                i_24 = *(r0_66 + 0xc)
                int32_t var_18c_1
                
                if (var_18c_1 s>= 1)
                    int32_t r2_34 = 0
                    
                    while (*(&data_1e4818 + (r2_34 << 2)) != i_24)
                        r2_34 += 1
                        
                        if (r2_34 s>= var_18c_1)
                            goto label_177ff8
                    
                    r5 = r4_1
                    goto label_1786b8
                
            label_177ff8:
                *(&data_1e4818 + (var_18c_1 << 2)) = i_24
                var_18c_1 += 1
                
                if (zx.d(*(i_24 + 0x161)) == 0)
                    int32_t r5_37 = var_1cc_1
                    *(&data_1e7438 + (r5_37 << 4)) = r9_1
                    var_1cc_1 = r5_37 + 1
                    r5 = r4_1
                    *((r5_37 << 4) + 0x1e743c) = 0
                    *((r5_37 << 4) + 0x1e7440) = r0_66
                    *((r5_37 << 4) + 0x1e7444) = i_24
                    goto label_1786b8
                
                r2_28 = &data_1e7038 + (var_fc_1 << 4)
                *r2_28 = r9_1
                var_fc_1 += 1
            label_17849c:
                r2_28[1].w = 0
                r2_28[2] = r0_66
                r2_28[3] = i_24
            label_1784a8:
                r7 = r0_3
                r5 = r4_1
                goto label_1786b8
            case 0x63
                *r0_6
                r4_1 = r5
                void* r0_82 = core::CWorldBase::GetInstanceByID(r8)
                int32_t i_27 = *(r0_82 + 0xc)
                int32_t var_190_1
                
                if (var_190_1 s< 1)
                label_178088:
                    *(&data_1e4a18 + (var_190_1 << 2)) = i_27
                    void** r3_29 = &data_1e8038 + (num_1 << 4)
                    *r3_29 = r9_1
                    num_1 += 1
                    r3_29[1].w = 0
                    r3_29[2] = r0_82
                    r3_29[3] = i_27
                    var_190_1 += 1
                else
                    int32_t r2_36 = 0
                    
                    while (*(&data_1e4a18 + (r2_36 << 2)) != i_27)
                        r2_36 += 1
                        
                        if (r2_36 s>= var_190_1)
                            goto label_178088
                
                goto label_1784a8
            case 0x70, 0x72
                *r0_6
                int32_t r0_25 = core::CWorldBase::GetInstanceByID(r8)
                int16_t r8_1
                
                if (r0_25 == 0)
                    r8_1 = 0
                label_17834c:
                    r5 = var_bc_1
                label_17845c:
                    void** r0_101 = &data_1e6038 + (var_cc_1 << 4)
                    *r0_101 = r9_1
                    var_cc_1 += 1
                    r0_101[1].w = r8_1
                    r0_101[2] = 0
                    r0_101[3] = 0
                else
                    r8_1 = 0
                    void* r0_26 = __dynamic_cast(r0_25, _typeinfo_for_core::CInstance, 
                        _typeinfo_for_ascension::CConstructAbilityInstance, 0)
                    uint32_t r0_28
                    int32_t r1_69
                    
                    if (r0_26 == 0)
                        r8_1 = 0
                        void* r0_99 = __dynamic_cast(r0_25, _typeinfo_for_core::CInstance, 
                            _typeinfo_for_ascension::CCardInPlayAbilityInstance, 0)
                        
                        if (r0_99 == 0)
                            goto label_17834c
                        
                        void* r0_100 = *(r0_99 + 0x10)
                        r5 = var_bc_1
                        
                        if (r0_100 == 0)
                            goto label_17845c
                        
                        r8_1 = 0
                        
                        if (r0_4 != 0)
                            r8_1 = 0x100
                        
                        if (r0_4 == 0 || zx.d(*(r0_100 + 0x190)) != 0)
                            r1_69 = *(r0_100 + 0x194)
                            r0_28 = zx.d(*(r0_100 + 0x191))
                            goto label_17842c
                    else
                        void* r0_27 = *(r0_26 + 0x10)
                        r5 = var_bc_1
                        
                        if (r0_27 == 0)
                            goto label_17845c
                        
                        r8_1 = 0
                        
                        if (r0_4 != 0)
                            r8_1 = 0x100
                        
                        if (r0_4 == 0 || zx.d(*(r0_27 + 0x198)) != 0)
                            r1_69 = *(r0_27 + 0x19c)
                            r0_28 = zx.d(*(r0_27 + 0x199))
                        label_17842c:
                            int32_t r3_38 = var_164_1
                            void* r2_44 = var_16c_1
                            
                            if (r1_69 s> r3_38)
                                r2_44 = r9_1
                                r3_38 = r1_69
                            
                            var_16c_1 = r2_44
                            var_164_1 = r3_38
                            
                            if (r0_28 == 0)
                                goto label_17845c
                            
                            result = 1
                            *(arg_0 + 2) = 0
                            *arg_0 = r9_1.b
                            *(arg_0 + 4) = 0
                            goto label_179adc
                r8 = var_c4
                goto label_1786b8
            case 0x71
                *r0_6
                void* r0_85 = *(core::CWorldBase::GetInstanceByID(r8) + 0x10)
                int32_t r7_30 = var_e4_1
                int32_t r2_37 = *(r0_85 + 0xc)
                *(&data_1e6438 + (r7_30 << 4)) = r9_1
                var_e4_1 = r7_30 + 1
                *((r7_30 << 4) + 0x1e643c) = 0
                *((r7_30 << 4) + 0x1e6440) = r0_85
                *((r7_30 << 4) + 0x1e6444) = r2_37
                r7 = r0_3
                goto label_1786b8
            case 0x80
                char __s1[0x80]
                CUserOption::DisplayOption(r0_6, &__s1)
                int32_t r5_34 = 0
                int32_t r0_88 = 0
                
                if (strcasecmp(&__s1, "Destroy Even") == 0)
                    goto label_1785c0
                
                if (strcasecmp(&__s1, "Destroy Odd") != 0)
                    r5 = var_bc_1
                label_178148:
                    
                    if (var_100 u> 0x5f)
                        goto label_1786b8
                    
                    void** r0_91 = &data_1ec4b8 + (var_100 << 4)
                    *r0_91 = r9_1
                    var_100 += 1
                    r0_91[1].w = 0
                    r0_91[2] = 0
                    r0_91[3] = 0
                    goto label_1786b8
                
                r0_88 = 1
            label_1785c0:
                int32_t r12_1 = *(r8 + 0x1c)
                int32_t* r2_51 = *(*(arg1 + 0x20) + 0x18)
                
                if (r2_51 != r12_1)
                    r5_34 = 0
                    
                    do
                        void* r7_37 = *r2_51
                        
                        if (*(r7_37 + 0xc) != *(arg1 + 4))
                            int32_t* r6_4 = *(r7_37 + 0x54)
                            int32_t r7_38 = *(r7_37 + 0x58)
                            
                            if (r6_4 != r7_38)
                                do
                                    void* r1_75 = *r6_4
                                    r6_4 = &r6_4[1]
                                    int32_t r3_43 = 0x98
                                    
                                    if (*(var_c4 + 0x30) u< 0x14)
                                        r3_43 = 0x9c
                                    
                                    int32_t r1_78 = *(*(*(r1_75 + 0x10) + 0xc) + r3_43)
                                    
                                    if (r1_78 - ((r1_78 + (r1_78 u>> 0x1f)) & 0xfffffffe) == r0_88)
                                        r5_34 += r1_78
                                while (r7_38 != r6_4)
                        
                        r2_51 = &r2_51[1]
                    while (r2_51 != r12_1)
                
                int32_t r1_79 = var_19c_1
                void* r0_102 = var_198_1
                r8 = var_c4
                
                if (r5_34 s> r1_79)
                    r0_102 = r9_1
                    r1_79 = r5_34
                
                var_198_1 = r0_102
                var_19c_1 = r1_79
                r7 = r0_3
                r5 = var_bc_1
                goto label_1786b8
            case 0x81, 0x83
                *r0_6
                void* r0_30 = core::CWorldBase::GetInstanceByID(r8)
                
                if (r0_30 != 0 && zx.d(*(*(r0_30 + 0xc) + 0x163)) == 0)
                    void** r0_33 = &data_1ec0b8 + (var_114_1 << 4)
                    *r0_33 = r9_1
                    var_114_1 += 1
                    r0_33[1].w = 0
                    r0_33[2] = 0
                    r0_33[3] = 0
                
                goto label_1786b8
            case 0x82, 0xe1
                *r0_6
                void* r0_36 = core::CWorldBase::GetInstanceByID(r8)
                
                if (r0_36 != 0)
                    int32_t r1_24 = *(r0_36 + 0xc)
                    int32_t var_174_1
                    
                    if (var_174_1 s>= 1)
                        int32_t r2_13 = 0
                        
                        do
                            if (*(&data_1e5518 + (r2_13 << 2)) == r1_24)
                                goto label_1786b8
                            
                            r2_13 += 1
                        while (r2_13 s< var_174_1)
                    
                    *(&data_1e5518 + (var_174_1 << 2)) = r1_24
                    void** r3_5 = &data_1eb438 + (var_180_1 << 4)
                    *r3_5 = r9_1
                    var_180_1 += 1
                    r3_5[1].w = 0
                    r3_5[2] = r0_36
                    r3_5[3] = r1_24
                    r5 = var_bc_1
                    var_174_1 += 1
                
                goto label_1786b8
            case 0xc0
                var_110 = r9_1
                goto label_1786b8
            case 0xd0
                *r0_6
                void* r0_93 = core::CWorldBase::GetInstanceByID(r8)
                
                if (r0_93 != 0)
                    int32_t r1_60 = *(r0_93 + 0xc)
                    int32_t var_1c4_1
                    
                    if (var_1c4_1 s>= 1)
                        int32_t r2_39 = 0
                        
                        do
                            if (*(&data_1e5818 + (r2_39 << 2)) == r1_60)
                                goto label_1786b8
                            
                            r2_39 += 1
                        while (r2_39 s< var_1c4_1)
                    
                    *(&data_1e5818 + (var_1c4_1 << 2)) = r1_60
                    void** r3_31 = &data_1ec038 + (var_1a4_1 << 4)
                    *r3_31 = r9_1
                    var_1a4_1 += 1
                    r3_31[1].w = 0
                    r3_31[2] = r0_93
                    r3_31[3] = r1_60
                    var_1c4_1 += 1
                
                goto label_1786b8
            case 0xd3
                var_130 = r9_1
                goto label_1786b8
            case 0xd4
                var_148 = r9_1.b
                goto label_1786b8
            case 0xd5
                var_134 = r9_1
                goto label_1786b8
            case 0xe2
                r1_61 = var_d0_1
                r0_94 = var_c0_1
                
                if (r1_61 s< 1)
                    r0_94 = r9_1
                    r1_61 = 1
                
            label_1782a4:
                var_c0_1 = r0_94
                var_d0_1 = r1_61
                goto label_1786b8
            case 0xe3
                r1_61 = var_d0_1
                r0_94 = var_c0_1
                
                if (r1_61 s< 2)
                    r0_94 = r9_1
                    r1_61 = 2
                
                goto label_1782a4
            case 0xe4
                r1_61 = var_d0_1
                r0_94 = var_c0_1
                
                if (r1_61 s< 3)
                    r0_94 = r9_1
                    r1_61 = 3
                
                goto label_1782a4
            case 0xe5
                r1_61 = var_d0_1
                r0_94 = var_c0_1
                
                if (r1_61 s< 4)
                    r0_94 = r9_1
                    r1_61 = 4
                
                goto label_1782a4
            case 0xe6
                r1_61 = var_d0_1
                r0_94 = var_c0_1
                
                if (r1_61 s< 5)
                    r0_94 = r9_1
                    r1_61 = 5
                
                goto label_1782a4
        
    label_17859c:
        r5 = var_bc_1
        goto label_1786b8
    
    if (var_164_1 s>= 1)
        r1_81 = arg_0
        *(r1_81 + 2) = 0
        *r1_81 = var_16c_1.b
    label_178900:
        *(r1_81 + 4) = 0
        result = 1
        goto label_179adc
    
    void* r1_82 = var_f0_1
    r9 = arg_0
    
    if (r1_82 == 0xffffffff)
        r1_82 = var_170_1
        
        if (r1_82 != 0xffffffff)
            goto label_178930
        
        r1_82 = var_198_1
        
        if (r1_82 != 0xffffffff)
            goto label_178930
        
        if (var_180_1 s< 1)
            if (result_1 s< 1)
                result = result_2
                
                if (result s< 1)
                    r0_103 = var_c0_1
                    r6_5 = var_158_1
                    r2_54 = var_12c_1
                    r3_47 = var_128_1
                    r5_40 = var_cc_1
                    r7_41 = var_dc_1
                    r8_2 = var_fc_1
                    r12_2 = var_d8_1
                    r4_14 = var_144_1
                    
                    if (var_1a4_1 s< 1)
                        goto label_178818
                    
                    void* r1_158 = &data_1ec038 + ((*(**(arg1 + 0x20) + 0xc))() << 4)
                    *r9 = (*r1_158).b
                    r0_107 = *(r1_158 + 4)
                label_178984:
                    result = 1
                    *(r9 + 4) = 0
                    *(r9 + 2) = r0_107
                else
                    void* r0_205 = *(r8 + 0xb20)
                    
                    if (r0_205 == 0 || *(r0_205 + 0xc) != *(arg1 + 4))
                        int32_t r2_94 = 0
                        int32_t r7_86 = 0
                        int32_t r3_85 = 0
                        
                        do
                            int32_t r5_64 = 0x98
                            int32_t* r6_43 = *((r2_94 << 4) + 0x1ebc44)
                            
                            if (*(r8 + 0x30) u< 0x14)
                                r5_64 = 0x9c
                            
                            int32_t r6_45 = ((r6_43[0x28] + *(r6_43 + r5_64)) << 1) - r6_43[0x29]
                            
                            if (r6_45 s> r7_86)
                                r3_85 = r2_94
                            
                            r2_94 += 1
                            
                            if (r6_45 s> r7_86)
                                r7_86 = r6_45
                        while (result != r2_94)
                        
                        result = 1
                        *r9 = (*(&data_1ebc38 + (r3_85 << 4))).b
                        r0_104 = *((r3_85 << 4) + 0x1ebc3c)
                        *(r9 + 4) = 0
                        *(r9 + 2) = r0_104
                    else
                        int32_t r1_154 = 4
                        int32_t r3_84 = result
                        int32_t r7_85 = 0
                        int32_t i_28
                        
                        do
                            i_28 = r3_84
                            r3_84 -= 1
                            char* r5_63 = &r9[r7_85]
                            *r5_63 = (*(&data_1ebc38 + (r7_85 << 1))).b
                            void* r6_40 = &data_1ebc38 + r1_154
                            r1_154 += 0x10
                            r7_85 += 8
                            int16_t r6_41 = *r6_40
                            *(r5_63 + 4) = 0
                            *(r5_63 + 2) = r6_41
                        while (i_28 != 1)
            else
                void* r0_201 = *(r8 + 0xb20)
                
                if (r0_201 == 0 || *(r0_201 + 0xc) != *(arg1 + 4))
                    int32_t r2_93 = 0
                    int32_t r7_84 = 0
                    int32_t r3_83 = 0
                    
                    do
                        int32_t r5_59 = 0x98
                        int32_t* r6_36 = *((r2_93 << 4) + 0x1eb844)
                        
                        if (*(r8 + 0x30) u< 0x14)
                            r5_59 = 0x9c
                        
                        int32_t r6_38 = ((r6_36[0x28] + *(r6_36 + r5_59)) << 1) - r6_36[0x29]
                        
                        if (r6_38 s> r7_84)
                            r3_83 = r2_93
                        
                        r2_93 += 1
                        
                        if (r6_38 s> r7_84)
                            r7_84 = r6_38
                    while (result_1 != r2_93)
                    
                    result = 1
                    *r9 = (*(&data_1eb838 + (r3_83 << 4))).b
                    r0_104 = *((r3_83 << 4) + 0x1eb83c)
                    *(r9 + 4) = 0
                    *(r9 + 2) = r0_104
                else
                    result = result_1
                    int32_t r1_149 = 4
                    int32_t r7_83 = 0
                    int32_t r3_82 = result
                    int32_t i_29
                    
                    do
                        i_29 = r3_82
                        r3_82 -= 1
                        char* r5_58 = &r9[r7_83]
                        *r5_58 = (*(&data_1eb838 + (r7_83 << 1))).b
                        void* r6_33 = &data_1eb838 + r1_149
                        r1_149 += 0x10
                        r7_83 += 8
                        int16_t r6_34 = *r6_33
                        *(r5_58 + 4) = 0
                        *(r5_58 + 2) = r6_34
                    while (i_29 != 1)
        else if (*(r0_1 + 0x9c) s< 1)
        label_179b68:
            void* r1_142 = *(r0_1 + 0x38)
            
            if (*(r1_142 + 0x18) != 0)
            label_179b88:
                int32_t* i_30 = *(r1_142 + 0xc)
                
                for (int32_t r1_143 = *(r1_142 + 0x10); i_30 != r1_143; i_30 = &i_30[1])
                    void* r3_80 = &data_1eb444
                    int32_t r6_30 = 0
                    
                    do
                        if (*r3_80 == *(*i_30 + 0xc))
                            *(r3_80 - 8) += 1
                            break
                        
                        r6_30 += 1
                        r3_80 += 0x10
                    while (r6_30 s< var_180_1)
                
                int32_t r0_199 = var_180_1 - 1
                char r4_59 = 0
                void* r1_144 = &data_1eb44c
                int16_t r3_81 = data_1eb43c
                int16_t r7_82 = r3_81
                
                while (true)
                    if (zx.d(r3_81) s> sx.d(r7_82))
                        r4_59 = (*(r1_144 - 0x14)).b
                        r7_82 = r3_81
                    
                    if (r0_199 == 0)
                        break
                    
                    r3_81 = *r1_144
                    r1_144 += 0x10
                    r0_199 -= 1
                
                *(r9 + 2) = 0
                *r9 = r4_59
            else
                r1_142 = *(r0_1 + 0x40)
                
                if (*(r1_142 + 0x18) != 0)
                    goto label_179b88
                
                *(r9 + 2) = 0
                *r9 = 0
            
            *(r9 + 4) = 0
            result = 1
        else
            int32_t i_31 = *(ascension::CPlayer::GetTopCardFromDeck() + 0xc)
            int32_t r0_196 = 0
            
            while (*((r0_196 << 4) + &data_1eb444) != i_31)
                r0_196 += 1
                
                if (r0_196 s>= var_180_1)
                    goto label_179b68
            
            char r0_203 = (*(&data_1eb438 + (r0_196 << 4))).b
            *(r9 + 2) = 0
            *(r9 + 4) = 0
            result = 1
            *r9 = r0_203
    else
    label_178930:
        *(r9 + 2) = 0
        *r9 = r1_82.b
        *(r9 + 4) = 0
        result = 1
label_179adc:

if (*__stack_chk_guard == r1)
    return result

__stack_chk_fail()
noreturn
