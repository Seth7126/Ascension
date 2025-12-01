// 函数: _ZN14ascensionrules37LoseInsightMinusMechanaConstructCountEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x106d10
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CInstance* r5

if (arg5 == 0)
    r5 = nullptr
else
    core::CInstance* r0_1 =
        __dynamic_cast(arg5, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)
    
    if (r0_1 == 0)
        r5 = nullptr
        void* r0_3 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
            _typeinfo_for_ascension::CConstructAbilityInstance, 0)
        
        if (r0_3 != 0)
            r5 = *(r0_3 + 0xc)
    else
        r5 = r0_1

int32_t result = ascension::CPlayer::CountConstructsInPlay(arg3, true, nullptr)
int32_t r1_2 = arg4 - result

if (r1_2 s< 1)
    return result

if (zx.d(*(arg2 + 0xb3d)) != 0)
    uint32_t r2_2 = zx.d(*(arg2 + 0xb29))
    uint32_t r0_6 = r2_2
    
    if (r2_2 != 0)
        r0_6 = 8
    
    if (*(arg2 + 0xb48) s> 0)
        ascensionrules::CreateStateMustPayResources(arg3, r5, 0, 0, r1_2, r0_6, 8, 0)
        return CStateMachine::PushOwnedState(arg1) __tailcall
    
    if (r2_2 != 0 && *(arg2 + 0xb40) s>= 1)
        ascensionrules::CreateStateMustPayResources(arg3, r5, 0, 0, r1_2, r0_6, 8, 0)
        return CStateMachine::PushOwnedState(arg1) __tailcall

return ascension::CPlayer::RemoveInsightCount(arg3) __tailcall
