// 函数: _ZNK20NetworkClientManager19GetUserOnlineGameIDEjRj
// 地址: 0x1855c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* lr = *(arg1 + 0x508)
int32_t r12 = *(arg1 + 0x50c)

if (lr == r12)
    return 0

do
    if (*lr == arg2)
        int32_t* entry_r2
        *entry_r2 = lr[1]
        return 1
    
    lr = &lr[2]
while (r12 != lr)

return 0
