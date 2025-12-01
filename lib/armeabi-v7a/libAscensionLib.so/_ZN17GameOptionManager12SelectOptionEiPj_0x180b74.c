// 函数: _ZN17GameOptionManager12SelectOptionEiPj
// 地址: 0x180b74
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r3 = *(arg1 + 0x3fc)

if (r3 != 0)
    int32_t lr_1 = *(r3 + 4)
    
    if (lr_1 != 0)
        void* r3_2 = *(r3 + 0xa0) + (arg2 << 6)
        int32_t entry_r2
        lr_1(*arg1, *(r3 + 8), *(arg1 + 4), arg2, zx.d(*(r3_2 + 4)), zx.d(*(r3_2 + 6)), entry_r2)
        *(arg1 + 4)
        GameOptionManager::ResetPlayerOptionEntry(arg1)
        return 1

return 0
