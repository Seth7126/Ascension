// 函数: _ZN14ascensionrules27IfHasVoidCardsInDiscardPileEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x1023d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg2 + 0x40)
int32_t r5 = 0
int32_t* i = *(r0 + 0xc)

if (i != *(r0 + 0x10))
    r5 = 0
    
    do
        int32_t r2 = *i
        i = &i[1]
        r5 += ascension::CWorld::QueryCardFaction(arg1, arg2, r2)
    while (i != *(*(arg2 + 0x40) + 0x10))

if (r5 u>= arg4)
    return 1

return 0
