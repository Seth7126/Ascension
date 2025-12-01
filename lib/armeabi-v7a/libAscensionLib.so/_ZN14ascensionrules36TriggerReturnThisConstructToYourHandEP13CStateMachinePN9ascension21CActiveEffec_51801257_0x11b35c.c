// 函数: _ZN14ascensionrules36TriggerReturnThisConstructToYourHandEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11b35c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg3 == 0)
    return 

CStateMachine* r4_1 = arg1
arg1 = __dynamic_cast(arg3, _typeinfo_for_core::CInstance, 
    _typeinfo_for_ascension::CConstructInstance, 0)

if (arg1 == 0)
    return 

core::CCardInstance* r9_1 = *(arg1 + 0xc)

if (r9_1 == 0)
    return 

char* r5_1 = *(r9_1 + 4)
core::CWorldBase::OutputMessageFormat(r5_1, "%s returns %s to hand\n", r9_1 + 0x10, 
    (*(*arg1 + 0xc))(arg1))
uint32_t r6_1 = *(arg1 + 0x10)
uint32_t r1_2 = zx.d(*(r9_1 + 8))
void* r8_1 = *(r6_1 + 0xc)
uint32_t var_48_1 = zx.d(*(arg1 + 8))
int32_t var_44_1 = 1
int32_t var_3c_1 = 2
uint32_t var_40_1 = r1_2
uint32_t var_38_1 = r1_2
ascension::CWorld::OutputAnimationCard(r5_1, r6_1, 1, 4, var_48_1, 1, var_40_1, 2)
uint32_t* i = *(arg1 + 0x48)
int32_t r0_7 = *(arg1 + 0x4c)
uint32_t var_28_1 = r6_1

if (zx.d(*(r8_1 + 0xcb)) == 0)
    if (i != r0_7)
        do
            uint32_t r6_2 = *i
            i = &i[1]
            core::CWorldBase::OutputMessageFormat(r5_1, "%s puts %s into discard pile\n", 
                r9_1 + 0x10, (*(*r6_2 + 0xc))(r6_2), var_48_1, var_44_1, var_40_1, var_3c_1, 
                var_38_1)
            uint32_t r1_9 = zx.d(*(r9_1 + 8))
            var_48_1 = zx.d(*(arg1 + 8))
            var_44_1 = 3
            var_40_1 = r1_9
            var_38_1 = r1_9
            var_3c_1 = 3
            ascension::CWorld::OutputAnimationCard(r5_1, r6_2, 5, 4, var_48_1, 3, var_40_1, 3)
            ascension::CPlayer::PutCardInDiscard(r9_1)
        while (i != *(arg1 + 0x4c))
else if (i != r0_7)
    do
        uint32_t r8_2 = *i
        i = &i[1]
        core::CWorldBase::OutputMessageFormat(r5_1, "%s puts %s on top of portal deck\n", 
            r9_1 + 0x10, (*(*r8_2 + 0xc))(r8_2), var_48_1, var_44_1, var_40_1, var_3c_1, var_38_1)
        var_48_1 = zx.d(*(arg1 + 8))
        var_44_1 = 8
        var_40_1 = 0
        var_3c_1 = 0
        var_38_1 = 0
        ascension::CWorld::OutputAnimationCard(r5_1, r8_2, 5, 4, var_48_1, 8, 0, 0)
        ascension::CWorld::PutCardOnTopOfPortalDeck(r5_1)
    while (i != *(arg1 + 0x4c))

if (ascension::CPlayer::RemoveConstructFromPlay(r9_1) != 0)
    ascension::CPlayer::PutCardInHand(r9_1)
    
    if (zx.d(*(r8_1 + 0xe5)) != 0 && *(r9_1 + 0xa8) s<= 0)
        ascensionrules::CreateStateDiscardAllMonsterConstructs(r9_1)
        CStateMachine::PushOwnedState(r4_1)

if (*(r5_1 + 0xb10) u< 7)
    return 

int32_t r0_34 = ascension::CWorld::QueryCenterRowSize(r5_1)

if (*(r5_1 + 0xb10) != r0_34)
    return ascension::CWorld::SetCenterRowSize(r5_1) __tailcall
