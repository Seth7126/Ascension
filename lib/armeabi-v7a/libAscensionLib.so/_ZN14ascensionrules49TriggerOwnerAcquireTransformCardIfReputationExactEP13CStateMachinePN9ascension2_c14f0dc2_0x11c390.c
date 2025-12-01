// 函数: _ZN14ascensionrules49TriggerOwnerAcquireTransformCardIfReputationExactEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11c390
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg3 == 0)
    return 

CStateMachine* r6_1 = arg1
arg1 = __dynamic_cast(arg3, _typeinfo_for_core::CInstance, 
    _typeinfo_for_ascension::CCardInPlayInstance, 0)

if (arg1 == 0)
    return 

ascension::CPlayer* r4_1 = *(arg1 + 0xc)

if (r4_1 == 0 || *(r4_1 + 0x88) != arg5)
    return 

core::CCardInstance* r5_2 = *(r4_1 + 4)
core::CCardInstance* r1_2 = *(arg1 + 0x10)

if (*(r5_2 + 0x30) u>= 0x14)
    ascensionrules::CreateStateProcessAcquireChampionHero(r4_1, r1_2, 3)
    return CStateMachine::PushListState(r6_1) __tailcall

void* r7_1 = *(*(r1_2 + 0xc) + 0x150)

if (r7_1 == 0)
    return 

arg1 = ascension::CWorld::CreateCard(r5_2)

if (arg1 == 0)
    return 

int32_t* i = *(r7_1 + 0x130)

while (i != *(r7_1 + 0x134))
    core::CInstance* r1_6 = *i
    i = &i[1]
    ascension::CWorld::AddGlobalActiveEffect(r5_2, r1_6)

ascension::CPlayer::AddTurnLog(r4_1, 3)
ascension::CPlayer::AddOwnedCard(r4_1)
ascension::CPlayer::PutCardInDiscard(r4_1)
int32_t var_28 = 0
ascension::CWorld::OutputAnimationCard(r5_2, arg1, 3, 0xb, 0, 3, zx.d(*(r4_1 + 8)), 1)
