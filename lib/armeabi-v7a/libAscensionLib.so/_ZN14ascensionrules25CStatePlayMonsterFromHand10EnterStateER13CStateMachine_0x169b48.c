// 函数: _ZN14ascensionrules25CStatePlayMonsterFromHand10EnterStateER13CStateMachine
// 地址: 0x169b48
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r5 = *(*(arg1 + 0x30) + 4)
ascension::CWorld::AddToPlayedCards(r5, *(arg1 + 0x34))
*(arg1 + 0x34)
ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 1)
ascension::CWorld::PushResolveEffect(r5, *(arg1 + 0x34))
void* r1_2 = *(arg1 + 0x30)
int32_t* r7 = *(r1_2 + 0x48)

if (r7 == *(r1_2 + 0x4c))
label_169bf0:
    uint32_t r1_5 = *(r1_2 + 0xa8)
    bool cond:1_1 = r1_5 s>= 1
    int32_t var_20_1 = 0
    
    if (r1_5 s< 1)
        r1_5 = 0x2f
    
    if (cond:1_1)
        r1_5 = 0x30
    
    ascension::CWorld::OutputEvent(r5, r1_5, zx.d(*(r1_2 + 8)), zx.d(*(*(arg1 + 0x34) + 8)))
else
    while (true)
        int32_t* r0_5 = *r7
        
        if (r0_5 != 0)
            if (strcasecmp((*(*r0_5 + 0xc))(), "Samael the Fallen") == 0)
                uint32_t r2_4 = *(arg1 + 0x34)
                core::CInstance* r6_1 = *(*(r2_4 + 0xc) + 0xa0)
                ascension::CWorld::OutputAnimationPower(r5, r6_1, r2_4)
                ascension::CWorld::AddCurrentTurnPower(r5)
                core::CWorldBase::OutputMessageFormat(r5, "%s gains %d power\n", 
                    *(arg1 + 0x30) + 0x10, r6_1)
                break
            
            r1_2 = *(arg1 + 0x30)
        
        r7 = &r7[1]
        
        if (r7 == *(r1_2 + 0x4c))
            goto label_169bf0

*(arg1 + 0x38) = 0
return 0
