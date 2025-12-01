// 函数: _ZNK14ascensionrules29CStateMayPutConstructIntoPlay10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x13aea4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
*(*(arg1 + 0x250) + 8)
int32_t r0_5 = core::CWorldBase::GetInstanceByID(arg3)
*(*(arg1 + 0x258) + 8)
int32_t r0_8 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x2b0)
    uint32_t result_1 = operator new(0x2b0)
    int32_t r4_1 = *(arg1 + 0x254)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *result = _vtable_for_ascensionrules::CStateMayPutConstructIntoPlay + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r0_5
    *(result + 0x254) = r4_1
    *(result + 0x258) = r0_8
    *(result + 0x25c) = _vtable_for_ascension::CEventPutConstructIntoPlay + 8
    *(result + 0x260) = 0x18
    *(result + 0x264) = 0
    *(result + 0x2a8) = 0
    *(result + 0x2ac) = 0
else
    int32_t r8_1 = *(arg1 + 0x254)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateMayPutConstructIntoPlay + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r0_5
    *(result + 0x254) = r8_1
    *(result + 0x258) = r0_8
    *(result + 0x25c) = _vtable_for_ascension::CEventPutConstructIntoPlay + 8
    *(result + 0x260) = 0x18
    *(result + 0x264) = 0
    *(result + 0x2a8) = 0
    *(result + 0x2ac) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x2b0
    *arg_0 -= 0x2b0

*(result + 0x28) = arg1

if (*(arg1 + 0x38) s>= 1)
    (*(*result + 8))(result, arg2)

return result
