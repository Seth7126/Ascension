// 函数: sub_1a2dd8
// 地址: 0x1a2dd8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t __saved_r7
int32_t* var_28 = &__saved_r7
int32_t r8 = 1
int32_t r6 = 0
int32_t result

while (true)
    result = arg1[1]
    
    if (r6 == result)
        break
    
    int32_t r10_1 = arg2[1]
    int32_t r5_1 = r10_1
    
    if (r8 << 0x1f == 0)
        sub_19fca4(arg2, 0x1d0063, 0x1d0065)
        r5_1 = arg2[1]
    
    sub_19e510(*(*arg1 + (r6 << 2)), arg2)
    r6 += 1
    
    if (r5_1 == arg2[1])
        arg2[1] = r10_1
    else
        r8 = 0

return result
