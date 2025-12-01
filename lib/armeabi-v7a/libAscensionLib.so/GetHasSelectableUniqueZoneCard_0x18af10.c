// 函数: GetHasSelectableUniqueZoneCard
// 地址: 0x18af10
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r1 = *s_pWorldData

if (r1 != 0)
    ascension::CPlayer* r4_1 = *(r1 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
    
    if (r4_1 != 0)
        int32_t r0_1 = *(r4_1 + 0xa7c)
        int32_t r1_3 = *(r4_1 + 0xa80) - r0_1
        int32_t r5_1
        
        if (r1_3 s< 1)
            r5_1 = 0
        else
            int32_t r7_1 = 0
            r5_1 = 0
            
            while (true)
                if (GameOptionManager::IsSelectableInstanceID((*(s_InterfaceContext + 8)).w, 
                        zx.d(*(*(r0_1 + (r7_1 << 2)) + 8))) != 0)
                    int32_t var_28_1 = 0
                    r5_1 = 1
                    
                    if (ascension::CWorld::QueryCardInsightCost(r4_1, *(s_InterfaceContext + 0xc), 
                            *(*(r4_1 + 0xa7c) + (r7_1 << 2)), 0x1b) == 0)
                        return 2
                
                r7_1 += 1
                
                if (r7_1 s>= r1_3 s>> 2)
                    break
                
                r0_1 = *(r4_1 + 0xa7c)
        
        return r5_1 & 1

return 0
