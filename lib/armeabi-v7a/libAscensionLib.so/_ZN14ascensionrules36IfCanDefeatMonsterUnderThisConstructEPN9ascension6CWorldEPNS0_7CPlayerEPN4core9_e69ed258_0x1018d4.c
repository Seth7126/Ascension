// 函数: _ZN14ascensionrules36IfCanDefeatMonsterUnderThisConstructEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x1018d4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *(arg3 + 0x4c)
int32_t result = 0

if (r1 - *(arg3 + 0x48) == 4)
    int32_t r7_1 = *(r1 - 4)
    int32_t var_28_1 = 0
    int32_t r0_2 = ascension::CWorld::QueryCardPowerCost(arg1, arg2, r7_1, 7)
    int32_t r5_1 = *(arg1 + 0xb48)
    
    if (zx.d(*(arg1 + 0xb29)) != 0)
        r5_1 += *(arg1 + 0xb40)
    else if (zx.d(*(arg1 + 0xb2a)) != 0
            && ascension::CWorld::QueryCardFaction(arg1, arg2, r7_1) != 0)
        r5_1 += *(arg1 + 0xb40)
    
    result = 0
    
    if (r5_1 s>= r0_2)
        return 1

return result
