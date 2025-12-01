// 函数: _ZN14ascensionrules38CStateProcessCopyEffectOfLifeboundHero18SelectEffectToCopyER13CStateMachineP6CStateiPj
// 地址: 0x14f3ac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r7 = *(arg2 + 0x24c)
void* r10 = *(arg3 + 0xc)
ascension::CCard* r5 = *(r7 + 4)
core::CWorldBase::OutputMessageFormat(r5, "%s copies %s\n", r7 + 0x10, r10 + 4)
int32_t r9 = arg3

if (*(r5 + 0x30) u>= 6)
    r9 = ascension::CWorld::CreateCard(r5)

ascension::CPlayer::AddTurnLog(r7, 7)
*(r5 + 0x30)
ascension::CWorld::PushResolveEffect(r5, r9)
uint32_t var_30 = zx.d(*(arg3 + 8))
ascension::CWorld::OutputAnimationCard(r5, r9, 7, 8, 0, 0xb, 0, 7)
ascension::CWorld::OutputPauseForAnimationToDestination(r5)
*(arg2 + 0x254) = r9
int32_t r0_10 = *(r10 + 0x88)

if (r0_10 == 3)
    if (*(r5 + 0x30) u<= 2)
        *(r10 + 0xa0)
        ascension::CWorld::AddCurrentTurnPower(r5)
        core::CWorldBase::OutputMessageFormat(r5, "%s gains %d power\n", r7 + 0x10, *(r10 + 0xa0))
else if (r0_10 == 1)
    *(arg2 + 0x2a8) = r9
    int32_t r0_11 = *(arg2 + 0x250)
    void* r9_1 = *(r10 + 0xe8)
    void** r0_12 = operator new(0x7a0)
    CStateList::CStateList()
    *r0_12 = _vtable_for_ascensionrules::CStateProcessCardEffect + 8
    r0_12[0xe] = r5
    r0_12[0xf] = r7
    r0_12[0x10] = r9_1
    r0_12[0x11] = r0_11
    r0_12[0x12] = arg2 + 0x258
    r0_12[0x67] = 0
    CState::SetEmbeddedStateBuffer(r0_12, 0x600)
    CStateMachine::PushOwnedState(arg1)

if (ascension::CCard::IsCardFaction(r10) == 0)
    ascension::CWorld::AddLifeboundHeroToList(r5)

return ascension::CWorld::MarkLifeboundHeroPicked(r5) __tailcall
