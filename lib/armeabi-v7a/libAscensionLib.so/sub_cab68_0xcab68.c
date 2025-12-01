// 函数: sub_cab68
// 地址: 0xcab68
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* i = arg1[0xe]

if (i == 0)
    return 

void* r6_1 = arg1[3]
int32_t* r5_1 = arg1

do
    arg1 = i[2]
    
    if (arg1 u< arg2)
        break
    
    r5_1[0xe] = *i
    
    if (((zx.d(*(r6_1 + 0x3c)) ^ 3) & (zx.d(*(i + 5)) ^ 3)) == 0)
        if (arg1 != &i[4])
            *(i[5] + 0x10) = i[4]
            *(i[4] + 0x14) = i[5]
        
        arg1, r5_1 = sub_d14cc(r5_1, i, 0x20, 0)
    else
        *(i[5] + 0x10) = i[4]
        *(i[4] + 0x14) = i[5]
        int32_t* r0_2 = i[2]
        int32_t r3_5 = *r0_2
        i[5] = r0_2[1]
        i[4] = r3_5
        int32_t r0_3 = r0_2[2]
        i[2] = &i[4]
        i[6] = r0_3
        *i = *(r6_1 + 0x44)
        *(r6_1 + 0x44) = i
        sub_cb04c(r6_1, i)
    
    i = r5_1[0xe]
while (i != 0)
