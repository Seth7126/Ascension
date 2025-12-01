// 函数: _ZN13CStateMachine9PushStateEP6CState
// 地址: 0xb95fc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *arg1
int32_t* entry_r1

if (r0 != 0)
    *(r0 + 8) = entry_r1
    entry_r1[1] = r0

*arg1 = entry_r1
jump(*(*entry_r1 + 8))
