// 函数: lua_compare
// 地址: 0xbd15c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* lr_1 = arg1[4]
int32_t* r1

if (arg2 s>= 1)
    r1 = &data_1d13d0
    int32_t* r4_2 = *lr_1 + (arg2 << 4)
    
    if (r4_2 u< arg1[2])
        r1 = r4_2
    
    if (arg3 s< 1)
        goto label_bd204
    
    goto label_bd1a4

if (arg2 s< 0xfff0b9d9)
    if (arg2 == 0xfff0b9d8)
        r1 = arg1[3] + 0x28
        
        if (arg3 s>= 1)
            goto label_bd1a4
        
        goto label_bd204
    
    int32_t* r4_4 = *lr_1
    
    if (r4_4[2] == 0x16)
        r1 = &data_1d13d0
        
        if (arg3 s>= 1)
            goto label_bd1a4
        
        goto label_bd204
    
    void* r4_7 = *r4_4
    r1 = &data_1d13d0
    
    if (0xfff0b9d8 - arg2 s<= zx.d(*(r4_7 + 6)))
        r1 = r4_7 + ((0xfff0b9d8 - arg2) << 4)
    
    if (arg3 s>= 1)
        goto label_bd1a4
    
    goto label_bd204

r1 = arg1[2] + (arg2 << 4)
void* const r12_1

if (arg3 s>= 1)
label_bd1a4:
    r12_1 = &data_1d13d0
    void* r2 = *lr_1 + (arg3 << 4)
    
    if (r2 u< arg1[2])
        r12_1 = r2
    
    goto label_bd28c

label_bd204:

if (arg3 s>= 0xfff0b9d9)
    r12_1 = arg1[2] + (arg3 << 4)
label_bd28c:
    
    if (r1 != &data_1d13d0 && r12_1 != &data_1d13d0)
        if (arg4 == 2)
            return sub_ded90(arg1, r1, r12_1) __tailcall
        
        if (arg4 == 1)
            return sub_deb7c(arg1, r1, r12_1) __tailcall
        
        if (arg4 == 0 && r1[2] == *(r12_1 + 8))
            uint32_t result = sub_df0d4(arg1, r1, r12_1)
            
            if (result != 0)
                return 1
            
            return result
else
    if (arg3 == 0xfff0b9d8)
        r12_1 = arg1[3] + 0x28
        goto label_bd28c
    
    int32_t* r4_5 = *lr_1
    
    if (r4_5[2] != 0x16)
        void* r5_6 = *r4_5
        r12_1 = &data_1d13d0
        
        if (0xfff0b9d8 - arg3 s<= zx.d(*(r5_6 + 6)))
            r12_1 = r5_6 + ((0xfff0b9d8 - arg3) << 4)
        
        goto label_bd28c

return 0
