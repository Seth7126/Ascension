// 函数: _ZNK14ascensionrules36CStateProcessPlayerChooseTurnActions10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x175a80
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
bool r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x1ae8)
    ascension::CPlayer* result_1 = operator new(0x1ae8)
    result = result_1
    *(arg1 + 0x250)
    ascensionrules::CStateProcessPlayerChooseTurnActions::CStateProcessPlayerChooseTurnActions(
        result_1, r0_2)
else
    *(arg1 + 0x250)
    ascensionrules::CStateProcessPlayerChooseTurnActions::CStateProcessPlayerChooseTurnActions(
        result, r0_2)
    *(result + 0x2c) = 0
    *arg4 += 0x1ae8
    *arg_0 -= 0x1ae8

*(result + 0x28) = arg1
ascension::CEventPutConstructIntoPlay::CloneEvent(result + 0xf04, arg1 + 0xf04)
ascension::CEventDefeatMonster::CloneEvent(result + 0xf58, arg1 + 0xf58)
*(result + 0x254) = *(arg1 + 0x254)

if (*(arg1 + 0x254) s>= 1)
    void* __offset(CStateMachine, 0x258) r7_1 = arg1 + 0x258
    ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry* r5_2 = result + 0x258
    int32_t i = 0
    
    do
        ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::CloneAcquireCardEntry(r5_2, 
            r7_1)
        i += 1
        r7_1 += 0x44
        r5_2 += 0x44
    while (i s< *(arg1 + 0x254))

*(result + 0xcb4) = *(arg1 + 0xcb4)

if (*(arg1 + 0xcb4) s>= 1)
    void* __offset(CStateMachine, 0xcb8) r7_2 = arg1 + 0xcb8
    ascension::CEventQueryCardDefeatAttributes::DefeatCardEntry* r5_3 = result + 0xcb8
    int32_t i_1 = 0
    
    do
        ascension::CEventQueryCardDefeatAttributes::DefeatCardEntry::CloneDefeatCardEntry(r5_3, 
            r7_2)
        i_1 += 1
        r7_2 += 0x34
        r5_3 += 0x34
    while (i_1 s< *(arg1 + 0xcb4))

*(result + 0xef4) = *(arg1 + 0xef4)
int32_t r0_20 = *(arg1 + 0xef4)

if (r0_20 s> 0)
    int32_t r5_4 = 0x44
    uint32_t r0_21
    int32_t r1_7
    r1_7:r0_21 = mulu.dp.d(r0_20, 0x44)
    
    if (r1_7 != 0)
        r1_7 = 1
    
    if (r1_7 != 0)
        r0_21 = 0xffffffff
    
    ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry* r0_22 = operator new[](r0_21)
    *(result + 0xef8) = r0_22
    ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::CloneAcquireCardEntry(r0_22, 
        *(arg1 + 0xef8))
    
    if (*(arg1 + 0xef4) s>= 2)
        int32_t i_2 = 1
        
        do
            ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::CloneAcquireCardEntry(
                *(result + 0xef8) + r5_4, *(arg1 + 0xef8) + r5_4)
            i_2 += 1
            r5_4 += 0x44
        while (i_2 s< *(arg1 + 0xef4))

*(result + 0xefc) = *(arg1 + 0xefc)
int32_t r0_28 = *(arg1 + 0xefc)

if (r0_28 s>= 1)
    int32_t r5_5 = 0x34
    uint32_t r0_29
    int32_t r1_11
    r1_11:r0_29 = mulu.dp.d(r0_28, 0x34)
    
    if (r1_11 != 0)
        r1_11 = 1
    
    if (r1_11 != 0)
        r0_29 = 0xffffffff
    
    ascension::CEventQueryCardDefeatAttributes::DefeatCardEntry* r0_30 = operator new[](r0_29)
    *(result + 0xf00) = r0_30
    ascension::CEventQueryCardDefeatAttributes::DefeatCardEntry::CloneDefeatCardEntry(r0_30, 
        *(arg1 + 0xf00))
    
    if (*(arg1 + 0xefc) s>= 2)
        int32_t i_3 = 1
        
        do
            ascension::CEventQueryCardDefeatAttributes::DefeatCardEntry::CloneDefeatCardEntry(
                *(result + 0xf00) + r5_5, *(arg1 + 0xf00) + r5_5)
            i_3 += 1
            r5_5 += 0x34
        while (i_3 s< *(arg1 + 0xefc))

int32_t r0_35 = *(arg1 + 0x38)

if (r0_35 s>= 1)
    int32_t r3 = *(arg1 + 0x40)
    *(result + 0x1ae4) = 1
    *(result + 0x38) = r0_35
    *(result + 0x40) = r3

return result
