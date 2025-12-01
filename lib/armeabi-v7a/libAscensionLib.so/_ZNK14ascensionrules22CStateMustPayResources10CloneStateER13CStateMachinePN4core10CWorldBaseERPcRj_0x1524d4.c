// 函数: _ZNK14ascensionrules22CStateMustPayResources10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x1524d4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
ascension::CPayResourceState* r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void* r0_3 = *(arg1 + 0x250)
ascension::CPayResourceState* r4_1

if (r0_3 == 0)
    r4_1 = nullptr
else
    *(r0_3 + 8)
    r4_1 = core::CWorldBase::GetInstanceByID(arg3)

uint32_t result = *arg4
int32_t* arg_0
ascension::CPayResourceState* r3

if (result == 0 || *arg_0 u< 0x29c)
    result = operator new(0x29c)
    int32_t r0_22 = *(arg1 + 0x260)
    int32_t r0_23 = *(arg1 + 0x264)
    int32_t r0_24 = *(arg1 + 0x268)
    ascension::CPayResourceState* r7_1 = *(arg1 + 0x254)
    ascension::CPayResourceState* r10_1 = *(arg1 + 0x258)
    int32_t r8_1 = *(arg1 + 0x25c)
    CGameStateOptions::CGameStateOptions(result.b)
    r3 = r0_2
    *result = _vtable_for_ascensionrules::CStateMustPayResources + 8
    *(result + 0x24c) = r3
    *(result + 0x50) = r4_1
    *(result + 0x54) = r7_1
    *(result + 0x58) = r10_1
    *(result + 0x25c) = r8_1
    *(result + 0x260) = r0_22
    *(result + 0x264) = r0_23
    *(result + 0x268) = r0_24
    *(result + 0x26c) = 0
else
    int32_t r0_8 = *(arg1 + 0x260)
    int32_t r0_9 = *(arg1 + 0x264)
    int32_t r0_10 = *(arg1 + 0x268)
    int32_t r8 = *(arg1 + 0x254)
    int32_t r10 = *(arg1 + 0x258)
    int32_t r9_1 = *(arg1 + 0x25c)
    CGameStateOptions::CGameStateOptions(result.b)
    r3 = r0_2
    *result = _vtable_for_ascensionrules::CStateMustPayResources + 8
    *(result + 0x24c) = r3
    *(result + 0x50) = r4_1
    *(result + 0x54) = r8
    *(result + 0x58) = r10
    *(result + 0x25c) = r9_1
    *(result + 0x260) = r0_8
    *(result + 0x264) = r0_9
    *(result + 0x268) = r0_10
    *(result + 0x26c) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x29c
    *arg_0 -= 0x29c

*(result + 0x28) = arg1
char r0_31 = *(arg1 + 0x26c)
*(result + 0x270) = r4_1
*(result + 0x26c) = r0_31
*(result + 0x280) = *(arg1 + 0x280)
*(result + 0x284) = *(arg1 + 0x284)
*(result + 0x288) = *(arg1 + 0x288)
*(result + 0x28c) = *(arg1 + 0x28c)
*(result + 0x290) = *(arg1 + 0x290)
*(result + 0x294) = *(arg1 + 0x294)
*(result + 0x298) = *(arg1 + 0x298)

if (*(r3 + 0xac) == arg1 + 0x270)
    ascension::CPlayer::SetPayResourceState(r3)

if (*(arg1 + 0x38) s>= 1)
    void* r2_1 = *(result + 0x250)
    uint16_t r1_7 = 0
    
    if (r2_1 != 0)
        r1_7 = *(r2_1 + 8)
    
    int32_t var_3c_1 = 0
    CGameStateOptions::AddSimpleUserOption(result.w, r1_7, 0xa0c0, "Pay Resources", 
        ascensionrules::CStateMustPayResources::SelectPay)
    (*(*result + 0x34))(result, arg2, *(result + 0x24c), "You Must Pay the Cost")

return result
