// 函数: _ZN14ascensionrules21PlayedHeroIsLifeboundEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x1058a8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) != 2)
    return 0

if (*(arg3 + 0x50) != *(arg2 + 0x14))
    return 0

if ((zx.d(*(arg3 + 0x54)) & 4) != 0)
    result = 1
    *(arg3 + 0x58) = 1

return result
