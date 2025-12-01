// 函数: _ZN14ascensionrules32CStateProcessAcquireChampionHero11UpdateStateER13CStateMachine
// 地址: 0x135b54
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x30) == 0 && *(arg1 + 0x38) s<= 0)
    if (zx.d(*(arg1 + 0x25c)) != 0)
        int32_t result = ascension::CWorld::OutputPauseBrief(*(*(arg1 + 0x24c) + 4))
        *(arg1 + 0x25c) = 0
        return result
    
    if (zx.d(*(arg1 + 0x25d)) == 0)
        ascensionrules::CStateProcessAcquireChampionHero::BuildOptionList(arg1)
        *(arg1 + 0x25d) = 1
        return 1

return CGameStateOptions::UpdateState(arg1) __tailcall
