// 函数: _ZN14ascensionrules40CStateProcessAcquireOrDefeatAnyCenterRow9ExitStateER13CStateMachine
// 地址: 0x12b5e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0xce0)

if (r0 != 0)
    operator delete[](r0)
    *(arg1 + 0xcdc) = 0
    *(arg1 + 0xce0) = 0

void* r0_1 = *(arg1 + 0xce8)

if (r0_1 != 0)
    operator delete[](r0_1)
    *(arg1 + 0xce4) = 0
    *(arg1 + 0xce8) = 0

return CGameStateOptions::ExitState(arg1) __tailcall
