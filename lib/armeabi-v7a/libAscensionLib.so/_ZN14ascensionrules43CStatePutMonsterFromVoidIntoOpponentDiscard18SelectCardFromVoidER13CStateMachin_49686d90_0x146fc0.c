// 函数: _ZN14ascensionrules43CStatePutMonsterFromVoidIntoOpponentDiscard18SelectCardFromVoidER13CStateMachineP6CStateiPj
// 地址: 0x146fc0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r7 = *(arg2 + 0x24c)
core::CCardInstance* r6 = *(r7 + 4)
ascension::CWorld::PushResolveEffect(r6, arg3)
int32_t var_28 = 0
ascension::CWorld::OutputAnimationCard(r6, arg3, 5, 9, 0, 0xb, 0, 0)
ascension::CWorld::RemoveCardFromVoid(r6)
void** r0_3 = operator new(0x260)
CGameStateOptions::CGameStateOptions(r0_3.b)
*r0_3 = _vtable_for_ascensionrules::CStatePutCardIntoPlayerDiscard + 8
r0_3[0x93] = r7
r0_3[0x94] = arg3
r0_3[0x95] = 1
r0_3[0x96].b = 1
r0_3[0x97] = 0
return CStateMachine::PushOwnedState(arg1) __tailcall
