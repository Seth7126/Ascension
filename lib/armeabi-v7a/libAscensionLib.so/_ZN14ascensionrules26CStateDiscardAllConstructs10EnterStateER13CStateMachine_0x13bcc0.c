// 函数: _ZN14ascensionrules26CStateDiscardAllConstructs10EnterStateER13CStateMachine
// 地址: 0x13bcc0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r4 = *(arg1 + 0x38)
*(arg1 + 0x3c) = 0
ascension::CWorld* r8 = *(r4 + 4)
CState* entry_r1

if (*(r8 + 0x30) u< 7)
    int32_t r0_12 = *(r4 + 0x54)
    int32_t r1_4 = *(r4 + 0x58)
    
    if (r1_4 != r0_12)
        int32_t r1_6 = (r1_4 - r0_12) s>> 2
        int32_t r7_2 = 0
        void* r10_1 = r4
        
        while (true)
            int32_t r8_1 = *(r0_12 + (r7_2 << 2))
            int32_t* r0_13 = operator new(0x3c)
            CState::CState()
            *r0_13 = _vtable_for_ascensionrules::CStateDiscardConstruct + 8
            r0_13[0xc] = r10_1
            r0_13[0xd] = r8_1
            r0_13[0xe].b = 1
            CStateMachine::PushOwnedState(entry_r1)
            r7_2 += 1
            
            if (r7_2 u>= r1_6)
                break
            
            r0_12 = *(r4 + 0x54)
            r10_1 = *(arg1 + 0x38)
else
    for (int32_t* i = *(r4 + 0x54); i != *(r4 + 0x58); i = &i[1])
        int32_t r0_3 = *i
        int32_t var_2c_1 = r0_3
        int32_t* r1 = *(arg1 + 0x94)
        
        if (r1 == *(arg1 + 0x98))
            std::__ndk1::vector<ascension::CConstructInstance*, std::__ndk1::allocator<ascension::CConstructInstance*> >::__push_back_slow_path<ascension::CConstructInstance* const&>(
                arg1 + 0x90)
        else
            *r1 = r0_3
            *(arg1 + 0x94) += 4
        
        r4 = *(arg1 + 0x38)
    
    if (*(arg1 + 0x90) != *(arg1 + 0x94))
        *(arg1 + 0x8c) = r4
        *(arg1 + 0x3c) = 1
        ascensionrules::CreateStateHandleEvent(r8, arg1 + 0x40, true, 0, nullptr, 0)
        CStateMachine::PushOwnedState(entry_r1)
int32_t r0_16 = *__stack_chk_guard

if (r0_16 == r0)
    return r0_16 - r0

__stack_chk_fail()
noreturn
