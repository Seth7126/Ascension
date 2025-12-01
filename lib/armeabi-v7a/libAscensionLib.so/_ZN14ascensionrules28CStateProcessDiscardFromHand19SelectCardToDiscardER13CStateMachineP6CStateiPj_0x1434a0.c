// 函数: _ZN14ascensionrules28CStateProcessDiscardFromHand19SelectCardToDiscardER13CStateMachineP6CStateiPj
// 地址: 0x1434a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
core::CCardInstance* r4 = *(arg2 + 0x24c)
core::CCardInstance* r6 = *(r4 + 4)
uint32_t r0_1 = zx.d(*(r4 + 8))
uint32_t r1_1

if (zx.d(*(arg2 + 0x44)) == 0)
    r1_1 = 2
else
    r1_1 = 2
    
    if (*(arg2 + 0x38) == 1)
        r1_1 = 3

uint32_t var_30 = r0_1
ascension::CWorld::OutputAnimationCard(r6, arg3, 5, 1, r0_1, 3, r0_1, r1_1)
ascension::CPlayer::AddTurnLog(r4, 5)
ascension::CPlayer::RemoveCardFromHand(r4)
core::CWorldBase::OutputMessageFormat(r6, "%s discards %s\n", r4 + 0x10, (*(*arg3 + 0xc))(arg3))
ascension::CPlayer::PutCardInDiscard(r4)
int32_t* r0_10 = *(arg2 + 0x258)

if (r0_10 != 0)
    void* r2_4 = r0_10 + *r0_10 + 4
    uint32_t r1_7 = zx.d(*r2_4)
    
    if (r1_7 u<= 7)
        uint32_t r3_1 = zx.d(*(arg3 + 8))
        *r2_4 = r1_7.b + 1
        r0_10[*r0_10 * 8 + r1_7 + 4] = r3_1

int32_t* r1_8 = *(arg2 + 0x2b4)
int32_t r2_6 = *(arg2 + 0x2b8)
*(arg2 + 0x2ac) = *(arg2 + 0x254)

if (r1_8 == r2_6)
    std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
        arg2 + 0x2b0)
else
    *r1_8 = arg3
    *(arg2 + 0x2b4) += 4

ascensionrules::CreateStateHandleEvent(r6, arg2 + 0x25c, true, 0, nullptr, 0)
CStateMachine::PushOwnedState(arg1)
int32_t r0_18 = *__stack_chk_guard

if (r0_18 == r0)
    return r0_18 - r0

__stack_chk_fail()
noreturn
