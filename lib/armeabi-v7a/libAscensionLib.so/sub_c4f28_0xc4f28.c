// 函数: sub_c4f28
// 地址: 0xc4f28
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* r4 = arg1
int32_t r0 = *arg2
int32_t* r5 = arg3

if (r0 == 9)
    *(arg2 + 0xb)
    sub_c4d64(r4, r5)
    arg2[2].w
    *(arg2 + 0xa)
    sub_c4198(r4)
else if (r0 == 8)
    uint32_t r0_10
    r0_10, r4, r5 = sub_c4c4c(r4, r5)
    arg2[2]
    sub_c4198(r4)
else if (r0 == 7)
    if (*r5 == 6)
        int32_t r0_2 = r5[2]
        
        if ((r0_2 & 0x100) == 0 && r0_2 s>= zx.d(*(r4 + 0x2e)))
            r4[0xc].b -= 1
    
    int64_t* pc
    return sub_c48c0(r4, r5, arg2[2], pc) __tailcall

int32_t result = *r5

if (result == 6)
    result = r5[2]
    
    if ((result & 0x100) == 0)
        if (result s>= zx.d(*(r4 + 0x2e)))
            result = zx.d(r4[0xc].b) - 1
            r4[0xc].b = result.b

return result
