// 函数: _ZN14ascensionrules36CStateProcessDestroyConstructsInPlay24SelectConstructToDestroyER13CStateMachineP6CStateiPj
// 地址: 0x13d3bc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg2 + 0x24c)
ascension::CWorld* r6 = *(r0_1 + 4)
int32_t var_28 = arg3
int32_t* r1 = *(arg2 + 0x2b0)
int32_t r3 = *(arg2 + 0x2b4)
*(arg2 + 0x2a8) = r0_1

if (r1 == r3)
    std::__ndk1::vector<ascension::CConstructInstance*, std::__ndk1::allocator<ascension::CConstructInstance*> >::__push_back_slow_path<ascension::CConstructInstance* const&>(
        arg2 + 0x2ac)
else
    *r1 = arg3
    *(arg2 + 0x2b0) += 4

ascensionrules::CreateStateHandleEvent(r6, arg2 + 0x25c, true, 0, nullptr, 0)
CStateMachine::PushOwnedState(arg1)
int32_t r0_6 = *(arg2 + 0x258)
*(arg2 + 0x2b8) = 1
*(arg2 + 0x258) = r0_6 + 1
int32_t r0_8 = *__stack_chk_guard

if (r0_8 == r0)
    return r0_8 - r0

__stack_chk_fail()
noreturn
