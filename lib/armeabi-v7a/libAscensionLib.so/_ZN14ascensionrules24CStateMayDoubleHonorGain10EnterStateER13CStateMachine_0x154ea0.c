// 函数: _ZN14ascensionrules24CStateMayDoubleHonorGain10EnterStateER13CStateMachine
// 地址: 0x154ea0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* result = *(arg1 + 0x254)
*(arg1 + 0x258) = 0

if (result != 0)
    result = *(result + 0x10)
    
    if (result != 0)
        result = __dynamic_cast(result, _typeinfo_for_core::CInstance, 
            _typeinfo_for_ascension::CCardInPlayInstance, 0)
        
        if (result != 0)
            uint32_t r4_1 = *(result + 0x10)
            core::CCardInstance* r6 = *(*(arg1 + 0x24c) + 4)
            ascension::CWorld::PushResolveEffect(r6, r4_1)
            int32_t var_20 = 0
            ascension::CWorld::OutputAnimationCard(r6, r4_1, 1, 5, zx.d(*(result + 8)), 0xb, 0, 0)
            return ascension::CWorld::OutputPauseForAnimationToDestination(r6) __tailcall

return result
