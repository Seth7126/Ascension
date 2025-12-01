// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions28SelectUseCurrentEventAbilityER13CStateMachineP6CStateiPj
// 地址: 0x16fae8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r10 = *(arg2 + 0x24c)
char* r4 = *(r10 + 4)
int32_t* r0_1 = core::CWorldBase::GetInstanceByID(r4)
ascension::CEffect* r9 = *(r0_1[4] + 0x20)
core::CWorldBase::OutputMessageFormat(r4, "%s uses %s\n", r10 + 0x10, (*(*r0_1 + 0xc))(r0_1))
int32_t var_28 = 0
ascension::CWorld::OutputAnimationCard(r4, *(r0_1[3] + 0x10), 1, 0xd, 0, 0xd, 0, 0)
CState::CleanupEmbeddedState()
ascensionrules::CreateStateProcessCardEffect(r4, r10, r9, r0_1, nullptr, *(arg2 + 0x20), 
    *(arg2 + 0x1c))
CState::SetEmbeddedState(arg2)
CStateMachine::PushState(arg1)
return ascension::CWorld::PlayCardInPlayAbility(r4) __tailcall
