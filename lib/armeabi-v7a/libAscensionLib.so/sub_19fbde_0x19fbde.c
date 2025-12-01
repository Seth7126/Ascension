// 函数: sub_19fbde
// 地址: 0x19fbde
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r5 = *(arg1 + 0x1000)
int32_t r6 = (arg2 + 0xf) & 0xfffffff0
int32_t* r3_1 = &r5[1]
int32_t r2 = *r3_1
int32_t* r0_1

if (r2 + r6 u< 0xff8)
    r0_1 = r5 + r2
    *r3_1 = r2 + r6
else if (r6 u< 0xff9)
    int32_t** r0_2 = operator new[](0x1000)
    r2 = 0
    *r0_2 = r5
    r3_1 = &r0_2[1]
    *r3_1 = 0
    *(arg1 + 0x1000) = r0_2
    r0_1 = r0_2 + r2
    *r3_1 = r2 + r6
else
    r0_1 = operator new[](r6 | 8)
    *r0_1 = *r5
    r0_1[1] = 0
    *r5 = r0_1

return &r0_1[2]
