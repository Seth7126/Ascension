// 函数: _ZNK14ascensionrules32CStateProcessAcquireCardSequence10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x11e96c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x30) + 8)
core::CCardInstance* r0_2 = core::CWorldBase::GetInstanceByID(arg3)
*(*(arg1 + 0x34) + 8)
uint32_t r0_5 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x990)
    result = operator new(0x990)
    int32_t var_2c_1 = *(arg1 + 0x40)
    ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(result, 
        r0_2, r0_5, *(arg1 + 0x38), *(arg1 + 0x3c))
else
    int32_t var_2c = *(arg1 + 0x40)
    ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(result, 
        r0_2, r0_5, *(arg1 + 0x38), *(arg1 + 0x3c))
    *(result + 0x2c) = 0
    *arg4 += 0x990
    *arg_0 -= 0x990

*(result + 0x28) = arg1
*(result + 0x44) = *(arg1 + 0x44)
*(result + 0x48) = *(arg1 + 0x48)
void* r0_18 = *(arg1 + 0x4c)
int32_t r0_20

if (r0_18 == 0)
    r0_20 = 0
else
    *(r0_18 + 8)
    r0_20 = core::CWorldBase::GetInstanceByID(arg3)

*(result + 0x4c) = r0_20
ascension::CEventAcquireCard::CloneEvent(result + 0x50, arg1 + 0x50)
ascension::CEventEnterCenterRow::CloneEvent(result + 0xb8, arg1 + 0xb8)
ascension::CEventPutConstructIntoPlay::CloneEvent(result + 0x13c, arg1 + 0x13c)
*(result + 0xb4) = result + 0xb8
return result
