// 函数: _ZN12ascension_ai11CWeightedAI5ResetEv
// 地址: 0x17ffc0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* entry_r0
core::CWorldBase::ProcessRollback(*(entry_r0 + 0x20))
int32_t i = *(entry_r0 + 0x28)
int32_t r0_1 = *(entry_r0 + 0x24)

if (i s>= 1)
    do
        *(entry_r0 + 0x28) = i - 1
        void* r7_1 = r0_1 + (i - 1) * 0xc2e8
        CStateMachine::ResetStateMachine()
        CState::DeleteState(*(r7_1 + 0x14c))
        *(r7_1 + 0x150) = 0
        *(r7_1 + 0x14c) = 0
        i = *(entry_r0 + 0x28)
        r0_1 = *(entry_r0 + 0x24)
    while (i s> 0)

if (r0_1 != 0)
    int32_t r1_2 = *(r0_1 - 4)
    
    if (r1_2 != 0)
        int32_t i_2 = r1_2 * 0xc2e8
        int32_t i_1
        
        do
            CStateMachine::~CStateMachine()
            i_1 = i_2
            i_2 -= 0xc2e8
        while (i_1 != 0xc2e8)
    
    operator delete[](r0_1 - 8)

void (* result)(void*, core::CStateChangeMessage const*, uint32_t) = *(entry_r0 + 0x20)
*(entry_r0 + 0x24) = 0

if (*(result + 0x14) != entry_r0)
    return result

*(result + 0x14) = 0
return core::CWorldBase::AddStateChangeListener(result, nullptr) __tailcall
