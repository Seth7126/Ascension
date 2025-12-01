// 函数: _ZN14ascensionrules52CStateProcessCopyEffectOfPlayedHeroOrDefeatedMonster16SelectHeroToCopyER13CStateMachineP6CStateiPj
// 地址: 0x14e828
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r10 = *(arg2 + 0x24c)
void* r9 = *(arg3 + 0xc)
char* r5 = *(r10 + 4)
core::CWorldBase::OutputMessageFormat(r5, "%s copies %s\n", r10 + 0x10, r9 + 4)
int32_t* r0_1 = *(arg2 + 0x260)

if (r0_1 != 0)
    void* r2_2 = r0_1 + *r0_1 + 4
    uint32_t r1_1 = zx.d(*r2_2)
    
    if (r1_1 u<= 7)
        uint32_t r3_1 = zx.d(*(arg3 + 8))
        *r2_2 = r1_1.b + 1
        r0_1[*r0_1 * 8 + r1_1 + 4] = r3_1

int32_t r6_2 = arg3

if (*(r5 + 0x30) u>= 6)
    r6_2 = ascension::CWorld::CreateCard(r5)

uint32_t r4 = zx.d(*(arg3 + 8))
ascension::CPlayer::AddTurnLog(r10, 7)
ascension::CWorld::OutputPauseForAnimationToDestination(r5)
*(r5 + 0x30)
ascension::CWorld::PushResolveEffect(r5, r6_2)
uint32_t var_30 = r4
ascension::CWorld::OutputAnimationCard(r5, r6_2, 7, 0xa, 0, 0xb, 0, 9)
*(arg2 + 0x264) = r6_2
int32_t result = *(r9 + 0x88)

if (result != 1 && zx.d(*(r9 + 0xd3)) == 0)
    if (result == 3)
        result = *(r5 + 0x30)
        
        if (result u<= 2)
            *(r9 + 0xa0)
            ascension::CWorld::AddCurrentTurnPower(r5)
            return core::CWorldBase::OutputMessageFormat(r5, "%s gains %d power\n", r10 + 0x10, 
                *(r9 + 0xa0)) __tailcall
    
    return result

*(arg2 + 0x2b8) = r6_2
int32_t r8_1 = *(arg2 + 0x258)
int32_t r6_3 = *(r9 + 0xe8)
void** r0_12 = operator new(0x7a0)
CStateList::CStateList()
*r0_12 = _vtable_for_ascensionrules::CStateProcessCardEffect + 8
r0_12[0xe] = r5
r0_12[0xf] = r10
r0_12[0x10] = r6_3
r0_12[0x11] = r8_1
r0_12[0x12] = arg2 + 0x268
r0_12[0x67] = 0
CState::SetEmbeddedStateBuffer(r0_12, 0x600)
return CStateMachine::PushOwnedState(arg1) __tailcall
