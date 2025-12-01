// 函数: _ZNK14ascensionrules31CStatePlayPhantasmFromCenterRow10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x16a6ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x30) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
*(*(arg1 + 0x38) + 8)
int32_t r0_5 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0
void** r2_1

if (result == 0 || *arg_0 u< 0x89c)
    uint32_t result_1 = operator new(0x89c)
    int32_t r7_1 = *(arg1 + 0x34)
    result = result_1
    CState::CState()
    *result = _vtable_for_ascensionrules::CStatePlayPhantasmFromCenterRow + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r7_1
    *(result + 0x38) = r0_5
    *(result + 0x3c) = 0
    *(result + 0x44) = 0x14
    *(result + 0x48) = 0
    *(result + 0x8c) = 0
    *(result + 0x90) = 0
    *(result + 0x94) = 0
    *(result + 0x98) = 0
    r2_1 = result + 0x40
    *r2_1 = _vtable_for_ascension::CEventPlayHero + 8
else
    int32_t r10_1 = *(arg1 + 0x34)
    CState::CState()
    *result = _vtable_for_ascensionrules::CStatePlayPhantasmFromCenterRow + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r10_1
    *(result + 0x38) = r0_5
    *(result + 0x3c) = 0
    *(result + 0x44) = 0x14
    *(result + 0x48) = 0
    *(result + 0x8c) = 0
    *(result + 0x90) = 0
    *(result + 0x94) = 0
    *(result + 0x98) = 0
    *(result + 0x2c) = 0
    r2_1 = result + 0x40
    *r2_1 = _vtable_for_ascension::CEventPlayHero + 8
    *arg4 += 0x89c
    *arg_0 -= 0x89c

*(result + 0x28) = arg1
*(result + 0x3c) = *(arg1 + 0x3c)
ascension::CEventPlayHero::CloneEvent(r2_1, arg1 + 0x40)
return result
