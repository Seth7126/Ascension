// 函数: _ZN9ascension7CPlayer21RemoveTopCardFromDeckEv
// 地址: 0xedc8c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* entry_r0

if (*(entry_r0 + 0x9c) s>= 1)
    void* r0_2 = core::CWorldBase::AddRollbackData(*(entry_r0 + 4), zx.d(*(entry_r0 + 8)), 
        &__elf_program_headers[7].offset:1)
    int32_t r1_2 = *(entry_r0 + 0x9c)
    
    if (r0_2 != 0)
        *(r0_2 + 0xc) = r1_2
    
    *(entry_r0 + 0x9c) = r1_2 - 1

*(entry_r0 + 0x38)
int32_t result = core::CCardStack::RemoveTopCard()

if (result != 0)
    return result

if (*(*(entry_r0 + 0x40) + 0x18) s< 1)
    return 0

ascension::CPlayer::ShuffleDiscardIntoDeck()
*(entry_r0 + 0x38)
return core::CCardStack::RemoveTopCard() __tailcall
