// 函数: _ZN14ascensionrules25CopyEffectOfAnyPlayedHeroEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10c594
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r2_1

if (arg5 == 0)
    r2_1 = nullptr
else
    r2_1 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)

ascensionrules::CreateStateProcessCopyEffectOfPlayedHero(arg3, 0, r2_1, arg5, arg7, arg6)
return CStateMachine::PushListState(arg1) __tailcall
