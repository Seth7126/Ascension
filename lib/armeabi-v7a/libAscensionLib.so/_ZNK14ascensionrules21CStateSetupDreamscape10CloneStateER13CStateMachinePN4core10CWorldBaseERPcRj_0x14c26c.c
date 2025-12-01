// 函数: _ZNK14ascensionrules21CStateSetupDreamscape10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x14c26c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x164)
    CStateMachine* result_1 = operator new(0x164)
    int32_t r7_1 = *(arg1 + 0x15c)
    result = result_1
    int32_t r9_1 = *(arg1 + 0x160)
    CGameStateSimultaneous::CGameStateSimultaneous(result_1)
    *result = _vtable_for_ascensionrules::CStateSetupDreamscape + 8
    *(result + 0x158) = arg3
    *(result + 0x15c) = r7_1
    *(result + 0x160) = r9_1
else
    int32_t r10_1 = *(arg1 + 0x15c)
    int32_t r9 = *(arg1 + 0x160)
    CGameStateSimultaneous::CGameStateSimultaneous(result)
    *result = _vtable_for_ascensionrules::CStateSetupDreamscape + 8
    *(result + 0x158) = arg3
    *(result + 0x15c) = r10_1
    *(result + 0x160) = r9
    *(result + 0x2c) = 0
    *arg4 += 0x164
    *arg_0 -= 0x164

*(result + 0x28) = arg1
return result
