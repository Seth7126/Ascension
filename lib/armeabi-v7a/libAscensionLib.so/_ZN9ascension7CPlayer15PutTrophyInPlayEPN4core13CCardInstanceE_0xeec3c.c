// 函数: _ZN9ascension7CPlayer15PutTrophyInPlayEPN4core13CCardInstanceE
// 地址: 0xeec3c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
uint32_t r4 = *(arg1 + 4)
ascension::CActiveEffectDefinition* result = operator new(0x48)
ascension::CPlayer* r2 = *(r4 + 4)
*(r4 + 4) = r2 + 1
void* entry_r1
void* var_30 = entry_r1
ascension::CTrophyInstance::CTrophyInstance(result, r4, r2, arg1)
int32_t* r0_3 = *(arg1 + 0x64)

if (r0_3 == *(arg1 + 0x68))
    std::__ndk1::vector<ascension::CTrophyInstance*, std::__ndk1::allocator<ascension::CTrophyInstance*> >::__push_back_slow_path<ascension::CTrophyInstance* const&>(
        arg1 + 0x60)
else
    *r0_3 = result
    *(arg1 + 0x64) += 4

core::CWorldBase::AddInstance(r4)
void* r0_9 = core::CWorldBase::AddRollbackData(*(arg1 + 4), zx.d(*(arg1 + 8)), 
    &__elf_program_headers[7].file_size:1)

if (r0_9 != 0)
    *(r0_9 + 0xc) = zx.d(*(result + 8))

void* r6_1 = *(entry_r1 + 0xc)
int32_t* r7_1 = *(r6_1 + 0x118)
int32_t r0_10 = *(r6_1 + 0x11c)

if (r7_1 != r0_10)
    do
        void* r1_6 = *r7_1
        int32_t r2_1 = *(r1_6 + 0x10)
        bool cond:0_1 = r2_1 s> 1
        
        if (r2_1 s>= 1)
            cond:0_1 = *(r4 + 0x30) s> r2_1
        
        if (not(cond:0_1))
            int32_t r2_2 = *(r1_6 + 0x14)
            
            if (r2_2 s< 1 || *(r4 + 0x30) s>= r2_2)
                ascension::CCardInPlayInstance::CreateActiveEffectInstance(result)
                r0_10 = *(r6_1 + 0x11c)
        
        r7_1 = &r7_1[1]
    while (r7_1 != r0_10)

int32_t var_30_1 = 1
ascension::CWorld::OutputEvent(r4, 6, zx.d(*(result + 8)), zx.d(*(arg1 + 8)))

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
