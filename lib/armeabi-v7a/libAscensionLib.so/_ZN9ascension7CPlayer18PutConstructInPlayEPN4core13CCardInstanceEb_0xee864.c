// 函数: _ZN9ascension7CPlayer18PutConstructInPlayEPN4core13CCardInstanceEb
// 地址: 0xee864
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r7 = arg2
int32_t r0 = *__stack_chk_guard
uint32_t r4 = *(arg1 + 4)
ascension::CActiveEffectDefinition* result = operator new(0x54)
ascension::CPlayer* r2 = *(r4 + 4)
*(r4 + 4) = r2 + 1
void* var_30 = r7
ascension::CConstructInstance::CConstructInstance(result, r4, r2, arg1)
int32_t* r0_3 = *(arg1 + 0x58)

if (r0_3 == *(arg1 + 0x5c))
    std::__ndk1::vector<ascension::CConstructInstance*, std::__ndk1::allocator<ascension::CConstructInstance*> >::__push_back_slow_path<ascension::CConstructInstance* const&>(
        arg1 + 0x54)
else
    *r0_3 = result
    *(arg1 + 0x58) += 4

core::CWorldBase::AddInstance(r4)
int32_t entry_r2
void* __offset(core::CCardInstance, 0x8) r10_1

if (entry_r2 == 0)
    r10_1 = arg1 + 8
else
    ascension::CWorld::AddToPlayedConstructs(r4)
    r10_1 = arg1 + 8
    int32_t var_30_1 = 0
    ascension::CWorld::OutputEvent(r4, 0x24, zx.d(*r10_1), zx.d(*(r7 + 8)))

void* r0_11 = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 
    &__elf_program_headers[7].physical_address:3)

if (r0_11 != 0)
    *(r0_11 + 0xc) = zx.d(*(result + 8))

void* r7_1 = *(r7 + 0xc)
int32_t r0_12 = *(r7_1 + 0x88)

if (r0_12 == 1)
    if (*(r7_1 + 0xe8) != 0)
        ascension::CConstructInstance::CreateConstructAbilityInstance(result)
else if (r0_12 == 2)
    int32_t* i = *(r7_1 + 0x10c)
    
    while (i != *(r7_1 + 0x110))
        *i
        i = &i[1]
        ascension::CConstructInstance::CreateConstructAbilityInstance(result)
    
    int32_t* r6_1 = *(r7_1 + 0x118)
    int32_t r0_15 = *(r7_1 + 0x11c)
    
    if (r6_1 != r0_15)
        do
            void* r1_8 = *r6_1
            int32_t r2_2 = *(r1_8 + 0x10)
            bool cond:0_1 = r2_2 s> 1
            
            if (r2_2 s>= 1)
                cond:0_1 = *(r4 + 0x30) s> r2_2
            
            if (not(cond:0_1))
                int32_t r2_3 = *(r1_8 + 0x14)
                
                if (r2_3 s< 1 || *(r4 + 0x30) s>= r2_3)
                    ascension::CCardInPlayInstance::CreateActiveEffectInstance(result)
                    r0_15 = *(r7_1 + 0x11c)
            
            r6_1 = &r6_1[1]
        while (r6_1 != r0_15)

if (zx.d(*(r7_1 + 0xe5)) != 0)
    void* r0_20 = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 
        &__elf_program_headers[7].virtual_address:1)
    int32_t r1_11 = *(arg1 + 0xa8)
    
    if (r0_20 != 0)
        *(r0_20 + 0xc) = r1_11
    
    *(arg1 + 0xa8) = r1_11 + 1

int32_t var_30_2 = 1
ascension::CWorld::OutputEvent(r4, 6, zx.d(*(result + 8)), zx.d(*r10_1))

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
