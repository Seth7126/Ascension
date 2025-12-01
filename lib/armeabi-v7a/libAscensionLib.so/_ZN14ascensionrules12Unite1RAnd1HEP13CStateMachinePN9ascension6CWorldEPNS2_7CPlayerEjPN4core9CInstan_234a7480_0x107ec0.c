// 函数: _ZN14ascensionrules12Unite1RAnd1HEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x107ec0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CInstance* r0_1 = ascension::CDatabase::GetActiveEffect(ascension::g_Database)
core::CInstance* r5 = arg5

if (arg7 != 0 && *(arg7 + 4) == 0x17)
    core::CInstance* r0_3 = *(arg7 + 0x50)
    
    if (r0_3 != 0)
        r5 = r0_3

core::CWorldBase* r0_4 = operator new(0x150)
ascension::CActiveEffectDefinition* r2 = *(arg2 + 4)
*(arg2 + 4) = r2 + 1
ascension::CPlayer* var_24 = arg3
ascension::CActiveEffectInstance::CActiveEffectInstance(r0_4, arg2, r2, r0_1, r5)
core::CWorldBase::AddInstance(arg2)
ascension::CActiveEffectInstance::AddEffectDurationFunc(r0_4, "WhenYouPlayLifeboundHero")
ascension::CActiveEffectInstance::AddEffectDurationFunc(r0_4, "UntilEndOfTurn")
return ascension::CWorld::AddActiveEffect(arg2) __tailcall
