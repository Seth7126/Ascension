// 函数: _ZN14ascensionrules21CStateSetupDreamscape10EnterStateER13CStateMachine
// 地址: 0x14c020
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

CGameStateSimultaneous::EnterState(arg1)
int32_t r0 = *(arg1 + 0x158)
int32_t r1 = *(r0 + 0x18)
int32_t r2 = *(r0 + 0x1c)

if (r2 != r1)
    int32_t i = 0
    
    do
        core::CCardInstance* r0_1 = ascension::CWorld::GetPlayer(r0)
        
        if (*(arg1 + 0x15c) s> 0)
            int32_t j = 0
            
            do
                *(arg1 + 0x158)
                uint32_t r0_4 = ascension::CWorld::DrawCardFromDreamDeck()
                
                if (r0_4 != 0)
                    ascension::CPlayer::PutCardInHand(r0_1)
                    uint32_t r1_6 = zx.d(*(r0_1 + 8))
                    uint32_t var_38_1 = r1_6
                    ascension::CWorld::OutputAnimationCard(*(arg1 + 0x158), r0_4, 1, 8, 0, 1, r1_6, 
                        0xb)
                    *(r0_1 + 0xc)
                    ascension::CWorld::OutputPauseBrief(*(arg1 + 0x158))
                
                j += 1
            while (j s< *(arg1 + 0x15c))
        
        CState* r7_1 = 1
        char r1_9 = (*(r0_1 + 0xc)).b
        
        if (zx.d(*(*(arg1 + 0x158) + 0xa14)) == 0)
            r7_1 = *(r0_1 + 0x30)
            
            if (r7_1 != 0)
                r7_1 = 1
        
        void** r0_11 = operator new(0x254)
        int32_t r8_1 = *(arg1 + 0x160)
        CGameStateOptions::CGameStateOptions(r0_11.b)
        *r0_11 = _vtable_for_ascensionrules::CStateSelectCardsForDreamscape + 8
        r0_11[0x93] = r0_1
        r0_11[0x94] = r8_1
        CGameStateSimultaneous::AddSimultaneousState(arg1, r1_9, r7_1)
        r0 = *(arg1 + 0x158)
        i += 1
    while (i u< (r2 - r1) s>> 2)

return ascension::CWorld::OutputPauseForAnimationToDestination(r0) __tailcall
