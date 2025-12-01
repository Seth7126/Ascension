// 函数: lua_copy
// 地址: 0xbc868
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* lr_1 = *(arg1 + 0x10)
void* const r3

if (arg2 s>= 1)
    r3 = &data_1d13d0
    void* r1 = *lr_1 + (arg2 << 4)
    
    if (r1 u< *(arg1 + 8))
        r3 = r1
    
    if (arg3 s< 1)
        goto label_bc904
    
    goto label_bc8b4

if (arg2 s< 0xfff0b9d9)
    if (arg2 == 0xfff0b9d8)
        r3 = *(arg1 + 0xc) + 0x28
        
        if (arg3 s>= 1)
            goto label_bc8b4
        
        goto label_bc904
    
    int32_t* r3_4 = *lr_1
    
    if (r3_4[2] == 0x16)
        r3 = &data_1d13d0
        
        if (arg3 s>= 1)
            goto label_bc8b4
        
        goto label_bc904
    
    void* r4_5 = *r3_4
    r3 = &data_1d13d0
    
    if (0xfff0b9d8 - arg2 s<= zx.d(*(r4_5 + 6)))
        r3 = r4_5 + ((0xfff0b9d8 - arg2) << 4)
    
    if (arg3 s>= 1)
        goto label_bc8b4
    
    goto label_bc904

r3 = *(arg1 + 8) + (arg2 << 4)
void* const r1_1

if (arg3 s>= 1)
label_bc8b4:
    r1_1 = &data_1d13d0
    void* r5_3 = *lr_1 + (arg3 << 4)
    
    if (r5_3 u< *(arg1 + 8))
        r1_1 = r5_3
else
label_bc904:
    
    if (arg3 s>= 0xfff0b9d9)
        r1_1 = *(arg1 + 8) + (arg3 << 4)
    else if (arg3 != 0xfff0b9d8)
        int32_t* r1_11 = *lr_1
        
        if (r1_11[2] != 0x16)
            void* r4_6 = *r1_11
            r1_1 = &data_1d13d0
            
            if (0xfff0b9d8 - arg3 s<= zx.d(*(r4_6 + 6)))
                r1_1 = r4_6 + ((0xfff0b9d8 - arg3) << 4)
        else
            r1_1 = &data_1d13d0
    else
        r1_1 = *(arg1 + 0xc) + 0x28

int32_t r5_4 = *r3
*(r1_1 + 4) = *(r3 + 4)
*r1_1 = r5_4
*(r1_1 + 8) = *(r3 + 8)

if (arg3 s>= 0xfff0b9d8)
    return 

if ((zx.d(*(r3 + 8)) & 0x40) == 0)
    return 

void* r2 = *r3

if ((zx.d(*(r2 + 5)) & 3) == 0)
    return 

void* r1_9 = ***(arg1 + 0x10)

if ((zx.d(*(r1_9 + 5)) & 4) != 0)
    return sub_cade0(arg1, r1_9, r2) __tailcall
