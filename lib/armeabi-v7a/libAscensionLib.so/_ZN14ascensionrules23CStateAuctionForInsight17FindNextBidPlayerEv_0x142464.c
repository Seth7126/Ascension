// 函数: _ZN14ascensionrules23CStateAuctionForInsight17FindNextBidPlayerEv
// 地址: 0x142464
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t i = *(entry_r0 + 0x25c)

if (i != 0)
    ascension::CPlayer* r5_1 = *(*(entry_r0 + 0x24c) + 4)
    int32_t r1_2 = *(entry_r0 + 0x260)
    
    do
        int32_t r6_1 = *(entry_r0 + 0x264) + 1
        *(entry_r0 + 0x264) = r6_1
        
        if (r6_1 s>= (*(r5_1 + 0x1c) - *(r5_1 + 0x18)) s>> 2)
            r6_1 = 0
        
        *(entry_r0 + 0x264) = r6_1
        
        if ((r1_2 & 1 << (r6_1 & 0xff)) != 0)
            if (r6_1 == *(entry_r0 + 0x254) && *(entry_r0 + 0x258) s>= 1)
                *(entry_r0 + 0x268) = 1
                return 1
            
            i = *(ascension::CWorld::GetPlayerByTurnOrder(r5_1, *(entry_r0 + 0x24c)) + 0x8c)
            
            if (i s> *(entry_r0 + 0x258))
                break
            
            r1_2 = *(entry_r0 + 0x260) & not.d(1 << r6_1)
            i = *(entry_r0 + 0x25c) - 1
            *(entry_r0 + 0x25c) = i
            *(entry_r0 + 0x260) = r1_2
    while (i != 0)

return i
