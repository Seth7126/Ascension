// 函数: _ZN14ascensionrules26IfHasNotPlayedFlareTrackerEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x10097c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

for (int32_t* i = *(arg1 + 0xb80); i != *(arg1 + 0xb84); i = &i[2])
    if ((zx.d(i[1].b) & 1) == 0)
        void* r0_2 = *i
        
        if (r0_2 != 0)
            void* r7_1 = *(r0_2 + 0xc)
            
            if (*(r7_1 + 0x88) == 1 && ascension::CCard::IsCardFaction(r7_1) != 0
                    && strcasecmp(r7_1 + 4, "Flare Tracker") == 0)
                return 0

return 1
