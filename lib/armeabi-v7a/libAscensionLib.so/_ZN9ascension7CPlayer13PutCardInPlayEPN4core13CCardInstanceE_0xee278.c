// 函数: _ZN9ascension7CPlayer13PutCardInPlayEPN4core13CCardInstanceE
// 地址: 0xee278
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
uint32_t r4 = *(arg1 + 4)
ascension::CCardInPlayAbilityDefinition* result = operator new(0x3c)
ascension::CPlayer* r2 = *(r4 + 4)
*(r4 + 4) = r2 + 1
void* entry_r1
void* var_30 = entry_r1
ascension::CCardInPlayInstance::CCardInPlayInstance(result, r4, r2, arg1)
int32_t* r0_3 = *(arg1 + 0x4c)

if (r0_3 == *(arg1 + 0x50))
    std::__ndk1::vector<ascension::CCardInPlayInstance*, std::__ndk1::allocator<ascension::CCardInPlayInstance*> >::__push_back_slow_path<ascension::CCardInPlayInstance* const&>(
        arg1 + 0x48)
else
    *r0_3 = result
    *(arg1 + 0x4c) += 4

core::CWorldBase::AddInstance(r4)
void* r0_9 = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 
    &__elf_program_headers[7].physical_address:1)

if (r0_9 != 0)
    *(r0_9 + 0xc) = zx.d(*(result + 8))

void* r7_1 = *(entry_r1 + 0xc)

if (*(arg1 + 0x184) == 0 && *(r7_1 + 0x88) == 7)
    *(arg1 + 0x184) = entry_r1

int32_t* r6_1 = *(r7_1 + 0x118)
int32_t r0_12 = *(r7_1 + 0x11c)

if (r6_1 != r0_12)
    do
        void* r1_6 = *r6_1
        int32_t r2_1 = *(r1_6 + 0x10)
        bool cond:0_1 = r2_1 s> 1
        
        if (r2_1 s>= 1)
            cond:0_1 = *(r4 + 0x30) s> r2_1
        
        if (not(cond:0_1))
            int32_t r2_2 = *(r1_6 + 0x14)
            
            if (r2_2 s< 1 || *(r4 + 0x30) s>= r2_2)
                ascension::CCardInPlayInstance::CreateActiveEffectInstance(result)
                r0_12 = *(r7_1 + 0x11c)
        
        r6_1 = &r6_1[1]
    while (r6_1 != r0_12)

int32_t* i = *(r7_1 + 0x100)

while (i != *(r7_1 + 0x104))
    *i
    i = &i[1]
    ascension::CCardInPlayInstance::CreateCardInPlayAbilityInstance(result)

int32_t var_30_1 = 1
ascension::CWorld::OutputEvent(r4, 6, zx.d(*(result + 8)), zx.d(*(arg1 + 8)))

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
