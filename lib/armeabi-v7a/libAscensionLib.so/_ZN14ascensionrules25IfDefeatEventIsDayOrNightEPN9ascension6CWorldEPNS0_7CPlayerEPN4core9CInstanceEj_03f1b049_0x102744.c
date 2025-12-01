// 函数: _ZN14ascensionrules25IfDefeatEventIsDayOrNightEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x102744
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t result = 0

if (arg6 != 0 && *(arg6 + 4) == 0x1b)
    if (zx.d(*(arg6 + 0x66)) != 0)
        return 1
    
    result = zx.d(*(arg6 + 0x67))
    
    if (result != 0)
        return 1

return result
