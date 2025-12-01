// 函数: lua_tointegerx
// 地址: 0xbd470
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t* r3 = *(arg1 + 0x10)
void* const r0_1

if (arg2 s>= 1)
    r0_1 = &data_1d13d0
    void* r1 = *r3 + (arg2 << 4)
    
    if (r1 u< *(arg1 + 8))
        r0_1 = r1
else if (arg2 s>= 0xfff0b9d9)
    r0_1 = *(arg1 + 8) + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r2_3 = *r3
    
    if (r2_3[2] != 0x16)
        void* r2_4 = *r2_3
        r0_1 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r2_4 + 6)))
            r0_1 = r2_4 + ((0xfff0b9d8 - arg2) << 4)
    else
        r0_1 = &data_1d13d0
else
    r0_1 = *(arg1 + 0xc) + 0x28

int32_t r1_2 = *(r0_1 + 8)
int32_t result

if (r1_2 == 3)
label_bd50c:
    int32_t result_1 = (*r0_1).d
    
    if (arg3 != 0)
        r1_2 = 1
    
    unimplemented  {vcvt.s32.f64 s0, d0}
    
    if (arg3 != 0)
        *arg3 = r1_2
    
    result = result_1
else
    void var_30
    r0_1, r1_2 = sub_de69c(r0_1, &var_30)
    
    if (r0_1 != 0)
        goto label_bd50c
    
    result = 0
    
    if (arg3 != 0)
        *arg3 = 0

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
