// 函数: _ZN9ascension6CWorld16CreatePortalCardEPKNS_5CCardE
// 地址: 0xf5e88
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
core::CWorldBase* result = operator new(0x18)
ascension::CCard* r2 = *(arg1 + 4)
*(arg1 + 4) = r2 + 1
ascension::CPortalCardInstance::CPortalCardInstance(result, arg1, r2)
core::CWorldBase::AddInstance(arg1)
core::CWorldBase* result_1 = result
void** r0_4 = *(arg1 + 0xac0)

if (r0_4 u>= *(arg1 + 0xac4))
    std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance*>(
        arg1 + 0xabc)
else
    *r0_4 = result
    *(arg1 + 0xac0) += 4

void* r0_9 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_header.section_header_count)

if (r0_9 != 0)
    *(r0_9 + 0xc) = zx.d(*(result + 8))

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
