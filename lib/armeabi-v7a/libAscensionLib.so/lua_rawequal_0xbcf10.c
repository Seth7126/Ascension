// 函数: lua_rawequal
// 地址: 0xbcf10
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r12 = *(arg1 + 0x10)
void* const r1

if (arg2 s>= 1)
    r1 = &data_1d13d0
    void* r3_1 = *r12 + (arg2 << 4)
    
    if (r3_1 u< *(arg1 + 8))
        r1 = r3_1
    
    if (arg3 s< 1)
        goto label_bcfb8
    
    goto label_bcf58

if (arg2 s< 0xfff0b9d9)
    if (arg2 == 0xfff0b9d8)
        r1 = *(arg1 + 0xc) + 0x28
        
        if (arg3 s>= 1)
            goto label_bcf58
        
        goto label_bcfb8
    
    int32_t* lr_2 = *r12
    
    if (lr_2[2] == 0x16)
        r1 = &data_1d13d0
        
        if (arg3 s>= 1)
            goto label_bcf58
        
        goto label_bcfb8
    
    void* r4_3 = *lr_2
    r1 = &data_1d13d0
    
    if (0xfff0b9d8 - arg2 s<= zx.d(*(r4_3 + 6)))
        r1 = r4_3 + ((0xfff0b9d8 - arg2) << 4)
    
    if (arg3 s>= 1)
        goto label_bcf58
    
    goto label_bcfb8

r1 = *(arg1 + 8) + (arg2 << 4)
int32_t* r3_2

if (arg3 s>= 1)
label_bcf58:
    r3_2 = &data_1d13d0
    int32_t* r2 = *r12 + (arg3 << 4)
    
    if (r2 u< *(arg1 + 8))
        r3_2 = r2
    
    goto label_bcfe8

label_bcfb8:

if (arg3 s>= 0xfff0b9d9)
    r3_2 = *(arg1 + 8) + (arg3 << 4)
label_bcfe8:
    
    if (r1 != &data_1d13d0 && r3_2 != &data_1d13d0 && *(r1 + 8) == r3_2[2])
        uint32_t result = sub_df0d4(nullptr, r1, r3_2)
        
        if (result != 0)
            return 1
        
        return result
else
    if (arg3 == 0xfff0b9d8)
        r3_2 = *(arg1 + 0xc) + 0x28
        goto label_bcfe8
    
    int32_t* r12_1 = *r12
    
    if (r12_1[2] != 0x16)
        void* r2_3 = *r12_1
        r3_2 = &data_1d13d0
        
        if (0xfff0b9d8 - arg3 s<= zx.d(*(r2_3 + 6)))
            r3_2 = r2_3 + ((0xfff0b9d8 - arg3) << 4)
        
        goto label_bcfe8

return 0
