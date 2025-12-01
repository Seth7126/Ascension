// 函数: _ZNK14ascensionrules39CStateProcessAcquireAllCenterRowPortals10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x162100
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x614)
    uint32_t result_1 = operator new(0x614)
    result = result_1
    ascensionrules::CStateProcessAcquireAllCenterRowPortals::CStateProcessAcquireAllCenterRowPortals(
        result_1)
else
    ascensionrules::CStateProcessAcquireAllCenterRowPortals::CStateProcessAcquireAllCenterRowPortals(
        result)
    *(result + 0x2c) = 0
    *arg4 += 0x614
    *arg_0 -= 0x614

*(result + 0x28) = arg1
int32_t r5 = 0x95
int32_t r8_2 = 0x278
int32_t i = 0
*(result + 0x250) = *(arg1 + 0x250)

do
    void* r0_10 = *(arg1 + 0x254 + (i << 2))
    int32_t r0_12
    
    if (r0_10 == 0)
        r0_12 = 0
    else
        *(r0_10 + 8)
        r0_12 = core::CWorldBase::GetInstanceByID(arg3)
    
    *(result + (r5 << 2)) = r0_12
    *(result + i + 0x270) = *(arg1 + i + 0x270)
    int32_t* r0_16 = result + r8_2
    (*(*r0_16 + 8))(r0_16, arg1 + r8_2, arg3)
    i += 1
    r8_2 += 0x84
    r5 += 1
while (i != 7)

if (*(arg1 + 0x38) s> 0)
    ascensionrules::CStateProcessAcquireAllCenterRowPortals::BuildAcquireOptions(result)

return result
