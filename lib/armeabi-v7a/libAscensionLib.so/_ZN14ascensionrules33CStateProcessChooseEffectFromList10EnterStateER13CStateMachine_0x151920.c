// 函数: _ZN14ascensionrules33CStateProcessChooseEffectFromList10EnterStateER13CStateMachine
// 地址: 0x151920
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CInstance* r2 = *(arg1 + 0x24c)
int32_t* r0 = *(arg1 + 0x250)
void* r1 = r0[1]

if (r1 != r0[2])
    ascension::CPlayer* r6_1 = *(r2 + 4)
    ascension::CWorld** r7_1 = r1 + 4
    
    while (true)
        int32_t var_28_1 = *(arg1 + 0x258)
        
        if (ascension::CEffect::CanUseEffect(*r7_1, r6_1, r2, *(arg1 + 0x254)) != 0)
            ascension::CWorld* var_24_1 = *r7_1
            CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa080, *(r7_1 - 4), 
                ascensionrules::CStateProcessChooseEffectFromList::SelectEffect)
        
        r0 = *(arg1 + 0x250)
        
        if (&r7_1[1] == r0[2])
            break
        
        r2 = *(arg1 + 0x24c)
        r7_1 = &r7_1[2]
    
    *(arg1 + 0x24c)

*r0
jump(*(*arg1 + 0x34))
