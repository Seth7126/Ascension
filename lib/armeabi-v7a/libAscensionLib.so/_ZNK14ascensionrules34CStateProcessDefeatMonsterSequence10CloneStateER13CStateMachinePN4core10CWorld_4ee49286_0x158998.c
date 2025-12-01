// 函数: _ZNK14ascensionrules34CStateProcessDefeatMonsterSequence10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x158998
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x30) + 8)
core::CCardInstance* r0_2 = core::CWorldBase::GetInstanceByID(arg3)
*(*(arg1 + 0x34) + 8)
uint32_t r0_5 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x99c)
    result = operator new(0x99c)
    uint32_t var_28_1 = zx.d(*(arg1 + 0x46))
    ascensionrules::CStateProcessDefeatMonsterSequence::CStateProcessDefeatMonsterSequence(result, 
        r0_2, r0_5, *(arg1 + 0x38), *(arg1 + 0x3c), (*(arg1 + 0x40)).b, *(arg1 + 0x44), 
        *(arg1 + 0x45))
else
    uint32_t var_28 = zx.d(*(arg1 + 0x46))
    ascensionrules::CStateProcessDefeatMonsterSequence::CStateProcessDefeatMonsterSequence(result, 
        r0_2, r0_5, *(arg1 + 0x38), *(arg1 + 0x3c), (*(arg1 + 0x40)).b, *(arg1 + 0x44), 
        *(arg1 + 0x45))
    *(result + 0x2c) = 0
    *arg4 += 0x99c
    *arg_0 -= 0x99c

*(result + 0x28) = arg1
*(result + 0x48) = *(arg1 + 0x48)
*(result + 0x4c) = *(arg1 + 0x4c)
void* r0_19 = *(arg1 + 0x50)
int32_t r0_21

if (r0_19 == 0)
    r0_21 = 0
else
    *(r0_19 + 8)
    r0_21 = core::CWorldBase::GetInstanceByID(arg3)

*(result + 0x50) = r0_21
ascension::CEventDefeatMonster::CloneEvent(result + 0x54, arg1 + 0x54)
ascension::CEventEnterCenterRow::CloneEvent(result + 0xc0, arg1 + 0xc0)
*(result + 0xbc) = result + 0xc0
ascension::CEventPutConstructIntoPlay::CloneEvent(result + 0x144, arg1 + 0x144)
*(result + 0x198) = *(arg1 + 0x198)
*(result + 0x48) = *(arg1 + 0x48)
return result
