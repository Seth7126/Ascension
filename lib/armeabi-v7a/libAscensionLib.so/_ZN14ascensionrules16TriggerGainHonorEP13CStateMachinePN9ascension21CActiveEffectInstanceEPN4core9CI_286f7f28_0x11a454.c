// 函数: _ZN14ascensionrules16TriggerGainHonorEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11a454
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CInstance* r6
ascension::CPlayer* r7
r7:r6 = *(arg2 + 0x10)
ascensionrules::CreateStateGainHonor(r7, r6, arg5, false, nullptr, 0)
return CStateMachine::PushListState(arg1) __tailcall
