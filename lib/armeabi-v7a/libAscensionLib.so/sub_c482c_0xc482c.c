// 函数: sub_c482c
// 地址: 0xc482c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

sub_c471c(arg1, arg2)

if (*arg2 == 6)
    int32_t r0_1 = arg2[2]
    
    if ((r0_1 & 0x100) == 0 && r0_1 s>= zx.d(*(arg1 + 0x2e)))
        arg1[0xc].b -= 1

void* r1 = *arg1
uint32_t r2 = zx.d(arg1[0xc].b)
int64_t* pc

if (r2 u>= zx.d(*(r1 + 0x4e)))
    if (r2 u>= 0xf9)
        int32_t* r0_8
        int32_t* r1_4
        uint32_t r2_3
        r0_8, r1_4, r2_3 = sub_ce78c(arg1[3], "function or expression too complex", pc)
        return sub_c48c0(r0_8, r1_4, r2_3, pc) __tailcall
    
    *(r1 + 0x4e) = r2.b + 1

arg1[0xc].b = r2.b + 1
return sub_c48c0(arg1, arg2, 0xffffffff + zx.d(r2.b + 1), pc) __tailcall
