// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions18SelectUseConstructER13CStateMachineP6CStateiPj
// 地址: 0x16f83c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r5 = *(arg2 + 0x24c)
char* r4 = *(r5 + 4)
int32_t* r0_1 = core::CWorldBase::GetInstanceByID(r4)
core::CWorldBase::OutputMessageFormat(r4, "%s uses %s\n", r5 + 0x10, (*(*r0_1 + 0xc))(r0_1))
void* r8 = r0_1[3]
uint32_t r9 = *(r8 + 0x10)
ascension::CWorld::PlayConstructAbility(r4)
int32_t var_40 = 0
ascension::CWorld::OutputEvent(r4, 0x33, zx.d(*(r5 + 8)), zx.d(*(r9 + 8)))

if (r0_1[5] != 0)
    CState::CleanupEmbeddedState()
    void** r4_1 = *(arg2 + 0x20)
    CState::CState()
    *r4_1 = _vtable_for_ascensionrules::CStateUseConstructAbilityEffect + 8
    r4_1[0xc] = r5
    r4_1[0xd] = r0_1
    r4_1[0xb].b = 0
    CState::SetEmbeddedState(arg2)
    return CStateMachine::PushState(arg1) __tailcall

uint32_t r1_6 = zx.d(*(r8 + 8))
ascension::CEffect* r10 = *(r0_1[4] + 0x28)
uint32_t var_30 = zx.d(*(r5 + 8))
ascension::CWorld::OutputAnimationCard(r4, r9, 1, 4, r1_6, 4, r1_6, 0xd)

if (r10 != 0)
    CState::CleanupEmbeddedState()
    ascensionrules::CreateStateProcessCardEffect(r4, r5, r10, r0_1, nullptr, *(arg2 + 0x20), 
        *(arg2 + 0x1c))
    CState::SetEmbeddedState(arg2)
    CStateMachine::PushState(arg1)

return ascension::CPlayer::AddTurnLog(r5, 1) __tailcall
