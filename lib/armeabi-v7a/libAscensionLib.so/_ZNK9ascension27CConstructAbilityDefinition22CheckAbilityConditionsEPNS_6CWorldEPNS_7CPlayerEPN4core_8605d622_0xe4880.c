// 函数: _ZNK9ascension27CConstructAbilityDefinition22CheckAbilityConditionsEPNS_6CWorldEPNS_7CPlayerEPN4core9CInstanceE
// 地址: 0xe4880
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (zx.d(*(arg1 + 0x30)) != 0)
    int32_t entry_r3
    
    if ((*(arg1 + 0x170))(arg2, arg3, entry_r3, *(arg1 + 0x184), 0, 0) == 0)
        return 0
    
    if (zx.d(*(arg1 + 0x70)) != 0)
        if ((*(arg1 + 0x174))(arg2, arg3, entry_r3, *(arg1 + 0x188), 0, 0) == 0)
            return 0
        
        if (zx.d(*(arg1 + 0xb0)) != 0)
            if ((*(arg1 + 0x178))(arg2, arg3, entry_r3, *(arg1 + 0x18c), 0, 0) == 0)
                return 0
            
            if (zx.d(*(arg1 + 0xf0)) != 0)
                int32_t result = 0
                
                if ((*(arg1 + 0x17c))(arg2, arg3, entry_r3, *(arg1 + 0x190), 0, 0) != 0)
                    result = 1
                    
                    if (zx.d(*(arg1 + 0x130)) != 0)
                        return (*(arg1 + 0x180))(arg2, arg3, entry_r3, *(arg1 + 0x194), 0, 0)
                
                return result

return 1
