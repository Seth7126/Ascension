// 函数: _ZN9ascension6CWorld18PutEventCardInPlayEPN4core13CCardInstanceE
// 地址: 0xf5788
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
ascension::CCardInPlayAbilityDefinition* r0_1 = operator new(0x3c)
ascension::CPlayer* r2 = *(arg1 + 4)
*(arg1 + 4) = r2 + 1
void* entry_r1
void* var_50 = entry_r1
ascension::CCardInPlayInstance::CCardInPlayInstance(r0_1, arg1, r2, nullptr)
core::CWorldBase::AddInstance(arg1)
uint32_t r7 = 0
void* r0_6 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[0].align:1)
uint32_t r1_2 = zx.d(*(r0_1 + 8))

if (r0_6 != 0)
    *(r0_6 + 0xc) = r1_2

int32_t var_44 = 6
int32_t var_48 = 0x8000003
uint32_t var_40 = r1_2
int32_t var_3c = 0
int32_t var_38 = 1
core::CWorldBase::SendStateChange(arg1, &var_48)
var_48 = 0x8000001
int32_t var_44_1 = 0x8000a01
var_40.b = 0xd
int32_t var_3c_1 = 0
int32_t var_38_1 = 0

if (entry_r1 != 0)
    r7 = zx.d(*(entry_r1 + 8))

int32_t var_30 = 1
uint32_t var_34 = r7
int32_t var_2c = 0
core::CWorldBase::SendStateChange(arg1, &var_48)
int32_t var_44_2 = 5
var_48 = 0x8000002
int32_t var_34_1 = 0
int32_t var_38_2 = 0
int32_t var_3c_2 = 0
int32_t var_40_1 = 0
core::CWorldBase::SendStateChange(arg1, &var_48)
void* r6_1 = *(entry_r1 + 0xc)
int32_t* r7_1 = *(r6_1 + 0x118)
int32_t r0_10 = *(r6_1 + 0x11c)

if (r7_1 != r0_10)
    do
        void* r1_6 = *r7_1
        int32_t r2_4 = *(r1_6 + 0x10)
        bool cond:1_1 = r2_4 s> 1
        
        if (r2_4 s>= 1)
            cond:1_1 = *(arg1 + 0x30) s> r2_4
        
        if (not(cond:1_1))
            int32_t r2_5 = *(r1_6 + 0x14)
            
            if (r2_5 s< 1 || *(arg1 + 0x30) s>= r2_5)
                ascension::CCardInPlayInstance::CreateActiveEffectInstance(r0_1)
                r0_10 = *(r6_1 + 0x11c)
        
        r7_1 = &r7_1[1]
    while (r7_1 != r0_10)

int32_t* i = *(r6_1 + 0x100)

while (i != *(r6_1 + 0x104))
    *i
    i = &i[1]
    ascension::CCardInPlayInstance::CreateCardInPlayAbilityInstance(r0_1)

*(arg1 + 0xa6c) = r0_1
int32_t r0_14 = *__stack_chk_guard

if (r0_14 == r0)
    return r0_14 - r0

__stack_chk_fail()
noreturn
