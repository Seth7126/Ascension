// 函数: _ZNK14ascensionrules62CStateProcessMayBanishHeroToAcquireMysticOrHeavyInfantryToHand10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x1387c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x250)
    uint32_t result_1 = operator new(0x250)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *(result + 0x24c) = r0_2
    *result =
        _vtable_for_ascensionrules::CStateProcessMayBanishHeroToAcquireMysticOrHeavyInfantryToHand
        + 8
else
    CGameStateOptions::CGameStateOptions(result.b)
    *(result + 0x24c) = r0_2
    *result =
        _vtable_for_ascensionrules::CStateProcessMayBanishHeroToAcquireMysticOrHeavyInfantryToHand
        + 8
    *(result + 0x2c) = 0
    *arg4 += 0x250
    *arg_0 -= 0x250

*(result + 0x28) = arg1

if (*(arg1 + 0x38) s>= 1)
    void* r0_12 = *(result + 0x24c)
    void* r1_3 = *(r0_12 + 0x3c)
    int32_t* i = *(r1_3 + 0xc)
    
    if (i != *(r1_3 + 0x10))
        do
            void* r2 = *i
            
            if (*(*(r2 + 0xc) + 0x88) == 1)
                void* var_24_1 = r2
                CGameStateOptions::AddSimpleUserOption(result.w, *(r2 + 8), 0xa061, 
                    "Banish %s from hand", 
                    ascensionrules::CStateProcessMayBanishHeroToAcquireMysticOrHeavyInfantryToHand::SelectBanishFromHand)
                r0_12 = *(result + 0x24c)
            
            i = &i[1]
        while (i != *(*(r0_12 + 0x3c) + 0x10))
    
    int32_t var_24_2 = 0
    CGameStateOptions::AddSimpleUserOption(result.w, 0, 0xa000, "None", 0)
    (*(*result + 0x34))(result, arg2, *(result + 0x24c), "You May Banish a Card from Your Hand")

return result
