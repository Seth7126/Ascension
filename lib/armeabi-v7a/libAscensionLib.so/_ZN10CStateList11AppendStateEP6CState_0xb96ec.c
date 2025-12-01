// 函数: _ZN10CStateList11AppendStateEP6CState
// 地址: 0xb96ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* __offset(CState, 0x34) result
int32_t entry_r1

if (*(arg1 + 0x30) != 0)
    result = arg1 + 0x34
    *(*result + 0x18) = entry_r1
else
    *(arg1 + 0x30) = entry_r1
    result = arg1 + 0x34

*result = entry_r1
return result
