// 函数: _ZN14ascensionrules37OwnerTreatsAllConstructsAsAllFactionsEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x1057b8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) == 2)
    void* r1 = *(arg3 + 0x4c)
    
    if (r1 == *(*(arg2 + 0x10) + 0xc))
        void* r0_5 = *(*(arg3 + 0x50) + 0xc)
        int32_t r2 = *(r0_5 + 0x88)
        
        if (r2 == 2)
        label_105830:
            
            if (*(arg1 + 0x30) u< 0x14 || (zx.d(*(arg3 + 0x54)) & 0x1e) != 0)
                *(arg3 + 0x58) = 1
                return 1
        else if (r2 == 1 && zx.d(*(r1 + 0xa4)) != 0 && ascension::CCard::IsCardFaction(r0_5) != 0)
            goto label_105830

return 0
