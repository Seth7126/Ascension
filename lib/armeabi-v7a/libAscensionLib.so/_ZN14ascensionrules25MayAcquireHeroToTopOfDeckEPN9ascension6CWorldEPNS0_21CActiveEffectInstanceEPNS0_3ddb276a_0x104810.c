// 函数: _ZN14ascensionrules25MayAcquireHeroToTopOfDeckEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x104810
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) == 6 && *(arg3 + 0x4c) == *(arg2 + 0x14))
    int32_t r0_2 = *(arg3 + 0x50)
    result = 1
    
    if (r0_2 s>= 1)
        int32_t r7_1 = 0
        int32_t r4_1 = 0
        
        do
            int32_t* r1_1 = *(arg3 + 0x54)
            
            if (*(*(*(r1_1 + r7_1) + 0xc) + 0x88) == 1)
                int32_t var_28_1 = 0
                ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::AddAcquireLocation(
                    r1_1.b + r7_1.b, 2, 0, (*(arg2 + 8)).b)
                r0_2 = *(arg3 + 0x50)
            
            r4_1 += 1
            r7_1 += 0x44
        while (r4_1 s< r0_2)

return result
