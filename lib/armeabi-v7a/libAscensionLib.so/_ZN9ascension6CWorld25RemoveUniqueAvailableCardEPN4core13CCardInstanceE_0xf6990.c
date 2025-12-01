// 函数: _ZN9ascension6CWorld25RemoveUniqueAvailableCardEPN4core13CCardInstanceE
// 地址: 0xf6990
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r5 = *(arg1 + 0xa7c)
int32_t r0 = *(arg1 + 0xa80)

if (r0 == r5)
    return 0

void* entry_r1
int32_t r7

if (*r5 == entry_r1)
    r7 = 0
else
    r7 = 0
    void* r2_1
    bool cond:2_1
    
    do
        if (r0 - 4 == r5)
            return 0
        
        r2_1 = &r5[1]
        r7 += 1
        cond:2_1 = r5[1] != entry_r1
        r5 = r2_1
    while (cond:2_1)
    r5 = r2_1

uint32_t r8 = 0
void* r0_4 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[1])

if (r0_4 != 0)
    if (entry_r1 != 0)
        r8 = zx.d(*(entry_r1 + 8))
    
    *(r0_4 + 0x10) = r7.w
    *(r0_4 + 0xc) = r8
    *(r0_4 + 0x12) = 0

int32_t r0_5 = *(arg1 + 0xa80)

if (r0_5 != &r5[1])
    __aeabi_memmove4(r5)

*(arg1 + 0xa80) = &r5[(r0_5 - &r5[1]) s>> 2]
return 1
