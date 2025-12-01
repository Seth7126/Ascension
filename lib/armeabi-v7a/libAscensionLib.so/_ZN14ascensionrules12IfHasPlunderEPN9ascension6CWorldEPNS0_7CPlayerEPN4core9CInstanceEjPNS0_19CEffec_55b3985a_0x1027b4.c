// 函数: _ZN14ascensionrules12IfHasPlunderEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x1027b4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (zx.d(*(arg1 + 0xa14)) == 0 && ascension::CWorld::GetAcquiredCardCountFromCenterRow() s>= 1
        && ascension::CWorld::CountDefeatedMonsterListFromCenterRow(arg1) s>= 1)
    int32_t var_20_1 = 0
    ascension::CWorld::OutputEvent(arg1, 0x42, zx.d(*(arg2 + 8)), 0)

if (ascension::CWorld::GetAcquiredCardCountFromCenterRow() s>= 1
        && ascension::CWorld::CountDefeatedMonsterListFromCenterRow(arg1) s> 0)
    return 1

return 0
