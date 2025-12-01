// 函数: _ZN14ascensionrules33TriggerDefeatMonsterWithLessPowerEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11bea4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* result = *(arg2 + 0x14)

if (result != 0)
    result =
        __dynamic_cast(result, _typeinfo_for_core::CInstance, _typeinfo_for_ascension::CPlayer, 0)
    
    if (result != 0)
        ascensionrules::CreateStateProcessDefeatMonsterWithLessPower(result, arg5, false, false, 
            false, false, false, nullptr, nullptr)
        return CStateMachine::PushListState(arg1) __tailcall

return result
