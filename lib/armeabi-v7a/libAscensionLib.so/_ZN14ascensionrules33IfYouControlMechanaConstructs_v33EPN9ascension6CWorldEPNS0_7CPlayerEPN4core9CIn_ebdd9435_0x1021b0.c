// 函数: _ZN14ascensionrules33IfYouControlMechanaConstructs_v33EPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x1021b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CConstructInstance* r2 = nullptr

if (*(arg1 + 0x30) u< 0x21)
    r2 = 1

if (ascension::CPlayer::CountConstructsInPlay(arg2, true, r2) u>= arg4)
    return 1

return 0
