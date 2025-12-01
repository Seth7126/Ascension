// 函数: _ZN9ascension6CWorld17EnergizeConstructEPKNS_18CConstructInstanceE
// 地址: 0xf8d28
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t* r0_1 = *(arg1 + 0xbc4)
void* entry_r1

if (r0_1 == *(arg1 + 0xbc8))
    std::__ndk1::vector<ascension::CConstructInstance const*, std::__ndk1::allocator<ascension::CConstructInstance const*> >::__push_back_slow_path<ascension::CConstructInstance const* const&>(
        arg1 + 0xbc0)
else
    *r0_1 = entry_r1
    *(arg1 + 0xbc4) += 4

void* r0_6 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[0].file_size:1)

if (r0_6 != 0)
    *(r0_6 + 0xc) = zx.d(*(entry_r1 + 8))

int32_t r0_7 = *__stack_chk_guard

if (r0_7 == r0)
    return r0_7 - r0

__stack_chk_fail()
noreturn
