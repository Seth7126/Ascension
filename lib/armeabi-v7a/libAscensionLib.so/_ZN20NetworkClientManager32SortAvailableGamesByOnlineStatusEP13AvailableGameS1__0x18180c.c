// 函数: _ZN20NetworkClientManager32SortAvailableGamesByOnlineStatusEP13AvailableGameS1_
// 地址: 0x18180c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = zx.d(*(arg2 + 6)) & 1
int32_t r3_1 = zx.d(*(arg1 + 6)) & 1

if (r3_1 != r2)
    if (r3_1 u> r2)
        return 1
    
    return 0

if (*arg1 u< *arg2)
    return 1

return 0
