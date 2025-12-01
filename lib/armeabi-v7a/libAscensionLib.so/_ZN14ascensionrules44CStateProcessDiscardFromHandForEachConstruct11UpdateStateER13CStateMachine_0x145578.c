// 函数: _ZN14ascensionrules44CStateProcessDiscardFromHandForEachConstruct11UpdateStateER13CStateMachine
// 地址: 0x145578
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (zx.d(*(arg1 + 0x2b4)) != 0)
    int32_t* r6_1 = *(arg1 + 0x2a8)
    int32_t r0_1 = *(arg1 + 0x2ac)
    *(arg1 + 0x2b4) = 0
    
    if (r6_1 != r0_1)
        int32_t result
        
        do
            ascension::CConstructInstance* r1_1 = *r6_1
            r6_1 = &r6_1[1]
            ascensionrules::CreateStateDiscardConstruct(*(arg1 + 0x24c), r1_1, false)
            CState::AddOwnedChild(arg1)
            CStateList::AppendState(arg1)
            result = *(arg1 + 0x2ac)
        while (r6_1 != result)
        
        return result

if (*(arg1 + 0x30) == 0 && *(arg1 + 0x38) s<= 0 && *(arg1 + 0x254) s< *(arg1 + 0x250))
    return ascensionrules::CStateProcessDiscardFromHandForEachConstruct::BuildDiscardOptions(arg1)
        __tailcall

return CGameStateOptions::UpdateState(arg1) __tailcall
