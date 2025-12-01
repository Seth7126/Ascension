// 函数: _ZNK14ascensionrules35CStateProcessCopyEffectOfPlayedHero10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x14e178
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void* r0_3 = *(arg1 + 0x254)
int32_t r7 = 0
int32_t r8 = 0

if (r0_3 != 0)
    *(r0_3 + 8)
    r8 = core::CWorldBase::GetInstanceByID(arg3)

void* r0_6 = *(arg1 + 0x258)

if (r0_6 != 0)
    *(r0_6 + 8)
    r7 = core::CWorldBase::GetInstanceByID(arg3)

int32_t* result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x2bc)
    int32_t* result_1 = operator new(0x2bc)
    int32_t r4_1 = *(arg1 + 0x250)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *result = _vtable_for_ascensionrules::CStateProcessCopyEffectOfPlayedHero + 8
    result[0x9b] = 0x17
    result[0x9c] = 0
    result[0x93] = r0_2
    result[0x94] = r4_1
    result[0x95] = r8
    result[0x96] = r7
    result[0x97] = 0
    result[0x98] = 0
    result[0x99] = 0
    result[0x9a] = _vtable_for_ascension::CEventCopyHeroEffect + 8
    result[0xad] = r0_2
    result[0xae] = 0
else
    int32_t r9_1 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateProcessCopyEffectOfPlayedHero + 8
    result[0x9b] = 0x17
    result[0x9c] = 0
    result[0x93] = r0_2
    result[0x94] = r9_1
    result[0x95] = r8
    result[0x96] = r7
    result[0x97] = 0
    result[0x98] = 0
    result[0x99] = 0
    result[0x9a] = _vtable_for_ascension::CEventCopyHeroEffect + 8
    result[0xad] = r0_2
    result[0xae] = 0
    result[0xb].b = 0
    *arg4 += 0x2bc
    *arg_0 -= 0x2bc

result[0xa] = arg1
void* r0_18 = *(arg1 + 0x264)

if (r0_18 != 0)
    *(r0_18 + 8)
    result[0x99] = core::CWorldBase::GetInstanceByID(arg3)

void* r0_21 = *(arg1 + 0x2b8)

if (r0_21 != 0)
    *(r0_21 + 8)
    result[0xae] = core::CWorldBase::GetInstanceByID(arg3)

if (*(arg1 + 0x38) s>= 1)
    (*(*result + 8))(result, arg2)

return result
