// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions24SelectAcquireFromKingdomER13CStateMachineP6CStateiPj
// 地址: 0x17057c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0_2 = core::CWorldBase::GetInstanceByID(*(*(arg2 + 0x24c) + 4))
int32_t result = *(arg2 + 0x254)

if (result s>= 1)
    void* __offset(CState, 0x258) r2 = arg2 + 0x258
    ascension::CCardStackUniformAscension* r1_1 = nullptr
    
    do
        if (*(r0_2 + 0x14) == *r2)
            ascension::CCardStackUniformAscension* var_18 = r1_1
            return ascensionrules::CStateProcessPlayerChooseTurnActions::AcquireFromKingdom(arg2, 
                r1_1, r0_2, 3)
        
        r1_1 += 1
        r2 += 0x44
    while (r1_1 s< result)

return result
