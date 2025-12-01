// 函数: _ZN9ascension6CWorld22AddLifeboundHeroToListEPN4core13CCardInstanceE
// 地址: 0xf6acc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r3 = *(arg1 + 0xac8)
void** r2 = *(arg1 + 0xacc)
void* entry_r1

if (r2 != r3)
    int32_t i = 0
    
    do
        if (*(entry_r1 + 0xc) == *(*(r3 + (i << 3)) + 0xc))
            goto label_f6b94
        
        i += 1
    while (i u< (r2 - r3) s>> 3)

if (*(arg1 + 0xad0) == r2)
    std::__ndk1::vector<ascension::LifeboundList, std::__ndk1::allocator<ascension::LifeboundList> >::__push_back_slow_path<ascension::LifeboundList const&>(
        arg1 + 0xac8)
else
    *r2 = entry_r1
    r2[1] = 0.d
    *(arg1 + 0xacc) += 8

void* r0_7 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[1].align:2)

if (r0_7 != 0)
    *(r0_7 + 0xc) = (*(arg1 + 0xacc) - *(arg1 + 0xac8)) s>> 3

label_f6b94:
int32_t r0_8 = *__stack_chk_guard

if (r0_8 == r0)
    return r0_8 - r0

__stack_chk_fail()
noreturn
