// 函数: lua_sethook
// 地址: 0xc7b1c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t temp0 = 0
uint32_t i = arg3

while (i != 0)
    i u>>= 1
    temp0 += 1

void* lr = *(arg1 + 0x10)
int32_t temp0_1 = 0
uint32_t i_1 = arg2

while (i_1 != 0)
    i_1 u>>= 1
    temp0_1 += 1

uint32_t r12_1 = (0x20 - temp0_1) u>> 5 | (0x20 - temp0) u>> 5

if (r12_1 != 0)
    arg2 = 0

if ((zx.d(*(lr + 0x12)) & 1) != 0)
    *(arg1 + 0x14) = *(lr + 0x1c)

if (r12_1 != 0)
    arg3 = 0

*(arg1 + 0x2c) = arg4
*(arg1 + 0x30) = arg4
*(arg1 + 0x34) = arg2
*(arg1 + 0x28) = arg3.b
return 1
