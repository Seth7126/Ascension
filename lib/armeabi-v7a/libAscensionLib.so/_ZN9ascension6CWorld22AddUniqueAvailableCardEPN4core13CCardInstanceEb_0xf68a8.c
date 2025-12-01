// 函数: _ZN9ascension6CWorld22AddUniqueAvailableCardEPN4core13CCardInstanceEb
// 地址: 0xf68a8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* var_20 = arg2
bool* r0_1 = *(arg1 + 0xa80)
int32_t entry_r2

if (r0_1 != *(arg1 + 0xa84))
    *r0_1 = arg2
    *(arg1 + 0xa80) += 4
    
    if (entry_r2 == 0)
        goto label_f6960
    
    goto label_f68fc

std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
    arg1 + 0xa7c)

if (entry_r2 != 0)
label_f68fc:
    void* r5_1 = *(var_20 + 0xc)
    core::CInstance** i = *(r5_1 + 0x130)
    
    if (i != *(r5_1 + 0x134))
        do
            core::CInstance* r1 = *i
            i = &i[1]
            ascension::CWorld::AddGlobalActiveEffect(arg1, r1)
        while (i != *(r5_1 + 0x134))
else
label_f6960:
    void* r0_9 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[0].align:3)
    
    if (r0_9 != 0)
        *(r0_9 + 0xc) = zx.d(*(var_20 + 8))

int32_t r0_10 = *__stack_chk_guard

if (r0_10 == r0)
    return r0_10 - r0

__stack_chk_fail()
noreturn
