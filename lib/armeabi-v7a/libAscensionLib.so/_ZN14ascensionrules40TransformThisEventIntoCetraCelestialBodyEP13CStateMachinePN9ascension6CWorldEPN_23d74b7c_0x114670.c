// 函数: _ZN14ascensionrules40TransformThisEventIntoCetraCelestialBodyEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x114670
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg5 == 0)
    return 

CStateMachine* r8_1 = arg1
void* r0_1 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
    _typeinfo_for_ascension::CCardInPlayInstance, 0)
void* r7_1 = r0_1

if (r0_1 == 0)
    arg1 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
        _typeinfo_for_ascension::CCardInPlayAbilityInstance, 0)
    
    if (arg1 != 0)
        r7_1 = *(arg1 + 0xc)
        
        if (r7_1 != 0)
            goto label_1146c0
    
    return 

label_1146c0:
void* r9_1 = *(r7_1 + 0x10)
void* r0_3 = ascension::CDatabase::GetCard(ascension::g_Database)
arg1 = ascension::CWorld::CreateCard(arg2)

if (arg1 == 0)
    return 

ascension::CPlayer::AddTurnLog(arg3, 0xb)
int32_t* i = *(r0_3 + 0x130)

while (i != *(r0_3 + 0x134))
    core::CInstance* r1_3 = *i
    i = &i[1]
    ascension::CWorld::AddGlobalActiveEffect(arg2, r1_3)

uint32_t var_30 = zx.d(*(arg1 + 8))
ascension::CWorld::OutputEvent(arg2, 0xf, zx.d(*(arg3 + 8)), zx.d(*(r9_1 + 8)))

if (*(arg2 + 0xa6c) == r7_1)
    ascension::CWorld::RemoveEventCardInPlay(arg2, r7_1.b)

ascension::CWorld::PopResolveEffect(arg2)
ascension::CWorld::PushResolveEffect(arg2, arg1)
ascensionrules::CreateStateProcessAcquireResolveCard(arg3, arg1)
return CStateMachine::PushListState(r8_1) __tailcall
