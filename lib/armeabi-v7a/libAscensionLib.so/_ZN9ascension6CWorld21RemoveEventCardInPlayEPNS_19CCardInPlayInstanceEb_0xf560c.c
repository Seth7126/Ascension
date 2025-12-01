// 函数: _ZN9ascension6CWorld21RemoveEventCardInPlayEPNS_19CCardInPlayInstanceEb
// 地址: 0xf560c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r5 = arg2
int32_t r0 = *__stack_chk_guard
void* r0_2 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[0].align:2)

if (r0_2 != 0)
    *(r0_2 + 0xc) = zx.d(*(r5 + 8))

void* const var_44
int32_t entry_r2

if (entry_r2 != 0)
    void* r0_3 = *(r5 + 0x10)
    var_44 = 0x8000001
    int32_t var_40_1 = 0xd000601
    int32_t var_3c
    var_3c.b = 9
    int32_t var_38_1 = 0
    uint32_t r2 = 0
    int32_t var_34_1 = 0
    
    if (r0_3 != 0)
        r2 = zx.d(*(r0_3 + 8))
    
    struct Elf32_Header* const var_2c_1 = &__elf_header
    uint32_t var_30_1 = r2
    int32_t var_28_1 = 0
    core::CWorldBase::SendStateChange(arg1, &var_44)

uint32_t r0_6 = zx.d(*(*(arg1 + 0xa6c) + 8))
int32_t var_40_2 = 6
var_44 = 0x8000003
uint32_t var_3c_1 = r0_6
int32_t var_38_2 = 0
int32_t var_34_2 = 0
core::CWorldBase::SendStateChange(arg1, &var_44)
*(arg1 + 0xa6c) = 0
int32_t* i = *(r5 + 0x14)

while (i != *(r5 + 0x18))
    *i
    i = &i[1]
    ascension::CWorld::RemoveActiveEffect(arg1)

var_44 = r5
void** r0_10 = *(arg1 + 0xa9c)

if (r0_10 u>= *(arg1 + 0xaa0))
    std::__ndk1::vector<core::CInstance*, std::__ndk1::allocator<core::CInstance*> >::__push_back_slow_path<core::CInstance*>(
        arg1 + 0xa98)
    
    if (entry_r2 != 0)
        *(r5 + 0x10)
        ascension::CWorld::PutCardInVoid(arg1)
else
    *r0_10 = r5
    *(arg1 + 0xa9c) += 4
    
    if (entry_r2 != 0)
        *(r5 + 0x10)
        ascension::CWorld::PutCardInVoid(arg1)

if (*__stack_chk_guard == r0)
    return 1

__stack_chk_fail()
noreturn
