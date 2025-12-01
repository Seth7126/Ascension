// 函数: sub_cad74
// 地址: 0xcad74
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r12 = *(arg1 + 0x3c)

if (r12 s< 1)
    return 0

int32_t lr = 0
int32_t* r3 = *(arg1 + 0x18) + 4

while (*r3 s<= arg3)
    if (r3[1] s> arg3)
        int32_t temp1_1 = arg2
        arg2 -= 1
        
        if (temp1_1 == 1)
            return *(r3 - 4) + 0x10
    
    lr += 1
    r3 = &r3[3]
    
    if (lr s>= r12)
        break

return 0
