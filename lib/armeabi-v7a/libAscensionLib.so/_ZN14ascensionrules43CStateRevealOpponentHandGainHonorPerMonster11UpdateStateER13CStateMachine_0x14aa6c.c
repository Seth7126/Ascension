// 函数: _ZN14ascensionrules43CStateRevealOpponentHandGainHonorPerMonster11UpdateStateER13CStateMachine
// 地址: 0x14aa6c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r0 = *(arg1 + 0x30)
core::CCardInstance* r5 = *(r0 + 4)
CState* entry_r1

if (zx.d(*(arg1 + 0x40)) == 0)
    if (zx.d(*(arg1 + 0x41)) == 0)
        return CStateMachine::PopState(entry_r1)
    
    for (uint32_t* i = *(r5 + 0xbe4); *(r5 + 0xbe8) != i; i = *(r5 + 0xbe4))
        uint32_t r6_1 = *i
        ascension::CPlayer::PutCardInHand(*(arg1 + 0x34))
        int32_t var_28_1 = 0
        ascension::CWorld::OutputAnimationCard(r5, r6_1, 0xa, 0xc, 0, 1, 
            zx.d(*(*(arg1 + 0x34) + 8)), 0)
        ascension::CWorld::RemoveRevealCard(r5)
    
    ascension::CWorld::OutputPauseForAnimationToDestination(r5)
    *(arg1 + 0x41) = 0
    return 0

int32_t* r2 = *(r5 + 0xbe4)
int32_t r1_1 = 0
int32_t r3 = *(r5 + 0xbe8)

if (r2 != r3)
    do
        void* r7_1 = *r2
        r2 = &r2[3]
        
        if (*(*(r7_1 + 0xc) + 0x88) == 3)
            r1_1 += 1
    while (r3 != r2)

int32_t r2_2 = *(arg1 + 0x38) * r1_1

if (r2_2 s< 1)
    ascension::CWorld::OutputPauseLong(r5)
else
    ascensionrules::CreateStateGainHonor(r0, *(arg1 + 0x3c), r2_2, true, nullptr, 0)
    CStateMachine::PushOwnedState(entry_r1)

*(arg1 + 0x40) = 0
return 0
