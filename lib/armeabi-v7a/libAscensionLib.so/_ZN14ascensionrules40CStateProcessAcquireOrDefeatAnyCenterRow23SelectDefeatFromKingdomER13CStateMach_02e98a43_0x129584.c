// 函数: _ZN14ascensionrules40CStateProcessAcquireOrDefeatAnyCenterRow23SelectDefeatFromKingdomER13CStateMachineP6CStateiPj
// 地址: 0x129584
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r10 = *(arg2 + 0x24c)
char* r5 = *(r10 + 4)

if (*(arg3 + 0x10) s>= 1)
    core::CCardStackUniform::SetCardCount(arg3)

void* r9 = *(arg3 + 0xc)
core::CWorldBase::OutputMessageFormat(r5, "%s defeats %s\n", r10 + 0x10, r9 + 4)
uint32_t r8 = *(arg3 + 0x14)
int32_t var_38 = 6
ascension::CWorld::OutputEvent(r5, 2, zx.d(*(r10 + 8)), zx.d(*(r8 + 8)))
int32_t var_28 = 0
ascension::CWorld::OutputAnimationCard(r5, r8, 4, 6, zx.d(*(arg3 + 8)), 9, 0, 
    &__elf_header.ident.file_class)
ascension::CPlayer::AddTurnLog(r10, 4)
ascension::CWorld::AddToDefeatedMonsterCount()
void* r0_8 = *(arg3 + 0x14)
uint32_t r3_2 = 0

if (r0_8 != 0)
    r3_2 = zx.d(*(r0_8 + 8))

int32_t var_38_2 = *(arg3 + 0x10)
ascension::CWorld::OutputEvent(r5, 0x21, zx.d(*(arg3 + 8)), r3_2)
ascensionrules::CreateStateProcessCardEffect(r5, r10, *(r9 + 0xec), nullptr, nullptr, nullptr, 0)
CState::AddOwnedChild(arg2)
CStateList::AppendState(arg2)
*(arg2 + 0xcf8) = 0
*(arg2 + 0xd3c) = r10
*(arg2 + 0xd40) = r8
*(arg2 + 0xd44) = 6
*(arg2 + 0xd48) = 0xffffffff
*(arg2 + 0xd4c) = 0
*(arg2 + 0xd50) = 9
*(arg2 + 0xd54) = 0
ascensionrules::CreateStateHandleEvent(r5, arg2 + 0xcf0, true, 0, nullptr, 0)
CState::AddOwnedChild(arg2)
int32_t result = CStateList::AppendState(arg2)
*(arg2 + 0xced) = 1
return result
