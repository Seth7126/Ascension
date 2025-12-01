// 函数: _ZN9ascension6CWorld9AddPlayerEjPKcPN4core24COptionDecisionEvaluatorE
// 地址: 0xf42e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t entry_r3
int32_t r6 = entry_r3
int32_t r0 = *__stack_chk_guard
core::CWorldBase* result = operator new(0x18c)
int32_t r2 = *(arg1 + 4)
*(arg1 + 4) = r2 + 1
core::COptionDecisionEvaluator* var_30 = arg3
ascension::CPlayer::CPlayer(result, arg1, r2, arg2)
*(result + 0x30) = r6

if (r6 != 0)
    r6 = 1

*(result + 0x34) = r6.b
core::CWorldBase::AddInstance(arg1)
*(arg1 + 4) += 1
ascension::CPlayer::CreateDeck(result)
*(arg1 + 4) += 1
ascension::CPlayer::CreateHand(result)
*(arg1 + 4) += 1
ascension::CPlayer::CreateDiscard(result)

if (*(arg1 + 0x30) u>= 0x16)
    *(arg1 + 4) += 1
    ascension::CPlayer::CreateDreamscape(result)

*(arg1 + 4) += 1
ascension::CPlayer::CreateOwnedCardList(result)
core::CWorldBase* result_1 = result
int32_t* r0_15 = *(arg1 + 0x1c)

if (r0_15 u>= *(arg1 + 0x20))
    std::__ndk1::vector<core::CPlayerBase*, std::__ndk1::allocator<core::CPlayerBase*> >::__push_back_slow_path<core::CPlayerBase*>(
        arg1 + 0x18)
else
    *r0_15 = result
    *(arg1 + 0x1c) += 4

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
