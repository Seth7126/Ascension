// 函数: _ZN14ascensionrules21PopRevealedCardToDeckEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x112ee8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* result = arg6 + (arg4 << 5)

if (zx.d(*(result + 0x10)) != 0)
    result = core::CWorldBase::GetInstanceByID(arg2)
    
    if (result != 0)
        result = __dynamic_cast(result, _typeinfo_for_core::CInstance, 
            _typeinfo_for_core::CCardInstance, 0)
        
        if (result != 0)
            int32_t var_20 = 0
            ascension::CWorld::OutputAnimationCard(arg2, result, 0xa, 0xc, 0, 2, zx.d(*(arg3 + 8)), 
                0)
            ascension::CWorld::PopRevealCard(arg2)
            return ascension::CWorld::OutputPauseForAllAnimation() __tailcall

return result
