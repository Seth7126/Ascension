// 函数: _ZN9ascension26CCardStackUniformAscension19ProcessRollbackDataEPN4core12RollbackDataE
// 地址: 0xe4180
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r1
int32_t r0 = *(entry_r1 + 8)

if (r0 != &__elf_header.section_header_count:1)
    return r0

*(entry_r1 + 0xc)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(*(arg1 + 4))
*(arg1 + 0x14) = r0_2
return r0_2
