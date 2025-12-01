// 函数: _ZNK14ascensionrules26CStateProcessAcquirePortal10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x160f68
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
*(*(arg1 + 0x250) + 8)
int32_t r0_5 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t var_34
int32_t var_30
int32_t var_2c
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x2b0)
    result = operator new(0x2b0)
    var_2c = *(arg1 + 0x258)
    int32_t r4_1 = *(arg1 + 0x254)
    var_30 = *(arg1 + 0x25c)
    CGameStateOptions::CGameStateOptions(result.b)
    *(result + 0x264) = 0
    *result = _vtable_for_ascensionrules::CStateProcessAcquirePortal + 8
    *(result + 0x266) = 0
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r0_5
    *(result + 0x254) = r4_1
    *(result + 0x258) = var_2c
    *(result + 0x25c) = var_30
    *(result + 0x260) = 0
else
    var_2c = *(arg1 + 0x254)
    var_30 = *(arg1 + 0x258)
    var_34 = *(arg1 + 0x25c)
    CGameStateOptions::CGameStateOptions(result.b)
    *(result + 0x264) = 0
    *result = _vtable_for_ascensionrules::CStateProcessAcquirePortal + 8
    *(result + 0x266) = 0
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r0_5
    *(result + 0x254) = var_2c
    *(result + 0x258) = var_30
    *(result + 0x25c) = var_34
    *(result + 0x260) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x2b0
    *arg_0 -= 0x2b0

*(result + 0x28) = arg1
*(result + 0x264) = *(arg1 + 0x264)
*(result + 0x265) = *(arg1 + 0x265)
*(result + 0x266) = *(arg1 + 0x266)

for (int32_t* i = *(arg1 + 0x30); i != 0; i = i[6])
    (*(*i + 0x24))(i, arg2, arg3, arg4, arg_0, var_34, var_30, var_2c, r0_2)
    CState::AddOwnedChild(result)
    CStateList::AppendState(result)

return result
