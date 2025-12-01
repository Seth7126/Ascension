// 函数: _ZN14ascensionrules34CStateProcessAcquireTopOfDreamDeck10EnterStateER13CStateMachine
// 地址: 0x14c5e8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* r5 = *(*(arg1 + 0x24c) + 4)
void* r0_2 = ascension::CWorld::DrawCardFromDreamDeck()
*(arg1 + 0x250) = r0_2

if (r0_2 != 0)
    core::CWorldBase::OutputMessageFormat(r5, "%s reveals %s\n", *(arg1 + 0x24c) + 0x10, 
        *(r0_2 + 0xc) + 4)
    int32_t var_20_1 = 0
    ascension::CWorld::OutputAnimationCard(r5, *(arg1 + 0x250), 0xa, 8, 0, 0xc, 0, 0)
    ascension::CWorld::OutputPauseForAnimationConfirmation()
    uint32_t r1_2 = *(arg1 + 0x250)
    int32_t r0_8 = *(*(r1_2 + 0xc) + 0x88)
    
    if (r0_8 u<= 9 && (0x206 & 1 << (r0_8 & 0xff)) != 0)
        ascension::CWorld::PushRevealCard(r5, r1_2, 3)
    
    ascension::CWorld::OutputPauseForAnimationToDestination(r5)
    *(arg1 + 0x254) = 0

*(arg1 + 0x258) = 0
return 0
