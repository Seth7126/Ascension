// 函数: _ZN14ascensionrules56IfYouControlMechanaConstructsAndHaveUnenergizedConstructEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x102220
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (ascension::CPlayer::CountConstructsInPlay(arg2, true, nullptr) u>= arg4)
    int32_t* r7_1 = *(arg2 + 0x54)
    int32_t r0_2 = *(arg2 + 0x58)
    
    if (r7_1 != r0_2)
        int32_t r4_1 = *(arg1 + 0xb4c)
        
        do
            int32_t r2_2 = *(*(*(*r7_1 + 0x10) + 0xc) + 0xac)
            
            if (r2_2 != 0 && r2_2 s> r4_1)
                if (ascension::CWorld::IsConstructEnergized(arg1) == 0)
                    return 1
                
                r0_2 = *(arg2 + 0x58)
            
            r7_1 = &r7_1[1]
        while (r7_1 != r0_2)

return 0
