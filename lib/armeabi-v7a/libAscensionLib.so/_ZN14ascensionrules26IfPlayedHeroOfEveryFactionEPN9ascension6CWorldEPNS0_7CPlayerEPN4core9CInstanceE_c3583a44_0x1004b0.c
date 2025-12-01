// 函数: _ZN14ascensionrules26IfPlayedHeroOfEveryFactionEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x1004b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0
core::CCardInstance* r7 = nullptr

if (arg3 != 0)
    r7 = __dynamic_cast(arg3, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)

if (ascension::CWorld::GetPlayedHeroCount(arg1, 1, r7) s>= arg4)
    result = 0
    
    if (ascension::CWorld::GetPlayedHeroCount(arg1, 2, r7) s>= arg4)
        result = 0
        
        if (ascension::CWorld::GetPlayedHeroCount(arg1, 3, r7) s>= arg4)
            result = 0
            
            if (ascension::CWorld::GetPlayedHeroCount(arg1, 4, r7) s>= arg4)
                return 1

return result
