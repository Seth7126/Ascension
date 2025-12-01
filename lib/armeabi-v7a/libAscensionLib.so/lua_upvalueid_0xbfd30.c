// 函数: lua_upvalueid
// 地址: 0xbfd30
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r12 = *(arg1 + 0x10)
void* const lr

if (arg2 s>= 1)
    lr = &data_1d13d0
    void* r3_2 = *r12 + (arg2 << 4)
    
    if (r3_2 u< *(arg1 + 8))
        lr = r3_2
else if (arg2 s>= 0xfff0b9d9)
    lr = *(arg1 + 8) + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* lr_2 = *r12
    
    if (lr_2[2] != 0x16)
        void* r4_3 = *lr_2
        lr = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r4_3 + 6)))
            lr = r4_3 + ((0xfff0b9d8 - arg2) << 4)
    else
        lr = &data_1d13d0
else
    lr = *(arg1 + 0xc) + 0x28

int32_t r3_6 = *(lr + 8) & 0x3f

if (r3_6 == 0x26)
    return *lr + (arg3 << 4)

if (r3_6 != 6)
    return 0

void* const r3_7

if (arg2 s>= 1)
    r3_7 = &data_1d13d0
    void* r1 = *r12 + (arg2 << 4)
    
    if (r1 u< *(arg1 + 8))
        r3_7 = r1
else if (arg2 s>= 0xfff0b9d9)
    r3_7 = *(arg1 + 8) + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r0_5 = *r12
    
    if (r0_5[2] != 0x16)
        void* r0_6 = *r0_5
        r3_7 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r0_6 + 6)))
            r3_7 = r0_6 + ((0xfff0b9d8 - arg2) << 4)
    else
        r3_7 = &data_1d13d0
else
    r3_7 = *(arg1 + 0xc) + 0x28

return *(*r3_7 + (arg3 << 2) + 0xc)
