// 函数: _ZN9ascension26CCardStackUniformAscension24CreateSampleCardInstanceEv
// 地址: 0xe4128
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
*(entry_r0 + 0xc)
int32_t r0_1 = ascension::CWorld::CreateCard(*(entry_r0 + 4))
void* result = core::CWorldBase::AddRollbackData(*(entry_r0 + 4), zx.d(*(entry_r0 + 8)), 
    &__elf_header.section_header_count:1)

if (result != 0)
    void* r1_2 = *(entry_r0 + 0x14)
    uint32_t r1_3
    
    if (r1_2 != 0)
        r1_3 = zx.d(*(r1_2 + 8))
    else
        r1_3 = 0
    
    *(result + 0xc) = r1_3

*(entry_r0 + 0x14) = r0_1
return result
