// 函数: _ZN14ascensionrules45OwnerTreatsDreamConstructsAsMechanaConstructsEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x105760
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) != 2 || *(arg3 + 0x4c) != *(*(arg2 + 0x10) + 0xc))
    return 0

void* r1_3 = *(*(arg3 + 0x50) + 0xc)

if (*(r1_3 + 0x88) != 2)
    return 0

if (zx.d(*(r1_3 + 0xd1)) != 0 && (zx.d(*(arg3 + 0x54)) & 8) != 0)
    result = 1
    *(arg3 + 0x58) = 1

return result
