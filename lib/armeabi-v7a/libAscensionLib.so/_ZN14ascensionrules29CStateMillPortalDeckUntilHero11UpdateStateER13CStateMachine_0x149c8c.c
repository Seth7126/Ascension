// 函数: _ZN14ascensionrules29CStateMillPortalDeckUntilHero11UpdateStateER13CStateMachine
// 地址: 0x149c8c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (zx.d(*(arg1 + 0x3c)) != 0)
    CState* entry_r1
    return CStateMachine::PopState(entry_r1)

core::CCardInstance* r4_1 = *(*(arg1 + 0x38) + 4)

if (zx.d(*(r4_1 + 0xa14)) == 0 && *(*(r4_1 + 0xa3c) + 0x18) != 0)
    uint32_t result = core::CCardStack::GetTopCard()
    
    if (result == 0)
        return result
    
    if (*(*(result + 0xc) + 0x88) != 1)
        ascension::CWorld::DrawCardFromPortalDeck()
        ascension::CWorld::PutCardInVoid(r4_1)
        int32_t var_20 = 0
        ascension::CWorld::OutputAnimationCard(r4_1, result, 6, 8, 0, 9, 0, 
            &__elf_header.ident.encoding)
        return ascension::CWorld::OutputPauseForAllAnimation() __tailcall

*(arg1 + 0x3c) = 1
return 1
