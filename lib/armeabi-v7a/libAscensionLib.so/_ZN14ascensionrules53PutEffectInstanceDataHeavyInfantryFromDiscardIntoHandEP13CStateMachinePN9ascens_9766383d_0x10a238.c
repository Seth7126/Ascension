// 函数: _ZN14ascensionrules53PutEffectInstanceDataHeavyInfantryFromDiscardIntoHandEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10a238
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CEffectInstanceData* result = arg6
void* r8_1 = result + arg4 + 4

if (zx.d(*r8_1) != 0)
    void* r9_1 = result + (arg4 << 5) + 0x10
    int32_t r10_1 = 0
    
    do
        if (zx.d(*(r9_1 + (r10_1 << 2))) != 0)
            int32_t r0_3 = core::CWorldBase::GetInstanceByID(arg2)
            
            if (r0_3 != 0)
                core::CCardInstance* r0_4 = __dynamic_cast(r0_3, _typeinfo_for_core::CInstance, 
                    _typeinfo_for_core::CCardInstance, 0)
                
                if (r0_4 != 0 && strcasecmp(*(r0_4 + 0xc) + 0x44, "Heavy Infantry") == 0)
                    ascensionrules::CreateStateRecoverHeroFromDiscardPile(arg3, 0, r0_4)
                    return CStateMachine::PushListState(arg1) __tailcall
        
        result = zx.d(*r8_1)
        r10_1 += 1
    while (r10_1 u< result)

return result
