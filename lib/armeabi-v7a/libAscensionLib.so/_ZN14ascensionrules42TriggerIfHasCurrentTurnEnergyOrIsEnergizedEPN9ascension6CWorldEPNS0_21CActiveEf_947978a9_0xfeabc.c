// 函数: _ZN14ascensionrules42TriggerIfHasCurrentTurnEnergyOrIsEnergizedEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfeabc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = 1

if (*(arg1 + 0xb4c) u< arg4)
    result = 0
    
    if (*(arg1 + 0x30) u>= 0xf)
        int32_t r0_2 = *(arg2 + 0x10)
        
        if (r0_2 != 0)
            result = 0
            
            if (__dynamic_cast(r0_2, _typeinfo_for_core::CInstance, 
                    _typeinfo_for_ascension::CConstructInstance, 0) != 0)
                return ascension::CWorld::IsConstructEnergized(arg1) __tailcall

return result
