// 函数: _ZN14ascensionrules31CStateProcessAcquireFromTheVoid9ExitStateER13CStateMachine
// 地址: 0x124ffc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x25c)

if (r0 != 0)
    operator delete[](r0)
    *(arg1 + 0x258) = 0
    *(arg1 + 0x25c) = 0

return CGameStateOptions::ExitState(arg1) __tailcall
