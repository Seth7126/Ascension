// 函数: _ZN4core10CWorldBase15AddRollbackDataEjjj
// 地址: 0xb7da0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r4 = *(arg1 + 0xa18)
int32_t* result = nullptr

if (r4 != 0)
    int32_t* result_1 = *(arg1 + 0xa20)
    int32_t entry_r3
    void* r3 = result_1 + entry_r3
    
    if (r3 u<= r4 + *(arg1 + 0xa1c))
        result = result_1
        *result_1 = *(arg1 + 0xa24)
        result_1[1] = arg2
        result_1[2] = arg3
        *(arg1 + 0xa20) = r3
        *(arg1 + 0xa24) = result_1

return result
