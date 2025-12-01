// 函数: _ZN14ascensionrules24WhenYouPlayLifeboundCardEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfd228
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *(arg3 + 4)

if (r1 == 0x18)
    core::CCardInstance* r1_3 = *(arg3 + 0x4c)
    
    if (*(arg2 + 0x14) == r1_3)
        void* r2_2 = *(arg3 + 0x50)
        
        if (*(*(r2_2 + 0xc) + 0x88) == 2)
            return ascension::CWorld::QueryCardFaction(arg1, r1_3, r2_2) __tailcall
else if (r1 == 0x14)
    core::CCardInstance* r1_1 = *(arg3 + 0x4c)
    
    if (*(arg2 + 0x14) == r1_1)
        void* r2 = *(arg3 + 0x50)
        
        if ((*(*(r2 + 0xc) + 0x88) | 8) == 9)
            return ascension::CWorld::QueryCardFaction(arg1, r1_1, r2) __tailcall

return 0
