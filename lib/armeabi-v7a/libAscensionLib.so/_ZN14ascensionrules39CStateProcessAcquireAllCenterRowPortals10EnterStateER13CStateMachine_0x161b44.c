// 函数: _ZN14ascensionrules39CStateProcessAcquireAllCenterRowPortals10EnterStateER13CStateMachine
// 地址: 0x161b44
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x24c)
*(arg1 + 0x250) = 0
int32_t r6 = *(r0 + 4)
*(arg1 + 0x270) = 0
void* const r0_2 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_2 == 0)
    *(arg1 + 0x254) = 0
else
    if (*(*(r0_2 + 0xc) + 0x88) != 8)
        r0_2 = nullptr
    
    *(arg1 + 0x254) = r0_2

*(arg1 + 0x271) = 0
void* const r0_4 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_4 == 0)
    *(arg1 + 0x258) = 0
else
    if (*(*(r0_4 + 0xc) + 0x88) != 8)
        r0_4 = nullptr
    
    *(arg1 + 0x258) = r0_4

*(arg1 + 0x272) = 0
void* const r0_6 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_6 == 0)
    *(arg1 + 0x25c) = 0
else
    if (*(*(r0_6 + 0xc) + 0x88) != 8)
        r0_6 = nullptr
    
    *(arg1 + 0x25c) = r0_6

*(arg1 + 0x273) = 0
void* const r0_8 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_8 == 0)
    *(arg1 + 0x260) = 0
else
    if (*(*(r0_8 + 0xc) + 0x88) != 8)
        r0_8 = nullptr
    
    *(arg1 + 0x260) = r0_8

*(arg1 + 0x274) = 0
void* const r0_10 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_10 == 0)
    *(arg1 + 0x264) = 0
else
    if (*(*(r0_10 + 0xc) + 0x88) != 8)
        r0_10 = nullptr
    
    *(arg1 + 0x264) = r0_10

*(arg1 + 0x275) = 0
void* const r0_12 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_12 == 0)
    *(arg1 + 0x268) = 0
else
    if (*(*(r0_12 + 0xc) + 0x88) != 8)
        r0_12 = nullptr
    
    *(arg1 + 0x268) = r0_12

*(arg1 + 0x276) = 0
void* const r0_14 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_14 == 0)
    *(arg1 + 0x26c) = 0
else
    if (*(*(r0_14 + 0xc) + 0x88) != 8)
        r0_14 = nullptr
    
    *(arg1 + 0x26c) = r0_14

return ascensionrules::CStateProcessAcquireAllCenterRowPortals::BuildAcquireOptions(arg1) __tailcall
