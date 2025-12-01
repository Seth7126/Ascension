// 函数: GetCardInPlayExtraData
// 地址: 0x191328
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = 0
uint32_t r0_1 = *s_pWorldData

if (r0_1 != 0)
    uint32_t r6_1 = *(r0_1 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
    
    if (r6_1 != 0)
        int32_t r0_4 = core::CWorldBase::GetInstanceByID(r6_1)
        result = 0
        
        if (r0_4 != 0)
            int32_t r0_5 = __dynamic_cast(r0_4, _typeinfo_for_core::CInstance, 
                _typeinfo_for_ascension::CConstructInstance, 0)
            
            if (r0_5 != 0)
                int32_t r8_1 = *(r0_5 + 0x48)
                int32_t r5 = *(r0_5 + 0x4c)
                
                if (strcasecmp(*(*(r0_5 + 0x10) + 0xc) + 4, "Soul Collector") == 0)
                    result = ascension::CCardInPlayInstance::GetEffectData(r0_5)
                else
                    result = (r5 - r8_1) s>> 2
        
        int32_t r0_14 = core::CWorldBase::GetInstanceByID(r6_1)
        
        if (r0_14 != 0)
            int32_t r0_15 = __dynamic_cast(r0_14, _typeinfo_for_core::CInstance, 
                _typeinfo_for_ascension::CTrophyInstance, 0)
            
            if (r0_15 != 0)
                int32_t r5_1 = *(r0_15 + 0x3c)
                int32_t r6_2 = *(r0_15 + 0x40)
                
                if (strcasecmp(*(*(r0_15 + 0x10) + 0xc) + 4, "Akam, the Genie") == 0)
                    return ascension::CCardInPlayInstance::GetEffectData(r0_15) __tailcall
                
                return (r6_2 - r5_1) s>> 2

return result
