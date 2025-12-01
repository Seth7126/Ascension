// 函数: _ZN14ascensionrules21AcquireThisCardToHandEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x10424c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 6)
    return 0

int32_t r1_1 = *(arg3 + 0x50)

if (r1_1 s>= 1)
    int32_t r6_1 = *(arg2 + 0x10)
    int32_t r7_1 = 0
    int32_t r5_1 = 0
    
    do
        int32_t* r0_2 = *(arg3 + 0x54) + r7_1
        
        if (*r0_2 == r6_1)
            int32_t var_28_1 = 1
            ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::AddAcquireLocation(
                r0_2.b, 1, 0, (*(arg2 + 8)).b)
            r1_1 = *(arg3 + 0x50)
        
        r5_1 += 1
        r7_1 += 0x44
    while (r5_1 s< r1_1)

return 1
