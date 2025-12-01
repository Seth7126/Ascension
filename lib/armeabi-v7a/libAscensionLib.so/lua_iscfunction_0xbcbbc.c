// 函数: lua_iscfunction
// 地址: 0xbcbbc
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
    int32_t* r0_8 = *r3_2
    
    if (r0_8[2] != 0x16)
        void* r0_9 = *r0_8
        r2 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r0_9 + 6)))
            r2 = r0_9 + ((0xfff0b9d8 - arg2) << 4)
    else
        r2 = &data_1d13d0
else
    r2 = *(arg1 + 0xc) + 0x28

int32_t r0_3 = *(r2 + 8)
int32_t temp0 = 0
uint32_t i = r0_3 - 0x66

while (i != 0)
    i u>>= 1
    temp0 += 1

int32_t temp0_1 = 0
uint32_t i_1 = r0_3 - 0x16

while (i_1 != 0)
    i_1 u>>= 1
    temp0_1 += 1

return (0x20 - temp0_1) u>> 5 | (0x20 - temp0) u>> 5
