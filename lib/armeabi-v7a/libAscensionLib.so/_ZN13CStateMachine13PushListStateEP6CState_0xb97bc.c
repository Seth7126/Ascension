// 函数: _ZN13CStateMachine13PushListStateEP6CState
// 地址: 0xb97bc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *arg1
int32_t entry_r1

if (*(r0 + 0xc) != 0)
    *(*(r0 + 0x10) + 0x14) = entry_r1
else
    *(r0 + 0xc) = entry_r1

int32_t r2_2 = *(r0 + 0x30)
*(r0 + 0x10) = entry_r1
void* result

if (r2_2 != 0)
    result = r0 + 0x34
    *(*result + 0x18) = entry_r1
else
    *(r0 + 0x30) = entry_r1
    result = r0 + 0x34

*result = entry_r1
return result
