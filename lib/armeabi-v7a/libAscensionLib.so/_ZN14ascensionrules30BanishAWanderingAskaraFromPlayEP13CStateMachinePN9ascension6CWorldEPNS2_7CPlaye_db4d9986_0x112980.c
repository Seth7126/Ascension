// 函数: _ZN14ascensionrules30BanishAWanderingAskaraFromPlayEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x112980
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r4 = *(arg2 + 0xb80)
uint32_t result = *(arg2 + 0xb84) - r4
int32_t r5 = result s>> 3
ascension::CPlayer* r4_1
uint32_t r6_1

if (*(arg2 + 0x30) u<= 7)
    if (result != 0)
        int32_t r7_2 = 0
        
        while (true)
            uint32_t* r0_6 = r4 + (r7_2 << 3)
            r6_1 = *r0_6
            result = r0_6[1]
            
            if (result == 0)
                result = zx.d(*(arg5 + 8))
                
                if (zx.d(*(r6_1 + 8)) != result)
                    result = strcasecmp(*(r6_1 + 0xc) + 4, *(arg5 + 0xc) + 4)
                    
                    if (result == 0)
                        break
            
            r7_2 += 1
            
            if (r7_2 u>= r5)
                return result
        
        r4_1 = arg3
    label_112a9c:
        ascension::CPlayer::RemoveOwnedCard(r4_1)
        ascension::CWorld::PutCardInVoid(arg2)
        int32_t var_30 = 0
        ascension::CWorld::OutputAnimationCard(arg2, r6_1, 6, 0xa, 0, 9, 0, &__elf_header)
        ascension::CWorld::SetPlayedCardsFlags(arg2, r6_1)
        return ascension::CPlayer::AddTurnLog(r4_1, 6) __tailcall
else if (result != 0)
    int32_t r7_1 = 0
    
    while (true)
        int32_t* r0_2 = r4 + (r7_1 << 3)
        r6_1 = *r0_2
        result = r0_2[1]
        
        if (result == 0)
            result = zx.d(*(arg5 + 8))
            
            if (zx.d(*(r6_1 + 8)) != result)
                result = strcasecmp(*(r6_1 + 0xc) + 4, "Wandering Askara")
                
                if (result == 0)
                    break
        
        r7_1 += 1
        
        if (r7_1 u>= r5)
            return result
    
    r4_1 = arg3
    
    if (*(arg2 + 0xb20) == r4_1)
        ascension::CWorld::AddToBanishedCardCount()
    
    goto label_112a9c
return result
