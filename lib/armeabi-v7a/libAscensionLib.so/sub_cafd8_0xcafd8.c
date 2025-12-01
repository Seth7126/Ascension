// 函数: sub_cafd8
// 地址: 0xcafd8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg2 + 0x20) != 0)
    void* r0 = *(arg1 + 0xc)
    *(arg2 + 5) &= 0xfb
    *(arg2 + 0x48) = *(r0 + 0x58)
    *(r0 + 0x58) = arg2
    return 

if ((zx.d(*(arg3 + 5)) & 3) == 0)
    return 

uint32_t r12_1 = zx.d(*(arg2 + 5))

if ((r12_1 & 4) == 0)
    return 

void* r0_1 = *(arg1 + 0xc)

if (zx.d(*(r0_1 + 0x3d)) u<= 1)
    return sub_cae14(r0_1, arg3) __tailcall

*(arg2 + 5) = (*(r0_1 + 0x3c) & 3) | (r12_1.b & 0xb8)
