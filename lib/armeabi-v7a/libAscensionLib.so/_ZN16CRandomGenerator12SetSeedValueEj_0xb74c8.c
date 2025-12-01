// 函数: _ZN16CRandomGenerator12SetSeedValueEj
// 地址: 0xb74c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

for (int32_t i = 0; i != 0x270; )
    int32_t entry_r1
    *(arg1 + (i << 2)) =
        ((entry_r1 * &__elf_symbol_table[0xbd].st_other) & 0xffff0000) | (entry_r1 & 0xffff)
    i += 1
    entry_r1 = &__elf_symbol_table[0xbd].st_other + entry_r1 * 0x1c587629 + 1

int32_t r1_1 = *arg1

for (int32_t i_1 = 0; i_1 != 0x38c; )
    void* r4_2 = arg1 + i_1
    int32_t r3_2 = *(r4_2 + 4)
    int32_t r1_4 = *(r4_2 + 0x634) ^ ((r3_2 & 0x7ffffffe) | (r1_1 & 0x80000000)) u>> 1
    
    if ((r3_2 & 1) != 0)
        r1_4 ^= 0x9908b0df
    
    *(arg1 + i_1) = r1_4
    i_1 += 4
    r1_1 = r3_2

int32_t r4_4 = *(arg1 + 0x38c)

for (int32_t i_2 = 0; i_2 != 0xfffffe74; )
    int32_t r1_6 = arg1 - (i_2 << 2)
    i_2 -= 1
    int32_t r3_3 = *(r1_6 + 0x390)
    int32_t r5_2 = *r1_6 ^ ((r3_3 & 0x7ffffffe) | (r4_4 & 0x80000000)) u>> 1
    r4_4 = r3_3
    
    if ((r3_3 & 1) != 0)
        r5_2 ^= 0x9908b0df
    
    *(r1_6 + 0x38c) = r5_2

int32_t r2 = *arg1
int32_t r1_10 = *(arg1 + 0x630) ^ ((r2 & 0x7ffffffe) | (*(arg1 + 0x9bc) & 0x80000000)) u>> 1

if ((r2 & 1) != 0)
    r1_10 ^= 0x9908b0df

*(arg1 + 0x9bc) = r1_10
*(arg1 + 0x9c0) = arg1
*(arg1 + 0x9c4) = 0x270
