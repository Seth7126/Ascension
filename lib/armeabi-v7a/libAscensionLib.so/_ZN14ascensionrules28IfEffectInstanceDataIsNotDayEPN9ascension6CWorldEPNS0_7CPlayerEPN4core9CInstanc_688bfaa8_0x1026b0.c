// 函数: _ZN14ascensionrules28IfEffectInstanceDataIsNotDayEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x1026b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

bool cond:0 = arg5 u> 0

if (arg5 != 0)
    cond:0 = *arg5 u> arg4

if (not(cond:0))
    return 0

if (zx.d(*(arg5 + arg4 + 4)) != 0)
    return 1 & not.d(zx.d(*(arg5 + (arg4 << 5) + 0x10)))

return 0
