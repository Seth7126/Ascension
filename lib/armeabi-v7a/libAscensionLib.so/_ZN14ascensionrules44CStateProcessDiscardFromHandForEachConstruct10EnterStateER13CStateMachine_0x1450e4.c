// 函数: _ZN14ascensionrules44CStateProcessDiscardFromHandForEachConstruct10EnterStateER13CStateMachine
// 地址: 0x1450e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *(arg1 + 0x24c)
*(arg1 + 0x2b4) = 0
int32_t r0_1 = ascension::CPlayer::CountConstructsInPlay(r0, false, nullptr)
*(arg1 + 0x24c)
*(arg1 + 0x250) = r0_1
int32_t result = ascension::CPlayer::CountCardsInHand()

if (r0_1 s> result)
    void* r1 = *(arg1 + 0x24c)
    
    for (int32_t* i = *(r1 + 0x54); i != *(r1 + 0x58); i = &i[1])
        int32_t* r0_4 = *(arg1 + 0x2ac)
        
        if (r0_4 == *(arg1 + 0x2b0))
            std::__ndk1::vector<ascension::CConstructInstance*, std::__ndk1::allocator<ascension::CConstructInstance*> >::__push_back_slow_path<ascension::CConstructInstance* const&>(
                arg1 + 0x2a8)
        else
            *r0_4 = *i
            *(arg1 + 0x2ac) += 4
        
        r1 = *(arg1 + 0x24c)
    
    if (*(arg1 + 0x2a8) != *(arg1 + 0x2ac))
        ascension::CWorld* r0_10 = *(r1 + 4)
        *(arg1 + 0x2a4) = r1
        *(arg1 + 0x2b4) = 1
        ascensionrules::CreateStateHandleEvent(r0_10, arg1 + 0x258, true, 0, nullptr, 0)
        CState* entry_r1
        CStateMachine::PushOwnedState(entry_r1)
    
    result = 0
    *(arg1 + 0x250) = 0

*(arg1 + 0x254) = 0
return result
