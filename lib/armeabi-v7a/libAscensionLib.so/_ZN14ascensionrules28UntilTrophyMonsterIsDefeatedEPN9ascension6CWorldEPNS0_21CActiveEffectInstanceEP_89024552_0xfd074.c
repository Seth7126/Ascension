// 函数: _ZN14ascensionrules28UntilTrophyMonsterIsDefeatedEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfd074
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 0x1b || *(arg3 + 0x4c) != *(arg2 + 0x14))
    return 0

void* r1_2 = *(*(arg3 + 0x50) + 0xc)

if (*(r1_2 + 0x88) != 3)
    return 0

uint32_t result = zx.d(*(r1_2 + 0xc5))

if (result != 0)
    return 1

return result
