// 函数: _ZN14ascensionrules35CStateProcessDiscardConstructInPlay24SelectConstructToDiscardER13CStateMachineP6CStateiPj
// 地址: 0x13cc64
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg2 + 0x250)
ascension::CWorld* r6 = *(r0_1 + 4)
int32_t var_28 = arg3
int32_t* r1 = *(arg2 + 0x2b4)
int32_t r3 = *(arg2 + 0x2b8)
*(arg2 + 0x2ac) = r0_1

if (r1 == r3)
    std::__ndk1::vector<ascension::CConstructInstance*, std::__ndk1::allocator<ascension::CConstructInstance*> >::__push_back_slow_path<ascension::CConstructInstance* const&>(
        arg2 + 0x2b0)
else
    *r1 = arg3
    *(arg2 + 0x2b4) += 4

ascensionrules::CreateStateHandleEvent(r6, arg2 + 0x260, true, 0, nullptr, 0)
CStateMachine::PushOwnedState(arg1)
*(arg2 + 0x2bc) = 1
int32_t r0_6 = *__stack_chk_guard

if (r0_6 == r0)
    return r0_6 - r0

__stack_chk_fail()
noreturn
