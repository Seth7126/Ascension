// 函数: lua_callk
// 地址: 0xbf20c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r1_1 = arg1[2] + (not.d(arg2) << 4)
int32_t* r0_1
int32_t r2_2
int32_t r3

if (arg5 == 0 || zx.d(arg1[9].w) != 0)
    r0_1 = arg1
    r2_2 = arg3
    r3 = 0
else
    *(arg1[4] + 0x1c) = arg5
    r2_2 = arg3
    *(arg1[4] + 0x18) = arg4
    r0_1 = arg1
    r3 = 1

int32_t r8
int32_t r0_3 = sub_c9774(r0_1, r1_1, r2_2, r3, r8)

if (arg3 != 0xffffffff)
    return r0_3

void* r1_2 = arg1[4]
int32_t r0_4 = arg1[2]

if (*(r1_2 + 4) u< r0_4)
    *(r1_2 + 4) = r0_4

return r0_4
