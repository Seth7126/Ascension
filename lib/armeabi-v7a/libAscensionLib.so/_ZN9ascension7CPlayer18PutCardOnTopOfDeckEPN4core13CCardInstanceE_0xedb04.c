// 函数: _ZN9ascension7CPlayer18PutCardOnTopOfDeckEPN4core13CCardInstanceE
// 地址: 0xedb04
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardStack::PutCardOnTop(*(arg1 + 0x38))
void* r0_2 = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 
    &__elf_program_headers[7].offset:1)
int32_t r1_1 = *(arg1 + 0x9c)

if (r0_2 != 0)
    *(r0_2 + 0xc) = r1_1

*(arg1 + 0x9c) = r1_1 + 1
return r1_1 + 1
