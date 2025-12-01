// 函数: _ZN12ascension_ai11CWeightedAI8EvaluateEPN4core10CWorldBaseERK13CStateMachineP17CGameStateOptionsRj
// 地址: 0x17eec0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

unimplemented  {vpush {d8, d9, d10, d11, d12}}
int32_t* arg_0
uint32_t* r5 = arg_0
CStateMachine const& r9 = arg2
uint32_t& r8 = arg4
int32_t r0 = *__stack_chk_guard
int32_t var_134 = 0xffffffff

if (ascension_ai::AIHandlerThread_CheckEvaluationResult(arg1, &var_134, r5) == 0)
    int32_t* r2_2 = *(arg1 + 0x24)
    uint32_t* var_17c
    CStateMachine const& var_144_1
    int32_t* var_140_1
    uint32_t& var_13c_1
    int32_t format
    char var_b0
    int32_t var_ac
    int32_t r5_1
    void* __offset(core::CWorldBase, 0x28) r6_2
    int32_t* r8_1
    void* const r9_1
    
    if (r2_2 == 0)
        int32_t r7_1 = *(arg1 + 0x18)
        var_140_1 = r2_2
        int32_t r0_10
        
        if (r7_1 != 0)
            var_17c = r5
            void var_138
            r0_10 = r7_1(*(arg1 + 0x1c), *(arg1 + 4), &var_b0, &format, &var_138, var_17c)
        
        if (r7_1 == 0 || r0_10 == 0)
            ascension::CWorld::CopyWorld(*(arg1 + 0x20))
            ascension::CWorld::VerifyEqual(*(arg1 + 0x20))
            void (* r0_13)(void*, core::CStateChangeMessage const*, uint32_t) = *(arg1 + 0x20)
            *(r0_13 + 0x14) = arg1
            core::CWorldBase::AddStateChangeListener(r0_13, 
                ascension_ai::CWeightedAI::OnGameStateChange)
            int64_t* r0_14 = operator new[](&data_c2e88)
            *r0_14 = 0x10:0xc2e8
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            &__elf_symbol_table[0x821]
            CStateMachine::CStateMachine()
            &__elf_symbol_table[0x13e1]
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            &(*__elf_hash_table.chains)[0x60d]
            CStateMachine::CStateMachine()
            &__elf_rel_table[0xa8f].r_info
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            *(arg1 + 0xb8) = 0
            *(arg1 + 0xbc) = 0
            *(arg1 + 0xc8) = 0
            *(arg1 + 0xcc) = 0
            *(arg1 + 0xac) = 0
            *(arg1 + 0x24) = &r0_14[1]
            *(arg1 + 0xc0) = 0
            clock_gettime(1, &var_b0)
            *(arg1 + 0xb0) = mulu.dp.d(0x3b9aca00, zx.d(var_b0)) + (var_ac s>> 0x1f):var_ac
            puts("\nBEGIN AI EVALUATION")
            *(r8[0x12] + 8)
            void* r0_46 = core::CWorldBase::GetInstanceByID(*(arg1 + 0x20))
            printf("    player hand:")
            void* r0_47 = *(r0_46 + 0x3c)
            
            if (*(r0_47 + 0x18) == 0)
                puts(" empty")
            else
                int32_t* i = *(r0_47 + 0xc)
                
                if (i != *(r0_47 + 0x10))
                    do
                        int32_t* r0_49 = *i
                        i = &i[1]
                        printf("  %s", (*(*r0_49 + 0xc))())
                    while (i != *(*(r0_46 + 0x3c) + 0x10))
                
                putchar(0xa)
            
            printf("    constructs :")
            int32_t* i_1 = *(r0_46 + 0x54)
            int32_t r0_53 = *(r0_46 + 0x58)
            
            if (r0_53 != i_1)
                if (r0_53 != i_1)
                    do
                        int32_t* r0_54 = *i_1
                        i_1 = &i_1[1]
                        printf("  %s", (*(*r0_54 + 0xc))())
                    while (i_1 != *(r0_46 + 0x58))
                
                putchar(0xa)
            else
                puts(" none")
            
            printf("    trophies   :")
            int32_t* i_2 = *(r0_46 + 0x60)
            int32_t r0_57 = *(r0_46 + 0x64)
            
            if (r0_57 != i_2)
                if (r0_57 != i_2)
                    do
                        int32_t* r0_58 = *i_2
                        i_2 = &i_2[1]
                        printf("  %s", (*(*r0_58 + 0xc))())
                    while (i_2 != *(r0_46 + 0x64))
                
                putchar(0xa)
            else
                puts(" none")
            
            printf("    event      :")
            var_13c_1 = r8
            var_144_1 = r9
            int32_t* r0_62 = *(*(arg1 + 0x20) + 0xa6c)
            
            if (r0_62 == 0)
                puts(" none")
            else
                printf("  %s\n", (*(*r0_62 + 0xc))())
            
            puts("    center row :")
            
            for (int32_t i_3 = 0; i_3 != 7; i_3 += 1)
                if (ascension::CWorld::GetCenterRowCardStackList(*(arg1 + 0x20)) != 0)
                    int32_t* r10_1 = *ascension::CWorld::GetCenterRowCardStackList(*(arg1 + 0x20))
                    
                    if (r10_1
                            != *(ascension::CWorld::GetCenterRowCardStackList(*(arg1 + 0x20)) + 4))
                        printf("        %s", (*(**r10_1 + 0xc))())
                        
                        if (&r10_1[2] !=
                                *(ascension::CWorld::GetCenterRowCardStackList(*(arg1 + 0x20)) + 4))
                            printf(" (%s", (*(*r10_1[2] + 0xc))())
                            void* r6_5 = &r10_1[4]
                            
                            if (r6_5 != *(
                                    ascension::CWorld::GetCenterRowCardStackList(*(arg1 + 0x20))
                                    + 4))
                                int32_t r0_85
                                
                                do
                                    int32_t* r0_81 = *r6_5
                                    r6_5 += 8
                                    printf(",%s", (*(*r0_81 + 0xc))())
                                    r0_85 = *(
                                        ascension::CWorld::GetCenterRowCardStackList(*(arg1 + 0x20))
                                        + 4)
                                while (r6_5 != r0_85)
                            
                            putchar(0x29)
                
                putchar(0xa)
            
            r6_2 = arg1 + 0x28
            r5_1 = *r6_2
            r9_1 = nullptr
            r8_1 = *(r6_2 - 4)
            goto label_17f46c
    else
        if (*r2_2 == r8)
            goto label_17f61c
        
        r6_2 = arg1 + 0x28
        r5_1 = *r6_2
        var_144_1 = r9
        var_13c_1 = r8
        r8_1 = r2_2
        r9_1 = r2_2 + (r5_1 - 1) * 0xc2e8
        var_140_1 = r2_2
        *(r9_1 + 0x150) = 1
        
        if (r5_1 u< 0x10)
        label_17f46c:
            *r6_2 = r5_1 + 1
            void* r2_9 = &r8_1[r5_1 * 0x30ba]
            *r2_9 = var_13c_1
            *(r2_9 + 4) = arg3
            void* r7_17 = r8_1 + r5_1 * 0xc2e8
            
            if (r9_1 != 0)
                r2_9 = *(r9_1 + 0x120)
            
            if (r9_1 == 0)
                r2_9 = nullptr
            
            *(r7_17 + 0x124) = r2_9
            char* var_180 = r7_17 + 0xc
            int32_t r0_87 = ascension_ai::CWeightedAI::BuildEvaluateOptionList(arg1, 
                *(arg1 + 0x20), var_13c_1.w, r2_9 & 0xffff)
            *(r7_17 + 8) = r0_87
            
            if (r0_87 != 1)
                void* r0_91 = r8_1 + r5_1 * 0xc2e8
                *(r0_91 + 0x10c) = 0xffffffff
                *(r0_91 + 0x154) = 0
                *(r0_91 + 0x158) = 0xc9742400
                *(r0_91 + 0x21c) = 0
                *(r0_91 + 0x220) = 0xc95bba00
            label_17f588:
                void* r7_19 = r8_1 + r5_1 * 0xc2e8
                *(arg1 + 0x20)
                *(r7_19 + 0x128) = core::CWorldBase::GetRollbackPosition()
                *(r7_19 + 0x14c) = 0
                *(r7_19 + 0x150) = 1
                int128_t entry_q0
                double q1
                
                if (var_140_1 == 0)
                    *(r7_19 + 0x110) = 0
                    *(r7_19 + 0x114) = 0
                    *(r7_19 + 0x118) = 0
                    *(r7_19 + 0x11c) = 0x40200000
                    r8 = var_13c_1
                    r9 = var_144_1
                label_17f61c:
                    
                    if (ascension_ai::AIHandlerThread_StartEvaluation(arg1, r9, arg3, r8) == 0)
                        CStateMachine const& var_144_2 = r9
                        int32_t var_13c_2 = r8
                        clock_gettime(1, &var_b0)
                        int32_t r2_14
                        int32_t r3_7
                        r3_7:r2_14 = mulu.dp.d(0x3b9aca00, zx.d(var_b0)) + (var_ac s>> 0x1f):var_ac
                        int32_t r0_103 = *(arg1 + 0x28)
                        int64_t var_178
                        double var_170
                        int32_t* var_168
                        
                        if (r0_103 s>= 1)
                            int32_t r8_2 = 0
                            int128_t q4
                            q4.q = 0x3e112e0be826d695
                            q4:8.q = 0x3f789374bc6a7efa
                            int32_t* r9_2 = *(arg1 + 0x24) + r0_103 * 0xc2e8 - 0xc2e8
                            
                            while (true)
                                r8_2 += 1
                                
                                if (r8_2 u% 0xc8 == 0)
                                    clock_gettime(1, &var_b0)
                                    uint32_t r2_15 = zx.d(var_b0)
                                    int32_t r0_110
                                    int32_t r1_51
                                    r1_51:r0_110 = mulu.dp.d(0x3b9aca00, r2_15)
                                        + (sbb.d(var_ac s>> 0x1f, r3_7, var_ac u< r2_14))
                                        :(var_ac - r2_14)
                                    __aeabi_ul2d(r0_110, r1_51, r2_15, 0x3b9aca00, var_180, 
                                        var_17c, var_178, var_170, var_168)
                                    unimplemented  {vmov d0, r0, r1}
                                    entry_q0.q = entry_q0.q f* 1.0000000000000001e-09
                                    unimplemented  {vcmpe.f64 d0, d9}
                                    unimplemented  {vmrs apsr_nzcv, fpscr}
                                    
                                    if (var_ac != r2_14 && var_ac - r2_14 s< 0
                                            == add_overflow(var_ac, neg.d(r2_14)))
                                        break
                                
                                if (zx.d(r9_2[0x54].b) != 0 || r9_2[0x4b] == 0)
                                    clock_gettime(1, &var_b0)
                                    uint32_t r0_112 = zx.d(var_b0)
                                    int32_t r0_115 = *(arg1 + 0xb0)
                                    int32_t r5_4 = *(arg1 + 0xb4)
                                    r9_2[0x4a]
                                    int32_t r6_7
                                    int32_t r7_20
                                    r7_20:r6_7 = *(arg1 + 0xb8)
                                    core::CWorldBase::ProcessRollback(*(arg1 + 0x20))
                                    int32_t r0_119
                                    int32_t r1_55
                                    r0_119, r1_55 = __aeabi_ul2d(r6_7, r7_20)
                                    
                                    if (r9_2[0x4a] == 0 && (*(arg1 + 0x28) s> 1 || r9_2[2] u>= 2))
                                        ascension::CWorld::VerifyEqual(*(arg1 + 0x20))
                                    
                                    int32_t r0_124 = r9_2[0x43]
                                    int32_t r10_3 = 0
                                    bool cond:8_1 = r0_124 s<= 0
                                    
                                    if (r0_124 s>= 0)
                                        unimplemented  {vmov d0, r6, r7}
                                        int32_t r1_57 = *(arg1 + 0x28)
                                        double q5 = entry_q0.q f* 1.0000000000000001e-09
                                        cond:8_1 = r1_57 s<= 1
                                        
                                        if (r1_57 != 1)
                                            unimplemented  {vcmpe.f64 d10, d11}
                                            unimplemented  {vmrs apsr_nzcv, fpscr}
                                            
                                            if (r1_57 s> 1)
                                                r10_3 = 1
                                                *(arg1 + 0xc0) = 1
                                        else
                                            int64_t q6 = *(arg1 + 0xc8)
                                            *(arg1 + 0xc8) = q5
                                            int32_t r0_125 = *r9_2
                                            r9_2[r0_125 + 3].b
                                            int16_t* r0_126 = CGameStateOptions::GetOption(r0_125)
                                            CUserOption::DisplayOption(r0_126, &var_b0)
                                            
                                            if ((zx.d(*r0_126) & 0xfff) != 0)
                                                int32_t* r0_128 = core::CWorldBase::GetInstanceByID(
                                                    *(arg1 + 0x20))
                                                
                                                if (r0_128 != 0)
                                                    strcpy(&format, &var_b0)
                                                    sprintf(&var_b0, &format, 
                                                        (*(*r0_128 + 0xc))(r0_128))
                                            
                                            int32_t r0_134 = *(arg1 + 0x28)
                                            cond:8_1 = r0_134 s<= 2
                                            bool cond:14_1 = r0_134 s<= 2
                                            
                                            if (r0_134 s>= 2)
                                                int32_t r5_5 = 1
                                                int32_t r0_135
                                                
                                                do
                                                    printf("  ")
                                                    r0_135 = *(arg1 + 0x28)
                                                    r5_5 += 1
                                                    cond:8_1 = r5_5 s<= r0_135
                                                    cond:14_1 = r5_5 s<= r0_135
                                                while (r5_5 s< r0_135)
                                            
                                            entry_q0.q = q5 f- q6
                                            unimplemented  {vcmpe.f64 d10, d11}
                                            unimplemented  {vmrs apsr_nzcv, fpscr}
                                            
                                            if (cond:14_1)
                                                format.b = 0
                                            else
                                                format = 0x2d2d20
                                            
                                            unimplemented  {vcvt.f32.f64 s0, d0}
                                            entry_q0:8.d = r9_2[0x56]
                                            unimplemented  {vcvt.f64.f32 d0, s0}
                                            var_168 = &format
                                            var_180 = zx.d(r0_126[1])
                                            var_17c = zx.d(*r0_126)
                                            unimplemented  {vcvt.f64.f32 d1, s2}
                                            var_178 = entry_q0:8.q
                                            var_170 = entry_q0.q
                                            printf("%d/%d: %s (%04x:%d) -> %f [%.04fs%s]\n", 
                                                r9_2[0x43] + 1, r9_2[2], &var_b0, var_180, var_17c, 
                                                var_178, var_170, var_168)
                                    
                                    entry_q0.d = r9_2[0x56]
                                    entry_q0:8.d = r9_2[0x88]
                                    unimplemented  {vcmpe.f32 s0, s2}
                                    unimplemented  {vmrs apsr_nzcv, fpscr}
                                    
                                    if (not(cond:8_1))
                                        int32_t r2_19 = r9_2[0x55]
                                        r9_2[0x88] = entry_q0.d
                                        r9_2[0x87] = r2_19
                                        __aeabi_memcpy4(&r9_2[0x89], &r9_2[0x57], r2_19 * 0xc)
                                    
                                    CStateMachine::ResetStateMachine()
                                    CState::DeleteState(r9_2[0x53])
                                    int32_t r0_141 = r9_2[2]
                                    int32_t r1_71 = r9_2[0x43] + 1
                                    r9_2[0x54].b = 0
                                    int32_t r0_142 = 0
                                    r9_2[0x53] = 0
                                    
                                    if (r1_71 s< r0_141)
                                        r0_142 = 1
                                    
                                    int32_t r2_22 = not.d(r10_3)
                                    r9_2[0x43] = r1_71
                                    
                                    if ((r2_22 & r0_142) != 0)
                                        void* r1_77 = &r9_2[r1_71]
                                        int32_t r0_151 = *r9_2
                                        r9_2[0x48] = r9_2[0x49] | zx.d(*(r1_77 + 0xe))
                                        uint32_t r6_11 = zx.d(*(r1_77 + 0xc))
                                        int16_t* r0_152 = CGameStateOptions::GetOption(r0_151)
                                        int16_t r1_79 = *r0_152
                                        r9_2[0x57].w = r6_11.w
                                        *(r9_2 + 0x15e) = r0_152[1]
                                        r9_2[0x58].w = r1_79
                                        r9_2[0x55] = 1
                                        r9_2[0x56] = 0xc9742400
                                        r9_2[0x59] = *arg_0
                                        format = 0xc000
                                        var_b0.d = &r9_2[0xb9]
                                        var_180 = &format
                                        r9_2[0x53] = CStateMachine::CloneStateMachine(&r9_2[0x4b], 
                                            r9_2[1], *(arg1 + 0x20), &var_b0)
                                        int32_t r0_158 = var_b0.d
                                        
                                        if (r0_158 u> &r9_2[0x30b9])
                                            printf("cloneStateMachineBuffer overflow  %d > %d\n", 
                                                r0_158 - &r9_2[0xb9], 0xc000)
                                        
                                        CStateMachine* r10_4 = r9_2[0x4b]
                                        CGameStateOptions::GetOptionCount()
                                        *r9_2
                                        CGameStateOptions::GetOptionCount()
                                        CGameStateOptions::GetOption(r10_4)
                                        CGameStateOptions::SelectOption(r10_4, &r9_2[0x4b], r6_11)
                                    else
                                        int32_t r0_143 = *(arg1 + 0x28)
                                        *(arg1 + 0x28) = r0_143 - 1
                                        
                                        if (r0_143 s>= 2)
                                            int32_t* r5_7 =
                                                *(arg1 + 0x24) + r0_143 * 0xc2e8 - 0x1847c
                                            int32_t r0_144 = *r5_7
                                            r5_7[1] = r9_2[0x88]
                                            __aeabi_memcpy4(r5_7 - 0x154 + r0_144 * 0xc + 0x15c, 
                                                &r9_2[0x89], r9_2[0x87] * 0xc)
                                            int32_t r1_76 = r9_2[0x87]
                                            r9_2 = r5_7 - 0x154
                                            *r5_7 += r1_76
                                            
                                            if (*(arg1 + 0x28) s< 1)
                                                break
                                            
                                            continue
                                        
                                        printf("END AI EVALUATION (%d end states)\n", 
                                            *(arg1 + 0xac), r2_22)
                                        int32_t r1_90
                                        int32_t r3_15
                                        r1_90:r3_15 =
                                            mulu.dp.d(0x3b9aca00, r0_112) + (var_ac s>> 0x1f):var_ac
                                        __aeabi_ul2d(r3_15 - r0_115, 
                                            sbb.d(r1_90, r5_4, r3_15 u< r0_115))
                                        unimplemented  {vmov d0, r0, r1}
                                        void* r2_31 = *(arg1 + 0x24)
                                        q4:8.q = entry_q0.q f* 1.0000000000000001e-09
                                        
                                        if (*(r2_31 + 0x21c) s>= 1)
                                            uint32_t r5_10 = zx.d(*(r2_31 + 0x224))
                                            int16_t* r0_172 =
                                                CGameStateOptions::GetOption(var_13c_2)
                                            CUserOption::DisplayOption(r0_172, &var_b0)
                                            
                                            if ((zx.d(*r0_172) & 0xfff) != 0)
                                                int32_t* r0_174 = core::CWorldBase::GetInstanceByID(
                                                    *(arg1 + 0x20))
                                                
                                                if (r0_174 != 0)
                                                    strcpy(&format, &var_b0)
                                                    sprintf(&var_b0, &format, 
                                                        (*(*r0_174 + 0xc))(r0_174))
                                            
                                            entry_q0.d = *(*(arg1 + 0x24) + 0x220)
                                            unimplemented  {vcvt.f64.f32 d0, s0}
                                            printf("  SELECTED OPTION %d: %s (%04x:%d) -> %f \n", 
                                                r5_10, &var_b0, zx.d(r0_172[1]), zx.d(*r0_172), 
                                                var_17c, entry_q0.q, var_170, var_168)
                                        
                                        int32_t r0_182
                                        int32_t r1_102
                                        r1_102:r0_182 = *(arg1 + 0xb8)
                                        __aeabi_ul2d(r0_182, r1_102)
                                        unimplemented  {vmov d0, r0, r1}
                                        unimplemented  {vcvt.f32.f64 s4, d9}
                                        q4.q = entry_q0.q f* 1.0000000000000001e-09
                                        entry_q0.q = q4.q f/ q4:8.q
                                        unimplemented  {vcvt.f32.f64 s2, d8}
                                        unimplemented  {vcvt.f64.f32 d1, s2}
                                        unimplemented  {vmov r2, r3, d1}
                                        entry_q0:8.d = 0x42c80000
                                        unimplemented  {vcvt.f32.f64 s0, d0}
                                        entry_q0.d = entry_q0.d f* 100f
                                        unimplemented  {vcvt.f64.f32 d1, s4}
                                        var_180.q = entry_q0:8.q
                                        unimplemented  {vcvt.f64.f32 d0, s0}
                                        var_178 = entry_q0.q
                                        printf("    TIME = %.04f / %.04f  (%.02f%%)\n")
                                        int32_t r0_183 = *(arg1 + 0xac)
                                        int32_t r1_103 = data_1f4ce8
                                        
                                        if (r0_183 u> r1_103)
                                            data_1f4ce8 = r0_183
                                        
                                        entry_q0.q = data_1f4cf0
                                        unimplemented  {vcmpe.f64 d8, d0}
                                        unimplemented  {vmrs apsr_nzcv, fpscr}
                                        
                                        if (r0_183 s> r1_103)
                                            unimplemented  {vmov.f64 q0, #3.000000e+00}
                                            data_1f4cf0 = q4.q
                                        
                                        entry_q0:8.q = data_1f4cf8
                                        unimplemented  {vcmpe.f64 d9, d1}
                                        unimplemented  {vmrs apsr_nzcv, fpscr}
                                        
                                        if (r0_183 s> r1_103)
                                            unimplemented  {vmov.f64 q0, #3.125000e+00}
                                            data_1f4cf8 = q4:8.q
                                            data_1f4d00 = *(*(arg1 + 0x20) + 0x34)
                                        
                                        unimplemented  {vcvt.f32.f64 s0, d0}
                                        unimplemented  {vcvt.f64.f32 d0, s0}
                                        unimplemented  {vmov r2, r3, d0}
                                        unimplemented  {vcvt.f32.f64 s0, d1}
                                        q1 = q4:8.q f+ data_1f4d08
                                        data_1f4d08 = q1
                                        unimplemented  {vcvt.f64.f32 d0, s0}
                                        int32_t* r7_26 = data_1f4d10
                                        
                                        if (zx.d(*(arg1 + 0xc0)) != 0)
                                            r7_26 += 1
                                            data_1f4d10 = r7_26
                                        
                                        var_168 = r7_26
                                        var_170 = q1
                                        var_178.d = data_1f4d00
                                        var_180.q = entry_q0.q
                                        printf("    MAX = %d end states   (%.04f / %.04f)  [0x%08x]  "
                                        "-->  %.04fs (-- %d)\n\n")
                                        break
                                
                                CStateMachine::Update()
                                int32_t r0_164 = *(arg1 + 0x28)
                                
                                if (r0_164 s< 1)
                                    break
                                
                                r9_2 = *(arg1 + 0x24) + r0_164 * 0xc2e8 - 0xc2e8
                                
                                if (r0_164 s< 1)
                                    break
                        
                        clock_gettime(1, &var_b0)
                        int32_t r0_189
                        int32_t r2_37
                        r0_189:r2_37 = mulu.dp.d(0x3b9aca00, zx.d(var_b0))
                            + (sbb.d(var_ac s>> 0x1f, r3_7, var_ac u< r2_14)):(var_ac - r2_14)
                        int32_t r6_15
                        int32_t r7_27
                        r7_27:r6_15 = *(arg1 + 0xb8)
                        *(arg1 + 0xb8) =
                            (adc.d(r0_189, r7_27, r2_37 + r6_15 u< r2_37)):(r2_37 + r6_15)
                        
                        if (*(arg1 + 0x28) s<= 0)
                            void* r5_11 = *(arg1 + 0x24)
                            uint32_t r7_28 = zx.d(*(r5_11 + 0x224))
                            int16_t* r0_192 = CGameStateOptions::GetOption(var_13c_2)
                            int32_t r5_12 = *(r5_11 + 0x22c)
                            *arg_0 = r5_12
                            int32_t r12_1 = *(arg1 + 0x10)
                            
                            if (r12_1 != 0)
                                r12_1(*(arg1 + 0x14), *(arg1 + 4), r7_28, zx.d(*r0_192), 
                                    zx.d(r0_192[1]), r5_12, var_178, var_170, var_168)
                            
                            int32_t r0_195 = *(arg1 + 0x24)
                            
                            if (r0_195 != 0)
                                int32_t r1_110 = *(r0_195 - 4)
                                
                                if (r1_110 != 0)
                                    int32_t i_5 = r1_110 * 0xc2e8
                                    int32_t i_4
                                    
                                    do
                                        CStateMachine::~CStateMachine()
                                        i_4 = i_5
                                        i_5 -= 0xc2e8
                                    while (i_4 != 0xc2e8)
                                
                                operator delete[](r0_195 - 8)
                            
                            void (* r0_198)(void*, core::CStateChangeMessage const*, uint32_t) =
                                *(arg1 + 0x20)
                            *(arg1 + 0x24) = 0
                            *(r0_198 + 0x14) = 0
                            core::CWorldBase::AddStateChangeListener(r0_198, nullptr)
                else
                    entry_q0.q = *(r9_1 + 0x110)
                    
                    if (*r6_2 s< 9)
                        entry_q0:8.q = *(r9_1 + 0x118)
                        q1.d = *(r9_1 + 8)
                        void* r0_165 = r8_1 + r5_1 * 0xc2e8
                        entry_q0:8.q = entry_q0:8.q f- entry_q0.q
                        q1:8.d = *(r9_1 + 0x10c)
                        unimplemented  {vcvt.f64.u32 d2, s4}
                        entry_q0:8.q = entry_q0:8.q f/ q1
                        unimplemented  {vcvt.f64.s32 d2, s6}
                        unimplemented  {vmla.f64 d0, d1, d2}
                        *(r0_165 + 0x110) = entry_q0.q
                        entry_q0:8.q = entry_q0:8.q f+ entry_q0.q
                        *(r0_165 + 0x118) = entry_q0:8.q
                    else
                        void* r0_98 = r8_1 + r5_1 * 0xc2e8
                        *(r0_98 + 0x110) = entry_q0.q
                        entry_q0.q = *(r9_1 + 0x118)
                        *(r0_98 + 0x118) = entry_q0.q
            else
                if (var_140_1 == 0)
                    void* r7_18 = r8_1 + r5_1 * 0xc2e8
                    *(r7_18 + 0x10c) = 0
                    *(r7_18 + 0x154) = 1
                    *(r7_18 + 0x158) = 0xbf800000
                    *(r7_17 + 0xc)
                    int16_t* r0_93 = CGameStateOptions::GetOption(var_13c_1)
                    int16_t r1_41 = *r0_93
                    int16_t r0_94 = r0_93[1]
                    *(r7_18 + 0x21c) = 1
                    *(r7_18 + 0x220) = 0x3f800000
                    uint16_t r2_11 = zx.w(*(r7_17 + 0xc))
                    *(r7_18 + 0x226) = r0_94
                    *(r7_18 + 0x224) = r2_11
                    *(r7_18 + 0x228) = r1_41
                    goto label_17f588
                
                *(r7_17 + 0xc)
                *(r9_1 + 0x150) = 0
                *r6_2 -= 1
        else
            *(r9_1 + 0x158) = ascension_ai::CWeightedAI::ScoreCurrentState(arg1)
            *(arg1 + 0xac) += 1

if (*__stack_chk_guard == r0)
    unimplemented  {vpopeq {d8, d9, d10, d11, d12}}
    int32_t var_2c
    jump(var_2c)

__stack_chk_fail()
noreturn
