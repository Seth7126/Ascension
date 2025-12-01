// 函数: _ZN14ascensionrules43AddToHonorPoolForEachTreasureUnderCenterRowEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x107950
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CEvent* result = arg7

if (result != 0)
    result = __dynamic_cast(result, _typeinfo_for_ascension::CEvent, 
        _typeinfo_for_ascension::CEventEnterCenterRow, 0)
    
    if (result != 0 && *(arg2 + 0xb0c) s>= 1)
        result = *(result + 0x5c)
        int32_t r6_2 = result * arg4
        
        if (r6_2 s>= 1)
            core::CWorldBase::OutputMessageFormat(arg2, "%s adds %d to Honor Pool\n", 
                (*(*arg5 + 0xc))(arg5), r6_2)
            return ascension::CWorld::SetHonorTokenPool(arg2) __tailcall

return result
