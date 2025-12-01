// 函数: _ZN14ascensionrules23IfCurrentEventIsNotVoidEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x10152c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0_5 = *(arg1 + 0xa6c)

if (r0_5 == 0)
    return 1

return ascension::CCard::IsCardFaction(*(*(r0_5 + 0x10) + 0xc)) ^ 1
