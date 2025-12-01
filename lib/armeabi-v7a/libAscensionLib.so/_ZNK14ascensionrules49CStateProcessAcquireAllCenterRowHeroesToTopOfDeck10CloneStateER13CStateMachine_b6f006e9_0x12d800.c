// 函数: _ZNK14ascensionrules49CStateProcessAcquireAllCenterRowHeroesToTopOfDeck10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x12d800
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char*& r5 = arg3
*(*(arg1 + 0x24c) + 8)
bool r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
core::CWorldBase* var_34 = arg2
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x860)
    ascension::CPlayer* result_1 = operator new(0x860)
    result = result_1
    *(arg1 + 0x250)
    ascensionrules::CStateProcessAcquireAllCenterRowHeroesToTopOfDeck::CStateProcessAcquireAllCenterRowHeroesToTopOfDeck(
        result_1, r0_2)
else
    *(arg1 + 0x250)
    ascensionrules::CStateProcessAcquireAllCenterRowHeroesToTopOfDeck::CStateProcessAcquireAllCenterRowHeroesToTopOfDeck(
        result, r0_2)
    *(result + 0x2c) = 0
    *arg4 += 0x860
    *arg_0 -= 0x860

*(result + 0x28) = arg1
int32_t r4_1 = 0x45c
int32_t r10_1 = 0
*(result + 0x434) = *(arg1 + 0x434)
int32_t r7_1 = 0x10e

for (int32_t i = 0; i != 7; )
    void* r0_13 = *(arg1 + 0x438 + (i << 2))
    int32_t r0_15
    char*& r9_2
    
    if (r0_13 == 0)
        r0_15 = 0
        r9_2 = r5
    else
        *(r0_13 + 8)
        r9_2 = r5
        r0_15 = core::CWorldBase::GetInstanceByID(r5)
    
    *(result + (r7_1 << 2)) = r0_15
    r5 = r9_2
    *(result + i + 0x454) = *(arg1 + 0x45c + i - 8)
    (*(*(result + r10_1 + 0x45c) + 8))(result + r4_1, arg1 + 0x45c + r10_1, r9_2)
    i += 1
    r4_1 += 0x84
    r10_1 += 0x84
    r7_1 += 1

ascension::CEventAcquireCard::CloneEvent(result + 0x7f8, arg1 + 0x7f8)

if (*(arg1 + 0x38) s> 0)
    ascensionrules::CStateProcessAcquireAllCenterRowHeroesToTopOfDeck::BuildAcquireOptions(result)

return result
