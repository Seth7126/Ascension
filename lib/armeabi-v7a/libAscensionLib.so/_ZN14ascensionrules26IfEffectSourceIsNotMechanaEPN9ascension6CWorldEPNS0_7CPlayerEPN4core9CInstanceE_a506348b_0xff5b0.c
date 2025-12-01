// 函数: _ZN14ascensionrules26IfEffectSourceIsNotMechanaEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0xff5b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0)
    return 0

int32_t r0_1 =
    __dynamic_cast(arg3, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)
int32_t r2_1 = r0_1

if (r0_1 == 0)
    if (arg3 == 0 || *(arg1 + 0x30) u< 0x17)
        return 0
    
    void* r0_8 = __dynamic_cast(arg3, _typeinfo_for_core::CInstance, 
        _typeinfo_for_ascension::CCardInPlayAbilityInstance, 0)
    
    if (r0_8 == 0)
        return 0
    
    r2_1 = *(*(r0_8 + 0xc) + 0x10)
    
    if (r2_1 == 0)
        return 0

return ascension::CWorld::QueryCardFaction(arg1, arg2, r2_1) ^ 1
