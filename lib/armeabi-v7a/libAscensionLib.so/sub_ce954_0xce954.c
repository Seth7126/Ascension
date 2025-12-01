// 函数: sub_ce954
// 地址: 0xce954
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r10
int32_t var_c = r10
int32_t* r4 = *(arg1 + 0x34)
void* result = sub_d7eb4(r4, arg2, arg3)
void** r0_2 = r4[2]
r4[2] = &r0_2[4]
*r0_2 = result
r0_2[2] = zx.d(*(result + 4)) | 0x40
int32_t __saved_r11
int32_t* r0_5 =
    sub_daf38(r4, *(*(arg1 + 0x30) + 4), r4[2] - 0x10, r4, result, arg1, r10, &__saved_r11)

if (r0_5[2] == 0)
    r0_5[2] = 1
    *r0_5 = 1
    
    if (*(r4[3] + 0xc) s>= 1)
        sub_cc158(r4)
else
    result = r0_5[4]

r4[2] -= 0x10
return result
