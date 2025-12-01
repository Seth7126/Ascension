// 函数: sub_1a2620
// 地址: 0x1a2620
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0xc) - *(arg1 + 8) u>= 4)
    sub_19fca4(arg2, &data_1cffeb, 0x1cffec)
    sub_19fca4(arg2, *(arg1 + 8), *(arg1 + 0xc))
    sub_19fca4(arg2, &data_1cfebe, &data_1cfebf)

char* r1_4 = *(arg1 + 0x10)
int32_t r2_2

if (zx.d(*r1_4) != 0x6e)
    r2_2 = *(arg1 + 0x14)
else
    sub_19fca4(arg2, &data_1c1b13, 0x1c1b14)
    int32_t r0_7 = *(arg1 + 0x10)
    r2_2 = *(arg1 + 0x14)
    int32_t r1_2 = r2_2 - r0_7
    void* const r1_3 = r1_2 - 1
    
    if (r1_2 u> 1)
        r1_3 = 1
    
    r1_4 = r1_3 + r0_7

sub_19fca4(arg2, r1_4, r2_2)
int32_t r1_5 = *(arg1 + 8)
int32_t r2_3 = *(arg1 + 0xc)
int32_t result = r2_3 - r1_5

if (result u> 3)
    return result

return sub_19fca4(arg2, r1_5, r2_3) __tailcall
