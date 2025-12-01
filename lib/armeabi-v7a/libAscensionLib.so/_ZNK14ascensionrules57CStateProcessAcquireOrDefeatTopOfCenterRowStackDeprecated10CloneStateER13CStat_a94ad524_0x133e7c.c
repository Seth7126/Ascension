// 函数: _ZNK14ascensionrules57CStateProcessAcquireOrDefeatTopOfCenterRowStackDeprecated10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x133e7c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x32c)
    uint32_t result_1 = operator new(0x32c)
    int32_t r10_1 = *(arg1 + 0x250)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *(result + 0x258) = 0
    *result =
        _vtable_for_ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStackDeprecated + 8
    *(result + 0x25c) = 0
    *(result + 0x2a4) = 0
    *(result + 0x25a) = 0
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r10_1
    *(result + 0x254) = 0
    *(result + 0x2a8) = _vtable_for_ascension::CEventEnterCenterRow + 8
    *(result + 0x2ac) = 0x11
    *(result + 0x2b0) = 0
    *(result + 0x2f4) = 0
    *(result + 0x2f8) = 0
    *(result + 0x2fc) = 0xffffffff
    *(result + 0x300) = 0
    *(result + 0x304) = 0
    *(result + 0x308) = 0
else
    int32_t r8_1 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *(result + 0x258) = 0
    *result =
        _vtable_for_ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStackDeprecated + 8
    *(result + 0x25c) = 0
    *(result + 0x2a4) = 0
    *(result + 0x25a) = 0
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r8_1
    *(result + 0x254) = 0
    *(result + 0x2a8) = _vtable_for_ascension::CEventEnterCenterRow + 8
    *(result + 0x2ac) = 0x11
    *(result + 0x2b0) = 0
    *(result + 0x2f4) = 0
    *(result + 0x2f8) = 0
    *(result + 0x2fc) = 0xffffffff
    *(result + 0x300) = 0
    *(result + 0x304) = 0
    *(result + 0x308) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x32c
    *arg_0 -= 0x32c

*(result + 0x28) = arg1
void* r0_12 = *(arg1 + 0x254)
int32_t r0_14

if (r0_12 == 0)
    r0_14 = 0
else
    *(r0_12 + 8)
    r0_14 = core::CWorldBase::GetInstanceByID(arg3)

*(result + 0x254) = r0_14
*(result + 0x258) = *(arg1 + 0x258)
*(result + 0x259) = *(arg1 + 0x259)
*(result + 0x25a) = *(arg1 + 0x25a)
*(result + 0x2a4) = *(arg1 + 0x2a4)
ascension::CEventEnterCenterRow::CloneEvent(result + 0x2a8, arg1 + 0x2a8)

if (*(arg1 + 0x38) s>= 1)
    ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStackDeprecated::BuildOptionList(
        result)

return result
