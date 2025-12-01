// 函数: _ZN14ascensionrules30IfCenterRowHasMechanaConstructEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x10158c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = ascension::CWorld::GetCenterRowCard(arg1)
int32_t r0_4
int32_t result

if (r0 != 0 && *(*(r0 + 0xc) + 0x88) == 2)
    r0_4 = ascension::CWorld::QueryCardFaction(arg1, arg2, r0)
    result = 1

if (r0 == 0 || *(*(r0 + 0xc) + 0x88) != 2 || r0_4 == 0)
    void* r0_6 = ascension::CWorld::GetCenterRowCard(arg1)
    int32_t r0_10
    
    if (r0_6 != 0 && *(*(r0_6 + 0xc) + 0x88) == 2)
        r0_10 = ascension::CWorld::QueryCardFaction(arg1, arg2, r0_6)
        result = 1
    
    if (r0_6 == 0 || *(*(r0_6 + 0xc) + 0x88) != 2 || r0_10 == 0)
        void* r0_12 = ascension::CWorld::GetCenterRowCard(arg1)
        int32_t r0_16
        
        if (r0_12 != 0 && *(*(r0_12 + 0xc) + 0x88) == 2)
            r0_16 = ascension::CWorld::QueryCardFaction(arg1, arg2, r0_12)
            result = 1
        
        if (r0_12 == 0 || *(*(r0_12 + 0xc) + 0x88) != 2 || r0_16 == 0)
            void* r0_18 = ascension::CWorld::GetCenterRowCard(arg1)
            int32_t r0_22
            
            if (r0_18 != 0 && *(*(r0_18 + 0xc) + 0x88) == 2)
                r0_22 = ascension::CWorld::QueryCardFaction(arg1, arg2, r0_18)
                result = 1
            
            if (r0_18 == 0 || *(*(r0_18 + 0xc) + 0x88) != 2 || r0_22 == 0)
                void* r0_24 = ascension::CWorld::GetCenterRowCard(arg1)
                int32_t r0_28
                
                if (r0_24 != 0 && *(*(r0_24 + 0xc) + 0x88) == 2)
                    r0_28 = ascension::CWorld::QueryCardFaction(arg1, arg2, r0_24)
                    result = 1
                
                if (r0_24 == 0 || *(*(r0_24 + 0xc) + 0x88) != 2 || r0_28 == 0)
                    void* r0_30 = ascension::CWorld::GetCenterRowCard(arg1)
                    int32_t r0_34
                    
                    if (r0_30 != 0 && *(*(r0_30 + 0xc) + 0x88) == 2)
                        r0_34 = ascension::CWorld::QueryCardFaction(arg1, arg2, r0_30)
                        result = 1
                    
                    if (r0_30 == 0 || *(*(r0_30 + 0xc) + 0x88) != 2 || r0_34 == 0)
                        void* r0_36 = ascension::CWorld::GetCenterRowCard(arg1)
                        
                        if (r0_36 == 0 || *(*(r0_36 + 0xc) + 0x88) != 2)
                            return 0
                        
                        result = 1
                        
                        if (ascension::CWorld::QueryCardFaction(arg1, arg2, r0_36) == 0)
                            return 0

return result
