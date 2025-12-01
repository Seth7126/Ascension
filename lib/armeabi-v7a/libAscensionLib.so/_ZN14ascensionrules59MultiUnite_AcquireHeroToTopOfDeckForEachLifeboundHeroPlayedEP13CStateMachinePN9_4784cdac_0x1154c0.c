// 函数: _ZN14ascensionrules59MultiUnite_AcquireHeroToTopOfDeckForEachLifeboundHeroPlayedEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1154c0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r2_1

if (arg5 == 0)
    r2_1 = nullptr
else
    r2_1 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)

int32_t i_2 = ascension::CWorld::GetPlayedHeroCount(arg2, 2, r2_1)

if (i_2 s>= 1)
    int32_t i_1 = i_2
    int32_t i
    
    do
        ascensionrules::CreateStateProcessAcquireHeroToTopOfDeck(arg3, 1, 1, 0, arg4, false, false, 
            false, arg6, nullptr)
        CStateMachine::PushListState(arg1)
        i = i_1
        i_1 -= 1
    while (i != 1)

core::CInstance* r0_8 = ascension::CDatabase::GetActiveEffect(ascension::g_Database)
core::CInstance* r4_1

if (arg7 == 0)
    r4_1 = arg5
else
    r4_1 = arg5
    
    if (*(arg7 + 4) == 0x17)
        core::CInstance* r0_10 = *(arg7 + 0x50)
        
        if (r0_10 != 0)
            r4_1 = r0_10

core::CWorldBase* r0_11 = operator new(0x150)
ascension::CActiveEffectDefinition* r2_2 = *(arg2 + 4)
*(arg2 + 4) = r2_2 + 1
ascension::CPlayer* var_44 = arg3
ascension::CActiveEffectInstance::CActiveEffectInstance(r0_11, arg2, r2_2, r0_8, r4_1)
core::CWorldBase::AddInstance(arg2)
ascension::CActiveEffectInstance::AddEffectDurationFunc(r0_11, "UntilEndOfTurn")
return ascension::CWorld::AddActiveEffect(arg2) __tailcall
