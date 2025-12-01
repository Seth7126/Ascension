// 函数: _ZN14ascensionrules23CStateAuctionForInsight10SelectPassER13CStateMachineP6CStateiPj
// 地址: 0x142788
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *(arg2 + 0x24c)
*(arg2 + 0x264)
ascension::CWorld::GetPlayerByTurnOrder(*(r1 + 4), r1)
ascension::CPlayer::ClearAuctionInsightState()
*(arg2 + (*(arg2 + 0x264) << 2) + 0x294) = 0xffffffff
int32_t r1_1 = *(arg2 + 0x264)
int32_t r0_3 = *(arg2 + 0x25c)
void* r2_1 = *(arg2 + 0x24c)
int32_t result = *(arg2 + 0x260) & not.d(1 << (r1_1 & 0xff))
*(arg2 + 0x25c) = r0_3 - 1
*(arg2 + 0x260) = result

if (r0_3 != 1)
    ascension::CPlayer* r5_1 = *(r2_1 + 4)
    
    while (true)
        int32_t r6_1 = r1_1 + 1
        *(arg2 + 0x264) = r6_1
        
        if (r6_1 s>= (*(r5_1 + 0x1c) - *(r5_1 + 0x18)) s>> 2)
            r6_1 = 0
        
        *(arg2 + 0x264) = r6_1
        
        if ((result & 1 << (r6_1 & 0xff)) != 0)
            if (r6_1 == *(arg2 + 0x254) && *(arg2 + 0x258) s>= 1)
                *(arg2 + 0x268) = 1
                return 1
            
            result = *(ascension::CWorld::GetPlayerByTurnOrder(r5_1, *(arg2 + 0x24c)) + 0x8c)
            
            if (result s> *(arg2 + 0x258))
                break
            
            int32_t r1_6 = *(arg2 + 0x25c)
            result = *(arg2 + 0x260) & not.d(1 << r6_1)
            *(arg2 + 0x25c) = r1_6 - 1
            *(arg2 + 0x260) = result
            
            if (r1_6 == 1)
                break
        
        r1_1 = *(arg2 + 0x264)

return result
