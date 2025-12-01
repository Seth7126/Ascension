// 函数: _ZN14ascensionrules17AuctionForInsightEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1169e0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CInstance* result = arg5

if (result != 0)
    result =
        __dynamic_cast(result, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)
    
    if (result != 0)
        ascensionrules::CreateStateAuctionForInsight(arg3, result)
        return CStateMachine::PushListState(arg1) __tailcall

return result
