// 函数: _ZNK14ascensionrules23CStateSendPlayHeroEvent10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x14d51c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x30) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
*(*(arg1 + 0x34) + 8)
int32_t r0_5 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0
void** r2_1

if (result == 0 || *arg_0 u< 0x130)
    result = operator new(0x130)
    CState::CState()
    *result = _vtable_for_ascensionrules::CStateSendPlayHeroEvent + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r0_5
    *(result + 0x3c) = 0x14
    *(result + 0x40) = 0
    *(result + 0x84) = 0
    *(result + 0x88) = 0
    *(result + 0x8c) = 0
    r2_1 = result + 0x38
    *r2_1 = _vtable_for_ascension::CEventPlayHero + 8
else
    CState::CState()
    *result = _vtable_for_ascensionrules::CStateSendPlayHeroEvent + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r0_5
    *(result + 0x3c) = 0x14
    *(result + 0x40) = 0
    *(result + 0x84) = 0
    *(result + 0x88) = 0
    *(result + 0x8c) = 0
    *(result + 0x2c) = 0
    r2_1 = result + 0x38
    *r2_1 = _vtable_for_ascension::CEventPlayHero + 8
    *arg4 += 0x130
    *arg_0 -= 0x130

*(result + 0x28) = arg1
ascension::CEventPlayHero::CloneEvent(r2_1, arg1 + 0x38)
return result
