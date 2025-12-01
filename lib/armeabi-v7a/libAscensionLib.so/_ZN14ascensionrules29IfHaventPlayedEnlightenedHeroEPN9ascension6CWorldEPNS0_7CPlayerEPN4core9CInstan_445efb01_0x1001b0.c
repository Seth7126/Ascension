// 函数: _ZN14ascensionrules29IfHaventPlayedEnlightenedHeroEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x1001b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r3 = nullptr

if (arg3 != 0)
    r3 = __dynamic_cast(arg3, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)

if (ascension::CWorld::GetPlayedHeroCount(arg1, 1, r3) s< arg4)
    return 1

return 0
