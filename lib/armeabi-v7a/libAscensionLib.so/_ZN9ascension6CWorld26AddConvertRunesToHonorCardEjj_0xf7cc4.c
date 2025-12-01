// 函数: _ZN9ascension6CWorld26AddConvertRunesToHonorCardEjj
// 地址: 0xf7cc4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
uint32_t* r0_1 = *(arg1 + 0xb74)

if (r0_1 == *(arg1 + 0xb78))
    std::__ndk1::vector<ascension::ConvertRunesToHonorEvent, std::__ndk1::allocator<ascension::ConvertRunesToHonorEvent> >::__push_back_slow_path<ascension::ConvertRunesToHonorEvent const&>(
        arg1 + 0xb70)
else
    *r0_1 = arg2
    uint32_t entry_r2
    r0_1[1] = entry_r2
    *(arg1 + 0xb74) += 8

void* r0_6 =
    core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[1].physical_address:1)

if (r0_6 != 0)
    *(r0_6 + 0xc) = arg2

int32_t r0_7 = *__stack_chk_guard

if (r0_7 == r0)
    return r0_7 - r0

__stack_chk_fail()
noreturn
