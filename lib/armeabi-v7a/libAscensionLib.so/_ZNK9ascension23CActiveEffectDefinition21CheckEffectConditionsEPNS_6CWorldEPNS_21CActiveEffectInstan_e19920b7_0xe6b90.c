// 函数: _ZNK9ascension23CActiveEffectDefinition21CheckEffectConditionsEPNS_6CWorldEPNS_21CActiveEffectInstanceEPNS_6CEventE
// 地址: 0xe6b90
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = 1

if (zx.d(*(arg1 + 0x5c)) != 0)
    int32_t r6_1 = *(arg1 + 0x19c)
    
    if (r6_1 == 0)
        return 0
    
    int32_t entry_r3
    
    if (r6_1(arg2, arg3, entry_r3, *(arg1 + 0x1b0)) == 0)
        return 0
    
    if (zx.d(*(arg1 + 0x9c)) != 0)
        int32_t r6_2 = *(arg1 + 0x1a0)
        
        if (r6_2 == 0)
            return 0
        
        if (r6_2(arg2, arg3, entry_r3, *(arg1 + 0x1b4)) == 0)
            return 0
        
        if (zx.d(*(arg1 + 0xdc)) != 0)
            int32_t r6_3 = *(arg1 + 0x1a4)
            
            if (r6_3 == 0)
                return 0
            
            if (r6_3(arg2, arg3, entry_r3, *(arg1 + 0x1b8)) == 0)
                return 0
            
            if (zx.d(*(arg1 + 0x11c)) != 0)
                int32_t r6_4 = *(arg1 + 0x1a8)
                
                if (r6_4 == 0)
                    return 0
                
                if (r6_4(arg2, arg3, entry_r3, *(arg1 + 0x1bc)) == 0)
                    return 0
                
                if (zx.d(*(arg1 + 0x15c)) != 0)
                    int32_t r12_1 = *(arg1 + 0x1ac)
                    result = 0
                    
                    if (r12_1 != 0)
                        *(arg1 + 0x1c0)
                        jump(r12_1)

return result
