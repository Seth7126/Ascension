// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions9ExitStateER13CStateMachine
// 地址: 0x17583c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0xef8)

if (r0 != 0)
    operator delete[](r0)
    *(arg1 + 0xef4) = 0
    *(arg1 + 0xef8) = 0

void* r0_1 = *(arg1 + 0xf00)

if (r0_1 != 0)
    operator delete[](r0_1)
    *(arg1 + 0xefc) = 0
    *(arg1 + 0xf00) = 0

CState::CleanupEmbeddedState()
return CGameStateOptions::ExitState(arg1) __tailcall
