// 函数: _ZN14CDelayAIPlayer8EvaluateEPN4core10CWorldBaseERK13CStateMachineP17CGameStateOptionsRj
// 地址: 0x18f4c0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r0_1 = *(arg1 + 0x24)
int32_t* arg_0

if (r0_1 s<= 0xffffffff)
    int32_t* r0_2 = *(arg1 + 0x20)
    r0_1 = (*(*r0_2 + 8))(r0_2, arg2, arg3, arg4, arg_0)
    *(arg1 + 0x24) = r0_1
    *(arg1 + 0x28) = *arg_0

void* r1_3 = *(arg1 + 0x20)
*(arg1 + 8) = *(r1_3 + 8)
*(arg1 + 0xc) = *(r1_3 + 0xc)
int32_t result

if (r0_1 s< 0 || zx.d(*(arg2 + 0xa14)) != 0)
    *arg_0 = *(arg1 + 0x28)
    result = *(arg1 + 0x24)
else
    char __tp
    clock_gettime(1, &__tp)
    int32_t var_2c
    int32_t r2_2
    int32_t r3_2
    r3_2:r2_2 = mulu.dp.d(0x3b9aca00, zx.d(__tp)) + (var_2c s>> 0x1f):var_2c
    int32_t r0_9 = *(arg1 + 0x30)
    int32_t result_1 = *(arg1 + 0x24)
    int32_t r5_2 = *(arg1 + 0x28)
    int32_t r0_11
    int32_t r1_9
    r0_11, r1_9 = __aeabi_ul2d(r2_2 - r0_9, sbb.d(r3_2, *(arg1 + 0x34), r2_2 u< r0_9))
    *arg_0 = r5_2
    result = 0xffffffff
    
    if (result_1 s>= 0)
        int32_t var_3c_1 = r0_11
        int32_t var_40_1 = r1_9
        
        if (result_1 s< CGameStateOptions::GetOptionCount())
            int16_t* r0_15 = CGameStateOptions::GetOption(arg4)
            
            if (zx.d(*(arg2 + 0x10)) == 0)
                int32_t result_2 = result_1
                int128_t q0
                q0.q = 0x3e112e0be826d695
                unimplemented  {vmov d1, r1, r2}
                uint32_t r1_13 = zx.d(r0_15[1])
                q0.q = q0:8.q f* 1.0000000000000001e-09
                void* const r3_3 = &data_1d4418
                
                if (r1_13 != 0xa001)
                    r3_3 = &data_1d4424
                
                q0:8.d = *(r3_3 + (data_1e4094 << 2))
                unimplemented  {vcvt.f64.f32 d1, s2}
                unimplemented  {vcmpe.f64 d0, d1}
                unimplemented  {vmrs apsr_nzcv, fpscr}
                
                if (r1_13 - 0xa001 s>= 0)
                    result_1 = result_2
                    int32_t* r2_5 = data_1f5894
                    
                    if (r2_5 != 0)
                        result_1 = result_2
                        
                        if (&r2_5[5] u< data_1f5898 + data_1f589c)
                            r2_5[1] = 0x15
                            *r2_5 = 0x14
                            data_1f5894 = &r2_5[5]
                            result_1 = result_2
                            data_1f5890 += 1
                            r2_5[3].w = r1_13.w
                            r2_5[2] = *(arg1 + 4)
                            *(r2_5 + 0xe) = *r0_15
                            r2_5[4] = *arg_0
                    
                    goto label_18f610
            else
            label_18f610:
                *(arg1 + 0x24) = 0xffffffff
                result = result_1
                *(arg1 + 0x28) = 0
                *(arg1 + 0x30) = r3_2:r2_2

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
