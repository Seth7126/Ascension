// 函数: _ZN14ascensionrules25CStatePlayMonsterFromHand11UpdateStateER13CStateMachine
// 地址: 0x169c74
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
CState::DeleteState(*(arg1 + 0xe8))
core::CCardInstance* r1 = *(arg1 + 0x30)
int32_t r0_1 = *(arg1 + 0x38)
*(arg1 + 0xe8) = 0
core::CCardInstance* r6 = *(r1 + 4)
*(arg1 + 0x38) = r0_1 + 1
CState* entry_r1

if (r0_1 u> 4)
    return CStateMachine::PopState(entry_r1)

int32_t r0_5
uint32_t r0_7

switch (r0_1)
    case 0
        *(arg1 + 0x38) = 2
    label_169ce0:
        int32_t r0_3 = *(arg1 + 0x34)
        *(arg1 + 0x90) = 1
        *(arg1 + 0x88) = r1
        *(arg1 + 0x8c) = r0_3
        r0_5 = ascensionrules::CreateStatePreHandleEvent(r6, arg1 + 0x3c, arg1 + 0xec, 0x800)
    case 1
        goto label_169ce0
    case 2
        core::CInstance* r3_1 = *(arg1 + 0x34)
        r0_7 = *(r3_1 + 0xc)
        ascension::CEffect* r2_2 = *(r0_7 + 0xe8)
        
        if (r2_2 == 0)
            return r0_7
        
        r0_5 = ascensionrules::CreateStateProcessCardEffect(r6, r1, r2_2, r3_1, arg1 + 0x3c, 
            arg1 + 0xec, 0x800)
    case 3
        r0_5 = ascensionrules::CreateStateHandleEvent(r6, arg1 + 0x3c, false, 0, arg1 + 0xec, 0x800)
    case 4
        r0_7 = zx.d(*(arg1 + 0x90))
        
        if (r0_7 != 0)
            r0_7 = *(r1 + 0xa8)
            
            if (r0_7 s>= 1)
                void* r0_14 = ascension::CPlayer::PutConstructInPlay(r1, (*(arg1 + 0x34)).b)
                int32_t var_20 = 0
                ascension::CWorld::OutputAnimationCard(r6, *(arg1 + 0x34), 1, 0xb, 0, 4, 
                    zx.d(*(r0_14 + 8)), 0)
                *(arg1 + 0x34)
                ascension::CWorld::PopResolveEffect(r6)
                int32_t r0_18 = *(arg1 + 0x30)
                int32_t r1_10 = *(arg1 + 0x34)
                *(arg1 + 0x9c) = 0
                *(arg1 + 0xe0) = r0_18
                *(arg1 + 0xe4) = r1_10
                ascensionrules::CreateStateHandleEvent(r6, arg1 + 0x94, true, 0, nullptr, 0)
                CStateMachine::PushOwnedState(entry_r1)
                *(arg1 + 0x34)
                int32_t r0_23 = ascension::CWorld::RemovePlayedCard(r6)
                *(arg1 + 0x90) = 0
                return r0_23
        
        return r0_7

*(arg1 + 0xe8) = r0_5
return CStateMachine::PushState(entry_r1) __tailcall
