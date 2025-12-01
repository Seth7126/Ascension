// 函数: _ZN9ascension18CConstructInstance27ClearCardUnderConstructListEv
// 地址: 0xe528c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t r5 = *(entry_r0 + 0x4c) - *(entry_r0 + 0x48)
void* r0_1 = core::CWorldBase::AddRollbackData(*(entry_r0 + 4), zx.d(*(entry_r0 + 8)), 
    &__elf_symbol_table[2].st_name:3)

if (r0_1 != 0)
    int32_t r1_1 = r5 s>> 2
    *(r0_1 + 0xc) = r1_1
    
    if (r5 s>= 1)
        int32_t r3_2 = *(entry_r0 + 0x48)
        int32_t r5_1 = 0
        
        do
            *(r0_1 + 0x10 + (r5_1 << 2)) = zx.d(*(*(r3_2 + (r5_1 << 2)) + 8))
            r5_1 += 1
        while (r5_1 s< r1_1)
    
    *(r0_1 + (r1_1 << 2) + 0x10) = 0

int32_t result = *(entry_r0 + 0x48)
*(entry_r0 + 0x4c) = result
return result
