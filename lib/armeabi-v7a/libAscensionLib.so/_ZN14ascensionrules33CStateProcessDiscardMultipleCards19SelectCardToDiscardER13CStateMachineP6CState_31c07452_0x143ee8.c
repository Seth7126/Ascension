// 函数: _ZN14ascensionrules33CStateProcessDiscardMultipleCards19SelectCardToDiscardER13CStateMachineP6CStateiPj
// 地址: 0x143ee8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
core::CCardInstance* r5 = *(arg2 + 0x24c)
core::CCardInstance* r6 = *(r5 + 4)
uint32_t r0_1 = zx.d(*(r5 + 8))
uint32_t r1_1

if (zx.d(*(arg2 + 0x44)) == 0)
    r1_1 = 2
else
    r1_1 = 2
    
    if (*(arg2 + 0x38) == 1)
        r1_1 = 3

uint32_t var_30 = r0_1
ascension::CWorld::OutputAnimationCard(r6, arg3, 5, 1, r0_1, 3, r0_1, r1_1)
ascension::CPlayer::AddTurnLog(r5, 5)
ascension::CPlayer::RemoveCardFromHand(r5)
core::CWorldBase::OutputMessageFormat(r6, "%s discards %s\n", r5 + 0x10, (*(*arg3 + 0xc))(arg3))
ascension::CPlayer::PutCardInDiscard(r5)
int32_t* r1_6 = *(arg2 + 0x2c4)

if (r1_6 == *(arg2 + 0x2c8))
    std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
        arg2 + 0x2c0)
else
    *r1_6 = arg3
    *(arg2 + 0x2c4) += 4

int32_t* r0_11 = *(arg2 + 0x260)

if (r0_11 != 0)
    void* r2_5 = r0_11 + *r0_11 + 4
    uint32_t r1_10 = zx.d(*r2_5)
    
    if (r1_10 u<= 7)
        uint32_t r3_2 = zx.d(*(arg3 + 8))
        *r2_5 = r1_10.b + 1
        r0_11[*r0_11 * 8 + r1_10 + 4] = r3_2

int32_t r0_15

if (*(arg2 + 0x258) != 0)
    r0_15 = ascension::CWorld::QueryCardFaction(r6, r5, arg3)

int32_t r0_16

if (*(arg2 + 0x258) == 0 || r0_15 == 0)
    r0_16 = *(arg2 + 0x264) + 1
else
    r0_16 = *(arg2 + 0x250)

*(arg2 + 0x264) = r0_16
int32_t r0_18 = *__stack_chk_guard

if (r0_18 == r0)
    return r0_18 - r0

__stack_chk_fail()
noreturn
