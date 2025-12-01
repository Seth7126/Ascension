// 函数: _ZN14ascensionrules33IfYouControlTransformedConstructsEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x100cb0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

bool r1 = false

if (*(arg1 + 0x30) u< 0x21)
    r1 = true

if (ascension::CPlayer::CountConstructsInPlay(arg2, r1, 1) u>= arg4)
    return 1

return 0
