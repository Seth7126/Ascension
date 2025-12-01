// 函数: _ZN14ascensionrules27WhenYouAcquireLifeboundCardEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfdfc8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) == 0x12)
    core::CCardInstance* r1_1 = *(arg3 + 0x4c)
    
    if (*(arg2 + 0x14) == r1_1)
        int32_t r2 = *(arg3 + 0x50)
        
        if (r2 != 0)
            return ascension::CWorld::QueryCardFaction(arg1, r1_1, r2) __tailcall

return 0
