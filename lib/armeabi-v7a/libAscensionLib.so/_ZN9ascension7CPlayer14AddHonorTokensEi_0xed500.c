// 函数: _ZN9ascension7CPlayer14AddHonorTokensEi
// 地址: 0xed500
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0_1 = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 
    &__elf_program_headers[7].type:1)
int32_t r1_1 = *(arg1 + 0x90)

if (r0_1 != 0)
    *(r0_1 + 0xc) = r1_1

uint32_t result = *(arg1 + 4)
uint32_t entry_r1
*(arg1 + 0x90) = r1_1 + entry_r1

if (*(result + 0xb5c) s< 2 || zx.d(*(result + 0xa14)) != 0)
    return result

int32_t var_18 = 0
return ascension::CWorld::OutputEvent(result, 0x11, zx.d(*(arg1 + 8)), entry_r1)
