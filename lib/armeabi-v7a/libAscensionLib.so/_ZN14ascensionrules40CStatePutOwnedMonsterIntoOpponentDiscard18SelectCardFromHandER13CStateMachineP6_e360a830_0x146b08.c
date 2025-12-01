// 函数: _ZN14ascensionrules40CStatePutOwnedMonsterIntoOpponentDiscard18SelectCardFromHandER13CStateMachineP6CStateiPj
// 地址: 0x146b08
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r6 = *(arg2 + 0x24c)
core::CCardInstance* r7 = *(r6 + 4)
ascension::CWorld::PushResolveEffect(r7, arg3)
int32_t var_28 = 0
ascension::CWorld::OutputAnimationCard(r7, arg3, 5, 1, zx.d(*(r6 + 8)), 0xb, 0, 0)
ascension::CPlayer::RemoveCardFromHand(r6)
ascension::CPlayer::RemoveOwnedCard(r6)
void** r0_5 = operator new(0x260)
CGameStateOptions::CGameStateOptions(r0_5.b)
*r0_5 = _vtable_for_ascensionrules::CStatePutCardIntoPlayerDiscard + 8
r0_5[0x93] = r6
r0_5[0x94] = arg3
r0_5[0x95] = 0
r0_5[0x96].b = 0
r0_5[0x97] = 0
return CStateMachine::PushOwnedState(arg1) __tailcall
