// 函数: _ZN14ascensionrules33IfCenterRowHasCardFromEachFactionEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0xffb1c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r4 = 0
void* r0 = ascension::CWorld::GetCenterRowCard(arg1)

if (r0 != 0)
    r4 = *(*(r0 + 0xc) + 0x8c)

void* r0_3 = ascension::CWorld::GetCenterRowCard(arg1)

if (r0_3 != 0)
    r4 |= *(*(r0_3 + 0xc) + 0x8c)

void* r0_7 = ascension::CWorld::GetCenterRowCard(arg1)

if (r0_7 != 0)
    r4 |= *(*(r0_7 + 0xc) + 0x8c)

void* r0_11 = ascension::CWorld::GetCenterRowCard(arg1)

if (r0_11 != 0)
    r4 |= *(*(r0_11 + 0xc) + 0x8c)

void* r0_15 = ascension::CWorld::GetCenterRowCard(arg1)

if (r0_15 != 0)
    r4 |= *(*(r0_15 + 0xc) + 0x8c)

void* r0_19 = ascension::CWorld::GetCenterRowCard(arg1)

if (r0_19 != 0)
    r4 |= *(*(r0_19 + 0xc) + 0x8c)

void* r0_23 = ascension::CWorld::GetCenterRowCard(arg1)
bool cond:7 = r0_23 != 0

if (r0_23 != 0)
    r0_23 = *(r0_23 + 0xc)

int32_t i = 1

if (cond:7)
    r4 |= *(r0_23 + 0x8c)

do
    if ((r4 & 1 << (i & 0xff)) == 0)
        int32_t r0_26 = ascension::CWorld::GetCenterRowCard(arg1)
        int32_t r0_28
        
        if (r0_26 != 0)
            r0_28 = ascension::CWorld::QueryCardFaction(arg1, arg2, r0_26)
        
        if (r0_26 == 0 || r0_28 == 0)
            int32_t r0_30 = ascension::CWorld::GetCenterRowCard(arg1)
            int32_t r0_32
            
            if (r0_30 != 0)
                r0_32 = ascension::CWorld::QueryCardFaction(arg1, arg2, r0_30)
            
            if (r0_30 == 0 || r0_32 == 0)
                int32_t r0_34 = ascension::CWorld::GetCenterRowCard(arg1)
                int32_t r0_36
                
                if (r0_34 != 0)
                    r0_36 = ascension::CWorld::QueryCardFaction(arg1, arg2, r0_34)
                
                if (r0_34 == 0 || r0_36 == 0)
                    int32_t r0_38 = ascension::CWorld::GetCenterRowCard(arg1)
                    int32_t r0_40
                    
                    if (r0_38 != 0)
                        r0_40 = ascension::CWorld::QueryCardFaction(arg1, arg2, r0_38)
                    
                    if (r0_38 == 0 || r0_40 == 0)
                        int32_t r0_42 = ascension::CWorld::GetCenterRowCard(arg1)
                        int32_t r0_44
                        
                        if (r0_42 != 0)
                            r0_44 = ascension::CWorld::QueryCardFaction(arg1, arg2, r0_42)
                        
                        if (r0_42 == 0 || r0_44 == 0)
                            int32_t r0_46 = ascension::CWorld::GetCenterRowCard(arg1)
                            int32_t r0_48
                            
                            if (r0_46 != 0)
                                r0_48 = ascension::CWorld::QueryCardFaction(arg1, arg2, r0_46)
                            
                            if (r0_46 == 0 || r0_48 == 0)
                                int32_t r0_50 = ascension::CWorld::GetCenterRowCard(arg1)
                                int32_t r0_52
                                
                                if (r0_50 != 0)
                                    r0_52 = ascension::CWorld::QueryCardFaction(arg1, arg2, r0_50)
                                
                                if (r0_50 == 0 || r0_52 == 0)
                                    return 0
        
        r4 |= 1 << i
    
    i += 1
while (i u< 5)

return 1
