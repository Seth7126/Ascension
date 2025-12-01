// 函数: lua_pcallk
// 地址: 0xbf290
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = *__stack_chk_guard
void* r2_2

if (arg4 == 0)
    r2_2 = nullptr
else
    int32_t* r5_1 = arg1[4]
    void* const r2_1
    
    if (arg4 s>= 1)
        r2_1 = &data_1d13d0
        void* r3 = *r5_1 + (arg4 << 4)
        
        if (r3 u< arg1[2])
            r2_1 = r3
    else if (arg4 s>= 0xfff0b9d9)
        r2_1 = arg1[2] + (arg4 << 4)
    else if (arg4 != 0xfff0b9d8)
        int32_t* r5_4 = *r5_1
        
        if (r5_4[2] != 0x16)
            void* r7_3 = *r5_4
            r2_1 = &data_1d13d0
            
            if (0xfff0b9d8 - arg4 s<= zx.d(*(r7_3 + 6)))
                r2_1 = r7_3 + ((0xfff0b9d8 - arg4) << 4)
        else
            r2_1 = &data_1d13d0
    else
        r2_1 = arg1[3] + 0x28
    
    r2_2 = r2_1 - arg1[7]

int32_t* r1_1 = arg1[2] + (not.d(arg2) << 4)
int32_t* var_2c = r1_1
int32_t result

if (arg6 == 0 || zx.d(arg1[9].w) != 0)
    int32_t var_28_1 = arg3
    result = sub_c9e5c(arg1, sub_bf46c, &var_2c, r1_1 - arg1[7], r2_2)
    
    if (arg3 == 0xffffffff)
    label_bf380:
        void* r2_6 = arg1[4]
        int32_t r1_2 = arg1[2]
        
        if (*(r2_6 + 4) u< r1_2)
            *(r2_6 + 4) = r1_2
else
    void* r5_3 = arg1[4]
    *(r5_3 + 0x18) = arg5
    *(r5_3 + 0x1c) = arg6
    *(r5_3 + 0x14) = r1_1 - arg1[7]
    *(r5_3 + 0x24) = *(arg1 + 0x29)
    *(r5_3 + 0x20) = arg1[0x11]
    arg1[0x11] = r2_2
    *(r5_3 + 0x12) |= 0x10
    sub_c9774(arg1, r1_1, arg3, 1, __stack_chk_guard)
    int32_t r1_5 = *(r5_3 + 0x20)
    *(r5_3 + 0x12) &= 0xef
    result = 0
    arg1[0x11] = r1_5
    
    if (arg3 == 0xffffffff)
        goto label_bf380

if (*__stack_chk_guard == r2)
    return result

__stack_chk_fail()
noreturn
