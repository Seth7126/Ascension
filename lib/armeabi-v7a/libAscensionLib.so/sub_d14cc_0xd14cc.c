// 函数: sub_d14cc
// 地址: 0xd14cc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r7 = arg1[3]
int32_t r4 = arg4
int32_t result = (*r7)(r7[1], arg2)

if (r4 != 0 && result == 0)
    if (zx.d(*(r7 + 0x3f)) != 0)
        sub_cc180(arg1, 1)
        result = (*r7)(r7[1], arg2, arg3, r4)
    
    if (zx.d(*(r7 + 0x3f)) == 0 || result == 0)
        return luaopen_package(sub_c8c5c(arg1, 4)) __tailcall

if (arg2 != 0)
    r4 -= arg3

r7[3] += r4
return result
