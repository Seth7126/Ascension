// 函数: lua_type
// 地址: 0xbcaf8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r2_3 = *(arg1 + 0x10)
void* r1

if (arg2 s>= 1)
    r1 = *r2_3 + (arg2 << 4)
    
    if (r1 u>= *(arg1 + 8))
        return 0xffffffff
else if (arg2 s>= 0xfff0b9d9)
    r1 = *(arg1 + 8) + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r2_1 = *r2_3
    
    if (r2_1[2] == 0x16)
        return 0xffffffff
    
    void* r2_2 = *r2_1
    
    if (0xfff0b9d8 - arg2 s> zx.d(*(r2_2 + 6)))
        return 0xffffffff
    
    r1 = r2_2 + ((0xfff0b9d8 - arg2) << 4)
else
    r1 = *(arg1 + 0xc) + 0x28

if (r1 == &data_1d13d0)
    return 0xffffffff

return *(r1 + 8) & 0xf
