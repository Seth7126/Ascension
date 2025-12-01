// 函数: _ZN14ascensionrules42TriggerPlayedHeroIsLifeboundUntilEndOfTurnEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11b990
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CActiveEffectInstance* r4 = *(arg2 + 4)
int32_t result = *(arg4 + 4)

if (*(r4 + 0x30) u> 3)
    if (result == 0x13)
    label_11b9c8:
        void* r7_1 = *(arg4 + 0x50)
        result = ascension::CCard::IsCardFaction(*(r7_1 + 0xc))
        
        if (result == 0)
            core::CInstance* r0_2 = ascension::CDatabase::GetActiveEffect(ascension::g_Database)
            core::CWorldBase* r0_3 = operator new(0x150)
            ascension::CActiveEffectDefinition* r2 = *(r4 + 4)
            *(r4 + 4) = r2 + 1
            void* var_24 = r7_1
            ascension::CActiveEffectInstance::CActiveEffectInstance(r0_3, r4, r2, r0_2, arg3)
            core::CWorldBase::AddInstance(r4)
            ascension::CActiveEffectInstance::AddEffectDurationFunc(r0_3, "UntilEndOfTurn")
            return ascension::CWorld::AddActiveEffect(r4) __tailcall
else if (result == 0x14)
    goto label_11b9c8

return result
