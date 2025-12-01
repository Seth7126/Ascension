// 函数: _ZNK14ascensionrules37CStateTakeCardFromEachOpponentDiscard10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x1460d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x268)
    uint32_t result_1 = operator new(0x268)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *result = _vtable_for_ascensionrules::CStateTakeCardFromEachOpponentDiscard + 8
    *(result + 0x264) = 0
    *(result + 0x260) = 0
    *(result + 0x24c) = r0_2
    *(result + 0x250) = 0
    *(result + 0x254) = 0
    *(result + 0x258) = 0
    *(result + 0x25c) = 0
else
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateTakeCardFromEachOpponentDiscard + 8
    *(result + 0x264) = 0
    *(result + 0x260) = 0
    *(result + 0x24c) = r0_2
    *(result + 0x250) = 0
    *(result + 0x254) = 0
    *(result + 0x258) = 0
    *(result + 0x25c) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x268
    *arg_0 -= 0x268

*(result + 0x28) = arg1
void* r0_12 = *(arg1 + 0x250)
int32_t r0_14

if (r0_12 == 0)
    r0_14 = 0
else
    *(r0_12 + 8)
    r0_14 = core::CWorldBase::GetInstanceByID(arg3)

*(result + 0x250) = r0_14
void* r0_15 = *(arg1 + 0x254)
int32_t r0_17

if (r0_15 == 0)
    r0_17 = 0
else
    *(r0_15 + 8)
    r0_17 = core::CWorldBase::GetInstanceByID(arg3)

*(result + 0x254) = r0_17
void* r0_18 = *(arg1 + 0x258)
int32_t r0_20

if (r0_18 == 0)
    r0_20 = 0
else
    *(r0_18 + 8)
    r0_20 = core::CWorldBase::GetInstanceByID(arg3)

*(result + 0x258) = r0_20
void* r0_21 = *(arg1 + 0x25c)
int32_t r0_23

if (r0_21 == 0)
    r0_23 = 0
else
    *(r0_21 + 8)
    r0_23 = core::CWorldBase::GetInstanceByID(arg3)

*(result + 0x25c) = r0_23
*(result + 0x260) = *(arg1 + 0x260)

if (*(arg1 + 0x38) s> 0)
    void* r0_27 = *(*(result + 0x24c) + 4)
    int32_t r0_29 = *(r0_27 + 0x1c) - *(r0_27 + 0x18)
    
    if (r0_29 s>= 1)
        int32_t i = 0
        
        do
            void* r0_30 = *(result + 0x250 + (i << 2))
            
            if (r0_30 != 0)
                void* var_2c_1 = r0_30
                CGameStateOptions::AddSimpleUserOption(result.w, *(r0_30 + 8), 0xa037, "Take %s", 
                    ascensionrules::CStateTakeCardFromEachOpponentDiscard::SelectCardToTake)
            
            i += 1
        while (i s< r0_29 s>> 2)
    
    int32_t var_2c_2 = 0
    CGameStateOptions::AddSimpleUserOption(result.w, 0, 0xa000, "None", 0)
    (*(*result + 0x34))(result, arg2, *(result + 0x24c), "You May Take a Discarded Card")

return result
