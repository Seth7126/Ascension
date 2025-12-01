// 函数: _ZN9ascension6CWorld18AddAvailableTempleEPN4core13CCardInstanceE
// 地址: 0xf6738
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t* r0_1 = *(arg1 + 0xa74)
void* entry_r1

if (r0_1 == *(arg1 + 0xa78))
    std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
        arg1 + 0xa70)
else
    *r0_1 = entry_r1
    *(arg1 + 0xa74) += 4

void* r0_6 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[0].align:3)

if (r0_6 != 0)
    *(r0_6 + 0xc) = zx.d(*(entry_r1 + 8))

int32_t r0_7 = *__stack_chk_guard

if (r0_7 == r0)
    return r0_7 - r0

__stack_chk_fail()
noreturn
