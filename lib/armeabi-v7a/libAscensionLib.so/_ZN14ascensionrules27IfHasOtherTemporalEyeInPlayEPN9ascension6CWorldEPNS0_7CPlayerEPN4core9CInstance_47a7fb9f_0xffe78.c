// 函数: _ZN14ascensionrules27IfHasOtherTemporalEyeInPlayEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0xffe78
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0)
    return 0

int32_t r0_1 = __dynamic_cast(arg3, _typeinfo_for_core::CInstance, 
    _typeinfo_for_ascension::CConstructInstance, 0)

if (r0_1 != 0)
    int32_t* r4_1 = *(arg2 + 0x54)
    int32_t r1_1 = *(arg2 + 0x58)
    
    if (r4_1 != r1_1)
        do
            int32_t* r0_4 = *r4_1
            
            if (r0_4 != r0_1)
                if (strcasecmp((*(*r0_4 + 0xc))(), "Temporal Eye") == 0)
                    return 1
                
                r1_1 = *(arg2 + 0x58)
            
            r4_1 = &r4_1[1]
        while (r4_1 != r1_1)

return 0
