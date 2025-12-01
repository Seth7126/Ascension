// 函数: _ZN14ascensionrules45CStateProcessCopyEffectFromTopOfAnyPlayerDeck18SelectEffectToCopyER13CStateMachineP6CStateiPj
// 地址: 0x150524
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r9 = *(arg2 + 0x24c)
char* r7 = *(r9 + 4)
ascensionrules::CStateProcessCopyEffectFromTopOfAnyPlayerDeck::ReturnRevealedCards()
void* r10 = *(arg3 + 0xc)
core::CWorldBase::OutputMessageFormat(r7, "%s copies %s\n", r9 + 0x10, r10 + 4)
int32_t r5 = arg3

if (*(r7 + 0x30) u>= 6)
    r5 = ascension::CWorld::CreateCard(r7)

ascension::CPlayer::AddTurnLog(r9, 7)
*(r7 + 0x30)
ascension::CWorld::PushResolveEffect(r7, r5)
uint32_t var_30 = zx.d(*(arg3 + 8))
ascension::CWorld::OutputAnimationCard(r7, r5, 7, 0xc, 0, 0xb, 0, 9)
*(arg2 + 0x26c) = r5
int32_t result = *(r10 + 0x88)

if (result != 1)
    return result

*(arg2 + 0x2c0) = r5
int32_t r8_1 = *(arg2 + 0x254)
int32_t r5_1 = *(r10 + 0xe8)
void** r0_10 = operator new(0x7a0)
CStateList::CStateList()
*r0_10 = _vtable_for_ascensionrules::CStateProcessCardEffect + 8
r0_10[0xe] = r7
r0_10[0xf] = r9
r0_10[0x10] = r5_1
r0_10[0x11] = r8_1
r0_10[0x12] = arg2 + 0x270
r0_10[0x67] = 0
CState::SetEmbeddedStateBuffer(r0_10, 0x600)
return CStateMachine::PushOwnedState(arg1) __tailcall
