// 函数: _ZN14ascensionrules20AcquireTransformCardEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x114c50
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg5 == 0)
    return 

CStateMachine* r6_1 = arg1
core::CCardInstance* r0_1 =
    __dynamic_cast(arg5, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)
core::CCardInstance* r1_1 = r0_1

if (r0_1 != 0)
label_114cfc:
    
    if (*(arg2 + 0x30) u>= 0x14)
        ascensionrules::CreateStateProcessAcquireChampionHero(arg3, r1_1, 3)
        return CStateMachine::PushListState(r6_1) __tailcall
    
    void* r7_1 = *(*(r1_1 + 0xc) + 0x150)
    
    if (r7_1 != 0)
        arg1 = ascension::CWorld::CreateCard(arg2)
        
        if (arg1 != 0)
            core::CInstance** i = *(r7_1 + 0x130)
            
            while (i != *(r7_1 + 0x134))
                core::CInstance* r1_7 = *i
                i = &i[1]
                ascension::CWorld::AddGlobalActiveEffect(arg2, r1_7)
            
            ascension::CPlayer::AddTurnLog(arg3, 3)
            int32_t var_38_1 = 0
            ascension::CWorld::OutputEvent(arg2, 0x17, zx.d(*(arg3 + 8)), 0)
            ascension::CPlayer::AddOwnedCard(arg3)
            ascension::CPlayer::PutCardInDiscard(arg3)
            int32_t var_28_1 = 0
            ascension::CWorld::OutputAnimationCard(arg2, arg1, 3, 0xb, 0, 3, zx.d(*(arg3 + 8)), 1)
else
    void* r0_3 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
        _typeinfo_for_ascension::CCardInPlayInstance, 0)
    
    if (r0_3 != 0)
        goto label_114cec
    
    arg1 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
        _typeinfo_for_ascension::CCardInPlayAbilityInstance, 0)
    
    if (arg1 != 0)
        r0_3 = *(arg1 + 0xc)
    label_114cec:
        r1_1 = *(r0_3 + 0x10)
        
        if (r1_1 != 0)
            goto label_114cfc
