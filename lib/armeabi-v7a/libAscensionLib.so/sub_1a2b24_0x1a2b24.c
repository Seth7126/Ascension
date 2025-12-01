// 函数: sub_1a2b24
// 地址: 0x1a2b24
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t __saved_r7
int32_t* var_28 = &__saved_r7
int32_t r5 = arg2[1]
int32_t r9 = arg2[3]
int32_t r8 = arg2[4]
arg2[3] = 0xffffffff
arg2[4] = 0xffffffff
sub_19e510(*(arg1 + 8))
int32_t r11 = arg2[4]
uint32_t result = r11 + 1

if (r11 == 0xffffffff)
    result = sub_19fca4(arg2, &data_1c0a4c, 0x1c0a4f)
else if (r11 != 0)
    for (int32_t i = 1; i u< r11; i += 1)
        sub_19fca4(arg2, 0x1d0063, 0x1d0065)
        arg2[3] = i
        result = sub_19e510(*(arg1 + 8), arg2)
else
    arg2[1] = r5

arg2[3] = r9
arg2[4] = r8
return result
