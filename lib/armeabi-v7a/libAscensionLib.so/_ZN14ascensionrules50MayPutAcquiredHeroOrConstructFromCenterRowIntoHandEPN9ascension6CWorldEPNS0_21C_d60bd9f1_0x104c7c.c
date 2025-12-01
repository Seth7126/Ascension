// 函数: _ZN14ascensionrules50MayPutAcquiredHeroOrConstructFromCenterRowIntoHandEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x104c7c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 6 || *(arg3 + 0x4c) != *(arg2 + 0x14))
    return 0

int32_t r1_2 = *(arg3 + 0x50)

if (r1_2 s>= 1)
    int32_t r7_1 = 0
    int32_t r6_1 = 0
    
    do
        int32_t* r2_1 = *(arg3 + 0x54)
        void* r0_1 = r2_1 + r7_1
        int32_t r3 = *(r0_1 + 4)
        
        if ((r3 == 9 || r3 == 7) && *(*(*(r2_1 + r7_1) + 0xc) + 0x88) - 1 u<= 1)
            int32_t var_28_1 = 0
            ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::AddAcquireLocation(
                r0_1.b, 1, 0, (*(arg2 + 8)).b)
            r1_2 = *(arg3 + 0x50)
        
        r6_1 += 1
        r7_1 += 0x44
    while (r6_1 s< r1_2)

return 1
