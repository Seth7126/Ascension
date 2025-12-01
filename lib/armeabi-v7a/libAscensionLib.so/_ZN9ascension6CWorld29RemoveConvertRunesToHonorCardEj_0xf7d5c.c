// 函数: _ZN9ascension6CWorld29RemoveConvertRunesToHonorCardEj
// 地址: 0xf7d5c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r5 = *(arg1 + 0xb70)
int32_t r0 = *(arg1 + 0xb74)

if (r0 == r5)
    return 0

int32_t entry_r1
int32_t r6

if (*r5 != entry_r1)
    r6 = 0
    void* r3_1
    bool cond:0_1
    
    do
        if (r0 - 8 == r5)
            return 0
        
        r3_1 = &r5[2]
        r6 += 1
        cond:0_1 = r5[2] != entry_r1
        r5 = r3_1
    while (cond:0_1)
    r5 = r3_1
else
    r6 = 0

void* r0_4 =
    core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[1].physical_address:2)
int32_t r2_2

if (r0_4 == 0)
    r2_2 = *(arg1 + 0xb74)
else
    *(r0_4 + 0xc) = *r5
    int32_t r1_1 = r5[1]
    *(r0_4 + 0x14) = r6.w
    *(r0_4 + 0x10) = r1_1
    r2_2 = *(arg1 + 0xb74)
    *(r0_4 + 0x16) = ((r2_2 - *(arg1 + 0xb70)) u>> 3).w

if (r2_2 != &r5[2])
    __aeabi_memmove4(r5)

*(arg1 + 0xb74) = &r5[((r2_2 - &r5[2]) s>> 3) * 2]
return 1
