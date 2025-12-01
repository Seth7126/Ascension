// 函数: _ZN14ascensionrules23CStateAuctionForInsight15BuildBidOptionsER13CStateMachine
// 地址: 0x142524
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *(arg1 + 0x24c)
*(arg1 + 0x264)
ascension::CPlayer* r7 = *(r1 + 4)
ascension::CAuctionInsightState* r0_1 = ascension::CWorld::GetPlayerByTurnOrder(r7, r1)

if (*(r7 + 0x1c) != *(r7 + 0x18))
    int32_t i = 0
    
    do
        int32_t r0_6
        
        if ((*(arg1 + 0x260) & 1 << (i & 0xff)) == 0)
            *(arg1 + (i << 2) + 0x294) = 0xffffffff
            r0_6 = 0
        else
            r0_6 = *(ascension::CWorld::GetPlayerByTurnOrder(r7, *(arg1 + 0x24c)) + 0x8c)
        
        void* r1_3 = arg1 + (i << 2)
        i += 1
        *(r1_3 + 0x284) = r0_6
    while (i u< (*(r7 + 0x1c) - *(r7 + 0x18)) s>> 2)

ascension::CPlayer::SetAuctionInsightState(r0_1)
int32_t var_2c = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, *(arg1 + 0x258) + 1, 0xa0d3, "Bid Insight", 
    ascensionrules::CStateAuctionForInsight::SelectBid)
int32_t var_2c_1 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, *(*(arg1 + 0x250) + 8), 0xa0d4, "Pass", 
    ascensionrules::CStateAuctionForInsight::SelectPass)
jump(*(*arg1 + 0x34))
