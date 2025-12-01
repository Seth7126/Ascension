// 函数: _ZN14ascensionrules49CStateProcessAcquireAllCenterRowHeroesToTopOfDeck10EnterStateER13CStateMachine
// 地址: 0x12ccc8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x24c)
*(arg1 + 0x434) = 0
int32_t r6 = *(r0 + 4)
*(arg1 + 0x454) = 0
void* const r0_2 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_2 == 0)
    *(arg1 + 0x438) = 0
else
    if (*(*(r0_2 + 0xc) + 0x88) != 1)
        r0_2 = nullptr
    
    *(arg1 + 0x438) = r0_2

*(arg1 + 0x455) = 0
void* const r0_4 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_4 == 0)
    *(arg1 + 0x43c) = 0
else
    if (*(*(r0_4 + 0xc) + 0x88) != 1)
        r0_4 = nullptr
    
    *(arg1 + 0x43c) = r0_4

*(arg1 + 0x456) = 0
void* const r0_6 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_6 == 0)
    *(arg1 + 0x440) = 0
else
    if (*(*(r0_6 + 0xc) + 0x88) != 1)
        r0_6 = nullptr
    
    *(arg1 + 0x440) = r0_6

*(arg1 + 0x457) = 0
void* const r0_8 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_8 == 0)
    *(arg1 + 0x444) = 0
else
    if (*(*(r0_8 + 0xc) + 0x88) != 1)
        r0_8 = nullptr
    
    *(arg1 + 0x444) = r0_8

*(arg1 + 0x458) = 0
void* const r0_10 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_10 == 0)
    *(arg1 + 0x448) = 0
else
    if (*(*(r0_10 + 0xc) + 0x88) != 1)
        r0_10 = nullptr
    
    *(arg1 + 0x448) = r0_10

*(arg1 + 0x459) = 0
void* const r0_12 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_12 == 0)
    *(arg1 + 0x44c) = 0
else
    if (*(*(r0_12 + 0xc) + 0x88) != 1)
        r0_12 = nullptr
    
    *(arg1 + 0x44c) = r0_12

*(arg1 + 0x45a) = 0
void* const r0_14 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_14 == 0)
    *(arg1 + 0x450) = 0
else
    if (*(*(r0_14 + 0xc) + 0x88) != 1)
        r0_14 = nullptr
    
    *(arg1 + 0x450) = r0_14

return ascensionrules::CStateProcessAcquireAllCenterRowHeroesToTopOfDeck::BuildAcquireOptions(arg1)
    __tailcall
