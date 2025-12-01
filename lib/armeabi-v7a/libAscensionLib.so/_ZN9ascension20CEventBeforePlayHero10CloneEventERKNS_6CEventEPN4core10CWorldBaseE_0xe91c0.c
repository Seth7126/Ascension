// 函数: _ZN9ascension20CEventBeforePlayHero10CloneEventERKNS_6CEventEPN4core10CWorldBaseE
// 地址: 0xe91c0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

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

void* r0_12 = *(arg2 + 0x4c)
int32_t r0_14

if (r0_12 == 0)
    r0_14 = 0
else
    *(r0_12 + 8)
    r0_14 = core::CWorldBase::GetInstanceByID(entry_r2)

*(arg1 + 0x4c) = r0_14
void* r0_15 = *(arg2 + 0x50)

if (r0_15 == 0)
    *(arg1 + 0x50) = 0
    return 0

*(r0_15 + 8)
int32_t result = core::CWorldBase::GetInstanceByID(entry_r2)
*(arg1 + 0x50) = result
return result
