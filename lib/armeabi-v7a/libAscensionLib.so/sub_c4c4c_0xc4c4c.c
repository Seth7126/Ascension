// 函数: sub_c4c4c
// 地址: 0xc4c4c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

sub_c471c(arg1, arg2)
void* r6_2
int64_t* pc

if (*arg2 != 6)
label_c4c94:
    sub_c471c(arg1, arg2)
    
    if (*arg2 == 6)
        int32_t r0_5 = arg2[2]
        
        if ((r0_5 & 0x100) == 0 && r0_5 s>= zx.d(*(arg1 + 0x2e)))
            arg1[0xc].b -= 1
    
    void* r1_2 = *arg1
    uint32_t r2_1 = zx.d(arg1[0xc].b)
    
    if (r2_1 u>= zx.d(*(r1_2 + 0x4e)))
        if (r2_1 u>= 0xf9)
            int32_t* r0_13
            int32_t* r1_6
            int32_t r9
            r0_13, r1_6, r9 = sub_ce78c(arg1[3], "function or expression too complex", pc)
            return sub_c4d34(r0_13, r1_6) __tailcall
        
        *(r1_2 + 0x4e) = r2_1.b + 1
    
    arg1[0xc].b = r2_1.b + 1
    sub_c48c0(arg1, arg2, 0xffffffff + zx.d(r2_1.b + 1), pc)
    r6_2 = &arg2[2]
else
    r6_2 = &arg2[2]
    uint32_t result = *r6_2
    int32_t r0_1
    int32_t r1
    r1:r0_1 = *(r6_2 + 8)
    
    if (r0_1 == r1)
        return result
    
    if (result s< zx.d(*(arg1 + 0x2e)))
        goto label_c4c94
    
    sub_c48c0(arg1, arg2, result, pc)
return *r6_2
