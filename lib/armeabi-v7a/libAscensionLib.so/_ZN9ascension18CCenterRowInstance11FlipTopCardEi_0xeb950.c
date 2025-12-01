// 函数: _ZN9ascension18CCenterRowInstance11FlipTopCardEi
// 地址: 0xeb950
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r7 = *(arg1 + 0x10)

if (*(arg1 + 0xc) == r7 || *(r7 - 4) != 2)
    return 0

uint32_t r8_1 = *(arg1 + 4)
uint32_t r6_1 = *(r7 - 8)
void* r0_2 =
    core::CWorldBase::AddRollbackData(r8_1, zx.d(*(arg1 + 8)), &__elf_symbol_table[0x22].st_value)

if (r0_2 != 0)
    uint32_t r2_1 = *(arg1 + 0x10)
    int32_t r1_4 = r2_1 - *(arg1 + 0xc)
    
    if (r6_1 != 0)
        r2_1 = zx.d(*(r6_1 + 8))
    
    uint16_t r1_5 = (r1_4 u>> 3).w
    
    if (r6_1 == 0)
        r2_1 = 0
    
    *(r0_2 + 0x10) = r1_5 - 1
    *(r0_2 + 0xc) = r2_1
    *(r0_2 + 0x12) = r1_5
    *(r0_2 + 0x14) = *(r7 - 4)

*(r7 - 4) = 0

if (r6_1 != 0 && *(*(r6_1 + 0xc) + 0x88) == 6)
    *(r7 - 4) = 3

int32_t var_28_1 = 0
uint32_t entry_r1
ascension::CWorld::OutputAnimationCard(r8_1, r6_1, 2, 7, entry_r1, 7, entry_r1, 0)
*(*(arg1 + 0x10) - 8)
ascension::CCenterRowInstance::CreateActiveEffects(arg1)
return 1
