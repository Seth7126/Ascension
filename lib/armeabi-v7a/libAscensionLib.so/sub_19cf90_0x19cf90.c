// 函数: sub_19cf90
// 地址: 0x19cf90
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* lr = *arg1
int32_t r3 = 0
int32_t result = 0
uint32_t r12_1

do
    r12_1 = zx.d(*lr)
    lr = &lr[1]
    result |= (r12_1 & 0x7f) << r3
    r3 += 7
while (r12_1 << 0x18 s< 0)
*arg1 = lr
return result
