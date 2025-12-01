// 函数: sub_caa94
// 地址: 0xcaa94
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* result = &arg1[0xe]
int32_t* result_2 = *result
void* r5 = *(result - 0x2c)

if (result_2 != 0)
    while (true)
        int32_t r2_1 = result_2[2]
        
        if (r2_1 u< arg2)
            goto label_cab08
        
        result = result_2
        
        if (r2_1 == arg2)
            char r0_1 = *(result + 5) ^ 3
            
            if (((zx.d(*(r5 + 0x3c)) ^ 3) & zx.d(r0_1)) == 0)
                *(result + 5) = r0_1
            
            break
        
        result_2 = *result
        
        if (result_2 == 0)
            goto label_cab08
else
label_cab08:
    int32_t var_18_1 = 0
    void* result_1 = sub_cb0b8(arg1, 0xa, 0x20, result)
    result = result_1
    *(result_1 + 8) = arg2
    result[4] = r5 + 0x70
    void* r0_3 = *(r5 + 0x84)
    result[5] = r0_3
    *(r0_3 + 0x10) = result
    *(r5 + 0x84) = result

return result
