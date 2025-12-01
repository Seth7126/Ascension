// 函数: _ZN14ascensionrules38CStateProcessPendingAsyncResolveEffect10EnterStateER13CStateMachine
// 地址: 0x151d14
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r1 = *(arg1 + 0x34)
core::CCardInstance* r6 = *(*(arg1 + 0x30) + 4)

if (r1 == 0)
    uint32_t r1_2 = *(arg1 + 0x38)
    
    if (r1_2 != 0)
        ascension::CWorld::PushResolveEffect(r6, r1_2)
        int32_t var_2c_2 = 0xb
        int32_t var_28_2 = 0
        int32_t var_24_2 = 0
        int32_t var_20_2 = 0
        ascension::CWorld::OutputAnimationCard(r6, *(arg1 + 0x38), 9, 7, *(arg1 + 0x3c), 0xb, 0, 0)
        ascension::CWorld::OutputPauseForAnimationToDestination(r6)
else
    ascension::CWorld::PushResolveEffect(r6, r1)
    int32_t var_2c_1 = 0xb
    int32_t var_28_1 = 0
    int32_t var_24_1 = 0
    int32_t var_20_1 = 0
    ascension::CWorld::OutputAnimationCard(r6, *(arg1 + 0x34), 0xc, 1, zx.d(*(*(arg1 + 0x30) + 8)), 
        0xb, 0, 0)
    ascension::CWorld::OutputPauseForAnimationToDestination(r6)

*(arg1 + 0x44)
CState* entry_r1
return CStateMachine::PushState(entry_r1) __tailcall
