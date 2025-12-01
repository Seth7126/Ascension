// 函数: _ZN6CState13AddOwnedChildEPS_
// 地址: 0xb93c4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* __offset(CState, 0x10) result
int32_t entry_r1

if (*(arg1 + 0xc) != 0)
    result = arg1 + 0x10
    *(*result + 0x14) = entry_r1
else
    *(arg1 + 0xc) = entry_r1
    result = arg1 + 0x10

*result = entry_r1
return result
