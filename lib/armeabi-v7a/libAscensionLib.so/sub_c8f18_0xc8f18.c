// 函数: sub_c8f18
// 地址: 0xc8f18
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = arg1[2]
void* i = arg1[4]

while (i != 0)
    int32_t r3_1 = *(i + 4)
    i = *(i + 8)
    
    if (r1 u< r3_1)
        r1 = r3_1

int32_t r2_1 = r1 - arg1[7]
int32_t r1_4 = 0xf4240

if ((r2_1 s>> 4) + ((1 + (r2_1 s>> 4) + ((1 + (r2_1 s>> 4)) s>> 0x1f u>> 0x1d)) s>> 3) + 0xb
        s< 0xf4240)
    r1_4 = (r2_1 s>> 4) + ((1 + (r2_1 s>> 4) + ((1 + (r2_1 s>> 4)) s>> 0x1f u>> 0x1d)) s>> 3) + 0xb

bool cond:0 = r2_1 s>= 0xf423f0

if (r2_1 s<= 0xf423f0)
    cond:0 = r1_4 s>= arg1[8]

if (cond:0)
    return 

return sub_c8d68(arg1, r1_4) __tailcall
