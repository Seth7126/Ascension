// 函数: _ZN9ascension7CPlayer22PutEntireHandInDiscardEv
// 地址: 0xee0d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
core::CCardInstance* r5 = *(entry_r0 + 4)
*(entry_r0 + 0x3c)
uint32_t i = core::CCardStack::GetTopCard()

if (i != 0)
    uint32_t i_1 = i
    
    do
        int32_t r0_1 = zx.d(*(entry_r0 + 8))
        
        if (*(*(i_1 + 0xc) + 0x88) != 5)
            int32_t var_28_2 = 0
            ascension::CWorld::OutputAnimationCard(r5, i_1, 5, 1, r0_1, 3, r0_1, 0)
            *(entry_r0 + 0x3c)
            core::CCardStack::RemoveTopCard()
            core::CCardStack::AddCard(*(entry_r0 + 0x40))
        else
            int32_t var_28_1 = 0
            ascension::CWorld::OutputAnimationCard(r5, i_1, 6, 1, r0_1, 9, 0, &__elf_header)
            *(entry_r0 + 0x3c)
            core::CCardStack::RemoveTopCard()
            ascension::CWorld::PutCardInVoid(r5)
        
        *(entry_r0 + 0x3c)
        i = core::CCardStack::GetTopCard()
        i_1 = i
    while (i != 0)

return i
