// 函数: _ZN14ascensionrules27MarkHeroIsLifeboundThisTurnEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x107cc4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* result = arg6 + (arg4 << 5)

if (zx.d(*(result + 0x10)) != 0)
    core::CInstance* r6_1 = arg5
    result = core::CWorldBase::GetInstanceByID(arg2)
    
    if (result != 0)
        result = __dynamic_cast(result, _typeinfo_for_core::CInstance, 
            _typeinfo_for_core::CCardInstance, 0)
        
        if (result != 0)
            void* result_1 = result
            result = ascension::CCard::IsCardFaction(*(result + 0xc))
            
            if (result == 0)
                core::CInstance* r0_4 = ascension::CDatabase::GetActiveEffect(ascension::g_Database)
                
                if (arg7 != 0 && *(arg7 + 4) == 0x17)
                    core::CInstance* r0_6 = *(arg7 + 0x50)
                    
                    if (r0_6 != 0)
                        r6_1 = r0_6
                
                core::CWorldBase* r0_7 = operator new(0x150)
                ascension::CActiveEffectDefinition* r2_1 = *(arg2 + 4)
                *(arg2 + 4) = r2_1 + 1
                void* result_2 = result_1
                ascension::CActiveEffectInstance::CActiveEffectInstance(r0_7, arg2, r2_1, r0_4, 
                    r6_1)
                core::CWorldBase::AddInstance(arg2)
                ascension::CActiveEffectInstance::AddEffectDurationFunc(r0_7, "UntilEndOfTurn")
                return ascension::CWorld::AddActiveEffect(arg2) __tailcall

return result
