// 函数: _ZN14ascensionrules37CStateTakeCardFromEachOpponentDiscard20ReturnDiscardedCardsEv
// 地址: 0x145ea4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
core::CCardInstance* r5 = *(*(entry_r0 + 0x24c) + 4)
int32_t result = *(r5 + 0x1c) - *(r5 + 0x18)

if (result s>= 5)
    int32_t r8_1 = result s>> 2
    int32_t result_1 = 0x95
    bool cond:0_1
    
    do
        uint32_t r6_1 = *(entry_r0 + (result_1 << 2))
        
        if (r6_1 != 0)
            core::CCardInstance* r0_3 =
                ascension::CWorld::GetPlayerByTurnOrder(r5, *(entry_r0 + 0x24c))
            ascension::CPlayer::PutCardInDiscard(r0_3)
            uint32_t r0_4 = zx.d(*(r0_3 + 8))
            uint32_t var_28_1 = r0_4
            ascension::CWorld::OutputAnimationCard(r5, r6_1, 5, 0xc, 0, 3, r0_4, 2)
            ascension::CWorld::RemoveRevealCard(r5)
            *(entry_r0 + (result_1 << 2)) = 0
        
        result = result_1 + 1
        cond:0_1 = result_1 - 0x93 s< r8_1
        result_1 = result
    while (cond:0_1)

return result
