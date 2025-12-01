// 函数: _ZN14ascensionrules43CStateProcessAcquireOrDefeatTopOfCenterDeck10EnterStateER13CStateMachine
// 地址: 0x1317e0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CCardInPlayInstance* r5 = *(*(arg1 + 0x24c) + 4)
void* i_2 = ascension::CWorld::DrawCardFromPortalDeck()
*(arg1 + 0x254) = i_2

if (i_2 != 0)
    void* i_1 = i_2
    void* i
    
    do
        if (*(*(i_1 + 0xc) + 0x88) != 4)
            core::CWorldBase::OutputMessageFormat(r5, "%s reveals %s\n", *(arg1 + 0x24c) + 0x10, 
                *(i_1 + 0xc) + 4)
            int32_t var_20_1 = 0
            ascension::CWorld::OutputAnimationCard(r5, *(arg1 + 0x254), 0xa, 8, 0, 0xc, 0, 0)
            ascension::CWorld::OutputPauseForAnimationConfirmation()
            uint32_t r1_7 = *(arg1 + 0x254)
            
            switch (*(*(r1_7 + 0xc) + 0x88) - 1)
                case 0, 1, 5
                    goto label_131990
                case 2
                    ascension::CWorld::PushRevealCard(r5, r1_7, 4)
                case 7
                    ascension::CWorld::AssignPortalCard(r5)
                    r1_7 = *(arg1 + 0x254)
                label_131990:
                    ascension::CWorld::PushRevealCard(r5, r1_7, 3)
            
            ascension::CWorld::OutputPauseForAnimationToDestination(r5)
            *(arg1 + 0x258) = 0
            break
        
        int32_t r1_1 = *(r5 + 0xa6c)
        
        if (r1_1 != 0)
            ascension::CWorld::RemoveEventCardInPlay(r5, r1_1.b)
            *(arg1 + 0x254)
        
        ascension::CWorld::PutEventCardInPlay(r5)
        
        if (*(*(r5 + 0xa3c) + 0x18) == 0)
            void* r0_9 = *(r5 + 0xa4c)
            int32_t* j = *(r0_9 + 0xc)
            
            if (j != *(r0_9 + 0x10))
                do
                    if (*(*(*j + 0xc) + 0x88) != 4)
                        if (ascension::CWorld::IsResolveEffect(r5) == 0)
                            goto label_13185c
                        
                        r0_9 = *(r5 + 0xa4c)
                    
                    j = &j[1]
                while (j != *(r0_9 + 0x10))
            
            *(arg1 + 0x254) = 0
            break
        
    label_13185c:
        i = ascension::CWorld::DrawCardFromPortalDeck()
        i_1 = i
        *(arg1 + 0x254) = i
    while (i != 0)

*(arg1 + 0x25c) = 0
return 0
