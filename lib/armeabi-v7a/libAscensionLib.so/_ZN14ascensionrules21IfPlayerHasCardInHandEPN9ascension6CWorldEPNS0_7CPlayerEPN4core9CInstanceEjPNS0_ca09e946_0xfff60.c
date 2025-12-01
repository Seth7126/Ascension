// 函数: _ZN14ascensionrules21IfPlayerHasCardInHandEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0xfff60
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r1_3 = *(arg2 + 0x3c)
int32_t r0 = *(r1_3 + 0xc)
int32_t r1 = *(r1_3 + 0x10)

if (r1 == r0)
    return 0

int32_t i = 0

do
    if (*(*(*(r0 + (i << 2)) + 0xc) + 0x88) != 5)
        return 1
    
    i += 1
while (i u< (r1 - r0) s>> 2)

return 0
