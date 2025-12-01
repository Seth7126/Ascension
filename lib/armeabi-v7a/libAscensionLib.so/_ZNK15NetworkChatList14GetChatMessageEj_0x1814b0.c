// 函数: _ZNK15NetworkChatList14GetChatMessageEj
// 地址: 0x1814b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r12 = *(arg1 + 4)
int32_t entry_r1

if (r12 u> entry_r1)
    return 0

if (*(arg1 + 8) u>= entry_r1)
    return *(*(arg1 + 0x14) + ((entry_r1 - r12) << 2))

return 0
