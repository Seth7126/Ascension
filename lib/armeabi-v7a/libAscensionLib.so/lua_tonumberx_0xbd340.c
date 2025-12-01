// 函数: lua_tonumberx
// 地址: 0xbd340
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
    int32_t* r2_2 = *r3
    
    if (r2_2[2] != 0x16)
        void* r2_3 = *r2_2
        r0_1 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r2_3 + 6)))
            r0_1 = r2_3 + ((0xfff0b9d8 - arg2) << 4)
    else
        r0_1 = &data_1d13d0
else
    r0_1 = *(arg1 + 0xc) + 0x28

int128_t q0

if (*(r0_1 + 8) == 3)
label_bd3e0:
    
    if (arg3 != 0)
        *arg3 = 1
    
    q0.q = *r0_1
else
    void var_30
    r0_1, q0 = sub_de69c(r0_1, &var_30)
    
    if (r0_1 != 0)
        goto label_bd3e0
    
    q0.q = 0
    
    if (arg3 != 0)
        *arg3 = 0
int32_t r0_4 = *__stack_chk_guard

if (r0_4 == r0)
    unimplemented  {vmoveq r0, r1, d0}
    return r0_4 - r0

__stack_chk_fail()
noreturn
