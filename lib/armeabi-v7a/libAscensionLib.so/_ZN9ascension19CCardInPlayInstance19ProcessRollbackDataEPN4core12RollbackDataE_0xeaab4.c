// 函数: _ZN9ascension19CCardInPlayInstance19ProcessRollbackDataEPN4core12RollbackDataE
// 地址: 0xeaab4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r1
int32_t r2_5 = *(entry_r1 + 8)

if (r2_5 == &__elf_symbol_table[0x1002].st_name:3)
    *(arg1 + (*(entry_r1 + 0xc) << 2) + 0x2c) = *(entry_r1 + 0x10)
    return 

if (r2_5 == &__elf_symbol_table[0x1002].st_name:2)
    core::CInstance* r2_3 = *(arg1 + 4)
    int32_t* r3_4 = *(arg1 + 0x24) - 4
    *r3_4
    *(arg1 + 0x24) = r3_4
    return core::CWorldBase::RollbackInstance(r2_3) __tailcall

if (r2_5 != &__elf_symbol_table[0x1002].st_name:1)
    return 

core::CInstance* r2 = *(arg1 + 4)
int32_t* r3_1 = *(arg1 + 0x18) - 4
*r3_1
*(arg1 + 0x18) = r3_1
return core::CWorldBase::RollbackInstance(r2) __tailcall
