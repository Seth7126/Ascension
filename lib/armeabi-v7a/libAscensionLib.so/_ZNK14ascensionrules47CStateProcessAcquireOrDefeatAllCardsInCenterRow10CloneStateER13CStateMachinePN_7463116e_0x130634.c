// 函数: _ZNK14ascensionrules47CStateProcessAcquireOrDefeatAllCardsInCenterRow10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x130634
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
uint32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0xb3c)
    result = operator new(0xb3c)
    uint32_t var_30_1 = zx.d(*(arg1 + 0x258))
    ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::CStateProcessAcquireOrDefeatAllCardsInCenterRow(
        result, r0_2, *(arg1 + 0x250), (*(arg1 + 0x254)).b)
else
    uint32_t var_30 = zx.d(*(arg1 + 0x258))
    ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::CStateProcessAcquireOrDefeatAllCardsInCenterRow(
        result, r0_2, *(arg1 + 0x250), (*(arg1 + 0x254)).b)
    *(result + 0x2c) = 0
    *arg4 += 0xb3c
    *arg_0 -= 0xb3c

*(result + 0x28) = arg1
int32_t i = 0x6e4
int32_t r7 = 0x6a0
*(result + 0x67c) = *(arg1 + 0x67c)
int32_t r6_2 = 0x6a8
*(result + 0x680) = *(arg1 + 0x680)

do
    void* r0_16 = *(arg1 + r6_2 - 0x24)
    
    if (r0_16 == 0)
        *(result + r6_2 - 0x24) = 0
    else
        *(r0_16 + 8)
        *(result + r6_2 - 0x24) = core::CWorldBase::GetInstanceByID(arg3)
    
    *(result + r7) = *(arg1 + r7)
    void* r0_21 = *(arg1 + r6_2)
    
    if (r0_21 == 0)
        *(result + r6_2) = 0
    else
        *(r0_21 + 8)
        *(result + r6_2) = core::CWorldBase::GetInstanceByID(arg3)
    
    *(result + r7 + 0x24) = *(arg1 + r7 + 0x24)
    int32_t* r0_27 = result + i
    (*(*r0_27 + 8))(r0_27, arg1 + i, arg3)
    i += 0x84
    r6_2 += 4
    r7 += 1
while (i != 0xa80)

*(result + 0x6cc) = *(arg1 + 0x6cc)

if (*(arg1 + 0x6cc) s>= 1)
    int32_t i_1 = 0
    
    do
        void* r0_31 = *(arg1 + 0x6e0 + (i_1 << 2) - 0x10)
        
        if (r0_31 == 0)
            *(result + 0x6e0 + (i_1 << 2) - 0x10) = 0
        else
            *(r0_31 + 8)
            *(result + 0x6e0 + (i_1 << 2) - 0x10) = core::CWorldBase::GetInstanceByID(arg3)
        
        (result + 0x6e0)[i_1] = *(arg1 + 0x6e0 + i_1)
        i_1 += 1
    while (i_1 s< *(arg1 + 0x6cc))

ascension::CEventAcquireCard::CloneEvent(result + 0xa80, arg1 + 0xa80)
ascension::CEventPutConstructIntoPlay::CloneEvent(result + 0xae8, arg1 + 0xae8)

if (*(arg1 + 0x38) s> 0)
    ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::BuildAcquireOrDefeatOptions(
        result)

return result
