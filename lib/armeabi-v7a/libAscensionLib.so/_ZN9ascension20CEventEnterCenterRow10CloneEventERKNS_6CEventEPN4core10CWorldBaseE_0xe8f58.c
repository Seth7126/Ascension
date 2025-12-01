// 函数: _ZN9ascension20CEventEnterCenterRow10CloneEventERKNS_6CEventEPN4core10CWorldBaseE
// 地址: 0xe8f58
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
int32_t r0_17

if (r0_15 == 0)
    r0_17 = 0
else
    *(r0_15 + 8)
    r0_17 = core::CWorldBase::GetInstanceByID(entry_r2)

*(arg1 + 0x50) = r0_17
*(arg1 + 0x54) = *(arg2 + 0x54)
*(arg1 + 0x58) = *(arg2 + 0x58)
*(arg1 + 0x5c) = *(arg2 + 0x5c)
*(arg1 + 0x60) = *(arg2 + 0x60)
int32_t result = *(arg2 + 0x60)

if (result s>= 1)
    int32_t r4_3 = 0
    
    do
        void* r1_4 = *(arg2 + 0x64 + (r4_3 << 2))
        
        if (r1_4 == 0)
            *(arg1 + 0x64 + (r4_3 << 2)) = 0
        else
            *(r1_4 + 8)
            *(arg1 + 0x64 + (r4_3 << 2)) = core::CWorldBase::GetInstanceByID(entry_r2)
            result = *(arg2 + 0x60)
        
        r4_3 += 1
    while (r4_3 s< result)

return result
