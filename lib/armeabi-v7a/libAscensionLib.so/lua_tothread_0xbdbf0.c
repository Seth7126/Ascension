// 函数: lua_tothread
// 地址: 0xbdbf0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r3_2 = *(arg1 + 0x10)
void* const r2

if (arg2 s>= 1)
    r2 = &data_1d13d0
    void* r1 = *r3_2 + (arg2 << 4)
    
    if (r1 u< *(arg1 + 8))
        r2 = r1
else if (arg2 s>= 0xfff0b9d9)
    r2 = *(arg1 + 8) + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r0_4 = *r3_2
    
    if (r0_4[2] != 0x16)
        void* r0_5 = *r0_4
        r2 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r0_5 + 6)))
            r2 = r0_5 + ((0xfff0b9d8 - arg2) << 4)
    else
        r2 = &data_1d13d0
else
    r2 = *(arg1 + 0xc) + 0x28

if (*(r2 + 8) == 0x48)
    return *r2

return 0
