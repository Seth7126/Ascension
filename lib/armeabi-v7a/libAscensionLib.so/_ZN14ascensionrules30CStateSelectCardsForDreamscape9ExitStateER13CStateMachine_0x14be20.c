// 函数: _ZN14ascensionrules30CStateSelectCardsForDreamscape9ExitStateER13CStateMachine
// 地址: 0x14be20
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r1 = *(arg1 + 0x24c)

if (*(*(r1 + 0x3c) + 0x18) s>= 1)
    core::CCardInstance* r6_1 = *(r1 + 4)
    
    do
        int32_t var_28_1 = 0
        ascension::CWorld::OutputAnimationCard(r6_1, core::CCardStack::GetTopCard(), 5, 1, 
            zx.d(*(*(arg1 + 0x24c) + 8)), 8, 0, 0)
        ascension::CPlayer::RemoveCardFromHand(*(arg1 + 0x24c))
        ascension::CWorld::PutCardOnBottomOfDreamDeck(r6_1)
    while (*(*(*(arg1 + 0x24c) + 0x3c) + 0x18) s> 0)

return CGameStateOptions::ExitState(arg1) __tailcall
