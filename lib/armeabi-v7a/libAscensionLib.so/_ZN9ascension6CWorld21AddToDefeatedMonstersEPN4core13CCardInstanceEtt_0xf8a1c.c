// 函数: _ZN9ascension6CWorld21AddToDefeatedMonstersEPN4core13CCardInstanceEtt
// 地址: 0xf8a1c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r4 = arg2
int32_t r0 = *__stack_chk_guard
void* r0_2 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_header.flags:2)
int32_t r1 = *(arg1 + 0xb7c)

if (r0_2 != 0)
    *(r0_2 + 0xc) = r1

*(arg1 + 0xb7c) = r1 + 1
int16_t r3
int16_t var_2a = r3
int32_t* r0_4 = *(arg1 + 0xba0)

if (r0_4 == *(arg1 + 0xba4))
    std::__ndk1::vector<ascension::DefeatedMonsterEvent, std::__ndk1::allocator<ascension::DefeatedMonsterEvent> >::__push_back_slow_path<ascension::DefeatedMonsterEvent const&>(
        arg1 + 0xb9c)
else
    *r0_4 = r4
    r0_4[1] = arg3.d
    *(arg1 + 0xba0) += 8

void* r0_9 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[0].offset:3)

if (r0_9 != 0)
    *(r0_9 + 0xc) = zx.d(*(r4 + 8))

int32_t r0_10 = *__stack_chk_guard

if (r0_10 == r0)
    return r0_10 - r0

__stack_chk_fail()
noreturn
