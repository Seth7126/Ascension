// 函数: _ZN13CStateMachine14PushOwnedStateEP6CState
// 地址: 0xb977c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *arg1
int32_t* entry_r1

if (*(r0 + 0xc) != 0)
    *(*(r0 + 0x10) + 0x14) = entry_r1
else
    *(r0 + 0xc) = entry_r1

*(r0 + 8) = entry_r1
*(r0 + 0x10) = entry_r1
entry_r1[1] = r0
*arg1 = entry_r1
jump(*(*entry_r1 + 8))
