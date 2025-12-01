// 函数: _ZN14ascensionrules39IfEffectInstanceDataIsBanishFromDiscardEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x100fc8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

bool cond:0 = arg5 u> 0

if (arg5 != 0)
    cond:0 = *arg5 u> arg4

if (not(cond:0))
    return 0

if (zx.d(*(arg5 + arg4 + 4)) == 0)
    return 0

int32_t temp0_1 = 0
uint32_t i = zx.d(*(arg5 + (arg4 << 5) + 0x12)) - 0xa062

while (i != 0)
    i u>>= 1
    temp0_1 += 1

return (0x20 - temp0_1) u>> 5
