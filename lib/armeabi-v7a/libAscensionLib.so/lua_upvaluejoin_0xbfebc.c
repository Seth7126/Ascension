// 函数: lua_upvaluejoin
// 地址: 0xbfebc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* lr_1 = *(arg1 + 0x10)
void* const r4

if (arg2 s>= 1)
    r4 = &data_1d13d0
    void* r1 = *lr_1 + (arg2 << 4)
    
    if (r1 u< *(arg1 + 8))
        r4 = r1
else if (arg2 s>= 0xfff0b9d9)
    r4 = *(arg1 + 8) + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r5_3 = *lr_1
    
    if (r5_3[2] != 0x16)
        void* r5_5 = *r5_3
        r4 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r5_5 + 6)))
            r4 = r5_5 + ((0xfff0b9d8 - arg2) << 4)
    else
        r4 = &data_1d13d0
else
    r4 = *(arg1 + 0xc) + 0x28

void* r1_2 = *r4
void* const r4_2

if (arg4 s>= 1)
    r4_2 = &data_1d13d0
    void* r3 = *lr_1 + (arg4 << 4)
    
    if (r3 u< *(arg1 + 8))
        r4_2 = r3
else if (arg4 s>= 0xfff0b9d9)
    r4_2 = *(arg1 + 8) + (arg4 << 4)
else if (arg4 != 0xfff0b9d8)
    int32_t* r5_4 = *lr_1
    
    if (r5_4[2] != 0x16)
        void* r6_8 = *r5_4
        r4_2 = &data_1d13d0
        
        if (0xfff0b9d8 - arg4 s<= zx.d(*(r6_8 + 6)))
            r4_2 = r6_8 + ((0xfff0b9d8 - arg4) << 4)
    else
        r4_2 = &data_1d13d0
else
    r4_2 = *(arg1 + 0xc) + 0x28

void* r3_3 = *r4_2 + (arg5 << 2)
*(r1_2 + (arg3 << 2) + 0xc) = *(r3_3 + 0xc)
void* r2_2 = *(r3_3 + 0xc)

if ((zx.d(*(r2_2 + 5)) & 3) != 0 && (zx.d(*(r1_2 + 5)) & 4) != 0)
    return sub_cade0(arg1, r1_2, r2_2) __tailcall
