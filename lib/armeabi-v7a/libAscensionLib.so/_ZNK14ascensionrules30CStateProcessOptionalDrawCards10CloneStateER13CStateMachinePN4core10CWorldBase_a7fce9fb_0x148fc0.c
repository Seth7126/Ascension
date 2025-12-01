// 函数: _ZNK14ascensionrules30CStateProcessOptionalDrawCards10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x148fc0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0
int32_t* r2_1

if (result == 0 || *arg_0 u< 0x258)
    uint32_t result_1 = operator new(0x258)
    int32_t r4_1 = *(arg1 + 0x250)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *result = _vtable_for_ascensionrules::CStateProcessOptionalDrawCards + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r4_1
    r2_1 = result + 0x254
    *r2_1 = 0
else
    int32_t r10_1 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateProcessOptionalDrawCards + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r10_1
    *(result + 0x2c) = 0
    r2_1 = result + 0x254
    *r2_1 = 0
    *arg4 += 0x258
    *arg_0 -= 0x258

*(result + 0x28) = arg1
*(result + 0x254) = *(arg1 + 0x254)

if (*(arg1 + 0x38) s>= 1)
    void* r1_3 = *(result + 0x24c)
    void* r0_13 = *(r1_3 + 0x38)
    
    if (*(r0_13 + 0x18) != 0 || *(*(r1_3 + 0x40) + 0x18) != 0)
        int32_t var_2c_1 = 0
        CGameStateOptions::AddSimpleUserOption(result.w, *(r0_13 + 8), 0xa035, "Draw Card", 
            ascensionrules::CStateProcessOptionalDrawCards::SelectDrawCard)
        int32_t var_2c_2 = 0
        CGameStateOptions::AddSimpleUserOption(result.w, 0, 0xa000, "None", 
            ascensionrules::CStateProcessOptionalDrawCards::SelectNone)
        (*(*result + 0x34))(result, arg2, *(result + 0x24c), "You May Draw a Card")
    else
        *r2_1 = *(result + 0x250)

return result
