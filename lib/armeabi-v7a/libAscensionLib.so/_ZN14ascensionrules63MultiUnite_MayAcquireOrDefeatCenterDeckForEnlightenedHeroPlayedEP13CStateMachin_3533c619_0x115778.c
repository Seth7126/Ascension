// 函数: _ZN14ascensionrules63MultiUnite_MayAcquireOrDefeatCenterDeckForEnlightenedHeroPlayedEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x115778
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CInstance* r6 = arg5
core::CCardInstance* r2_1

if (r6 == 0)
    r2_1 = nullptr
else
    r2_1 = __dynamic_cast(r6, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)

ascensionrules::CreateStateMayAcquireOrDefeatTopOfCenterDeck(arg3, 
    ascension::CWorld::GetPlayedHeroCount(arg2, 1, r2_1) * arg4)
CStateMachine::PushListState(arg1)
core::CInstance* r0_8 = ascension::CDatabase::GetActiveEffect(ascension::g_Database)

if (arg7 != 0 && *(arg7 + 4) == 0x17)
    core::CInstance* r0_10 = *(arg7 + 0x50)
    
    if (r0_10 != 0)
        r6 = r0_10

core::CWorldBase* r0_11 = operator new(0x150)
ascension::CActiveEffectDefinition* r2_2 = *(arg2 + 4)
*(arg2 + 4) = r2_2 + 1
ascension::CPlayer* var_24 = arg3
ascension::CActiveEffectInstance::CActiveEffectInstance(r0_11, arg2, r2_2, r0_8, r6)
core::CWorldBase::AddInstance(arg2)
ascension::CActiveEffectInstance::AddEffectDurationFunc(r0_11, "UntilEndOfTurn")
return ascension::CWorld::AddActiveEffect(arg2) __tailcall
