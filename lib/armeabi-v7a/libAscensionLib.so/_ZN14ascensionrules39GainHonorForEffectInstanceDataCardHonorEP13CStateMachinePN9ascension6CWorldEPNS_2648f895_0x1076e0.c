// 函数: _ZN14ascensionrules39GainHonorForEffectInstanceDataCardHonorEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1076e0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result = arg6 + (arg4 << 5)

if (zx.d(*(result + 0x10)) != 0)
    result = core::CWorldBase::GetInstanceByID(arg2)
    
    if (result != 0)
        result = __dynamic_cast(result, _typeinfo_for_core::CInstance, 
            _typeinfo_for_core::CCardInstance, 0)
        
        if (result != 0)
            ascension::CWorld* r1_2 = arg5
            return ascensionrules::GainHonor(arg1, r1_2, arg3, *(*(result + 0xc) + 0xa4), r1_2)

return result
