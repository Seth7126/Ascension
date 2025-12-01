// 函数: lua_rawgeti
// 地址: 0xbe52c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r10
int32_t var_c = r10
int32_t* r3 = *(arg1 + 0x10)
void* const r0
void* r2

if (arg2 s< 1)
    r2 = 0xfff0b9d9
    
    if (arg2 s>= 0xfff0b9d9)
        r0 = *(arg1 + 8) + (arg2 << 4)
    else if (arg2 != 0xfff0b9d8)
        r3 = *r3
        r2 = r3[2]
        
        if (r2 != 0x16)
            r2 = *r3
            r3 = zx.d(*(r2 + 6))
            r0 = &data_1d13d0
            
            if (0xfff0b9d8 - arg2 s<= r3)
                r0 = r2 + ((0xfff0b9d8 - arg2) << 4)
        else
            r0 = &data_1d13d0
    else
        r0 = *(arg1 + 0xc) + 0x28
else
    r3 = *r3
    r2 = *(arg1 + 8)
    r0 = &data_1d13d0
    void* r1 = &r3[arg2 * 4]
    
    if (r1 u< r2)
        r0 = r1

int128_t q4
int32_t* r0_4 = sub_db664(*r0, arg3, r10, q4, r2, r3)
int32_t* r1_2 = *(arg1 + 8)
int32_t r3_1 = r0_4[1]
*r1_2 = *r0_4
r1_2[1] = r3_1
r1_2[2] = r0_4[2]
int32_t result = *(arg1 + 8) + 0x10
*(arg1 + 8) = result
return result
