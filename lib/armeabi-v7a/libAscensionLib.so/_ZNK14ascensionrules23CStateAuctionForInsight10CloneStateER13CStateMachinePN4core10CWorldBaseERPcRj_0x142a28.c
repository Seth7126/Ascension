// 函数: _ZNK14ascensionrules23CStateAuctionForInsight10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x142a28
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
*(*(arg1 + 0x250) + 8)
int32_t r0_5 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
core::CWorldBase* var_28 = arg2
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x2a4)
    uint32_t result_1 = operator new(0x2a4)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *(result + 0x268) = 0
    *result = _vtable_for_ascensionrules::CStateAuctionForInsight + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r0_5
    *(result + 0x254) = 0xffffffff
    *(result + 0x258) = 0
    *(result + 0x25c) = 0
    *(result + 0x260) = 0
    *(result + 0x264) = 0xffffffff
else
    CGameStateOptions::CGameStateOptions(result.b)
    *(result + 0x268) = 0
    *result = _vtable_for_ascensionrules::CStateAuctionForInsight + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r0_5
    *(result + 0x254) = 0xffffffff
    *(result + 0x258) = 0
    *(result + 0x25c) = 0
    *(result + 0x260) = 0
    *(result + 0x264) = 0xffffffff
    *(result + 0x2c) = 0
    *arg4 += 0x2a4
    *arg_0 -= 0x2a4

*(result + 0x28) = arg1
*(result + 0x254) = *(arg1 + 0x254)
*(result + 0x258) = *(arg1 + 0x258)
*(result + 0x25c) = *(arg1 + 0x25c)
*(result + 0x260) = *(arg1 + 0x260)
*(result + 0x264) = *(arg1 + 0x264)
*(result + 0x268) = *(arg1 + 0x268)
*(result + 0x269) = *(arg1 + 0x269)
int32_t r3 = *(arg1 + 0x70)
int32_t r4_1 = *(arg1 + 0x74)
int32_t r7_1 = *(arg1 + 0x78)
*(result + 0x26c) = *(arg1 + 0x26c)
*(result + 0x70) = r3
*(result + 0x74) = r4_1
*(result + 0x78) = r7_1
int32_t r3_1 = *(arg1 + 0x80)
int32_t r4_2 = *(arg1 + 0x84)
int32_t r5_1 = *(arg1 + 0x88)
int32_t r7_2 = *(arg1 + 0x8c)
*(result + 0x27c) = *(arg1 + 0x7c)
*(result + 0x80) = r3_1
*(result + 0x84) = r4_2
*(result + 0x88) = r5_1
*(result + 0x8c) = r7_2
int32_t r3_2 = *(arg1 + 0x94)
int32_t r4_3 = *(arg1 + 0x98)
int32_t r5_2 = *(arg1 + 0x9c)
int32_t r7_3 = *(arg1 + 0xa0)
*(result + 0x290) = *(arg1 + 0x90)
*(result + 0x94) = r3_2
*(result + 0x98) = r4_3
*(result + 0x9c) = r5_2
*(result + 0xa0) = r7_3

if (*(arg1 + 0x38) s>= 1)
    ascensionrules::CStateAuctionForInsight::BuildBidOptions(result)

return result
