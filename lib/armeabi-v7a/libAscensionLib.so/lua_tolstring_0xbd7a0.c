// 函数: lua_tolstring
// 地址: 0xbd7a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = arg1[4]
void* const r1

if (arg2 s>= 1)
    r1 = &data_1d13d0
    void* r0_2 = *r0 + (arg2 << 4)
    
    if (r0_2 u< arg1[2])
        r1 = r0_2
else if (arg2 s>= 0xfff0b9d9)
    r1 = arg1[2] + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r0_17 = *r0
    
    if (r0_17[2] != 0x16)
        void* r0_19 = *r0_17
        r1 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r0_19 + 6)))
            r1 = r0_19 + ((0xfff0b9d8 - arg2) << 4)
    else
        r1 = &data_1d13d0
else
    r1 = arg1[3] + 0x28

if ((*(r1 + 8) & 0xf) != 4)
    if (sub_de72c(arg1, r1) == 0)
        if (arg3 == 0)
            return 0
        
        *arg3 = 0
        return 0
    
    if (*(arg1[3] + 0xc) s>= 1)
        sub_cc158(arg1)
    
    int32_t* r0_12 = arg1[4]
    
    if (arg2 s>= 1)
        r1 = &data_1d13d0
        void* r0_14 = *r0_12 + (arg2 << 4)
        
        if (r0_14 u< arg1[2])
            r1 = r0_14
    else if (arg2 s>= 0xfff0b9d9)
        r1 = arg1[2] + (arg2 << 4)
    else if (arg2 != 0xfff0b9d8)
        int32_t* r0_20 = *r0_12
        
        if (r0_20[2] != 0x16)
            void* r0_21 = *r0_20
            r1 = &data_1d13d0
            
            if (0xfff0b9d8 - arg2 s<= zx.d(*(r0_21 + 6)))
                r1 = r0_21 + ((0xfff0b9d8 - arg2) << 4)
        else
            r1 = &data_1d13d0
    else
        r1 = arg1[3] + 0x28

if (arg3 != 0)
    *arg3 = *(*r1 + 0xc)

return *r1 + 0x10
