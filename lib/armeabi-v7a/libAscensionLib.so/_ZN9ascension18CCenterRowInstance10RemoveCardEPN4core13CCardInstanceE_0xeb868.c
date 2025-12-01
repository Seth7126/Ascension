// 函数: _ZN9ascension18CCenterRowInstance10RemoveCardEPN4core13CCardInstanceE
// 地址: 0xeb868
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r4 = *(arg1 + 0xc)
int32_t r9 = *(arg1 + 0x10)

if (r4 == r9)
    return 0

void* entry_r1
void* r5_1
int32_t r7

if (*r4 == entry_r1)
    r7 = 0
    r5_1 = r4
else
    r7 = 0
    int32_t* r2_1 = r4
    bool cond:3_1
    
    do
        if (r9 - 8 == r2_1)
            return 0
        
        r5_1 = &r2_1[2]
        r7 += 1
        cond:3_1 = r2_1[2] != entry_r1
        r2_1 = r5_1
    while (cond:3_1)

void* r0_4
uint32_t r2_3
r0_4, r2_3 = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 
    &__elf_symbol_table[0x22].st_value:1)

if (r0_4 != 0)
    if (entry_r1 != 0)
        r2_3 = zx.d(*(entry_r1 + 8))
    
    *(r0_4 + 0x10) = r7.w
    
    if (entry_r1 == 0)
        r2_3 = 0
    
    *(r0_4 + 0xc) = r2_3
    *(r0_4 + 0x12) = ((r9 - r4) u>> 3).w
    *(r0_4 + 0x14) = *(r5_1 + 4)

int32_t r0_5 = *(arg1 + 0x10)

if (r0_5 != r5_1 + 8)
    __aeabi_memmove4(r5_1)

*(arg1 + 0x10) = r5_1 + ((r0_5 - (r5_1 + 8)) s>> 3 << 3)
return 1
