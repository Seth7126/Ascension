// 函数: _ZN14ascensionrules22CStateDiscardConstruct10EnterStateER13CStateMachine
// 地址: 0x13b868
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r6 = *(arg1 + 0x30)
char* r4 = *(r6 + 4)
core::CWorldBase::OutputMessageFormat(r4, "%s discards %s from play\n", r6 + 0x10, 
    (*(**(arg1 + 0x34) + 0xc))())
void* r3_1 = *(arg1 + 0x34)
uint32_t r1_2 = *(r3_1 + 0x10)
uint32_t r2_2 = 3
uint32_t r0_4 = zx.d(*(*(arg1 + 0x30) + 8))

if (zx.d(*(arg1 + 0x38)) == 0)
    r2_2 = 2

void* r6_1 = *(r1_2 + 0xc)
int32_t var_44 = 3
uint32_t var_3c = r2_2
uint32_t var_40 = r0_4
uint32_t var_38 = r0_4
int32_t var_48 = zx.d(*(r3_1 + 8))
ascension::CWorld::OutputAnimationCard(r4, r1_2, 5, 4, var_48, 3, var_40, var_3c)
void* r1_3 = *(arg1 + 0x34)
int32_t* i = *(r1_3 + 0x48)
int32_t r0_6 = *(r1_3 + 0x4c)

if (zx.d(*(r6_1 + 0xcb)) == 0)
    if (i != r0_6)
        do
            uint32_t r7_2 = *i
            i = &i[1]
            core::CWorldBase::OutputMessageFormat(r4, "%s puts %s into discard pile\n", 
                *(arg1 + 0x30) + 0x10, (*(*r7_2 + 0xc))(r7_2), var_48, 3, var_40, var_3c, var_38)
            uint32_t r0_21 = zx.d(*(*(arg1 + 0x30) + 8))
            var_48 = zx.d(*(*(arg1 + 0x34) + 8))
            var_40 = r0_21
            var_38 = r0_21
            var_3c = 3
            ascension::CWorld::OutputAnimationCard(r4, r7_2, 5, 4, var_48, 3, var_40, 3)
            ascension::CPlayer::PutCardInDiscard(*(arg1 + 0x30))
        while (i != *(*(arg1 + 0x34) + 0x4c))
else if (i != r0_6)
    do
        int32_t* r7_1 = *i
        i = &i[1]
        core::CWorldBase::OutputMessageFormat(r4, "%s puts %s on top of portal deck\n", 
            *(arg1 + 0x30) + 0x10, (*(*r7_1 + 0xc))(r7_1), var_48, var_44, var_40, var_3c, var_38)
        var_48 = zx.d(*(*(arg1 + 0x34) + 8))
        var_44 = 8
        var_40 = 0
        var_3c = 3
        var_38 = zx.d(*(*(arg1 + 0x30) + 8))
        ascension::CWorld::OutputAnimationCard(r4, r7_1, 5, 0x16, var_48, 8, 0, 3)
        ascension::CWorld::PutCardOnTopOfPortalDeck(r4)
    while (i != *(*(arg1 + 0x34) + 0x4c))

if (ascension::CPlayer::RemoveConstructFromPlay(*(arg1 + 0x30)) != 0)
    ascension::CPlayer::PutCardInDiscard(*(arg1 + 0x30))
    ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 5)
    
    if (zx.d(*(r6_1 + 0xe5)) != 0)
        void* r7_3 = *(arg1 + 0x30)
        
        if (*(r7_3 + 0xa8) s<= 0)
            int32_t* r0_32 = operator new(0x3c)
            CStateList::CStateList()
            r0_32[0xe] = r7_3
            *r0_32 = _vtable_for_ascensionrules::CStateDiscardAllMonsterConstructs + 8
            CState* entry_r1
            CStateMachine::PushOwnedState(entry_r1)

int32_t result = *(r4 + 0xb10)

if (result u>= 7)
    *(arg1 + 0x30)
    int32_t r0_36 = ascension::CWorld::QueryCenterRowSize(r4)
    result = *(r4 + 0xb10)
    
    if (result != r0_36)
        return ascension::CWorld::SetCenterRowSize(r4) __tailcall

return result
