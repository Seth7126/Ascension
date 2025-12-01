// 函数: _ZN9ascension6CWorld21AddGlobalActiveEffectEPKNS_23CActiveEffectDefinitionEPN4core9CInstanceE
// 地址: 0xf45b8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
core::CWorldBase* r0_1 = operator new(0x150)
ascension::CActiveEffectDefinition* r2 = *(arg1 + 4)
*(arg1 + 4) = r2 + 1
core::CInstance* entry_r2
core::CInstance* var_34 = entry_r2
ascension::CActiveEffectInstance::CActiveEffectInstance(r0_1, arg1, r2, arg2, entry_r2)
core::CWorldBase::AddInstance(arg1)
core::CWorldBase** r0_5 = *(arg1 + 0xa90)

if (r0_5 == *(arg1 + 0xa94))
    std::__ndk1::vector<ascension::CActiveEffectInstance*, std::__ndk1::allocator<ascension::CActiveEffectInstance*> >::__push_back_slow_path<ascension::CActiveEffectInstance* const&>(
        arg1 + 0xa8c)
else
    *r0_5 = r0_1
    *(arg1 + 0xa90) += 4

void* r0_10 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_header.string_table:1)
int32_t r2_1 = 0
int32_t r7_1 = 0

if (r0_10 != 0)
    *(r0_10 + 0xc) = zx.d(*(r0_1 + 8))

if (*(arg1 + 0x30) u>= 6)
    r2_1 = *(*(r0_1 + 0xc) + 0x18)

int32_t* r3_3 = *(arg1 + 0xaa4)
ascension::CActiveEffectInstance** r1_4 = *(arg1 + 0xaa8)

if (r1_4 == r3_3 || r2_1 s< *(*(*r3_3 + 0xc) + 0x18))
    r1_4 = r3_3
else
    void* r3_5 = &r3_3[1]
    int32_t r6_4 = 1
    
    while (true)
        r7_1 = r6_4
        
        if (r1_4 == r3_5)
            break
        
        void* r6_5 = *r3_5
        r3_5 += 4
        r6_4 = r7_1 + 1
        
        if (r2_1 s< *(*(r6_5 + 0xc) + 0x18))
            r1_4 = r3_5 - 4
            break

std::__ndk1::vector<ascension::CActiveEffectInstance*, std::__ndk1::allocator<ascension::CActiveEffectInstance*> >::insert(
    arg1 + 0xaa4, r1_4)
void* r0_16 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_header.section_header_count:1)

if (r0_16 != 0)
    uint32_t r1_6 = zx.d(*(r0_1 + 8))
    *(r0_16 + 0x10) = r7_1.w
    *(r0_16 + 0xc) = r1_6
    *(r0_16 + 0x12) = ((*(arg1 + 0xaa8) - *(arg1 + 0xaa4)) u>> 2).w

int32_t r0_17 = *__stack_chk_guard

if (r0_17 == r0)
    return r0_17 - r0

__stack_chk_fail()
noreturn
