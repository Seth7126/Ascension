// 函数: _ZN12ascension_ai7CEasyAI8EvaluateEPN4core10CWorldBaseERK13CStateMachineP17CGameStateOptionsRj
// 地址: 0x1766d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r7

if (arg2 == 0)
    r7 = 0
else
    r7 = __dynamic_cast(arg2, _typeinfo_for_core::CWorldBase, _typeinfo_for_ascension::CWorld, 0)

*(arg1 + 4)
void* r0_4 = ascension::CWorld::GetPlayerByIndex(r7)
int32_t r6 = *(arg1 + 0x18)
int32_t var_62c[0x80]
int32_t var_42c[0x9]
int32_t var_22c[0x79]
int32_t* arg_0
int32_t r0_6

if (r6 != 0)
    r0_6 = r6(*(arg1 + 0x1c), *(arg1 + 4), &var_22c, &var_42c, &var_62c, arg_0)

int32_t result

if (r6 == 0 || r0_6 == 0)
    result = 0
    *arg_0 = 0
    int32_t r0_8 = CGameStateOptions::GetOptionCount()
    int32_t* r4_1
    
    if (r0_8 != 1)
        if (r0_8 s>= 1)
            int32_t var_c30_1 = 0
            int32_t r5_2 = 0
            int32_t var_c38_1 = 0
            int32_t r7_1 = 0
            int32_t r6_2 = 0
            int32_t r9_2 = 0
            int32_t var_c34_1 = 0
            int32_t var_c2c[0x80]
            int32_t var_a2c[0x79]
            int32_t var_82c[0x80]
            
            do
                void* r0_13 = CGameStateOptions::GetOption(arg4)
                
                if (r0_13 != 0)
                    switch (zx.d(*(r0_13 + 2)) - 0xa001)
                        case 0, 0x14
                            nop
                        case 0x10
                            var_22c[r5_2] = r9_2
                            r5_2 += 1
                        case 0x1f, 0x2c, 0x2d, 0x2e
                            var_a2c[r6_2] = r9_2
                            r6_2 += 1
                        case 0x3f, 0x41, 0x44, 0x45
                            var_62c[r7_1] = r9_2
                            r7_1 += 1
                        case 0x40
                            var_82c[var_c38_1] = r9_2
                            var_c38_1 += 1
                        case 0x6f, 0x71
                            var_42c[var_c30_1] = r9_2
                            var_c30_1 += 1
                        default
                            var_c2c[var_c34_1] = r9_2
                            var_c34_1 += 1
                
                r9_2 += 1
            while (r0_8 != r9_2)
            
            if (r5_2 s> 0)
                int32_t* r0_17 = *(arg1 + 0x20)
                result = var_22c[(*(*r0_17 + 0xc))(r0_17, r5_2)]
            else if (var_c30_1 s>= 1)
                result = var_42c[(*(**(arg1 + 0x20) + 0xc))()]
            else if (var_c34_1 s>= 1)
                result = var_c2c[0].36[(*(**(arg1 + 0x20) + 0xc))()]
            else if (r7_1 s>= 1)
                int32_t* r0_34 = *(arg1 + 0x20)
                result = var_62c[0].36[(*(*r0_34 + 0xc))(r0_34, r7_1)]
            else if (var_c38_1 s>= 1)
                result = var_82c[0].36[(*(**(arg1 + 0x20) + 0xc))()]
            else if (r6_2 s< 1)
                result = 0
            else
                int32_t* r0_36 = *(arg1 + 0x20)
                result = var_a2c[0].36[(*(*r0_36 + 0xc))(r0_36, r6_2)]
        
        int16_t* r0_38 = CGameStateOptions::GetOption(arg4)
        
        if (zx.d(r0_38[1]) != 0xa0d3)
            r4_1 = arg_0
        else
            r4_1 = arg_0
            *r4_1 = zx.d(*r0_38)
    else
        result = 0
        r4_1 = arg_0
        
        if (zx.d(*(CGameStateOptions::GetOption(arg4) + 2)) == 0xa0c0)
            void* r3_1 = *(r0_4 + 0xac)
            int32_t r12_1 = *(r3_1 + 0x14)
            int32_t r4_2 = *(r3_1 + 0x18)
            int32_t r5_1 = *(r3_1 + 0x1c)
            int32_t r9_1
            int32_t lr_1
            
            if (r12_1 s>= 1)
                int32_t r2_2 = *(r7 + 0xb40)
                int32_t r1_4 = r12_1 - r2_2
                
                if (r12_1 s<= r2_2)
                    r1_4 = 0
                else
                    r12_1 = r2_2
                
                if ((zx.d(*(r3_1 + 0x24)) & 2) != 0)
                    int32_t r6_3 = *(r7 + 0xb48)
                    r9_1 = r1_4 - r6_3
                    
                    if (r1_4 s> r6_3)
                        r1_4 = r6_3
                    else
                        r9_1 = 0
                    
                    lr_1 = r1_4
                else
                    lr_1 = 0
                    r9_1 = r1_4
                
                if ((zx.d(*(r3_1 + 0x28)) & 2) == 0)
                    r9_1 = 0
                    
                    if (r4_2 s>= 1)
                        goto label_176b84
                    
                    goto label_176bd4
                
                int32_t r1_16 = *(r0_4 + 0x8c)
                
                if (r1_16 s< r9_1)
                    r9_1 = r1_16
                
                if (r4_2 s< 1)
                    goto label_176bd4
                
                goto label_176b84
            
            r9_1 = 0
            lr_1 = 0
            r12_1 = 0
            
            if (r4_2 s< 1)
                goto label_176bd4
            
        label_176b84:
            int32_t r2_7 = *(r7 + 0xb48)
            int32_t r6_4 = 0
            int32_t r1_17 = r4_2 - r2_7
            
            if (r4_2 s<= r2_7)
                r1_17 = 0
            else
                r4_2 = r2_7
            
            if ((zx.d(*(r3_1 + 0x20)) & 4) != 0)
                int32_t r0_22 = *(r7 + 0xb40)
                int32_t r2_8 = r1_17 - r0_22
                bool cond:3_1 = r1_17 s> r0_22
                
                if (r1_17 s> r0_22)
                    r1_17 = r0_22
                
                r12_1 += r1_17
                
                if (cond:3_1)
                    r6_4 = r2_8
            else
                r6_4 = r1_17
            
            lr_1 += r4_2
            
            if ((zx.d(*(r3_1 + 0x28)) & 4) != 0)
                int32_t r0_24 = *(r0_4 + 0x8c)
                r4_2 = r6_4 - r0_24
                bool cond:4_1 = r6_4 s<= r0_24
                
                if (r6_4 s> r0_24)
                    r6_4 = r0_24
                
                r9_1 += r6_4
                
                if (cond:4_1)
                    r4_2 = 0
                
                if (r5_1 s>= 1)
                    goto label_176c04
            else
                r4_2 = r6_4
            label_176bd4:
                
                if (r5_1 s>= 1)
                label_176c04:
                    
                    if ((zx.d(*(r3_1 + 0x24)) & 8) != 0)
                        int32_t r0_26 = *(r7 + 0xb48)
                        
                        if (r0_26 s< r5_1)
                            r5_1 = r0_26
                        
                        lr_1 += r5_1
                    
                    int32_t r3_2
                    
                    if ((zx.d(*(r3_1 + 0x20)) & 8) != 0)
                        int32_t r0_28 = *(r7 + 0xb40)
                        r3_2 = r4_2 - r0_28
                        bool cond:5_1 = r4_2 s<= r0_28
                        
                        if (r4_2 s> r0_28)
                            r4_2 = r0_28
                        
                        r12_1 += r4_2
                        
                        if (cond:5_1)
                            r3_2 = 0
                    else
                        r3_2 = r4_2
                    
                    int32_t r0_29 = *(r0_4 + 0x8c)
                    
                    if (r0_29 s< r3_2)
                        r3_2 = r0_29
                    
                    r9_1 += r3_2
            
            r4_1 = arg_0
            result = 0
            *r4_1 = lr_1 << 8 | r9_1 << 0x10 | r12_1
    
    if (*(arg1 + 0x10) != 0)
        int16_t* r0_42 = CGameStateOptions::GetOption(arg4)
        (*(arg1 + 0x10))(*(arg1 + 0x14), *(arg1 + 4), result, zx.d(*r0_42), zx.d(r0_42[1]), *r4_1)
else
    result = var_22c[0]

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
