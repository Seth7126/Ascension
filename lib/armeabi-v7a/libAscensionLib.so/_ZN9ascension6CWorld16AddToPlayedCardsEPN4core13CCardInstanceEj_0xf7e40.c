// 函数: _ZN9ascension6CWorld16AddToPlayedCardsEPN4core13CCardInstanceEj
// 地址: 0xf7e40
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
uint32_t* r0_1 = *(arg1 + 0xb84)
int32_t r0_3

if (r0_1 == *(arg1 + 0xb88))
    std::__ndk1::vector<ascension::PlayedCardEvent, std::__ndk1::allocator<ascension::PlayedCardEvent> >::__push_back_slow_path<ascension::PlayedCardEvent const&>(
        arg1 + 0xb80)
    r0_3 = *(arg1 + 0xb84)
else
    *r0_1 = arg2
    uint32_t entry_r2
    r0_1[1] = entry_r2
    r0_3 = *(arg1 + 0xb84) + 8
    *(arg1 + 0xb84) = r0_3

int32_t var_2c = 0x2b
int32_t r0_5 = r0_3 - *(arg1 + 0xb80)
int32_t var_30 = 0x8000003
int32_t var_28 = 1
int32_t var_20 = 0
int32_t var_24 = 0xffffffff + (r0_5 s>> 3)
core::CWorldBase::SendStateChange(arg1, &var_30)
void* r0_9 =
    core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[0].physical_address:2)

if (r0_9 != 0)
    *(r0_9 + 0xc) = zx.d(*(arg2 + 8))

int32_t r0_10 = *__stack_chk_guard

if (r0_10 == r0)
    return r0_10 - r0

__stack_chk_fail()
noreturn
