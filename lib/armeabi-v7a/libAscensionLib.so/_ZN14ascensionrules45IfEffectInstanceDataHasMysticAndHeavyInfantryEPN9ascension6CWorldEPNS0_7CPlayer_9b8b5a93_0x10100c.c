// 函数: _ZN14ascensionrules45IfEffectInstanceDataHasMysticAndHeavyInfantryEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x10100c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = 0
bool cond:0 = arg5 u> 0

if (arg5 != 0)
    cond:0 = *arg5 u> arg4

if (cond:0 && zx.d(*(arg5 + arg4 + 4)) != 0)
    int32_t r8_1 = 0
    int32_t r10_1 = 0
    int32_t i = 0
    
    do
        if (zx.d(*(arg5 + (arg4 << 5) + 0x10 + (i << 2))) != 0)
            int32_t r0_5 = core::CWorldBase::GetInstanceByID(arg1)
            
            if (r0_5 != 0)
                void* r0_6 = __dynamic_cast(r0_5, _typeinfo_for_core::CInstance, 
                    _typeinfo_for_core::CCardInstance, 0)
                
                if (r0_6 != 0)
                    char* __s1 = *(r0_6 + 0xc) + 0x44
                    int32_t temp0_1 = 0
                    int32_t j = strcasecmp(__s1, "Mystic")
                    
                    while (j != 0)
                        j u>>= 1
                        temp0_1 += 1
                    
                    r8_1 |= (0x20 - temp0_1) u>> 5
                    int32_t temp0_2 = 0
                    int32_t j_1 = strcasecmp(__s1, "Heavy Infantry")
                    
                    while (j_1 != 0)
                        j_1 u>>= 1
                        temp0_2 += 1
                    
                    r10_1 |= (0x20 - temp0_2) u>> 5
        
        i += 1
    while (i u< zx.d(*(arg5 + arg4 + 4)))
    
    r0 = r10_1 & r8_1

return r0 & 1
