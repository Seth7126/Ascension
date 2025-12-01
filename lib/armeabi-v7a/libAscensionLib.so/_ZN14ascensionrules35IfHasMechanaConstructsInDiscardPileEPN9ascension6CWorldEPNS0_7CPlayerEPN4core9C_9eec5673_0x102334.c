// 函数: _ZN14ascensionrules35IfHasMechanaConstructsInDiscardPileEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x102334
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg2 + 0x40)
int32_t r5 = 0
int32_t* i = *(r0 + 0xc)

if (i != *(r0 + 0x10))
    r5 = 0
    
    do
        void* r2 = *i
        void* r0_2 = *(r2 + 0xc)
        int32_t r1 = *(r0_2 + 0x88)
        int32_t r0_4
        
        if (r1 == 1)
            if (zx.d(*(arg2 + 0xa4)) != 0)
                r0_4 = ascension::CCard::IsCardFaction(r0_2)
            label_1023ac:
                
                if (r0_4 != 0)
                    r5 += 1
        else if (r1 == 2)
            r0_4 = ascension::CWorld::QueryCardFaction(arg1, arg2, r2)
            goto label_1023ac
        i = &i[1]
    while (i != *(*(arg2 + 0x40) + 0x10))

if (r5 u>= arg4)
    return 1

return 0
