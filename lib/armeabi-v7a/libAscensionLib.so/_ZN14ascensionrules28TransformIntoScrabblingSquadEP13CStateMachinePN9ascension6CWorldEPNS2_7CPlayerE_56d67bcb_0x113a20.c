// 函数: _ZN14ascensionrules28TransformIntoScrabblingSquadEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x113a20
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result

if (arg5 != 0 && *(arg2 + 0x30) u>= 0x17)
    void* r0_2 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
        _typeinfo_for_ascension::CConstructAbilityInstance, 0)
    
    if (r0_2 != 0)
        void* r1_1 = *(r0_2 + 0xc)
        core::CCardInstance* r6_1 = *(r1_1 + 0x10)
        result = ascension::CPlayer::RemoveConstructFromPlay(*(r1_1 + 0xc))
        
        if (result == 0)
            return result
        
        ascensionrules::TransformCard(arg2, arg3, r6_1, "Scrabbling Squad", false)
        return ascension::CWorld::PopResolveEffect(arg2) __tailcall

result = *(arg2 + 0xbd8)
int32_t r1_5 = *(arg2 + 0xbdc)

if (r1_5 == result)
    return ascensionrules::TransformCard(arg2, arg3, arg5, "Scrabbling Squad", false)

int32_t r2_3 = 0

while (true)
    if (*(result + (r2_3 << 3)) == arg5 && *(result + (r2_3 << 3) + 4) == 7)
        return result
    
    r2_3 += 1
    
    if (r2_3 u>= (r1_5 - result) s>> 3)
        return ascensionrules::TransformCard(arg2, arg3, arg5, "Scrabbling Squad", false)
