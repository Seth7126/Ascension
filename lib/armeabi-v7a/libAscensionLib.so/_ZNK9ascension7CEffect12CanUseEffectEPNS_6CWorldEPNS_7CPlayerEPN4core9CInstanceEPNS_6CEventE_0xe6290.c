// 函数: _ZNK9ascension7CEffect12CanUseEffectEPNS_6CWorldEPNS_7CPlayerEPN4core9CInstanceEPNS_6CEventE
// 地址: 0xe6290
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *arg1

if (r0 != 0)
    void* __offset(ascension::CWorld, 0x44) r5_1 = arg1 + 0x44
    int32_t r9_1 = 0
    
    while (zx.d(*(r5_1 - 0x40)) != 0)
        int32_t r6_1 = *r5_1
        
        if (r6_1 != 0)
            int32_t arg_0
            
            if (r6_1(arg2, arg3, arg4, *(r5_1 + 4), 0, arg_0, arg4) == 0)
                return 0
            
            r0 = *arg1
        
        r9_1 += 1
        r5_1 += 0x48
        
        if (r9_1 u>= r0)
            break

return 1
