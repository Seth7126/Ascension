// 函数: _ZN14ascensionrules29MayAcquireThisCardToTopOfDeckEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x1042d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) == 6)
    int32_t r1 = *(arg3 + 0x50)
    result = 1
    
    if (r1 s>= 1)
        int32_t r7_1 = *(arg2 + 0x10)
        int32_t r4_1 = 0
        int32_t r6_1 = 0
        
        do
            int32_t* r0_2 = *(arg3 + 0x54) + r4_1
            
            if (*r0_2 == r7_1)
                int32_t var_28_1 = 0
                ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::AddAcquireLocation(
                    r0_2.b, 2, 0, (*(arg2 + 8)).b)
                r1 = *(arg3 + 0x50)
            
            r6_1 += 1
            r4_1 += 0x44
        while (r6_1 s< r1)

return result
