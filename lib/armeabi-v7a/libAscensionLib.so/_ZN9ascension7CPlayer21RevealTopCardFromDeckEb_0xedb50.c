// 函数: _ZN9ascension7CPlayer21RevealTopCardFromDeckEb
// 地址: 0xedb50
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r4 = arg1
*(arg1 + 0x38)
int32_t result_1 = core::CCardStack::GetTopCard()
int32_t result = result_1

if (result_1 == 0)
    int32_t result_2
    int32_t entry_r1
    
    if (*(*(r4 + 0x40) + 0x18) s>= 1 && entry_r1 != 0)
        ascension::CPlayer::ShuffleDiscardIntoDeck()
        *(r4 + 0x38)
        result_2 = core::CCardStack::GetTopCard()
        result = result_2
    
    if (*(*(r4 + 0x40) + 0x18) s< 1 || entry_r1 == 0 || result_2 == 0)
        return 0

if (*(r4 + 0x9c) == 0)
    void* r0_3 = core::CWorldBase::AddRollbackData(*(r4 + 4), zx.d(*(r4 + 8)), 
        &__elf_program_headers[7].offset:1)
    int32_t r1_1 = *(r4 + 0x9c)
    
    if (r0_3 != 0)
        *(r0_3 + 0xc) = r1_1
    
    *(r4 + 0x9c) = r1_1 + 1

return result
