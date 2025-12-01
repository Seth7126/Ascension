// 函数: _ZN14ascensionrules44CStateProcessDiscardAllButOneConstructInPlay21SelectConstructToKeepER13CStateMachineP6CStateiPj
// 地址: 0x13ec8c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r10 = *(arg2 + 0x24c)
ascension::CWorld* r9 = *(r10 + 4)
int32_t* i = *(r10 + 0x54)
void* __offset(CState, 0x2a4) r4

if (i == *(r10 + 0x58))
    r4 = arg2 + 0x2a4
else
    r4 = arg2 + 0x2a4
    
    do
        int32_t r0_2 = *i
        int32_t var_2c_1 = r0_2
        
        if (r0_2 != arg3)
            int32_t* r1 = *(r4 + 4)
            
            if (r1 == *(r4 + 8))
                std::__ndk1::vector<ascension::CConstructInstance*, std::__ndk1::allocator<ascension::CConstructInstance*> >::__push_back_slow_path<ascension::CConstructInstance* const&>(
                    r4)
            else
                *r1 = r0_2
                *(r4 + 4) += 4
        
        i = &i[1]
    while (i != *(r10 + 0x58))

if (*r4 != *(r4 + 4))
    *(arg2 + 0x2a0) = r10
    *(arg2 + 0x250) = 1
    ascensionrules::CreateStateHandleEvent(r9, arg2 + 0x254, true, 0, nullptr, 0)
    CStateMachine::PushOwnedState(arg1)

int32_t r0_11 = *__stack_chk_guard

if (r0_11 == r0)
    return r0_11 - r0

__stack_chk_fail()
noreturn
