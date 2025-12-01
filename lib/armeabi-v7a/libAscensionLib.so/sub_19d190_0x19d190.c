// 函数: sub_19d190
// 地址: 0x19d190
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result_1 = calloc(arg1, arg2)
void* result = result_1

if (result_1 == 0)
    int32_t r5_1 = arg1 * arg2
    void* result_2 = sub_19d0d0(r5_1)
    
    if (result_2 == 0)
        return nullptr
    
    result = result_2
    __aeabi_memclr(result_2, r5_1)

return result
