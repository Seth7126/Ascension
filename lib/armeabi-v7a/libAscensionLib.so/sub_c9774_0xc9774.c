// 函数: sub_c9774
// 地址: 0xc9774
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int16_t r0_1 = *(arg1 + 0x26) + 1
*(arg1 + 0x26) = r0_1
uint32_t r0_2 = zx.d(r0_1)

if (r0_2 == 0xc8)
    sub_c89f0(arg1, "C stack overflow", arg3)
    noreturn

if (r0_2 u>= 0xe1)
    int32_t* r0_13
    void* r1
    int32_t r2
    r0_13, r1, r2 = sub_c8c5c(arg1, 6)
    return lua_resume(r0_13, r1, r2) __tailcall

if (arg4 == 0)
    arg1[9].w += 1

if (sub_c90d4(arg1, arg2, arg3.w) == 0)
    sub_dfc88(arg1, arg5)

if (arg4 == 0)
    arg1[9].w -= 1

int16_t result = *(arg1 + 0x26) - 1
*(arg1 + 0x26) = result
return result
