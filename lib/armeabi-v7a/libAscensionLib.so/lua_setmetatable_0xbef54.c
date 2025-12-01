// 函数: lua_setmetatable
// 地址: 0xbef54
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* const var_14 = arg3
int32_t* r0 = *(arg1 + 0x10)
void* const r6

if (arg2 s>= 1)
    r6 = &data_1d13d0
    void* r0_2 = *r0 + (arg2 << 4)
    
    if (r0_2 u< *(arg1 + 8))
        r6 = r0_2
else if (arg2 s>= 0xfff0b9d9)
    r6 = *(arg1 + 8) + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r0_20 = *r0
    
    if (r0_20[2] != 0x16)
        void* r0_22 = *r0_20
        r6 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r0_22 + 6)))
            r6 = r0_22 + ((0xfff0b9d8 - arg2) << 4)
    else
        r6 = &data_1d13d0
else
    r6 = *(arg1 + 0xc) + 0x28

int32_t r0_5 = *(arg1 + 8)
int32_t r1 = *(r0_5 - 8)

if (r1 != 0)
    arg3 = *(r0_5 - 0x10)

if (r1 == 0)
    arg3 = nullptr

int32_t r0_7 = *(r6 + 8) & 0xf

if (r0_7 == 7)
    *(*r6 + 8) = arg3
    
    if (arg3 != 0)
        if ((zx.d(*(arg3 + 5)) & 3) != 0)
            void* r1_2 = *r6
            
            if ((zx.d(*(r1_2 + 5)) & 4) != 0)
                sub_cade0(arg1, r1_2, arg3)
        
        sub_cb110(arg1, *r6, arg3)
else if (r0_7 != 5)
    *(*(arg1 + 0xc) + (r0_7 << 2) + 0xfc) = arg3
else
    *(*r6 + 8) = arg3
    
    if (arg3 != 0)
        if ((zx.d(*(arg3 + 5)) & 3) != 0)
            void* r1_1 = *r6
            
            if ((zx.d(*(r1_1 + 5)) & 4) != 0)
                sub_cafb8(arg1, r1_1)
        
        sub_cb110(arg1, *r6, arg3)

*(arg1 + 8) -= 0x10
return 1
