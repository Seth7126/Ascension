// 函数: sub_1a4e80
// 地址: 0x1a4e80
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r6 = *(arg1 + 8)

if (zx.d(*(r6 + 4)) == 0xa)
    int32_t result = sub_1a4edc(r6)
    
    if (result != 0)
        return result

uint32_t r0_3 = sub_1a094e(r6, arg2)
uint32_t r0_5

if (r0_3 == 0)
    r0_5 = sub_1a0962(*(arg1 + 8), arg2)

if (r0_3 != 0 || r0_5 != 0)
    sub_19fca4(arg2, &data_1cfebe, &data_1cfebf)

jump(*(**(arg1 + 8) + 0x10))
