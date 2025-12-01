// 函数: sub_1a43c8
// 地址: 0x1a43c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
sub_19fca4(arg2, &data_1cffeb, 0x1cffec)
sub_1a2dd8(arg1 + 0x10, arg2)
sub_19fca4(arg2, &data_1cfebe, &data_1cfebf)
int32_t* r0_3 = *(arg1 + 8)

if (r0_3 != 0)
    (*(*r0_3 + 0x10))(r0_3, arg2)

int32_t r0_5 = *(arg1 + 0x1c)

if (r0_5 << 0x1f != 0)
    sub_19fca4(arg2, " const", &data_1d04d3[6])
    r0_5 = *(arg1 + 0x1c)

if (r0_5 << 0x1e s< 0)
    sub_19fca4(arg2, " volatile", &data_1d04da[9])
    r0_5 = *(arg1 + 0x1c)

if (r0_5 << 0x1d s< 0)
    sub_19fca4(arg2, " restrict", &data_1d04e4[9])

uint32_t r0_9 = zx.d(*(arg1 + 0x20))

if (r0_9 == 2)
    sub_19fca4(arg2, &data_1d04f1, &data_1d04f4)
else if (r0_9 == 1)
    sub_19fca4(arg2, &data_1d04ee, &data_1d04f0)

int32_t result = *(arg1 + 0x18)

if (result == 0)
    return result

return sub_19e510(result, arg2) __tailcall
