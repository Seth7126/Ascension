// 函数: _ZN9ascension19CPortalCardInstance21SetPortalCardInstanceEPN4core13CCardInstanceEi
// 地址: 0xe42a4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 
    &__elf_symbol_table[0xe4].st_name:1)

if (result != 0)
    void* r1_1 = *(arg1 + 0x10)
    uint32_t r1_2
    
    if (r1_1 != 0)
        r1_2 = zx.d(*(r1_1 + 8))
    else
        r1_2 = 0
    
    *(result + 0xc) = r1_2
    *(result + 0x10) = *(arg1 + 0x14)

*(arg1 + 0x10) = arg2
int32_t entry_r2
*(arg1 + 0x14) = entry_r2
return result
