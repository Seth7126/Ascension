// 函数: sub_d0a18
// 地址: 0xd0a18
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r3 = *(arg1 + 0x3c)
int32_t result = r3[1]

if (result == 0)
    return result

char* lr = *r3 - 1
bool cond:0_1

do
    if (zx.d(lr[result]) == zx.d(arg2))
        lr[result] = arg3
    
    cond:0_1 = result != 1
    result -= 1
while (cond:0_1)
return result
