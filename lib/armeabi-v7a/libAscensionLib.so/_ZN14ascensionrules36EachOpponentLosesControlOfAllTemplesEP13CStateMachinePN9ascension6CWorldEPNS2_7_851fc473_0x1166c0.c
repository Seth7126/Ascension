// 函数: _ZN14ascensionrules36EachOpponentLosesControlOfAllTemplesEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1166c0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = (*(arg2 + 0x1c) - *(arg2 + 0x18)) s>> 2

if (result u>= 2)
    int32_t i = 1
    
    do
        core::CCardInstance* r0_3 = ascension::CWorld::GetPlayerByTurnOrder(arg2, arg3)
        int32_t r0_4 = *(r0_3 + 0x48)
        int32_t r1_2 = *(r0_3 + 0x4c)
        
        if (r1_2 - r0_4 s>= 1)
            int32_t j = 0
            
            do
                void* r8_1 = *(r0_4 + (j << 2))
                int32_t* r6_1 = *(r8_1 + 0x10)
                
                if (*(r6_1[3] + 0x88) != 0xa)
                    j += 1
                else
                    uint32_t var_40
                    int32_t var_3c
                    int32_t var_38
                    int32_t var_34
                    uint32_t var_30
                    core::CWorldBase::OutputMessageFormat(arg2, "%s loses control of %s\n", 
                        r0_3 + 0x10, (*(*r6_1 + 0xc))(r6_1), var_40, var_3c, var_38, var_34, var_30)
                    var_40 = zx.d(*(r8_1 + 8))
                    var_3c = 0x17
                    var_38 = 0
                    var_34 = 2
                    var_30 = zx.d(*(r0_3 + 8))
                    ascension::CWorld::OutputAnimationCard(arg2, r6_1, 5, 5, var_40, 0x17, 0, 2)
                    ascension::CPlayer::RemoveCardInPlay(r0_3)
                    ascension::CPlayer::RemoveOwnedCard(r0_3)
                    ascension::CWorld::AddAvailableTemple(arg2)
                    r0_4 = *(r0_3 + 0x48)
                    r1_2 = *(r0_3 + 0x4c)
            while (j s< (r1_2 - r0_4) s>> 2)
        
        i += 1
        result = *(arg2 + 0x1c) - *(arg2 + 0x18)
    while (i u< result s>> 2)

return result
