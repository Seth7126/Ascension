// 函数: _ZN12ascension_ai9CMediumAI8EvaluateEPN4core10CWorldBaseERK13CStateMachineP17CGameStateOptionsRj
// 地址: 0x17a250
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

unimplemented  {vpush {d8, d9, d10, d11, d12, d13, d14, d15}}
int32_t* arg_0
uint32_t* r10 = arg_0
CStateMachine const& r9 = arg2
CGameStateOptions* r6 = arg3
uint32_t& r8 = arg4
int32_t r0 = *__stack_chk_guard
int32_t var_1b4 = 0xffffffff

if (ascension_ai::AIHandlerThread_CheckEvaluationResult(arg1, &var_1b4, r10) == 0)
    int32_t* r2_2 = *(arg1 + 0x24)
    uint32_t var_21c
    CGameStateOptions* var_1c8_1
    int32_t* var_1c4_1
    CStateMachine const& var_1c0_1
    uint32_t& var_1bc_1
    int32_t var_1b0
    char var_130
    int32_t var_12c
    int32_t r6_1
    void* __offset(core::CWorldBase, 0x28) r7_2
    int32_t* r8_1
    void* const r9_1
    
    if (r2_2 == 0)
        int32_t r7_3 = *(arg1 + 0x18)
        var_1c4_1 = r2_2
        int32_t r0_10
        
        if (r7_3 != 0)
            var_21c = r10
            void var_1b8
            r0_10 = r7_3(*(arg1 + 0x1c), *(arg1 + 4), &var_130, &var_1b0, &var_1b8, var_21c)
        
        if (r7_3 == 0 || r0_10 == 0)
            var_1c8_1 = r6
            ascension::CWorld::CopyWorld(*(arg1 + 0x20))
            ascension::CWorld::VerifyEqual(*(arg1 + 0x20))
            void (* r0_13)(void*, core::CStateChangeMessage const*, uint32_t) = *(arg1 + 0x20)
            *(r0_13 + 0x14) = arg1
            core::CWorldBase::AddStateChangeListener(r0_13, 
                ascension_ai::CMediumAI::OnGameStateChange)
            *(arg1 + 0xc) = 0
            *(arg1 + 8) = 1
            int64_t* r0_14 = operator new[](0x127088)
            *r0_14 = 0x18:0xc4b0
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            &__elf_symbol_table[0x861]
            CStateMachine::CStateMachine()
            &__elf_symbol_table[0x14a1]
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            &(*__elf_hash_table.chains)[0xc1f]
            CStateMachine::CStateMachine()
            &__elf_rel_table[0xe2e].r_info
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            CStateMachine::CStateMachine()
            *(arg1 + 0x38) = 0
            *(arg1 + 0x3c) = 0
            *(arg1 + 0x48) = 0
            *(arg1 + 0x4c) = 0
            *(arg1 + 0x2c) = 0
            *(arg1 + 0x24) = &r0_14[1]
            *(arg1 + 0x40) = 0
            clock_gettime(1, &var_130)
            *(arg1 + 0x30) = mulu.dp.d(0x3b9aca00, zx.d(var_130)) + (var_12c s>> 0x1f):var_12c
            puts("\nBEGIN AI EVALUATION")
            *(r8[0x12] + 8)
            void* r0_50 = core::CWorldBase::GetInstanceByID(*(arg1 + 0x20))
            printf("    player hand:")
            void* r0_51 = *(r0_50 + 0x3c)
            
            if (*(r0_51 + 0x18) == 0)
                puts(" empty")
            else
                int32_t* i = *(r0_51 + 0xc)
                
                if (i != *(r0_51 + 0x10))
                    do
                        int32_t* r0_53 = *i
                        i = &i[1]
                        printf("  %s", (*(*r0_53 + 0xc))())
                    while (i != *(*(r0_50 + 0x3c) + 0x10))
                
                putchar(0xa)
            
            printf("    constructs :")
            int32_t* i_1 = *(r0_50 + 0x54)
            int32_t r0_57 = *(r0_50 + 0x58)
            
            if (r0_57 != i_1)
                if (r0_57 != i_1)
                    do
                        int32_t* r0_58 = *i_1
                        i_1 = &i_1[1]
                        printf("  %s", (*(*r0_58 + 0xc))())
                    while (i_1 != *(r0_50 + 0x58))
                
                putchar(0xa)
            else
                puts(" none")
            
            printf("    trophies   :")
            int32_t* i_2 = *(r0_50 + 0x60)
            int32_t r0_61 = *(r0_50 + 0x64)
            
            if (r0_61 != i_2)
                if (r0_61 != i_2)
                    do
                        int32_t* r0_62 = *i_2
                        i_2 = &i_2[1]
                        printf("  %s", (*(*r0_62 + 0xc))())
                    while (i_2 != *(r0_50 + 0x64))
                
                putchar(0xa)
            else
                puts(" none")
            
            printf("    event      :")
            var_1bc_1 = r8
            var_1c0_1 = r9
            int32_t* r0_66 = *(*(arg1 + 0x20) + 0xa6c)
            
            if (r0_66 == 0)
                puts(" none")
            else
                printf("  %s\n", (*(*r0_66 + 0xc))())
            
            puts("    center row :")
            
            for (int32_t i_3 = 0; i_3 != 7; i_3 += 1)
                if (ascension::CWorld::GetCenterRowCardStackList(*(arg1 + 0x20)) != 0)
                    int32_t* r6_25 = *ascension::CWorld::GetCenterRowCardStackList(*(arg1 + 0x20))
                    
                    if (r6_25
                            != *(ascension::CWorld::GetCenterRowCardStackList(*(arg1 + 0x20)) + 4))
                        printf("        %s", (*(**r6_25 + 0xc))())
                        
                        if (&r6_25[2] !=
                                *(ascension::CWorld::GetCenterRowCardStackList(*(arg1 + 0x20)) + 4))
                            printf(" (%s", (*(*r6_25[2] + 0xc))())
                            void* r7_6 = &r6_25[4]
                            
                            if (r7_6 != *(
                                    ascension::CWorld::GetCenterRowCardStackList(*(arg1 + 0x20))
                                    + 4))
                                int32_t r0_89
                                
                                do
                                    int32_t* r0_85 = *r7_6
                                    r7_6 += 8
                                    printf(",%s", (*(*r0_85 + 0xc))())
                                    r0_89 = *(
                                        ascension::CWorld::GetCenterRowCardStackList(*(arg1 + 0x20))
                                        + 4)
                                while (r7_6 != r0_89)
                            
                            putchar(0x29)
                
                putchar(0xa)
            
            r9_1 = nullptr
            r7_2 = arg1 + 0x28
            r6_1 = *r7_2
            r8_1 = *(r7_2 - 4)
            goto label_17a8d0
    else
        if (*r2_2 == r8)
            goto label_17aab0
        
        var_1c8_1 = r6
        r7_2 = arg1 + 0x28
        r6_1 = *r7_2
        var_1c0_1 = r9
        var_1bc_1 = r8
        r8_1 = r2_2
        r9_1 = r2_2 + (r6_1 - 1) * 0xc4b0
        var_1c4_1 = r2_2
        *(r9_1 + 0x250) = 1
        int128_t entry_q0
        
        if (r6_1 u< 0x18)
        label_17a8d0:
            *r7_2 = r6_1 + 1
            void* r5_3 = r8_1 + r6_1 * 0xc4b0
            void* r2_9 = &r8_1[r6_1 * 0x312c]
            *r2_9 = var_1bc_1
            *(r2_9 + 4) = var_1c8_1
            int32_t r2_10
            
            if (r9_1 != 0)
                r2_10 = *(r9_1 + 0x220)
            else
                r2_10 = 0
            
            *(r5_3 + 0x224) = r2_10
            char* var_220 = r5_3 + 0xc
            int32_t r0_91 = ascension_ai::CMediumAI::BuildEvaluateOptionList(arg1, *(arg1 + 0x20), 
                var_1bc_1.w, r2_10 & 0xffff)
            *(r5_3 + 8) = r0_91
            
            if (r0_91 != 1)
                void* r0_96 = r8_1 + r6_1 * 0xc4b0
                r10 = arg_0
                *(r0_96 + 0x20c) = 0xffffffff
                *(r0_96 + 0x260) = 0
                *(r0_96 + 0x264) = 0xc9742400
                *(r0_96 + 0x388) = 0
                *(r0_96 + 0x38c) = 0xc95bba00
            label_17aa10:
                void* r5_5 = r8_1 + r6_1 * 0xc4b0
                *(arg1 + 0x20)
                *(r5_5 + 0x228) = core::CWorldBase::GetRollbackPosition()
                *(r5_5 + 0x24c) = 0
                *(r5_5 + 0x250) = 1
                *(r5_5 + 0x254) = 0
                *(r5_5 + 0x258) = 0
                *(r5_5 + 0x25c) = *(arg1 + 0x2c)
                int96_t q1
                
                if (var_1c4_1 == 0)
                    *(r5_5 + 0x210) = 0
                    *(r5_5 + 0x214) = 0
                    *(r5_5 + 0x218) = 0
                    *(r5_5 + 0x21c) = 0x40200000
                    r8 = var_1bc_1
                    r9 = var_1c0_1
                    r6 = var_1c8_1
                label_17aab0:
                    
                    if (ascension_ai::AIHandlerThread_StartEvaluation(arg1, r9, r6, r8) == 0)
                        CStateMachine const& var_1c0_2 = r9
                        clock_gettime(1, &var_130)
                        int32_t r2_14
                        int32_t r3_7
                        r3_7:r2_14 =
                            mulu.dp.d(0x3b9aca00, zx.d(var_130)) + (var_12c s>> 0x1f):var_12c
                        int32_t r0_109 = *(arg1 + 0x28)
                        int64_t var_218
                        int64_t var_210
                        int64_t var_208
                        int64_t var_200
                        int32_t var_1f8
                        
                        if (r0_109 s>= 1)
                            int128_t q4
                            q4:8.q = 0x3e112e0be826d695
                            int128_t q5
                            q5.q = 0x3f789374bc6a7efa
                            q4.d = 0x42c80000
                            int32_t r8_2 = 0
                            int32_t* r9_2 = *(arg1 + 0x24) + r0_109 * 0xc4b0 - 0xc4b0
                            
                            while (true)
                                r8_2 += 1
                                
                                if (r8_2 u% 0xc8 == 0)
                                    clock_gettime(1, &var_130)
                                    uint32_t r2_15 = zx.d(var_130)
                                    int32_t r0_117
                                    int32_t r1_53
                                    r1_53:r0_117 = mulu.dp.d(0x3b9aca00, r2_15)
                                        + (sbb.d(var_12c s>> 0x1f, r3_7, var_12c u< r2_14))
                                        :(var_12c - r2_14)
                                    __aeabi_ul2d(r0_117, r1_53, r2_15, 0x3b9aca00, var_220, 
                                        var_21c, var_218, var_210, var_208, var_200, var_1f8)
                                    unimplemented  {vmov d0, r0, r1}
                                    entry_q0.q = entry_q0.q f* q4:8.q
                                    unimplemented  {vcmpe.f64 d0, d10}
                                    unimplemented  {vmrs apsr_nzcv, fpscr}
                                    
                                    if (var_12c != r2_14 && var_12c - r2_14 s< 0
                                            == add_overflow(var_12c, neg.d(r2_14)))
                                        break
                                
                                if (zx.d(r9_2[0x94].b) != 0 || r9_2[0x8b] == 0)
                                    clock_gettime(1, &var_130)
                                    uint32_t r0_119 = zx.d(var_130)
                                    int32_t r1_55 = *(arg1 + 0x30)
                                    int32_t r0_122 = *(arg1 + 0x34)
                                    r9_2[0x8a]
                                    int32_t r6_26
                                    int32_t r7_8
                                    r7_8:r6_26 = *(arg1 + 0x38)
                                    core::CWorldBase::ProcessRollback(*(arg1 + 0x20))
                                    int32_t r0_126
                                    int32_t r1_58
                                    r0_126, r1_58 = __aeabi_ul2d(r6_26, r7_8)
                                    
                                    if (r9_2[0x8a] == 0 && (*(arg1 + 0x28) s> 1 || r9_2[2] u>= 2))
                                        ascension::CWorld::VerifyEqual(*(arg1 + 0x20))
                                    
                                    int32_t r3_10 = r9_2[0x83]
                                    bool cond:9_1 = r3_10 s<= 0
                                    int32_t r5_6
                                    
                                    if (r3_10 s< 0)
                                        r5_6 = 0
                                    else
                                        unimplemented  {vmov d0, r6, r7}
                                        int32_t r0_131 = *(arg1 + 0x28)
                                        int128_t q6
                                        q6.q = *(r9_2 + 0x218)
                                        q5:8.q = entry_q0.q f* q4:8.q
                                        entry_q0.q = *(arg1 + 0x48)
                                        
                                        if (r0_131 != 1)
                                            unimplemented  {vcmpe.f64 d11, d12}
                                            r5_6 = 0
                                            unimplemented  {vmrs apsr_nzcv, fpscr}
                                            
                                            if (r0_131 s> 1)
                                                r5_6 = 1
                                                *(arg1 + 0x40) = 1
                                        else
                                            *(arg1 + 0x48) = q5:8.q
                                            r5_6 = 0
                                        
                                        q6:8.q = q5:8.q f- entry_q0.q
                                        int32_t r7_11 = *(arg1 + 0x50)
                                        
                                        if (r7_11 != 0)
                                            int32_t r2_16 = *r9_2
                                            void* r6_30
                                            
                                            if (r2_16 == 0)
                                                r6_30 = &r9_2[2]
                                            else
                                                r9_2[3 + r3_10 * 2].b
                                                int16_t* r0_134 =
                                                    CGameStateOptions::GetOption(r2_16)
                                                int32_t r10_3 = r9_2[r9_2[0x83] * 2 + 4]
                                                CUserOption::DisplayOption(r0_134, &var_1b0)
                                                
                                                if ((zx.d(*r0_134) & 0xfff) != 0)
                                                    int32_t* r0_139 =
                                                        core::CWorldBase::GetInstanceByID(
                                                        *(arg1 + 0x20))
                                                    
                                                    if (r0_139 != 0)
                                                        strcpy(&var_130, &var_1b0)
                                                        sprintf(&var_1b0, &var_130, 
                                                            (*(*r0_139 + 0xc))(r0_139))
                                                
                                                int128_t entry_q7
                                                
                                                if (r10_3 == 0)
                                                    unimplemented  {vcvt.f32.f64 s0, d11}
                                                    r6_30 = &r9_2[2]
                                                    unimplemented  {vcvt.f32.f64 s2, d13}
                                                    unimplemented  {vcvt.f64.f32 d14, s0}
                                                    unimplemented  {vcvt.f64.f32 d15, s2}
                                                else
                                                    unimplemented  {vcvt.f32.f64 s0, d11}
                                                    r6_30 = &r9_2[2]
                                                    entry_q0:8.d = *(r6_30 + 0x24c)
                                                    unimplemented  {vcvt.f32.f64 s6, d13}
                                                    unimplemented  {vcvt.f64.f32 d14, s0}
                                                    entry_q0.d = entry_q0:8.d f* 100f
                                                    q1.d = *(r6_30 + 0x25c)
                                                    unimplemented  {vcvt.f64.f32 d15, s6}
                                                    var_218.d = zx.d(*r0_134)
                                                    var_218:4.d = r10_3
                                                    unimplemented  {vcvt.f64.f32 d2, s4}
                                                    unimplemented  {vcvt.f64.f32 d0, s0}
                                                    int64_t var_1f0_1 = entry_q0.q
                                                    sprintf(&var_130, 
                                                        "%d/%d: %s (%04x:%d:%08x) -> %f [%.04fs/%.04fs] "
                                                    " (%.1f%%)\n", 
                                                        *(r6_30 + 0x204) + 1, *r6_30, &var_1b0, 
                                                        zx.d(r0_134[1]), var_218, q1.q, 
                                                        entry_q7:8.q, entry_q7.q, 
                                                        *(arg1 + 0x2c) - *(r6_30 + 0x254))
                                                
                                                entry_q0.d = r9_2[0x95]
                                                entry_q0:8.d = r9_2[0x99]
                                                q1.d = entry_q0.d f* 100f
                                                unimplemented  {vcvt.f64.f32 d0, s2}
                                                uint32_t r12_2 = zx.d(*r0_134)
                                                uint32_t r1_68 = zx.d(r0_134[1])
                                                int32_t r7_13 = *(arg1 + 0x2c) - r9_2[0x97]
                                                unimplemented  {vcvt.f64.f32 d1, s4}
                                                char* str
                                                char* format_1
                                                
                                                if (r10_3 == 0)
                                                    int64_t var_1f0_3 = entry_q0:8.q
                                                    var_1f8 = r7_13
                                                    var_210 = entry_q0.q
                                                    var_208 = entry_q7:8.q
                                                    var_200 = entry_q7.q
                                                    var_220 = &var_1b0
                                                    var_21c = r1_68
                                                    var_218.d = r12_2
                                                    str = &var_130
                                                    format_1 = "%d/%d: %s (%04x:%d) -> %f [%.04fs/"
                                                    "] %d (%.1f%%)\n"
                                                else
                                                    int64_t var_1f0_2 = entry_q0:8.q
                                                    var_1f8 = r7_13
                                                    var_210 = entry_q0.q
                                                    var_208 = entry_q7:8.q
                                                    var_200 = entry_q7.q
                                                    var_220 = &var_1b0
                                                    var_21c = r1_68
                                                    var_218.d = r12_2
                                                    str = &var_130
                                                    var_218:4.d = r10_3
                                                    format_1 = "%d/%d: %s (%04x:%d:%08x) -> %f ["
                                                    "/%.04fs] %d (%.1f%%)\n"
                                                
                                                sprintf(str, format_1)
                                                r10 = arg_0
                                                r0_131 = *(arg1 + 0x28)
                                                r7_11 = *(arg1 + 0x50)
                                                r3_10 = r9_2[0x83]
                                            
                                            r7_11(r0_131, *r6_30, r3_10 + 1, &var_130, var_220, 
                                                var_21c, var_218, var_210, var_208, var_200, 
                                                var_1f8)
                                            r0_131 = *(arg1 + 0x28)
                                        
                                        cond:9_1 = r0_131 s<= 1
                                        
                                        if (r0_131 == 1)
                                            r9_2[r9_2[0x83] * 2 + 3].b
                                            int16_t* r0_148 = CGameStateOptions::GetOption(*r9_2)
                                            CUserOption::DisplayOption(r0_148, &var_130)
                                            
                                            if ((zx.d(*r0_148) & 0xfff) != 0)
                                                int32_t* r0_150 = core::CWorldBase::GetInstanceByID(
                                                    *(arg1 + 0x20))
                                                
                                                if (r0_150 != 0)
                                                    strcpy(&var_1b0, &var_130)
                                                    sprintf(&var_130, &var_1b0, 
                                                        (*(*r0_150 + 0xc))(r0_150))
                                            
                                            int32_t r0_156 = *(arg1 + 0x28)
                                            cond:9_1 = r0_156 s<= 2
                                            bool cond:15_1 = r0_156 s<= 2
                                            
                                            if (r0_156 s>= 2)
                                                int32_t r5_10 = 1
                                                int32_t r0_157
                                                
                                                do
                                                    printf("  ")
                                                    r0_157 = *(arg1 + 0x28)
                                                    r5_10 += 1
                                                    cond:9_1 = r5_10 s<= r0_157
                                                    cond:15_1 = r5_10 s<= r0_157
                                                while (r5_10 s< r0_157)
                                            
                                            unimplemented  {vcmpe.f64 d11, d12}
                                            unimplemented  {vmrs apsr_nzcv, fpscr}
                                            
                                            if (cond:15_1)
                                                var_1b0.b = 0
                                            else
                                                var_1b0 = 0x2d2d20
                                            
                                            entry_q0.d = r9_2[0x95]
                                            unimplemented  {vcvt.f32.f64 s2, d13}
                                            entry_q0.d = entry_q0.d f* 100f
                                            q1.d = r9_2[0x99]
                                            unimplemented  {vcvt.f64.f32 d1, s2}
                                            var_208:4.d = *(arg1 + 0x2c) - r9_2[0x97]
                                            var_208.d = &var_1b0
                                            var_220 = zx.d(r0_148[1])
                                            var_21c = zx.d(*r0_148)
                                            unimplemented  {vcvt.f64.f32 d2, s4}
                                            unimplemented  {vcvt.f64.f32 d0, s0}
                                            var_218 = q1.q
                                            var_210 = entry_q0:8.q
                                            var_200 = entry_q0.q
                                            printf(
                                                "%d/%d: %s (%04x:%d) -> %f [%.04fs%s] %d (%.04f%%)\n", 
                                                r9_2[0x83] + 1, r9_2[2], &var_130, var_220, 
                                                var_21c, var_218, var_210, var_208, var_200, 
                                                var_1f8)
                                    
                                    entry_q0.d = r9_2[0x99]
                                    entry_q0:8.d = r9_2[0xe3]
                                    unimplemented  {vcmpe.f32 s0, s2}
                                    unimplemented  {vmrs apsr_nzcv, fpscr}
                                    
                                    if (not(cond:9_1))
                                        int32_t r2_27 = r9_2[0x98]
                                        r9_2[0xe3] = entry_q0.d
                                        r9_2[0xe2] = r2_27
                                        __aeabi_memcpy8(&r9_2[0xe4], &r9_2[0x9a], r2_27 * 0xc)
                                    
                                    CStateMachine::ResetStateMachine()
                                    CState::DeleteState(r9_2[0x93])
                                    int32_t r0_162 = r9_2[2]
                                    int32_t r1_83 = r9_2[0x83] + 1
                                    r9_2[0x94].b = 0
                                    r9_2[0x93] = 0
                                    int32_t r2_30 = 0
                                    r9_2[0x83] = r1_83
                                    
                                    if (r1_83 s< r0_162)
                                        r2_30 = 1
                                    
                                    if ((not.d(r5_6) & r2_30) != 0)
                                        r9_2[0x88] = r9_2[0x89] | zx.d(*(&r9_2[3 + r1_83 * 2] + 2))
                                        int32_t r0_173 = *r9_2
                                        r9_2[0x97] = *(arg1 + 0x2c)
                                        uint32_t* r6_34 = zx.d(r9_2[3 + r1_83 * 2].b)
                                        int16_t* r0_174 = CGameStateOptions::GetOption(r0_173)
                                        int16_t r2_38 = *r0_174
                                        int16_t r0_175 = r0_174[1]
                                        *r10 = r9_2[r9_2[0x83] * 2 + 4]
                                        r9_2[0x9a].w = r6_34.w
                                        *(r9_2 + 0x26a) = r0_175
                                        r9_2[0x9b].w = r2_38
                                        r9_2[0x98] = 1
                                        r9_2[0x99] = 0xc9742400
                                        int32_t r10_4 = *r9_2
                                        r9_2[0x9c] = *r10
                                        var_1b0 = 0xc000
                                        var_130.d = &r9_2[0x12c]
                                        core::CWorldBase* r1_92 = r9_2[1]
                                        char** r2_39 = *(arg1 + 0x20)
                                        core::CWorldBase* r3_16 = *(r1_92 + 4)
                                        CStateMachine* r0_179
                                        
                                        if (r3_16 == 0)
                                            var_220 = &var_1b0
                                            r9_2[0x93] = CStateMachine::CloneStateMachine(
                                                &r9_2[0x8b], r1_92, r2_39, &var_130)
                                            int32_t r0_182 = var_130.d
                                            
                                            if (r0_182 u> &r9_2[0x312c])
                                                printf(
                                                    "cloneStateMachineBuffer overflow  %d > %d\n", 
                                                    r0_182 - &r9_2[0x12c], 0xc000)
                                            
                                            r0_179 = r9_2[0x8b]
                                        else
                                            var_220 = &var_1b0
                                            int32_t* r0_178 = CStateMachine::CloneStateMachine(
                                                &r9_2[0x8b], r3_16, r2_39, &var_130)
                                            r9_2[0x93] = r0_178
                                            r0_179 = (*(*r0_178 + 0x30))(r0_178, r10_4)
                                        
                                        r10 = arg_0
                                        CGameStateOptions::SelectOption(r0_179, &r9_2[0x8b], r6_34)
                                    else
                                        int32_t r1_84 = *(arg1 + 0x28)
                                        *(arg1 + 0x28) = r1_84 - 1
                                        
                                        if (r1_84 s>= 2)
                                            entry_q0.d = r0_162
                                            unimplemented  {vcvt.f32.u32 s0, s0}
                                            entry_q0:8.d = r9_2[0x96]
                                            entry_q0.d = entry_q0:8.d f/ entry_q0.d
                                            int32_t* r5_12 =
                                                *(arg1 + 0x24) + r1_84 * 0xc4b0 - 0x18700
                                            int32_t r0_164 = *r5_12
                                            entry_q0:8.d = *(r5_12 - 8)
                                            *(r5_12 - 0xc) = entry_q0.d
                                            entry_q0:8.d = entry_q0.d f+ entry_q0:8.d
                                            *(r5_12 - 8) = entry_q0:8.d
                                            r5_12[1] = r9_2[0xe3]
                                            __aeabi_memcpy4(r5_12 - 0x260 + r0_164 * 0xc + 0x268, 
                                                &r9_2[0xe4], r9_2[0xe2] * 0xc)
                                            int32_t r1_87 = r9_2[0xe2]
                                            r9_2 = r5_12 - 0x260
                                            *r5_12 += r1_87
                                            
                                            if (*(arg1 + 0x28) s< 1)
                                                break
                                            
                                            continue
                                        
                                        printf("END AI EVALUATION (%d end states)\n", 
                                            *(arg1 + 0x2c))
                                        int32_t r1_103
                                        int32_t r3_21
                                        r1_103:r3_21 = mulu.dp.d(0x3b9aca00, r0_119)
                                            + (var_12c s>> 0x1f):var_12c
                                        __aeabi_ul2d(r3_21 - r1_55, 
                                            sbb.d(r1_103, r0_122, r3_21 u< r1_55), r0_122)
                                        unimplemented  {vmov d0, r0, r1}
                                        void* r5_15 = *(arg1 + 0x24)
                                        q5.q = entry_q0.q f* q4:8.q
                                        
                                        if (*(r5_15 + 0x388) s>= 1)
                                            uint32_t r9_3 = zx.d(*(r5_15 + 0x390))
                                            char* r0_190 = CGameStateOptions::GetOption(r8)
                                            CUserOption::DisplayOption(r0_190, &var_130)
                                            
                                            if ((zx.d(*r0_190) & 0xfff) != 0)
                                                int32_t* r0_192 = core::CWorldBase::GetInstanceByID(
                                                    *(arg1 + 0x20))
                                                
                                                if (r0_192 != 0)
                                                    strcpy(&var_1b0, &var_130)
                                                    r10 = arg_0
                                                    sprintf(&var_130, &var_1b0, 
                                                        (*(*r0_192 + 0xc))(r0_192))
                                            
                                            uint32_t r1_112 = *(r5_15 + 0x398)
                                            *r10 = r1_112
                                            uint32_t r2_46 = zx.d(*r0_190)
                                            entry_q0.d = *(*(arg1 + 0x24) + 0x38c)
                                            unimplemented  {vcvt.f64.f32 d0, s0}
                                            char* format
                                            
                                            if (r1_112 == 0)
                                                int64_t var_218_2 = entry_q0.q
                                                format =
                                                    "  SELECTED OPTION %d: %s (%04x:%d) -> %f \n"
                                                var_220 = r2_46
                                            else
                                                int64_t var_218_1 = entry_q0.q
                                                format = "  SELECTED OPTION %d: %s (%04x:%d:%08x) -> %f \n"
                                                var_220 = r2_46
                                                var_21c = r1_112
                                            
                                            printf(format, r9_3, &var_130)
                                        
                                        int32_t r0_200
                                        int32_t r1_114
                                        r1_114:r0_200 = *(arg1 + 0x38)
                                        __aeabi_ul2d(r0_200, r1_114)
                                        unimplemented  {vmov d0, r0, r1}
                                        unimplemented  {vcvt.f32.f64 s4, d10}
                                        q4:8.q = entry_q0.q f* q4:8.q
                                        entry_q0.q = q4:8.q f/ q5.q
                                        unimplemented  {vcvt.f32.f64 s2, d9}
                                        unimplemented  {vcvt.f64.f32 d1, s2}
                                        unimplemented  {vmov r2, r3, d1}
                                        unimplemented  {vcvt.f32.f64 s0, d0}
                                        entry_q0.d = entry_q0.d f* 100f
                                        unimplemented  {vcvt.f64.f32 d1, s4}
                                        var_220.q = entry_q0:8.q
                                        unimplemented  {vcvt.f64.f32 d0, s0}
                                        var_218 = entry_q0.q
                                        printf("    TIME = %.04f / %.04f  (%.02f%%)\n")
                                        int32_t r0_201 = *(arg1 + 0x2c)
                                        int32_t r1_115 = data_1ecab8
                                        
                                        if (r0_201 u> r1_115)
                                            data_1ecab8 = r0_201
                                        
                                        entry_q0.q = data_1ecac0
                                        unimplemented  {vcmpe.f64 d9, d0}
                                        unimplemented  {vmrs apsr_nzcv, fpscr}
                                        
                                        if (r0_201 s> r1_115)
                                            unimplemented  {vmov.f64 q0, #3.125000e+00}
                                            data_1ecac0 = q4:8.q
                                        
                                        entry_q0:8.q = data_1ecac8
                                        unimplemented  {vcmpe.f64 d10, d1}
                                        unimplemented  {vmrs apsr_nzcv, fpscr}
                                        
                                        if (r0_201 s> r1_115)
                                            unimplemented  {vmov.f64 q0, #3.250000e+00}
                                            data_1ecac8 = q5.q
                                            data_1ecad0 = *(*(arg1 + 0x20) + 0x34)
                                        
                                        unimplemented  {vcvt.f32.f64 s0, d0}
                                        unimplemented  {vcvt.f64.f32 d0, s0}
                                        q1.q = data_1ecad8
                                        unimplemented  {vmov r2, r3, d0}
                                        unimplemented  {vcvt.f32.f64 s0, d1}
                                        q1.q = q5.q f+ q1.q
                                        data_1ecad8 = q1.q
                                        unimplemented  {vcvt.f64.f32 d0, s0}
                                        int32_t r7_17 = data_1ecae0
                                        
                                        if (zx.d(*(arg1 + 0x40)) != 0)
                                            r7_17 += 1
                                            data_1ecae0 = r7_17
                                        
                                        var_208.d = r7_17
                                        var_210 = q1.q
                                        var_218.d = data_1ecad0
                                        var_220.q = entry_q0.q
                                        printf("    MAX = %d end states   (%.04f / %.04f)  [0x%08x]  "
                                        "-->  %.04fs (-- %d)\n\n")
                                        break
                                
                                CStateMachine::Update()
                                int32_t r0_184 = *(arg1 + 0x28)
                                
                                if (r0_184 s< 1)
                                    break
                                
                                r9_2 = *(arg1 + 0x24) + r0_184 * 0xc4b0 - 0xc4b0
                                
                                if (r0_184 s< 1)
                                    break
                        
                        clock_gettime(1, &var_130)
                        int32_t r0_207
                        int32_t r2_50
                        r0_207:r2_50 = mulu.dp.d(0x3b9aca00, zx.d(var_130))
                            + (sbb.d(var_12c s>> 0x1f, r3_7, var_12c u< r2_14)):(var_12c - r2_14)
                        int32_t r6_37
                        int32_t r7_18
                        r7_18:r6_37 = *(arg1 + 0x38)
                        *(arg1 + 0x38) =
                            (adc.d(r0_207, r7_18, r2_50 + r6_37 u< r2_50)):(r2_50 + r6_37)
                        int32_t r0_208 = *(arg1 + 0x28)
                        
                        if (r0_208 s< 1)
                            core::CWorldBase::ProcessRollback(*(arg1 + 0x20))
                            ascension::CWorld::VerifyEqual(*(arg1 + 0x20))
                            int32_t r7_21 = *(arg1 + 0x50)
                            
                            if (r7_21 != 0)
                                r7_21(0, 0, 0, 0, var_220, var_21c, var_218, var_210, var_208, 
                                    var_200, var_1f8)
                            
                            void* r5_16 = *(arg1 + 0x24)
                            int32_t r7_22 = zx.d(*(r5_16 + 0x390))
                            int16_t* r0_212 = CGameStateOptions::GetOption(r8)
                            uint32_t r6_38 = *(r5_16 + 0x398)
                            *r10 = r6_38
                            int32_t r5_17 = *(arg1 + 0x10)
                            
                            if (r5_17 != 0)
                                r5_17(*(arg1 + 0x14), *(arg1 + 4), r7_22, zx.d(*r0_212), 
                                    zx.d(r0_212[1]), r6_38, var_218, var_210, var_208, var_200, 
                                    var_1f8)
                            
                            int32_t r0_215 = *(arg1 + 0x24)
                            
                            if (r0_215 != 0)
                                int32_t r1_125 = *(r0_215 - 4)
                                
                                if (r1_125 != 0)
                                    int32_t i_5 = r1_125 * 0xc4b0
                                    int32_t i_4
                                    
                                    do
                                        CStateMachine::~CStateMachine()
                                        i_4 = i_5
                                        i_5 -= 0xc4b0
                                    while (i_4 != 0xc4b0)
                                
                                operator delete[](r0_215 - 8)
                            
                            void (* r0_218)(void*, core::CStateChangeMessage const*, uint32_t) =
                                *(arg1 + 0x20)
                            *(arg1 + 0x24) = 0
                            *(r0_218 + 0x14) = 0
                            core::CWorldBase::AddStateChangeListener(r0_218, nullptr)
                            *(arg1 + 0xc) = 0
                            *(arg1 + 8) = 0
                        else
                            entry_q0.d = 0
                            
                            if (r0_208 s>= 0x14)
                                r0_208 = 0x14
                            
                            unimplemented  {vmov.f32 d2, #2.000000}
                            q1.d = 0x42c80000
                            int32_t* r1_120 = *(arg1 + 0x24) + 0x20c
                            int32_t r2_52 = 0
                            
                            do
                                unimplemented  {vmov.f32 d6, #2.000000}
                                int32_t r7_19 = *(r1_120 - 0x204)
                                
                                if (r7_19 s>= 1)
                                    q1:8.d = r7_19
                                    unimplemented  {vcvt.f32.s32 s6, s6}
                                    q1:8.d = q1.d f/ q1:8.d
                                
                                int32_t r7_20 = *r1_120
                                r1_120 = &r1_120[0x312c]
                                r2_52 += 1
                                
                                if (r7_20 s>= 0)
                                    q1.d = r7_20
                                    unimplemented  {vcvtge.f32.s32 s4, s4}
                                    unimplemented  {vmlage.f32 s2, s6, s4}
                                
                                unimplemented  {vmov.f32 d4, #2.375000}
                            while (r2_52 s< r0_208)
                            
                            *(arg1 + 0xc) = entry_q0:8.d
                else
                    entry_q0.q = *(r9_1 + 0x210)
                    
                    if (*r7_2 s< 9)
                        entry_q0:8.q = *(r9_1 + 0x218)
                        q1.d = *(r9_1 + 8)
                        void* r0_185 = r8_1 + r6_1 * 0xc4b0
                        entry_q0:8.q = entry_q0:8.q f- entry_q0.q
                        q1:8.d = *(r9_1 + 0x20c)
                        unimplemented  {vcvt.f64.u32 d2, s4}
                        entry_q0:8.q = entry_q0:8.q f/ q1.q
                        unimplemented  {vcvt.f64.s32 d2, s6}
                        unimplemented  {vmla.f64 d0, d1, d2}
                        *(r0_185 + 0x210) = entry_q0.q
                        entry_q0:8.q = entry_q0:8.q f+ entry_q0.q
                        *(r0_185 + 0x218) = entry_q0:8.q
                    else
                        void* r0_104 = r8_1 + r6_1 * 0xc4b0
                        *(r0_104 + 0x210) = entry_q0.q
                        entry_q0.q = *(r9_1 + 0x218)
                        *(r0_104 + 0x218) = entry_q0.q
            else
                void* r5_4 = r8_1 + r6_1 * 0xc4b0
                int32_t r2_1 = zx.d(*(r5_3 + 0xc))
                *arg_0 = *(r5_4 + 0x10)
                
                if (var_1c4_1 == 0)
                    *(r5_4 + 0x20c) = 0
                    *(r5_4 + 0x260) = 1
                    *(r5_4 + 0x264) = 0xbf800000
                    int16_t* r0_98 = CGameStateOptions::GetOption(var_1bc_1)
                    int16_t r1_43 = *r0_98
                    int16_t r0_99 = r0_98[1]
                    *(r5_4 + 0x390) = r2_1.w
                    *(r5_4 + 0x392) = r0_99
                    r10 = arg_0
                    *(r5_4 + 0x394) = r1_43
                    *(r5_4 + 0x388) = 1
                    *(r5_4 + 0x38c) = 0x3f800000
                    *(r5_4 + 0x398) = *r10
                    goto label_17aa10
                
                *(r9_1 + 0x250) = 0
                *r7_2 -= 1
        else
            unimplemented  {vmov.f32 s0, #1.000000}
            entry_q0:8.d = *(r9_1 + 0x258)
            *(r9_1 + 0x254) = 0x3f800000
            entry_q0.d = entry_q0:8.d f+ entry_q0.d
            *(r9_1 + 0x258) = entry_q0.d
            *(r9_1 + 0x264) = ascension_ai::CMediumAI::ScoreCurrentState(arg1)
            *(arg1 + 0x2c) += 1

if (*__stack_chk_guard == r0)
    unimplemented  {vpopeq {d8, d9, d10, d11, d12, d13, d14, d15}}
    int32_t var_44
    jump(var_44)

__stack_chk_fail()
noreturn
