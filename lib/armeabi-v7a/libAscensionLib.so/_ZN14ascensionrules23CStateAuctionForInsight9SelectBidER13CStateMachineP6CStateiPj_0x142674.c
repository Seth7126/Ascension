// 函数: _ZN14ascensionrules23CStateAuctionForInsight9SelectBidER13CStateMachineP6CStateiPj
// 地址: 0x142674
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *(arg2 + 0x24c)
*(arg2 + 0x264)
void* r0_1 = ascension::CWorld::GetPlayerByTurnOrder(*(r1 + 4), r1)
uint32_t result = ascension::CPlayer::ClearAuctionInsightState()

if (arg4 != 0)
    result = *arg4

if (arg4 == 0)
    result = 0

*(arg2 + (*(arg2 + 0x264) << 2) + 0x294) = result
int32_t r1_3 = *(arg2 + 0x258)

if (result s< r1_3)
    result = r1_3 + 1

if (result s<= *(r0_1 + 0x8c))
    void* r1_4 = *(arg2 + 0x24c)
    int32_t r2_2 = *(arg2 + 0x264)
    bool cond:1_1 = *(arg2 + 0x25c) == 0
    *(arg2 + 0x254) = r2_2
    *(arg2 + 0x258) = result
    
    if (not(cond:1_1))
        ascension::CPlayer* r5_1 = *(r1_4 + 4)
        int32_t r1_5 = *(arg2 + 0x260)
        
        while (true)
            int32_t r6_1 = r2_2 + 1
            *(arg2 + 0x264) = r6_1
            
            if (r6_1 s>= (*(r5_1 + 0x1c) - *(r5_1 + 0x18)) s>> 2)
                r6_1 = 0
            
            *(arg2 + 0x264) = r6_1
            
            if ((r1_5 & 1 << (r6_1 & 0xff)) != 0)
                if (r6_1 == *(arg2 + 0x254) && result s>= 1)
                    *(arg2 + 0x268) = 1
                    return 1
                
                int32_t r1_8 =
                    *(ascension::CWorld::GetPlayerByTurnOrder(r5_1, *(arg2 + 0x24c)) + 0x8c)
                result = *(arg2 + 0x258)
                
                if (r1_8 s> result)
                    break
                
                int32_t r2_6 = *(arg2 + 0x25c)
                r1_5 = *(arg2 + 0x260) & not.d(1 << r6_1)
                *(arg2 + 0x25c) = r2_6 - 1
                *(arg2 + 0x260) = r1_5
                
                if (r2_6 == 1)
                    break
            
            r2_2 = *(arg2 + 0x264)

return result
