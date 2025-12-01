// 函数: _ZN14ascensionrules17CStateProcessGame10EnterStateER13CStateMachine
// 地址: 0x153644
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CWorld* r1 = *(arg1 + 0x38)
*(arg1 + 0x40) = 0
*(arg1 + 0x3c) = 0
ascensionrules::CreateStateProcessSetup(r1)
CState* entry_r1
return CStateMachine::PushOwnedState(entry_r1) __tailcall
