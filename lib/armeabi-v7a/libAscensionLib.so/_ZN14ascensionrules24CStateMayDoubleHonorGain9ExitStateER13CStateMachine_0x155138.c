// 函数: _ZN14ascensionrules24CStateMayDoubleHonorGain9ExitStateER13CStateMachine
// 地址: 0x155138
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x254)

if (r0 != 0)
    int32_t r0_1 = *(r0 + 0x10)
    
    if (r0_1 != 0)
        void* r0_4 = __dynamic_cast(r0_1, _typeinfo_for_core::CInstance, 
            _typeinfo_for_ascension::CCardInPlayInstance, 0)
        
        if (r0_4 != 0)
            core::CCardInstance* r6_1 = *(*(arg1 + 0x24c) + 4)
            int32_t r1_4 = *(r6_1 + 0xbdc)
            
            if (*(r6_1 + 0xbd8) != r1_4)
                uint32_t r7_1 = *(r0_4 + 0x10)
                
                if (*(r1_4 - 8) == r7_1)
                    int32_t var_20_1 = 0
                    ascension::CWorld::OutputAnimationCard(r6_1, r7_1, 1, 0xb, 0, 5, 
                        zx.d(*(r0_4 + 8)), 0)
                    ascension::CWorld::PopResolveEffect(r6_1)

return CStateList::ExitState(arg1) __tailcall
