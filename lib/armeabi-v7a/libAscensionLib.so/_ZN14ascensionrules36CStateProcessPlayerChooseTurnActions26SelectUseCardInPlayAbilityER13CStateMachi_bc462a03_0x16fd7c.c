// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions26SelectUseCardInPlayAbilityER13CStateMachineP6CStateiPj
// 地址: 0x16fd7c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r8 = *(arg2 + 0x24c)
char* r5 = *(r8 + 4)
int32_t* r0_1 = core::CWorldBase::GetInstanceByID(r5)
ascension::CEffect* r10 = *(r0_1[4] + 0x20)
core::CWorldBase::OutputMessageFormat(r5, "%s uses %s\n", r8 + 0x10, (*(*r0_1 + 0xc))(r0_1))
void* r0_6 = r0_1[3]
uint32_t r0_7 = zx.d(*(r0_6 + 8))
uint32_t var_30 = zx.d(*(r8 + 8))
ascension::CWorld::OutputAnimationCard(r5, *(r0_6 + 0x10), 1, 4, r0_7, 4, r0_7, 0xd)
CState::CleanupEmbeddedState()
ascensionrules::CreateStateProcessCardEffect(r5, r8, r10, r0_1, nullptr, *(arg2 + 0x20), 
    *(arg2 + 0x1c))
CState::SetEmbeddedState(arg2)
CStateMachine::PushState(arg1)
ascension::CWorld::PlayCardInPlayAbility(r5)
return ascension::CPlayer::AddTurnLog(r8, 1) __tailcall
