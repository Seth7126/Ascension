// 函数: _ZN9ascension26CEventDiscardCardsFromHand10CloneEventERKNS_6CEventEPN4core10CWorldBaseE
// 地址: 0xe9768
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
*(arg1 + 8) = *(arg2 + 8)
uint32_t entry_r2

if (zx.d(*(arg2 + 8)) != 0)
    int32_t i = 0
    
    do
        *(*(arg2 + 0xc + (i << 2)) + 8)
        *(arg1 + 0xc + (i << 2)) = core::CWorldBase::GetInstanceByID(entry_r2)
        i += 1
    while (i u< zx.d(*(arg2 + 8)))

*(arg1 + 0xa) = *(arg2 + 0xa)

if (zx.d(*(arg2 + 0xa)) != 0)
    int32_t i_1 = 0
    
    do
        *(*(arg2 + 0x2c + (i_1 << 2)) + 8)
        *(arg1 + 0x2c + (i_1 << 2)) = core::CWorldBase::GetInstanceByID(entry_r2)
        i_1 += 1
    while (i_1 u< zx.d(*(arg2 + 0xa)))

void* r0_13 = *(arg2 + 0x4c)
int32_t r0_15

if (r0_13 == 0)
    r0_15 = 0
else
    *(r0_13 + 8)
    r0_15 = core::CWorldBase::GetInstanceByID(entry_r2)

*(arg1 + 0x4c) = r0_15
void* r0_16 = *(arg2 + 0x50)
int32_t r0_18

if (r0_16 == 0)
    r0_18 = 0
else
    *(r0_16 + 8)
    r0_18 = core::CWorldBase::GetInstanceByID(entry_r2)

int32_t r1_4 = *(arg1 + 0x54)
*(arg1 + 0x50) = r0_18
*(arg1 + 0x58) = r1_4

for (int32_t* i_2 = *(arg2 + 0x54); i_2 != *(arg2 + 0x58); i_2 = &i_2[1])
    *(*i_2 + 8)
    int32_t r0_22 = core::CWorldBase::GetInstanceByID(entry_r2)
    int32_t var_2c_1 = r0_22
    int32_t* r1_6 = *(arg1 + 0x58)
    
    if (r1_6 u>= *(arg1 + 0x5c))
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance*>(
            arg1 + 0x54)
    else
        *r1_6 = r0_22
        *(arg1 + 0x58) += 4

int32_t r0_27 = *__stack_chk_guard

if (r0_27 == r0)
    return r0_27 - r0

__stack_chk_fail()
noreturn
