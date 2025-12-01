// 函数: _ZN9ascension6CWorld10CreateCardEPKNS_5CCardE
// 地址: 0xf4d78
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
core::CWorldBase* result = operator new(0x10)
core::CCard* r2 = *(arg1 + 4)
*(arg1 + 4) = r2 + 1
core::CCardInstance::CCardInstance(result, arg1, r2)
core::CWorldBase::AddInstance(arg1)
int32_t* r0_4 = *(arg1 + 0xac0)

if (r0_4 == *(arg1 + 0xac4))
    std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
        arg1 + 0xabc)
else
    *r0_4 = result
    *(arg1 + 0xac0) += 4

int32_t r0_8 = *(arg1 + 0x30)
void* entry_r1

if (r0_8 == 4)
label_f4e34:
    core::CInstance** i = *(entry_r1 + 0x130)
    
    while (i != *(entry_r1 + 0x134))
        core::CInstance* r1_3 = *i
        i = &i[1]
        ascension::CWorld::AddGlobalActiveEffect(arg1, r1_3)
else if (r0_8 u<= 3 && strcasecmp(entry_r1 + 4, "Samael the Fallen") != 0)
    goto label_f4e34
uint32_t r5_1 = 0
void* r0_14 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_header.section_header_count)

if (r0_14 != 0)
    if (result != 0)
        r5_1 = zx.d(*(result + 8))
    
    *(r0_14 + 0xc) = r5_1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
