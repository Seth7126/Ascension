// 函数: _ZN14ascensionrules47MayAcquireThisCardToHandAtNoCostIfPasytheasWardEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x1043dc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 6)
    return 0

if (*(arg3 + 0x50) s>= 1)
    int32_t r7_1 = *(arg2 + 0x10)
    int32_t r6_1 = 0
    int32_t i = 0
    
    do
        if (*(*(arg3 + 0x54) + r6_1) == r7_1)
            char* r0_2 = *(arg3 + 0x4c)
            
            if (r0_2 != 0 && ascension::CPlayer::HasConstructInPlay(r0_2) != 0)
                void* r0_5 = *(arg3 + 0x54) + r6_1
                *(r0_5 + 0x14) = 0
                int32_t var_28_1 = 1
                ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::AddAcquireLocation(
                    r0_5.b, 1, 0, (*(arg2 + 8)).b)
        
        i += 1
        r6_1 += 0x44
    while (i s< *(arg3 + 0x50))

return 1
