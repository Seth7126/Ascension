// 函数: _ZN14ascensionrules23CStateAuctionForInsight11UpdateStateER13CStateMachine
// 地址: 0x14287c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
CState* entry_r1

if (*(arg1 + 0x38) s<= 0 && *(arg1 + 0x30) == 0)
    int32_t r0_6 = *(arg1 + 0x25c)
    
    if (r0_6 s>= 1)
        if (r0_6 != 1 || *(arg1 + 0x258) == 0)
            return ascensionrules::CStateAuctionForInsight::BuildBidOptions(arg1) __tailcall
        
        if (zx.d(*(arg1 + 0x268)) != 0)
            int32_t r1_5 = *(arg1 + 0x24c)
            *(arg1 + 0x254)
            *(arg1 + 0x25c) = 0
            *(arg1 + 0x268) = 0
            ascension::CPlayer* r6_1 = *(r1_5 + 4)
            ascension::CPlayer* r0_10 = ascension::CWorld::GetPlayerByTurnOrder(r6_1, r1_5)
            core::CWorldBase::OutputMessageFormat(r6_1, "%s pays %d insight\n", 
                (*(*r0_10 + 0xc))(r0_10), *(arg1 + 0x258))
            int32_t var_30_1 = 1
            ascension::CWorld::OutputEvent(r6_1, 0x3e, zx.d(*(r0_10 + 8)), 
                zx.d(*(*(arg1 + 0x250) + 8)))
            int32_t var_30_2 = 0
            ascension::CWorld::OutputAnimationInsight(r6_1, *(arg1 + 0x258), *(arg1 + 0x250), r0_10)
            *(arg1 + 0x258)
            ascension::CPlayer::RemoveInsightCount(r0_10)
            ascension::CWorld::OutputPauseForAllAnimation()
            core::CInstance* r3_5 = *(arg1 + 0x250)
            void* result = *(r3_5 + 0xc)
            ascension::CEffect* r2_8 = *(result + 0xe8)
            
            if (r2_8 == 0)
                return result
            
            ascensionrules::CreateStateProcessCardEffect(r6_1, r0_10, r2_8, r3_5, nullptr, nullptr, 
                0)
            return CStateMachine::PushOwnedState(entry_r1) __tailcall

if (zx.d(*(arg1 + 0x269)) != 0)
    ascension::CPlayer* r0_3 = *(arg1 + 0x24c)
    *(arg1 + 0x269) = 0
    void* r1 = *(r0_3 + 4)
    
    if (zx.d(*(r1 + 0xa14)) != 0)
        void* r1_1 = *(r1 + 0x14)
        
        if (r1_1 != 0 && *(r1_1 + 4) != *(r0_3 + 0xc))
            ascensionrules::CreateStateProcessPlayProxyTurn(r0_3)
            return CStateMachine::PushOwnedState(entry_r1) __tailcall

return CGameStateOptions::UpdateState(arg1) __tailcall
