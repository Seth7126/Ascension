// 函数: _ZN13CStateMachine8PopStateEP6CState
// 地址: 0xb9628
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = *arg1
int32_t* entry_r1

if (r2 == 0 || r2 != entry_r1)
    return 0

(*(*entry_r1 + 0x10))(entry_r1, arg1)
void* r2_2 = *arg1
void* r0_3 = *(r2_2 + 4)
*(r2_2 + 4) = 0

if (r0_3 != 0)
    *(r0_3 + 8) = 0

*arg1 = r0_3
return 1
