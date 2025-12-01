// 函数: sub_d2814
// 地址: 0xd2814
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r1 = arg1 - 1
int32_t r0 = 0
uint32_t r2_1

if (r1 u< 0x100)
    r2_1 = r1
else
    r0 = 0
    bool cond:0_1
    
    do
        r2_1 = r1 u>> 8
        r0 += 8
        cond:0_1 = 0 != r1 u>> 0x10
        r1 = r2_1
    while (cond:0_1)

return r0 + zx.d(*(&data_1d13e0 + r2_1))
