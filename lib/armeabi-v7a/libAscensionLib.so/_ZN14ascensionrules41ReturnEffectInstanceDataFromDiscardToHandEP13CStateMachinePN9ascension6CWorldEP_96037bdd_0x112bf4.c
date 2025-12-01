// 函数: _ZN14ascensionrules41ReturnEffectInstanceDataFromDiscardToHandEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x112bf4
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
            void* result_1 = result
            result = ascension::CPlayer::RemoveCardFromDiscard(arg3)
            
            if (result != 0)
                uint32_t r0_3 = zx.d(*(arg3 + 8))
                int32_t var_20 = 0
                ascension::CWorld::OutputAnimationCard(arg2, result_1, 1, 3, r0_3, 1, r0_3, 0)
                core::CWorldBase::OutputMessageFormat(arg2, 
                    "%s returns %s from discard into hand\n", arg3 + 0x10, 
                    (*(*result_1 + 0xc))(result_1))
                return ascension::CPlayer::PutCardInHand(arg3) __tailcall

return result
