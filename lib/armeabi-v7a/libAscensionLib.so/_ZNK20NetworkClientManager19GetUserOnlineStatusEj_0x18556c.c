// 函数: _ZNK20NetworkClientManager19GetUserOnlineStatusEj
// 地址: 0x18556c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r3 = *(arg1 + 0x508)
int32_t lr = *(arg1 + 0x50c)

if (r3 == lr)
    return 0

int32_t entry_i

while (*r3 != entry_i)
    r3 = &r3[2]
    
    if (lr == r3)
        return 0

int32_t r1 = r3[1]
int32_t result = 2

if (r1 == 0)
    result = 1

if (r1 == *(arg1 + 0x520))
    return 3

return result
