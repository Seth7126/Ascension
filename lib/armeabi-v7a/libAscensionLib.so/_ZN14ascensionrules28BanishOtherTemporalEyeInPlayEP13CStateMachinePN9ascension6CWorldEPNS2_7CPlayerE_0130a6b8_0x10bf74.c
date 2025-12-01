// 函数: _ZN14ascensionrules28BanishOtherTemporalEyeInPlayEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10bf74
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* r4 = *(arg3 + 0x54)
int32_t result = *(arg3 + 0x58)

if (r4 != result)
    int32_t r6_1 = *(arg5 + 0xc)
    int32_t* r7_1
    
    while (true)
        r7_1 = *r4
        
        if (r7_1 != r6_1)
            result = strcasecmp((*(*r7_1 + 0xc))(r7_1), "Temporal Eye")
            
            if (result == 0)
                break
            
            result = *(arg3 + 0x58)
        
        r4 = &r4[1]
        
        if (r4 == result)
            r7_1 = nullptr
            break
    
    if (r7_1 != 0)
        uint32_t r6_2 = r7_1[4]
        int32_t var_28_1 = 0
        ascension::CWorld::OutputAnimationCard(arg2, r6_2, 6, 4, zx.d(r7_1[2].w), 9, 0, 
            &(*__elf_header.ident.signature)[2])
        result = ascension::CPlayer::RemoveConstructFromPlay(arg3)
        
        if (result != 0)
            if (*(arg2 + 0xb20) == arg3)
                ascension::CWorld::AddToBanishedCardCount()
            
            ascension::CPlayer::RemoveOwnedCard(arg3)
            ascension::CWorld::PutCardInVoid(arg2)
            ascension::CPlayer::AddTurnLog(arg3, 6)
            return core::CWorldBase::OutputMessageFormat(arg2, "%s banishes %s from play\n", 
                (*(*arg3 + 0xc))(arg3), (*(*r6_2 + 0xc))(r6_2)) __tailcall

return result
