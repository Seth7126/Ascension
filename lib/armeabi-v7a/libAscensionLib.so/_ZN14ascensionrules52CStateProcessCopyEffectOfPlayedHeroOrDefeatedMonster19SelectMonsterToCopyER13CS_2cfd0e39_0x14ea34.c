// 函数: _ZN14ascensionrules52CStateProcessCopyEffectOfPlayedHeroOrDefeatedMonster19SelectMonsterToCopyER13CStateMachineP6CStateiPj
// 地址: 0x14ea34
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r10 = *(arg2 + 0x24c)
void* r8 = *(arg3 + 0xc)
char* r7 = *(r10 + 4)
core::CWorldBase::OutputMessageFormat(r7, "%s copies %s\n", r10 + 0x10, r8 + 4)
int32_t* r0_1 = *(arg2 + 0x260)

if (r0_1 != 0)
    void* r2_2 = r0_1 + *r0_1 + 4
    uint32_t r1_1 = zx.d(*r2_2)
    
    if (r1_1 u<= 7)
        uint32_t r3_1 = zx.d(*(arg3 + 8))
        *r2_2 = r1_1.b + 1
        r0_1[*r0_1 * 8 + r1_1 + 4] = r3_1

int32_t r4_2 = arg3

if (*(r7 + 0x30) u>= 6)
    r4_2 = ascension::CWorld::CreateCard(r7)

uint32_t r8_1 = zx.d(*(arg3 + 8))
ascension::CPlayer::AddTurnLog(r10, 7)
ascension::CWorld::OutputPauseForAnimationToDestination(r7)
*(r7 + 0x30)
ascension::CWorld::PushResolveEffect(r7, r4_2)
uint32_t var_30 = r8_1
ascension::CWorld::OutputAnimationCard(r7, r4_2, 7, 9, 0, 0xb, 0, 9)
*(arg2 + 0x2b8) = r4_2
*(arg2 + 0x264) = r4_2
int32_t r5_1 = *(r8 + 0xec)
int32_t r8_2 = *(arg2 + 0x258)
void** r0_13 = operator new(0x7a0)
CStateList::CStateList()
*r0_13 = _vtable_for_ascensionrules::CStateProcessCardEffect + 8
r0_13[0xe] = r7
r0_13[0xf] = r10
r0_13[0x10] = r5_1
r0_13[0x11] = r8_2
r0_13[0x12] = arg2 + 0x268
r0_13[0x67] = 0
CState::SetEmbeddedStateBuffer(r0_13, 0x600)
return CStateMachine::PushOwnedState(arg1) __tailcall
