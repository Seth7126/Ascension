// 函数: _ZN9ascension7CPlayer22ShuffleDiscardIntoDeckEv
// 地址: 0xedbf4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
char* r4 = *(entry_r0 + 4)
core::CWorldBase::OutputMessageFormat(r4, "%s shuffles discard pile into deck\n", entry_r0 + 0x10)
*(entry_r0 + 0x40)

if (core::CCardStack::RemoveTopCard() != 0)
    int32_t i
    
    do
        core::CCardStack::AddCard(*(entry_r0 + 0x38))
        *(entry_r0 + 0x40)
        i = core::CCardStack::RemoveTopCard()
    while (i != 0)

ascension::CPlayer::ShuffleDeck()
void* result = *(entry_r0 + 0x38)

if (*(result + 0x18) s< 1)
    return result

int32_t var_18_1 = 0
return ascension::CWorld::OutputEvent(r4, 1, zx.d(*(entry_r0 + 8)), zx.d(*(result + 8)))
