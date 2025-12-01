// 函数: _ZN14ascensionrules28PutThisIntoPlayerDiscardPileEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x109db0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CInstance* result = arg5

if (result != 0)
    result =
        __dynamic_cast(result, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)
    
    if (result != 0)
        ascensionrules::CreateStatePutCardIntoPlayerDiscard(arg3, result, arg4, true, arg7, 
            nullptr, 0)
        return CStateMachine::PushListState(arg1) __tailcall

return result
