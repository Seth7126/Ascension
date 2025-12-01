// 函数: _ZN14ascensionrules24CStateProcessAcquireCard10EnterStateER13CStateMachine
// 地址: 0x11dacc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CWorld* r2 = *(*(arg1 + 0x30) + 4)
*(arg1 + 0x8c) = 7
ascensionrules::CreateStateHandleEvent(r2, arg1 + 0x38, true, 0, nullptr, 0)
CState* entry_r1
return CStateMachine::PushOwnedState(entry_r1) __tailcall
