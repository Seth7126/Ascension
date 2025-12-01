// 函数: _ZN14ascensionrules34CStateProcessAcquireTopOfDreamDeck11UpdateStateER13CStateMachine
// 地址: 0x14c6c4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x30) == 0 && *(arg1 + 0x38) s<= 0 && *(arg1 + 0x250) != 0)
    if (zx.d(*(arg1 + 0x254)) == 0)
        ascension::CWorld::OutputPauseBrief(*(*(arg1 + 0x24c) + 4))
        *(arg1 + 0x254) = 1
        return 1
    
    if (zx.d(*(arg1 + 0x255)) == 0)
        ascensionrules::CStateProcessAcquireTopOfDreamDeck::BuildOptionList(arg1)
        *(arg1 + 0x255) = 1
        return 1

return CGameStateOptions::UpdateState(arg1) __tailcall
