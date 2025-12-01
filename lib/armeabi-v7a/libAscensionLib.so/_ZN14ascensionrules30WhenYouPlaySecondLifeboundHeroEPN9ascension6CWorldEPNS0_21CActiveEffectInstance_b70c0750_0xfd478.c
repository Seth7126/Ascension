// 函数: _ZN14ascensionrules30WhenYouPlaySecondLifeboundHeroEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfd478
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) == 0x14)
    core::CCardInstance* r1 = *(arg3 + 0x4c)
    
    if (*(arg2 + 0x14) == r1)
        void* r2 = *(arg3 + 0x50)
        
        if ((*(*(r2 + 0xc) + 0x88) | 8) == 9
                && ascension::CWorld::QueryCardFaction(arg1, r1, r2) != 0)
            int32_t r0_8 = *(arg2 + 0x10)
            core::CCardInstance* r2_1 = nullptr
            
            if (r0_8 != 0)
                r2_1 = __dynamic_cast(r0_8, _typeinfo_for_core::CInstance, 
                    _typeinfo_for_core::CCardInstance, 0)
            
            if (ascension::CWorld::GetPlayedHeroCount(arg1, 2, r2_1) s> 1)
                return 1

return 0
