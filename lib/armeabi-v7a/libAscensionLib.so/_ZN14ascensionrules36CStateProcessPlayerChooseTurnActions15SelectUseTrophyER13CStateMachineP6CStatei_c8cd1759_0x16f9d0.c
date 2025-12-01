// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions15SelectUseTrophyER13CStateMachineP6CStateiPj
// 地址: 0x16f9d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r4 = *(arg2 + 0x24c)
char* r7 = *(r4 + 4)
int32_t* r0_1 = core::CWorldBase::GetInstanceByID(r7)
void* result =
    core::CWorldBase::OutputMessageFormat(r7, "%s uses %s\n", r4 + 0x10, (*(*r0_1 + 0xc))(r0_1))
uint32_t r6 = r0_1[4]

if (r6 != 0)
    uint32_t r0_6 = zx.d(r0_1[2].w)
    uint32_t var_28_1 = zx.d(*(r4 + 8))
    ascension::CWorld::OutputAnimationCard(r7, r6, 1, 5, r0_6, 5, r0_6, 0xd)
    result = *(r6 + 0xc)
    ascension::CEffect* r10_1 = *(result + 0xf0)
    
    if (r10_1 != 0)
        CState::CleanupEmbeddedState()
        ascensionrules::CreateStateProcessCardEffect(r7, r4, r10_1, r0_1, nullptr, *(arg2 + 0x20), 
            *(arg2 + 0x1c))
        CState::SetEmbeddedState(arg2)
        CStateMachine::PushState(arg1)
        return ascension::CPlayer::AddTurnLog(r4, 1) __tailcall

return result
