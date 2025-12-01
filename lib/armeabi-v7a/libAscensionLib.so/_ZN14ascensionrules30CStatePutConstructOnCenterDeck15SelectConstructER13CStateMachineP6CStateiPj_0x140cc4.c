// 函数: _ZN14ascensionrules30CStatePutConstructOnCenterDeck15SelectConstructER13CStateMachineP6CStateiPj
// 地址: 0x140cc4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r5 = *(arg2 + 0x24c)
int32_t* r0 = *(arg2 + 0x250)
core::CCardInstance* r4 = *(r5 + 4)

if (r0 != 0)
    void* r2_1 = r0 + *r0 + 4
    uint32_t r1_1 = zx.d(*r2_1)
    
    if (r1_1 u<= 7)
        uint32_t r3 = zx.d(*(arg3 + 8))
        *r2_1 = r1_1.b + 1
        r0[*r0 * 8 + r1_1 + 4] = r3

*(arg3 + 0x10)
ascension::CPlayer::AddTurnLog(r5, 6)
uint32_t r1_2 = *(arg3 + 0x10)
void* r6_2 = *(r1_2 + 0xc)
uint32_t var_48 = zx.d(*(arg3 + 8))
int32_t var_44 = 8
uint32_t var_40 = 0
int32_t var_3c = 2
uint32_t var_38 = zx.d(*(r5 + 8))
ascension::CWorld::OutputAnimationCard(r4, r1_2, 5, 4, var_48, 8, 0, 2)
int32_t* i = *(arg3 + 0x48)
int32_t r0_6 = *(arg3 + 0x4c)

if (zx.d(*(r6_2 + 0xcb)) == 0)
    if (i != r0_6)
        do
            uint32_t r5_2 = *i
            i = &i[1]
            core::CWorldBase::OutputMessageFormat(r4, "%s puts %s into discard pile\n", r5 + 0x10, 
                (*(*r5_2 + 0xc))(r5_2), var_48, var_44, var_40, var_3c, var_38, arg1, r6_2, r1_2, 
                r5)
            uint32_t r1_8 = zx.d(*(r5 + 8))
            var_48 = zx.d(*(arg3 + 8))
            var_44 = 3
            var_40 = r1_8
            var_38 = r1_8
            var_3c = 3
            ascension::CWorld::OutputAnimationCard(r4, r5_2, 5, 4, var_48, 3, var_40, 3)
            ascension::CPlayer::PutCardInDiscard(r5)
        while (i != *(arg3 + 0x4c))
else if (i != r0_6)
    do
        int32_t* r8_1 = *i
        i = &i[1]
        core::CWorldBase::OutputMessageFormat(r4, "%s puts %s on top of portal deck\n", r5 + 0x10, 
            (*(*r8_1 + 0xc))(r8_1), var_48, 8, 0, var_3c, var_38, arg1, r6_2, r1_2, r5)
        var_48 = zx.d(*(arg3 + 8))
        var_3c = 0
        var_38 = 0
        ascension::CWorld::OutputAnimationCard(r4, r8_1, 5, 4, var_48, 8, 0, 0)
        ascension::CWorld::PutCardOnTopOfPortalDeck(r4)
    while (i != *(arg3 + 0x4c))

if (ascension::CPlayer::RemoveConstructFromPlay(r5) != 0)
    ascension::CPlayer::RemoveOwnedCard(r5)
    ascension::CWorld::PutCardOnTopOfPortalDeck(r4)
    
    if (zx.d(*(r6_2 + 0xe5)) != 0 && *(r5 + 0xa8) s<= 0)
        int32_t* r0_32 = operator new(0x3c)
        CStateList::CStateList()
        r0_32[0xe] = r5
        *r0_32 = _vtable_for_ascensionrules::CStateDiscardAllMonsterConstructs + 8
        CStateMachine::PushOwnedState(arg1)

int32_t result = *(r4 + 0x30)

if (result u>= 0xe)
    result = *(r4 + 0xb10)
    
    if (result u>= 7)
        int32_t r0_36 = ascension::CWorld::QueryCenterRowSize(r4)
        result = *(r4 + 0xb10)
        
        if (result != r0_36)
            return ascension::CWorld::SetCenterRowSize(r4) __tailcall

return result
