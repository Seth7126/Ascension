// 函数: _ZNK14ascensionrules36CStateBanishAllAdjacentFromCenterRow10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x13a0e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x38) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x3dc)
    ascension::CPlayer* result_1 = operator new(0x3dc)
    result = result_1
    *(arg1 + 0x3c)
    ascensionrules::CStateBanishAllAdjacentFromCenterRow::CStateBanishAllAdjacentFromCenterRow(
        result_1, r0_2)
else
    *(arg1 + 0x3c)
    ascensionrules::CStateBanishAllAdjacentFromCenterRow::CStateBanishAllAdjacentFromCenterRow(
        result, r0_2)
    *(result + 0x2c) = 0
    *arg4 += 0x3dc
    *arg_0 -= 0x3dc

void* r1_3 = *(result + 0x40)
*(result + 0x28) = arg1
(*(r1_3 + 8))(result + 0x40, result + 0x40, arg3)
(*(*(result + 0xc4) + 8))(result + 0xc4, result + 0xc4, arg3)
(*(*(result + 0x148) + 8))(result + 0x148, result + 0x148, arg3)
(*(*(result + 0x1cc) + 8))(result + 0x1cc, result + 0x1cc, arg3)
(*(*(result + 0x250) + 8))(result + 0x250, result + 0x250, arg3)
(*(*(result + 0x2d4) + 8))(result + 0x2d4, result + 0x2d4, arg3)
(*(*(result + 0x358) + 8))(result + 0x358, result + 0x358, arg3)
return result
