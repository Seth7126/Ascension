// 函数: _ZNK9ascension6CWorld25GetCenterRowCardStackListEi
// 地址: 0xf6034
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t entry_r1

if (entry_r1 s< 0)
    return 0

int32_t r3 = *(arg1 + 0xa40)

if (entry_r1 s< (*(arg1 + 0xa44) - r3) s>> 2)
    return *(r3 + (entry_r1 << 2)) + 0xc

return 0
