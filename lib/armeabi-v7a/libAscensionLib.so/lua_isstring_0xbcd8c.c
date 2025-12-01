// 函数: lua_isstring
// 地址: 0xbcd8c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r2_3 = *(arg1 + 0x10)
int32_t result
void* r1

if (arg2 s>= 1)
    result = 0
    r1 = *r2_3 + (arg2 << 4)
    
    if (r1 u< *(arg1 + 8))
        goto label_bcdec
else if (arg2 s>= 0xfff0b9d9)
    r1 = *(arg1 + 8) + (arg2 << 4)
label_bcdec:
    
    if (r1 == &data_1d13d0)
        return 0
    
    result = 0
    
    if ((*(r1 + 8) & 0xf) - 3 u< 2)
        return 1
else
    if (arg2 == 0xfff0b9d8)
        r1 = *(arg1 + 0xc) + 0x28
        goto label_bcdec
    
    int32_t* r2_1 = *r2_3
    result = 0
    
    if (r2_1[2] != 0x16)
        void* r2_2 = *r2_1
        
        if (0xfff0b9d8 - arg2 s> zx.d(*(r2_2 + 6)))
            return 0
        
        r1 = r2_2 + ((0xfff0b9d8 - arg2) << 4)
        goto label_bcdec
return result
