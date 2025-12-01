// 函数: _ZN14ascensionrules50WhenOwnerAcquiresOrDefeatsEnlightenedFromCenterRowEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfe4fc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3_10 = *(arg3 + 4)

if (r3_10 == 0x1b)
    int32_t r3_5 = *(arg3 + 0x54)
    
    if (r3_5 == 9 || r3_5 == 7)
        core::CCardInstance* r1_2 = *(arg3 + 0x4c)
        
        if (r1_2 == *(*(arg2 + 0x10) + 0xc))
            int32_t r2_2 = *(arg3 + 0x50)
            
            if (r2_2 != 0)
                return ascension::CWorld::QueryCardFaction(arg1, r1_2, r2_2) __tailcall
else if (r3_10 == 0x12)
    int32_t r3 = *(arg3 + 0x54)
    
    if (r3 == 9 || r3 == 7)
        core::CCardInstance* r1 = *(arg3 + 0x4c)
        
        if (r1 == *(*(arg2 + 0x10) + 0xc))
            int32_t r2 = *(arg3 + 0x50)
            
            if (r2 != 0)
                return ascension::CWorld::QueryCardFaction(arg1, r1, r2) __tailcall

return 0
