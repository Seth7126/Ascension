// 函数: _ZN14ascensionrules59TriggerConstructOwnerDrawCardsForEachMechanaConstructInPlayEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11afc0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r6 = *(arg3 + 0xc)
int32_t r5_1 = ascension::CPlayer::CountConstructsInPlay(r6, true, nullptr) * arg5
int32_t var_20 = r5_1
ascension::CWorld::OutputEvent(*(r6 + 4), 0x40, zx.d(*(r6 + 8)), zx.d(*(*(arg3 + 0x10) + 8)))
ascensionrules::CreateStateProcessDrawCards(r6, r5_1, nullptr, 0)
return CStateMachine::PushListState(arg1) __tailcall
