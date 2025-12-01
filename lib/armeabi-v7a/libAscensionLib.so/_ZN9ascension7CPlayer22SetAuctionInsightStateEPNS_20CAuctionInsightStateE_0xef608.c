// 函数: _ZN9ascension7CPlayer22SetAuctionInsightStateEPNS_20CAuctionInsightStateE
// 地址: 0xef608
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result = *(arg1 + 0xb0)
int32_t entry_r1

if (result != entry_r1)
    result = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 
        &__elf_program_headers[7].offset:3)
    
    if (result != 0)
        *(result + 0xc) = *(arg1 + 0xb0)
    
    *(arg1 + 0xb0) = entry_r1

return result
