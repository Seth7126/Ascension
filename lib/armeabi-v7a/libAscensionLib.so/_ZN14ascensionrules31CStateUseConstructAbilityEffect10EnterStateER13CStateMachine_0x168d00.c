// 函数: _ZN14ascensionrules31CStateUseConstructAbilityEffect10EnterStateER13CStateMachine
// 地址: 0x168d00
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r4 = *(*(arg1 + 0x34) + 0xc)
core::CCardInstance* r5 = *(*(arg1 + 0x30) + 4)
uint32_t r7 = *(r4 + 0x10)
ascension::CWorld::PushResolveEffect(r5, r7)
int32_t var_28 = 0
ascension::CWorld::OutputAnimationCard(r5, r7, 1, 4, zx.d(*(r4 + 8)), 0xb, 0, 0)
int32_t result = ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 1)
core::CInstance* r3 = *(arg1 + 0x34)
ascension::CEffect* r2_2 = *(r3 + 0x14)

if (r2_2 == 0)
    return result

ascensionrules::CreateStateProcessCardEffect(r5, *(arg1 + 0x30), r2_2, r3, nullptr, nullptr, 0)
CState* entry_r1
return CStateMachine::PushOwnedState(entry_r1) __tailcall
