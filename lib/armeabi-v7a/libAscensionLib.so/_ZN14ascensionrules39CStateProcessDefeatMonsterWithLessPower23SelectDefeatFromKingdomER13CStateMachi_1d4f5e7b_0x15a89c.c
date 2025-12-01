// 函数: _ZN14ascensionrules39CStateProcessDefeatMonsterWithLessPower23SelectDefeatFromKingdomER13CStateMachineP6CStateiPj
// 地址: 0x15a89c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r9 = *(arg2 + 0x24c)
char* r5 = *(r9 + 4)

if (*(arg3 + 0x10) s>= 1)
    core::CCardStackUniform::SetCardCount(arg3)

void* r10 = *(arg3 + 0xc)
core::CWorldBase::OutputMessageFormat(r5, "%s defeats %s\n", r9 + 0x10, r10 + 4)
uint32_t r8 = *(arg3 + 0x14)
int32_t var_38 = 6
ascension::CWorld::OutputEvent(r5, 2, zx.d(*(r9 + 8)), zx.d(*(r8 + 8)))
void* r0_4 = *(arg2 + 0x25c)

if (r0_4 != 0 && zx.d(r5[0xa14]) == 0)
    uint32_t var_38_1 = zx.d(*(r0_4 + 8))
    ascension::CWorld::OutputEvent(r5, 0x15, zx.d(*(r9 + 8)), zx.d(*(r8 + 8)))

int32_t* r0_7 = *(arg2 + 0x260)

if (r0_7 != 0)
    void* r2_4 = r0_7 + *r0_7 + 4
    uint32_t r1_3 = zx.d(*r2_4)
    
    if (r1_3 u<= 7)
        uint32_t r3_3 = zx.d(*(r8 + 8))
        *r2_4 = r1_3.b + 1
        r0_7[*r0_7 * 8 + r1_3 + 4] = r3_3

uint32_t r6_2 = 0
int32_t var_28 = 0
ascension::CWorld::OutputAnimationCard(r5, r8, 4, 6, zx.d(*(arg3 + 8)), 9, 0, 
    &__elf_header.ident.file_class)
ascension::CPlayer::AddTurnLog(r9, 4)

if (*(r5 + 0x30) u>= 3)
    ascension::CWorld::AddToDefeatedMonsterCount()

void* r0_15 = *(arg3 + 0x14)

if (r0_15 != 0)
    r6_2 = zx.d(*(r0_15 + 8))

int32_t var_38_3 = *(arg3 + 0x10)
ascension::CWorld::OutputEvent(r5, 0x21, zx.d(*(arg3 + 8)), r6_2)
ascensionrules::CreateStateProcessCardEffect(r5, r9, *(r10 + 0xec), nullptr, nullptr, nullptr, 0)
CState::AddOwnedChild(arg2)
CStateList::AppendState(arg2)
*(arg2 + 0x4f8) = r9
*(arg2 + 0x4fc) = r8
*(arg2 + 0x500) = 6
*(arg2 + 4) = 0xffffffff
*(arg2 + 8) = 0
*(arg2 + 0x50c) = 9
*(arg2 + 0x510) = 0
ascensionrules::CreateStateHandleEvent(r5, arg2 + 0x4ac, true, 0, nullptr, 0)
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
