// 函数: lua_rawgetp
// 地址: 0xbe610
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r10
int32_t var_c = r10
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
    int32_t* r3_3 = *r3
    
    if (r3_3[2] != 0x16)
        void* r3_4 = *r3_3
        r0_1 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r3_4 + 6)))
            r0_1 = r3_4 + ((0xfff0b9d8 - arg2) << 4)
    else
        r0_1 = &data_1d13d0
else
    r0_1 = *(arg1 + 0xc) + 0x28

int32_t var_28 = 2
int32_t var_30 = arg3
int128_t q4
int32_t* r0_5 = sub_db788(*r0_1, &var_30, r10, q4)
int32_t* r1_2 = *(arg1 + 8)
int32_t r3_2 = r0_5[1]
*r1_2 = *r0_5
r1_2[1] = r3_2
r1_2[2] = r0_5[2]
*(arg1 + 8) += 0x10
int32_t r0_9 = *__stack_chk_guard

if (r0_9 == r0)
    return r0_9 - r0

__stack_chk_fail()
noreturn
