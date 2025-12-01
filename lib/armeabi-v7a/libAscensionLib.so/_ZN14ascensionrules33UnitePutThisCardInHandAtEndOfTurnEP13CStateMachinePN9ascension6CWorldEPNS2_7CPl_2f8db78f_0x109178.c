// 函数: _ZN14ascensionrules33UnitePutThisCardInHandAtEndOfTurnEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x109178
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CInstance* result_1

if (arg5 == 0)
    result_1 = nullptr
    
    if (arg7 != 0)
    label_1091d0:
        
        if (result_1 == 0)
            result_1 = nullptr
            
            if (*(arg7 + 4) == 0x17)
                core::CInstance* result = *(arg7 + 0x50)
                
                if (result != 0)
                    if (*(arg2 + 0x30) u>= 0x14)
                        int32_t r1_7 = *(arg2 + 0xbd8)
                        int32_t r2_5 = *(arg2 + 0xbdc)
                        
                        if (r2_5 != r1_7)
                            int32_t i = 0
                            
                            do
                                if (result == *(r1_7 + (i << 3)) && *(r1_7 + (i << 3) + 4) == 7)
                                    return result
                                
                                i += 1
                            while (i u< (r2_5 - r1_7) s>> 3)
                    
                    result_1 = result
else
    result_1 =
        __dynamic_cast(arg5, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)
    
    if (arg7 != 0)
        goto label_1091d0

core::CInstance* r0_4 = ascension::CDatabase::GetActiveEffect(ascension::g_Database)
core::CWorldBase* r0_5 = operator new(0x150)
ascension::CActiveEffectDefinition* r2_1 = *(arg2 + 4)
*(arg2 + 4) = r2_1 + 1
ascension::CPlayer* var_24 = arg3
ascension::CActiveEffectInstance::CActiveEffectInstance(r0_5, arg2, r2_1, r0_4, result_1)
core::CWorldBase::AddInstance(arg2)
ascension::CActiveEffectInstance::AddEffectDurationFunc(r0_5, "WhenYouPlayLifeboundHero")
ascension::CActiveEffectInstance::AddEffectDurationFunc(r0_5, "UntilEndOfTurn")
return ascension::CWorld::AddActiveEffect(arg2) __tailcall
