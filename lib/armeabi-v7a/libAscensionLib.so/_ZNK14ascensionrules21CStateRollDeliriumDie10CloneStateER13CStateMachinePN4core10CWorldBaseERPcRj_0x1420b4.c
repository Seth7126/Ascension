// 函数: _ZNK14ascensionrules21CStateRollDeliriumDie10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x1420b4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x30) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void* r0_3 = *(arg1 + 0x34)
int32_t r7

if (r0_3 == 0)
    r7 = 0
else
    *(r0_3 + 8)
    r7 = core::CWorldBase::GetInstanceByID(arg3)

uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x43c)
    result = operator new(0x43c)
    CState::CState()
    *result = _vtable_for_ascensionrules::CStateRollDeliriumDie + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r7
    *(result + 0x38) = 0
    CState::SetEmbeddedStateBuffer(result, 0x400)
else
    CState::CState()
    *result = _vtable_for_ascensionrules::CStateRollDeliriumDie + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r7
    *(result + 0x38) = 0
    CState::SetEmbeddedStateBuffer(result, 0x400)
    *(result + 0x2c) = 0
    *arg4 += 0x43c
    *arg_0 -= 0x43c

*(result + 0x28) = arg1
*(result + 0x38) = *(arg1 + 0x38)
return result
