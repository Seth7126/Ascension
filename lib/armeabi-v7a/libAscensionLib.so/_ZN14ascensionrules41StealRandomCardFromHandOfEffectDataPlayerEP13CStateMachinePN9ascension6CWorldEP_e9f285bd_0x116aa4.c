// 函数: _ZN14ascensionrules41StealRandomCardFromHandOfEffectDataPlayerEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x116aa4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r0_1 = arg6 + (arg4 << 5)

if (zx.d(*(r0_1 + 0x10)) != 0)
    r0_1 = core::CWorldBase::GetInstanceByID(arg2)
    
    if (r0_1 != 0)
        ascension::CPlayer* r0_3 =
            __dynamic_cast(r0_1, _typeinfo_for_core::CInstance, _typeinfo_for_ascension::CPlayer, 0)
        
        if (r0_3 == 0 || r0_3 == arg3)
            return r0_3
        
        ascensionrules::CreateStateTakeRandomCardFromOpponent(arg3, r0_3)
        return CStateMachine::PushListState(arg1) __tailcall

return r0_1
