// 函数: _ZN14ascensionrules24CopyEffectOfAnyLifeboundEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10c850
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r1_1

if (arg5 == 0)
    r1_1 = nullptr
else
    r1_1 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)

ascensionrules::CreateStateProcessCopyEffectOfLifeboundHero(arg3, r1_1)
return CStateMachine::PushListState(arg1) __tailcall
