// 函数: _ZNK14ascensionrules38CStateTakeRandomCardFromSingleOpponent10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x14a68c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x250)
    uint32_t result_1 = operator new(0x250)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *(result + 0x24c) = r0_2
    *result = _vtable_for_ascensionrules::CStateTakeRandomCardFromSingleOpponent + 8
else
    CGameStateOptions::CGameStateOptions(result.b)
    *(result + 0x24c) = r0_2
    *result = _vtable_for_ascensionrules::CStateTakeRandomCardFromSingleOpponent + 8
    *(result + 0x2c) = 0
    *arg4 += 0x250
    *arg_0 -= 0x250

*(result + 0x28) = arg1

if (*(arg1 + 0x38) s>= 1)
    (*(*result + 8))(result, arg2)

return result
