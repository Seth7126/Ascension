// 函数: _ZN9ascension18CCenterRowInstance13RemoveTopCardEbi
// 地址: 0xeb688
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r4 = arg1
uint32_t r5 = *(arg1 + 4)
int32_t i = *(arg1 + 0x18)

for (int32_t* r6 = *(r4 + 0x1c); r6 != i; i = *(r4 + 0x18))
    r6 -= 4
    void* r7_1 = *r6
    void* r0_1 =
        core::CWorldBase::AddRollbackData(r5, zx.d(*(r4 + 8)), &__elf_symbol_table[0x23].st_name:1)
    
    if (r0_1 != 0)
        *(r0_1 + 0xc) = zx.d(*(r7_1 + 8))
    
    ascension::CWorld::RemoveActiveEffect(r5)

int32_t r7_2 = *(r4 + 0xc)
int32_t r6_1 = *(r4 + 0x10)
*(r4 + 0x1c) = i

if (r7_2 == r6_1)
    return nullptr

void* const result = *(r6_1 - 8)
void* r0_4
uint32_t r2
r0_4, r2 =
    core::CWorldBase::AddRollbackData(r5, zx.d(*(r4 + 8)), &__elf_symbol_table[0x22].st_name:2)

if (r0_4 != 0)
    if (result != 0)
        r2 = zx.d(*(result + 8))
    
    uint16_t r1_5 = ((r6_1 - r7_2) u>> 3).w
    
    if (result == 0)
        r2 = 0
    
    *(r0_4 + 0x10) = r1_5 - 1
    *(r0_4 + 0xc) = r2
    *(r0_4 + 0x12) = r1_5
    *(r0_4 + 0x14) = *(r6_1 - 4)

int32_t r7_3 = *(r4 + 0x10)
int32_t r1_7 = *(r4 + 0xc)
int32_t r0_5 = r7_3 - 8
*(r4 + 0x10) = r0_5

if (r1_7 != r0_5)
    if (*(r7_3 - 0xc) == 2 && (arg2 != 0 || *(r5 + 0x30) u<= 0xd))
        uint32_t r9_1 = *(r7_3 - 0x10)
        void* r0_7 = core::CWorldBase::AddRollbackData(r5, zx.d(*(r4 + 8)), 
            &__elf_symbol_table[0x22].st_value)
        
        if (r0_7 != 0)
            uint32_t r2_1 = *(r4 + 0x10)
            int32_t r1_12 = r2_1 - *(r4 + 0xc)
            
            if (r9_1 != 0)
                r2_1 = zx.d(*(r9_1 + 8))
            
            uint16_t r1_13 = (r1_12 u>> 3).w
            
            if (r9_1 == 0)
                r2_1 = 0
            
            *(r0_7 + 0x10) = r1_13 - 1
            *(r0_7 + 0xc) = r2_1
            *(r0_7 + 0x12) = r1_13
            *(r0_7 + 0x14) = *(r7_3 - 0xc)
        
        *(r7_3 - 0xc) = 0
        
        if (r9_1 != 0 && *(r5 + 0x30) u>= 0xd && *(*(r9_1 + 0xc) + 0x88) == 6)
            *(r7_3 - 0xc) = 3
        
        int32_t var_30_1 = 0
        uint32_t entry_r2
        ascension::CWorld::OutputAnimationCard(r5, r9_1, 2, 7, entry_r2, 7, entry_r2, 0)
        r0_5 = *(r4 + 0x10)
    
    *(r0_5 - 8)
    ascension::CCenterRowInstance::CreateActiveEffects(r4)

return result
