// 函数: _ZN14ascensionrules49IfNoCardsUnderThisConstructAndMonseterInCenterRowEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x10179c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 0x4c) == *(arg3 + 0x48))
    void* r0_2 = ascension::CWorld::GetCenterRowCard(arg1)
    
    if (r0_2 != 0)
        result = 1
    
    if (r0_2 == 0 || *(*(r0_2 + 0xc) + 0x88) != 3)
        result = 1
        void* r0_6 = ascension::CWorld::GetCenterRowCard(arg1)
        
        if (r0_6 == 0 || *(*(r0_6 + 0xc) + 0x88) != 3)
            void* r0_10 = ascension::CWorld::GetCenterRowCard(arg1)
            
            if (r0_10 == 0 || *(*(r0_10 + 0xc) + 0x88) != 3)
                void* r0_14 = ascension::CWorld::GetCenterRowCard(arg1)
                
                if (r0_14 == 0 || *(*(r0_14 + 0xc) + 0x88) != 3)
                    void* r0_18 = ascension::CWorld::GetCenterRowCard(arg1)
                    
                    if (r0_18 == 0 || *(*(r0_18 + 0xc) + 0x88) != 3)
                        void* r0_22 = ascension::CWorld::GetCenterRowCard(arg1)
                        
                        if (r0_22 == 0 || *(*(r0_22 + 0xc) + 0x88) != 3)
                            void* r0_26 = ascension::CWorld::GetCenterRowCard(arg1)
                            
                            if (r0_26 == 0)
                                return 0
                            
                            if (*(*(r0_26 + 0xc) + 0x88) != 3)
                                return 0

return result
