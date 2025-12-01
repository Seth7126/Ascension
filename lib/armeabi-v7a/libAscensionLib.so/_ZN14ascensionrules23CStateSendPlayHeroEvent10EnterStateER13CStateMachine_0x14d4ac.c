// 函数: _ZN14ascensionrules23CStateSendPlayHeroEvent10EnterStateER13CStateMachine
// 地址: 0x14d4ac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r1 = *(arg1 + 0x30)
int32_t r3 = *(arg1 + 0x34)
ascension::CWorld* r2 = *(r1 + 4)
*(arg1 + 0x84) = r1
*(arg1 + 0x88) = r3
ascensionrules::CreateStateHandleEvent(r2, arg1 + 0x38, true, 0, arg1 + 0x90, 0xa0)
CState* entry_r1
return CStateMachine::PushOwnedState(entry_r1) __tailcall
