// 函数: _ZN14ascensionrules44CStateProcessDiscardFromHandForEachConstruct26SelectDiscardAllConstructsER13CStateMachineP6CStateiPj
// 地址: 0x14546c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r6 = *(arg2 + 0x24c)
int32_t* i = *(r6 + 0x54)

if (i != *(r6 + 0x58))
    do
        int32_t* r0_2 = *(arg2 + 0xac)
        
        if (r0_2 == *(arg2 + 0xb0))
            std::__ndk1::vector<ascension::CConstructInstance*, std::__ndk1::allocator<ascension::CConstructInstance*> >::__push_back_slow_path<ascension::CConstructInstance* const&>(
                arg2 + 0x2a8)
        else
            *r0_2 = *i
            *(arg2 + 0x2ac) += 4
        
        i = &i[1]
    while (i != *(r6 + 0x58))

if (*(arg2 + 0x2a8) != *(arg2 + 0xac))
    core::CCardInstance* r7_1 = *(r6 + 4)
    
    if (arg3 != 0)
        int32_t var_28_1 = 0
        ascension::CWorld::OutputAnimationCard(r7_1, *(arg3 + 0x10), 1, 3, zx.d(*(r6 + 8)), 4, 
            zx.d(*(arg3 + 8)), 0)
    
    *(arg2 + 0x2a4) = r6
    *(arg2 + 0x2b4) = 1
    ascensionrules::CreateStateHandleEvent(r7_1, arg2 + 0x258, true, 0, nullptr, 0)
    CStateMachine::PushOwnedState(arg1)

*(arg2 + 0x250) = 0
return 0
