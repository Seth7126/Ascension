// 函数: _ZN9ascension19CPortalCardInstance19ProcessRollbackDataEPN4core12RollbackDataE
// 地址: 0xe4300
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r1
int32_t r0 = *(entry_r1 + 8)

if (r0 != &__elf_symbol_table[0xe4].st_name:1)
    return r0

int32_t r0_2

if (*(entry_r1 + 0xc) == 0)
    r0_2 = 0
else
    r0_2 = core::CWorldBase::GetInstanceByID(*(arg1 + 4))

*(arg1 + 0x10) = r0_2
int32_t r0_3 = *(entry_r1 + 0x10)
*(arg1 + 0x14) = r0_3
return r0_3
