// 函数: _ZN14ascensionrules39CStateProcessDestroyEvenOrOddConstructs10EnterStateER13CStateMachine
// 地址: 0x13f844
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r1 = *(arg1 + 0x38)
*(arg1 + 0x40) = 0
int32_t* i = *(r1 + 0x54)

if (i != *(r1 + 0x58))
    void* r7_1 = *(r1 + 4)
    int32_t r8_1 = *(r7_1 + 0x30)
    
    do
        void* r0_2 = *i
        void* var_2c_1 = r0_2
        int32_t* r2_1 = *(*(r0_2 + 0x10) + 0xc)
        int32_t r1_2 = 0x98
        
        if (r8_1 u< 0x14)
            r1_2 = 0x9c
        
        int32_t r1_3 = *(r2_1 + r1_2)
        
        if (r1_3 s< 1)
            r1_3 = r2_1[0x2c]
            
            if (r1_3 s>= 1)
            label_13f8f0:
                
                if ((r1_3 & 1) == *(arg1 + 0x3c))
                    void** r1_5 = *(arg1 + 0x98)
                    
                    if (r1_5 == *(arg1 + 0x9c))
                        std::__ndk1::vector<ascension::CConstructInstance*, std::__ndk1::allocator<ascension::CConstructInstance*> >::__push_back_slow_path<ascension::CConstructInstance* const&>(
                            arg1 + 0x94)
                    else
                        *r1_5 = r0_2
                        *(arg1 + 0x98) += 4
        else
            if (*(r7_1 + 0x30) u< 0x19)
                goto label_13f8f0
            
            r1_3 += r2_1[0x28]
            
            if (r1_3 s>= 1)
                goto label_13f8f0
        
        r1 = *(arg1 + 0x38)
        i = &i[1]
    while (i != *(r1 + 0x58))

if (*(arg1 + 0x94) != *(arg1 + 0x98))
    ascension::CWorld* r0_8 = *(r1 + 4)
    *(arg1 + 0x90) = r1
    *(arg1 + 0x40) = 1
    ascensionrules::CreateStateHandleEvent(r0_8, arg1 + 0x44, true, 0, nullptr, 0)
    CState* entry_r1
    CStateMachine::PushOwnedState(entry_r1)

int32_t r0_11 = *__stack_chk_guard

if (r0_11 == r0)
    return r0_11 - r0

__stack_chk_fail()
noreturn
