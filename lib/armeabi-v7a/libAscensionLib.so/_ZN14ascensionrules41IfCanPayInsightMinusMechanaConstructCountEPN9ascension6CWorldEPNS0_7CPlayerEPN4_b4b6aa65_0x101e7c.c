// 函数: _ZN14ascensionrules41IfCanPayInsightMinusMechanaConstructCountEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x101e7c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 != 0)
    __dynamic_cast(arg3, _typeinfo_for_core::CInstance, 
        _typeinfo_for_ascension::CConstructInstance, 0)

int32_t r0_3 = ascension::CPlayer::CountConstructsInPlay(arg2, true, nullptr)
int32_t r1_1 = *(arg2 + 0x8c)

if (*(arg1 + 0xb20) == arg2 && zx.d(*(arg1 + 0xb3d)) != 0)
    r1_1 += *(arg1 + 0xb48)
    
    if (zx.d(*(arg1 + 0xb29)) != 0)
        r1_1 += *(arg1 + 0xb40)

if (r1_1 + r0_3 u>= arg4)
    return 1

return 0
