// 函数: _ZN14ascensionrules34CStateProcessDefeatMonsterSequence9ExitStateER13CStateMachine
// 地址: 0x158798
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r0 = *(arg1 + 0x30)
uint32_t r1 = *(arg1 + 0x34)
int32_t r3 = *(arg1 + 0x48)
core::CCardInstance* r6 = *(r0 + 4)
void* r2 = *(r1 + 0xc)
uint32_t r0_6
uint32_t r3_3
int32_t var_28_2

if (r3 - 3 u> 5)
label_158898:
    
    if (zx.d(*(arg1 + 0xb8)) != 0 && zx.d(*(arg1 + 0xb9)) == 0)
        if (*(r6 + 0x30) u>= 0x10 && r3 == 9 && *(r2 + 0x150) != 0)
            ascension::CWorld::PutCardInVoid(r6)
        
        if (*(arg1 + 0x38) == 7)
            ascension::CWorld::OutputPauseForAnimationToDestination(r6)
        
        int32_t var_38_3 = 0
        var_28_2 = 0
        ascension::CWorld::OutputAnimationCard(r6, *(arg1 + 0x34), 4, 0xb, 0, 9, 0, &__elf_header)
else
    switch (r3)
        case 3
            if (zx.d(*(arg1 + 0xb9)) == 0)
                if (*(r6 + 0x30) u>= 0x10 && *(r2 + 0x150) != 0)
                    int32_t var_38_1 = 0
                    ascension::CWorld::AddToAcquiredCards(r6, r1.b, *(arg1 + 0x38), 3)
                    *(arg1 + 0x34)
                    ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 3)
                    *(arg1 + 0x34)
                    ascension::CPlayer::PutCardInDiscard(*(arg1 + 0x30))
                    *(arg1 + 0x34)
                    ascension::CPlayer::AddOwnedCard(*(arg1 + 0x30))
                    r0 = *(arg1 + 0x30)
                    r1 = *(arg1 + 0x34)
                
                r0_6 = zx.d(*(r0 + 8))
                r3_3 = 3
                goto label_158880
        case 5
            r0_6 = zx.d(*(ascension::CPlayer::FindCardInPlay(r0) + 8))
            r1 = *(arg1 + 0x34)
            r3_3 = 5
        label_158880:
            int32_t var_38_2 = 0
            int32_t var_28_1 = 0
            ascension::CWorld::OutputAnimationCard(r6, r1, 4, 0xb, 0, r3_3, r0_6, 0)
        case 6, 7
            goto label_158898
        case 8
            if (zx.d(*(arg1 + 0xb9)) == 0)
                if (*(r6 + 0x30) u>= 0x10 && *(r2 + 0x150) != 0)
                    ascension::CWorld::PutCardOnBottomOfPortalDeck(r6)
                    r1 = *(arg1 + 0x34)
                
                int32_t var_38_4 = 0
                var_28_2 = 0
                ascension::CWorld::OutputAnimationCard(r6, r1, 4, 0xb, 0, 8, 0, 0)

if (zx.d(*(arg1 + 0xb9)) == 0)
    *(arg1 + 0x34)
    ascension::CWorld::PopResolveEffect(r6)

CState::CleanupEmbeddedState()
return CState::ExitState(arg1) __tailcall
