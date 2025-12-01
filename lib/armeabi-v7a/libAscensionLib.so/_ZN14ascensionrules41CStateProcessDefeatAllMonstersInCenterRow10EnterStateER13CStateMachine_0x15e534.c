// 函数: _ZN14ascensionrules41CStateProcessDefeatAllMonstersInCenterRow10EnterStateER13CStateMachine
// 地址: 0x15e534
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x24c)
*(arg1 + 0x494) = 0
*(arg1 + 0x250) = 0
*(arg1 + 0x490) = 0
*(arg1 + 0x4bc) = 0
int32_t r6 = *(r0 + 4)
*(arg1 + 0x4b4) = 0
void* const r0_2 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_2 == 0)
    *(arg1 + 0x498) = 0
else
    if (*(*(r0_2 + 0xc) + 0x88) != 3)
        r0_2 = nullptr
    
    *(arg1 + 0x498) = r0_2

*(arg1 + 0x4b5) = 0
void* const r0_4 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_4 == 0)
    *(arg1 + 0x49c) = 0
else
    if (*(*(r0_4 + 0xc) + 0x88) != 3)
        r0_4 = nullptr
    
    *(arg1 + 0x49c) = r0_4

*(arg1 + 0x4b6) = 0
void* const r0_6 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_6 == 0)
    *(arg1 + 0x4a0) = 0
else
    if (*(*(r0_6 + 0xc) + 0x88) != 3)
        r0_6 = nullptr
    
    *(arg1 + 0x4a0) = r0_6

*(arg1 + 0x4b7) = 0
void* const r0_8 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_8 == 0)
    *(arg1 + 0x4a4) = 0
else
    if (*(*(r0_8 + 0xc) + 0x88) != 3)
        r0_8 = nullptr
    
    *(arg1 + 0x4a4) = r0_8

*(arg1 + 0x4b8) = 0
void* const r0_10 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_10 == 0)
    *(arg1 + 0x4a8) = 0
else
    if (*(*(r0_10 + 0xc) + 0x88) != 3)
        r0_10 = nullptr
    
    *(arg1 + 0x4a8) = r0_10

*(arg1 + 0x4b9) = 0
void* const r0_12 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_12 == 0)
    *(arg1 + 0x4ac) = 0
else
    if (*(*(r0_12 + 0xc) + 0x88) != 3)
        r0_12 = nullptr
    
    *(arg1 + 0x4ac) = r0_12

*(arg1 + 0x4ba) = 0
void* const r0_14 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_14 == 0)
    *(arg1 + 0x4b0) = 0
else
    if (*(*(r0_14 + 0xc) + 0x88) != 3)
        r0_14 = nullptr
    
    *(arg1 + 0x4b0) = r0_14

if (*(r6 + 0x30) u> 0xc)
    void* r1_21 = *(arg1 + 0x24c)
    int32_t* i = *(r1_21 + 0x54)
    
    if (i != *(r1_21 + 0x58))
        do
            void* r2_3 = *i
            
            if (zx.d(*(*(*(r2_3 + 0x10) + 0xc) + 0xcb)) != 0
                    && *(r2_3 + 0x4c) - *(r2_3 + 0x48) == 4)
                int32_t r1_22 = *(arg1 + 0x4bc)
                *(arg1 + 0x4bc) = r1_22 + 1
                *(arg1 + (r1_22 << 2) + 0x4c0) = r2_3
                r1_21 = *(arg1 + 0x24c)
            
            i = &i[1]
        while (i != *(r1_21 + 0x58))

return ascensionrules::CStateProcessDefeatAllMonstersInCenterRow::BuildDefeatOptions(arg1)
    __tailcall
