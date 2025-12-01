// 函数: _ZN14ascensionrules40CStateProcessGainRunesOrAcquireConstruct15SelectGainRunesER13CStateMachineP6CStateiPj
// 地址: 0x12c45c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r6 = *(arg2 + 0x24c)
uint32_t r2 = *(arg2 + 0x254)
int32_t r5 = r6[1]

if (r2 != 0)
    ascension::CWorld::OutputAnimationRune(r5, *(arg2 + 0x250), r2)

*(arg2 + 0x250)
ascension::CWorld::AddCurrentTurnRunes(r5)
return core::CWorldBase::OutputMessageFormat(r5, "%s gains %d runes\n", (*(*r6 + 0xc))(r6), 
    *(arg2 + 0x250)) __tailcall
