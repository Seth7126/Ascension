// 函数: _ZN14ascensionrules32CStateProcessMayDiscardTopOfDeck18RevealCardFromDeckEv
// 地址: 0x1478ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* entry_r0
*(entry_r0 + 0x24c)
int32_t* result = ascension::CPlayer::RemoveTopCardFromDeck()
*(entry_r0 + 0x254) = result

if (result == 0)
    return result

void* r6 = *(entry_r0 + 0x24c)
char* r5 = *(r6 + 4)
core::CWorldBase::OutputMessageFormat(r5, "%s reveals %s\n", r6 + 0x10, (*(*result + 0xc))())
int32_t var_20 = 0
ascension::CWorld::OutputAnimationCard(r5, *(entry_r0 + 0x254), 2, 2, 
    zx.d(*(*(entry_r0 + 0x24c) + 8)), 0xc, 0, 0)
*(*(entry_r0 + 0x24c) + 8)
ascension::CWorld::PushRevealCard(r5, *(entry_r0 + 0x254), 5)
ascension::CWorld::OutputPauseForAnimationToDestination(r5)
return ascension::CWorld::OutputPauseForAnimationConfirmation() __tailcall
