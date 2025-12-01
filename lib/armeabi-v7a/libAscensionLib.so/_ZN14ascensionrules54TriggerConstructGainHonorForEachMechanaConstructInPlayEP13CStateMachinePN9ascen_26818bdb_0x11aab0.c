// 函数: _ZN14ascensionrules54TriggerConstructGainHonorForEachMechanaConstructInPlayEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11aab0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r6 = *(arg3 + 0xc)
int32_t r0_1 = ascension::CPlayer::CountConstructsInPlay(r6, true, nullptr)
ascensionrules::CreateStateGainHonor(r6, *(arg2 + 0x10), r0_1 * arg5, false, nullptr, 0)
return CStateMachine::PushListState(arg1) __tailcall
