// 函数: _ZN9ascension6CWorld18AddToAcquiredCardsEPN4core13CCardInstanceEhht
// 地址: 0xf88b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r4 = arg2
int32_t r0 = *__stack_chk_guard
char var_23 = arg4.b
int16_t arg_0
int16_t var_22 = arg_0
int32_t* r0_1 = *(arg1 + 0xb94)

if (r0_1 == *(arg1 + 0xb98))
    std::__ndk1::vector<ascension::AcquiredCardEvent, std::__ndk1::allocator<ascension::AcquiredCardEvent> >::__push_back_slow_path<ascension::AcquiredCardEvent const&>(
        arg1 + 0xb90)
else
    *r0_1 = r4
    r0_1[1] = arg3.d
    *(arg1 + 0xb94) += 8

void* r0_6 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[0].offset:2)

if (r0_6 != 0)
    *(r0_6 + 0xc) = zx.d(*(r4 + 8))

int32_t r0_7 = *__stack_chk_guard

if (r0_7 == r0)
    return r0_7 - r0

__stack_chk_fail()
noreturn
