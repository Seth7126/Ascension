// 函数: _ZN14ascensionrules32CopyEffectFromTopOfAnyPlayerDeckEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10c768
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r5 = arg4
core::CCardInstance* r3

if (arg5 == 0)
    r3 = nullptr
else
    r3 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)

if (r5 != 0)
    r5 = 1

ascensionrules::CreateStateProcessCopyEffectFromTopOfAnyPlayerDeck(arg3, false, r5.b, r3)
return CStateMachine::PushListState(arg1) __tailcall
