// 函数: _ZN14ascensionrules34CStateProcessReturnConstructToHand23SelectConstructToReturnER13CStateMachineP6CStateiPj
// 地址: 0x13b318
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r4 = *(arg2 + 0x24c)
core::CCardInstance* r5 = *(r4 + 4)
core::CWorldBase::OutputMessageFormat(r5, "%s returns %s to hand\n", r4 + 0x10, 
    (*(*arg3 + 0xc))(arg3))
uint32_t r1_1 = *(arg3 + 0x10)
uint32_t r4_1 = zx.d(*(r4 + 8))
void* r8 = *(r1_1 + 0xc)
uint32_t var_48 = zx.d(*(arg3 + 8))
int32_t var_44 = 1
uint32_t var_40 = r4_1
int32_t var_3c = 2
uint32_t var_38 = r4_1
ascension::CWorld::OutputAnimationCard(r5, r1_1, 1, 4, var_48, 1, var_40, 2)
int32_t* i = *(arg3 + 0x48)
int32_t r0_6 = *(arg3 + 0x4c)

if (zx.d(*(r8 + 0xcb)) == 0)
    if (i != r0_6)
        do
            int32_t* r4_2 = *i
            i = &i[1]
            core::CWorldBase::OutputMessageFormat(r5, "%s puts %s into discard pile\n", r4 + 0x10, 
                (*(*r4_2 + 0xc))(r4_2), var_48, var_44, var_40, var_3c, var_38, arg1, r8, r1_1, r4)
            uint32_t r1_7 = zx.d(*(r4 + 8))
            var_48 = zx.d(*(arg3 + 8))
            var_44 = 3
            var_40 = r1_7
            var_38 = r1_7
            var_3c = 3
            ascension::CWorld::OutputAnimationCard(r5, r4_2, 5, 4, var_48, 3, var_40, 3)
            ascension::CPlayer::PutCardInDiscard(r4)
        while (i != *(arg3 + 0x4c))
else if (i != r0_6)
    do
        int32_t* r8_1 = *i
        i = &i[1]
        core::CWorldBase::OutputMessageFormat(r5, "%s puts %s on top of portal deck\n", r4 + 0x10, 
            (*(*r8_1 + 0xc))(r8_1), var_48, var_44, var_40, var_3c, var_38, arg1, r8, r1_1, r4)
        var_48 = zx.d(*(arg3 + 8))
        var_44 = 8
        var_40 = 0
        var_3c = 0
        var_38 = 0
        ascension::CWorld::OutputAnimationCard(r5, r8_1, 5, 4, var_48, 8, 0, 0)
        ascension::CWorld::PutCardOnTopOfPortalDeck(r5)
    while (i != *(arg3 + 0x4c))

int32_t result

if (*(r5 + 0x30) u< 0xc)
    if (*(r5 + 0xb10) u>= 7)
        int32_t r0_39 = ascension::CWorld::QueryCenterRowSize(r5)
        
        if (*(r5 + 0xb10) != r0_39)
            ascension::CWorld::SetCenterRowSize(r5)
    
    result = ascension::CPlayer::RemoveConstructFromPlay(r4)
    
    if (result != 0)
        return ascension::CPlayer::PutCardInHand(r4) __tailcall
else
    if (ascension::CPlayer::RemoveConstructFromPlay(r4) != 0)
        ascension::CPlayer::PutCardInHand(r4)
        
        if (zx.d(*(r8 + 0xe5)) != 0 && *(r4 + 0xa8) s<= 0)
            void** r0_30 = operator new(0x3c)
            CStateList::CStateList()
            r0_30[0xe] = r4
            *r0_30 = _vtable_for_ascensionrules::CStateDiscardAllMonsterConstructs + 8
            CStateMachine::PushOwnedState(arg1)
    
    result = *(r5 + 0xb10)
    
    if (result u>= 7)
        int32_t r0_34 = ascension::CWorld::QueryCenterRowSize(r5)
        result = *(r5 + 0xb10)
        
        if (result != r0_34)
            return ascension::CWorld::SetCenterRowSize(r5) __tailcall

return result
