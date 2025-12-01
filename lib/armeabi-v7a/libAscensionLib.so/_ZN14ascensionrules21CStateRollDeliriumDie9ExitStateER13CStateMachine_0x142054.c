// 函数: _ZN14ascensionrules21CStateRollDeliriumDie9ExitStateER13CStateMachine
// 地址: 0x142054
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6 = *(*(arg1 + 0x30) + 4)
ascension::CWorld::OutputPauseLong(r6)
int32_t var_20 = 0
ascension::CWorld::OutputEvent(r6, 0x3c, 0, 0)
CState::CleanupEmbeddedState()
return CState::ExitState(arg1) __tailcall
