// 函数: sub_19fcd4
// 地址: 0x19fcd4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = arg1[1]
int32_t r2 = arg1[2]
uint32_t r1 = arg2 + r0

if (r1 u< r2)
    return r0

void* r0_1 = *arg1

if (r1 u<= r2 << 1)
    r1 = r2 << 1

arg1[2] = r1
void* r0_2 = realloc(r0_1, r1)
*arg1 = r0_2
return r0_2
