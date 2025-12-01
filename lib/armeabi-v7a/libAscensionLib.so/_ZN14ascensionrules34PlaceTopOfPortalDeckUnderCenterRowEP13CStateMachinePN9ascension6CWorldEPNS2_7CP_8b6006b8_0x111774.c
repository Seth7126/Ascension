// 函数: _ZN14ascensionrules34PlaceTopOfPortalDeckUnderCenterRowEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x111774
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* i = *(arg7 + 4)

if (i == 0x11)
    uint32_t r5_1 = *(arg7 + 0x54)
    i = ascension::CWorld::GetCenterRowCardStackList(arg2)
    
    if (i != 0)
        int32_t* r1_1 = *i
        i = i[1]
        
        if (r1_1 != i)
            do
                int32_t r3 = *r1_1
                r1_1 = &r1_1[2]
                
                if (r3 == *(arg7 + 0x50))
                    i = ascension::CWorld::DrawCardFromPortalDeck()
                    
                    if (i != 0)
                        int32_t* i_1 = i
                        
                        do
                            if (*(i_1[3] + 0x88) != 4)
                                ascension::CWorld::PutCardUnderCenterRow(arg2, r5_1, i_1)
                                int32_t var_20 = 0
                                return ascension::CWorld::OutputAnimationCard(arg2, i_1, 2, 8, 0, 
                                    7, r5_1, 0)
                            
                            int32_t r1_2 = *(arg2 + 0xa6c)
                            
                            if (r1_2 != 0)
                                ascension::CWorld::RemoveEventCardInPlay(arg2, r1_2.b)
                            
                            ascension::CWorld::PutEventCardInPlay(arg2)
                            
                            if (*(*(arg2 + 0xa3c) + 0x18) == 0)
                                i = *(arg2 + 0xa4c)
                                int32_t* r6_1 = i[3]
                                
                                if (r6_1 == i[4])
                                    break
                                
                                while (true)
                                    if (*(*(*r6_1 + 0xc) + 0x88) != 4)
                                        if (ascension::CWorld::IsResolveEffect(arg2) == 0)
                                            break
                                        
                                        i = *(arg2 + 0xa4c)
                                    
                                    r6_1 = &r6_1[1]
                                    
                                    if (r6_1 == i[4])
                                        return i
                            
                            i = ascension::CWorld::DrawCardFromPortalDeck()
                            i_1 = i
                        while (i != 0)
                    
                    break
            while (i != r1_1)

return i
