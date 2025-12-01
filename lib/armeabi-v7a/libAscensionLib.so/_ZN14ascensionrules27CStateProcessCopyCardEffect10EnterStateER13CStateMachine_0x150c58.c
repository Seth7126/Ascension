// 函数: _ZN14ascensionrules27CStateProcessCopyCardEffect10EnterStateER13CStateMachine
// 地址: 0x150c58
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r0 = *(arg1 + 0x30)
char* r5 = *(r0 + 4)
core::CWorldBase::OutputMessageFormat(r5, "%s copies %s\n", r0 + 0x10, *(arg1 + 0x34) + 4)
*(arg1 + 0x34)
int32_t r0_3 = ascension::CWorld::CreateCard(r5)
int32_t r0_4 = *(arg1 + 0x30)
*(arg1 + 0x44) = r0_3
ascension::CPlayer::AddTurnLog(r0_4, 7)

if (zx.d(*(arg1 + 0x3c)) != 0)
    ascension::CWorld::PushResolveEffect(r5, *(arg1 + 0x44))

int32_t r0_7 = *(arg1 + 0x38)

if (r0_7 != 0)
    int32_t var_28_1 = r0_7
    ascension::CWorld::OutputAnimationCard(r5, *(arg1 + 0x44), 7, 0xa, 0, 0xb, 0, 9)

void* result = *(arg1 + 0x34)
*(arg1 + 0x98) = *(arg1 + 0x44)
int32_t r4 = *(result + 0xe8)
int32_t r6_1

if (r4 == 0)
    int32_t r4_1
    
    if (zx.d(*(arg1 + 0x3d)) != 0)
        r4_1 = *(result + 0xec)
    
    if (zx.d(*(arg1 + 0x3d)) == 0 || r4_1 == 0)
        return result
    
    int32_t r7_1 = *(arg1 + 0x30)
    int32_t r10_1 = *(arg1 + 0x40)
    r6_1 = operator new(0x7a0)
    CStateList::CStateList()
    *r6_1 = _vtable_for_ascensionrules::CStateProcessCardEffect + 8
    *(r6_1 + 0x38) = r5
    *(r6_1 + 0x3c) = r7_1
    *(r6_1 + 0x40) = r4_1
    *(r6_1 + 0x44) = r10_1
    *(r6_1 + 0x48) = arg1 + 0x48
    *(r6_1 + 0x19c) = 0
    CState::SetEmbeddedStateBuffer(r6_1, 0x600)
else
    int32_t r7 = *(arg1 + 0x30)
    int32_t r10 = *(arg1 + 0x40)
    r6_1 = operator new(0x7a0)
    CStateList::CStateList()
    *r6_1 = _vtable_for_ascensionrules::CStateProcessCardEffect + 8
    *(r6_1 + 0x38) = r5
    *(r6_1 + 0x3c) = r7
    *(r6_1 + 0x40) = r4
    *(r6_1 + 0x44) = r10
    *(r6_1 + 0x48) = arg1 + 0x48
    *(r6_1 + 0x19c) = 0
    CState::SetEmbeddedStateBuffer(r6_1, 0x600)
CState* entry_r1
return CStateMachine::PushOwnedState(entry_r1) __tailcall
