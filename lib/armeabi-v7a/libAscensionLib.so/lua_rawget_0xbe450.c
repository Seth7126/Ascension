// 函数: lua_rawget
// 地址: 0xbe450
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r10
int32_t var_c = r10
int32_t* r2 = *(arg1 + 0x10)
void* r0
uint32_t r3

if (arg2 s< 1)
    r3 = 0xfff0b9d9
    
    if (arg2 s>= 0xfff0b9d9)
        r0 = *(arg1 + 8) + (arg2 << 4)
    else if (arg2 != 0xfff0b9d8)
        r2 = *r2
        r3 = r2[2]
        
        if (r3 != 0x16)
            r2 = *r2
            r3 = zx.d(*(r2 + 6))
            r0 = &data_1d13d0
            
            if (0xfff0b9d8 - arg2 s<= r3)
                r0 = &r2[(0xfff0b9d8 - arg2) * 4]
        else
            r0 = &data_1d13d0
    else
        r0 = *(arg1 + 0xc) + 0x28
else
    r2 = *r2
    r3 = *(arg1 + 8)
    r0 = &data_1d13d0
    void* r1 = &r2[arg2 * 4]
    
    if (r1 u< r3)
        r0 = r1

int128_t q4
int32_t* r0_4 = sub_db788(*r0, *(arg1 + 8) - 0x10, r10, q4, r2, r3)
int32_t r1_3 = *(arg1 + 8)
int32_t r2_1 = *r0_4
*(r1_3 - 0xc) = r0_4[1]
*(r1_3 - 0x10) = r2_1
int32_t result = r0_4[2]
*(r1_3 - 8) = result
return result
